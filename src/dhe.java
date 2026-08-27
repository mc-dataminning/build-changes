import com.mojang.serialization.MapCodec;

public class dhe extends dch {
   public static final MapCodec<dhe> a = b(dhe::new);
   public static final int b = 3;
   public static final dpz c = dpp.as;
   private static final est[] d = new est[]{
      dby.a(0.0, 0.0, 0.0, 16.0, 5.0, 16.0),
      dby.a(0.0, 0.0, 0.0, 16.0, 8.0, 16.0),
      dby.a(0.0, 0.0, 0.0, 16.0, 11.0, 16.0),
      dby.a(0.0, 0.0, 0.0, 16.0, 14.0, 16.0)
   };

   @Override
   public MapCodec<dhe> a() {
      return a;
   }

   protected dhe(doy.d $$0) {
      super($$0);
      this.k(this.E.b().a(c, Integer.valueOf(0)));
   }

   @Override
   protected est a(doz $$0, cyd $$1, ib $$2, esf $$3) {
      return d[$$0.c(c)];
   }

   @Override
   protected boolean b(doz $$0, cyd $$1, ib $$2) {
      return $$0.a(dca.dW);
   }

   @Override
   protected boolean e_(doz $$0) {
      return $$0.c(c) < 3;
   }

   @Override
   protected void b(doz $$0, aps $$1, ib $$2, axr $$3) {
      int $$4 = $$0.c(c);
      if ($$4 < 3 && $$3.a(10) == 0) {
         $$0 = $$0.a(c, Integer.valueOf($$4 + 1));
         $$1.a($$2, $$0, 2);
      }
   }

   @Override
   public crj a(cza $$0, ib $$1, doz $$2) {
      return new crj(crm.si);
   }

   @Override
   protected void a(dpa.a<dby, doz> $$0) {
      $$0.a(c);
   }
}
