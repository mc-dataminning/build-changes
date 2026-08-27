public class ewp {
   private static final int a = -1;
   private final in<ewo> b = new in<>(32);

   public static ewp a(ewl $$0) {
      ewp $$1 = new ewp();
      $$1.a(($$0x, $$1x) -> $$1x > 0 ? -1 : ((clq)$$0x.d()).e_($$0x), cnb.pv, cnb.pw, cnb.px, cnb.py, cnb.uC);
      $$1.a(($$0x, $$1x) -> ctn.a(0.5, 1.0), cws.iH, cws.iI);
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
      }, cnb.uo);
      $$1.a(($$0x, $$1x) -> $$1x > 0 ? -1 : coy.c($$0x), cnb.sh, cnb.vh, cnb.vk);

      for (cod $$2 : cod.h()) {
         $$1.a(($$1x, $$2x) -> $$2.a($$2x), $$2);
      }

      $$1.a(($$1x, $$2x) -> {
         djh $$3 = ((ckr)$$1x.d()).e().o();
         return $$0.a($$3, null, null, $$2x);
      }, cws.i, cws.bt, cws.bu, cws.ff, cws.aE, cws.aF, cws.aG, cws.aH, cws.aI, cws.aK, cws.fm);
      $$1.a(($$0x, $$1x) -> ctj.d(), cws.aL);
      $$1.a(($$0x, $$1x) -> $$1x == 0 ? coy.c($$0x) : -1, cnb.vj);
      $$1.a(($$0x, $$1x) -> $$1x == 0 ? -1 : cnf.o($$0x), cnb.rR);
      return $$1;
   }

   public int a(cmy $$0, int $$1) {
      ewo $$2 = this.b.a(kd.h.a($$0.d()));
      return $$2 == null ? -1 : $$2.getColor($$0, $$1);
   }

   public void a(ewo $$0, cto... $$1) {
      for (cto $$2 : $$1) {
         this.b.a($$0, cmt.a($$2.k()));
      }
   }
}
