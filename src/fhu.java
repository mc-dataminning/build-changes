import it.unimi.dsi.fastutil.Hash.Strategy;
import java.util.Comparator;
import javax.annotation.Nullable;

public record fhu<T>(T d, iw e, long f, fhy g, long h) {
   public static final Comparator<fhu<?>> a = ($$0, $$1) -> {
      int $$2 = Long.compare($$0.f, $$1.f);
      if ($$2 != 0) {
         return $$2;
      } else {
         $$2 = $$0.g.compareTo($$1.g);
         return $$2 != 0 ? $$2 : Long.compare($$0.h, $$1.h);
      }
   };
   public static final Comparator<fhu<?>> b = ($$0, $$1) -> {
      int $$2 = $$0.g.compareTo($$1.g);
      return $$2 != 0 ? $$2 : Long.compare($$0.h, $$1.h);
   };
   public static final Strategy<fhu<?>> c = new Strategy<fhu<?>>() {
      public int a(fhu<?> $$0) {
         return 31 * $$0.b().hashCode() + $$0.a().hashCode();
      }

      public boolean a(@Nullable fhu<?> $$0, @Nullable fhu<?> $$1) {
         if ($$0 == $$1) {
            return true;
         } else {
            return $$0 != null && $$1 != null ? $$0.a() == $$1.a() && $$0.b().equals($$1.b()) : false;
         }
      }
   };

   public fhu(T $$0, iw $$1, long $$2, long $$3) {
      this($$0, $$1, $$2, fhy.d, $$3);
   }

   public fhu(T d, iw e, long f, fhy g, long h) {
      e = e.j();
      this.d = d;
      this.e = e;
      this.f = f;
      this.g = g;
      this.h = h;
   }

   public static <T> fhu<T> a(T $$0, iw $$1) {
      return new fhu<>($$0, $$1, 0L, fhy.d, 0L);
   }

   public fht<T> a(long $$0) {
      return new fht<>(this.d, this.e, (int)(this.f - $$0), this.g);
   }

   public T a() {
      return this.d;
   }

   public iw b() {
      return this.e;
   }

   public long c() {
      return this.f;
   }

   public fhy d() {
      return this.g;
   }

   public long e() {
      return this.h;
   }
}
