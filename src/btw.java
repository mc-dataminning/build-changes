import com.google.common.collect.ImmutableMap;

public class btw extends bqa<cgp> {
   private static final int c = 25;
   private static final int d = 20;

   public btw() {
      super(ImmutableMap.of(bxl.ay, bxm.a, bxl.o, bxm.b, bxl.aF, bxm.c, bxl.aD, bxm.c), cgq.b);
   }

   protected void a(aow $$0, cgp $$1, long $$2) {
      bpj<cgp> $$3 = $$1.dO();
      $$3.a(bxl.aD, axk.a, 25L);
      $$3.b(bxl.m);
      boi $$4 = $$1.dO().c(bxl.ay).get();
      bqc.a($$1, $$4);
      $$1.b(bot.l);
      $$1.a($$4, 20, false);
   }

   protected boolean b(aow $$0, cgp $$1, long $$2) {
      return true;
   }

   protected void c(aow $$0, cgp $$1, long $$2) {
      if (!$$1.dO().a(bxl.aD) && !$$1.dO().a(bxl.aF)) {
         $$1.dO().a(bxl.aF, axk.a, (long)(cgq.b - 25));
         $$1.a(atl.AZ, 3.0F, 1.0F);
      }
   }

   protected void d(aow $$0, cgp $$1, long $$2) {
      if ($$1.c(bot.l)) {
         $$1.b(bot.a);
      }

      $$1.dO().c(bxl.ay).ifPresent($$1::j);
      $$1.dO().b(bxl.ay);
   }
}
