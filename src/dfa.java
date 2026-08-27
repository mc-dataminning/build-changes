import com.mojang.serialization.MapCodec;

public class dfa extends cyl {
   public static final MapCodec<dfa> a = b(dfa::new);
   public static final int b = 2;
   public static final dkh c = djx.aq;
   private static final float g = 3.0F;
   private static final emm[] h = new emm[]{cwq.a(5.0, 0.0, 5.0, 11.0, 6.0, 11.0), cwq.a(5.0, 0.0, 5.0, 11.0, 10.0, 11.0)};
   private static final int i = 1;

   @Override
   public MapCodec<dfa> a() {
      return a;
   }

   public dfa(djg.d $$0) {
      super($$0);
   }

   @Override
   protected void a(dji.a<cwq, djh> $$0) {
      $$0.a(c);
   }

   @Override
   public emm a(djh $$0, csv $$1, hx $$2, ely $$3) {
      return h[this.g($$0)];
   }

   @Override
   protected dkh b() {
      return c;
   }

   @Override
   public int c() {
      return 2;
   }

   @Override
   protected cto d() {
      return cnb.vb;
   }

   @Override
   public djh b(int $$0) {
      return $$0 == 2 ? cws.bS.o() : super.b($$0);
   }

   @Override
   public void b(djh $$0, and $$1, hx $$2, auv $$3) {
      if ($$3.a(3) != 0) {
         super.b($$0, $$1, $$2, $$3);
      }
   }

   @Override
   protected int a(ctp $$0) {
      return 1;
   }
}
