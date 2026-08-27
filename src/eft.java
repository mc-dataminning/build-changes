import it.unimi.dsi.fastutil.Hash.Strategy;
import java.util.Comparator;
import javax.annotation.Nullable;

public record eft<T>(T d, gu e, long f, efx g, long h) {
   public static final Comparator<eft<?>> a = ($$0, $$1) -> {
      int $$2 = Long.compare($$0.f, $$1.f);
      if ($$2 != 0) {
         return $$2;
      } else {
         $$2 = $$0.g.compareTo($$1.g);
         return $$2 != 0 ? $$2 : Long.compare($$0.h, $$1.h);
      }
   };
   public static final Comparator<eft<?>> b = ($$0, $$1) -> {
      int $$2 = $$0.g.compareTo($$1.g);
      return $$2 != 0 ? $$2 : Long.compare($$0.h, $$1.h);
   };
   public static final Strategy<eft<?>> c = new Strategy<eft<?>>() {
      public int a(eft<?> $$0) {
         return 31 * $$0.b().hashCode() + $$0.a().hashCode();
      }

      public boolean a(@Nullable eft<?> $$0, @Nullable eft<?> $$1) {
         if ($$0 == $$1) {
            return true;
         } else {
            return $$0 != null && $$1 != null ? $$0.a() == $$1.a() && $$0.b().equals($$1.b()) : false;
         }
      }
   };

   public eft(T $$0, gu $$1, long $$2, long $$3) {
      this($$0, $$1, $$2, efx.d, $$3);
   }

   public eft(T d, gu e, long f, efx g, long h) {
      e = e.i();
      this.d = d;
      this.e = e;
      this.f = f;
      this.g = g;
      this.h = h;
   }

   public static <T> eft<T> a(T $$0, gu $$1) {
      return new eft<>($$0, $$1, 0L, efx.d, 0L);
   }

   public T a() {
      return this.d;
   }

   public gu b() {
      return this.e;
   }

   public long c() {
      return this.f;
   }

   public efx d() {
      return this.g;
   }

   public long e() {
      return this.h;
   }
}
