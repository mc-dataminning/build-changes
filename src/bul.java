import com.google.common.collect.ImmutableMap;

public class bul extends bqp<che> {
   private static final int c = 25;
   private static final int d = 20;

   public bul() {
      super(ImmutableMap.of(bya.ay, byb.a, bya.o, byb.b, bya.aF, byb.c, bya.aD, byb.c), chf.b);
   }

   protected void a(apa $$0, che $$1, long $$2) {
      bpy<che> $$3 = $$1.dM();
      $$3.a(bya.aD, axo.a, 25L);
      $$3.b(bya.m);
      box $$4 = $$1.dM().c(bya.ay).get();
      bqr.a($$1, $$4);
      $$1.b(bpi.l);
      $$1.a($$4, 20, false);
   }

   protected boolean b(apa $$0, che $$1, long $$2) {
      return true;
   }

   protected void c(apa $$0, che $$1, long $$2) {
      if (!$$1.dM().a(bya.aD) && !$$1.dM().a(bya.aF)) {
         $$1.dM().a(bya.aF, axo.a, (long)(chf.b - 25));
         $$1.a(atp.Bm, 3.0F, 1.0F);
      }
   }

   protected void d(apa $$0, che $$1, long $$2) {
      if ($$1.c(bpi.l)) {
         $$1.b(bpi.a);
      }

      $$1.dM().c(bya.ay).ifPresent($$1::j);
      $$1.dM().b(bya.ay);
   }
}
