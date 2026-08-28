import it.unimi.dsi.fastutil.Hash.Strategy;
import java.util.Comparator;
import javax.annotation.Nullable;

public record fhi<T>(T d, iv e, long f, fhm g, long h) {
   public static final Comparator<fhi<?>> a = ($$0, $$1) -> {
      int $$2 = Long.compare($$0.f, $$1.f);
      if ($$2 != 0) {
         return $$2;
      } else {
         $$2 = $$0.g.compareTo($$1.g);
         return $$2 != 0 ? $$2 : Long.compare($$0.h, $$1.h);
      }
   };
   public static final Comparator<fhi<?>> b = ($$0, $$1) -> {
      int $$2 = $$0.g.compareTo($$1.g);
      return $$2 != 0 ? $$2 : Long.compare($$0.h, $$1.h);
   };
   public static final Strategy<fhi<?>> c = new Strategy<fhi<?>>() {
      public int a(fhi<?> $$0) {
         return 31 * $$0.b().hashCode() + $$0.a().hashCode();
      }

      public boolean a(@Nullable fhi<?> $$0, @Nullable fhi<?> $$1) {
         if ($$0 == $$1) {
            return true;
         } else {
            return $$0 != null && $$1 != null ? $$0.a() == $$1.a() && $$0.b().equals($$1.b()) : false;
         }
      }
   };

   public fhi(T $$0, iv $$1, long $$2, long $$3) {
      this($$0, $$1, $$2, fhm.d, $$3);
   }

   public fhi(T d, iv e, long f, fhm g, long h) {
      e = e.j();
      this.d = d;
      this.e = e;
      this.f = f;
      this.g = g;
      this.h = h;
   }

   public static <T> fhi<T> a(T $$0, iv $$1) {
      return new fhi<>($$0, $$1, 0L, fhm.d, 0L);
   }

   public fhh<T> a(long $$0) {
      return new fhh<>(this.d, this.e, (int)(this.f - $$0), this.g);
   }

   public T a() {
      return this.d;
   }

   public iv b() {
      return this.e;
   }

   public long c() {
      return this.f;
   }

   public fhm d() {
      return this.g;
   }

   public long e() {
      return this.h;
   }
}
