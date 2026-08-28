import it.unimi.dsi.fastutil.Hash.Strategy;
import java.util.Comparator;
import javax.annotation.Nullable;

public record ezv<T>(T d, je e, long f, ezz g, long h) {
   public static final Comparator<ezv<?>> a = ($$0, $$1) -> {
      int $$2 = Long.compare($$0.f, $$1.f);
      if ($$2 != 0) {
         return $$2;
      } else {
         $$2 = $$0.g.compareTo($$1.g);
         return $$2 != 0 ? $$2 : Long.compare($$0.h, $$1.h);
      }
   };
   public static final Comparator<ezv<?>> b = ($$0, $$1) -> {
      int $$2 = $$0.g.compareTo($$1.g);
      return $$2 != 0 ? $$2 : Long.compare($$0.h, $$1.h);
   };
   public static final Strategy<ezv<?>> c = new Strategy<ezv<?>>() {
      public int a(ezv<?> $$0) {
         return 31 * $$0.b().hashCode() + $$0.a().hashCode();
      }

      public boolean a(@Nullable ezv<?> $$0, @Nullable ezv<?> $$1) {
         if ($$0 == $$1) {
            return true;
         } else {
            return $$0 != null && $$1 != null ? $$0.a() == $$1.a() && $$0.b().equals($$1.b()) : false;
         }
      }
   };

   public ezv(T $$0, je $$1, long $$2, long $$3) {
      this($$0, $$1, $$2, ezz.d, $$3);
   }

   public ezv(T d, je e, long f, ezz g, long h) {
      e = e.j();
      this.d = d;
      this.e = e;
      this.f = f;
      this.g = g;
      this.h = h;
   }

   public static <T> ezv<T> a(T $$0, je $$1) {
      return new ezv<>($$0, $$1, 0L, ezz.d, 0L);
   }

   public ezu<T> a(long $$0) {
      return new ezu<>(this.d, this.e, (int)(this.f - $$0), this.g);
   }

   public T a() {
      return this.d;
   }

   public je b() {
      return this.e;
   }

   public long c() {
      return this.f;
   }

   public ezz d() {
      return this.g;
   }

   public long e() {
      return this.h;
   }
}
