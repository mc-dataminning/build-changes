import it.unimi.dsi.fastutil.Hash.Strategy;
import java.util.Comparator;
import javax.annotation.Nullable;

public record fhk<T>(T d, iw e, long f, fho g, long h) {
   public static final Comparator<fhk<?>> a = ($$0, $$1) -> {
      int $$2 = Long.compare($$0.f, $$1.f);
      if ($$2 != 0) {
         return $$2;
      } else {
         $$2 = $$0.g.compareTo($$1.g);
         return $$2 != 0 ? $$2 : Long.compare($$0.h, $$1.h);
      }
   };
   public static final Comparator<fhk<?>> b = ($$0, $$1) -> {
      int $$2 = $$0.g.compareTo($$1.g);
      return $$2 != 0 ? $$2 : Long.compare($$0.h, $$1.h);
   };
   public static final Strategy<fhk<?>> c = new Strategy<fhk<?>>() {
      public int a(fhk<?> $$0) {
         return 31 * $$0.b().hashCode() + $$0.a().hashCode();
      }

      public boolean a(@Nullable fhk<?> $$0, @Nullable fhk<?> $$1) {
         if ($$0 == $$1) {
            return true;
         } else {
            return $$0 != null && $$1 != null ? $$0.a() == $$1.a() && $$0.b().equals($$1.b()) : false;
         }
      }
   };

   public fhk(T $$0, iw $$1, long $$2, long $$3) {
      this($$0, $$1, $$2, fho.d, $$3);
   }

   public fhk(T d, iw e, long f, fho g, long h) {
      e = e.j();
      this.d = d;
      this.e = e;
      this.f = f;
      this.g = g;
      this.h = h;
   }

   public static <T> fhk<T> a(T $$0, iw $$1) {
      return new fhk<>($$0, $$1, 0L, fho.d, 0L);
   }

   public fhj<T> a(long $$0) {
      return new fhj<>(this.d, this.e, (int)(this.f - $$0), this.g);
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

   public fho d() {
      return this.g;
   }

   public long e() {
      return this.h;
   }
}
