import com.mojang.serialization.MapCodec;

public class dpv extends dkw {
   public static final MapCodec<dpv> a = b(dpv::new);
   public static final int b = 3;
   public static final dyu c = dyl.at;
   private static final fcs[] d = new fcs[]{
      dkm.a(0.0, 0.0, 0.0, 16.0, 5.0, 16.0),
      dkm.a(0.0, 0.0, 0.0, 16.0, 8.0, 16.0),
      dkm.a(0.0, 0.0, 0.0, 16.0, 11.0, 16.0),
      dkm.a(0.0, 0.0, 0.0, 16.0, 14.0, 16.0)
   };

   @Override
   public MapCodec<dpv> a() {
      return a;
   }

   protected dpv(dxu.d $$0) {
      super($$0);
      this.l(this.F.b().b(c, Integer.valueOf(0)));
   }

   @Override
   protected fcs a(dxv $$0, dgn $$1, jh $$2, fcd $$3) {
      return d[$$0.c(c)];
   }

   @Override
   protected boolean b(dxv $$0, dgn $$1, jh $$2) {
      return $$0.a(dko.ej);
   }

   @Override
   protected boolean f(dxv $$0) {
      return $$0.c(c) < 3;
   }

   @Override
   protected void b(dxv $$0, ash $$1, jh $$2, bam $$3) {
      int $$4 = $$0.c(c);
      if ($$4 < 3 && $$3.a(10) == 0) {
         $$0 = $$0.b(c, Integer.valueOf($$4 + 1));
         $$1.a($$2, $$0, 2);
      }
   }

   @Override
   public cxp a(dhl $$0, jh $$1, dxv $$2) {
      return new cxp(cxt.sX);
   }

   @Override
   protected void a(dxw.a<dkm, dxv> $$0) {
      $$0.a(c);
   }
}
