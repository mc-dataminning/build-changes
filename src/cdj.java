import com.google.common.collect.ImmutableMap;

public class cdj extends bzn<crc> {
   private static final int c = 25;
   private static final int d = 20;

   public cdj() {
      super(ImmutableMap.of(cgy.az, cgz.a, cgy.p, cgz.b, cgy.aG, cgz.c, cgy.aE, cgz.c), crd.b);
   }

   protected void a(aru $$0, crc $$1, long $$2) {
      byw<crc> $$3 = $$1.ec();
      $$3.a(cgy.aE, bay.a, 25L);
      $$3.b(cgy.n);
      bxw $$4 = $$1.ec().c(cgy.az).get();
      bzp.a($$1, $$4);
      $$1.b(byi.l);
      $$1.a($$4, 20, false);
   }

   protected boolean b(aru $$0, crc $$1, long $$2) {
      return true;
   }

   protected void c(aru $$0, crc $$1, long $$2) {
      if (!$$1.ec().a(cgy.aE) && !$$1.ec().a(cgy.aG)) {
         $$1.ec().a(cgy.aG, bay.a, (long)(crd.b - 25));
         $$1.a(awr.CY, 3.0F, 1.0F);
      }
   }

   protected void d(aru $$0, crc $$1, long $$2) {
      if ($$1.c(byi.l)) {
         $$1.b(byi.a);
      }

      $$1.ec().c(cgy.az).ifPresent($$1::i);
      $$1.ec().b(cgy.az);
   }
}
