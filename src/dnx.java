import com.mojang.serialization.MapCodec;

public class dnx extends dhm implements dhp {
   public static final MapCodec<dnx> a = b(dnx::new);

   @Override
   public MapCodec<dnx> a() {
      return a;
   }

   public dnx(dur.d $$0) {
      super($$0);
   }

   @Override
   public boolean b(dem $$0, jf $$1, dus $$2) {
      return $$0.a_($$1.e()).l();
   }

   @Override
   public boolean a(dej $$0, azn $$1, jf $$2, dus $$3) {
      return true;
   }

   @Override
   public void a(arj $$0, azn $$1, jf $$2, dus $$3) {
      $$0.b($$2.e(), dho.sG.n());
   }

   @Override
   public jf a(jf $$0) {
      return $$0.e();
   }
}
