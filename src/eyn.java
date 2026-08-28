import it.unimi.dsi.fastutil.Hash.Strategy;
import java.util.Comparator;
import javax.annotation.Nullable;

public record eyn<T>(T d, jd e, long f, eyr g, long h) {
   public static final Comparator<eyn<?>> a = ($$0, $$1) -> {
      int $$2 = Long.compare($$0.f, $$1.f);
      if ($$2 != 0) {
         return $$2;
      } else {
         $$2 = $$0.g.compareTo($$1.g);
         return $$2 != 0 ? $$2 : Long.compare($$0.h, $$1.h);
      }
   };
   public static final Comparator<eyn<?>> b = ($$0, $$1) -> {
      int $$2 = $$0.g.compareTo($$1.g);
      return $$2 != 0 ? $$2 : Long.compare($$0.h, $$1.h);
   };
   public static final Strategy<eyn<?>> c = new Strategy<eyn<?>>() {
      public int a(eyn<?> $$0) {
         return 31 * $$0.b().hashCode() + $$0.a().hashCode();
      }

      public boolean a(@Nullable eyn<?> $$0, @Nullable eyn<?> $$1) {
         if ($$0 == $$1) {
            return true;
         } else {
            return $$0 != null && $$1 != null ? $$0.a() == $$1.a() && $$0.b().equals($$1.b()) : false;
         }
      }
   };

   public eyn(T $$0, jd $$1, long $$2, long $$3) {
      this($$0, $$1, $$2, eyr.d, $$3);
   }

   public eyn(T d, jd e, long f, eyr g, long h) {
      e = e.i();
      this.d = d;
      this.e = e;
      this.f = f;
      this.g = g;
      this.h = h;
   }

   public static <T> eyn<T> a(T $$0, jd $$1) {
      return new eyn<>($$0, $$1, 0L, eyr.d, 0L);
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

   public eyr d() {
      return this.g;
   }

   public long e() {
      return this.h;
   }
}
