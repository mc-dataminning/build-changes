import java.util.ArrayList;
import java.util.List;

public class dac extends daa {
   private static final daf a = daf.a(cwb.qP);
   private static final daf b = daf.a(cwb.pv);
   private static final daf c = daf.a(cwb.ux);

   public dac(czx $$0) {
      super($$0);
   }

   public boolean a(czy $$0, dev $$1) {
      boolean $$2 = false;
      int $$3 = 0;

      for (int $$4 = 0; $$4 < $$0.a(); $$4++) {
         cvx $$5 = $$0.a($$4);
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

   public cvx a(czy $$0, jr.a $$1) {
      List<cyk> $$2 = new ArrayList<>();
      int $$3 = 0;

      for (int $$4 = 0; $$4 < $$0.a(); $$4++) {
         cvx $$5 = $$0.a($$4);
         if (!$$5.f()) {
            if (b.a($$5)) {
               $$3++;
            } else if (c.a($$5)) {
               cyk $$6 = $$5.a(kt.ad);
               if ($$6 != null) {
                  $$2.add($$6);
               }
            }
         }
      }

      cvx $$7 = new cvx(cwb.uw, 3);
      $$7.b(kt.ae, new cyl($$3, $$2));
      return $$7;
   }

   @Override
   public boolean a(int $$0, int $$1) {
      return $$0 * $$1 >= 2;
   }

   @Override
   public cvx a(jr.a $$0) {
      return new cvx(cwb.uw);
   }

   @Override
   public dao<?> ar_() {
      return dao.g;
   }
}
