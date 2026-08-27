import com.mojang.serialization.MapCodec;

public class dgp extends dft {
   public static final MapCodec<dgp> a = b(dgp::new);
   private static final wg b = wg.c("container.loom");

   @Override
   public MapCodec<dgp> a() {
      return a;
   }

   protected dgp(doy.d $$0) {
      super($$0);
   }

   @Override
   protected boa a(doz $$0, cyx $$1, ib $$2, cjt $$3, erw $$4) {
      if ($$1.B) {
         return boa.a;
      } else {
         $$3.a($$0.b($$1, $$2));
         $$3.a(auw.ax);
         return boa.b;
      }
   }

   @Override
   protected boe b(doz $$0, cyx $$1, ib $$2) {
      return new bok(($$2x, $$3, $$4) -> new cnu($$2x, $$3, cna.a($$1, $$2)), b);
   }

   @Override
   public doz a(cuo $$0) {
      return this.n().a(aE, $$0.g().g());
   }

   @Override
   protected void a(dpa.a<dby, doz> $$0) {
      $$0.a(aE);
   }
}
