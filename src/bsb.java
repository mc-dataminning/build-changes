import com.google.common.collect.ImmutableMap;

public class bsb extends bof<ceu> {
   private static final int c = 25;
   private static final int d = 20;

   public bsb() {
      super(ImmutableMap.of(bvq.ay, bvr.a, bvq.o, bvr.b, bvq.aF, bvr.c, bvq.aD, bvr.c), cev.b);
   }

   protected void a(ane $$0, ceu $$1, long $$2) {
      bno<ceu> $$3 = $$1.dN();
      $$3.a(bvq.aD, avt.a, 25L);
      $$3.b(bvq.m);
      bmo $$4 = $$1.dN().c(bvq.ay).get();
      boh.a($$1, $$4);
      $$1.b(bna.l);
      $$1.a($$4, 20, false);
   }

   protected boolean b(ane $$0, ceu $$1, long $$2) {
      return true;
   }

   protected void c(ane $$0, ceu $$1, long $$2) {
      if (!$$1.dN().a(bvq.aD) && !$$1.dN().a(bvq.aF)) {
         $$1.dN().a(bvq.aF, avt.a, (long)(cev.b - 25));
         $$1.a(art.AY, 3.0F, 1.0F);
      }
   }

   protected void d(ane $$0, ceu $$1, long $$2) {
      if ($$1.c(bna.l)) {
         $$1.b(bna.a);
      }

      $$1.dN().c(bvq.ay).ifPresent($$1::j);
      $$1.dN().b(bvq.ay);
   }
}
