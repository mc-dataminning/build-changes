import java.util.List;
import javax.annotation.Nullable;

public class ckk extends clj {
   public static final String a = "StoredEnchantments";

   public ckk(clj.a $$0) {
      super($$0);
   }

   @Override
   public boolean i(clo $$0) {
      return true;
   }

   @Override
   public boolean d_(clo $$0) {
      return false;
   }

   public static sj d(clo $$0) {
      sd $$1 = $$0.v();
      return $$1 != null ? $$1.c("StoredEnchantments", 10) : new sj();
   }

   @Override
   public void a(clo $$0, @Nullable csf $$1, List<uv> $$2, cnf $$3) {
      super.a($$0, $$1, $$2, $$3);
      clo.a($$2, d($$0));
   }

   public static void a(clo $$0, cqc $$1) {
      sj $$2 = d($$0);
      boolean $$3 = true;
      agm $$4 = cqb.a($$1.a);

      for (int $$5 = 0; $$5 < $$2.size(); $$5++) {
         sd $$6 = $$2.a($$5);
         agm $$7 = cqb.b($$6);
         if ($$7 != null && $$7.equals($$4)) {
            if (cqb.a($$6) < $$1.b) {
               cqb.a($$6, $$1.b);
            }

            $$3 = false;
            break;
         }
      }

      if ($$3) {
         $$2.add(cqb.a($$4, $$1.b));
      }

      $$0.w().a("StoredEnchantments", $$2);
   }

   public static clo a(cqc $$0) {
      clo $$1 = new clo(clr.uo);
      a($$1, $$0);
      return $$1;
   }
}
