import com.mojang.serialization.MapCodec;

public class dph extends dkm {
   public static final MapCodec<dph> a = b(dph::new);
   private static final int b = 20;

   @Override
   public MapCodec<dph> a() {
      return a;
   }

   public dph(dxu.d $$0) {
      super($$0);
   }

   @Override
   public void a(dhi $$0, jh $$1, dxv $$2, bvk $$3) {
      if (!$$3.ce() && $$3 instanceof bwg) {
         $$3.a($$0.aj().f(), 1.0F);
      }

      super.a($$0, $$1, $$2, $$3);
   }

   @Override
   protected void a(dxv $$0, ash $$1, jh $$2, bam $$3) {
      dkt.b($$1, $$2.d(), $$0);
   }

   @Override
   protected dxv a(dxv $$0, dhl $$1, dhx $$2, jh $$3, jm $$4, jh $$5, dxv $$6, bam $$7) {
      if ($$4 == jm.b && $$6.a(dko.J)) {
         $$2.a($$3, this, 20);
      }

      return super.a($$0, $$1, $$2, $$3, $$4, $$5, $$6, $$7);
   }

   @Override
   protected void b(dxv $$0, dhi $$1, jh $$2, dxv $$3, boolean $$4) {
      $$1.a($$2, this, 20);
   }
}
