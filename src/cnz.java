import java.util.List;
import javax.annotation.Nullable;

public class cnz extends coy {
   public static final String a = "StoredEnchantments";

   public cnz(coy.a $$0) {
      super($$0);
   }

   @Override
   public boolean i(cpd $$0) {
      return true;
   }

   @Override
   public boolean d_(cpd $$0) {
      return false;
   }

   public static tc d(cpd $$0) {
      sw $$1 = $$0.w();
      return $$1 != null ? $$1.c("StoredEnchantments", 10) : new tc();
   }

   @Override
   public void a(cpd $$0, @Nullable cvr $$1, List<vq> $$2, cqu $$3) {
      super.a($$0, $$1, $$2, $$3);
      cpd.a($$2, d($$0));
   }

   public static void a(cpd $$0, cto $$1) {
      tc $$2 = d($$0);
      boolean $$3 = true;
      aiy $$4 = ctn.a($$1.a);

      for (int $$5 = 0; $$5 < $$2.size(); $$5++) {
         sw $$6 = $$2.a($$5);
         aiy $$7 = ctn.b($$6);
         if ($$7 != null && $$7.equals($$4)) {
            if (ctn.a($$6) < $$1.b) {
               ctn.a($$6, $$1.b);
            }

            $$3 = false;
            break;
         }
      }

      if ($$3) {
         $$2.add(ctn.a($$4, $$1.b));
      }

      $$0.x().a("StoredEnchantments", $$2);
   }

   public static cpd a(cto $$0) {
      cpd $$1 = new cpd(cpg.us);
      a($$1, $$0);
      return $$1;
   }
}
