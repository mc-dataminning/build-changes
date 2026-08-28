import it.unimi.dsi.fastutil.ints.IntList;

public class fnm {
   private static final int a = -1;
   private final jw<fnl> b = new jw<>(32);

   public static fnm a(fni $$0) {
      fnm $$1 = new fnm();
      $$1.a(($$0x, $$1x) -> $$1x > 0 ? -1 : dad.a($$0x, -6265536), cxt.pU, cxt.pV, cxt.pW, cxt.pX, cxt.vz);
      $$1.a(($$0x, $$1x) -> $$1x != 1 ? -1 : dad.a($$0x, 0), cxt.oN);
      $$1.a(($$0x, $$1x) -> dhg.a(0.5, 1.0), dko.iY, dko.iZ);
      $$1.a(($$0x, $$1x) -> {
         if ($$1x != 1) {
            return -1;
         } else {
            dae $$2x = $$0x.a(ku.ae);
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
      }, cxt.vl);
      $$1.a(($$0x, $$1x) -> $$1x > 0 ? -1 : ayp.f($$0x.a(ku.Q, czo.a).b()), cxt.sZ, cxt.we, cxt.wh, cxt.wg);

      for (cyy $$2 : cyy.b()) {
         $$1.a(($$1x, $$2x) -> ayp.f($$2.a($$2x)), $$2);
      }

      $$1.a(($$1x, $$2x) -> {
         dxv $$3 = ((cvv)$$1x.h()).d().m();
         return $$0.a($$3, null, null, $$2x);
      }, dko.i, dko.bA, dko.bB, dko.ft, dko.aK, dko.aL, dko.aM, dko.aN, dko.aO, dko.aQ, dko.fA);
      $$1.a(($$0x, $$1x) -> dhc.d(), dko.aS);
      $$1.a(($$0x, $$1x) -> $$1x == 0 ? -1 : ayp.f($$0x.a(ku.K, dal.c).a()), cxt.sI);
      return $$1;
   }

   public int a(cxp $$0, int $$1) {
      fnl $$2 = this.b.a(ma.g.a($$0.h()));
      return $$2 == null ? -1 : $$2.getColor($$0, $$1);
   }

   public void a(fnl $$0, dhh... $$1) {
      for (dhh $$2 : $$1) {
         this.b.a($$0, cxl.a($$2.j()));
      }
   }
}
