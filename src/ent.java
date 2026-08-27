import it.unimi.dsi.fastutil.Hash.Strategy;
import java.util.Comparator;
import javax.annotation.Nullable;

public record ent<T>(T d, hx e, long f, enx g, long h) {
   public static final Comparator<ent<?>> a = ($$0, $$1) -> {
      int $$2 = Long.compare($$0.f, $$1.f);
      if ($$2 != 0) {
         return $$2;
      } else {
         $$2 = $$0.g.compareTo($$1.g);
         return $$2 != 0 ? $$2 : Long.compare($$0.h, $$1.h);
      }
   };
   public static final Comparator<ent<?>> b = ($$0, $$1) -> {
      int $$2 = $$0.g.compareTo($$1.g);
      return $$2 != 0 ? $$2 : Long.compare($$0.h, $$1.h);
   };
   public static final Strategy<ent<?>> c = new Strategy<ent<?>>() {
      public int a(ent<?> $$0) {
         return 31 * $$0.b().hashCode() + $$0.a().hashCode();
      }

      public boolean a(@Nullable ent<?> $$0, @Nullable ent<?> $$1) {
         if ($$0 == $$1) {
            return true;
         } else {
            return $$0 != null && $$1 != null ? $$0.a() == $$1.a() && $$0.b().equals($$1.b()) : false;
         }
      }
   };

   public ent(T $$0, hx $$1, long $$2, long $$3) {
      this($$0, $$1, $$2, enx.d, $$3);
   }

   public ent(T d, hx e, long f, enx g, long h) {
      e = e.i();
      this.d = d;
      this.e = e;
      this.f = f;
      this.g = g;
      this.h = h;
   }

   public static <T> ent<T> a(T $$0, hx $$1) {
      return new ent<>($$0, $$1, 0L, enx.d, 0L);
   }

   public T a() {
      return this.d;
   }

   public hx b() {
      return this.e;
   }

   public long c() {
      return this.f;
   }

   public enx d() {
      return this.g;
   }

   public long e() {
      return this.h;
   }
}
