import it.unimi.dsi.fastutil.Hash.Strategy;
import java.util.Comparator;
import javax.annotation.Nullable;

public record fga<T>(T d, iu e, long f, fge g, long h) {
   public static final Comparator<fga<?>> a = ($$0, $$1) -> {
      int $$2 = Long.compare($$0.f, $$1.f);
      if ($$2 != 0) {
         return $$2;
      } else {
         $$2 = $$0.g.compareTo($$1.g);
         return $$2 != 0 ? $$2 : Long.compare($$0.h, $$1.h);
      }
   };
   public static final Comparator<fga<?>> b = ($$0, $$1) -> {
      int $$2 = $$0.g.compareTo($$1.g);
      return $$2 != 0 ? $$2 : Long.compare($$0.h, $$1.h);
   };
   public static final Strategy<fga<?>> c = new Strategy<fga<?>>() {
      public int a(fga<?> $$0) {
         return 31 * $$0.b().hashCode() + $$0.a().hashCode();
      }

      public boolean a(@Nullable fga<?> $$0, @Nullable fga<?> $$1) {
         if ($$0 == $$1) {
            return true;
         } else {
            return $$0 != null && $$1 != null ? $$0.a() == $$1.a() && $$0.b().equals($$1.b()) : false;
         }
      }
   };

   public fga(T $$0, iu $$1, long $$2, long $$3) {
      this($$0, $$1, $$2, fge.d, $$3);
   }

   public fga(T d, iu e, long f, fge g, long h) {
      e = e.j();
      this.d = d;
      this.e = e;
      this.f = f;
      this.g = g;
      this.h = h;
   }

   public static <T> fga<T> a(T $$0, iu $$1) {
      return new fga<>($$0, $$1, 0L, fge.d, 0L);
   }

   public ffz<T> a(long $$0) {
      return new ffz<>(this.d, this.e, (int)(this.f - $$0), this.g);
   }

   public T a() {
      return this.d;
   }

   public iu b() {
      return this.e;
   }

   public long c() {
      return this.f;
   }

   public fge d() {
      return this.g;
   }

   public long e() {
      return this.h;
   }
}
