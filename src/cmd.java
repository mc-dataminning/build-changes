import java.util.List;
import javax.annotation.Nullable;

public class cmd extends cnb {
   public static final String a = "StoredEnchantments";

   public cmd(cnb.a $$0) {
      super($$0);
   }

   @Override
   public boolean i(cng $$0) {
      return true;
   }

   @Override
   public boolean d_(cng $$0) {
      return false;
   }

   public static su d(cng $$0) {
      so $$1 = $$0.v();
      return $$1 != null ? $$1.c("StoredEnchantments", 10) : new su();
   }

   @Override
   public void a(cng $$0, @Nullable ctx $$1, List<vg> $$2, coy $$3) {
      super.a($$0, $$1, $$2, $$3);
      cng.a($$2, d($$0));
   }

   public static void a(cng $$0, cru $$1) {
      su $$2 = d($$0);
      boolean $$3 = true;
      ahh $$4 = crt.a($$1.a);

      for (int $$5 = 0; $$5 < $$2.size(); $$5++) {
         so $$6 = $$2.a($$5);
         ahh $$7 = crt.b($$6);
         if ($$7 != null && $$7.equals($$4)) {
            if (crt.a($$6) < $$1.b) {
               crt.a($$6, $$1.b);
            }

            $$3 = false;
            break;
         }
      }

      if ($$3) {
         $$2.add(crt.a($$4, $$1.b));
      }

      $$0.w().a("StoredEnchantments", $$2);
   }

   public static cng a(cru $$0) {
      cng $$1 = new cng(cnj.us);
      a($$1, $$0);
      return $$1;
   }
}
