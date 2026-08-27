import java.util.List;
import javax.annotation.Nullable;

public class clu extends cmt {
   public static final String a = "StoredEnchantments";

   public clu(cmt.a $$0) {
      super($$0);
   }

   @Override
   public boolean i(cmy $$0) {
      return true;
   }

   @Override
   public boolean d_(cmy $$0) {
      return false;
   }

   public static st d(cmy $$0) {
      sn $$1 = $$0.v();
      return $$1 != null ? $$1.c("StoredEnchantments", 10) : new st();
   }

   @Override
   public void a(cmy $$0, @Nullable ctp $$1, List<vf> $$2, coq $$3) {
      super.a($$0, $$1, $$2, $$3);
      cmy.a($$2, d($$0));
   }

   public static void a(cmy $$0, crm $$1) {
      st $$2 = d($$0);
      boolean $$3 = true;
      ahg $$4 = crl.a($$1.a);

      for (int $$5 = 0; $$5 < $$2.size(); $$5++) {
         sn $$6 = $$2.a($$5);
         ahg $$7 = crl.b($$6);
         if ($$7 != null && $$7.equals($$4)) {
            if (crl.a($$6) < $$1.b) {
               crl.a($$6, $$1.b);
            }

            $$3 = false;
            break;
         }
      }

      if ($$3) {
         $$2.add(crl.a($$4, $$1.b));
      }

      $$0.w().a("StoredEnchantments", $$2);
   }

   public static cmy a(crm $$0) {
      cmy $$1 = new cmy(cnb.up);
      a($$1, $$0);
      return $$1;
   }
}
