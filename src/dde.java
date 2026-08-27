import com.mojang.serialization.MapCodec;

public class dde extends cxt {
   public static final MapCodec<dde> b = b(dde::new);
   private static final vb c = vb.c("container.upgrade");

   @Override
   public MapCodec<dde> a() {
      return b;
   }

   protected dde(dio.d $$0) {
      super($$0);
   }

   @Override
   public bjo b(dip $$0, csy $$1, hv $$2) {
      return new bju(($$2x, $$3, $$4) -> new cjg($$2x, $$3, chv.a($$1, $$2)), c);
   }

   @Override
   public bjl a(dip $$0, csy $$1, hv $$2, cer $$3, bjk $$4, ekx $$5) {
      if ($$1.B) {
         return bjl.a;
      } else {
         $$3.a($$0.b($$1, $$2));
         $$3.a(arm.aF);
         return bjl.b;
      }
   }
}
