import java.util.List;
import javax.annotation.Nullable;

public class fhl implements fjx {
   private static final int a = 170;
   private final wx b;
   @Nullable
   private List<axr> c;
   @Nullable
   private final wx d;

   private fhl(wx $$0, @Nullable wx $$1) {
      this.b = $$0;
      this.d = $$1;
   }

   public static fhl a(wx $$0, @Nullable wx $$1) {
      return new fhl($$0, $$1);
   }

   public static fhl a(wx $$0) {
      return new fhl($$0, $$0);
   }

   @Override
   public void b(fjw $$0) {
      if (this.d != null) {
         $$0.a(fjv.c, this.d);
      }
   }

   public List<axr> a(feb $$0) {
      if (this.c == null) {
         this.c = a($$0, this.b);
      }

      return this.c;
   }

   public static List<axr> a(feb $$0, wx $$1) {
      return $$0.h.c($$1, 170);
   }
}
