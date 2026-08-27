public class eyp {
   private static final int a = -1;
   private final ip<eyo> b = new ip<>(32);

   public static eyp a(eyl $$0) {
      eyp $$1 = new eyp();
      $$1.a(($$0x, $$1x) -> $$1x > 0 ? -1 : ((cnr)$$0x.d()).e_($$0x), cpc.px, cpc.py, cpc.pz, cpc.pA, cpc.uF);
      $$1.a(($$0x, $$1x) -> cvl.a(0.5, 1.0), cyq.iH, cyq.iI);
      $$1.a(($$0x, $$1x) -> {
         if ($$1x != 1) {
            return -1;
         } else {
            sw $$2x = $$0x.b("Explosion");
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
      }, cpc.ur);
      $$1.a(($$0x, $$1x) -> $$1x > 0 ? -1 : cqx.c($$0x), cpc.sj, cpc.vk, cpc.vn);

      for (cqe $$2 : cqe.h()) {
         $$1.a(($$1x, $$2x) -> $$2.a($$2x), $$2);
      }

      $$1.a(($$1x, $$2x) -> {
         dlf $$3 = ((cms)$$1x.d()).e().o();
         return $$0.a($$3, null, null, $$2x);
      }, cyq.i, cyq.bt, cyq.bu, cyq.ff, cyq.aE, cyq.aF, cyq.aG, cyq.aH, cyq.aI, cyq.aK, cyq.fm);
      $$1.a(($$0x, $$1x) -> cvh.d(), cyq.aL);
      $$1.a(($$0x, $$1x) -> $$1x == 0 ? cqx.c($$0x) : -1, cpc.vm);
      $$1.a(($$0x, $$1x) -> $$1x == 0 ? -1 : cpg.o($$0x), cpc.rT);
      return $$1;
   }

   public int a(coz $$0, int $$1) {
      eyo $$2 = this.b.a(kf.h.a($$0.d()));
      return $$2 == null ? -1 : $$2.getColor($$0, $$1);
   }

   public void a(eyo $$0, cvm... $$1) {
      for (cvm $$2 : $$1) {
         this.b.a($$0, cou.a($$2.j()));
      }
   }
}
