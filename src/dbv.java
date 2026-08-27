import com.mojang.serialization.MapCodec;

public class dbv extends cwy {
   public static final MapCodec<dbv> a = b(dbv::new);
   public static final int b = 3;
   public static final dkg c = djw.as;
   private static final eml[] d = new eml[]{
      cwp.a(0.0, 0.0, 0.0, 16.0, 5.0, 16.0),
      cwp.a(0.0, 0.0, 0.0, 16.0, 8.0, 16.0),
      cwp.a(0.0, 0.0, 0.0, 16.0, 11.0, 16.0),
      cwp.a(0.0, 0.0, 0.0, 16.0, 14.0, 16.0)
   };

   @Override
   public MapCodec<dbv> a() {
      return a;
   }

   protected dbv(djf.d $$0) {
      super($$0);
      this.k(this.E.b().a(c, Integer.valueOf(0)));
   }

   @Override
   public eml a(djg $$0, csu $$1, hx $$2, elx $$3) {
      return d[$$0.c(c)];
   }

   @Override
   protected boolean b(djg $$0, csu $$1, hx $$2) {
      return $$0.a(cwr.dW);
   }

   @Override
   public boolean e_(djg $$0) {
      return $$0.c(c) < 3;
   }

   @Override
   public void b(djg $$0, and $$1, hx $$2, auu $$3) {
      int $$4 = $$0.c(c);
      if ($$4 < 3 && $$3.a(10) == 0) {
         $$0 = $$0.a(c, Integer.valueOf($$4 + 1));
         $$1.a($$2, $$0, 2);
      }
   }

   @Override
   public cmx a(ctr $$0, hx $$1, djg $$2) {
      return new cmx(cna.sg);
   }

   @Override
   protected void a(djh.a<cwp, djg> $$0) {
      $$0.a(c);
   }
}
