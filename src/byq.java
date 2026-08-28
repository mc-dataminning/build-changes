import com.google.common.collect.ImmutableMap;

public class byq extends buu<clo> {
   private static final int c = 25;
   private static final int d = 20;

   public byq() {
      super(ImmutableMap.of(ccf.ay, ccg.a, ccf.o, ccg.b, ccf.aF, ccg.c, ccf.aD, ccg.c), clp.b);
   }

   protected void a(aqm $$0, clo $$1, long $$2) {
      bud<clo> $$3 = $$1.dU();
      $$3.a(ccf.aD, azk.a, 25L);
      $$3.b(ccf.m);
      btb $$4 = $$1.dU().c(ccf.ay).get();
      buw.a($$1, $$4);
      $$1.b(btn.l);
      $$1.a($$4, 20, false);
   }

   protected boolean b(aqm $$0, clo $$1, long $$2) {
      return true;
   }

   protected void c(aqm $$0, clo $$1, long $$2) {
      if (!$$1.dU().a(ccf.aD) && !$$1.dU().a(ccf.aF)) {
         $$1.dU().a(ccf.aF, azk.a, (long)(clp.b - 25));
         $$1.a(avh.BT, 3.0F, 1.0F);
      }
   }

   protected void d(aqm $$0, clo $$1, long $$2) {
      if ($$1.c(btn.l)) {
         $$1.b(btn.a);
      }

      $$1.dU().c(ccf.ay).ifPresent($$1::j);
      $$1.dU().b(ccf.ay);
   }
}
