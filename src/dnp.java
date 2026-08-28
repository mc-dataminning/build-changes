import com.mojang.serialization.MapCodec;

public class dnp extends dis {
   public static final MapCodec<dnp> a = b(dnp::new);
   public static final int b = 3;
   public static final dwn c = dwe.as;
   private static final fal[] d = new fal[]{
      dij.a(0.0, 0.0, 0.0, 16.0, 5.0, 16.0),
      dij.a(0.0, 0.0, 0.0, 16.0, 8.0, 16.0),
      dij.a(0.0, 0.0, 0.0, 16.0, 11.0, 16.0),
      dij.a(0.0, 0.0, 0.0, 16.0, 14.0, 16.0)
   };

   @Override
   public MapCodec<dnp> a() {
      return a;
   }

   protected dnp(dvn.d $$0) {
      super($$0);
      this.l(this.F.b().b(c, Integer.valueOf(0)));
   }

   @Override
   protected fal a(dvo $$0, dek $$1, jh $$2, ezw $$3) {
      return d[$$0.c(c)];
   }

   @Override
   protected boolean b(dvo $$0, dek $$1, jh $$2) {
      return $$0.a(dil.dW);
   }

   @Override
   protected boolean f(dvo $$0) {
      return $$0.c(c) < 3;
   }

   @Override
   protected void b(dvo $$0, arq $$1, jh $$2, azv $$3) {
      int $$4 = $$0.c(c);
      if ($$4 < 3 && $$3.a(10) == 0) {
         $$0 = $$0.b(c, Integer.valueOf($$4 + 1));
         $$1.a($$2, $$0, 2);
      }
   }

   @Override
   public cwf a(dfi $$0, jh $$1, dvo $$2) {
      return new cwf(cwj.sA);
   }

   @Override
   protected void a(dvp.a<dij, dvo> $$0) {
      $$0.a(c);
   }
}
