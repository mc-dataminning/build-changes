import it.unimi.dsi.fastutil.ints.IntList;

public class fnf {
   private static final int a = -1;
   private final jw<fne> b = new jw<>(32);

   public static fnf a(fnb $$0) {
      fnf $$1 = new fnf();
      $$1.a(($$0x, $$1x) -> $$1x > 0 ? -1 : czu.a($$0x, -6265536), cxk.qd, cxk.qe, cxk.qf, cxk.qg, cxk.vJ);
      $$1.a(($$0x, $$1x) -> $$1x != 1 ? -1 : czu.a($$0x, 0), cxk.oW);
      $$1.a(($$0x, $$1x) -> dgx.a(0.5, 1.0), dkf.jf, dkf.jg);
      $$1.a(($$0x, $$1x) -> {
         if ($$1x != 1) {
            return -1;
         } else {
            czv $$2x = $$0x.a(ku.ae);
            IntList $$3 = $$2x != null ? $$2x.b() : IntList.of();
            int $$4 = $$3.size();
            if ($$4 == 0) {
               return -7697782;
            } else if ($$4 == 1) {
               return ayf.f($$3.getInt(0));
            } else {
               int $$5 = 0;
               int $$6 = 0;
               int $$7 = 0;

               for (int $$8 = 0; $$8 < $$4; $$8++) {
                  int $$9 = $$3.getInt($$8);
                  $$5 += ayf.b($$9);
                  $$6 += ayf.c($$9);
                  $$7 += ayf.d($$9);
               }

               return ayf.a($$5 / $$4, $$6 / $$4, $$7 / $$4);
            }
         }
      }, cxk.vu);
      $$1.a(($$0x, $$1x) -> $$1x > 0 ? -1 : ayf.f($$0x.a(ku.Q, czf.a).b()), cxk.ti, cxk.wo, cxk.wr, cxk.wq);

      for (cyp $$2 : cyp.b()) {
         $$1.a(($$1x, $$2x) -> ayf.f($$2.a($$2x)), $$2);
      }

      $$1.a(($$1x, $$2x) -> {
         dxo $$3 = ((cvm)$$1x.h()).d().m();
         return $$0.a($$3, null, null, $$2x);
      }, dkf.i, dkf.bA, dkf.bB, dkf.ft, dkf.aK, dkf.aL, dkf.aM, dkf.aN, dkf.aO, dkf.aQ, dkf.fB);
      $$1.a(($$0x, $$1x) -> dgt.d(), dkf.aS);
      $$1.a(($$0x, $$1x) -> $$1x == 0 ? -1 : ayf.f($$0x.a(ku.K, dac.c).a()), cxk.sR);
      return $$1;
   }

   public int a(cxg $$0, int $$1) {
      fne $$2 = this.b.a(ma.g.a($$0.h()));
      return $$2 == null ? -1 : $$2.getColor($$0, $$1);
   }

   public void a(fne $$0, dgy... $$1) {
      for (dgy $$2 : $$1) {
         this.b.a($$0, cxc.a($$2.j()));
      }
   }
}
