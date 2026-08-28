import com.mojang.serialization.MapCodec;

public class dnv extends doj {
   public static final MapCodec<dnv> a = b(dnv::new);

   @Override
   public MapCodec<dnv> a() {
      return a;
   }

   public dnv(dxt.d $$0) {
      super($$0);
   }

   @Override
   protected void a(dxv.a<dkl, dxu> $$0) {
      $$0.a(aF);
   }

   @Override
   public dxu a(dbf $$0) {
      return this.m().b(aF, $$0.g().g());
   }
}
