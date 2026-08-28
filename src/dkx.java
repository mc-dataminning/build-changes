import com.mojang.serialization.MapCodec;

public class dkx extends dmb {
   public static final MapCodec<dkx> a = b(dkx::new);
   private static final fcm[] b = new fcm[]{
      dke.a(0.0, 0.0, 0.0, 16.0, 2.0, 16.0),
      dke.a(0.0, 0.0, 0.0, 16.0, 3.0, 16.0),
      dke.a(0.0, 0.0, 0.0, 16.0, 4.0, 16.0),
      dke.a(0.0, 0.0, 0.0, 16.0, 5.0, 16.0),
      dke.a(0.0, 0.0, 0.0, 16.0, 6.0, 16.0),
      dke.a(0.0, 0.0, 0.0, 16.0, 7.0, 16.0),
      dke.a(0.0, 0.0, 0.0, 16.0, 8.0, 16.0),
      dke.a(0.0, 0.0, 0.0, 16.0, 9.0, 16.0)
   };

   @Override
   public MapCodec<dkx> a() {
      return a;
   }

   public dkx(dxm.d $$0) {
      super($$0);
   }

   @Override
   protected dgz d() {
      return cxo.uV;
   }

   @Override
   protected fcm a(dxn $$0, dgf $$1, jh $$2, fbx $$3) {
      return b[this.h($$0)];
   }
}
