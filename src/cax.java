import com.google.common.collect.ImmutableMap;

public class cax extends bxb<coa> {
   private static final int c = 25;
   private static final int d = 20;

   public cax() {
      super(ImmutableMap.of(cem.ay, cen.a, cem.o, cen.b, cem.aF, cen.c, cem.aD, cen.c), cob.b);
   }

   protected void a(ard $$0, coa $$1, long $$2) {
      bwk<coa> $$3 = $$1.eb();
      $$3.a(cem.aD, baf.a, 25L);
      $$3.b(cem.m);
      bvi $$4 = $$1.eb().c(cem.ay).get();
      bxd.a($$1, $$4);
      $$1.b(bvu.l);
      $$1.a($$4, 20, false);
   }

   protected boolean b(ard $$0, coa $$1, long $$2) {
      return true;
   }

   protected void c(ard $$0, coa $$1, long $$2) {
      if (!$$1.eb().a(cem.aD) && !$$1.eb().a(cem.aF)) {
         $$1.eb().a(cem.aF, baf.a, (long)(cob.b - 25));
         $$1.a(awa.CI, 3.0F, 1.0F);
      }
   }

   protected void d(ard $$0, coa $$1, long $$2) {
      if ($$1.c(bvu.l)) {
         $$1.b(bvu.a);
      }

      $$1.eb().c(cem.ay).ifPresent($$1::j);
      $$1.eb().b(cem.ay);
   }
}
