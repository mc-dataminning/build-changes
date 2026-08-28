import com.mojang.serialization.MapCodec;

public class dsa extends dkl {
   public static final MapCodec<dsa> a = b(dsa::new);
   protected static final fcr b = dkl.a(0.0, 0.0, 0.0, 16.0, 14.0, 16.0);
   private static final int c = 20;

   @Override
   public MapCodec<dsa> a() {
      return a;
   }

   public dsa(dxt.d $$0) {
      super($$0);
   }

   @Override
   protected fcr b(dxu $$0, dgm $$1, jh $$2, fcc $$3) {
      return b;
   }

   @Override
   protected fcr b_(dxu $$0, dgm $$1, jh $$2) {
      return fco.b();
   }

   @Override
   protected fcr c(dxu $$0, dgm $$1, jh $$2, fcc $$3) {
      return fco.b();
   }

   @Override
   protected void a(dxu $$0, ash $$1, jh $$2, bam $$3) {
      dks.b($$1, $$2.d(), $$0);
   }

   @Override
   protected dxu a(dxu $$0, dhk $$1, dhw $$2, jh $$3, jm $$4, jh $$5, dxu $$6, bam $$7) {
      if ($$4 == jm.b && $$6.a(dkn.J)) {
         $$2.a($$3, this, 20);
      }

      return super.a($$0, $$1, $$2, $$3, $$4, $$5, $$6, $$7);
   }

   @Override
   protected void b(dxu $$0, dhh $$1, jh $$2, dxu $$3, boolean $$4) {
      $$1.a($$2, this, 20);
   }

   @Override
   protected boolean a(dxu $$0, eul $$1) {
      return false;
   }

   @Override
   protected float c(dxu $$0, dgm $$1, jh $$2) {
      return 0.2F;
   }
}
