import java.util.List;
import javax.annotation.Nullable;

public class cev extends cfu {
   public static final String a = "StoredEnchantments";

   public cev(cfu.a $$0) {
      super($$0);
   }

   @Override
   public boolean i(cfz $$0) {
      return true;
   }

   @Override
   public boolean d_(cfz $$0) {
      return false;
   }

   public static qx d(cfz $$0) {
      qr $$1 = $$0.v();
      return $$1 != null ? $$1.c("StoredEnchantments", 10) : new qx();
   }

   @Override
   public void a(cfz $$0, @Nullable cmm $$1, List<sw> $$2, chq $$3) {
      super.a($$0, $$1, $$2, $$3);
      cfz.a($$2, d($$0));
   }

   public static void a(cfz $$0, ckj $$1) {
      qx $$2 = d($$0);
      boolean $$3 = true;
      acq $$4 = cki.a($$1.a);

      for (int $$5 = 0; $$5 < $$2.size(); $$5++) {
         qr $$6 = $$2.a($$5);
         acq $$7 = cki.b($$6);
         if ($$7 != null && $$7.equals($$4)) {
            if (cki.a($$6) < $$1.b) {
               cki.a($$6, $$1.b);
            }

            $$3 = false;
            break;
         }
      }

      if ($$3) {
         $$2.add(cki.a($$4, $$1.b));
      }

      $$0.w().a("StoredEnchantments", $$2);
   }

   public static cfz a(ckj $$0) {
      cfz $$1 = new cfz(cgc.tC);
      a($$1, $$0);
      return $$1;
   }
}
