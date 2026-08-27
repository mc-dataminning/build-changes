import com.mojang.serialization.MapCodec;

public class dbp extends cws {
   public static final MapCodec<dbp> a = b(dbp::new);
   public static final int b = 3;
   public static final dka c = djq.as;
   private static final emf[] d = new emf[]{
      cwj.a(0.0, 0.0, 0.0, 16.0, 5.0, 16.0),
      cwj.a(0.0, 0.0, 0.0, 16.0, 8.0, 16.0),
      cwj.a(0.0, 0.0, 0.0, 16.0, 11.0, 16.0),
      cwj.a(0.0, 0.0, 0.0, 16.0, 14.0, 16.0)
   };

   @Override
   public MapCodec<dbp> a() {
      return a;
   }

   protected dbp(diz.d $$0) {
      super($$0);
      this.k(this.E.b().a(c, Integer.valueOf(0)));
   }

   @Override
   public emf a(dja $$0, cso $$1, hx $$2, elr $$3) {
      return d[$$0.c(c)];
   }

   @Override
   protected boolean b(dja $$0, cso $$1, hx $$2) {
      return $$0.a(cwl.dW);
   }

   @Override
   public boolean e_(dja $$0) {
      return $$0.c(c) < 3;
   }

   @Override
   public void b(dja $$0, amz $$1, hx $$2, aup $$3) {
      int $$4 = $$0.c(c);
      if ($$4 < 3 && $$3.a(10) == 0) {
         $$0 = $$0.a(c, Integer.valueOf($$4 + 1));
         $$1.a($$2, $$0, 2);
      }
   }

   @Override
   public cmr a(ctl $$0, hx $$1, dja $$2) {
      return new cmr(cmu.sg);
   }

   @Override
   protected void a(djb.a<cwj, dja> $$0) {
      $$0.a(c);
   }
}
