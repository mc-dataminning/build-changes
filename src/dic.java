import com.mojang.serialization.MapCodec;

public class dic extends dde implements ddh {
   public static final MapCodec<dic> a = b(dic::new);

   @Override
   public MapCodec<dic> a() {
      return a;
   }

   public dic(dqg.d $$0) {
      super($$0);
   }

   @Override
   public boolean b(dag $$0, in $$1, dqh $$2) {
      return $$0.a_($$1.c()).i();
   }

   @Override
   public boolean a(dad $$0, ayg $$1, in $$2, dqh $$3) {
      return true;
   }

   @Override
   public void a(aqh $$0, ayg $$1, in $$2, dqh $$3) {
      $$0.H_().c(le.aC).flatMap($$0x -> $$0x.b(ro.n)).ifPresent($$3x -> ((dyq)$$3x.a()).a($$0, $$0.l().g(), $$1, $$2.c()));
   }

   @Override
   public ddh.a aq_() {
      return ddh.a.a;
   }
}
