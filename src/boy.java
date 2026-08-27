import com.google.common.collect.ImmutableMap;

public class boy extends bld<cbe> {
   private static final int c = 25;
   private static final int d = 20;

   public boy() {
      super(ImmutableMap.of(bsn.ax, bso.a, bsn.o, bso.b, bsn.aE, bso.c, bsn.aC, bso.c), cbf.b);
   }

   protected void a(akt $$0, cbe $$1, long $$2) {
      bkm<cbe> $$3 = $$1.dN();
      $$3.a(bsn.aC, atc.a, 25L);
      $$3.b(bsn.m);
      bjm $$4 = $$1.dN().c(bsn.ax).get();
      blf.a($$1, $$4);
      $$1.b(bjy.l);
      $$1.a($$4, 20, false);
   }

   protected boolean b(akt $$0, cbe $$1, long $$2) {
      return true;
   }

   protected void c(akt $$0, cbe $$1, long $$2) {
      if (!$$1.dN().a(bsn.aC) && !$$1.dN().a(bsn.aE)) {
         $$1.dN().a(bsn.aE, atc.a, (long)(cbf.b - 25));
         $$1.a(apg.zJ, 3.0F, 1.0F);
      }
   }

   protected void d(akt $$0, cbe $$1, long $$2) {
      if ($$1.c(bjy.l)) {
         $$1.b(bjy.a);
      }

      $$1.dN().c(bsn.ax).ifPresent($$1::j);
      $$1.dN().b(bsn.ax);
   }
}
