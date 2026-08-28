import java.util.ArrayList;
import java.util.List;

public class daa extends czy {
   private static final dad a = dad.a(cvt.qP);
   private static final dad b = dad.a(cvt.pv);
   private static final dad c = dad.a(cvt.ux);

   public daa(czv $$0) {
      super($$0);
   }

   public boolean a(czw $$0, deg $$1) {
      boolean $$2 = false;
      int $$3 = 0;

      for (int $$4 = 0; $$4 < $$0.a(); $$4++) {
         cvp $$5 = $$0.a($$4);
         if (!$$5.f()) {
            if (a.a($$5)) {
               if ($$2) {
                  return false;
               }

               $$2 = true;
            } else if (b.a($$5)) {
               if (++$$3 > 3) {
                  return false;
               }
            } else if (!c.a($$5)) {
               return false;
            }
         }
      }

      return $$2 && $$3 >= 1;
   }

   public cvp a(czw $$0, jp.a $$1) {
      List<cyi> $$2 = new ArrayList<>();
      int $$3 = 0;

      for (int $$4 = 0; $$4 < $$0.a(); $$4++) {
         cvp $$5 = $$0.a($$4);
         if (!$$5.f()) {
            if (b.a($$5)) {
               $$3++;
            } else if (c.a($$5)) {
               cyi $$6 = $$5.a(kr.Z);
               if ($$6 != null) {
                  $$2.add($$6);
               }
            }
         }
      }

      cvp $$7 = new cvp(cvt.uw, 3);
      $$7.b(kr.aa, new cyj($$3, $$2));
      return $$7;
   }

   @Override
   public boolean a(int $$0, int $$1) {
      return $$0 * $$1 >= 2;
   }

   @Override
   public cvp a(jp.a $$0) {
      return new cvp(cvt.uw);
   }

   @Override
   public dam<?> aq_() {
      return dam.g;
   }
}
