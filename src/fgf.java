import java.util.List;
import javax.annotation.Nullable;

public class fgf implements fir {
   private static final int a = 170;
   private final ws b;
   @Nullable
   private List<axi> c;
   @Nullable
   private final ws d;

   private fgf(ws $$0, @Nullable ws $$1) {
      this.b = $$0;
      this.d = $$1;
   }

   public static fgf a(ws $$0, @Nullable ws $$1) {
      return new fgf($$0, $$1);
   }

   public static fgf a(ws $$0) {
      return new fgf($$0, $$0);
   }

   @Override
   public void b(fiq $$0) {
      if (this.d != null) {
         $$0.a(fip.c, this.d);
      }
   }

   public List<axi> a(fcu $$0) {
      if (this.c == null) {
         this.c = a($$0, this.b);
      }

      return this.c;
   }

   public static List<axi> a(fcu $$0, ws $$1) {
      return $$0.h.c($$1, 170);
   }
}
