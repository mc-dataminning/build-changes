import com.google.common.collect.ImmutableMap;

public class bri extends bnm<cdv> {
   private static final int c = 25;
   private static final int d = 20;

   public bri() {
      super(ImmutableMap.of(bux.ax, buy.a, bux.o, buy.b, bux.aE, buy.c, bux.aC, buy.c), cdw.b);
   }

   protected void a(amp $$0, cdv $$1, long $$2) {
      bmv<cdv> $$3 = $$1.dO();
      $$3.a(bux.aC, avc.a, 25L);
      $$3.b(bux.m);
      blv $$4 = $$1.dO().c(bux.ax).get();
      bno.a($$1, $$4);
      $$1.b(bmh.l);
      $$1.a($$4, 20, false);
   }

   protected boolean b(amp $$0, cdv $$1, long $$2) {
      return true;
   }

   protected void c(amp $$0, cdv $$1, long $$2) {
      if (!$$1.dO().a(bux.aC) && !$$1.dO().a(bux.aE)) {
         $$1.dO().a(bux.aE, avc.a, (long)(cdw.b - 25));
         $$1.a(arc.AJ, 3.0F, 1.0F);
      }
   }

   protected void d(amp $$0, cdv $$1, long $$2) {
      if ($$1.c(bmh.l)) {
         $$1.b(bmh.a);
      }

      $$1.dO().c(bux.ax).ifPresent($$1::j);
      $$1.dO().b(bux.ax);
   }
}
