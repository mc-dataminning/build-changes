import it.unimi.dsi.fastutil.ints.IntList;

public class fld {
   private static final int a = -1;
   private final jw<flc> b = new jw<>(32);

   public static fld a(fkz $$0) {
      fld $$1 = new fld();
      $$1.a(($$0x, $$1x) -> $$1x > 0 ? -1 : cyt.a($$0x, -6265536), cwj.pz, cwj.pA, cwj.pB, cwj.pC, cwj.vb);
      $$1.a(($$0x, $$1x) -> $$1x != 1 ? -1 : cyt.a($$0x, 0), cwj.os);
      $$1.a(($$0x, $$1x) -> dfd.a(0.5, 1.0), dil.iH, dil.iI);
      $$1.a(($$0x, $$1x) -> {
         if ($$1x != 1) {
            return -1;
         } else {
            cyu $$2x = $$0x.a(ku.ae);
            IntList $$3 = $$2x != null ? $$2x.b() : IntList.of();
            int $$4 = $$3.size();
            if ($$4 == 0) {
               return -7697782;
            } else if ($$4 == 1) {
               return axy.f($$3.getInt(0));
            } else {
               int $$5 = 0;
               int $$6 = 0;
               int $$7 = 0;

               for (int $$8 = 0; $$8 < $$4; $$8++) {
                  int $$9 = $$3.getInt($$8);
                  $$5 += axy.b($$9);
                  $$6 += axy.c($$9);
                  $$7 += axy.d($$9);
               }

               return axy.a($$5 / $$4, $$6 / $$4, $$7 / $$4);
            }
         }
      }, cwj.uN);
      $$1.a(($$0x, $$1x) -> $$1x > 0 ? -1 : axy.f($$0x.a(ku.Q, cye.a).b()), cwj.sC, cwj.vG, cwj.vJ, cwj.vI);

      for (cxo $$2 : cxo.b()) {
         $$1.a(($$1x, $$2x) -> axy.f($$2.a($$2x)), $$2);
      }

      $$1.a(($$1x, $$2x) -> {
         dvo $$3 = ((cul)$$1x.h()).d().m();
         return $$0.a($$3, null, null, $$2x);
      }, dil.i, dil.bt, dil.bu, dil.ff, dil.aE, dil.aF, dil.aG, dil.aH, dil.aI, dil.aK, dil.fm);
      $$1.a(($$0x, $$1x) -> dez.d(), dil.aL);
      $$1.a(($$0x, $$1x) -> $$1x == 0 ? -1 : axy.f($$0x.a(ku.K, czb.c).a()), cwj.sl);
      return $$1;
   }

   public int a(cwf $$0, int $$1) {
      flc $$2 = this.b.a(lz.g.a($$0.h()));
      return $$2 == null ? -1 : $$2.getColor($$0, $$1);
   }

   public void a(flc $$0, dfe... $$1) {
      for (dfe $$2 : $$1) {
         this.b.a($$0, cwb.a($$2.j()));
      }
   }
}
