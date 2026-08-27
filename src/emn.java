import it.unimi.dsi.fastutil.Hash.Strategy;
import java.util.Comparator;
import javax.annotation.Nullable;

public record emn<T>(T d, hv e, long f, emr g, long h) {
   public static final Comparator<emn<?>> a = ($$0, $$1) -> {
      int $$2 = Long.compare($$0.f, $$1.f);
      if ($$2 != 0) {
         return $$2;
      } else {
         $$2 = $$0.g.compareTo($$1.g);
         return $$2 != 0 ? $$2 : Long.compare($$0.h, $$1.h);
      }
   };
   public static final Comparator<emn<?>> b = ($$0, $$1) -> {
      int $$2 = $$0.g.compareTo($$1.g);
      return $$2 != 0 ? $$2 : Long.compare($$0.h, $$1.h);
   };
   public static final Strategy<emn<?>> c = new Strategy<emn<?>>() {
      public int a(emn<?> $$0) {
         return 31 * $$0.b().hashCode() + $$0.a().hashCode();
      }

      public boolean a(@Nullable emn<?> $$0, @Nullable emn<?> $$1) {
         if ($$0 == $$1) {
            return true;
         } else {
            return $$0 != null && $$1 != null ? $$0.a() == $$1.a() && $$0.b().equals($$1.b()) : false;
         }
      }
   };

   public emn(T $$0, hv $$1, long $$2, long $$3) {
      this($$0, $$1, $$2, emr.d, $$3);
   }

   public emn(T d, hv e, long f, emr g, long h) {
      e = e.i();
      this.d = d;
      this.e = e;
      this.f = f;
      this.g = g;
      this.h = h;
   }

   public static <T> emn<T> a(T $$0, hv $$1) {
      return new emn<>($$0, $$1, 0L, emr.d, 0L);
   }

   public T a() {
      return this.d;
   }

   public hv b() {
      return this.e;
   }

   public long c() {
      return this.f;
   }

   public emr d() {
      return this.g;
   }

   public long e() {
      return this.h;
   }
}
