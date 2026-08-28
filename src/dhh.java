import com.mojang.serialization.MapCodec;

public class dhh extends dij {
   public static final MapCodec<dhh> a = b(dhh::new);

   @Override
   public MapCodec<? extends dhh> a() {
      return a;
   }

   public dhh(dvn.d $$0) {
      super($$0);
   }

   @Override
   protected void a(dff $$0, dvo $$1, ezn $$2, cpk $$3) {
      if (!$$0.C) {
         jh $$4 = $$2.b();
         $$0.a(null, $$4, awo.E, awp.e, 1.0F, 0.5F + $$0.A.i() * 1.2F);
      }
   }
}
