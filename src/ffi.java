import it.unimi.dsi.fastutil.ints.IntList;

public class ffi {
   private static final int a = -1;
   private final jd<ffh> b = new jd<>(32);

   public static ffi a(ffe $$0) {
      ffi $$1 = new ffi();
      $$1.a(($$0x, $$1x) -> $$1x > 0 ? -1 : cwi.a($$0x, -6265536), ctt.py, ctt.pz, ctt.pA, ctt.pB, ctt.uJ);
      $$1.a(($$0x, $$1x) -> $$1x != 1 ? -1 : cwi.a($$0x, 0), ctt.or);
      $$1.a(($$0x, $$1x) -> dax.a(0.5, 1.0), dec.iH, dec.iI);
      $$1.a(($$0x, $$1x) -> {
         if ($$1x != 1) {
            return -1;
         } else {
            cwj $$2x = $$0x.a(kb.S);
            IntList $$3 = $$2x != null ? $$2x.b() : IntList.of();
            int $$4 = $$3.size();
            if ($$4 == 0) {
               return -7697782;
            } else if ($$4 == 1) {
               return axp.b.e($$3.getInt(0));
            } else {
               int $$5 = 0;
               int $$6 = 0;
               int $$7 = 0;

               for (int $$8 = 0; $$8 < $$4; $$8++) {
                  int $$9 = $$3.getInt($$8);
                  $$5 += axp.b.b($$9);
                  $$6 += axp.b.c($$9);
                  $$7 += axp.b.d($$9);
               }

               return axp.b.a($$5 / $$4, $$6 / $$4, $$7 / $$4);
            }
         }
      }, ctt.uv);
      $$1.a(($$0x, $$1x) -> $$1x > 0 ? -1 : axp.b.e($$0x.a(kb.F, cvr.a).b()), ctt.sk, ctt.vo, ctt.vr, ctt.vq);

      for (cux $$2 : cux.h()) {
         $$1.a(($$1x, $$2x) -> axp.b.e($$2.a($$2x)), $$2);
      }

      $$1.a(($$1x, $$2x) -> {
         drd $$3 = ((cro)$$1x.g()).d().n();
         return $$0.a($$3, null, null, $$2x);
      }, dec.i, dec.bt, dec.bu, dec.ff, dec.aE, dec.aF, dec.aG, dec.aH, dec.aI, dec.aK, dec.fm);
      $$1.a(($$0x, $$1x) -> dat.d(), dec.aL);
      $$1.a(($$0x, $$1x) -> $$1x == 0 ? -1 : axp.b.e($$0x.a(kb.z, cwq.c).a()), ctt.rU);
      return $$1;
   }

   public int a(ctq $$0, int $$1) {
      ffh $$2 = this.b.a(le.h.a($$0.g()));
      return $$2 == null ? -1 : $$2.getColor($$0, $$1);
   }

   public void a(ffh $$0, day... $$1) {
      for (day $$2 : $$1) {
         this.b.a($$0, ctl.a($$2.r()));
      }
   }
}
