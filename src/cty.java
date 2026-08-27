import com.mojang.serialization.MapCodec;

public class cty extends cva {
   public static final MapCodec<cty> a = b(cty::new);

   @Override
   public MapCodec<? extends cty> a() {
      return a;
   }

   public cty(dhh.d $$0) {
      super($$0);
   }

   @Override
   public void a(csa $$0, dhi $$1, ejq $$2, cem $$3) {
      if (!$$0.B) {
         ht $$4 = $$2.a();
         $$0.a(null, $$4, aqr.G, aqs.e, 1.0F, 0.5F + $$0.z.i() * 1.2F);
         $$0.a(null, $$4, aqr.E, aqs.e, 1.0F, 0.5F + $$0.z.i() * 1.2F);
      }
   }
}
