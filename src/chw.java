import java.util.List;
import javax.annotation.Nullable;

public class chw extends civ {
   public static final String a = "StoredEnchantments";

   public chw(civ.a $$0) {
      super($$0);
   }

   @Override
   public boolean i(cja $$0) {
      return true;
   }

   @Override
   public boolean d_(cja $$0) {
      return false;
   }

   public static ra d(cja $$0) {
      qu $$1 = $$0.v();
      return $$1 != null ? $$1.c("StoredEnchantments", 10) : new ra();
   }

   @Override
   public void a(cja $$0, @Nullable cpq $$1, List<ti> $$2, ckr $$3) {
      super.a($$0, $$1, $$2, $$3);
      cja.a($$2, d($$0));
   }

   public static void a(cja $$0, cnm $$1) {
      ra $$2 = d($$0);
      boolean $$3 = true;
      aeu $$4 = cnl.a($$1.a);

      for (int $$5 = 0; $$5 < $$2.size(); $$5++) {
         qu $$6 = $$2.a($$5);
         aeu $$7 = cnl.b($$6);
         if ($$7 != null && $$7.equals($$4)) {
            if (cnl.a($$6) < $$1.b) {
               cnl.a($$6, $$1.b);
            }

            $$3 = false;
            break;
         }
      }

      if ($$3) {
         $$2.add(cnl.a($$4, $$1.b));
      }

      $$0.w().a("StoredEnchantments", $$2);
   }

   public static cja a(cnm $$0) {
      cja $$1 = new cja(cjd.tC);
      a($$1, $$0);
      return $$1;
   }
}
