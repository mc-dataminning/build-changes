public class eyw {
   private static final int a = -1;
   private final ip<eyv> b = new ip<>(32);

   public static eyw a(eys $$0) {
      eyw $$1 = new eyw();
      $$1.a(($$0x, $$1x) -> $$1x > 0 ? -1 : ((cnv)$$0x.d()).e_($$0x), cpg.px, cpg.py, cpg.pz, cpg.pA, cpg.uF);
      $$1.a(($$0x, $$1x) -> cvp.a(0.5, 1.0), cyu.iH, cyu.iI);
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
      }, cpg.ur);
      $$1.a(($$0x, $$1x) -> $$1x > 0 ? -1 : crb.c($$0x), cpg.sj, cpg.vk, cpg.vn);

      for (cqi $$2 : cqi.h()) {
         $$1.a(($$1x, $$2x) -> $$2.a($$2x), $$2);
      }

      $$1.a(($$1x, $$2x) -> {
         dlj $$3 = ((cmw)$$1x.d()).e().o();
         return $$0.a($$3, null, null, $$2x);
      }, cyu.i, cyu.bt, cyu.bu, cyu.ff, cyu.aE, cyu.aF, cyu.aG, cyu.aH, cyu.aI, cyu.aK, cyu.fm);
      $$1.a(($$0x, $$1x) -> cvl.d(), cyu.aL);
      $$1.a(($$0x, $$1x) -> $$1x == 0 ? crb.c($$0x) : -1, cpg.vm);
      $$1.a(($$0x, $$1x) -> $$1x == 0 ? -1 : cpk.o($$0x), cpg.rT);
      return $$1;
   }

   public int a(cpd $$0, int $$1) {
      eyv $$2 = this.b.a(kf.h.a($$0.d()));
      return $$2 == null ? -1 : $$2.getColor($$0, $$1);
   }

   public void a(eyv $$0, cvq... $$1) {
      for (cvq $$2 : $$1) {
         this.b.a($$0, coy.a($$2.j()));
      }
   }
}
