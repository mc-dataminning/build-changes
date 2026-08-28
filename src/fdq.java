import it.unimi.dsi.fastutil.Hash.Strategy;
import java.util.Comparator;
import javax.annotation.Nullable;

public record fdq<T>(T d, jh e, long f, fdu g, long h) {
   public static final Comparator<fdq<?>> a = ($$0, $$1) -> {
      int $$2 = Long.compare($$0.f, $$1.f);
      if ($$2 != 0) {
         return $$2;
      } else {
         $$2 = $$0.g.compareTo($$1.g);
         return $$2 != 0 ? $$2 : Long.compare($$0.h, $$1.h);
      }
   };
   public static final Comparator<fdq<?>> b = ($$0, $$1) -> {
      int $$2 = $$0.g.compareTo($$1.g);
      return $$2 != 0 ? $$2 : Long.compare($$0.h, $$1.h);
   };
   public static final Strategy<fdq<?>> c = new Strategy<fdq<?>>() {
      public int a(fdq<?> $$0) {
         return 31 * $$0.b().hashCode() + $$0.a().hashCode();
      }

      public boolean a(@Nullable fdq<?> $$0, @Nullable fdq<?> $$1) {
         if ($$0 == $$1) {
            return true;
         } else {
            return $$0 != null && $$1 != null ? $$0.a() == $$1.a() && $$0.b().equals($$1.b()) : false;
         }
      }
   };

   public fdq(T $$0, jh $$1, long $$2, long $$3) {
      this($$0, $$1, $$2, fdu.d, $$3);
   }

   public fdq(T d, jh e, long f, fdu g, long h) {
      e = e.j();
      this.d = d;
      this.e = e;
      this.f = f;
      this.g = g;
      this.h = h;
   }

   public static <T> fdq<T> a(T $$0, jh $$1) {
      return new fdq<>($$0, $$1, 0L, fdu.d, 0L);
   }

   public fdp<T> a(long $$0) {
      return new fdp<>(this.d, this.e, (int)(this.f - $$0), this.g);
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

   public fdu d() {
      return this.g;
   }

   public long e() {
      return this.h;
   }
}
