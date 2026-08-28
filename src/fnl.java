import it.unimi.dsi.fastutil.ints.IntList;

public class fnl {
   private static final int a = -1;
   private final jw<fnk> b = new jw<>(32);

   public static fnl a(fnh $$0) {
      fnl $$1 = new fnl();
      $$1.a(($$0x, $$1x) -> $$1x > 0 ? -1 : dac.a($$0x, -6265536), cxs.pU, cxs.pV, cxs.pW, cxs.pX, cxs.vz);
      $$1.a(($$0x, $$1x) -> $$1x != 1 ? -1 : dac.a($$0x, 0), cxs.oN);
      $$1.a(($$0x, $$1x) -> dhf.a(0.5, 1.0), dkn.iY, dkn.iZ);
      $$1.a(($$0x, $$1x) -> {
         if ($$1x != 1) {
            return -1;
         } else {
            dad $$2x = $$0x.a(ku.ae);
            IntList $$3 = $$2x != null ? $$2x.b() : IntList.of();
            int $$4 = $$3.size();
            if ($$4 == 0) {
               return -7697782;
            } else if ($$4 == 1) {
               return ayp.f($$3.getInt(0));
            } else {
               int $$5 = 0;
               int $$6 = 0;
               int $$7 = 0;

               for (int $$8 = 0; $$8 < $$4; $$8++) {
                  int $$9 = $$3.getInt($$8);
                  $$5 += ayp.b($$9);
                  $$6 += ayp.c($$9);
                  $$7 += ayp.d($$9);
               }

               return ayp.a($$5 / $$4, $$6 / $$4, $$7 / $$4);
            }
         }
      }, cxs.vl);
      $$1.a(($$0x, $$1x) -> $$1x > 0 ? -1 : ayp.f($$0x.a(ku.Q, czn.a).b()), cxs.sZ, cxs.we, cxs.wh, cxs.wg);

      for (cyx $$2 : cyx.b()) {
         $$1.a(($$1x, $$2x) -> ayp.f($$2.a($$2x)), $$2);
      }

      $$1.a(($$1x, $$2x) -> {
         dxu $$3 = ((cvu)$$1x.h()).d().m();
         return $$0.a($$3, null, null, $$2x);
      }, dkn.i, dkn.bA, dkn.bB, dkn.ft, dkn.aK, dkn.aL, dkn.aM, dkn.aN, dkn.aO, dkn.aQ, dkn.fA);
      $$1.a(($$0x, $$1x) -> dhb.d(), dkn.aS);
      $$1.a(($$0x, $$1x) -> $$1x == 0 ? -1 : ayp.f($$0x.a(ku.K, dak.c).a()), cxs.sI);
      return $$1;
   }

   public int a(cxo $$0, int $$1) {
      fnk $$2 = this.b.a(ma.g.a($$0.h()));
      return $$2 == null ? -1 : $$2.getColor($$0, $$1);
   }

   public void a(fnk $$0, dhg... $$1) {
      for (dhg $$2 : $$1) {
         this.b.a($$0, cxk.a($$2.j()));
      }
   }
}
