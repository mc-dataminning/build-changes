import com.mojang.serialization.MapCodec;

public abstract class dga extends dde implements dfz {
   public dga(dqg.d $$0) {
      super($$0);
   }

   @Override
   protected abstract MapCodec<? extends dga> a();

   @Override
   protected void b(dqh $$0, dad $$1, in $$2, dqh $$3, boolean $$4) {
      $$1.a($$2, this, this.b());
   }

   @Override
   protected dqh a(dqh $$0, is $$1, dqh $$2, dae $$3, in $$4, in $$5) {
      $$3.a($$4, this, this.b());
      return super.a($$0, $$1, $$2, $$3, $$4, $$5);
   }

   @Override
   protected void a(dqh $$0, aqh $$1, in $$2, ayg $$3) {
      if (m($$1.a_($$2.d())) && $$2.v() >= $$1.I_()) {
         chq $$4 = chq.a($$1, $$2, $$0);
         this.a($$4);
      }
   }

   protected void a(chq $$0) {
   }

   protected int b() {
      return 2;
   }

   public static boolean m(dqh $$0) {
      return $$0.i() || $$0.a(avr.aK) || $$0.k() || $$0.r();
   }

   @Override
   public void a(dqh $$0, dad $$1, in $$2, ayg $$3) {
      if ($$3.a(16) == 0) {
         in $$4 = $$2.d();
         if (m($$1.a_($$4))) {
            ayc.a($$1, $$2, $$3, new ko(kx.B, $$0));
         }
      }
   }

   public int b(dqh $$0, czj $$1, in $$2) {
      return -16777216;
   }
}
