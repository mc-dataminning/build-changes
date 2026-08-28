import it.unimi.dsi.fastutil.ints.IntList;

public class fho {
   private static final int a = -1;
   private final js<fhn> b = new js<>(32);

   public static fho a(fhk $$0) {
      fho $$1 = new fho();
      $$1.a(($$0x, $$1x) -> $$1x > 0 ? -1 : cxi.a($$0x, -6265536), cur.py, cur.pz, cur.pA, cur.pB, cur.uJ);
      $$1.a(($$0x, $$1x) -> $$1x != 1 ? -1 : cxi.a($$0x, 0), cur.or);
      $$1.a(($$0x, $$1x) -> dcs.a(0.5, 1.0), dfy.iH, dfy.iI);
      $$1.a(($$0x, $$1x) -> {
         if ($$1x != 1) {
            return -1;
         } else {
            cxj $$2x = $$0x.a(kq.U);
            IntList $$3 = $$2x != null ? $$2x.b() : IntList.of();
            int $$4 = $$3.size();
            if ($$4 == 0) {
               return -7697782;
            } else if ($$4 == 1) {
               return axx.b.e($$3.getInt(0));
            } else {
               int $$5 = 0;
               int $$6 = 0;
               int $$7 = 0;

               for (int $$8 = 0; $$8 < $$4; $$8++) {
                  int $$9 = $$3.getInt($$8);
                  $$5 += axx.b.b($$9);
                  $$6 += axx.b.c($$9);
                  $$7 += axx.b.d($$9);
               }

               return axx.b.a($$5 / $$4, $$6 / $$4, $$7 / $$4);
            }
         }
      }, cur.uv);
      $$1.a(($$0x, $$1x) -> $$1x > 0 ? -1 : axx.b.e($$0x.a(kq.G, cws.a).b()), cur.sk, cur.vo, cur.vr, cur.vq);

      for (cvy $$2 : cvy.h()) {
         $$1.a(($$1x, $$2x) -> axx.b.e($$2.a($$2x)), $$2);
      }

      $$1.a(($$1x, $$2x) -> {
         dta $$3 = ((csm)$$1x.g()).d().o();
         return $$0.a($$3, null, null, $$2x);
      }, dfy.i, dfy.bt, dfy.bu, dfy.ff, dfy.aE, dfy.aF, dfy.aG, dfy.aH, dfy.aI, dfy.aK, dfy.fm);
      $$1.a(($$0x, $$1x) -> dco.d(), dfy.aL);
      $$1.a(($$0x, $$1x) -> $$1x == 0 ? -1 : axx.b.e($$0x.a(kq.A, cxq.c).a()), cur.rU);
      return $$1;
   }

   public int a(cuo $$0, int $$1) {
      fhn $$2 = this.b.a(lt.g.a($$0.g()));
      return $$2 == null ? -1 : $$2.getColor($$0, $$1);
   }

   public void a(fhn $$0, dct... $$1) {
      for (dct $$2 : $$1) {
         this.b.a($$0, cuj.a($$2.r()));
      }
   }
}
