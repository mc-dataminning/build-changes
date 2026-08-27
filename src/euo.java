public class euo {
   private static final int a = -1;
   private final im<eun> b = new im<>(32);

   public static euo a(euk $$0) {
      euo $$1 = new euo();
      $$1.a(($$0x, $$1x) -> $$1x > 0 ? -1 : ((ckg)$$0x.d()).e_($$0x), clr.pv, clr.pw, clr.px, clr.py, clr.uB);
      $$1.a(($$0x, $$1x) -> csd.a(0.5, 1.0), cvh.iH, cvh.iI);
      $$1.a(($$0x, $$1x) -> {
         if ($$1x != 1) {
            return -1;
         } else {
            sd $$2x = $$0x.b("Explosion");
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
      }, clr.un);
      $$1.a(($$0x, $$1x) -> $$1x > 0 ? -1 : cnn.c($$0x), clr.sh, clr.vg, clr.vj);

      for (cmt $$2 : cmt.h()) {
         $$1.a(($$1x, $$2x) -> $$2.a($$2x), $$2);
      }

      $$1.a(($$1x, $$2x) -> {
         dhn $$3 = ((cjh)$$1x.d()).e().o();
         return $$0.a($$3, null, null, $$2x);
      }, cvh.i, cvh.bt, cvh.bu, cvh.ff, cvh.aE, cvh.aF, cvh.aG, cvh.aH, cvh.aI, cvh.aK, cvh.fm);
      $$1.a(($$0x, $$1x) -> crz.d(), cvh.aL);
      $$1.a(($$0x, $$1x) -> $$1x == 0 ? cnn.c($$0x) : -1, clr.vi);
      $$1.a(($$0x, $$1x) -> $$1x == 0 ? -1 : clv.o($$0x), clr.rR);
      return $$1;
   }

   public int a(clo $$0, int $$1) {
      eun $$2 = this.b.a(kc.i.a($$0.d()));
      return $$2 == null ? -1 : $$2.getColor($$0, $$1);
   }

   public void a(eun $$0, cse... $$1) {
      for (cse $$2 : $$1) {
         this.b.a($$0, clj.a($$2.k()));
      }
   }
}
