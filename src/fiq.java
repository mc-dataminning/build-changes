import java.util.List;
import javax.annotation.Nullable;

public class fiq implements flc {
   private static final int a = 170;
   private final xp b;
   @Nullable
   private List<ayl> c;
   @Nullable
   private final xp d;

   private fiq(xp $$0, @Nullable xp $$1) {
      this.b = $$0;
      this.d = $$1;
   }

   public static fiq a(xp $$0, @Nullable xp $$1) {
      return new fiq($$0, $$1);
   }

   public static fiq a(xp $$0) {
      return new fiq($$0, $$0);
   }

   @Override
   public void b(flb $$0) {
      if (this.d != null) {
         $$0.a(fla.c, this.d);
      }
   }

   public List<ayl> a(ffg $$0) {
      if (this.c == null) {
         this.c = a($$0, this.b);
      }

      return this.c;
   }

   public static List<ayl> a(ffg $$0, xp $$1) {
      return $$0.h.c($$1, 170);
   }
}
