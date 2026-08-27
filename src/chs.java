import java.util.List;
import javax.annotation.Nullable;

public class chs extends cir {
   public static final String a = "StoredEnchantments";

   public chs(cir.a $$0) {
      super($$0);
   }

   @Override
   public boolean i(ciw $$0) {
      return true;
   }

   @Override
   public boolean d_(ciw $$0) {
      return false;
   }

   public static qy d(ciw $$0) {
      qs $$1 = $$0.v();
      return $$1 != null ? $$1.c("StoredEnchantments", 10) : new qy();
   }

   @Override
   public void a(ciw $$0, @Nullable cpk $$1, List<te> $$2, ckn $$3) {
      super.a($$0, $$1, $$2, $$3);
      ciw.a($$2, d($$0));
   }

   public static void a(ciw $$0, cng $$1) {
      qy $$2 = d($$0);
      boolean $$3 = true;
      aep $$4 = cnf.a($$1.a);

      for (int $$5 = 0; $$5 < $$2.size(); $$5++) {
         qs $$6 = $$2.a($$5);
         aep $$7 = cnf.b($$6);
         if ($$7 != null && $$7.equals($$4)) {
            if (cnf.a($$6) < $$1.b) {
               cnf.a($$6, $$1.b);
            }

            $$3 = false;
            break;
         }
      }

      if ($$3) {
         $$2.add(cnf.a($$4, $$1.b));
      }

      $$0.w().a("StoredEnchantments", $$2);
   }

   public static ciw a(cng $$0) {
      ciw $$1 = new ciw(ciz.tC);
      a($$1, $$0);
      return $$1;
   }
}
