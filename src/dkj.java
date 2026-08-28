import com.mojang.serialization.MapCodec;

public class dkj extends dez implements dfc {
   public static final MapCodec<dkj> a = b(dkj::new);

   @Override
   public MapCodec<dkj> a() {
      return a;
   }

   protected dkj(dsb.d $$0) {
      super($$0);
   }

   private static boolean b(dsc $$0, dcb $$1, iz $$2) {
      iz $$3 = $$2.c();
      dsc $$4 = $$1.a_($$3);
      int $$5 = enm.a($$1, $$0, $$2, $$4, $$3, je.b, $$4.b($$1, $$3));
      return $$5 < $$1.Q();
   }

   @Override
   protected void b(dsc $$0, arf $$1, iz $$2, azh $$3) {
      if (!b($$0, $$1, $$2)) {
         $$1.b($$2, dfb.dV.o());
      }
   }

   @Override
   public boolean b(dcb $$0, iz $$1, dsc $$2) {
      return $$0.a_($$1.c()).i();
   }

   @Override
   public boolean a(dby $$0, azh $$1, iz $$2, dsc $$3) {
      return true;
   }

   @Override
   public void a(arf $$0, azh $$1, iz $$2, dsc $$3) {
      dsc $$4 = $$0.a_($$2);
      iz $$5 = $$2.c();
      dtz $$6 = $$0.l().g();
      jv<eal<?, ?>> $$7 = $$0.H_().d(lq.aC);
      if ($$4.a(dfb.ow)) {
         this.a($$7, sk.h, $$0, $$6, $$1, $$5);
      } else if ($$4.a(dfb.on)) {
         this.a($$7, sk.j, $$0, $$6, $$1, $$5);
         this.a($$7, sk.l, $$0, $$6, $$1, $$5);
         if ($$1.a(8) == 0) {
            this.a($$7, sk.n, $$0, $$6, $$1, $$5);
         }
      }
   }

   private void a(jv<eal<?, ?>> $$0, ale<eal<?, ?>> $$1, arf $$2, dtz $$3, azh $$4, iz $$5) {
      $$0.b($$1).ifPresent($$4x -> ((eal)$$4x.a()).a($$2, $$3, $$4, $$5));
   }

   @Override
   public dfc.a ap_() {
      return dfc.a.a;
   }
}
