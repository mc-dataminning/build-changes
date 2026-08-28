import it.unimi.dsi.fastutil.ints.IntList;

public class fkg {
   private static final int a = -1;
   private final jv<fkf> b = new jv<>(32);

   public static fkg a(fkc $$0) {
      fkg $$1 = new fkg();
      $$1.a(($$0x, $$1x) -> $$1x > 0 ? -1 : cyj.a($$0x, -6265536), cwb.pz, cwb.pA, cwb.pB, cwb.pC, cwb.uL);
      $$1.a(($$0x, $$1x) -> $$1x != 1 ? -1 : cyj.a($$0x, 0), cwb.os);
      $$1.a(($$0x, $$1x) -> det.a(0.5, 1.0), dia.iH, dia.iI);
      $$1.a(($$0x, $$1x) -> {
         if ($$1x != 1) {
            return -1;
         } else {
            cyk $$2x = $$0x.a(kt.ad);
            IntList $$3 = $$2x != null ? $$2x.b() : IntList.of();
            int $$4 = $$3.size();
            if ($$4 == 0) {
               return -7697782;
            } else if ($$4 == 1) {
               return axu.f($$3.getInt(0));
            } else {
               int $$5 = 0;
               int $$6 = 0;
               int $$7 = 0;

               for (int $$8 = 0; $$8 < $$4; $$8++) {
                  int $$9 = $$3.getInt($$8);
                  $$5 += axu.b($$9);
                  $$6 += axu.c($$9);
                  $$7 += axu.d($$9);
               }

               return axu.a($$5 / $$4, $$6 / $$4, $$7 / $$4);
            }
         }
      }, cwb.ux);
      $$1.a(($$0x, $$1x) -> $$1x > 0 ? -1 : axu.f($$0x.a(kt.P, cxw.a).b()), cwb.sm, cwb.vq, cwb.vt, cwb.vs);

      for (cxg $$2 : cxg.c()) {
         $$1.a(($$1x, $$2x) -> axu.f($$2.a($$2x)), $$2);
      }

      $$1.a(($$1x, $$2x) -> {
         dvd $$3 = ((cuc)$$1x.h()).d().m();
         return $$0.a($$3, null, null, $$2x);
      }, dia.i, dia.bt, dia.bu, dia.ff, dia.aE, dia.aF, dia.aG, dia.aH, dia.aI, dia.aK, dia.fm);
      $$1.a(($$0x, $$1x) -> dep.d(), dia.aL);
      $$1.a(($$0x, $$1x) -> $$1x == 0 ? -1 : axu.f($$0x.a(kt.J, cyr.c).a()), cwb.rV);
      return $$1;
   }

   public int a(cvx $$0, int $$1) {
      fkf $$2 = this.b.a(lx.g.a($$0.h()));
      return $$2 == null ? -1 : $$2.getColor($$0, $$1);
   }

   public void a(fkf $$0, deu... $$1) {
      for (deu $$2 : $$1) {
         this.b.a($$0, cvt.a($$2.j()));
      }
   }
}
