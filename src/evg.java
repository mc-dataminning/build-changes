import it.unimi.dsi.fastutil.Hash.Strategy;
import java.util.Comparator;
import javax.annotation.Nullable;

public record evg<T>(T d, in e, long f, evk g, long h) {
   public static final Comparator<evg<?>> a = ($$0, $$1) -> {
      int $$2 = Long.compare($$0.f, $$1.f);
      if ($$2 != 0) {
         return $$2;
      } else {
         $$2 = $$0.g.compareTo($$1.g);
         return $$2 != 0 ? $$2 : Long.compare($$0.h, $$1.h);
      }
   };
   public static final Comparator<evg<?>> b = ($$0, $$1) -> {
      int $$2 = $$0.g.compareTo($$1.g);
      return $$2 != 0 ? $$2 : Long.compare($$0.h, $$1.h);
   };
   public static final Strategy<evg<?>> c = new Strategy<evg<?>>() {
      public int a(evg<?> $$0) {
         return 31 * $$0.b().hashCode() + $$0.a().hashCode();
      }

      public boolean a(@Nullable evg<?> $$0, @Nullable evg<?> $$1) {
         if ($$0 == $$1) {
            return true;
         } else {
            return $$0 != null && $$1 != null ? $$0.a() == $$1.a() && $$0.b().equals($$1.b()) : false;
         }
      }
   };

   public evg(T $$0, in $$1, long $$2, long $$3) {
      this($$0, $$1, $$2, evk.d, $$3);
   }

   public evg(T d, in e, long f, evk g, long h) {
      e = e.i();
      this.d = d;
      this.e = e;
      this.f = f;
      this.g = g;
      this.h = h;
   }

   public static <T> evg<T> a(T $$0, in $$1) {
      return new evg<>($$0, $$1, 0L, evk.d, 0L);
   }

   public T a() {
      return this.d;
   }

   public in b() {
      return this.e;
   }

   public long c() {
      return this.f;
   }

   public evk d() {
      return this.g;
   }

   public long e() {
      return this.h;
   }
}
