import it.unimi.dsi.fastutil.Hash.Strategy;
import java.util.Comparator;
import javax.annotation.Nullable;

public record fct<T>(T d, ji e, long f, fcx g, long h) {
   public static final Comparator<fct<?>> a = ($$0, $$1) -> {
      int $$2 = Long.compare($$0.f, $$1.f);
      if ($$2 != 0) {
         return $$2;
      } else {
         $$2 = $$0.g.compareTo($$1.g);
         return $$2 != 0 ? $$2 : Long.compare($$0.h, $$1.h);
      }
   };
   public static final Comparator<fct<?>> b = ($$0, $$1) -> {
      int $$2 = $$0.g.compareTo($$1.g);
      return $$2 != 0 ? $$2 : Long.compare($$0.h, $$1.h);
   };
   public static final Strategy<fct<?>> c = new Strategy<fct<?>>() {
      public int a(fct<?> $$0) {
         return 31 * $$0.b().hashCode() + $$0.a().hashCode();
      }

      public boolean a(@Nullable fct<?> $$0, @Nullable fct<?> $$1) {
         if ($$0 == $$1) {
            return true;
         } else {
            return $$0 != null && $$1 != null ? $$0.a() == $$1.a() && $$0.b().equals($$1.b()) : false;
         }
      }
   };

   public fct(T $$0, ji $$1, long $$2, long $$3) {
      this($$0, $$1, $$2, fcx.d, $$3);
   }

   public fct(T d, ji e, long f, fcx g, long h) {
      e = e.j();
      this.d = d;
      this.e = e;
      this.f = f;
      this.g = g;
      this.h = h;
   }

   public static <T> fct<T> a(T $$0, ji $$1) {
      return new fct<>($$0, $$1, 0L, fcx.d, 0L);
   }

   public fcs<T> a(long $$0) {
      return new fcs<>(this.d, this.e, (int)(this.f - $$0), this.g);
   }

   public T a() {
      return this.d;
   }

   public ji b() {
      return this.e;
   }

   public long c() {
      return this.f;
   }

   public fcx d() {
      return this.g;
   }

   public long e() {
      return this.h;
   }
}
