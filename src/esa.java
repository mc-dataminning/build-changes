public class esa {
   private static final int a = -1;
   private final hm<erz> b = new hm<>(32);

   public static esa a(erw $$0) {
      esa $$1 = new esa();
      $$1.a(($$0x, $$1x) -> $$1x > 0 ? -1 : ((chx)$$0x.d()).e_($$0x), cji.oK, cji.oL, cji.oM, cji.oN, cji.tP);
      $$1.a(($$0x, $$1x) -> cpt.a(0.5, 1.0), csw.iH, csw.iI);
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
      }, cji.tB);
      $$1.a(($$0x, $$1x) -> $$1x > 0 ? -1 : cle.c($$0x), cji.rv, cji.uu, cji.ux);

      for (ckk $$2 : ckk.h()) {
         $$1.a(($$1x, $$2x) -> $$2.a($$2x), $$2);
      }

      $$1.a(($$1x, $$2x) -> {
         dfj $$3 = ((cgy)$$1x.d()).e().n();
         return $$0.a($$3, null, null, $$2x);
      }, csw.i, csw.bt, csw.bu, csw.ff, csw.aE, csw.aF, csw.aG, csw.aH, csw.aI, csw.aK, csw.fm);
      $$1.a(($$0x, $$1x) -> cpp.d(), csw.aL);
      $$1.a(($$0x, $$1x) -> $$1x == 0 ? cle.c($$0x) : -1, cji.uw);
      $$1.a(($$0x, $$1x) -> $$1x == 0 ? -1 : cjm.o($$0x), cji.rf);
      return $$1;
   }

   public int a(cjf $$0, int $$1) {
      erz $$2 = this.b.a(jd.i.a($$0.d()));
      return $$2 == null ? -1 : $$2.getColor($$0, $$1);
   }

   public void a(erz $$0, cpu... $$1) {
      for (cpu $$2 : $$1) {
         this.b.a($$0, cja.a($$2.k()));
      }
   }
}
