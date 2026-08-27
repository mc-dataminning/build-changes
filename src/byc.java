import com.google.common.collect.ImmutableMap;

public class byc extends bug<clc> {
   private static final int c = 25;
   private static final int d = 20;

   public byc() {
      super(ImmutableMap.of(cbr.ay, cbs.a, cbr.o, cbs.b, cbr.aF, cbs.c, cbr.aD, cbs.c), cld.b);
   }

   protected void a(aqt $$0, clc $$1, long $$2) {
      btp<clc> $$3 = $$1.dZ();
      $$3.a(cbr.aD, azo.a, 25L);
      $$3.b(cbr.m);
      bso $$4 = $$1.dZ().c(cbr.ay).get();
      bui.a($$1, $$4);
      $$1.b(bsz.l);
      $$1.a($$4, 20, false);
   }

   protected boolean b(aqt $$0, clc $$1, long $$2) {
      return true;
   }

   protected void c(aqt $$0, clc $$1, long $$2) {
      if (!$$1.dZ().a(cbr.aD) && !$$1.dZ().a(cbr.aF)) {
         $$1.dZ().a(cbr.aF, azo.a, (long)(cld.b - 25));
         $$1.a(avo.Co, 3.0F, 1.0F);
      }
   }

   protected void d(aqt $$0, clc $$1, long $$2) {
      if ($$1.c(bsz.l)) {
         $$1.b(bsz.a);
      }

      $$1.dZ().c(cbr.ay).ifPresent($$1::j);
      $$1.dZ().b(cbr.ay);
   }
}
