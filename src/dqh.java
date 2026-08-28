import com.mojang.serialization.MapCodec;

public class dqh extends dmi {
   public static final MapCodec<dqh> a = b(dqh::new);
   private static final fcr[] b = new fcr[]{
      dkl.a(0.0, 0.0, 0.0, 16.0, 2.0, 16.0),
      dkl.a(0.0, 0.0, 0.0, 16.0, 3.0, 16.0),
      dkl.a(0.0, 0.0, 0.0, 16.0, 4.0, 16.0),
      dkl.a(0.0, 0.0, 0.0, 16.0, 5.0, 16.0),
      dkl.a(0.0, 0.0, 0.0, 16.0, 6.0, 16.0),
      dkl.a(0.0, 0.0, 0.0, 16.0, 7.0, 16.0),
      dkl.a(0.0, 0.0, 0.0, 16.0, 8.0, 16.0),
      dkl.a(0.0, 0.0, 0.0, 16.0, 9.0, 16.0)
   };

   @Override
   public MapCodec<dqh> a() {
      return a;
   }

   public dqh(dxt.d $$0) {
      super($$0);
   }

   @Override
   protected dhg d() {
      return cxs.uW;
   }

   @Override
   protected fcr a(dxu $$0, dgm $$1, jh $$2, fcc $$3) {
      return b[this.h($$0)];
   }
}
