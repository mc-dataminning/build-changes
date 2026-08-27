import com.mojang.serialization.MapCodec;

public class dkp extends dcr {
   public static final MapCodec<dkp> c = b(dkp::new);

   @Override
   public MapCodec<dkp> a() {
      return c;
   }

   public dkp(dqg.d $$0) {
      super($$0, 2.0F);
   }

   @Override
   protected dqh a(dqh $$0, is $$1, dqh $$2, dae $$3, in $$4, in $$5) {
      return this.a($$0, $$3, $$4) ? this.n() : ddg.a.n();
   }

   @Override
   protected boolean a(dqh $$0, dag $$1, in $$2) {
      return m($$1.a_($$2.d()));
   }

   public static boolean m(dqh $$0) {
      return $$0.a(avr.aT);
   }

   @Override
   protected boolean f(dqh $$0) {
      return true;
   }
}
