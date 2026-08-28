import java.util.List;
import javax.annotation.Nullable;

public class fnh implements fpv {
   private static final int a = 170;
   private final xl b;
   @Nullable
   private List<ayz> c;
   @Nullable
   private ui d;
   @Nullable
   private final xl e;

   private fnh(xl $$0, @Nullable xl $$1) {
      this.b = $$0;
      this.e = $$1;
   }

   public static fnh a(xl $$0, @Nullable xl $$1) {
      return new fnh($$0, $$1);
   }

   public static fnh a(xl $$0) {
      return new fnh($$0, $$0);
   }

   @Override
   public void b(fpu $$0) {
      if (this.e != null) {
         $$0.a(fpt.c, this.e);
      }
   }

   public List<ayz> a(fjx $$0) {
      ui $$1 = ui.a();
      if (this.c == null || $$1 != this.d) {
         this.c = a($$0, this.b);
         this.d = $$1;
      }

      return this.c;
   }

   public static List<ayz> a(fjx $$0, xl $$1) {
      return $$0.h.c($$1, 170);
   }
}
