import it.unimi.dsi.fastutil.Hash.Strategy;
import java.util.Comparator;
import javax.annotation.Nullable;

public record fbj<T>(T d, jh e, long f, fbn g, long h) {
   public static final Comparator<fbj<?>> a = ($$0, $$1) -> {
      int $$2 = Long.compare($$0.f, $$1.f);
      if ($$2 != 0) {
         return $$2;
      } else {
         $$2 = $$0.g.compareTo($$1.g);
         return $$2 != 0 ? $$2 : Long.compare($$0.h, $$1.h);
      }
   };
   public static final Comparator<fbj<?>> b = ($$0, $$1) -> {
      int $$2 = $$0.g.compareTo($$1.g);
      return $$2 != 0 ? $$2 : Long.compare($$0.h, $$1.h);
   };
   public static final Strategy<fbj<?>> c = new Strategy<fbj<?>>() {
      public int a(fbj<?> $$0) {
         return 31 * $$0.b().hashCode() + $$0.a().hashCode();
      }

      public boolean a(@Nullable fbj<?> $$0, @Nullable fbj<?> $$1) {
         if ($$0 == $$1) {
            return true;
         } else {
            return $$0 != null && $$1 != null ? $$0.a() == $$1.a() && $$0.b().equals($$1.b()) : false;
         }
      }
   };

   public fbj(T $$0, jh $$1, long $$2, long $$3) {
      this($$0, $$1, $$2, fbn.d, $$3);
   }

   public fbj(T d, jh e, long f, fbn g, long h) {
      e = e.j();
      this.d = d;
      this.e = e;
      this.f = f;
      this.g = g;
      this.h = h;
   }

   public static <T> fbj<T> a(T $$0, jh $$1) {
      return new fbj<>($$0, $$1, 0L, fbn.d, 0L);
   }

   public fbi<T> a(long $$0) {
      return new fbi<>(this.d, this.e, (int)(this.f - $$0), this.g);
   }

   public T a() {
      return this.d;
   }

   public jh b() {
      return this.e;
   }

   public long c() {
      return this.f;
   }

   public fbn d() {
      return this.g;
   }

   public long e() {
      return this.h;
   }
}
