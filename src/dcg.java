import com.mojang.serialization.MapCodec;

public class dcg extends ddn implements ddh {
   public static final MapCodec<dcg> a = b(dcg::new);
   private static final eui b = euf.a(dde.a(0.0, 8.0, 0.0, 16.0, 16.0, 16.0), dde.a(6.0, 0.0, 6.0, 10.0, 8.0, 10.0));

   @Override
   public MapCodec<dcg> a() {
      return a;
   }

   protected dcg(dqg.d $$0) {
      super($$0);
   }

   @Override
   protected eui a(dqh $$0, czj $$1, in $$2, etu $$3) {
      return b;
   }

   @Override
   protected boolean b(dqh $$0, czj $$1, in $$2) {
      return $$0.a(ddg.dR) || super.b($$0, $$1, $$2);
   }

   @Override
   public boolean b(dag $$0, in $$1, dqh $$2) {
      return $$0.b_($$1.c()).c();
   }

   @Override
   public boolean a(dad $$0, ayg $$1, in $$2, dqh $$3) {
      return (double)$$0.z.i() < 0.45;
   }

   @Override
   public void a(aqh $$0, ayg $$1, in $$2, dqh $$3) {
      dpw.e.a($$0, $$0.l().g(), $$2, $$3, $$1);
   }
}
