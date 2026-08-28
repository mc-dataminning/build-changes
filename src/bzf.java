import com.google.common.collect.ImmutableMap;

public class bzf extends bvj<cmc> {
   private static final int c = 25;
   private static final int d = 20;

   public bzf() {
      super(ImmutableMap.of(ccu.ay, ccv.a, ccu.o, ccv.b, ccu.aF, ccv.c, ccu.aD, ccv.c), cmd.b);
   }

   protected void a(arf $$0, cmc $$1, long $$2) {
      bus<cmc> $$3 = $$1.dS();
      $$3.a(ccu.aD, bac.a, 25L);
      $$3.b(ccu.m);
      btq $$4 = $$1.dS().c(ccu.ay).get();
      bvl.a($$1, $$4);
      $$1.b(buc.l);
      $$1.a($$4, 20, false);
   }

   protected boolean b(arf $$0, cmc $$1, long $$2) {
      return true;
   }

   protected void c(arf $$0, cmc $$1, long $$2) {
      if (!$$1.dS().a(ccu.aD) && !$$1.dS().a(ccu.aF)) {
         $$1.dS().a(ccu.aF, bac.a, (long)(cmd.b - 25));
         $$1.a(awa.BQ, 3.0F, 1.0F);
      }
   }

   protected void d(arf $$0, cmc $$1, long $$2) {
      if ($$1.c(buc.l)) {
         $$1.b(buc.a);
      }

      $$1.dS().c(ccu.ay).ifPresent($$1::j);
      $$1.dS().b(ccu.ay);
   }
}
