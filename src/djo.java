import com.mojang.serialization.MapCodec;

public class djo extends dde implements ddh {
   public static final MapCodec<djo> a = b(djo::new);

   @Override
   public MapCodec<djo> a() {
      return a;
   }

   public djo(dqg.d $$0) {
      super($$0);
   }

   @Override
   public boolean b(dag $$0, in $$1, dqh $$2) {
      return $$0.a_($$1.d()).i();
   }

   @Override
   public boolean a(dad $$0, ayg $$1, in $$2, dqh $$3) {
      return true;
   }

   @Override
   public void a(aqh $$0, ayg $$1, in $$2, dqh $$3) {
      $$0.b($$2.d(), ddg.sG.n());
   }

   @Override
   public in a(in $$0) {
      return $$0.d();
   }
}
