import java.util.Map;

public class cdy extends bof<cds> {
   public cdy() {
      super(Map.of(bvq.o, bvr.a, bvq.m, bvr.b, bvq.aU, bvr.b, bvq.aV, bvr.b));
   }

   protected boolean a(ane $$0, cds $$1) {
      return $$1.aC() && !$$1.aZ() && $$1.ap() == bna.a;
   }

   protected void a(ane $$0, cds $$1, long $$2) {
      bmo $$3 = $$1.dN().c(bvq.o).orElse(null);
      if ($$3 != null) {
         boolean $$4 = $$1.j($$3.dj());
         emc $$5 = null;
         if ($$4) {
            emc $$6 = bxh.a($$1, 5, 5, $$3.dj());
            if ($$6 != null && cdu.a($$1, $$6) && $$3.i($$6.c, $$6.d, $$6.e) > $$3.f($$1)) {
               $$5 = $$6;
            }
         }

         if ($$5 == null) {
            $$5 = $$1.eg().h() ? cdu.a($$3, $$1.eg()) : a($$1, $$3);
         }

         $$1.dN().a(bvq.m, new bvt(hx.a($$5), 0.6F, 1));
      }
   }

   private static emc a(cds $$0, bmo $$1) {
      emc $$2 = $$1.dj().d($$0.dj());
      double $$3 = $$2.f() - aup.d($$0.eg().j(), 8.0, 4.0);
      emc $$4 = $$2.d().d($$3, $$3, $$3);
      return $$0.dj().e($$4);
   }
}
