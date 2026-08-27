import it.unimi.dsi.fastutil.Hash.Strategy;
import java.util.Comparator;
import javax.annotation.Nullable;

public record eiu<T>(T d, gw e, long f, eiy g, long h) {
   public static final Comparator<eiu<?>> a = ($$0, $$1) -> {
      int $$2 = Long.compare($$0.f, $$1.f);
      if ($$2 != 0) {
         return $$2;
      } else {
         $$2 = $$0.g.compareTo($$1.g);
         return $$2 != 0 ? $$2 : Long.compare($$0.h, $$1.h);
      }
   };
   public static final Comparator<eiu<?>> b = ($$0, $$1) -> {
      int $$2 = $$0.g.compareTo($$1.g);
      return $$2 != 0 ? $$2 : Long.compare($$0.h, $$1.h);
   };
   public static final Strategy<eiu<?>> c = new Strategy<eiu<?>>() {
      public int a(eiu<?> $$0) {
         return 31 * $$0.b().hashCode() + $$0.a().hashCode();
      }

      public boolean a(@Nullable eiu<?> $$0, @Nullable eiu<?> $$1) {
         if ($$0 == $$1) {
            return true;
         } else {
            return $$0 != null && $$1 != null ? $$0.a() == $$1.a() && $$0.b().equals($$1.b()) : false;
         }
      }
   };

   public eiu(T $$0, gw $$1, long $$2, long $$3) {
      this($$0, $$1, $$2, eiy.d, $$3);
   }

   public eiu(T d, gw e, long f, eiy g, long h) {
      e = e.i();
      this.d = d;
      this.e = e;
      this.f = f;
      this.g = g;
      this.h = h;
   }

   public static <T> eiu<T> a(T $$0, gw $$1) {
      return new eiu<>($$0, $$1, 0L, eiy.d, 0L);
   }

   public T a() {
      return this.d;
   }

   public gw b() {
      return this.e;
   }

   public long c() {
      return this.f;
   }

   public eiy d() {
      return this.g;
   }

   public long e() {
      return this.h;
   }
}
