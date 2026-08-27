import it.unimi.dsi.fastutil.Hash.Strategy;
import java.util.Comparator;
import javax.annotation.Nullable;

public record eyl<T>(T d, ir e, long f, eyp g, long h) {
   public static final Comparator<eyl<?>> a = ($$0, $$1) -> {
      int $$2 = Long.compare($$0.f, $$1.f);
      if ($$2 != 0) {
         return $$2;
      } else {
         $$2 = $$0.g.compareTo($$1.g);
         return $$2 != 0 ? $$2 : Long.compare($$0.h, $$1.h);
      }
   };
   public static final Comparator<eyl<?>> b = ($$0, $$1) -> {
      int $$2 = $$0.g.compareTo($$1.g);
      return $$2 != 0 ? $$2 : Long.compare($$0.h, $$1.h);
   };
   public static final Strategy<eyl<?>> c = new Strategy<eyl<?>>() {
      public int a(eyl<?> $$0) {
         return 31 * $$0.b().hashCode() + $$0.a().hashCode();
      }

      public boolean a(@Nullable eyl<?> $$0, @Nullable eyl<?> $$1) {
         if ($$0 == $$1) {
            return true;
         } else {
            return $$0 != null && $$1 != null ? $$0.a() == $$1.a() && $$0.b().equals($$1.b()) : false;
         }
      }
   };

   public eyl(T $$0, ir $$1, long $$2, long $$3) {
      this($$0, $$1, $$2, eyp.d, $$3);
   }

   public eyl(T d, ir e, long f, eyp g, long h) {
      e = e.i();
      this.d = d;
      this.e = e;
      this.f = f;
      this.g = g;
      this.h = h;
   }

   public static <T> eyl<T> a(T $$0, ir $$1) {
      return new eyl<>($$0, $$1, 0L, eyp.d, 0L);
   }

   public T a() {
      return this.d;
   }

   public ir b() {
      return this.e;
   }

   public long c() {
      return this.f;
   }

   public eyp d() {
      return this.g;
   }

   public long e() {
      return this.h;
   }
}
