import com.mojang.serialization.MapCodec;

public class dpq extends dko {
   public static final MapCodec<dpq> a = b(dpq::new);
   public static final int b = 3;
   public static final dyq c = dyg.av;
   private static final fcr[] d = dke.a(3, $$0 -> dke.b(16.0, 0.0, (double)(5 + $$0 * 3)));

   @Override
   public MapCodec<dpq> a() {
      return a;
   }

   protected dpq(dxp.d $$0) {
      super($$0);
      this.l(this.B.b().b(c, Integer.valueOf(0)));
   }

   @Override
   protected fcr a(dxq $$0, dgf $$1, ji $$2, fcc $$3) {
      return d[$$0.c(c)];
   }

   @Override
   protected boolean b(dxq $$0, dgf $$1, ji $$2) {
      return $$0.a(dkg.ej);
   }

   @Override
   protected boolean f(dxq $$0) {
      return $$0.c(c) < 3;
   }

   @Override
   protected void b(dxq $$0, ard $$1, ji $$2, azh $$3) {
      int $$4 = $$0.c(c);
      if ($$4 < 3 && $$3.a(10) == 0) {
         $$0 = $$0.b(c, Integer.valueOf($$4 + 1));
         $$1.a($$2, $$0, 2);
      }
   }

   @Override
   protected cxh a(dhc $$0, ji $$1, dxq $$2, boolean $$3) {
      return new cxh(cxl.ti);
   }

   @Override
   protected void a(dxr.a<dke, dxq> $$0) {
      $$0.a(c);
   }
}
