import java.util.List;
import javax.annotation.Nullable;

public class cjf extends cke {
   public static final String a = "StoredEnchantments";

   public cjf(cke.a $$0) {
      super($$0);
   }

   @Override
   public boolean i(ckj $$0) {
      return true;
   }

   @Override
   public boolean d_(ckj $$0) {
      return false;
   }

   public static rz d(ckj $$0) {
      rt $$1 = $$0.v();
      return $$1 != null ? $$1.c("StoredEnchantments", 10) : new rz();
   }

   @Override
   public void a(ckj $$0, @Nullable cqz $$1, List<ui> $$2, cma $$3) {
      super.a($$0, $$1, $$2, $$3);
      ckj.a($$2, d($$0));
   }

   public static void a(ckj $$0, cow $$1) {
      rz $$2 = d($$0);
      boolean $$3 = true;
      afw $$4 = cov.a($$1.a);

      for (int $$5 = 0; $$5 < $$2.size(); $$5++) {
         rt $$6 = $$2.a($$5);
         afw $$7 = cov.b($$6);
         if ($$7 != null && $$7.equals($$4)) {
            if (cov.a($$6) < $$1.b) {
               cov.a($$6, $$1.b);
            }

            $$3 = false;
            break;
         }
      }

      if ($$3) {
         $$2.add(cov.a($$4, $$1.b));
      }

      $$0.w().a("StoredEnchantments", $$2);
   }

   public static ckj a(cow $$0) {
      ckj $$1 = new ckj(ckm.tC);
      a($$1, $$0);
      return $$1;
   }
}
