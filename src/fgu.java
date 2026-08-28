import it.unimi.dsi.fastutil.Hash.Strategy;
import java.util.Comparator;
import javax.annotation.Nullable;

public record fgu<T>(T d, iv e, long f, fgy g, long h) {
   public static final Comparator<fgu<?>> a = ($$0, $$1) -> {
      int $$2 = Long.compare($$0.f, $$1.f);
      if ($$2 != 0) {
         return $$2;
      } else {
         $$2 = $$0.g.compareTo($$1.g);
         return $$2 != 0 ? $$2 : Long.compare($$0.h, $$1.h);
      }
   };
   public static final Comparator<fgu<?>> b = ($$0, $$1) -> {
      int $$2 = $$0.g.compareTo($$1.g);
      return $$2 != 0 ? $$2 : Long.compare($$0.h, $$1.h);
   };
   public static final Strategy<fgu<?>> c = new Strategy<fgu<?>>() {
      public int a(fgu<?> $$0) {
         return 31 * $$0.b().hashCode() + $$0.a().hashCode();
      }

      public boolean a(@Nullable fgu<?> $$0, @Nullable fgu<?> $$1) {
         if ($$0 == $$1) {
            return true;
         } else {
            return $$0 != null && $$1 != null ? $$0.a() == $$1.a() && $$0.b().equals($$1.b()) : false;
         }
      }
   };

   public fgu(T $$0, iv $$1, long $$2, long $$3) {
      this($$0, $$1, $$2, fgy.d, $$3);
   }

   public fgu(T d, iv e, long f, fgy g, long h) {
      e = e.j();
      this.d = d;
      this.e = e;
      this.f = f;
      this.g = g;
      this.h = h;
   }

   public static <T> fgu<T> a(T $$0, iv $$1) {
      return new fgu<>($$0, $$1, 0L, fgy.d, 0L);
   }

   public fgt<T> a(long $$0) {
      return new fgt<>(this.d, this.e, (int)(this.f - $$0), this.g);
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

   public fgy d() {
      return this.g;
   }

   public long e() {
      return this.h;
   }
}
