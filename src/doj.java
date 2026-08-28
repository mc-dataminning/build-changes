import com.mojang.serialization.MapCodec;

public class doj extends dnz implements djq {
   public static final MapCodec<doj> f = b(doj::new);

   @Override
   public MapCodec<doj> a() {
      return f;
   }

   public doj(dwx.d $$0) {
      super($$0);
   }

   @Override
   public boolean a(dgm $$0, ji $$1, dwy $$2) {
      return $$0.a_($$1.e()).l();
   }

   @Override
   public boolean a(dgj $$0, azh $$1, ji $$2, dwy $$3) {
      return true;
   }

   @Override
   public void a(ard $$0, azh $$1, ji $$2, dwy $$3) {
      $$0.a($$2.e(), dok.c(), 2);
   }

   @Override
   public ji a(ji $$0) {
      return $$0.e();
   }
}
