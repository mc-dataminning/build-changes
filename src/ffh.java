import it.unimi.dsi.fastutil.ints.IntList;

public class ffh {
   private static final int a = -1;
   private final jd<ffg> b = new jd<>(32);

   public static ffh a(ffd $$0) {
      ffh $$1 = new ffh();
      $$1.a(($$0x, $$1x) -> $$1x > 0 ? -1 : cwg.a($$0x, -6265536), ctr.py, ctr.pz, ctr.pA, ctr.pB, ctr.uJ);
      $$1.a(($$0x, $$1x) -> $$1x != 1 ? -1 : cwg.a($$0x, 0), ctr.or);
      $$1.a(($$0x, $$1x) -> dav.a(0.5, 1.0), dea.iH, dea.iI);
      $$1.a(($$0x, $$1x) -> {
         if ($$1x != 1) {
            return -1;
         } else {
            cwh $$2x = $$0x.a(kb.S);
            IntList $$3 = $$2x != null ? $$2x.b() : IntList.of();
            int $$4 = $$3.size();
            if ($$4 == 0) {
               return -7697782;
            } else if ($$4 == 1) {
               return axo.b.e($$3.getInt(0));
            } else {
               int $$5 = 0;
               int $$6 = 0;
               int $$7 = 0;

               for (int $$8 = 0; $$8 < $$4; $$8++) {
                  int $$9 = $$3.getInt($$8);
                  $$5 += axo.b.b($$9);
                  $$6 += axo.b.c($$9);
                  $$7 += axo.b.d($$9);
               }

               return axo.b.a($$5 / $$4, $$6 / $$4, $$7 / $$4);
            }
         }
      }, ctr.uv);
      $$1.a(($$0x, $$1x) -> $$1x > 0 ? -1 : axo.b.e($$0x.a(kb.F, cvp.a).b()), ctr.sk, ctr.vo, ctr.vr, ctr.vq);

      for (cuv $$2 : cuv.h()) {
         $$1.a(($$1x, $$2x) -> axo.b.e($$2.a($$2x)), $$2);
      }

      $$1.a(($$1x, $$2x) -> {
         drb $$3 = ((crm)$$1x.g()).d().n();
         return $$0.a($$3, null, null, $$2x);
      }, dea.i, dea.bt, dea.bu, dea.ff, dea.aE, dea.aF, dea.aG, dea.aH, dea.aI, dea.aK, dea.fm);
      $$1.a(($$0x, $$1x) -> dar.d(), dea.aL);
      $$1.a(($$0x, $$1x) -> $$1x == 0 ? -1 : axo.b.e($$0x.a(kb.z, cwo.c).a()), ctr.rU);
      return $$1;
   }

   public int a(cto $$0, int $$1) {
      ffg $$2 = this.b.a(le.h.a($$0.g()));
      return $$2 == null ? -1 : $$2.getColor($$0, $$1);
   }

   public void a(ffg $$0, daw... $$1) {
      for (daw $$2 : $$1) {
         this.b.a($$0, ctj.a($$2.q()));
      }
   }
}
