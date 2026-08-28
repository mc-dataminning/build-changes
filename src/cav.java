import com.google.common.collect.ImmutableMap;

public class cav extends bwz<cnz> {
   private static final int c = 25;
   private static final int d = 20;

   public cav() {
      super(ImmutableMap.of(cek.ay, cel.a, cek.o, cel.b, cek.aF, cel.c, cek.aD, cel.c), coa.b);
   }

   protected void a(arc $$0, cnz $$1, long $$2) {
      bwi<cnz> $$3 = $$1.ec();
      $$3.a(cek.aD, baf.a, 25L);
      $$3.b(cek.m);
      bvg $$4 = $$1.ec().c(cek.ay).get();
      bxb.a($$1, $$4);
      $$1.b(bvs.l);
      $$1.a($$4, 20, false);
   }

   protected boolean b(arc $$0, cnz $$1, long $$2) {
      return true;
   }

   protected void c(arc $$0, cnz $$1, long $$2) {
      if (!$$1.ec().a(cek.aD) && !$$1.ec().a(cek.aF)) {
         $$1.ec().a(cek.aF, baf.a, (long)(coa.b - 25));
         $$1.a(awa.CJ, 3.0F, 1.0F);
      }
   }

   protected void d(arc $$0, cnz $$1, long $$2) {
      if ($$1.c(bvs.l)) {
         $$1.b(bvs.a);
      }

      $$1.ec().c(cek.ay).ifPresent($$1::j);
      $$1.ec().b(cek.ay);
   }
}
