import it.unimi.dsi.fastutil.ints.IntList;

public class fdg {
   private static final int a = -1;
   private final it<fdf> b = new it<>(32);

   public static fdg a(fdc $$0) {
      fdg $$1 = new fdg();
      $$1.a(($$0x, $$1x) -> $$1x > 0 ? -1 : cuf.a($$0x, -6265536), crv.px, crv.py, crv.pz, crv.pA, crv.uH);
      $$1.a(($$0x, $$1x) -> $$1x != 1 ? -1 : cuf.a($$0x, 0), crv.oq);
      $$1.a(($$0x, $$1x) -> cze.a(0.5, 1.0), dcj.iH, dcj.iI);
      $$1.a(($$0x, $$1x) -> {
         if ($$1x != 1) {
            return -1;
         } else {
            cug $$2x = $$0x.a(jr.J);
            IntList $$3 = $$2x != null ? $$2x.b() : IntList.of();
            int $$4 = $$3.size();
            if ($$4 == 0) {
               return -7697782;
            } else if ($$4 == 1) {
               return aww.b.e($$3.getInt(0));
            } else {
               int $$5 = 0;
               int $$6 = 0;
               int $$7 = 0;

               for (int $$8 = 0; $$8 < $$4; $$8++) {
                  int $$9 = $$3.getInt($$8);
                  $$5 += aww.b.b($$9);
                  $$6 += aww.b.c($$9);
                  $$7 += aww.b.d($$9);
               }

               return aww.b.a($$5 / $$4, $$6 / $$4, $$7 / $$4);
            }
         }
      }, crv.ut);
      $$1.a(($$0x, $$1x) -> $$1x > 0 ? -1 : aww.b.e($$0x.a(jr.x, ctq.a).b()), crv.sj, crv.vm, crv.vp, crv.vo);

      for (csw $$2 : csw.h()) {
         $$1.a(($$1x, $$2x) -> aww.b.e($$2.a($$2x)), $$2);
      }

      $$1.a(($$1x, $$2x) -> {
         dpi $$3 = ((cpq)$$1x.f()).d().n();
         return $$0.a($$3, null, null, $$2x);
      }, dcj.i, dcj.bt, dcj.bu, dcj.ff, dcj.aE, dcj.aF, dcj.aG, dcj.aH, dcj.aI, dcj.aK, dcj.fm);
      $$1.a(($$0x, $$1x) -> cza.d(), dcj.aL);
      $$1.a(($$0x, $$1x) -> $$1x == 0 ? -1 : aww.b.e($$0x.a(jr.r, cun.c).a()), crv.rT);
      return $$1;
   }

   public int a(crs $$0, int $$1) {
      fdf $$2 = this.b.a(kt.h.a($$0.f()));
      return $$2 == null ? -1 : $$2.getColor($$0, $$1);
   }

   public void a(fdf $$0, czf... $$1) {
      for (czf $$2 : $$1) {
         this.b.a($$0, crn.a($$2.p()));
      }
   }
}
