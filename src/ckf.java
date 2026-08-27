import java.util.List;
import javax.annotation.Nullable;

public class ckf extends cle {
   public static final String a = "StoredEnchantments";

   public ckf(cle.a $$0) {
      super($$0);
   }

   @Override
   public boolean i(clj $$0) {
      return true;
   }

   @Override
   public boolean d_(clj $$0) {
      return false;
   }

   public static sf d(clj $$0) {
      rz $$1 = $$0.v();
      return $$1 != null ? $$1.c("StoredEnchantments", 10) : new sf();
   }

   @Override
   public void a(clj $$0, @Nullable csa $$1, List<ur> $$2, cna $$3) {
      super.a($$0, $$1, $$2, $$3);
      clj.a($$2, d($$0));
   }

   public static void a(clj $$0, cpx $$1) {
      sf $$2 = d($$0);
      boolean $$3 = true;
      agi $$4 = cpw.a($$1.a);

      for (int $$5 = 0; $$5 < $$2.size(); $$5++) {
         rz $$6 = $$2.a($$5);
         agi $$7 = cpw.b($$6);
         if ($$7 != null && $$7.equals($$4)) {
            if (cpw.a($$6) < $$1.b) {
               cpw.a($$6, $$1.b);
            }

            $$3 = false;
            break;
         }
      }

      if ($$3) {
         $$2.add(cpw.a($$4, $$1.b));
      }

      $$0.w().a("StoredEnchantments", $$2);
   }

   public static clj a(cpx $$0) {
      clj $$1 = new clj(clm.uo);
      a($$1, $$0);
      return $$1;
   }
}
