import it.unimi.dsi.fastutil.Hash.Strategy;
import java.util.Comparator;
import javax.annotation.Nullable;

public record epq<T>(T d, hz e, long f, epu g, long h) {
   public static final Comparator<epq<?>> a = ($$0, $$1) -> {
      int $$2 = Long.compare($$0.f, $$1.f);
      if ($$2 != 0) {
         return $$2;
      } else {
         $$2 = $$0.g.compareTo($$1.g);
         return $$2 != 0 ? $$2 : Long.compare($$0.h, $$1.h);
      }
   };
   public static final Comparator<epq<?>> b = ($$0, $$1) -> {
      int $$2 = $$0.g.compareTo($$1.g);
      return $$2 != 0 ? $$2 : Long.compare($$0.h, $$1.h);
   };
   public static final Strategy<epq<?>> c = new Strategy<epq<?>>() {
      public int a(epq<?> $$0) {
         return 31 * $$0.b().hashCode() + $$0.a().hashCode();
      }

      public boolean a(@Nullable epq<?> $$0, @Nullable epq<?> $$1) {
         if ($$0 == $$1) {
            return true;
         } else {
            return $$0 != null && $$1 != null ? $$0.a() == $$1.a() && $$0.b().equals($$1.b()) : false;
         }
      }
   };

   public epq(T $$0, hz $$1, long $$2, long $$3) {
      this($$0, $$1, $$2, epu.d, $$3);
   }

   public epq(T d, hz e, long f, epu g, long h) {
      e = e.i();
      this.d = d;
      this.e = e;
      this.f = f;
      this.g = g;
      this.h = h;
   }

   public static <T> epq<T> a(T $$0, hz $$1) {
      return new epq<>($$0, $$1, 0L, epu.d, 0L);
   }

   public T a() {
      return this.d;
   }

   public hz b() {
      return this.e;
   }

   public long c() {
      return this.f;
   }

   public epu d() {
      return this.g;
   }

   public long e() {
      return this.h;
   }
}
