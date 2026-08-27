import com.google.common.collect.ImmutableMap;

public class bok extends bkp<caq> {
   private static final int c = 25;
   private static final int d = 20;

   public bok() {
      super(ImmutableMap.of(brz.ax, bsa.a, brz.o, bsa.b, brz.aE, bsa.c, brz.aC, bsa.c), car.b);
   }

   protected void a(akk $$0, caq $$1, long $$2) {
      bjy<caq> $$3 = $$1.dM();
      $$3.a(brz.aC, asp.a, 25L);
      $$3.b(brz.m);
      biy $$4 = $$1.dM().c(brz.ax).get();
      bkr.a($$1, $$4);
      $$1.b(bjk.l);
      $$1.a($$4, 20, false);
   }

   protected boolean b(akk $$0, caq $$1, long $$2) {
      return true;
   }

   protected void c(akk $$0, caq $$1, long $$2) {
      if (!$$1.dM().a(brz.aC) && !$$1.dM().a(brz.aE)) {
         $$1.dM().a(brz.aE, asp.a, (long)(car.b - 25));
         $$1.a(aow.zJ, 3.0F, 1.0F);
      }
   }

   protected void d(akk $$0, caq $$1, long $$2) {
      if ($$1.c(bjk.l)) {
         $$1.b(bjk.a);
      }

      $$1.dM().c(brz.ax).ifPresent($$1::j);
      $$1.dM().b(brz.ax);
   }
}
