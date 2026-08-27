import it.unimi.dsi.fastutil.ints.IntList;

public class fec {
   private static final int a = -1;
   private final jb<feb> b = new jb<>(32);

   public static fec a(fdy $$0) {
      fec $$1 = new fec();
      $$1.a(($$0x, $$1x) -> $$1x > 0 ? -1 : cut.a($$0x, -6265536), csg.py, csg.pz, csg.pA, csg.pB, csg.uJ);
      $$1.a(($$0x, $$1x) -> $$1x != 1 ? -1 : cut.a($$0x, 0), csg.or);
      $$1.a(($$0x, $$1x) -> czs.a(0.5, 1.0), dcx.iH, dcx.iI);
      $$1.a(($$0x, $$1x) -> {
         if ($$1x != 1) {
            return -1;
         } else {
            cuu $$2x = $$0x.a(jz.J);
            IntList $$3 = $$2x != null ? $$2x.b() : IntList.of();
            int $$4 = $$3.size();
            if ($$4 == 0) {
               return -7697782;
            } else if ($$4 == 1) {
               return axg.b.e($$3.getInt(0));
            } else {
               int $$5 = 0;
               int $$6 = 0;
               int $$7 = 0;

               for (int $$8 = 0; $$8 < $$4; $$8++) {
                  int $$9 = $$3.getInt($$8);
                  $$5 += axg.b.b($$9);
                  $$6 += axg.b.c($$9);
                  $$7 += axg.b.d($$9);
               }

               return axg.b.a($$5 / $$4, $$6 / $$4, $$7 / $$4);
            }
         }
      }, csg.uv);
      $$1.a(($$0x, $$1x) -> $$1x > 0 ? -1 : axg.b.e($$0x.a(jz.x, cuc.a).b()), csg.sk, csg.vo, csg.vr, csg.vq);

      for (cti $$2 : cti.h()) {
         $$1.a(($$1x, $$2x) -> axg.b.e($$2.a($$2x)), $$2);
      }

      $$1.a(($$1x, $$2x) -> {
         dpy $$3 = ((cqb)$$1x.f()).d().n();
         return $$0.a($$3, null, null, $$2x);
      }, dcx.i, dcx.bt, dcx.bu, dcx.ff, dcx.aE, dcx.aF, dcx.aG, dcx.aH, dcx.aI, dcx.aK, dcx.fm);
      $$1.a(($$0x, $$1x) -> czo.d(), dcx.aL);
      $$1.a(($$0x, $$1x) -> $$1x == 0 ? -1 : axg.b.e($$0x.a(jz.r, cvb.c).a()), csg.rU);
      return $$1;
   }

   public int a(csd $$0, int $$1) {
      feb $$2 = this.b.a(lc.h.a($$0.f()));
      return $$2 == null ? -1 : $$2.getColor($$0, $$1);
   }

   public void a(feb $$0, czt... $$1) {
      for (czt $$2 : $$1) {
         this.b.a($$0, cry.a($$2.p()));
      }
   }
}
