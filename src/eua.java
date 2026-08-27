import it.unimi.dsi.fastutil.Hash.Strategy;
import java.util.Comparator;
import javax.annotation.Nullable;

public record eua<T>(T d, id e, long f, eue g, long h) {
   public static final Comparator<eua<?>> a = ($$0, $$1) -> {
      int $$2 = Long.compare($$0.f, $$1.f);
      if ($$2 != 0) {
         return $$2;
      } else {
         $$2 = $$0.g.compareTo($$1.g);
         return $$2 != 0 ? $$2 : Long.compare($$0.h, $$1.h);
      }
   };
   public static final Comparator<eua<?>> b = ($$0, $$1) -> {
      int $$2 = $$0.g.compareTo($$1.g);
      return $$2 != 0 ? $$2 : Long.compare($$0.h, $$1.h);
   };
   public static final Strategy<eua<?>> c = new Strategy<eua<?>>() {
      public int a(eua<?> $$0) {
         return 31 * $$0.b().hashCode() + $$0.a().hashCode();
      }

      public boolean a(@Nullable eua<?> $$0, @Nullable eua<?> $$1) {
         if ($$0 == $$1) {
            return true;
         } else {
            return $$0 != null && $$1 != null ? $$0.a() == $$1.a() && $$0.b().equals($$1.b()) : false;
         }
      }
   };

   public eua(T $$0, id $$1, long $$2, long $$3) {
      this($$0, $$1, $$2, eue.d, $$3);
   }

   public eua(T d, id e, long f, eue g, long h) {
      e = e.i();
      this.d = d;
      this.e = e;
      this.f = f;
      this.g = g;
      this.h = h;
   }

   public static <T> eua<T> a(T $$0, id $$1) {
      return new eua<>($$0, $$1, 0L, eue.d, 0L);
   }

   public T a() {
      return this.d;
   }

   public id b() {
      return this.e;
   }

   public long c() {
      return this.f;
   }

   public eue d() {
      return this.g;
   }

   public long e() {
      return this.h;
   }
}
