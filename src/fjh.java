import it.unimi.dsi.fastutil.ints.IntList;

public class fjh {
   private static final int a = -1;
   private final jt<fjg> b = new jt<>(32);

   public static fjh a(fjd $$0) {
      fjh $$1 = new fjh();
      $$1.a(($$0x, $$1x) -> $$1x > 0 ? -1 : cyd.a($$0x, -6265536), cvo.pz, cvo.pA, cvo.pB, cvo.pC, cvo.uL);
      $$1.a(($$0x, $$1x) -> $$1x != 1 ? -1 : cyd.a($$0x, 0), cvo.os);
      $$1.a(($$0x, $$1x) -> ddq.a(0.5, 1.0), dgx.iH, dgx.iI);
      $$1.a(($$0x, $$1x) -> {
         if ($$1x != 1) {
            return -1;
         } else {
            cye $$2x = $$0x.a(kr.W);
            IntList $$3 = $$2x != null ? $$2x.b() : IntList.of();
            int $$4 = $$3.size();
            if ($$4 == 0) {
               return -7697782;
            } else if ($$4 == 1) {
               return axn.f($$3.getInt(0));
            } else {
               int $$5 = 0;
               int $$6 = 0;
               int $$7 = 0;

               for (int $$8 = 0; $$8 < $$4; $$8++) {
                  int $$9 = $$3.getInt($$8);
                  $$5 += axn.b($$9);
                  $$6 += axn.c($$9);
                  $$7 += axn.d($$9);
               }

               return axn.a($$5 / $$4, $$6 / $$4, $$7 / $$4);
            }
         }
      }, cvo.ux);
      $$1.a(($$0x, $$1x) -> $$1x > 0 ? -1 : axn.f($$0x.a(kr.I, cxn.a).b()), cvo.sl, cvo.vq, cvo.vt, cvo.vs);

      for (cwv $$2 : cwv.h()) {
         $$1.a(($$1x, $$2x) -> axn.f($$2.a($$2x)), $$2);
      }

      $$1.a(($$1x, $$2x) -> {
         dua $$3 = ((ctl)$$1x.h()).d().o();
         return $$0.a($$3, null, null, $$2x);
      }, dgx.i, dgx.bt, dgx.bu, dgx.ff, dgx.aE, dgx.aF, dgx.aG, dgx.aH, dgx.aI, dgx.aK, dgx.fm);
      $$1.a(($$0x, $$1x) -> ddm.d(), dgx.aL);
      $$1.a(($$0x, $$1x) -> $$1x == 0 ? -1 : axn.f($$0x.a(kr.C, cyl.c).a()), cvo.rV);
      return $$1;
   }

   public int a(cvl $$0, int $$1) {
      fjg $$2 = this.b.a(lu.g.a($$0.h()));
      return $$2 == null ? -1 : $$2.getColor($$0, $$1);
   }

   public void a(fjg $$0, ddr... $$1) {
      for (ddr $$2 : $$1) {
         this.b.a($$0, cvg.a($$2.r()));
      }
   }
}
