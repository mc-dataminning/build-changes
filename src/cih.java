import java.util.List;
import javax.annotation.Nullable;

public class cih extends cjg {
   public static final String a = "StoredEnchantments";

   public cih(cjg.a $$0) {
      super($$0);
   }

   @Override
   public boolean i(cjl $$0) {
      return true;
   }

   @Override
   public boolean d_(cjl $$0) {
      return false;
   }

   public static rc d(cjl $$0) {
      qw $$1 = $$0.v();
      return $$1 != null ? $$1.c("StoredEnchantments", 10) : new rc();
   }

   @Override
   public void a(cjl $$0, @Nullable cqb $$1, List<tl> $$2, clc $$3) {
      super.a($$0, $$1, $$2, $$3);
      cjl.a($$2, d($$0));
   }

   public static void a(cjl $$0, cnx $$1) {
      rc $$2 = d($$0);
      boolean $$3 = true;
      aez $$4 = cnw.a($$1.a);

      for (int $$5 = 0; $$5 < $$2.size(); $$5++) {
         qw $$6 = $$2.a($$5);
         aez $$7 = cnw.b($$6);
         if ($$7 != null && $$7.equals($$4)) {
            if (cnw.a($$6) < $$1.b) {
               cnw.a($$6, $$1.b);
            }

            $$3 = false;
            break;
         }
      }

      if ($$3) {
         $$2.add(cnw.a($$4, $$1.b));
      }

      $$0.w().a("StoredEnchantments", $$2);
   }

   public static cjl a(cnx $$0) {
      cjl $$1 = new cjl(cjo.tC);
      a($$1, $$0);
      return $$1;
   }
}
