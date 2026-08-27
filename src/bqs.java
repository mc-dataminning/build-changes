import com.google.common.collect.ImmutableMap;

public class bqs extends bmx<ccy> {
   private static final int c = 25;
   private static final int d = 20;

   public bqs() {
      super(ImmutableMap.of(buh.ax, bui.a, buh.o, bui.b, buh.aE, bui.c, buh.aC, bui.c), ccz.b);
   }

   protected void a(ame $$0, ccy $$1, long $$2) {
      bmg<ccy> $$3 = $$1.dP();
      $$3.a(buh.aC, auo.a, 25L);
      $$3.b(buh.m);
      blg $$4 = $$1.dP().c(buh.ax).get();
      bmz.a($$1, $$4);
      $$1.b(bls.l);
      $$1.a($$4, 20, false);
   }

   protected boolean b(ame $$0, ccy $$1, long $$2) {
      return true;
   }

   protected void c(ame $$0, ccy $$1, long $$2) {
      if (!$$1.dP().a(buh.aC) && !$$1.dP().a(buh.aE)) {
         $$1.dP().a(buh.aE, auo.a, (long)(ccz.b - 25));
         $$1.a(aqr.Ao, 3.0F, 1.0F);
      }
   }

   protected void d(ame $$0, ccy $$1, long $$2) {
      if ($$1.c(bls.l)) {
         $$1.b(bls.a);
      }

      $$1.dP().c(buh.ax).ifPresent($$1::j);
      $$1.dP().b(buh.ax);
   }
}
