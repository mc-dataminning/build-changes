import com.mojang.serialization.MapCodec;

public class doz extends dke {
   public static final MapCodec<doz> a = b(doz::new);
   private static final int b = 20;

   @Override
   public MapCodec<doz> a() {
      return a;
   }

   public doz(dxm.d $$0) {
      super($$0);
   }

   @Override
   public void a(dha $$0, jh $$1, dxn $$2, bvf $$3) {
      if (!$$3.ce() && $$3 instanceof bwb) {
         $$3.a($$0.aj().f(), 1.0F);
      }

      super.a($$0, $$1, $$2, $$3);
   }

   @Override
   protected void a(dxn $$0, ash $$1, jh $$2, bam $$3) {
      dkl.b($$1, $$2.d(), $$0);
   }

   @Override
   protected dxn a(dxn $$0, dhd $$1, dhp $$2, jh $$3, jm $$4, jh $$5, dxn $$6, bam $$7) {
      if ($$4 == jm.b && $$6.a(dkg.J)) {
         $$2.a($$3, this, 20);
      }

      return super.a($$0, $$1, $$2, $$3, $$4, $$5, $$6, $$7);
   }

   @Override
   protected void b(dxn $$0, dha $$1, jh $$2, dxn $$3, boolean $$4) {
      $$1.a($$2, this, 20);
   }
}
