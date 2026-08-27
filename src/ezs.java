public class ezs {
   private static final int a = -1;
   private final ir<ezr> b = new ir<>(32);

   public static ezs a(ezo $$0) {
      ezs $$1 = new ezs();
      $$1.a(($$0x, $$1x) -> $$1x > 0 ? -1 : coi.b($$0x), cpt.px, cpt.py, cpt.pz, cpt.pA, cpt.uF);
      $$1.a(($$0x, $$1x) -> cwc.a(0.5, 1.0), czh.iH, czh.iI);
      $$1.a(($$0x, $$1x) -> {
         if ($$1x != 1) {
            return -1;
         } else {
            sy $$2x = $$0x.c("Explosion");
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
      }, cpt.ur);
      $$1.a(($$0x, $$1x) -> $$1x > 0 ? -1 : cro.c($$0x), cpt.sj, cpt.vk, cpt.vn);

      for (cqv $$2 : cqv.h()) {
         $$1.a(($$1x, $$2x) -> $$2.a($$2x), $$2);
      }

      $$1.a(($$1x, $$2x) -> {
         dme $$3 = ((cnl)$$1x.d()).d().o();
         return $$0.a($$3, null, null, $$2x);
      }, czh.i, czh.bt, czh.bu, czh.ff, czh.aE, czh.aF, czh.aG, czh.aH, czh.aI, czh.aK, czh.fm);
      $$1.a(($$0x, $$1x) -> cvy.d(), czh.aL);
      $$1.a(($$0x, $$1x) -> $$1x == 0 ? cro.c($$0x) : -1, cpt.vm);
      $$1.a(($$0x, $$1x) -> $$1x == 0 ? -1 : cpx.o($$0x), cpt.rT);
      return $$1;
   }

   public int a(cpq $$0, int $$1) {
      ezr $$2 = this.b.a(kh.h.a($$0.d()));
      return $$2 == null ? -1 : $$2.getColor($$0, $$1);
   }

   public void a(ezr $$0, cwd... $$1) {
      for (cwd $$2 : $$1) {
         this.b.a($$0, cpl.a($$2.l()));
      }
   }
}
