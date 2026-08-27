import com.mojang.serialization.MapCodec;

public class ddy extends czb {
   public static final MapCodec<ddy> a = b(ddy::new);
   public static final int b = 3;
   public static final dmj c = dlz.as;
   private static final eos[] d = new eos[]{
      cys.a(0.0, 0.0, 0.0, 16.0, 5.0, 16.0),
      cys.a(0.0, 0.0, 0.0, 16.0, 8.0, 16.0),
      cys.a(0.0, 0.0, 0.0, 16.0, 11.0, 16.0),
      cys.a(0.0, 0.0, 0.0, 16.0, 14.0, 16.0)
   };

   @Override
   public MapCodec<ddy> a() {
      return a;
   }

   protected ddy(dli.d $$0) {
      super($$0);
      this.k(this.E.b().a(c, Integer.valueOf(0)));
   }

   @Override
   protected eos a(dlj $$0, cux $$1, hz $$2, eoe $$3) {
      return d[$$0.c(c)];
   }

   @Override
   protected boolean b(dlj $$0, cux $$1, hz $$2) {
      return $$0.a(cyu.dW);
   }

   @Override
   protected boolean e_(dlj $$0) {
      return $$0.c(c) < 3;
   }

   @Override
   protected void b(dlj $$0, aow $$1, hz $$2, awp $$3) {
      int $$4 = $$0.c(c);
      if ($$4 < 3 && $$3.a(10) == 0) {
         $$0 = $$0.a(c, Integer.valueOf($$4 + 1));
         $$1.a($$2, $$0, 2);
      }
   }

   @Override
   public cpd a(cvu $$0, hz $$1, dlj $$2) {
      return new cpd(cpg.si);
   }

   @Override
   protected void a(dlk.a<cys, dlj> $$0) {
      $$0.a(c);
   }
}
