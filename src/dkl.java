import com.mojang.serialization.MapCodec;

public class dkl extends dfb implements dfe {
   public static final MapCodec<dkl> a = b(dkl::new);

   @Override
   public MapCodec<dkl> a() {
      return a;
   }

   protected dkl(dsd.d $$0) {
      super($$0);
   }

   private static boolean b(dse $$0, dcd $$1, iz $$2) {
      iz $$3 = $$2.c();
      dse $$4 = $$1.a_($$3);
      int $$5 = eno.a($$1, $$0, $$2, $$4, $$3, je.b, $$4.b($$1, $$3));
      return $$5 < $$1.Q();
   }

   @Override
   protected void b(dse $$0, arf $$1, iz $$2, azh $$3) {
      if (!b($$0, $$1, $$2)) {
         $$1.b($$2, dfd.dV.o());
      }
   }

   @Override
   public boolean b(dcd $$0, iz $$1, dse $$2) {
      return $$0.a_($$1.c()).i();
   }

   @Override
   public boolean a(dca $$0, azh $$1, iz $$2, dse $$3) {
      return true;
   }

   @Override
   public void a(arf $$0, azh $$1, iz $$2, dse $$3) {
      dse $$4 = $$0.a_($$2);
      iz $$5 = $$2.c();
      dub $$6 = $$0.l().g();
      jv<ean<?, ?>> $$7 = $$0.H_().d(lq.aC);
      if ($$4.a(dfd.ow)) {
         this.a($$7, sk.h, $$0, $$6, $$1, $$5);
      } else if ($$4.a(dfd.on)) {
         this.a($$7, sk.j, $$0, $$6, $$1, $$5);
         this.a($$7, sk.l, $$0, $$6, $$1, $$5);
         if ($$1.a(8) == 0) {
            this.a($$7, sk.n, $$0, $$6, $$1, $$5);
         }
      }
   }

   private void a(jv<ean<?, ?>> $$0, ale<ean<?, ?>> $$1, arf $$2, dub $$3, azh $$4, iz $$5) {
      $$0.b($$1).ifPresent($$4x -> ((ean)$$4x.a()).a($$2, $$3, $$4, $$5));
   }

   @Override
   public dfe.a ap_() {
      return dfe.a.a;
   }
}
