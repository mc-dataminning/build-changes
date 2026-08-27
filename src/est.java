public class est {
   private static final int a = -1;
   private final ii<ess> b = new ii<>(32);

   public static est a(esp $$0) {
      est $$1 = new est();
      $$1.a(($$0x, $$1x) -> $$1x > 0 ? -1 : ((cjb)$$0x.d()).e_($$0x), ckm.oK, ckm.oL, ckm.oM, ckm.oN, ckm.tP);
      $$1.a(($$0x, $$1x) -> cqx.a(0.5, 1.0), cuc.iH, cuc.iI);
      $$1.a(($$0x, $$1x) -> {
         if ($$1x != 1) {
            return -1;
         } else {
            rt $$2x = $$0x.b("Explosion");
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
      }, ckm.tB);
      $$1.a(($$0x, $$1x) -> $$1x > 0 ? -1 : cmi.c($$0x), ckm.rv, ckm.uu, ckm.ux);

      for (clo $$2 : clo.h()) {
         $$1.a(($$1x, $$2x) -> $$2.a($$2x), $$2);
      }

      $$1.a(($$1x, $$2x) -> {
         dgb $$3 = ((cic)$$1x.d()).e().o();
         return $$0.a($$3, null, null, $$2x);
      }, cuc.i, cuc.bt, cuc.bu, cuc.ff, cuc.aE, cuc.aF, cuc.aG, cuc.aH, cuc.aI, cuc.aK, cuc.fm);
      $$1.a(($$0x, $$1x) -> cqt.d(), cuc.aL);
      $$1.a(($$0x, $$1x) -> $$1x == 0 ? cmi.c($$0x) : -1, ckm.uw);
      $$1.a(($$0x, $$1x) -> $$1x == 0 ? -1 : ckq.o($$0x), ckm.rf);
      return $$1;
   }

   public int a(ckj $$0, int $$1) {
      ess $$2 = this.b.a(jy.i.a($$0.d()));
      return $$2 == null ? -1 : $$2.getColor($$0, $$1);
   }

   public void a(ess $$0, cqy... $$1) {
      for (cqy $$2 : $$1) {
         this.b.a($$0, cke.a($$2.k()));
      }
   }
}
