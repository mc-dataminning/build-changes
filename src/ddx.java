import com.mojang.serialization.MapCodec;

public class ddx extends dez {
   public static final MapCodec<ddx> a = b(ddx::new);

   @Override
   public MapCodec<? extends ddx> a() {
      return a;
   }

   public ddx(dsb.d $$0) {
      super($$0);
   }

   @Override
   protected void a(dby $$0, dsc $$1, evn $$2, cnp $$3) {
      if (!$$0.B) {
         iz $$4 = $$2.a();
         $$0.a(null, $$4, awa.G, awb.e, 1.0F, 0.5F + $$0.z.i() * 1.2F);
         $$0.a(null, $$4, awa.E, awb.e, 1.0F, 0.5F + $$0.z.i() * 1.2F);
      }
   }
}
