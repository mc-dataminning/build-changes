import com.mojang.serialization.MapCodec;

public class dpg extends dkl {
   public static final MapCodec<dpg> a = b(dpg::new);
   private static final int b = 20;

   @Override
   public MapCodec<dpg> a() {
      return a;
   }

   public dpg(dxt.d $$0) {
      super($$0);
   }

   @Override
   public void a(dhh $$0, jh $$1, dxu $$2, bvj $$3) {
      if (!$$3.ce() && $$3 instanceof bwf) {
         $$3.a($$0.aj().f(), 1.0F);
      }

      super.a($$0, $$1, $$2, $$3);
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
}
