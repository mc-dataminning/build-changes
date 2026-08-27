import com.mojang.serialization.MapCodec;

public class cxt extends cvz {
   public static final MapCodec<cxt> a = b(cxt::new);
   private static final vb b = vb.c("container.crafting");

   @Override
   public MapCodec<? extends cxt> a() {
      return a;
   }

   protected cxt(dio.d $$0) {
      super($$0);
   }

   @Override
   public bjl a(dip $$0, csy $$1, hv $$2, cer $$3, bjk $$4, ekx $$5) {
      if ($$1.B) {
         return bjl.a;
      } else {
         $$3.a($$0.b($$1, $$2));
         $$3.a(arm.an);
         return bjl.b;
      }
   }

   @Override
   public bjo b(dip $$0, csy $$1, hv $$2) {
      return new bju(($$2x, $$3, $$4) -> new cib($$2x, $$3, chv.a($$1, $$2)), b);
   }
}
