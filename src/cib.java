import java.util.List;
import javax.annotation.Nullable;

public class cib extends cja {
   public static final String a = "StoredEnchantments";

   public cib(cja.a $$0) {
      super($$0);
   }

   @Override
   public boolean i(cjf $$0) {
      return true;
   }

   @Override
   public boolean d_(cjf $$0) {
      return false;
   }

   public static re d(cjf $$0) {
      qy $$1 = $$0.v();
      return $$1 != null ? $$1.c("StoredEnchantments", 10) : new re();
   }

   @Override
   public void a(cjf $$0, @Nullable cpv $$1, List<tm> $$2, ckw $$3) {
      super.a($$0, $$1, $$2, $$3);
      cjf.a($$2, d($$0));
   }

   public static void a(cjf $$0, cnr $$1) {
      re $$2 = d($$0);
      boolean $$3 = true;
      aex $$4 = cnq.a($$1.a);

      for (int $$5 = 0; $$5 < $$2.size(); $$5++) {
         qy $$6 = $$2.a($$5);
         aex $$7 = cnq.b($$6);
         if ($$7 != null && $$7.equals($$4)) {
            if (cnq.a($$6) < $$1.b) {
               cnq.a($$6, $$1.b);
            }

            $$3 = false;
            break;
         }
      }

      if ($$3) {
         $$2.add(cnq.a($$4, $$1.b));
      }

      $$0.w().a("StoredEnchantments", $$2);
   }

   public static cjf a(cnr $$0) {
      cjf $$1 = new cjf(cji.tC);
      a($$1, $$0);
      return $$1;
   }
}
