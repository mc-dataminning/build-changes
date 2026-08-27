import it.unimi.dsi.fastutil.Hash.Strategy;
import java.util.Comparator;
import javax.annotation.Nullable;

public record epj<T>(T d, hz e, long f, epn g, long h) {
   public static final Comparator<epj<?>> a = ($$0, $$1) -> {
      int $$2 = Long.compare($$0.f, $$1.f);
      if ($$2 != 0) {
         return $$2;
      } else {
         $$2 = $$0.g.compareTo($$1.g);
         return $$2 != 0 ? $$2 : Long.compare($$0.h, $$1.h);
      }
   };
   public static final Comparator<epj<?>> b = ($$0, $$1) -> {
      int $$2 = $$0.g.compareTo($$1.g);
      return $$2 != 0 ? $$2 : Long.compare($$0.h, $$1.h);
   };
   public static final Strategy<epj<?>> c = new Strategy<epj<?>>() {
      public int a(epj<?> $$0) {
         return 31 * $$0.b().hashCode() + $$0.a().hashCode();
      }

      public boolean a(@Nullable epj<?> $$0, @Nullable epj<?> $$1) {
         if ($$0 == $$1) {
            return true;
         } else {
            return $$0 != null && $$1 != null ? $$0.a() == $$1.a() && $$0.b().equals($$1.b()) : false;
         }
      }
   };

   public epj(T $$0, hz $$1, long $$2, long $$3) {
      this($$0, $$1, $$2, epn.d, $$3);
   }

   public epj(T d, hz e, long f, epn g, long h) {
      e = e.i();
      this.d = d;
      this.e = e;
      this.f = f;
      this.g = g;
      this.h = h;
   }

   public static <T> epj<T> a(T $$0, hz $$1) {
      return new epj<>($$0, $$1, 0L, epn.d, 0L);
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

   public epn d() {
      return this.g;
   }

   public long e() {
      return this.h;
   }
}
