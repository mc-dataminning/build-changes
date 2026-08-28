import com.mojang.serialization.MapCodec;

public class dqb extends djm implements djp {
   public static final MapCodec<dqb> a = b(dqb::new);

   @Override
   public MapCodec<dqb> a() {
      return a;
   }

   public dqb(dww.d $$0) {
      super($$0);
   }

   @Override
   public boolean a(dgl $$0, ji $$1, dwx $$2) {
      return $$0.a_($$1.e()).l();
   }

   @Override
   public boolean a(dgi $$0, azh $$1, ji $$2, dwx $$3) {
      return true;
   }

   @Override
   public void a(ard $$0, azh $$1, ji $$2, dwx $$3) {
      $$0.b($$2.e(), djo.ti.m());
   }

   @Override
   public ji a(ji $$0) {
      return $$0.e();
   }
}
