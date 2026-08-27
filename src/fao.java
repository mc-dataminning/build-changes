public class fao {
   private static final int a = -1;
   private final ir<fan> b = new ir<>(32);

   public static fao a(fak $$0) {
      fao $$1 = new fao();
      $$1.a(($$0x, $$1x) -> $$1x > 0 ? -1 : cpd.b($$0x), cqn.px, cqn.py, cqn.pz, cqn.pA, cqn.uG);
      $$1.a(($$0x, $$1x) -> cwx.a(0.5, 1.0), dac.iH, dac.iI);
      $$1.a(($$0x, $$1x) -> {
         if ($$1x != 1) {
            return -1;
         } else {
            ta $$2x = $$0x.c("Explosion");
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
      }, cqn.us);
      $$1.a(($$0x, $$1x) -> $$1x > 0 ? -1 : csj.c($$0x), cqn.sj, cqn.vl, cqn.vo);

      for (crp $$2 : crp.h()) {
         $$1.a(($$1x, $$2x) -> $$2.a($$2x), $$2);
      }

      $$1.a(($$1x, $$2x) -> {
         dmz $$3 = ((cof)$$1x.d()).d().o();
         return $$0.a($$3, null, null, $$2x);
      }, dac.i, dac.bt, dac.bu, dac.ff, dac.aE, dac.aF, dac.aG, dac.aH, dac.aI, dac.aK, dac.fm);
      $$1.a(($$0x, $$1x) -> cwt.d(), dac.aL);
      $$1.a(($$0x, $$1x) -> $$1x == 0 ? csj.c($$0x) : -1, cqn.vn);
      $$1.a(($$0x, $$1x) -> $$1x == 0 ? -1 : cqr.o($$0x), cqn.rT);
      return $$1;
   }

   public int a(cqk $$0, int $$1) {
      fan $$2 = this.b.a(ki.h.a($$0.d()));
      return $$2 == null ? -1 : $$2.getColor($$0, $$1);
   }

   public void a(fan $$0, cwy... $$1) {
      for (cwy $$2 : $$1) {
         this.b.a($$0, cqf.a($$2.l()));
      }
   }
}
