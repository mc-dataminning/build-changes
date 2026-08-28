import com.mojang.serialization.MapCodec;

public class doh extends dnx implements djo {
   public static final MapCodec<doh> f = b(doh::new);

   @Override
   public MapCodec<doh> a() {
      return f;
   }

   public doh(dwv.d $$0) {
      super($$0);
   }

   @Override
   public boolean a(dgk $$0, ji $$1, dww $$2) {
      return $$0.a_($$1.e()).l();
   }

   @Override
   public boolean a(dgh $$0, azh $$1, ji $$2, dww $$3) {
      return true;
   }

   @Override
   public void a(ard $$0, azh $$1, ji $$2, dww $$3) {
      $$0.a($$2.e(), doi.c(), 2);
   }

   @Override
   public ji a(ji $$0) {
      return $$0.e();
   }
}
