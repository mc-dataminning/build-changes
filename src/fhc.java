import it.unimi.dsi.fastutil.ints.IntList;

public class fhc {
   private static final int a = -1;
   private final jp<fhb> b = new jp<>(32);

   public static fhc a(fgy $$0) {
      fhc $$1 = new fhc();
      $$1.a(($$0x, $$1x) -> $$1x > 0 ? -1 : cwu.a($$0x, -6265536), cug.py, cug.pz, cug.pA, cug.pB, cug.uJ);
      $$1.a(($$0x, $$1x) -> $$1x != 1 ? -1 : cwu.a($$0x, 0), cug.or);
      $$1.a(($$0x, $$1x) -> dce.a(0.5, 1.0), dfk.iH, dfk.iI);
      $$1.a(($$0x, $$1x) -> {
         if ($$1x != 1) {
            return -1;
         } else {
            cwv $$2x = $$0x.a(kn.T);
            IntList $$3 = $$2x != null ? $$2x.b() : IntList.of();
            int $$4 = $$3.size();
            if ($$4 == 0) {
               return -7697782;
            } else if ($$4 == 1) {
               return axq.b.e($$3.getInt(0));
            } else {
               int $$5 = 0;
               int $$6 = 0;
               int $$7 = 0;

               for (int $$8 = 0; $$8 < $$4; $$8++) {
                  int $$9 = $$3.getInt($$8);
                  $$5 += axq.b.b($$9);
                  $$6 += axq.b.c($$9);
                  $$7 += axq.b.d($$9);
               }

               return axq.b.a($$5 / $$4, $$6 / $$4, $$7 / $$4);
            }
         }
      }, cug.uv);
      $$1.a(($$0x, $$1x) -> $$1x > 0 ? -1 : axq.b.e($$0x.a(kn.G, cwe.a).b()), cug.sk, cug.vo, cug.vr, cug.vq);

      for (cvk $$2 : cvk.h()) {
         $$1.a(($$1x, $$2x) -> axq.b.e($$2.a($$2x)), $$2);
      }

      $$1.a(($$1x, $$2x) -> {
         dsl $$3 = ((csc)$$1x.g()).d().o();
         return $$0.a($$3, null, null, $$2x);
      }, dfk.i, dfk.bt, dfk.bu, dfk.ff, dfk.aE, dfk.aF, dfk.aG, dfk.aH, dfk.aI, dfk.aK, dfk.fm);
      $$1.a(($$0x, $$1x) -> dca.d(), dfk.aL);
      $$1.a(($$0x, $$1x) -> $$1x == 0 ? -1 : axq.b.e($$0x.a(kn.A, cxc.c).a()), cug.rU);
      return $$1;
   }

   public int a(cud $$0, int $$1) {
      fhb $$2 = this.b.a(lq.g.a($$0.g()));
      return $$2 == null ? -1 : $$2.getColor($$0, $$1);
   }

   public void a(fhb $$0, dcf... $$1) {
      for (dcf $$2 : $$1) {
         this.b.a($$0, cty.a($$2.r()));
      }
   }
}
