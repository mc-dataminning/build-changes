import it.unimi.dsi.fastutil.Hash.Strategy;
import java.util.Comparator;
import javax.annotation.Nullable;

public record exw<T>(T d, ja e, long f, eya g, long h) {
   public static final Comparator<exw<?>> a = ($$0, $$1) -> {
      int $$2 = Long.compare($$0.f, $$1.f);
      if ($$2 != 0) {
         return $$2;
      } else {
         $$2 = $$0.g.compareTo($$1.g);
         return $$2 != 0 ? $$2 : Long.compare($$0.h, $$1.h);
      }
   };
   public static final Comparator<exw<?>> b = ($$0, $$1) -> {
      int $$2 = $$0.g.compareTo($$1.g);
      return $$2 != 0 ? $$2 : Long.compare($$0.h, $$1.h);
   };
   public static final Strategy<exw<?>> c = new Strategy<exw<?>>() {
      public int a(exw<?> $$0) {
         return 31 * $$0.b().hashCode() + $$0.a().hashCode();
      }

      public boolean a(@Nullable exw<?> $$0, @Nullable exw<?> $$1) {
         if ($$0 == $$1) {
            return true;
         } else {
            return $$0 != null && $$1 != null ? $$0.a() == $$1.a() && $$0.b().equals($$1.b()) : false;
         }
      }
   };

   public exw(T $$0, ja $$1, long $$2, long $$3) {
      this($$0, $$1, $$2, eya.d, $$3);
   }

   public exw(T d, ja e, long f, eya g, long h) {
      e = e.i();
      this.d = d;
      this.e = e;
      this.f = f;
      this.g = g;
      this.h = h;
   }

   public static <T> exw<T> a(T $$0, ja $$1) {
      return new exw<>($$0, $$1, 0L, eya.d, 0L);
   }

   public T a() {
      return this.d;
   }

   public ja b() {
      return this.e;
   }

   public long c() {
      return this.f;
   }

   public eya d() {
      return this.g;
   }

   public long e() {
      return this.h;
   }
}
