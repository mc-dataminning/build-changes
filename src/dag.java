import com.mojang.serialization.MapCodec;

public class dag extends cvj {
   public static final MapCodec<dag> a = b(dag::new);
   public static final int b = 3;
   public static final dii c = dhy.as;
   private static final ekn[] d = new ekn[]{
      cva.a(0.0, 0.0, 0.0, 16.0, 5.0, 16.0),
      cva.a(0.0, 0.0, 0.0, 16.0, 8.0, 16.0),
      cva.a(0.0, 0.0, 0.0, 16.0, 11.0, 16.0),
      cva.a(0.0, 0.0, 0.0, 16.0, 14.0, 16.0)
   };

   @Override
   public MapCodec<dag> a() {
      return a;
   }

   protected dag(dhh.d $$0) {
      super($$0);
      this.k(this.E.b().a(c, Integer.valueOf(0)));
   }

   @Override
   public ekn a(dhi $$0, crg $$1, ht $$2, ejz $$3) {
      return d[$$0.c(c)];
   }

   @Override
   protected boolean b(dhi $$0, crg $$1, ht $$2) {
      return $$0.a(cvc.dW);
   }

   @Override
   public boolean e_(dhi $$0) {
      return $$0.c(c) < 3;
   }

   @Override
   public void b(dhi $$0, ame $$1, ht $$2, ats $$3) {
      int $$4 = $$0.c(c);
      if ($$4 < 3 && $$3.a(10) == 0) {
         $$0 = $$0.a(c, Integer.valueOf($$4 + 1));
         $$1.a($$2, $$0, 2);
      }
   }

   @Override
   public clj a(csd $$0, ht $$1, dhi $$2) {
      return new clj(clm.sg);
   }

   @Override
   protected void a(dhj.a<cva, dhi> $$0) {
      $$0.a(c);
   }
}
