import com.mojang.serialization.MapCodec;

public class dlf extends dmj {
   public static final MapCodec<dlf> a = b(dlf::new);
   private static final fcs[] b = new fcs[]{
      dkm.a(0.0, 0.0, 0.0, 16.0, 2.0, 16.0),
      dkm.a(0.0, 0.0, 0.0, 16.0, 3.0, 16.0),
      dkm.a(0.0, 0.0, 0.0, 16.0, 4.0, 16.0),
      dkm.a(0.0, 0.0, 0.0, 16.0, 5.0, 16.0),
      dkm.a(0.0, 0.0, 0.0, 16.0, 6.0, 16.0),
      dkm.a(0.0, 0.0, 0.0, 16.0, 7.0, 16.0),
      dkm.a(0.0, 0.0, 0.0, 16.0, 8.0, 16.0),
      dkm.a(0.0, 0.0, 0.0, 16.0, 9.0, 16.0)
   };

   @Override
   public MapCodec<dlf> a() {
      return a;
   }

   public dlf(dxu.d $$0) {
      super($$0);
   }

   @Override
   protected dhh d() {
      return cxt.uV;
   }

   @Override
   protected fcs a(dxv $$0, dgn $$1, jh $$2, fcd $$3) {
      return b[this.h($$0)];
   }
}
