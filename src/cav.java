import com.google.common.collect.ImmutableMap;

public class cav extends bwz<cny> {
   private static final int c = 25;
   private static final int d = 20;

   public cav() {
      super(ImmutableMap.of(cek.ay, cel.a, cek.o, cel.b, cek.aF, cel.c, cek.aD, cel.c), cnz.b);
   }

   protected void a(ard $$0, cny $$1, long $$2) {
      bwi<cny> $$3 = $$1.eb();
      $$3.a(cek.aD, baf.a, 25L);
      $$3.b(cek.m);
      bvg $$4 = $$1.eb().c(cek.ay).get();
      bxb.a($$1, $$4);
      $$1.b(bvs.l);
      $$1.a($$4, 20, false);
   }

   protected boolean b(ard $$0, cny $$1, long $$2) {
      return true;
   }

   protected void c(ard $$0, cny $$1, long $$2) {
      if (!$$1.eb().a(cek.aD) && !$$1.eb().a(cek.aF)) {
         $$1.eb().a(cek.aF, baf.a, (long)(cnz.b - 25));
         $$1.a(awa.CI, 3.0F, 1.0F);
      }
   }

   protected void d(ard $$0, cny $$1, long $$2) {
      if ($$1.c(bvs.l)) {
         $$1.b(bvs.a);
      }

      $$1.eb().c(cek.ay).ifPresent($$1::j);
      $$1.eb().b(cek.ay);
   }
}
