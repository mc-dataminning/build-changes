public class eru {
   private static final int a = -1;
   private final hk<ert> b = new hk<>(32);

   public static eru a(erq $$0) {
      eru $$1 = new eru();
      $$1.a(($$0x, $$1x) -> $$1x > 0 ? -1 : ((cid)$$0x.d()).e_($$0x), cjo.oK, cjo.oL, cjo.oM, cjo.oN, cjo.tP);
      $$1.a(($$0x, $$1x) -> cpz.a(0.5, 1.0), cte.iH, cte.iI);
      $$1.a(($$0x, $$1x) -> {
         if ($$1x != 1) {
            return -1;
         } else {
            qw $$2x = $$0x.b("Explosion");
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
      }, cjo.tB);
      $$1.a(($$0x, $$1x) -> $$1x > 0 ? -1 : clk.c($$0x), cjo.rv, cjo.uu, cjo.ux);

      for (ckq $$2 : ckq.h()) {
         $$1.a(($$1x, $$2x) -> $$2.a($$2x), $$2);
      }

      $$1.a(($$1x, $$2x) -> {
         dfd $$3 = ((che)$$1x.d()).e().o();
         return $$0.a($$3, null, null, $$2x);
      }, cte.i, cte.bt, cte.bu, cte.ff, cte.aE, cte.aF, cte.aG, cte.aH, cte.aI, cte.aK, cte.fm);
      $$1.a(($$0x, $$1x) -> cpv.d(), cte.aL);
      $$1.a(($$0x, $$1x) -> $$1x == 0 ? clk.c($$0x) : -1, cjo.uw);
      $$1.a(($$0x, $$1x) -> $$1x == 0 ? -1 : cjs.o($$0x), cjo.rf);
      return $$1;
   }

   public int a(cjl $$0, int $$1) {
      ert $$2 = this.b.a(jb.i.a($$0.d()));
      return $$2 == null ? -1 : $$2.getColor($$0, $$1);
   }

   public void a(ert $$0, cqa... $$1) {
      for (cqa $$2 : $$1) {
         this.b.a($$0, cjg.a($$2.k()));
      }
   }
}
