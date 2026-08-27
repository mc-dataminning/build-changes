import it.unimi.dsi.fastutil.ints.IntList;

public class fhr {
   private static final int a = -1;
   private final jg<fhq> b = new jg<>(32);

   public static fhr a(fhn $$0) {
      fhr $$1 = new fhr();
      $$1.a(($$0x, $$1x) -> $$1x > 0 ? -1 : cxi.a($$0x, -6265536), cuk.qR, cuk.qS, cuk.qT, cuk.qU, cuk.wu);
      $$1.a(($$0x, $$1x) -> $$1x != 1 ? -1 : cxi.a($$0x, 0), cuk.pH);
      $$1.a(($$0x, $$1x) -> dby.a(0.5, 1.0), dfe.jB, dfe.jC);
      $$1.a(($$0x, $$1x) -> {
         if ($$1x != 1) {
            return -1;
         } else {
            cxj $$2x = $$0x.a(ke.S);
            IntList $$3 = $$2x != null ? $$2x.b() : IntList.of();
            int $$4 = $$3.size();
            if ($$4 == 0) {
               return -7697782;
            } else if ($$4 == 1) {
               return axw.b.e($$3.getInt(0));
            } else {
               int $$5 = 0;
               int $$6 = 0;
               int $$7 = 0;

               for (int $$8 = 0; $$8 < $$4; $$8++) {
                  int $$9 = $$3.getInt($$8);
                  $$5 += axw.b.b($$9);
                  $$6 += axw.b.c($$9);
                  $$7 += axw.b.d($$9);
               }

               return axw.b.a($$5 / $$4, $$6 / $$4, $$7 / $$4);
            }
         }
      }, cuk.wg);
      $$1.a(($$0x, $$1x) -> $$1x > 0 ? -1 : axw.b.e($$0x.a(ke.E, cwr.a).b()), cuk.tH, cuk.wZ, cuk.xc, cuk.xb);

      for (cvw $$2 : cvw.d()) {
         $$1.a(($$1x, $$2x) -> axw.b.e($$2.a($$2x)), $$2);
      }

      $$1.a(($$1x, $$2x) -> {
         dtc $$3 = ((csc)$$1x.f()).d().n();
         return $$0.a($$3, null, null, $$2x);
      }, dfe.j, dfe.cd, dfe.ce, dfe.fX, dfe.tH, dfe.bm, dfe.bn, dfe.bo, dfe.bp, dfe.bq, dfe.bs, dfe.ge);
      $$1.a(($$0x, $$1x) -> dbu.d(), dfe.bt);
      $$1.a(($$0x, $$1x) -> $$1x == 0 ? -1 : axw.b.e($$0x.a(ke.y, cxq.c).a()), cuk.tr);
      return $$1;
   }

   public int a(cuh $$0, int $$1) {
      fhq $$2 = this.b.a(lh.h.a($$0.f()));
      return $$2 == null ? -1 : $$2.getColor($$0, $$1);
   }

   public void a(fhq $$0, dbz... $$1) {
      for (dbz $$2 : $$1) {
         this.b.a($$0, cuc.a($$2.q()));
      }
   }
}
