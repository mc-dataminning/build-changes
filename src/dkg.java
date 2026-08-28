import com.mojang.serialization.MapCodec;

public class dkg extends dmi {
   public static final MapCodec<dkg> a = b(dkg::new);
   public static final int b = 3;
   public static final dyt c = dyk.at;
   private static final fcr[] g = new fcr[]{
      dkl.a(0.0, 0.0, 0.0, 16.0, 2.0, 16.0),
      dkl.a(0.0, 0.0, 0.0, 16.0, 4.0, 16.0),
      dkl.a(0.0, 0.0, 0.0, 16.0, 6.0, 16.0),
      dkl.a(0.0, 0.0, 0.0, 16.0, 8.0, 16.0)
   };

   @Override
   public MapCodec<dkg> a() {
      return a;
   }

   public dkg(dxt.d $$0) {
      super($$0);
   }

   @Override
   protected dyt b() {
      return c;
   }

   @Override
   public int c() {
      return 3;
   }

   @Override
   protected dhg d() {
      return cxs.wb;
   }

   @Override
   protected void b(dxu $$0, ash $$1, jh $$2, bam $$3) {
      if ($$3.a(3) != 0) {
         super.b($$0, $$1, $$2, $$3);
      }
   }

   @Override
   protected int a(dhh $$0) {
      return super.a($$0) / 3;
   }

   @Override
   protected void a(dxv.a<dkl, dxu> $$0) {
      $$0.a(c);
   }

   @Override
   protected fcr a(dxu $$0, dgm $$1, jh $$2, fcc $$3) {
      return g[this.h($$0)];
   }
}
