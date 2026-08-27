import java.util.List;
import javax.annotation.Nullable;

public class clt extends cms {
   public static final String a = "StoredEnchantments";

   public clt(cms.a $$0) {
      super($$0);
   }

   @Override
   public boolean i(cmx $$0) {
      return true;
   }

   @Override
   public boolean d_(cmx $$0) {
      return false;
   }

   public static st d(cmx $$0) {
      sn $$1 = $$0.v();
      return $$1 != null ? $$1.c("StoredEnchantments", 10) : new st();
   }

   @Override
   public void a(cmx $$0, @Nullable cto $$1, List<vf> $$2, cop $$3) {
      super.a($$0, $$1, $$2, $$3);
      cmx.a($$2, d($$0));
   }

   public static void a(cmx $$0, crl $$1) {
      st $$2 = d($$0);
      boolean $$3 = true;
      ahg $$4 = crk.a($$1.a);

      for (int $$5 = 0; $$5 < $$2.size(); $$5++) {
         sn $$6 = $$2.a($$5);
         ahg $$7 = crk.b($$6);
         if ($$7 != null && $$7.equals($$4)) {
            if (crk.a($$6) < $$1.b) {
               crk.a($$6, $$1.b);
            }

            $$3 = false;
            break;
         }
      }

      if ($$3) {
         $$2.add(crk.a($$4, $$1.b));
      }

      $$0.w().a("StoredEnchantments", $$2);
   }

   public static cmx a(crl $$0) {
      cmx $$1 = new cmx(cna.up);
      a($$1, $$0);
      return $$1;
   }
}
