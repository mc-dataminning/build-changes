import it.unimi.dsi.fastutil.Hash.Strategy;
import java.util.Comparator;
import javax.annotation.Nullable;

public record eri<T>(T d, ib e, long f, erm g, long h) {
   public static final Comparator<eri<?>> a = ($$0, $$1) -> {
      int $$2 = Long.compare($$0.f, $$1.f);
      if ($$2 != 0) {
         return $$2;
      } else {
         $$2 = $$0.g.compareTo($$1.g);
         return $$2 != 0 ? $$2 : Long.compare($$0.h, $$1.h);
      }
   };
   public static final Comparator<eri<?>> b = ($$0, $$1) -> {
      int $$2 = $$0.g.compareTo($$1.g);
      return $$2 != 0 ? $$2 : Long.compare($$0.h, $$1.h);
   };
   public static final Strategy<eri<?>> c = new Strategy<eri<?>>() {
      public int a(eri<?> $$0) {
         return 31 * $$0.b().hashCode() + $$0.a().hashCode();
      }

      public boolean a(@Nullable eri<?> $$0, @Nullable eri<?> $$1) {
         if ($$0 == $$1) {
            return true;
         } else {
            return $$0 != null && $$1 != null ? $$0.a() == $$1.a() && $$0.b().equals($$1.b()) : false;
         }
      }
   };

   public eri(T $$0, ib $$1, long $$2, long $$3) {
      this($$0, $$1, $$2, erm.d, $$3);
   }

   public eri(T d, ib e, long f, erm g, long h) {
      e = e.i();
      this.d = d;
      this.e = e;
      this.f = f;
      this.g = g;
      this.h = h;
   }

   public static <T> eri<T> a(T $$0, ib $$1) {
      return new eri<>($$0, $$1, 0L, erm.d, 0L);
   }

   public T a() {
      return this.d;
   }

   public ib b() {
      return this.e;
   }

   public long c() {
      return this.f;
   }

   public erm d() {
      return this.g;
   }

   public long e() {
      return this.h;
   }
}
