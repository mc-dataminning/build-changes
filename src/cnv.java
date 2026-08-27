import java.util.List;
import javax.annotation.Nullable;

public class cnv extends cou {
   public static final String a = "StoredEnchantments";

   public cnv(cou.a $$0) {
      super($$0);
   }

   @Override
   public boolean i(coz $$0) {
      return true;
   }

   @Override
   public boolean d_(coz $$0) {
      return false;
   }

   public static tc d(coz $$0) {
      sw $$1 = $$0.w();
      return $$1 != null ? $$1.c("StoredEnchantments", 10) : new tc();
   }

   @Override
   public void a(coz $$0, @Nullable cvn $$1, List<vq> $$2, cqq $$3) {
      super.a($$0, $$1, $$2, $$3);
      coz.a($$2, d($$0));
   }

   public static void a(coz $$0, ctk $$1) {
      tc $$2 = d($$0);
      boolean $$3 = true;
      aiy $$4 = ctj.a($$1.a);

      for (int $$5 = 0; $$5 < $$2.size(); $$5++) {
         sw $$6 = $$2.a($$5);
         aiy $$7 = ctj.b($$6);
         if ($$7 != null && $$7.equals($$4)) {
            if (ctj.a($$6) < $$1.b) {
               ctj.a($$6, $$1.b);
            }

            $$3 = false;
            break;
         }
      }

      if ($$3) {
         $$2.add(ctj.a($$4, $$1.b));
      }

      $$0.x().a("StoredEnchantments", $$2);
   }

   public static coz a(ctk $$0) {
      coz $$1 = new coz(cpc.us);
      a($$1, $$0);
      return $$1;
   }
}
