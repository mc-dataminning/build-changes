public class erv {
   private static final int a = -1;
   private final hm<eru> b = new hm<>(32);

   public static erv a(err $$0) {
      erv $$1 = new erv();
      $$1.a(($$0x, $$1x) -> $$1x > 0 ? -1 : ((chs)$$0x.d()).e_($$0x), cjd.oK, cjd.oL, cjd.oM, cjd.oN, cjd.tP);
      $$1.a(($$0x, $$1x) -> cpo.a(0.5, 1.0), csr.iH, csr.iI);
      $$1.a(($$0x, $$1x) -> {
         if ($$1x != 1) {
            return -1;
         } else {
            qu $$2x = $$0x.b("Explosion");
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
      }, cjd.tB);
      $$1.a(($$0x, $$1x) -> $$1x > 0 ? -1 : ckz.c($$0x), cjd.rv, cjd.uu, cjd.ux);

      for (ckf $$2 : ckf.h()) {
         $$1.a(($$1x, $$2x) -> $$2.a($$2x), $$2);
      }

      $$1.a(($$1x, $$2x) -> {
         dfe $$3 = ((cgt)$$1x.d()).e().n();
         return $$0.a($$3, null, null, $$2x);
      }, csr.i, csr.bt, csr.bu, csr.ff, csr.aE, csr.aF, csr.aG, csr.aH, csr.aI, csr.aK, csr.fm);
      $$1.a(($$0x, $$1x) -> cpk.d(), csr.aL);
      $$1.a(($$0x, $$1x) -> $$1x == 0 ? ckz.c($$0x) : -1, cjd.uw);
      $$1.a(($$0x, $$1x) -> $$1x == 0 ? -1 : cjh.k($$0x), cjd.rf);
      return $$1;
   }

   public int a(cja $$0, int $$1) {
      eru $$2 = this.b.a(jd.i.a($$0.d()));
      return $$2 == null ? -1 : $$2.getColor($$0, $$1);
   }

   public void a(eru $$0, cpp... $$1) {
      for (cpp $$2 : $$1) {
         this.b.a($$0, civ.a($$2.k()));
      }
   }
}
