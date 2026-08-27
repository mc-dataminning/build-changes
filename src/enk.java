import it.unimi.dsi.fastutil.Hash.Strategy;
import java.util.Comparator;
import javax.annotation.Nullable;

public record enk<T>(T d, hx e, long f, eno g, long h) {
   public static final Comparator<enk<?>> a = ($$0, $$1) -> {
      int $$2 = Long.compare($$0.f, $$1.f);
      if ($$2 != 0) {
         return $$2;
      } else {
         $$2 = $$0.g.compareTo($$1.g);
         return $$2 != 0 ? $$2 : Long.compare($$0.h, $$1.h);
      }
   };
   public static final Comparator<enk<?>> b = ($$0, $$1) -> {
      int $$2 = $$0.g.compareTo($$1.g);
      return $$2 != 0 ? $$2 : Long.compare($$0.h, $$1.h);
   };
   public static final Strategy<enk<?>> c = new Strategy<enk<?>>() {
      public int a(enk<?> $$0) {
         return 31 * $$0.b().hashCode() + $$0.a().hashCode();
      }

      public boolean a(@Nullable enk<?> $$0, @Nullable enk<?> $$1) {
         if ($$0 == $$1) {
            return true;
         } else {
            return $$0 != null && $$1 != null ? $$0.a() == $$1.a() && $$0.b().equals($$1.b()) : false;
         }
      }
   };

   public enk(T $$0, hx $$1, long $$2, long $$3) {
      this($$0, $$1, $$2, eno.d, $$3);
   }

   public enk(T d, hx e, long f, eno g, long h) {
      e = e.i();
      this.d = d;
      this.e = e;
      this.f = f;
      this.g = g;
      this.h = h;
   }

   public static <T> enk<T> a(T $$0, hx $$1) {
      return new enk<>($$0, $$1, 0L, eno.d, 0L);
   }

   public T a() {
      return this.d;
   }

   public hx b() {
      return this.e;
   }

   public long c() {
      return this.f;
   }

   public eno d() {
      return this.g;
   }

   public long e() {
      return this.h;
   }
}
