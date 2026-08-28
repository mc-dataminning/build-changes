import it.unimi.dsi.fastutil.ints.IntList;

public class fgo {
   private static final int a = -1;
   private final jo<fgn> b = new jo<>(32);

   public static fgo a(fgk $$0) {
      fgo $$1 = new fgo();
      $$1.a(($$0x, $$1x) -> $$1x > 0 ? -1 : cxj.a($$0x, -6265536), cuu.py, cuu.pz, cuu.pA, cuu.pB, cuu.uJ);
      $$1.a(($$0x, $$1x) -> $$1x != 1 ? -1 : cxj.a($$0x, 0), cuu.or);
      $$1.a(($$0x, $$1x) -> dby.a(0.5, 1.0), dfd.iH, dfd.iI);
      $$1.a(($$0x, $$1x) -> {
         if ($$1x != 1) {
            return -1;
         } else {
            cxk $$2x = $$0x.a(km.T);
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
      }, cuu.uv);
      $$1.a(($$0x, $$1x) -> $$1x > 0 ? -1 : ayj.b.e($$0x.a(km.G, cws.a).b()), cuu.sk, cuu.vo, cuu.vr, cuu.vq);

      for (cvy $$2 : cvy.h()) {
         $$1.a(($$1x, $$2x) -> ayj.b.e($$2.a($$2x)), $$2);
      }

      $$1.a(($$1x, $$2x) -> {
         dse $$3 = ((csp)$$1x.g()).d().o();
         return $$0.a($$3, null, null, $$2x);
      }, dfd.i, dfd.bt, dfd.bu, dfd.ff, dfd.aE, dfd.aF, dfd.aG, dfd.aH, dfd.aI, dfd.aK, dfd.fm);
      $$1.a(($$0x, $$1x) -> dbu.d(), dfd.aL);
      $$1.a(($$0x, $$1x) -> $$1x == 0 ? -1 : ayj.b.e($$0x.a(km.A, cxr.c).a()), cuu.rU);
      return $$1;
   }

   public int a(cur $$0, int $$1) {
      fgn $$2 = this.b.a(lp.h.a($$0.g()));
      return $$2 == null ? -1 : $$2.getColor($$0, $$1);
   }

   public void a(fgn $$0, dbz... $$1) {
      for (dbz $$2 : $$1) {
         this.b.a($$0, cum.a($$2.r()));
      }
   }
}
