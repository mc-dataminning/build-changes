import it.unimi.dsi.fastutil.Hash.Strategy;
import java.util.Comparator;
import javax.annotation.Nullable;

public record eyt<T>(T d, jd e, long f, eyx g, long h) {
   public static final Comparator<eyt<?>> a = ($$0, $$1) -> {
      int $$2 = Long.compare($$0.f, $$1.f);
      if ($$2 != 0) {
         return $$2;
      } else {
         $$2 = $$0.g.compareTo($$1.g);
         return $$2 != 0 ? $$2 : Long.compare($$0.h, $$1.h);
      }
   };
   public static final Comparator<eyt<?>> b = ($$0, $$1) -> {
      int $$2 = $$0.g.compareTo($$1.g);
      return $$2 != 0 ? $$2 : Long.compare($$0.h, $$1.h);
   };
   public static final Strategy<eyt<?>> c = new Strategy<eyt<?>>() {
      public int a(eyt<?> $$0) {
         return 31 * $$0.b().hashCode() + $$0.a().hashCode();
      }

      public boolean a(@Nullable eyt<?> $$0, @Nullable eyt<?> $$1) {
         if ($$0 == $$1) {
            return true;
         } else {
            return $$0 != null && $$1 != null ? $$0.a() == $$1.a() && $$0.b().equals($$1.b()) : false;
         }
      }
   };

   public eyt(T $$0, jd $$1, long $$2, long $$3) {
      this($$0, $$1, $$2, eyx.d, $$3);
   }

   public eyt(T d, jd e, long f, eyx g, long h) {
      e = e.j();
      this.d = d;
      this.e = e;
      this.f = f;
      this.g = g;
      this.h = h;
   }

   public static <T> eyt<T> a(T $$0, jd $$1) {
      return new eyt<>($$0, $$1, 0L, eyx.d, 0L);
   }

   public T a() {
      return this.d;
   }

   public jd b() {
      return this.e;
   }

   public long c() {
      return this.f;
   }

   public eyx d() {
      return this.g;
   }

   public long e() {
      return this.h;
   }
}
