import com.google.common.collect.ImmutableMap;

public class cbn extends bxr<cou> {
   private static final int c = 25;
   private static final int d = 20;

   public cbn() {
      super(ImmutableMap.of(cfc.ay, cfd.a, cfc.o, cfd.b, cfc.aF, cfd.c, cfc.aD, cfd.c), cov.b);
   }

   protected void a(ard $$0, cou $$1, long $$2) {
      bxa<cou> $$3 = $$1.ea();
      $$3.a(cfc.aD, baf.a, 25L);
      $$3.b(cfc.m);
      bvy $$4 = $$1.ea().c(cfc.ay).get();
      bxt.a($$1, $$4);
      $$1.b(bwk.l);
      $$1.a($$4, 20, false);
   }

   protected boolean b(ard $$0, cou $$1, long $$2) {
      return true;
   }

   protected void c(ard $$0, cou $$1, long $$2) {
      if (!$$1.ea().a(cfc.aD) && !$$1.ea().a(cfc.aF)) {
         $$1.ea().a(cfc.aF, baf.a, (long)(cov.b - 25));
         $$1.a(awa.CS, 3.0F, 1.0F);
      }
   }

   protected void d(ard $$0, cou $$1, long $$2) {
      if ($$1.c(bwk.l)) {
         $$1.b(bwk.a);
      }

      $$1.ea().c(cfc.ay).ifPresent($$1::j);
      $$1.ea().b(cfc.ay);
   }
}
