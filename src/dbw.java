import com.mojang.serialization.MapCodec;

public class dbw extends cwz {
   public static final MapCodec<dbw> a = b(dbw::new);
   public static final int b = 3;
   public static final dkh c = djx.as;
   private static final emm[] d = new emm[]{
      cwq.a(0.0, 0.0, 0.0, 16.0, 5.0, 16.0),
      cwq.a(0.0, 0.0, 0.0, 16.0, 8.0, 16.0),
      cwq.a(0.0, 0.0, 0.0, 16.0, 11.0, 16.0),
      cwq.a(0.0, 0.0, 0.0, 16.0, 14.0, 16.0)
   };

   @Override
   public MapCodec<dbw> a() {
      return a;
   }

   protected dbw(djg.d $$0) {
      super($$0);
      this.k(this.E.b().a(c, Integer.valueOf(0)));
   }

   @Override
   public emm a(djh $$0, csv $$1, hx $$2, ely $$3) {
      return d[$$0.c(c)];
   }

   @Override
   protected boolean b(djh $$0, csv $$1, hx $$2) {
      return $$0.a(cws.dW);
   }

   @Override
   public boolean e_(djh $$0) {
      return $$0.c(c) < 3;
   }

   @Override
   public void b(djh $$0, and $$1, hx $$2, auv $$3) {
      int $$4 = $$0.c(c);
      if ($$4 < 3 && $$3.a(10) == 0) {
         $$0 = $$0.a(c, Integer.valueOf($$4 + 1));
         $$1.a($$2, $$0, 2);
      }
   }

   @Override
   public cmy a(cts $$0, hx $$1, djh $$2) {
      return new cmy(cnb.sg);
   }

   @Override
   protected void a(dji.a<cwq, djh> $$0) {
      $$0.a(c);
   }
}
