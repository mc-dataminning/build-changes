import java.util.List;
import javax.annotation.Nullable;

public class cht extends cis {
   public static final String a = "StoredEnchantments";

   public cht(cis.a $$0) {
      super($$0);
   }

   @Override
   public boolean i(cix $$0) {
      return true;
   }

   @Override
   public boolean d_(cix $$0) {
      return false;
   }

   public static qx d(cix $$0) {
      qr $$1 = $$0.v();
      return $$1 != null ? $$1.c("StoredEnchantments", 10) : new qx();
   }

   @Override
   public void a(cix $$0, @Nullable cpl $$1, List<tf> $$2, cko $$3) {
      super.a($$0, $$1, $$2, $$3);
      cix.a($$2, d($$0));
   }

   public static void a(cix $$0, cnh $$1) {
      qx $$2 = d($$0);
      boolean $$3 = true;
      aer $$4 = cng.a($$1.a);

      for (int $$5 = 0; $$5 < $$2.size(); $$5++) {
         qr $$6 = $$2.a($$5);
         aer $$7 = cng.b($$6);
         if ($$7 != null && $$7.equals($$4)) {
            if (cng.a($$6) < $$1.b) {
               cng.a($$6, $$1.b);
            }

            $$3 = false;
            break;
         }
      }

      if ($$3) {
         $$2.add(cng.a($$4, $$1.b));
      }

      $$0.w().a("StoredEnchantments", $$2);
   }

   public static cix a(cnh $$0) {
      cix $$1 = new cix(cja.tC);
      a($$1, $$0);
      return $$1;
   }
}
