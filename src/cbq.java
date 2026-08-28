import com.google.common.collect.ImmutableMap;

public class cbq extends bxu<cov> {
   private static final int c = 25;
   private static final int d = 20;

   public cbq() {
      super(ImmutableMap.of(cff.ay, cfg.a, cff.o, cfg.b, cff.aF, cfg.c, cff.aD, cfg.c), cow.b);
   }

   protected void a(ash $$0, cov $$1, long $$2) {
      bxd<cov> $$3 = $$1.eb();
      $$3.a(cff.aD, bbk.a, 25L);
      $$3.b(cff.m);
      bwb $$4 = $$1.eb().c(cff.ay).get();
      bxw.a($$1, $$4);
      $$1.b(bwn.l);
      $$1.a($$4, 20, false);
   }

   protected boolean b(ash $$0, cov $$1, long $$2) {
      return true;
   }

   protected void c(ash $$0, cov $$1, long $$2) {
      if (!$$1.eb().a(cff.aD) && !$$1.eb().a(cff.aF)) {
         $$1.eb().a(cff.aF, bbk.a, (long)(cow.b - 25));
         $$1.a(axf.Cs, 3.0F, 1.0F);
      }
   }

   protected void d(ash $$0, cov $$1, long $$2) {
      if ($$1.c(bwn.l)) {
         $$1.b(bwn.a);
      }

      $$1.eb().c(cff.ay).ifPresent($$1::j);
      $$1.eb().b(cff.ay);
   }
}
