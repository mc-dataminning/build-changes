import it.unimi.dsi.fastutil.ints.IntList;

public class fgu {
   private static final int a = -1;
   private final jp<fgt> b = new jp<>(32);

   public static fgu a(fgq $$0) {
      fgu $$1 = new fgu();
      $$1.a(($$0x, $$1x) -> $$1x > 0 ? -1 : cwr.a($$0x, -6265536), cud.py, cud.pz, cud.pA, cud.pB, cud.uJ);
      $$1.a(($$0x, $$1x) -> $$1x != 1 ? -1 : cwr.a($$0x, 0), cud.or);
      $$1.a(($$0x, $$1x) -> dcb.a(0.5, 1.0), dfh.iH, dfh.iI);
      $$1.a(($$0x, $$1x) -> {
         if ($$1x != 1) {
            return -1;
         } else {
            cws $$2x = $$0x.a(kn.T);
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
      }, cud.uv);
      $$1.a(($$0x, $$1x) -> $$1x > 0 ? -1 : axo.b.e($$0x.a(kn.G, cwb.a).b()), cud.sk, cud.vo, cud.vr, cud.vq);

      for (cvh $$2 : cvh.h()) {
         $$1.a(($$1x, $$2x) -> axo.b.e($$2.a($$2x)), $$2);
      }

      $$1.a(($$1x, $$2x) -> {
         dsh $$3 = ((cry)$$1x.g()).d().o();
         return $$0.a($$3, null, null, $$2x);
      }, dfh.i, dfh.bt, dfh.bu, dfh.ff, dfh.aE, dfh.aF, dfh.aG, dfh.aH, dfh.aI, dfh.aK, dfh.fm);
      $$1.a(($$0x, $$1x) -> dbx.d(), dfh.aL);
      $$1.a(($$0x, $$1x) -> $$1x == 0 ? -1 : axo.b.e($$0x.a(kn.A, cwz.c).a()), cud.rU);
      return $$1;
   }

   public int a(cua $$0, int $$1) {
      fgt $$2 = this.b.a(lq.g.a($$0.g()));
      return $$2 == null ? -1 : $$2.getColor($$0, $$1);
   }

   public void a(fgt $$0, dcc... $$1) {
      for (dcc $$2 : $$1) {
         this.b.a($$0, ctv.a($$2.r()));
      }
   }
}
