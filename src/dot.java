import com.mojang.serialization.MapCodec;

public class dot extends dij implements dim {
   public static final MapCodec<dot> a = b(dot::new);

   @Override
   public MapCodec<dot> a() {
      return a;
   }

   public dot(dvn.d $$0) {
      super($$0);
   }

   @Override
   public boolean b(dfi $$0, jh $$1, dvo $$2) {
      return $$0.a_($$1.e()).l();
   }

   @Override
   public boolean a(dff $$0, azv $$1, jh $$2, dvo $$3) {
      return true;
   }

   @Override
   public void a(arq $$0, azv $$1, jh $$2, dvo $$3) {
      $$0.b($$2.e(), dil.sG.m());
   }

   @Override
   public jh a(jh $$0) {
      return $$0.e();
   }
}
