import com.mojang.serialization.MapCodec;

public class dfi extends dde {
   public static final MapCodec<dfi> a = b(dfi::new);
   protected static final eui b = dgb.c;

   @Override
   public MapCodec<dfi> a() {
      return a;
   }

   protected dfi(dqg.d $$0) {
      super($$0);
   }

   @Override
   protected boolean f_(dqh $$0) {
      return true;
   }

   @Override
   public dqh a(cwi $$0) {
      return !this.n().a((dag)$$0.q(), $$0.a()) ? dde.a(this.n(), ddg.j.n(), $$0.q(), $$0.a()) : super.a($$0);
   }

   @Override
   protected dqh a(dqh $$0, is $$1, dqh $$2, dae $$3, in $$4, in $$5) {
      if ($$1 == is.b && !$$0.a($$3, $$4)) {
         $$3.a($$4, this, 1);
      }

      return super.a($$0, $$1, $$2, $$3, $$4, $$5);
   }

   @Override
   protected void a(dqh $$0, aqh $$1, in $$2, ayg $$3) {
      dgb.a(null, $$0, $$1, $$2);
   }

   @Override
   protected boolean a(dqh $$0, dag $$1, in $$2) {
      dqh $$3 = $$1.a_($$2.c());
      return !$$3.e() || $$3.b() instanceof dgd;
   }

   @Override
   protected eui a(dqh $$0, czj $$1, in $$2, etu $$3) {
      return b;
   }

   @Override
   protected boolean a(dqh $$0, emp $$1) {
      return false;
   }
}
