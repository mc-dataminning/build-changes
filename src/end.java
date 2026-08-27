import it.unimi.dsi.fastutil.Hash.Strategy;
import java.util.Comparator;
import javax.annotation.Nullable;

public record end<T>(T d, hx e, long f, enh g, long h) {
   public static final Comparator<end<?>> a = ($$0, $$1) -> {
      int $$2 = Long.compare($$0.f, $$1.f);
      if ($$2 != 0) {
         return $$2;
      } else {
         $$2 = $$0.g.compareTo($$1.g);
         return $$2 != 0 ? $$2 : Long.compare($$0.h, $$1.h);
      }
   };
   public static final Comparator<end<?>> b = ($$0, $$1) -> {
      int $$2 = $$0.g.compareTo($$1.g);
      return $$2 != 0 ? $$2 : Long.compare($$0.h, $$1.h);
   };
   public static final Strategy<end<?>> c = new Strategy<end<?>>() {
      public int a(end<?> $$0) {
         return 31 * $$0.b().hashCode() + $$0.a().hashCode();
      }

      public boolean a(@Nullable end<?> $$0, @Nullable end<?> $$1) {
         if ($$0 == $$1) {
            return true;
         } else {
            return $$0 != null && $$1 != null ? $$0.a() == $$1.a() && $$0.b().equals($$1.b()) : false;
         }
      }
   };

   public end(T $$0, hx $$1, long $$2, long $$3) {
      this($$0, $$1, $$2, enh.d, $$3);
   }

   public end(T d, hx e, long f, enh g, long h) {
      e = e.i();
      this.d = d;
      this.e = e;
      this.f = f;
      this.g = g;
      this.h = h;
   }

   public static <T> end<T> a(T $$0, hx $$1) {
      return new end<>($$0, $$1, 0L, enh.d, 0L);
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

   public enh d() {
      return this.g;
   }

   public long e() {
      return this.h;
   }
}
