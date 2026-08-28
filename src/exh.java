import it.unimi.dsi.fastutil.Hash.Strategy;
import java.util.Comparator;
import javax.annotation.Nullable;

public record exh<T>(T d, iz e, long f, exl g, long h) {
   public static final Comparator<exh<?>> a = ($$0, $$1) -> {
      int $$2 = Long.compare($$0.f, $$1.f);
      if ($$2 != 0) {
         return $$2;
      } else {
         $$2 = $$0.g.compareTo($$1.g);
         return $$2 != 0 ? $$2 : Long.compare($$0.h, $$1.h);
      }
   };
   public static final Comparator<exh<?>> b = ($$0, $$1) -> {
      int $$2 = $$0.g.compareTo($$1.g);
      return $$2 != 0 ? $$2 : Long.compare($$0.h, $$1.h);
   };
   public static final Strategy<exh<?>> c = new Strategy<exh<?>>() {
      public int a(exh<?> $$0) {
         return 31 * $$0.b().hashCode() + $$0.a().hashCode();
      }

      public boolean a(@Nullable exh<?> $$0, @Nullable exh<?> $$1) {
         if ($$0 == $$1) {
            return true;
         } else {
            return $$0 != null && $$1 != null ? $$0.a() == $$1.a() && $$0.b().equals($$1.b()) : false;
         }
      }
   };

   public exh(T $$0, iz $$1, long $$2, long $$3) {
      this($$0, $$1, $$2, exl.d, $$3);
   }

   public exh(T d, iz e, long f, exl g, long h) {
      e = e.i();
      this.d = d;
      this.e = e;
      this.f = f;
      this.g = g;
      this.h = h;
   }

   public static <T> exh<T> a(T $$0, iz $$1) {
      return new exh<>($$0, $$1, 0L, exl.d, 0L);
   }

   public T a() {
      return this.d;
   }

   public iz b() {
      return this.e;
   }

   public long c() {
      return this.f;
   }

   public exl d() {
      return this.g;
   }

   public long e() {
      return this.h;
   }
}
