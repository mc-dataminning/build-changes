import com.google.common.collect.ImmutableMap;

public class cab extends bwf<cnb> {
   private static final int c = 25;
   private static final int d = 20;

   public cab() {
      super(ImmutableMap.of(cdq.ay, cdr.a, cdq.o, cdr.b, cdq.aF, cdr.c, cdq.aD, cdr.c), cnc.b);
   }

   protected void a(arj $$0, cnb $$1, long $$2) {
      bvo<cnb> $$3 = $$1.dY();
      $$3.a(cdq.aD, bak.a, 25L);
      $$3.b(cdq.m);
      bun $$4 = $$1.dY().c(cdq.ay).get();
      bwh.a($$1, $$4);
      $$1.b(buz.l);
      $$1.a($$4, 20, false);
   }

   protected boolean b(arj $$0, cnb $$1, long $$2) {
      return true;
   }

   protected void c(arj $$0, cnb $$1, long $$2) {
      if (!$$1.dY().a(cdq.aD) && !$$1.dY().a(cdq.aF)) {
         $$1.dY().a(cdq.aF, bak.a, (long)(cnc.b - 25));
         $$1.a(awg.Ca, 3.0F, 1.0F);
      }
   }

   protected void d(arj $$0, cnb $$1, long $$2) {
      if ($$1.c(buz.l)) {
         $$1.b(buz.a);
      }

      $$1.dY().c(cdq.ay).ifPresent($$1::j);
      $$1.dY().b(cdq.ay);
   }
}
