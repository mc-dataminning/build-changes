import com.google.common.collect.ImmutableMap;

public class bzg extends bvk<cmd> {
   private static final int c = 25;
   private static final int d = 20;

   public bzg() {
      super(ImmutableMap.of(ccv.ay, ccw.a, ccv.o, ccw.b, ccv.aF, ccw.c, ccv.aD, ccw.c), cme.b);
   }

   protected void a(arf $$0, cmd $$1, long $$2) {
      but<cmd> $$3 = $$1.dS();
      $$3.a(ccv.aD, bac.a, 25L);
      $$3.b(ccv.m);
      btr $$4 = $$1.dS().c(ccv.ay).get();
      bvm.a($$1, $$4);
      $$1.b(bud.l);
      $$1.a($$4, 20, false);
   }

   protected boolean b(arf $$0, cmd $$1, long $$2) {
      return true;
   }

   protected void c(arf $$0, cmd $$1, long $$2) {
      if (!$$1.dS().a(ccv.aD) && !$$1.dS().a(ccv.aF)) {
         $$1.dS().a(ccv.aF, bac.a, (long)(cme.b - 25));
         $$1.a(awa.BQ, 3.0F, 1.0F);
      }
   }

   protected void d(arf $$0, cmd $$1, long $$2) {
      if ($$1.c(bud.l)) {
         $$1.b(bud.a);
      }

      $$1.dS().c(ccv.ay).ifPresent($$1::j);
      $$1.dS().b(ccv.ay);
   }
}
