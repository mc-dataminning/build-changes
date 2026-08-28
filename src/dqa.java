import com.mojang.serialization.MapCodec;

public class dqa extends djl implements djo {
   public static final MapCodec<dqa> a = b(dqa::new);

   @Override
   public MapCodec<dqa> a() {
      return a;
   }

   public dqa(dwv.d $$0) {
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
      $$0.b($$2.e(), djn.ti.m());
   }

   @Override
   public ji a(ji $$0) {
      return $$0.e();
   }
}
