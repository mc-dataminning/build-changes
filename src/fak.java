import it.unimi.dsi.fastutil.Hash.Strategy;
import java.util.Comparator;
import javax.annotation.Nullable;

public record fak<T>(T d, je e, long f, fao g, long h) {
   public static final Comparator<fak<?>> a = ($$0, $$1) -> {
      int $$2 = Long.compare($$0.f, $$1.f);
      if ($$2 != 0) {
         return $$2;
      } else {
         $$2 = $$0.g.compareTo($$1.g);
         return $$2 != 0 ? $$2 : Long.compare($$0.h, $$1.h);
      }
   };
   public static final Comparator<fak<?>> b = ($$0, $$1) -> {
      int $$2 = $$0.g.compareTo($$1.g);
      return $$2 != 0 ? $$2 : Long.compare($$0.h, $$1.h);
   };
   public static final Strategy<fak<?>> c = new Strategy<fak<?>>() {
      public int a(fak<?> $$0) {
         return 31 * $$0.b().hashCode() + $$0.a().hashCode();
      }

      public boolean a(@Nullable fak<?> $$0, @Nullable fak<?> $$1) {
         if ($$0 == $$1) {
            return true;
         } else {
            return $$0 != null && $$1 != null ? $$0.a() == $$1.a() && $$0.b().equals($$1.b()) : false;
         }
      }
   };

   public fak(T $$0, je $$1, long $$2, long $$3) {
      this($$0, $$1, $$2, fao.d, $$3);
   }

   public fak(T d, je e, long f, fao g, long h) {
      e = e.j();
      this.d = d;
      this.e = e;
      this.f = f;
      this.g = g;
      this.h = h;
   }

   public static <T> fak<T> a(T $$0, je $$1) {
      return new fak<>($$0, $$1, 0L, fao.d, 0L);
   }

   public faj<T> a(long $$0) {
      return new faj<>(this.d, this.e, (int)(this.f - $$0), this.g);
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

   public fao d() {
      return this.g;
   }

   public long e() {
      return this.h;
   }
}
