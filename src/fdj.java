import it.unimi.dsi.fastutil.Hash.Strategy;
import java.util.Comparator;
import javax.annotation.Nullable;

public record fdj<T>(T d, jh e, long f, fdn g, long h) {
   public static final Comparator<fdj<?>> a = ($$0, $$1) -> {
      int $$2 = Long.compare($$0.f, $$1.f);
      if ($$2 != 0) {
         return $$2;
      } else {
         $$2 = $$0.g.compareTo($$1.g);
         return $$2 != 0 ? $$2 : Long.compare($$0.h, $$1.h);
      }
   };
   public static final Comparator<fdj<?>> b = ($$0, $$1) -> {
      int $$2 = $$0.g.compareTo($$1.g);
      return $$2 != 0 ? $$2 : Long.compare($$0.h, $$1.h);
   };
   public static final Strategy<fdj<?>> c = new Strategy<fdj<?>>() {
      public int a(fdj<?> $$0) {
         return 31 * $$0.b().hashCode() + $$0.a().hashCode();
      }

      public boolean a(@Nullable fdj<?> $$0, @Nullable fdj<?> $$1) {
         if ($$0 == $$1) {
            return true;
         } else {
            return $$0 != null && $$1 != null ? $$0.a() == $$1.a() && $$0.b().equals($$1.b()) : false;
         }
      }
   };

   public fdj(T $$0, jh $$1, long $$2, long $$3) {
      this($$0, $$1, $$2, fdn.d, $$3);
   }

   public fdj(T d, jh e, long f, fdn g, long h) {
      e = e.j();
      this.d = d;
      this.e = e;
      this.f = f;
      this.g = g;
      this.h = h;
   }

   public static <T> fdj<T> a(T $$0, jh $$1) {
      return new fdj<>($$0, $$1, 0L, fdn.d, 0L);
   }

   public fdi<T> a(long $$0) {
      return new fdi<>(this.d, this.e, (int)(this.f - $$0), this.g);
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

   public fdn d() {
      return this.g;
   }

   public long e() {
      return this.h;
   }
}
