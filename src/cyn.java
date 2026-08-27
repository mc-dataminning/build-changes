import com.mojang.serialization.MapCodec;

public class cyn extends dan {
   public static final MapCodec<cyn> a = b(cyn::new);
   public static final int b = 3;
   public static final dmj c = dlz.as;
   private static final eos[] g = new eos[]{
      cys.a(0.0, 0.0, 0.0, 16.0, 2.0, 16.0),
      cys.a(0.0, 0.0, 0.0, 16.0, 4.0, 16.0),
      cys.a(0.0, 0.0, 0.0, 16.0, 6.0, 16.0),
      cys.a(0.0, 0.0, 0.0, 16.0, 8.0, 16.0)
   };

   @Override
   public MapCodec<cyn> a() {
      return a;
   }

   public cyn(dli.d $$0) {
      super($$0);
   }

   @Override
   protected dmj b() {
      return c;
   }

   @Override
   public int c() {
      return 3;
   }

   @Override
   protected cvq d() {
      return cpg.vh;
   }

   @Override
   protected void b(dlj $$0, aow $$1, hz $$2, awp $$3) {
      if ($$3.a(3) != 0) {
         super.b($$0, $$1, $$2, $$3);
      }
   }

   @Override
   protected int a(cvr $$0) {
      return super.a($$0) / 3;
   }

   @Override
   protected void a(dlk.a<cys, dlj> $$0) {
      $$0.a(c);
   }

   @Override
   protected eos a(dlj $$0, cux $$1, hz $$2, eoe $$3) {
      return g[this.g($$0)];
   }
}
