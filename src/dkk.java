import com.mojang.serialization.MapCodec;

public class dkk extends dfa implements dfd {
   public static final MapCodec<dkk> a = b(dkk::new);

   @Override
   public MapCodec<dkk> a() {
      return a;
   }

   protected dkk(dsc.d $$0) {
      super($$0);
   }

   private static boolean b(dsd $$0, dcc $$1, iz $$2) {
      iz $$3 = $$2.c();
      dsd $$4 = $$1.a_($$3);
      int $$5 = enn.a($$1, $$0, $$2, $$4, $$3, je.b, $$4.b($$1, $$3));
      return $$5 < $$1.Q();
   }

   @Override
   protected void b(dsd $$0, arf $$1, iz $$2, azh $$3) {
      if (!b($$0, $$1, $$2)) {
         $$1.b($$2, dfc.dV.o());
      }
   }

   @Override
   public boolean b(dcc $$0, iz $$1, dsd $$2) {
      return $$0.a_($$1.c()).i();
   }

   @Override
   public boolean a(dbz $$0, azh $$1, iz $$2, dsd $$3) {
      return true;
   }

   @Override
   public void a(arf $$0, azh $$1, iz $$2, dsd $$3) {
      dsd $$4 = $$0.a_($$2);
      iz $$5 = $$2.c();
      dua $$6 = $$0.l().g();
      jv<eam<?, ?>> $$7 = $$0.H_().d(lq.aC);
      if ($$4.a(dfc.ow)) {
         this.a($$7, sk.h, $$0, $$6, $$1, $$5);
      } else if ($$4.a(dfc.on)) {
         this.a($$7, sk.j, $$0, $$6, $$1, $$5);
         this.a($$7, sk.l, $$0, $$6, $$1, $$5);
         if ($$1.a(8) == 0) {
            this.a($$7, sk.n, $$0, $$6, $$1, $$5);
         }
      }
   }

   private void a(jv<eam<?, ?>> $$0, ale<eam<?, ?>> $$1, arf $$2, dua $$3, azh $$4, iz $$5) {
      $$0.b($$1).ifPresent($$4x -> ((eam)$$4x.a()).a($$2, $$3, $$4, $$5));
   }

   @Override
   public dfd.a ap_() {
      return dfd.a.a;
   }
}
