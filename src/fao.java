import it.unimi.dsi.fastutil.Hash.Strategy;
import java.util.Comparator;
import javax.annotation.Nullable;

public record fao<T>(T d, jf e, long f, fas g, long h) {
   public static final Comparator<fao<?>> a = ($$0, $$1) -> {
      int $$2 = Long.compare($$0.f, $$1.f);
      if ($$2 != 0) {
         return $$2;
      } else {
         $$2 = $$0.g.compareTo($$1.g);
         return $$2 != 0 ? $$2 : Long.compare($$0.h, $$1.h);
      }
   };
   public static final Comparator<fao<?>> b = ($$0, $$1) -> {
      int $$2 = $$0.g.compareTo($$1.g);
      return $$2 != 0 ? $$2 : Long.compare($$0.h, $$1.h);
   };
   public static final Strategy<fao<?>> c = new Strategy<fao<?>>() {
      public int a(fao<?> $$0) {
         return 31 * $$0.b().hashCode() + $$0.a().hashCode();
      }

      public boolean a(@Nullable fao<?> $$0, @Nullable fao<?> $$1) {
         if ($$0 == $$1) {
            return true;
         } else {
            return $$0 != null && $$1 != null ? $$0.a() == $$1.a() && $$0.b().equals($$1.b()) : false;
         }
      }
   };

   public fao(T $$0, jf $$1, long $$2, long $$3) {
      this($$0, $$1, $$2, fas.d, $$3);
   }

   public fao(T d, jf e, long f, fas g, long h) {
      e = e.j();
      this.d = d;
      this.e = e;
      this.f = f;
      this.g = g;
      this.h = h;
   }

   public static <T> fao<T> a(T $$0, jf $$1) {
      return new fao<>($$0, $$1, 0L, fas.d, 0L);
   }

   public fan<T> a(long $$0) {
      return new fan<>(this.d, this.e, (int)(this.f - $$0), this.g);
   }

   public T a() {
      return this.d;
   }

   public jf b() {
      return this.e;
   }

   public long c() {
      return this.f;
   }

   public fas d() {
      return this.g;
   }

   public long e() {
      return this.h;
   }
}
