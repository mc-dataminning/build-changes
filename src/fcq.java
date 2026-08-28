import it.unimi.dsi.fastutil.Hash.Strategy;
import java.util.Comparator;
import javax.annotation.Nullable;

public record fcq<T>(T d, ji e, long f, fcu g, long h) {
   public static final Comparator<fcq<?>> a = ($$0, $$1) -> {
      int $$2 = Long.compare($$0.f, $$1.f);
      if ($$2 != 0) {
         return $$2;
      } else {
         $$2 = $$0.g.compareTo($$1.g);
         return $$2 != 0 ? $$2 : Long.compare($$0.h, $$1.h);
      }
   };
   public static final Comparator<fcq<?>> b = ($$0, $$1) -> {
      int $$2 = $$0.g.compareTo($$1.g);
      return $$2 != 0 ? $$2 : Long.compare($$0.h, $$1.h);
   };
   public static final Strategy<fcq<?>> c = new Strategy<fcq<?>>() {
      public int a(fcq<?> $$0) {
         return 31 * $$0.b().hashCode() + $$0.a().hashCode();
      }

      public boolean a(@Nullable fcq<?> $$0, @Nullable fcq<?> $$1) {
         if ($$0 == $$1) {
            return true;
         } else {
            return $$0 != null && $$1 != null ? $$0.a() == $$1.a() && $$0.b().equals($$1.b()) : false;
         }
      }
   };

   public fcq(T $$0, ji $$1, long $$2, long $$3) {
      this($$0, $$1, $$2, fcu.d, $$3);
   }

   public fcq(T d, ji e, long f, fcu g, long h) {
      e = e.j();
      this.d = d;
      this.e = e;
      this.f = f;
      this.g = g;
      this.h = h;
   }

   public static <T> fcq<T> a(T $$0, ji $$1) {
      return new fcq<>($$0, $$1, 0L, fcu.d, 0L);
   }

   public fcp<T> a(long $$0) {
      return new fcp<>(this.d, this.e, (int)(this.f - $$0), this.g);
   }

   public T a() {
      return this.d;
   }

   public ji b() {
      return this.e;
   }

   public long c() {
      return this.f;
   }

   public fcu d() {
      return this.g;
   }

   public long e() {
      return this.h;
   }
}
