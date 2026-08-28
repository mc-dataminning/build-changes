import it.unimi.dsi.fastutil.ints.IntList;

public class fjr {
   private static final int a = -1;
   private final jt<fjq> b = new jt<>(32);

   public static fjr a(fjn $$0) {
      fjr $$1 = new fjr();
      $$1.a(($$0x, $$1x) -> $$1x > 0 ? -1 : cyh.a($$0x, -6265536), cvt.pz, cvt.pA, cvt.pB, cvt.pC, cvt.uL);
      $$1.a(($$0x, $$1x) -> $$1x != 1 ? -1 : cyh.a($$0x, 0), cvt.os);
      $$1.a(($$0x, $$1x) -> dee.a(0.5, 1.0), dhl.iH, dhl.iI);
      $$1.a(($$0x, $$1x) -> {
         if ($$1x != 1) {
            return -1;
         } else {
            cyi $$2x = $$0x.a(kr.Z);
            IntList $$3 = $$2x != null ? $$2x.b() : IntList.of();
            int $$4 = $$3.size();
            if ($$4 == 0) {
               return -7697782;
            } else if ($$4 == 1) {
               return axo.f($$3.getInt(0));
            } else {
               int $$5 = 0;
               int $$6 = 0;
               int $$7 = 0;

               for (int $$8 = 0; $$8 < $$4; $$8++) {
                  int $$9 = $$3.getInt($$8);
                  $$5 += axo.b($$9);
                  $$6 += axo.c($$9);
                  $$7 += axo.d($$9);
               }

               return axo.a($$5 / $$4, $$6 / $$4, $$7 / $$4);
            }
         }
      }, cvt.ux);
      $$1.a(($$0x, $$1x) -> $$1x > 0 ? -1 : axo.f($$0x.a(kr.L, cxo.a).b()), cvt.sm, cvt.vq, cvt.vt, cvt.vs);

      for (cwy $$2 : cwy.c()) {
         $$1.a(($$1x, $$2x) -> axo.f($$2.a($$2x)), $$2);
      }

      $$1.a(($$1x, $$2x) -> {
         duo $$3 = ((ctr)$$1x.h()).d().o();
         return $$0.a($$3, null, null, $$2x);
      }, dhl.i, dhl.bt, dhl.bu, dhl.ff, dhl.aE, dhl.aF, dhl.aG, dhl.aH, dhl.aI, dhl.aK, dhl.fm);
      $$1.a(($$0x, $$1x) -> dea.d(), dhl.aL);
      $$1.a(($$0x, $$1x) -> $$1x == 0 ? -1 : axo.f($$0x.a(kr.F, cyp.c).a()), cvt.rV);
      return $$1;
   }

   public int a(cvp $$0, int $$1) {
      fjq $$2 = this.b.a(lu.g.a($$0.h()));
      return $$2 == null ? -1 : $$2.getColor($$0, $$1);
   }

   public void a(fjq $$0, def... $$1) {
      for (def $$2 : $$1) {
         this.b.a($$0, cvk.a($$2.q()));
      }
   }
}
