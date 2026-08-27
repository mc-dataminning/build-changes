import com.mojang.serialization.MapCodec;

public class cwl extends cyl {
   public static final MapCodec<cwl> a = b(cwl::new);
   public static final int b = 3;
   public static final dkh c = djx.as;
   private static final emm[] g = new emm[]{
      cwq.a(0.0, 0.0, 0.0, 16.0, 2.0, 16.0),
      cwq.a(0.0, 0.0, 0.0, 16.0, 4.0, 16.0),
      cwq.a(0.0, 0.0, 0.0, 16.0, 6.0, 16.0),
      cwq.a(0.0, 0.0, 0.0, 16.0, 8.0, 16.0)
   };

   @Override
   public MapCodec<cwl> a() {
      return a;
   }

   public cwl(djg.d $$0) {
      super($$0);
   }

   @Override
   protected dkh b() {
      return c;
   }

   @Override
   public int c() {
      return 3;
   }

   @Override
   protected cto d() {
      return cnb.ve;
   }

   @Override
   public void b(djh $$0, and $$1, hx $$2, auv $$3) {
      if ($$3.a(3) != 0) {
         super.b($$0, $$1, $$2, $$3);
      }
   }

   @Override
   protected int a(ctp $$0) {
      return super.a($$0) / 3;
   }

   @Override
   protected void a(dji.a<cwq, djh> $$0) {
      $$0.a(c);
   }

   @Override
   public emm a(djh $$0, csv $$1, hx $$2, ely $$3) {
      return g[this.g($$0)];
   }
}
