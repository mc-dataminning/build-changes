import java.util.List;
import javax.annotation.Nullable;

public class chu extends cit {
   public static final String a = "StoredEnchantments";

   public chu(cit.a $$0) {
      super($$0);
   }

   @Override
   public boolean i(ciy $$0) {
      return true;
   }

   @Override
   public boolean d_(ciy $$0) {
      return false;
   }

   public static qx d(ciy $$0) {
      qr $$1 = $$0.v();
      return $$1 != null ? $$1.c("StoredEnchantments", 10) : new qx();
   }

   @Override
   public void a(ciy $$0, @Nullable cpm $$1, List<tf> $$2, ckp $$3) {
      super.a($$0, $$1, $$2, $$3);
      ciy.a($$2, d($$0));
   }

   public static void a(ciy $$0, cni $$1) {
      qx $$2 = d($$0);
      boolean $$3 = true;
      aer $$4 = cnh.a($$1.a);

      for (int $$5 = 0; $$5 < $$2.size(); $$5++) {
         qr $$6 = $$2.a($$5);
         aer $$7 = cnh.b($$6);
         if ($$7 != null && $$7.equals($$4)) {
            if (cnh.a($$6) < $$1.b) {
               cnh.a($$6, $$1.b);
            }

            $$3 = false;
            break;
         }
      }

      if ($$3) {
         $$2.add(cnh.a($$4, $$1.b));
      }

      $$0.w().a("StoredEnchantments", $$2);
   }

   public static ciy a(cni $$0) {
      ciy $$1 = new ciy(cjb.tC);
      a($$1, $$0);
      return $$1;
   }
}
