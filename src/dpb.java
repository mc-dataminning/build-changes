import com.mojang.serialization.MapCodec;

public class dpb extends dke {
   public static final MapCodec<dpb> a = b(dpb::new);
   private static final int b = 20;

   @Override
   public MapCodec<dpb> a() {
      return a;
   }

   public dpb(dxp.d $$0) {
      super($$0);
   }

   @Override
   public void a(dgz $$0, ji $$1, dxq $$2, bva $$3) {
      if (!$$3.cd() && $$3 instanceof bvy) {
         $$3.a($$0.al().f(), 1.0F);
      }

      super.a($$0, $$1, $$2, $$3);
   }

   @Override
   protected void a(dxq $$0, ard $$1, ji $$2, azh $$3) {
      dkl.b($$1, $$2.d(), $$0);
   }

   @Override
   protected dxq a(dxq $$0, dhc $$1, dho $$2, ji $$3, jn $$4, ji $$5, dxq $$6, azh $$7) {
      if ($$4 == jn.b && $$6.a(dkg.J)) {
         $$2.a($$3, this, 20);
      }

      return super.a($$0, $$1, $$2, $$3, $$4, $$5, $$6, $$7);
   }

   @Override
   protected void a(dxq $$0, dgz $$1, ji $$2, dxq $$3, boolean $$4) {
      $$1.a($$2, this, 20);
   }
}
