import com.mojang.serialization.MapCodec;

public class dqd extends dih implements dib {
   public static final MapCodec<dqd> a = b(dqd::new);
   protected static final float b = 6.0F;
   protected static final fab c = dhy.a(2.0, 0.0, 2.0, 14.0, 13.0, 14.0);

   @Override
   public MapCodec<dqd> a() {
      return a;
   }

   protected dqd(dvc.d $$0) {
      super($$0);
   }

   @Override
   protected fab a(dvd $$0, dea $$1, jg $$2, ezm $$3) {
      return c;
   }

   @Override
   public boolean b(dey $$0, jg $$1, dvd $$2) {
      return o($$2).m().a($$0, $$1) && $$0.u($$1.d());
   }

   @Override
   public boolean a(dev $$0, azr $$1, jg $$2, dvd $$3) {
      return true;
   }

   @Override
   public void a(arm $$0, azr $$1, jg $$2, dvd $$3) {
      dkg.a($$0, o($$3).m(), $$2, 2);
   }

   private static dkg o(dvd $$0) {
      return (dkg)($$0.a(dia.bu) ? dia.iI : dia.iH);
   }
}
