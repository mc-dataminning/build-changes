import java.util.List;
import javax.annotation.Nullable;

public class cln extends cmm {
   public static final String a = "StoredEnchantments";

   public cln(cmm.a $$0) {
      super($$0);
   }

   @Override
   public boolean i(cmr $$0) {
      return true;
   }

   @Override
   public boolean d_(cmr $$0) {
      return false;
   }

   public static sr d(cmr $$0) {
      sl $$1 = $$0.v();
      return $$1 != null ? $$1.c("StoredEnchantments", 10) : new sr();
   }

   @Override
   public void a(cmr $$0, @Nullable cti $$1, List<vd> $$2, coi $$3) {
      super.a($$0, $$1, $$2, $$3);
      cmr.a($$2, d($$0));
   }

   public static void a(cmr $$0, crf $$1) {
      sr $$2 = d($$0);
      boolean $$3 = true;
      ahd $$4 = cre.a($$1.a);

      for (int $$5 = 0; $$5 < $$2.size(); $$5++) {
         sl $$6 = $$2.a($$5);
         ahd $$7 = cre.b($$6);
         if ($$7 != null && $$7.equals($$4)) {
            if (cre.a($$6) < $$1.b) {
               cre.a($$6, $$1.b);
            }

            $$3 = false;
            break;
         }
      }

      if ($$3) {
         $$2.add(cre.a($$4, $$1.b));
      }

      $$0.w().a("StoredEnchantments", $$2);
   }

   public static cmr a(crf $$0) {
      cmr $$1 = new cmr(cmu.up);
      a($$1, $$0);
      return $$1;
   }
}
