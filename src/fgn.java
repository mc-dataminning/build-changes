import it.unimi.dsi.fastutil.ints.IntList;

public class fgn {
   private static final int a = -1;
   private final jo<fgm> b = new jo<>(32);

   public static fgn a(fgj $$0) {
      fgn $$1 = new fgn();
      $$1.a(($$0x, $$1x) -> $$1x > 0 ? -1 : cxi.a($$0x, -6265536), cut.py, cut.pz, cut.pA, cut.pB, cut.uJ);
      $$1.a(($$0x, $$1x) -> $$1x != 1 ? -1 : cxi.a($$0x, 0), cut.or);
      $$1.a(($$0x, $$1x) -> dbx.a(0.5, 1.0), dfc.iH, dfc.iI);
      $$1.a(($$0x, $$1x) -> {
         if ($$1x != 1) {
            return -1;
         } else {
            cxj $$2x = $$0x.a(km.T);
            IntList $$3 = $$2x != null ? $$2x.b() : IntList.of();
            int $$4 = $$3.size();
            if ($$4 == 0) {
               return -7697782;
            } else if ($$4 == 1) {
               return ayj.b.e($$3.getInt(0));
            } else {
               int $$5 = 0;
               int $$6 = 0;
               int $$7 = 0;

               for (int $$8 = 0; $$8 < $$4; $$8++) {
                  int $$9 = $$3.getInt($$8);
                  $$5 += ayj.b.b($$9);
                  $$6 += ayj.b.c($$9);
                  $$7 += ayj.b.d($$9);
               }

               return ayj.b.a($$5 / $$4, $$6 / $$4, $$7 / $$4);
            }
         }
      }, cut.uv);
      $$1.a(($$0x, $$1x) -> $$1x > 0 ? -1 : ayj.b.e($$0x.a(km.G, cwr.a).b()), cut.sk, cut.vo, cut.vr, cut.vq);

      for (cvx $$2 : cvx.h()) {
         $$1.a(($$1x, $$2x) -> ayj.b.e($$2.a($$2x)), $$2);
      }

      $$1.a(($$1x, $$2x) -> {
         dsd $$3 = ((cso)$$1x.g()).d().o();
         return $$0.a($$3, null, null, $$2x);
      }, dfc.i, dfc.bt, dfc.bu, dfc.ff, dfc.aE, dfc.aF, dfc.aG, dfc.aH, dfc.aI, dfc.aK, dfc.fm);
      $$1.a(($$0x, $$1x) -> dbt.d(), dfc.aL);
      $$1.a(($$0x, $$1x) -> $$1x == 0 ? -1 : ayj.b.e($$0x.a(km.A, cxq.c).a()), cut.rU);
      return $$1;
   }

   public int a(cuq $$0, int $$1) {
      fgm $$2 = this.b.a(lp.h.a($$0.g()));
      return $$2 == null ? -1 : $$2.getColor($$0, $$1);
   }

   public void a(fgm $$0, dby... $$1) {
      for (dby $$2 : $$1) {
         this.b.a($$0, cul.a($$2.r()));
      }
   }
}
