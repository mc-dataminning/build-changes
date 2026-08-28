import it.unimi.dsi.fastutil.Hash.Strategy;
import java.util.Comparator;
import javax.annotation.Nullable;

public record fem<T>(T d, jj e, long f, feq g, long h) {
   public static final Comparator<fem<?>> a = ($$0, $$1) -> {
      int $$2 = Long.compare($$0.f, $$1.f);
      if ($$2 != 0) {
         return $$2;
      } else {
         $$2 = $$0.g.compareTo($$1.g);
         return $$2 != 0 ? $$2 : Long.compare($$0.h, $$1.h);
      }
   };
   public static final Comparator<fem<?>> b = ($$0, $$1) -> {
      int $$2 = $$0.g.compareTo($$1.g);
      return $$2 != 0 ? $$2 : Long.compare($$0.h, $$1.h);
   };
   public static final Strategy<fem<?>> c = new Strategy<fem<?>>() {
      public int a(fem<?> $$0) {
         return 31 * $$0.b().hashCode() + $$0.a().hashCode();
      }

      public boolean a(@Nullable fem<?> $$0, @Nullable fem<?> $$1) {
         if ($$0 == $$1) {
            return true;
         } else {
            return $$0 != null && $$1 != null ? $$0.a() == $$1.a() && $$0.b().equals($$1.b()) : false;
         }
      }
   };

   public fem(T $$0, jj $$1, long $$2, long $$3) {
      this($$0, $$1, $$2, feq.d, $$3);
   }

   public fem(T d, jj e, long f, feq g, long h) {
      e = e.j();
      this.d = d;
      this.e = e;
      this.f = f;
      this.g = g;
      this.h = h;
   }

   public static <T> fem<T> a(T $$0, jj $$1) {
      return new fem<>($$0, $$1, 0L, feq.d, 0L);
   }

   public fel<T> a(long $$0) {
      return new fel<>(this.d, this.e, (int)(this.f - $$0), this.g);
   }

   public T a() {
      return this.d;
   }

   public jj b() {
      return this.e;
   }

   public long c() {
      return this.f;
   }

   public feq d() {
      return this.g;
   }

   public long e() {
      return this.h;
   }
}
