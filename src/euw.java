import it.unimi.dsi.fastutil.Hash.Strategy;
import java.util.Comparator;
import javax.annotation.Nullable;

public record euw<T>(T d, im e, long f, eva g, long h) {
   public static final Comparator<euw<?>> a = ($$0, $$1) -> {
      int $$2 = Long.compare($$0.f, $$1.f);
      if ($$2 != 0) {
         return $$2;
      } else {
         $$2 = $$0.g.compareTo($$1.g);
         return $$2 != 0 ? $$2 : Long.compare($$0.h, $$1.h);
      }
   };
   public static final Comparator<euw<?>> b = ($$0, $$1) -> {
      int $$2 = $$0.g.compareTo($$1.g);
      return $$2 != 0 ? $$2 : Long.compare($$0.h, $$1.h);
   };
   public static final Strategy<euw<?>> c = new Strategy<euw<?>>() {
      public int a(euw<?> $$0) {
         return 31 * $$0.b().hashCode() + $$0.a().hashCode();
      }

      public boolean a(@Nullable euw<?> $$0, @Nullable euw<?> $$1) {
         if ($$0 == $$1) {
            return true;
         } else {
            return $$0 != null && $$1 != null ? $$0.a() == $$1.a() && $$0.b().equals($$1.b()) : false;
         }
      }
   };

   public euw(T $$0, im $$1, long $$2, long $$3) {
      this($$0, $$1, $$2, eva.d, $$3);
   }

   public euw(T d, im e, long f, eva g, long h) {
      e = e.i();
      this.d = d;
      this.e = e;
      this.f = f;
      this.g = g;
      this.h = h;
   }

   public static <T> euw<T> a(T $$0, im $$1) {
      return new euw<>($$0, $$1, 0L, eva.d, 0L);
   }

   public T a() {
      return this.d;
   }

   public im b() {
      return this.e;
   }

   public long c() {
      return this.f;
   }

   public eva d() {
      return this.g;
   }

   public long e() {
      return this.h;
   }
}
