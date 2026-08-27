public class erq {
   private static final int a = -1;
   private final hk<erp> b = new hk<>(32);

   public static erq a(erm $$0) {
      erq $$1 = new erq();
      $$1.a(($$0x, $$1x) -> $$1x > 0 ? -1 : ((chp)$$0x.d()).e_($$0x), cja.oK, cja.oL, cja.oM, cja.oN, cja.tP);
      $$1.a(($$0x, $$1x) -> cpj.a(0.5, 1.0), csm.iH, csm.iI);
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
      }, cja.tB);
      $$1.a(($$0x, $$1x) -> $$1x > 0 ? -1 : ckw.c($$0x), cja.rv, cja.uu, cja.ux);

      for (ckc $$2 : ckc.h()) {
         $$1.a(($$1x, $$2x) -> $$2.a($$2x), $$2);
      }

      $$1.a(($$1x, $$2x) -> {
         dez $$3 = ((cgq)$$1x.d()).e().n();
         return $$0.a($$3, null, null, $$2x);
      }, csm.i, csm.bt, csm.bu, csm.ff, csm.aE, csm.aF, csm.aG, csm.aH, csm.aI, csm.aK, csm.fm);
      $$1.a(($$0x, $$1x) -> cpf.d(), csm.aL);
      $$1.a(($$0x, $$1x) -> $$1x == 0 ? ckw.c($$0x) : -1, cja.uw);
      $$1.a(($$0x, $$1x) -> $$1x == 0 ? -1 : cje.k($$0x), cja.rf);
      return $$1;
   }

   public int a(cix $$0, int $$1) {
      erp $$2 = this.b.a(jb.i.a($$0.d()));
      return $$2 == null ? -1 : $$2.getColor($$0, $$1);
   }

   public void a(erp $$0, cpk... $$1) {
      for (cpk $$2 : $$1) {
         this.b.a($$0, cis.a($$2.k()));
      }
   }
}
