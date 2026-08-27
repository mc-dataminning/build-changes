public class eos {
   private static final int a = -1;
   private final hk<eor> b = new hk<>(32);

   public static eos a(eoo $$0) {
      eos $$1 = new eos();
      $$1.a(($$0x, $$1x) -> $$1x > 0 ? -1 : ((cer)$$0x.d()).e_($$0x), cgc.oK, cgc.oL, cgc.oM, cgc.oN, cgc.tP);
      $$1.a(($$0x, $$1x) -> cmk.a(0.5, 1.0), cpo.iH, cpo.iI);
      $$1.a(($$0x, $$1x) -> {
         if ($$1x != 1) {
            return -1;
         } else {
            qr $$2x = $$0x.b("Explosion");
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
      }, cgc.tB);
      $$1.a(($$0x, $$1x) -> $$1x > 0 ? -1 : chy.c($$0x), cgc.rv, cgc.uu, cgc.ux);

      for (che $$2 : che.h()) {
         $$1.a(($$1x, $$2x) -> $$2.a($$2x), $$2);
      }

      $$1.a(($$1x, $$2x) -> {
         dcb $$3 = ((cds)$$1x.d()).e().n();
         return $$0.a($$3, null, null, $$2x);
      }, cpo.i, cpo.bt, cpo.bu, cpo.ff, cpo.aE, cpo.aF, cpo.aG, cpo.aH, cpo.aI, cpo.aK, cpo.fm);
      $$1.a(($$0x, $$1x) -> cmg.d(), cpo.aL);
      $$1.a(($$0x, $$1x) -> $$1x == 0 ? chy.c($$0x) : -1, cgc.uw);
      $$1.a(($$0x, $$1x) -> $$1x == 0 ? -1 : cgg.k($$0x), cgc.rf);
      return $$1;
   }

   public int a(cfz $$0, int $$1) {
      eor $$2 = this.b.a(jb.i.a($$0.d()));
      return $$2 == null ? -1 : $$2.getColor($$0, $$1);
   }

   public void a(eor $$0, cml... $$1) {
      for (cml $$2 : $$1) {
         this.b.a($$0, cfu.a($$2.k()));
      }
   }
}
