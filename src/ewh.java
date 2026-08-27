public class ewh {
   private static final int a = -1;
   private final in<ewg> b = new in<>(32);

   public static ewh a(ewd $$0) {
      ewh $$1 = new ewh();
      $$1.a(($$0x, $$1x) -> $$1x > 0 ? -1 : ((clj)$$0x.d()).e_($$0x), cmu.pv, cmu.pw, cmu.px, cmu.py, cmu.uC);
      $$1.a(($$0x, $$1x) -> ctg.a(0.5, 1.0), cwl.iH, cwl.iI);
      $$1.a(($$0x, $$1x) -> {
         if ($$1x != 1) {
            return -1;
         } else {
            sl $$2x = $$0x.b("Explosion");
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
      }, cmu.uo);
      $$1.a(($$0x, $$1x) -> $$1x > 0 ? -1 : cor.c($$0x), cmu.sh, cmu.vh, cmu.vk);

      for (cnw $$2 : cnw.h()) {
         $$1.a(($$1x, $$2x) -> $$2.a($$2x), $$2);
      }

      $$1.a(($$1x, $$2x) -> {
         dja $$3 = ((ckk)$$1x.d()).e().o();
         return $$0.a($$3, null, null, $$2x);
      }, cwl.i, cwl.bt, cwl.bu, cwl.ff, cwl.aE, cwl.aF, cwl.aG, cwl.aH, cwl.aI, cwl.aK, cwl.fm);
      $$1.a(($$0x, $$1x) -> ctc.d(), cwl.aL);
      $$1.a(($$0x, $$1x) -> $$1x == 0 ? cor.c($$0x) : -1, cmu.vj);
      $$1.a(($$0x, $$1x) -> $$1x == 0 ? -1 : cmy.o($$0x), cmu.rR);
      return $$1;
   }

   public int a(cmr $$0, int $$1) {
      ewg $$2 = this.b.a(kd.h.a($$0.d()));
      return $$2 == null ? -1 : $$2.getColor($$0, $$1);
   }

   public void a(ewg $$0, cth... $$1) {
      for (cth $$2 : $$1) {
         this.b.a($$0, cmm.a($$2.k()));
      }
   }
}
