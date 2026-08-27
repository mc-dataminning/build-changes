import com.mojang.serialization.MapCodec;

public class dfx extends dam {
   public static final MapCodec<dfx> b = b(dfx::new);
   private static final vq c = vq.c("container.upgrade");

   @Override
   public MapCodec<dfx> a() {
      return b;
   }

   protected dfx(dli.d $$0) {
      super($$0);
   }

   @Override
   protected bma b(dlj $$0, cvr $$1, hz $$2) {
      return new bmg(($$2x, $$3, $$4) -> new cmb($$2x, $$3, ckq.a($$1, $$2)), c);
   }

   @Override
   protected blw a(dlj $$0, cvr $$1, hz $$2, chl $$3, env $$4) {
      if ($$1.B) {
         return blw.a;
      } else {
         $$3.a($$0.b($$1, $$2));
         $$3.a(atv.aF);
         return blw.b;
      }
   }
}
