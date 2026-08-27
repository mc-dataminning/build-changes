public class ers {
   private static final int a = -1;
   private final hl<err> b = new hl<>(32);

   public static ers a(ero $$0) {
      ers $$1 = new ers();
      $$1.a(($$0x, $$1x) -> $$1x > 0 ? -1 : ((cho)$$0x.d()).e_($$0x), ciz.oK, ciz.oL, ciz.oM, ciz.oN, ciz.tP);
      $$1.a(($$0x, $$1x) -> cpi.a(0.5, 1.0), csl.iH, csl.iI);
      $$1.a(($$0x, $$1x) -> {
         if ($$1x != 1) {
            return -1;
         } else {
            qs $$2x = $$0x.b("Explosion");
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
      }, ciz.tB);
      $$1.a(($$0x, $$1x) -> $$1x > 0 ? -1 : ckv.c($$0x), ciz.rv, ciz.uu, ciz.ux);

      for (ckb $$2 : ckb.h()) {
         $$1.a(($$1x, $$2x) -> $$2.a($$2x), $$2);
      }

      $$1.a(($$1x, $$2x) -> {
         dey $$3 = ((cgp)$$1x.d()).e().n();
         return $$0.a($$3, null, null, $$2x);
      }, csl.i, csl.bt, csl.bu, csl.ff, csl.aE, csl.aF, csl.aG, csl.aH, csl.aI, csl.aK, csl.fm);
      $$1.a(($$0x, $$1x) -> cpe.d(), csl.aL);
      $$1.a(($$0x, $$1x) -> $$1x == 0 ? ckv.c($$0x) : -1, ciz.uw);
      $$1.a(($$0x, $$1x) -> $$1x == 0 ? -1 : cjd.k($$0x), ciz.rf);
      return $$1;
   }

   public int a(ciw $$0, int $$1) {
      err $$2 = this.b.a(jc.i.a($$0.d()));
      return $$2 == null ? -1 : $$2.getColor($$0, $$1);
   }

   public void a(err $$0, cpj... $$1) {
      for (cpj $$2 : $$1) {
         this.b.a($$0, cir.a($$2.k()));
      }
   }
}
