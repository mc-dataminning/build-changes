import it.unimi.dsi.fastutil.ints.IntList;

public class flk {
   private static final int a = -1;
   private final jw<flj> b = new jw<>(32);

   public static flk a(flg $$0) {
      flk $$1 = new flk();
      $$1.a(($$0x, $$1x) -> $$1x > 0 ? -1 : cza.a($$0x, -6265536), cwq.pz, cwq.pA, cwq.pB, cwq.pC, cwq.vb);
      $$1.a(($$0x, $$1x) -> $$1x != 1 ? -1 : cza.a($$0x, 0), cwq.os);
      $$1.a(($$0x, $$1x) -> dfk.a(0.5, 1.0), dis.iH, dis.iI);
      $$1.a(($$0x, $$1x) -> {
         if ($$1x != 1) {
            return -1;
         } else {
            czb $$2x = $$0x.a(ku.ae);
            IntList $$3 = $$2x != null ? $$2x.b() : IntList.of();
            int $$4 = $$3.size();
            if ($$4 == 0) {
               return -7697782;
            } else if ($$4 == 1) {
               return axx.f($$3.getInt(0));
            } else {
               int $$5 = 0;
               int $$6 = 0;
               int $$7 = 0;

               for (int $$8 = 0; $$8 < $$4; $$8++) {
                  int $$9 = $$3.getInt($$8);
                  $$5 += axx.b($$9);
                  $$6 += axx.c($$9);
                  $$7 += axx.d($$9);
               }

               return axx.a($$5 / $$4, $$6 / $$4, $$7 / $$4);
            }
         }
      }, cwq.uN);
      $$1.a(($$0x, $$1x) -> $$1x > 0 ? -1 : axx.f($$0x.a(ku.Q, cyl.a).b()), cwq.sC, cwq.vG, cwq.vJ, cwq.vI);

      for (cxv $$2 : cxv.b()) {
         $$1.a(($$1x, $$2x) -> axx.f($$2.a($$2x)), $$2);
      }

      $$1.a(($$1x, $$2x) -> {
         dvv $$3 = ((cus)$$1x.h()).d().m();
         return $$0.a($$3, null, null, $$2x);
      }, dis.i, dis.bt, dis.bu, dis.ff, dis.aE, dis.aF, dis.aG, dis.aH, dis.aI, dis.aK, dis.fm);
      $$1.a(($$0x, $$1x) -> dfg.d(), dis.aL);
      $$1.a(($$0x, $$1x) -> $$1x == 0 ? -1 : axx.f($$0x.a(ku.K, czi.c).a()), cwq.sl);
      return $$1;
   }

   public int a(cwm $$0, int $$1) {
      flj $$2 = this.b.a(lz.g.a($$0.h()));
      return $$2 == null ? -1 : $$2.getColor($$0, $$1);
   }

   public void a(flj $$0, dfl... $$1) {
      for (dfl $$2 : $$1) {
         this.b.a($$0, cwi.a($$2.j()));
      }
   }
}
