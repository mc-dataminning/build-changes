import com.google.common.collect.ImmutableMap;

public class byd extends buh<cla> {
   private static final int c = 25;
   private static final int d = 20;

   public byd() {
      super(ImmutableMap.of(cbs.ay, cbt.a, cbs.o, cbt.b, cbs.aF, cbt.c, cbs.aD, cbt.c), clb.b);
   }

   protected void a(aqm $$0, cla $$1, long $$2) {
      btq<cla> $$3 = $$1.dS();
      $$3.a(cbs.aD, azf.a, 25L);
      $$3.b(cbs.m);
      bso $$4 = $$1.dS().c(cbs.ay).get();
      buj.a($$1, $$4);
      $$1.b(bta.l);
      $$1.a($$4, 20, false);
   }

   protected boolean b(aqm $$0, cla $$1, long $$2) {
      return true;
   }

   protected void c(aqm $$0, cla $$1, long $$2) {
      if (!$$1.dS().a(cbs.aD) && !$$1.dS().a(cbs.aF)) {
         $$1.dS().a(cbs.aF, azf.a, (long)(clb.b - 25));
         $$1.a(avh.BQ, 3.0F, 1.0F);
      }
   }

   protected void d(aqm $$0, cla $$1, long $$2) {
      if ($$1.c(bta.l)) {
         $$1.b(bta.a);
      }

      $$1.dS().c(cbs.ay).ifPresent($$1::j);
      $$1.dS().b(cbs.ay);
   }
}
