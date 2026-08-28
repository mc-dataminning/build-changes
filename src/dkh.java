import com.mojang.serialization.MapCodec;

public class dkh extends dmj {
   public static final MapCodec<dkh> a = b(dkh::new);
   public static final int b = 3;
   public static final dyu c = dyl.at;
   private static final fcs[] g = new fcs[]{
      dkm.a(0.0, 0.0, 0.0, 16.0, 2.0, 16.0),
      dkm.a(0.0, 0.0, 0.0, 16.0, 4.0, 16.0),
      dkm.a(0.0, 0.0, 0.0, 16.0, 6.0, 16.0),
      dkm.a(0.0, 0.0, 0.0, 16.0, 8.0, 16.0)
   };

   @Override
   public MapCodec<dkh> a() {
      return a;
   }

   public dkh(dxu.d $$0) {
      super($$0);
   }

   @Override
   protected dyu b() {
      return c;
   }

   @Override
   public int c() {
      return 3;
   }

   @Override
   protected dhh d() {
      return cxt.wb;
   }

   @Override
   protected void b(dxv $$0, ash $$1, jh $$2, bam $$3) {
      if ($$3.a(3) != 0) {
         super.b($$0, $$1, $$2, $$3);
      }
   }

   @Override
   protected int a(dhi $$0) {
      return super.a($$0) / 3;
   }

   @Override
   protected void a(dxw.a<dkm, dxv> $$0) {
      $$0.a(c);
   }

   @Override
   protected fcs a(dxv $$0, dgn $$1, jh $$2, fcd $$3) {
      return g[this.h($$0)];
   }
}
