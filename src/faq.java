public class faq {
   private static final int a = -1;
   private final ir<fap> b = new ir<>(32);

   public static faq a(fam $$0) {
      faq $$1 = new faq();
      $$1.a(($$0x, $$1x) -> $$1x > 0 ? -1 : cpf.b($$0x), cqp.px, cqp.py, cqp.pz, cqp.pA, cqp.uH);
      $$1.a(($$0x, $$1x) -> cwz.a(0.5, 1.0), dae.iH, dae.iI);
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
      }, cqp.ut);
      $$1.a(($$0x, $$1x) -> $$1x > 0 ? -1 : csl.c($$0x), cqp.sj, cqp.vm, cqp.vp);

      for (crr $$2 : crr.h()) {
         $$1.a(($$1x, $$2x) -> $$2.a($$2x), $$2);
      }

      $$1.a(($$1x, $$2x) -> {
         dnb $$3 = ((coh)$$1x.d()).d().o();
         return $$0.a($$3, null, null, $$2x);
      }, dae.i, dae.bt, dae.bu, dae.ff, dae.aE, dae.aF, dae.aG, dae.aH, dae.aI, dae.aK, dae.fm);
      $$1.a(($$0x, $$1x) -> cwv.d(), dae.aL);
      $$1.a(($$0x, $$1x) -> $$1x == 0 ? csl.c($$0x) : -1, cqp.vo);
      $$1.a(($$0x, $$1x) -> $$1x == 0 ? -1 : cqt.o($$0x), cqp.rT);
      return $$1;
   }

   public int a(cqm $$0, int $$1) {
      fap $$2 = this.b.a(ki.h.a($$0.d()));
      return $$2 == null ? -1 : $$2.getColor($$0, $$1);
   }

   public void a(fap $$0, cxa... $$1) {
      for (cxa $$2 : $$1) {
         this.b.a($$0, cqh.a($$2.l()));
      }
   }
}
