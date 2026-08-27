import java.util.List;
import javax.annotation.Nullable;

public class fgp implements fjb {
   private static final int a = 170;
   private final wu b;
   @Nullable
   private List<axl> c;
   @Nullable
   private final wu d;

   private fgp(wu $$0, @Nullable wu $$1) {
      this.b = $$0;
      this.d = $$1;
   }

   public static fgp a(wu $$0, @Nullable wu $$1) {
      return new fgp($$0, $$1);
   }

   public static fgp a(wu $$0) {
      return new fgp($$0, $$0);
   }

   @Override
   public void b(fja $$0) {
      if (this.d != null) {
         $$0.a(fiz.c, this.d);
      }
   }

   public List<axl> a(fde $$0) {
      if (this.c == null) {
         this.c = a($$0, this.b);
      }

      return this.c;
   }

   public static List<axl> a(fde $$0, wu $$1) {
      return $$0.h.c($$1, 170);
   }
}
