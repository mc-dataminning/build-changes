import com.mojang.serialization.MapCodec;

public class dfi extends cyt {
   public static final MapCodec<dfi> a = b(dfi::new);
   public static final int b = 2;
   public static final dkp c = dkf.aq;
   private static final float g = 3.0F;
   private static final emv[] h = new emv[]{cwy.a(5.0, 0.0, 5.0, 11.0, 6.0, 11.0), cwy.a(5.0, 0.0, 5.0, 11.0, 10.0, 11.0)};
   private static final int i = 1;

   @Override
   public MapCodec<dfi> a() {
      return a;
   }

   public dfi(djo.d $$0) {
      super($$0);
   }

   @Override
   protected void a(djq.a<cwy, djp> $$0) {
      $$0.a(c);
   }

   @Override
   public emv a(djp $$0, ctd $$1, hx $$2, emh $$3) {
      return h[this.g($$0)];
   }

   @Override
   protected dkp b() {
      return c;
   }

   @Override
   public int c() {
      return 2;
   }

   @Override
   protected ctw d() {
      return cnj.ve;
   }

   @Override
   public djp b(int $$0) {
      return $$0 == 2 ? cxa.bS.o() : super.b($$0);
   }

   @Override
   public void b(djp $$0, ane $$1, hx $$2, auw $$3) {
      if ($$3.a(3) != 0) {
         super.b($$0, $$1, $$2, $$3);
      }
   }

   @Override
   protected int a(ctx $$0) {
      return 1;
   }
}
