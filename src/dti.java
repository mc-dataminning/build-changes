import com.mojang.serialization.MapCodec;

public class dti extends dmr implements dmu {
   public static final MapCodec<dti> a = b(dti::new);

   @Override
   public MapCodec<dti> a() {
      return a;
   }

   public dti(eas.d $$0) {
      super($$0);
   }

   @Override
   public boolean a(djp $$0, iv $$1, eat $$2) {
      return $$0.a_($$1.e()).l();
   }

   @Override
   public boolean a(djm $$0, azv $$1, iv $$2, eat $$3) {
      return true;
   }

   @Override
   public void a(arq $$0, azv $$1, iv $$2, eat $$3) {
      $$0.b($$2.e(), dmt.tq.m());
   }

   @Override
   public iv a(iv $$0) {
      return $$0.e();
   }
}
