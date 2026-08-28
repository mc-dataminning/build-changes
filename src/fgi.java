import it.unimi.dsi.fastutil.Hash.Strategy;
import java.util.Comparator;
import javax.annotation.Nullable;

public record fgi<T>(T d, iu e, long f, fgm g, long h) {
   public static final Comparator<fgi<?>> a = ($$0, $$1) -> {
      int $$2 = Long.compare($$0.f, $$1.f);
      if ($$2 != 0) {
         return $$2;
      } else {
         $$2 = $$0.g.compareTo($$1.g);
         return $$2 != 0 ? $$2 : Long.compare($$0.h, $$1.h);
      }
   };
   public static final Comparator<fgi<?>> b = ($$0, $$1) -> {
      int $$2 = $$0.g.compareTo($$1.g);
      return $$2 != 0 ? $$2 : Long.compare($$0.h, $$1.h);
   };
   public static final Strategy<fgi<?>> c = new Strategy<fgi<?>>() {
      public int a(fgi<?> $$0) {
         return 31 * $$0.b().hashCode() + $$0.a().hashCode();
      }

      public boolean a(@Nullable fgi<?> $$0, @Nullable fgi<?> $$1) {
         if ($$0 == $$1) {
            return true;
         } else {
            return $$0 != null && $$1 != null ? $$0.a() == $$1.a() && $$0.b().equals($$1.b()) : false;
         }
      }
   };

   public fgi(T $$0, iu $$1, long $$2, long $$3) {
      this($$0, $$1, $$2, fgm.d, $$3);
   }

   public fgi(T d, iu e, long f, fgm g, long h) {
      e = e.j();
      this.d = d;
      this.e = e;
      this.f = f;
      this.g = g;
      this.h = h;
   }

   public static <T> fgi<T> a(T $$0, iu $$1) {
      return new fgi<>($$0, $$1, 0L, fgm.d, 0L);
   }

   public fgh<T> a(long $$0) {
      return new fgh<>(this.d, this.e, (int)(this.f - $$0), this.g);
   }

   public T a() {
      return this.d;
   }

   public iu b() {
      return this.e;
   }

   public long c() {
      return this.f;
   }

   public fgm d() {
      return this.g;
   }

   public long e() {
      return this.h;
   }
}
