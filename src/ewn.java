public class ewn {
   private static final int a = -1;
   private final in<ewm> b = new in<>(32);

   public static ewn a(ewj $$0) {
      ewn $$1 = new ewn();
      $$1.a(($$0x, $$1x) -> $$1x > 0 ? -1 : ((clp)$$0x.d()).e_($$0x), cna.pv, cna.pw, cna.px, cna.py, cna.uC);
      $$1.a(($$0x, $$1x) -> ctm.a(0.5, 1.0), cwr.iH, cwr.iI);
      $$1.a(($$0x, $$1x) -> {
         if ($$1x != 1) {
            return -1;
         } else {
            sn $$2x = $$0x.b("Explosion");
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
      }, cna.uo);
      $$1.a(($$0x, $$1x) -> $$1x > 0 ? -1 : cox.c($$0x), cna.sh, cna.vh, cna.vk);

      for (coc $$2 : coc.h()) {
         $$1.a(($$1x, $$2x) -> $$2.a($$2x), $$2);
      }

      $$1.a(($$1x, $$2x) -> {
         djg $$3 = ((ckq)$$1x.d()).e().o();
         return $$0.a($$3, null, null, $$2x);
      }, cwr.i, cwr.bt, cwr.bu, cwr.ff, cwr.aE, cwr.aF, cwr.aG, cwr.aH, cwr.aI, cwr.aK, cwr.fm);
      $$1.a(($$0x, $$1x) -> cti.d(), cwr.aL);
      $$1.a(($$0x, $$1x) -> $$1x == 0 ? cox.c($$0x) : -1, cna.vj);
      $$1.a(($$0x, $$1x) -> $$1x == 0 ? -1 : cne.o($$0x), cna.rR);
      return $$1;
   }

   public int a(cmx $$0, int $$1) {
      ewm $$2 = this.b.a(kd.h.a($$0.d()));
      return $$2 == null ? -1 : $$2.getColor($$0, $$1);
   }

   public void a(ewm $$0, ctn... $$1) {
      for (ctn $$2 : $$1) {
         this.b.a($$0, cms.a($$2.k()));
      }
   }
}
