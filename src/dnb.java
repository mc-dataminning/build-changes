import com.mojang.serialization.MapCodec;

public class dnb extends dij {
   public static final MapCodec<dnb> a = b(dnb::new);
   private static final int b = 20;

   @Override
   public MapCodec<dnb> a() {
      return a;
   }

   public dnb(dvn.d $$0) {
      super($$0);
   }

   @Override
   public void a(dff $$0, jh $$1, dvo $$2, bui $$3) {
      if (!$$3.cg() && $$3 instanceof bve) {
         $$3.a($$0.ai().f(), 1.0F);
      }

      super.a($$0, $$1, $$2, $$3);
   }

   @Override
   protected void a(dvo $$0, arq $$1, jh $$2, azv $$3) {
      dip.b($$1, $$2.d(), $$0);
   }

   @Override
   protected dvo a(dvo $$0, dfi $$1, dfu $$2, jh $$3, jm $$4, jh $$5, dvo $$6, azv $$7) {
      if ($$4 == jm.b && $$6.a(dil.G)) {
         $$2.a($$3, this, 20);
      }

      return super.a($$0, $$1, $$2, $$3, $$4, $$5, $$6, $$7);
   }

   @Override
   protected void b(dvo $$0, dff $$1, jh $$2, dvo $$3, boolean $$4) {
      $$1.a($$2, this, 20);
   }
}
