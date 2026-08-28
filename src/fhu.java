import it.unimi.dsi.fastutil.ints.IntList;

public class fhu {
   private static final int a = -1;
   private final js<fht> b = new js<>(32);

   public static fhu a(fhq $$0) {
      fhu $$1 = new fhu();
      $$1.a(($$0x, $$1x) -> $$1x > 0 ? -1 : cxk.a($$0x, -6265536), cut.py, cut.pz, cut.pA, cut.pB, cut.uJ);
      $$1.a(($$0x, $$1x) -> $$1x != 1 ? -1 : cxk.a($$0x, 0), cut.or);
      $$1.a(($$0x, $$1x) -> dcu.a(0.5, 1.0), dga.iH, dga.iI);
      $$1.a(($$0x, $$1x) -> {
         if ($$1x != 1) {
            return -1;
         } else {
            cxl $$2x = $$0x.a(kq.U);
            IntList $$3 = $$2x != null ? $$2x.b() : IntList.of();
            int $$4 = $$3.size();
            if ($$4 == 0) {
               return -7697782;
            } else if ($$4 == 1) {
               return axy.b.e($$3.getInt(0));
            } else {
               int $$5 = 0;
               int $$6 = 0;
               int $$7 = 0;

               for (int $$8 = 0; $$8 < $$4; $$8++) {
                  int $$9 = $$3.getInt($$8);
                  $$5 += axy.b.b($$9);
                  $$6 += axy.b.c($$9);
                  $$7 += axy.b.d($$9);
               }

               return axy.b.a($$5 / $$4, $$6 / $$4, $$7 / $$4);
            }
         }
      }, cut.uv);
      $$1.a(($$0x, $$1x) -> $$1x > 0 ? -1 : axy.b.e($$0x.a(kq.G, cwu.a).b()), cut.sk, cut.vo, cut.vr, cut.vq);

      for (cwa $$2 : cwa.h()) {
         $$1.a(($$1x, $$2x) -> axy.b.e($$2.a($$2x)), $$2);
      }

      $$1.a(($$1x, $$2x) -> {
         dtc $$3 = ((cso)$$1x.g()).d().o();
         return $$0.a($$3, null, null, $$2x);
      }, dga.i, dga.bt, dga.bu, dga.ff, dga.aE, dga.aF, dga.aG, dga.aH, dga.aI, dga.aK, dga.fm);
      $$1.a(($$0x, $$1x) -> dcq.d(), dga.aL);
      $$1.a(($$0x, $$1x) -> $$1x == 0 ? -1 : axy.b.e($$0x.a(kq.A, cxs.c).a()), cut.rU);
      return $$1;
   }

   public int a(cuq $$0, int $$1) {
      fht $$2 = this.b.a(lt.g.a($$0.g()));
      return $$2 == null ? -1 : $$2.getColor($$0, $$1);
   }

   public void a(fht $$0, dcv... $$1) {
      for (dcv $$2 : $$1) {
         this.b.a($$0, cul.a($$2.r()));
      }
   }
}
