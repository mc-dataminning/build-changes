import com.mojang.serialization.MapCodec;

public class dnp extends dod {
   public static final MapCodec<dnp> a = b(dnp::new);

   @Override
   public MapCodec<dnp> a() {
      return a;
   }

   public dnp(dxp.d $$0) {
      super($$0);
   }

   @Override
   protected void a(dxr.a<dke, dxq> $$0) {
      $$0.a(e);
   }

   @Override
   public dxq a(dax $$0) {
      return this.m().b(e, $$0.g().g());
   }
}
