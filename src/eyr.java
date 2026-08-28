import it.unimi.dsi.fastutil.Hash.Strategy;
import java.util.Comparator;
import javax.annotation.Nullable;

public record eyr<T>(T d, jd e, long f, eyv g, long h) {
   public static final Comparator<eyr<?>> a = ($$0, $$1) -> {
      int $$2 = Long.compare($$0.f, $$1.f);
      if ($$2 != 0) {
         return $$2;
      } else {
         $$2 = $$0.g.compareTo($$1.g);
         return $$2 != 0 ? $$2 : Long.compare($$0.h, $$1.h);
      }
   };
   public static final Comparator<eyr<?>> b = ($$0, $$1) -> {
      int $$2 = $$0.g.compareTo($$1.g);
      return $$2 != 0 ? $$2 : Long.compare($$0.h, $$1.h);
   };
   public static final Strategy<eyr<?>> c = new Strategy<eyr<?>>() {
      public int a(eyr<?> $$0) {
         return 31 * $$0.b().hashCode() + $$0.a().hashCode();
      }

      public boolean a(@Nullable eyr<?> $$0, @Nullable eyr<?> $$1) {
         if ($$0 == $$1) {
            return true;
         } else {
            return $$0 != null && $$1 != null ? $$0.a() == $$1.a() && $$0.b().equals($$1.b()) : false;
         }
      }
   };

   public eyr(T $$0, jd $$1, long $$2, long $$3) {
      this($$0, $$1, $$2, eyv.d, $$3);
   }

   public eyr(T d, jd e, long f, eyv g, long h) {
      e = e.j();
      this.d = d;
      this.e = e;
      this.f = f;
      this.g = g;
      this.h = h;
   }

   public static <T> eyr<T> a(T $$0, jd $$1) {
      return new eyr<>($$0, $$1, 0L, eyv.d, 0L);
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

   public eyv d() {
      return this.g;
   }

   public long e() {
      return this.h;
   }
}
