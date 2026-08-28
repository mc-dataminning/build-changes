import it.unimi.dsi.fastutil.ints.IntList;

public class fjv {
   private static final int a = -1;
   private final ju<fju> b = new ju<>(32);

   public static fjv a(fjr $$0) {
      fjv $$1 = new fjv();
      $$1.a(($$0x, $$1x) -> $$1x > 0 ? -1 : cyk.a($$0x, -6265536), cvw.pz, cvw.pA, cvw.pB, cvw.pC, cvw.uL);
      $$1.a(($$0x, $$1x) -> $$1x != 1 ? -1 : cyk.a($$0x, 0), cvw.os);
      $$1.a(($$0x, $$1x) -> deh.a(0.5, 1.0), dho.iH, dho.iI);
      $$1.a(($$0x, $$1x) -> {
         if ($$1x != 1) {
            return -1;
         } else {
            cyl $$2x = $$0x.a(ks.Z);
            IntList $$3 = $$2x != null ? $$2x.b() : IntList.of();
            int $$4 = $$3.size();
            if ($$4 == 0) {
               return -7697782;
            } else if ($$4 == 1) {
               return axq.f($$3.getInt(0));
            } else {
               int $$5 = 0;
               int $$6 = 0;
               int $$7 = 0;

               for (int $$8 = 0; $$8 < $$4; $$8++) {
                  int $$9 = $$3.getInt($$8);
                  $$5 += axq.b($$9);
                  $$6 += axq.c($$9);
                  $$7 += axq.d($$9);
               }

               return axq.a($$5 / $$4, $$6 / $$4, $$7 / $$4);
            }
         }
      }, cvw.ux);
      $$1.a(($$0x, $$1x) -> $$1x > 0 ? -1 : axq.f($$0x.a(ks.L, cxr.a).b()), cvw.sm, cvw.vq, cvw.vt, cvw.vs);

      for (cxb $$2 : cxb.c()) {
         $$1.a(($$1x, $$2x) -> axq.f($$2.a($$2x)), $$2);
      }

      $$1.a(($$1x, $$2x) -> {
         dus $$3 = ((ctu)$$1x.h()).d().n();
         return $$0.a($$3, null, null, $$2x);
      }, dho.i, dho.bt, dho.bu, dho.ff, dho.aE, dho.aF, dho.aG, dho.aH, dho.aI, dho.aK, dho.fm);
      $$1.a(($$0x, $$1x) -> ded.d(), dho.aL);
      $$1.a(($$0x, $$1x) -> $$1x == 0 ? -1 : axq.f($$0x.a(ks.F, cys.c).a()), cvw.rV);
      return $$1;
   }

   public int a(cvs $$0, int $$1) {
      fju $$2 = this.b.a(lv.g.a($$0.h()));
      return $$2 == null ? -1 : $$2.getColor($$0, $$1);
   }

   public void a(fju $$0, dei... $$1) {
      for (dei $$2 : $$1) {
         this.b.a($$0, cvn.a($$2.q()));
      }
   }
}
