import it.unimi.dsi.fastutil.ints.IntList;

public class fha {
   private static final int a = -1;
   private final jp<fgz> b = new jp<>(32);

   public static fha a(fgw $$0) {
      fha $$1 = new fha();
      $$1.a(($$0x, $$1x) -> $$1x > 0 ? -1 : cwt.a($$0x, -6265536), cuf.py, cuf.pz, cuf.pA, cuf.pB, cuf.uJ);
      $$1.a(($$0x, $$1x) -> $$1x != 1 ? -1 : cwt.a($$0x, 0), cuf.or);
      $$1.a(($$0x, $$1x) -> dcd.a(0.5, 1.0), dfj.iH, dfj.iI);
      $$1.a(($$0x, $$1x) -> {
         if ($$1x != 1) {
            return -1;
         } else {
            cwu $$2x = $$0x.a(kn.T);
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
      }, cuf.uv);
      $$1.a(($$0x, $$1x) -> $$1x > 0 ? -1 : axq.b.e($$0x.a(kn.G, cwd.a).b()), cuf.sk, cuf.vo, cuf.vr, cuf.vq);

      for (cvj $$2 : cvj.h()) {
         $$1.a(($$1x, $$2x) -> axq.b.e($$2.a($$2x)), $$2);
      }

      $$1.a(($$1x, $$2x) -> {
         dsk $$3 = ((csb)$$1x.g()).d().o();
         return $$0.a($$3, null, null, $$2x);
      }, dfj.i, dfj.bt, dfj.bu, dfj.ff, dfj.aE, dfj.aF, dfj.aG, dfj.aH, dfj.aI, dfj.aK, dfj.fm);
      $$1.a(($$0x, $$1x) -> dbz.d(), dfj.aL);
      $$1.a(($$0x, $$1x) -> $$1x == 0 ? -1 : axq.b.e($$0x.a(kn.A, cxb.c).a()), cuf.rU);
      return $$1;
   }

   public int a(cuc $$0, int $$1) {
      fgz $$2 = this.b.a(lq.g.a($$0.g()));
      return $$2 == null ? -1 : $$2.getColor($$0, $$1);
   }

   public void a(fgz $$0, dce... $$1) {
      for (dce $$2 : $$1) {
         this.b.a($$0, ctx.a($$2.r()));
      }
   }
}
