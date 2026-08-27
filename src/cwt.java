import com.mojang.serialization.MapCodec;

public class cwt extends cyt {
   public static final MapCodec<cwt> a = b(cwt::new);
   public static final int b = 3;
   public static final dkp c = dkf.as;
   private static final emv[] g = new emv[]{
      cwy.a(0.0, 0.0, 0.0, 16.0, 2.0, 16.0),
      cwy.a(0.0, 0.0, 0.0, 16.0, 4.0, 16.0),
      cwy.a(0.0, 0.0, 0.0, 16.0, 6.0, 16.0),
      cwy.a(0.0, 0.0, 0.0, 16.0, 8.0, 16.0)
   };

   @Override
   public MapCodec<cwt> a() {
      return a;
   }

   public cwt(djo.d $$0) {
      super($$0);
   }

   @Override
   protected dkp b() {
      return c;
   }

   @Override
   public int c() {
      return 3;
   }

   @Override
   protected ctw d() {
      return cnj.vh;
   }

   @Override
   public void b(djp $$0, ane $$1, hx $$2, auw $$3) {
      if ($$3.a(3) != 0) {
         super.b($$0, $$1, $$2, $$3);
      }
   }

   @Override
   protected int a(ctx $$0) {
      return super.a($$0) / 3;
   }

   @Override
   protected void a(djq.a<cwy, djp> $$0) {
      $$0.a(c);
   }

   @Override
   public emv a(djp $$0, ctd $$1, hx $$2, emh $$3) {
      return g[this.g($$0)];
   }
}
