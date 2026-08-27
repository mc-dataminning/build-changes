public class euj {
   private static final int a = -1;
   private final ii<eui> b = new ii<>(32);

   public static euj a(euf $$0) {
      euj $$1 = new euj();
      $$1.a(($$0x, $$1x) -> $$1x > 0 ? -1 : ((ckb)$$0x.d()).e_($$0x), clm.pv, clm.pw, clm.px, clm.py, clm.uB);
      $$1.a(($$0x, $$1x) -> cry.a(0.5, 1.0), cvc.iH, cvc.iI);
      $$1.a(($$0x, $$1x) -> {
         if ($$1x != 1) {
            return -1;
         } else {
            rz $$2x = $$0x.b("Explosion");
            int[] $$3 = $$2x != null && $$2x.b("Colors", 11) ? $$2x.n("Colors") : null;
            if ($$3 != null && $$3.length != 0) {
               if ($$3.length == 1) {
                  return $$3[0];
               } else {
                  int $$4 = 0;
                  int $$5 = 0;
                  int $$6 = 0;

                  for (int $$7 : $$3) {
                     $$4 += ($$7 & 0xFF0000) >> 16;
                     $$5 += ($$7 & 0xFF00) >> 8;
                     $$6 += ($$7 & 0xFF) >> 0;
                  }

                  $$4 /= $$3.length;
                  $$5 /= $$3.length;
                  $$6 /= $$3.length;
                  return $$4 << 16 | $$5 << 8 | $$6;
               }
            } else {
               return 9079434;
            }
         }
      }, clm.un);
      $$1.a(($$0x, $$1x) -> $$1x > 0 ? -1 : cni.c($$0x), clm.sh, clm.vg, clm.vj);

      for (cmo $$2 : cmo.h()) {
         $$1.a(($$1x, $$2x) -> $$2.a($$2x), $$2);
      }

      $$1.a(($$1x, $$2x) -> {
         dhi $$3 = ((cjc)$$1x.d()).e().o();
         return $$0.a($$3, null, null, $$2x);
      }, cvc.i, cvc.bt, cvc.bu, cvc.ff, cvc.aE, cvc.aF, cvc.aG, cvc.aH, cvc.aI, cvc.aK, cvc.fm);
      $$1.a(($$0x, $$1x) -> cru.d(), cvc.aL);
      $$1.a(($$0x, $$1x) -> $$1x == 0 ? cni.c($$0x) : -1, clm.vi);
      $$1.a(($$0x, $$1x) -> $$1x == 0 ? -1 : clq.o($$0x), clm.rR);
      return $$1;
   }

   public int a(clj $$0, int $$1) {
      eui $$2 = this.b.a(jy.i.a($$0.d()));
      return $$2 == null ? -1 : $$2.getColor($$0, $$1);
   }

   public void a(eui $$0, crz... $$1) {
      for (crz $$2 : $$1) {
         this.b.a($$0, cle.a($$2.k()));
      }
   }
}
