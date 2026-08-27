import com.mojang.serialization.MapCodec;

public class dce extends cxh {
   public static final MapCodec<dce> a = b(dce::new);
   public static final int b = 3;
   public static final dkp c = dkf.as;
   private static final emv[] d = new emv[]{
      cwy.a(0.0, 0.0, 0.0, 16.0, 5.0, 16.0),
      cwy.a(0.0, 0.0, 0.0, 16.0, 8.0, 16.0),
      cwy.a(0.0, 0.0, 0.0, 16.0, 11.0, 16.0),
      cwy.a(0.0, 0.0, 0.0, 16.0, 14.0, 16.0)
   };

   @Override
   public MapCodec<dce> a() {
      return a;
   }

   protected dce(djo.d $$0) {
      super($$0);
      this.k(this.E.b().a(c, Integer.valueOf(0)));
   }

   @Override
   public emv a(djp $$0, ctd $$1, hx $$2, emh $$3) {
      return d[$$0.c(c)];
   }

   @Override
   protected boolean b(djp $$0, ctd $$1, hx $$2) {
      return $$0.a(cxa.dW);
   }

   @Override
   public boolean e_(djp $$0) {
      return $$0.c(c) < 3;
   }

   @Override
   public void b(djp $$0, ane $$1, hx $$2, auw $$3) {
      int $$4 = $$0.c(c);
      if ($$4 < 3 && $$3.a(10) == 0) {
         $$0 = $$0.a(c, Integer.valueOf($$4 + 1));
         $$1.a($$2, $$0, 2);
      }
   }

   @Override
   public cng a(cua $$0, hx $$1, djp $$2) {
      return new cng(cnj.si);
   }

   @Override
   protected void a(djq.a<cwy, djp> $$0) {
      $$0.a(c);
   }
}
