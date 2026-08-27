import it.unimi.dsi.fastutil.Hash.Strategy;
import java.util.Comparator;
import javax.annotation.Nullable;

public record ewd<T>(T d, io e, long f, ewh g, long h) {
   public static final Comparator<ewd<?>> a = ($$0, $$1) -> {
      int $$2 = Long.compare($$0.f, $$1.f);
      if ($$2 != 0) {
         return $$2;
      } else {
         $$2 = $$0.g.compareTo($$1.g);
         return $$2 != 0 ? $$2 : Long.compare($$0.h, $$1.h);
      }
   };
   public static final Comparator<ewd<?>> b = ($$0, $$1) -> {
      int $$2 = $$0.g.compareTo($$1.g);
      return $$2 != 0 ? $$2 : Long.compare($$0.h, $$1.h);
   };
   public static final Strategy<ewd<?>> c = new Strategy<ewd<?>>() {
      public int a(ewd<?> $$0) {
         return 31 * $$0.b().hashCode() + $$0.a().hashCode();
      }

      public boolean a(@Nullable ewd<?> $$0, @Nullable ewd<?> $$1) {
         if ($$0 == $$1) {
            return true;
         } else {
            return $$0 != null && $$1 != null ? $$0.a() == $$1.a() && $$0.b().equals($$1.b()) : false;
         }
      }
   };

   public ewd(T $$0, io $$1, long $$2, long $$3) {
      this($$0, $$1, $$2, ewh.d, $$3);
   }

   public ewd(T d, io e, long f, ewh g, long h) {
      e = e.i();
      this.d = d;
      this.e = e;
      this.f = f;
      this.g = g;
      this.h = h;
   }

   public static <T> ewd<T> a(T $$0, io $$1) {
      return new ewd<>($$0, $$1, 0L, ewh.d, 0L);
   }

   public T a() {
      return this.d;
   }

   public io b() {
      return this.e;
   }

   public long c() {
      return this.f;
   }

   public ewh d() {
      return this.g;
   }

   public long e() {
      return this.h;
   }
}
