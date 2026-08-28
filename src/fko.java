import it.unimi.dsi.fastutil.ints.IntList;

public class fko {
   private static final int a = -1;
   private final jw<fkn> b = new jw<>(32);

   public static fko a(fkk $$0) {
      fko $$1 = new fko();
      $$1.a(($$0x, $$1x) -> $$1x > 0 ? -1 : cyp.a($$0x, -6265536), cwf.pz, cwf.pA, cwf.pB, cwf.pC, cwf.uL);
      $$1.a(($$0x, $$1x) -> $$1x != 1 ? -1 : cyp.a($$0x, 0), cwf.os);
      $$1.a(($$0x, $$1x) -> dez.a(0.5, 1.0), dig.iH, dig.iI);
      $$1.a(($$0x, $$1x) -> {
         if ($$1x != 1) {
            return -1;
         } else {
            cyq $$2x = $$0x.a(ku.ae);
            IntList $$3 = $$2x != null ? $$2x.b() : IntList.of();
            int $$4 = $$3.size();
            if ($$4 == 0) {
               return -7697782;
            } else if ($$4 == 1) {
               return axv.f($$3.getInt(0));
            } else {
               int $$5 = 0;
               int $$6 = 0;
               int $$7 = 0;

               for (int $$8 = 0; $$8 < $$4; $$8++) {
                  int $$9 = $$3.getInt($$8);
                  $$5 += axv.b($$9);
                  $$6 += axv.c($$9);
                  $$7 += axv.d($$9);
               }

               return axv.a($$5 / $$4, $$6 / $$4, $$7 / $$4);
            }
         }
      }, cwf.ux);
      $$1.a(($$0x, $$1x) -> $$1x > 0 ? -1 : axv.f($$0x.a(ku.Q, cya.a).b()), cwf.sm, cwf.vq, cwf.vt, cwf.vs);

      for (cxk $$2 : cxk.b()) {
         $$1.a(($$1x, $$2x) -> axv.f($$2.a($$2x)), $$2);
      }

      $$1.a(($$1x, $$2x) -> {
         dvj $$3 = ((cuh)$$1x.h()).d().m();
         return $$0.a($$3, null, null, $$2x);
      }, dig.i, dig.bt, dig.bu, dig.ff, dig.aE, dig.aF, dig.aG, dig.aH, dig.aI, dig.aK, dig.fm);
      $$1.a(($$0x, $$1x) -> dev.d(), dig.aL);
      $$1.a(($$0x, $$1x) -> $$1x == 0 ? -1 : axv.f($$0x.a(ku.K, cyx.c).a()), cwf.rV);
      return $$1;
   }

   public int a(cwb $$0, int $$1) {
      fkn $$2 = this.b.a(ly.g.a($$0.h()));
      return $$2 == null ? -1 : $$2.getColor($$0, $$1);
   }

   public void a(fkn $$0, dfa... $$1) {
      for (dfa $$2 : $$1) {
         this.b.a($$0, cvx.a($$2.j()));
      }
   }
}
