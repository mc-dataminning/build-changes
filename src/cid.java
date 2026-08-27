import java.util.List;
import javax.annotation.Nullable;

public class cid extends cjc {
   public static final String a = "StoredEnchantments";

   public cid(cjc.a $$0) {
      super($$0);
   }

   @Override
   public boolean i(cjh $$0) {
      return true;
   }

   @Override
   public boolean d_(cjh $$0) {
      return false;
   }

   public static re d(cjh $$0) {
      qy $$1 = $$0.v();
      return $$1 != null ? $$1.c("StoredEnchantments", 10) : new re();
   }

   @Override
   public void a(cjh $$0, @Nullable cpx $$1, List<tn> $$2, cky $$3) {
      super.a($$0, $$1, $$2, $$3);
      cjh.a($$2, d($$0));
   }

   public static void a(cjh $$0, cnt $$1) {
      re $$2 = d($$0);
      boolean $$3 = true;
      aey $$4 = cns.a($$1.a);

      for (int $$5 = 0; $$5 < $$2.size(); $$5++) {
         qy $$6 = $$2.a($$5);
         aey $$7 = cns.b($$6);
         if ($$7 != null && $$7.equals($$4)) {
            if (cns.a($$6) < $$1.b) {
               cns.a($$6, $$1.b);
            }

            $$3 = false;
            break;
         }
      }

      if ($$3) {
         $$2.add(cns.a($$4, $$1.b));
      }

      $$0.w().a("StoredEnchantments", $$2);
   }

   public static cjh a(cnt $$0) {
      cjh $$1 = new cjh(cjk.tC);
      a($$1, $$0);
      return $$1;
   }
}
