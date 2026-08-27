import com.mojang.serialization.MapCodec;

public class deb extends dgt implements ddh, dea {
   public static final MapCodec<deb> c = b(deb::new);
   private static final float g = 0.11F;

   @Override
   public MapCodec<deb> a() {
      return c;
   }

   public deb(dqg.d $$0) {
      super($$0, is.a, q_, false, 0.1);
      this.k(this.E.b().a(e, Integer.valueOf(0)).a(r_, Boolean.valueOf(false)));
   }

   @Override
   protected int a(ayg $$0) {
      return 1;
   }

   @Override
   protected boolean g(dqh $$0) {
      return $$0.i();
   }

   @Override
   protected dde b() {
      return ddg.sw;
   }

   @Override
   protected dqh a(dqh $$0, dqh $$1) {
      return $$1.a(r_, $$0.c(r_));
   }

   @Override
   protected dqh a(dqh $$0, ayg $$1) {
      return super.a($$0, $$1).a(r_, Boolean.valueOf($$1.i() < 0.11F));
   }

   @Override
   public csz a(dag $$0, in $$1, dqh $$2) {
      return new csz(ctc.ws);
   }

   @Override
   protected bpm a(dqh $$0, dad $$1, in $$2, clh $$3, etl $$4) {
      return dea.a($$3, $$0, $$1, $$2);
   }

   @Override
   protected void a(dqi.a<dde, dqh> $$0) {
      super.a($$0);
      $$0.a(r_);
   }

   @Override
   public boolean b(dag $$0, in $$1, dqh $$2) {
      return !$$2.c(r_);
   }

   @Override
   public boolean a(dad $$0, ayg $$1, in $$2, dqh $$3) {
      return true;
   }

   @Override
   public void a(aqh $$0, ayg $$1, in $$2, dqh $$3) {
      $$0.a($$2, $$3.a(r_, Boolean.valueOf(true)), 2);
   }
}
