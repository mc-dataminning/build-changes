import it.unimi.dsi.fastutil.ints.IntList;

public class fgm {
   private static final int a = -1;
   private final jo<fgl> b = new jo<>(32);

   public static fgm a(fgi $$0) {
      fgm $$1 = new fgm();
      $$1.a(($$0x, $$1x) -> $$1x > 0 ? -1 : cxh.a($$0x, -6265536), cus.py, cus.pz, cus.pA, cus.pB, cus.uJ);
      $$1.a(($$0x, $$1x) -> $$1x != 1 ? -1 : cxh.a($$0x, 0), cus.or);
      $$1.a(($$0x, $$1x) -> dbw.a(0.5, 1.0), dfb.iH, dfb.iI);
      $$1.a(($$0x, $$1x) -> {
         if ($$1x != 1) {
            return -1;
         } else {
            cxi $$2x = $$0x.a(km.T);
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
      }, cus.uv);
      $$1.a(($$0x, $$1x) -> $$1x > 0 ? -1 : ayj.b.e($$0x.a(km.G, cwq.a).b()), cus.sk, cus.vo, cus.vr, cus.vq);

      for (cvw $$2 : cvw.h()) {
         $$1.a(($$1x, $$2x) -> ayj.b.e($$2.a($$2x)), $$2);
      }

      $$1.a(($$1x, $$2x) -> {
         dsc $$3 = ((csn)$$1x.g()).d().o();
         return $$0.a($$3, null, null, $$2x);
      }, dfb.i, dfb.bt, dfb.bu, dfb.ff, dfb.aE, dfb.aF, dfb.aG, dfb.aH, dfb.aI, dfb.aK, dfb.fm);
      $$1.a(($$0x, $$1x) -> dbs.d(), dfb.aL);
      $$1.a(($$0x, $$1x) -> $$1x == 0 ? -1 : ayj.b.e($$0x.a(km.A, cxp.c).a()), cus.rU);
      return $$1;
   }

   public int a(cup $$0, int $$1) {
      fgl $$2 = this.b.a(lp.h.a($$0.g()));
      return $$2 == null ? -1 : $$2.getColor($$0, $$1);
   }

   public void a(fgl $$0, dbx... $$1) {
      for (dbx $$2 : $$1) {
         this.b.a($$0, cuk.a($$2.r()));
      }
   }
}
