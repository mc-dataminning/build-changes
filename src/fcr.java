import it.unimi.dsi.fastutil.Hash.Strategy;
import java.util.Comparator;
import javax.annotation.Nullable;

public record fcr<T>(T d, ji e, long f, fcv g, long h) {
   public static final Comparator<fcr<?>> a = ($$0, $$1) -> {
      int $$2 = Long.compare($$0.f, $$1.f);
      if ($$2 != 0) {
         return $$2;
      } else {
         $$2 = $$0.g.compareTo($$1.g);
         return $$2 != 0 ? $$2 : Long.compare($$0.h, $$1.h);
      }
   };
   public static final Comparator<fcr<?>> b = ($$0, $$1) -> {
      int $$2 = $$0.g.compareTo($$1.g);
      return $$2 != 0 ? $$2 : Long.compare($$0.h, $$1.h);
   };
   public static final Strategy<fcr<?>> c = new Strategy<fcr<?>>() {
      public int a(fcr<?> $$0) {
         return 31 * $$0.b().hashCode() + $$0.a().hashCode();
      }

      public boolean a(@Nullable fcr<?> $$0, @Nullable fcr<?> $$1) {
         if ($$0 == $$1) {
            return true;
         } else {
            return $$0 != null && $$1 != null ? $$0.a() == $$1.a() && $$0.b().equals($$1.b()) : false;
         }
      }
   };

   public fcr(T $$0, ji $$1, long $$2, long $$3) {
      this($$0, $$1, $$2, fcv.d, $$3);
   }

   public fcr(T d, ji e, long f, fcv g, long h) {
      e = e.j();
      this.d = d;
      this.e = e;
      this.f = f;
      this.g = g;
      this.h = h;
   }

   public static <T> fcr<T> a(T $$0, ji $$1) {
      return new fcr<>($$0, $$1, 0L, fcv.d, 0L);
   }

   public fcq<T> a(long $$0) {
      return new fcq<>(this.d, this.e, (int)(this.f - $$0), this.g);
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

   public fcv d() {
      return this.g;
   }

   public long e() {
      return this.h;
   }
}
