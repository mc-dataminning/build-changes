import it.unimi.dsi.fastutil.ints.IntList;

public class fgh {
   private static final int a = -1;
   private final jo<fgg> b = new jo<>(32);

   public static fgh a(fgd $$0) {
      fgh $$1 = new fgh();
      $$1.a(($$0x, $$1x) -> $$1x > 0 ? -1 : cxc.a($$0x, -6265536), cun.py, cun.pz, cun.pA, cun.pB, cun.uJ);
      $$1.a(($$0x, $$1x) -> $$1x != 1 ? -1 : cxc.a($$0x, 0), cun.or);
      $$1.a(($$0x, $$1x) -> dbr.a(0.5, 1.0), dew.iH, dew.iI);
      $$1.a(($$0x, $$1x) -> {
         if ($$1x != 1) {
            return -1;
         } else {
            cxd $$2x = $$0x.a(km.S);
            IntList $$3 = $$2x != null ? $$2x.b() : IntList.of();
            int $$4 = $$3.size();
            if ($$4 == 0) {
               return -7697782;
            } else if ($$4 == 1) {
               return aye.b.e($$3.getInt(0));
            } else {
               int $$5 = 0;
               int $$6 = 0;
               int $$7 = 0;

               for (int $$8 = 0; $$8 < $$4; $$8++) {
                  int $$9 = $$3.getInt($$8);
                  $$5 += aye.b.b($$9);
                  $$6 += aye.b.c($$9);
                  $$7 += aye.b.d($$9);
               }

               return aye.b.a($$5 / $$4, $$6 / $$4, $$7 / $$4);
            }
         }
      }, cun.uv);
      $$1.a(($$0x, $$1x) -> $$1x > 0 ? -1 : aye.b.e($$0x.a(km.F, cwl.a).b()), cun.sk, cun.vo, cun.vr, cun.vq);

      for (cvr $$2 : cvr.h()) {
         $$1.a(($$1x, $$2x) -> aye.b.e($$2.a($$2x)), $$2);
      }

      $$1.a(($$1x, $$2x) -> {
         drx $$3 = ((csi)$$1x.g()).d().n();
         return $$0.a($$3, null, null, $$2x);
      }, dew.i, dew.bt, dew.bu, dew.ff, dew.aE, dew.aF, dew.aG, dew.aH, dew.aI, dew.aK, dew.fm);
      $$1.a(($$0x, $$1x) -> dbn.d(), dew.aL);
      $$1.a(($$0x, $$1x) -> $$1x == 0 ? -1 : aye.b.e($$0x.a(km.z, cxk.c).a()), cun.rU);
      return $$1;
   }

   public int a(cuk $$0, int $$1) {
      fgg $$2 = this.b.a(lp.h.a($$0.g()));
      return $$2 == null ? -1 : $$2.getColor($$0, $$1);
   }

   public void a(fgg $$0, dbs... $$1) {
      for (dbs $$2 : $$1) {
         this.b.a($$0, cuf.a($$2.r()));
      }
   }
}
