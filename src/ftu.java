import java.util.List;
import javax.annotation.Nullable;

public class ftu implements fwh {
   private static final int a = 170;
   private final wy b;
   @Nullable
   private List<ayy> c;
   @Nullable
   private tu d;
   @Nullable
   private final wy e;

   private ftu(wy $$0, @Nullable wy $$1) {
      this.b = $$0;
      this.e = $$1;
   }

   public static ftu a(wy $$0, @Nullable wy $$1) {
      return new ftu($$0, $$1);
   }

   public static ftu a(wy $$0) {
      return new ftu($$0, $$0);
   }

   @Override
   public void b(fwg $$0) {
      if (this.e != null) {
         $$0.a(fwf.c, this.e);
      }
   }

   public List<ayy> a(foz $$0) {
      tu $$1 = tu.a();
      if (this.c == null || $$1 != this.d) {
         this.c = a($$0, this.b);
         this.d = $$1;
      }

      return this.c;
   }

   public static List<ayy> a(foz $$0, wy $$1) {
      return $$0.h.c($$1, 170);
   }
}
