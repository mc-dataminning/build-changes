import com.google.common.collect.ImmutableMap;

public class bol extends bkq<car> {
   private static final int c = 25;
   private static final int d = 20;

   public bol() {
      super(ImmutableMap.of(bsa.ax, bsb.a, bsa.o, bsb.b, bsa.aE, bsb.c, bsa.aC, bsb.c), cas.b);
   }

   protected void a(akk $$0, car $$1, long $$2) {
      bjz<car> $$3 = $$1.dM();
      $$3.a(bsa.aC, asp.a, 25L);
      $$3.b(bsa.m);
      biy $$4 = $$1.dM().c(bsa.ax).get();
      bks.a($$1, $$4);
      $$1.b(bjk.l);
      $$1.a($$4, 20, false);
   }

   protected boolean b(akk $$0, car $$1, long $$2) {
      return true;
   }

   protected void c(akk $$0, car $$1, long $$2) {
      if (!$$1.dM().a(bsa.aC) && !$$1.dM().a(bsa.aE)) {
         $$1.dM().a(bsa.aE, asp.a, (long)(cas.b - 25));
         $$1.a(aow.zE, 3.0F, 1.0F);
      }
   }

   protected void d(akk $$0, car $$1, long $$2) {
      if ($$1.c(bjk.l)) {
         $$1.b(bjk.a);
      }

      $$1.dM().c(bsa.ax).ifPresent($$1::l);
      $$1.dM().b(bsa.ax);
   }
}
