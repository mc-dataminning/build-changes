import com.mojang.serialization.MapCodec;

public class dhc extends dan {
   public static final MapCodec<dhc> a = b(dhc::new);
   public static final int b = 2;
   public static final dmj c = dlz.aq;
   private static final float g = 3.0F;
   private static final eos[] h = new eos[]{cys.a(5.0, 0.0, 5.0, 11.0, 6.0, 11.0), cys.a(5.0, 0.0, 5.0, 11.0, 10.0, 11.0)};
   private static final int i = 1;

   @Override
   public MapCodec<dhc> a() {
      return a;
   }

   public dhc(dli.d $$0) {
      super($$0);
   }

   @Override
   protected void a(dlk.a<cys, dlj> $$0) {
      $$0.a(c);
   }

   @Override
   public eos a(dlj $$0, cux $$1, hz $$2, eoe $$3) {
      return h[this.g($$0)];
   }

   @Override
   protected dmj b() {
      return c;
   }

   @Override
   public int c() {
      return 2;
   }

   @Override
   protected cvq d() {
      return cpg.ve;
   }

   @Override
   public dlj b(int $$0) {
      return $$0 == 2 ? cyu.bS.o() : super.b($$0);
   }

   @Override
   public void b(dlj $$0, aow $$1, hz $$2, awp $$3) {
      if ($$3.a(3) != 0) {
         super.b($$0, $$1, $$2, $$3);
      }
   }

   @Override
   protected int a(cvr $$0) {
      return 1;
   }
}
