public class esc {
   private static final int a = -1;
   private final hm<esb> b = new hm<>(32);

   public static esc a(ery $$0) {
      esc $$1 = new esc();
      $$1.a(($$0x, $$1x) -> $$1x > 0 ? -1 : ((chz)$$0x.d()).e_($$0x), cjk.oK, cjk.oL, cjk.oM, cjk.oN, cjk.tP);
      $$1.a(($$0x, $$1x) -> cpv.a(0.5, 1.0), csy.iH, csy.iI);
      $$1.a(($$0x, $$1x) -> {
         if ($$1x != 1) {
            return -1;
         } else {
            qy $$2x = $$0x.b("Explosion");
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
      }, cjk.tB);
      $$1.a(($$0x, $$1x) -> $$1x > 0 ? -1 : clg.c($$0x), cjk.rv, cjk.uu, cjk.ux);

      for (ckm $$2 : ckm.h()) {
         $$1.a(($$1x, $$2x) -> $$2.a($$2x), $$2);
      }

      $$1.a(($$1x, $$2x) -> {
         dfl $$3 = ((cha)$$1x.d()).e().n();
         return $$0.a($$3, null, null, $$2x);
      }, csy.i, csy.bt, csy.bu, csy.ff, csy.aE, csy.aF, csy.aG, csy.aH, csy.aI, csy.aK, csy.fm);
      $$1.a(($$0x, $$1x) -> cpr.d(), csy.aL);
      $$1.a(($$0x, $$1x) -> $$1x == 0 ? clg.c($$0x) : -1, cjk.uw);
      $$1.a(($$0x, $$1x) -> $$1x == 0 ? -1 : cjo.o($$0x), cjk.rf);
      return $$1;
   }

   public int a(cjh $$0, int $$1) {
      esb $$2 = this.b.a(jd.i.a($$0.d()));
      return $$2 == null ? -1 : $$2.getColor($$0, $$1);
   }

   public void a(esb $$0, cpw... $$1) {
      for (cpw $$2 : $$1) {
         this.b.a($$0, cjc.a($$2.k()));
      }
   }
}
