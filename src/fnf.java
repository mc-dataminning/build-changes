import it.unimi.dsi.fastutil.ints.IntList;

public class fnf {
   private static final int a = -1;
   private final jw<fne> b = new jw<>(32);

   public static fnf a(fnb $$0) {
      fnf $$1 = new fnf();
      $$1.a(($$0x, $$1x) -> $$1x > 0 ? -1 : czy.a($$0x, -6265536), cxo.pU, cxo.pV, cxo.pW, cxo.pX, cxo.vz);
      $$1.a(($$0x, $$1x) -> $$1x != 1 ? -1 : czy.a($$0x, 0), cxo.oN);
      $$1.a(($$0x, $$1x) -> dgy.a(0.5, 1.0), dkg.iY, dkg.iZ);
      $$1.a(($$0x, $$1x) -> {
         if ($$1x != 1) {
            return -1;
         } else {
            czz $$2x = $$0x.a(ku.ae);
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
      }, cxo.vl);
      $$1.a(($$0x, $$1x) -> $$1x > 0 ? -1 : ayp.f($$0x.a(ku.Q, czj.a).b()), cxo.sZ, cxo.we, cxo.wh, cxo.wg);

      for (cyt $$2 : cyt.b()) {
         $$1.a(($$1x, $$2x) -> ayp.f($$2.a($$2x)), $$2);
      }

      $$1.a(($$1x, $$2x) -> {
         dxn $$3 = ((cvq)$$1x.h()).d().m();
         return $$0.a($$3, null, null, $$2x);
      }, dkg.i, dkg.bA, dkg.bB, dkg.ft, dkg.aK, dkg.aL, dkg.aM, dkg.aN, dkg.aO, dkg.aQ, dkg.fA);
      $$1.a(($$0x, $$1x) -> dgu.d(), dkg.aS);
      $$1.a(($$0x, $$1x) -> $$1x == 0 ? -1 : ayp.f($$0x.a(ku.K, dag.c).a()), cxo.sI);
      return $$1;
   }

   public int a(cxk $$0, int $$1) {
      fne $$2 = this.b.a(ma.g.a($$0.h()));
      return $$2 == null ? -1 : $$2.getColor($$0, $$1);
   }

   public void a(fne $$0, dgz... $$1) {
      for (dgz $$2 : $$1) {
         this.b.a($$0, cxg.a($$2.j()));
      }
   }
}
