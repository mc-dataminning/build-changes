public class err {
   private static final int a = -1;
   private final hk<erq> b = new hk<>(32);

   public static err a(ern $$0) {
      err $$1 = new err();
      $$1.a(($$0x, $$1x) -> $$1x > 0 ? -1 : ((chq)$$0x.d()).e_($$0x), cjb.oK, cjb.oL, cjb.oM, cjb.oN, cjb.tP);
      $$1.a(($$0x, $$1x) -> cpk.a(0.5, 1.0), csn.iH, csn.iI);
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
      }, cjb.tB);
      $$1.a(($$0x, $$1x) -> $$1x > 0 ? -1 : ckx.c($$0x), cjb.rv, cjb.uu, cjb.ux);

      for (ckd $$2 : ckd.h()) {
         $$1.a(($$1x, $$2x) -> $$2.a($$2x), $$2);
      }

      $$1.a(($$1x, $$2x) -> {
         dfa $$3 = ((cgr)$$1x.d()).e().n();
         return $$0.a($$3, null, null, $$2x);
      }, csn.i, csn.bt, csn.bu, csn.ff, csn.aE, csn.aF, csn.aG, csn.aH, csn.aI, csn.aK, csn.fm);
      $$1.a(($$0x, $$1x) -> cpg.d(), csn.aL);
      $$1.a(($$0x, $$1x) -> $$1x == 0 ? ckx.c($$0x) : -1, cjb.uw);
      $$1.a(($$0x, $$1x) -> $$1x == 0 ? -1 : cjf.k($$0x), cjb.rf);
      return $$1;
   }

   public int a(ciy $$0, int $$1) {
      erq $$2 = this.b.a(jb.i.a($$0.d()));
      return $$2 == null ? -1 : $$2.getColor($$0, $$1);
   }

   public void a(erq $$0, cpl... $$1) {
      for (cpl $$2 : $$1) {
         this.b.a($$0, cit.a($$2.k()));
      }
   }
}
