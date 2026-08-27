import java.util.List;
import javax.annotation.Nullable;

public class cjx extends ckw {
   public static final String a = "StoredEnchantments";

   public cjx(ckw.a $$0) {
      super($$0);
   }

   @Override
   public boolean i(clb $$0) {
      return true;
   }

   @Override
   public boolean d_(clb $$0) {
      return false;
   }

   public static sf d(clb $$0) {
      rz $$1 = $$0.v();
      return $$1 != null ? $$1.c("StoredEnchantments", 10) : new sf();
   }

   @Override
   public void a(clb $$0, @Nullable crs $$1, List<ur> $$2, cms $$3) {
      super.a($$0, $$1, $$2, $$3);
      clb.a($$2, d($$0));
   }

   public static void a(clb $$0, cpp $$1) {
      sf $$2 = d($$0);
      boolean $$3 = true;
      agg $$4 = cpo.a($$1.a);

      for (int $$5 = 0; $$5 < $$2.size(); $$5++) {
         rz $$6 = $$2.a($$5);
         agg $$7 = cpo.b($$6);
         if ($$7 != null && $$7.equals($$4)) {
            if (cpo.a($$6) < $$1.b) {
               cpo.a($$6, $$1.b);
            }

            $$3 = false;
            break;
         }
      }

      if ($$3) {
         $$2.add(cpo.a($$4, $$1.b));
      }

      $$0.w().a("StoredEnchantments", $$2);
   }

   public static clb a(cpp $$0) {
      clb $$1 = new clb(cle.tD);
      a($$1, $$0);
      return $$1;
   }
}
