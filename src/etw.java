public class etw {
   private static final int a = -1;
   private final ii<etv> b = new ii<>(32);

   public static etw a(ets $$0) {
      etw $$1 = new etw();
      $$1.a(($$0x, $$1x) -> $$1x > 0 ? -1 : ((cjt)$$0x.d()).e_($$0x), cle.oK, cle.oL, cle.oM, cle.oN, cle.tQ);
      $$1.a(($$0x, $$1x) -> crq.a(0.5, 1.0), cuv.iH, cuv.iI);
      $$1.a(($$0x, $$1x) -> {
         if ($$1x != 1) {
            return -1;
         } else {
            rz $$2x = $$0x.b("Explosion");
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
      }, cle.tC);
      $$1.a(($$0x, $$1x) -> $$1x > 0 ? -1 : cna.c($$0x), cle.rw, cle.uv, cle.uy);

      for (cmg $$2 : cmg.h()) {
         $$1.a(($$1x, $$2x) -> $$2.a($$2x), $$2);
      }

      $$1.a(($$1x, $$2x) -> {
         dgw $$3 = ((ciu)$$1x.d()).e().o();
         return $$0.a($$3, null, null, $$2x);
      }, cuv.i, cuv.bt, cuv.bu, cuv.ff, cuv.aE, cuv.aF, cuv.aG, cuv.aH, cuv.aI, cuv.aK, cuv.fm);
      $$1.a(($$0x, $$1x) -> crm.d(), cuv.aL);
      $$1.a(($$0x, $$1x) -> $$1x == 0 ? cna.c($$0x) : -1, cle.ux);
      $$1.a(($$0x, $$1x) -> $$1x == 0 ? -1 : cli.o($$0x), cle.rg);
      return $$1;
   }

   public int a(clb $$0, int $$1) {
      etv $$2 = this.b.a(jy.i.a($$0.d()));
      return $$2 == null ? -1 : $$2.getColor($$0, $$1);
   }

   public void a(etv $$0, crr... $$1) {
      for (crr $$2 : $$1) {
         this.b.a($$0, ckw.a($$2.k()));
      }
   }
}
