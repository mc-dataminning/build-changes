import com.mojang.serialization.MapCodec;

public class dpu extends dkv {
   public static final MapCodec<dpu> a = b(dpu::new);
   public static final int b = 3;
   public static final dyt c = dyk.at;
   private static final fcr[] d = new fcr[]{
      dkl.a(0.0, 0.0, 0.0, 16.0, 5.0, 16.0),
      dkl.a(0.0, 0.0, 0.0, 16.0, 8.0, 16.0),
      dkl.a(0.0, 0.0, 0.0, 16.0, 11.0, 16.0),
      dkl.a(0.0, 0.0, 0.0, 16.0, 14.0, 16.0)
   };

   @Override
   public MapCodec<dpu> a() {
      return a;
   }

   protected dpu(dxt.d $$0) {
      super($$0);
      this.l(this.F.b().b(c, Integer.valueOf(0)));
   }

   @Override
   protected fcr a(dxu $$0, dgm $$1, jh $$2, fcc $$3) {
      return d[$$0.c(c)];
   }

   @Override
   protected boolean b(dxu $$0, dgm $$1, jh $$2) {
      return $$0.a(dkn.ej);
   }

   @Override
   protected boolean f(dxu $$0) {
      return $$0.c(c) < 3;
   }

   @Override
   protected void b(dxu $$0, ash $$1, jh $$2, bam $$3) {
      int $$4 = $$0.c(c);
      if ($$4 < 3 && $$3.a(10) == 0) {
         $$0 = $$0.b(c, Integer.valueOf($$4 + 1));
         $$1.a($$2, $$0, 2);
      }
   }

   @Override
   public cxo a(dhk $$0, jh $$1, dxu $$2) {
      return new cxo(cxs.sX);
   }

   @Override
   protected void a(dxv.a<dkl, dxu> $$0) {
      $$0.a(c);
   }
}
