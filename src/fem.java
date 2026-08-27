import it.unimi.dsi.fastutil.ints.IntList;

public class fem {
   private static final int a = -1;
   private final jc<fel> b = new jc<>(32);

   public static fem a(fei $$0) {
      fem $$1 = new fem();
      $$1.a(($$0x, $$1x) -> $$1x > 0 ? -1 : cvp.a($$0x, -6265536), ctc.py, ctc.pz, ctc.pA, ctc.pB, ctc.uJ);
      $$1.a(($$0x, $$1x) -> $$1x != 1 ? -1 : cvp.a($$0x, 0), ctc.or);
      $$1.a(($$0x, $$1x) -> dab.a(0.5, 1.0), ddg.iH, ddg.iI);
      $$1.a(($$0x, $$1x) -> {
         if ($$1x != 1) {
            return -1;
         } else {
            cvq $$2x = $$0x.a(ka.Q);
            IntList $$3 = $$2x != null ? $$2x.b() : IntList.of();
            int $$4 = $$3.size();
            if ($$4 == 0) {
               return -7697782;
            } else if ($$4 == 1) {
               return axj.b.e($$3.getInt(0));
            } else {
               int $$5 = 0;
               int $$6 = 0;
               int $$7 = 0;

               for (int $$8 = 0; $$8 < $$4; $$8++) {
                  int $$9 = $$3.getInt($$8);
                  $$5 += axj.b.b($$9);
                  $$6 += axj.b.c($$9);
                  $$7 += axj.b.d($$9);
               }

               return axj.b.a($$5 / $$4, $$6 / $$4, $$7 / $$4);
            }
         }
      }, ctc.uv);
      $$1.a(($$0x, $$1x) -> $$1x > 0 ? -1 : axj.b.e($$0x.a(ka.E, cuy.a).b()), ctc.sk, ctc.vo, ctc.vr, ctc.vq);

      for (cue $$2 : cue.h()) {
         $$1.a(($$1x, $$2x) -> axj.b.e($$2.a($$2x)), $$2);
      }

      $$1.a(($$1x, $$2x) -> {
         dqh $$3 = ((cqx)$$1x.f()).d().n();
         return $$0.a($$3, null, null, $$2x);
      }, ddg.i, ddg.bt, ddg.bu, ddg.ff, ddg.aE, ddg.aF, ddg.aG, ddg.aH, ddg.aI, ddg.aK, ddg.fm);
      $$1.a(($$0x, $$1x) -> czx.d(), ddg.aL);
      $$1.a(($$0x, $$1x) -> $$1x == 0 ? -1 : axj.b.e($$0x.a(ka.y, cvx.c).a()), ctc.rU);
      return $$1;
   }

   public int a(csz $$0, int $$1) {
      fel $$2 = this.b.a(ld.h.a($$0.f()));
      return $$2 == null ? -1 : $$2.getColor($$0, $$1);
   }

   public void a(fel $$0, dac... $$1) {
      for (dac $$2 : $$1) {
         this.b.a($$0, csu.a($$2.q()));
      }
   }
}
