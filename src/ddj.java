import com.mojang.serialization.MapCodec;

public class ddj extends dcn {
   public static final MapCodec<ddj> a = b(ddj::new);
   private static final vq b = vq.c("container.loom");

   @Override
   public MapCodec<ddj> a() {
      return a;
   }

   protected ddj(dli.d $$0) {
      super($$0);
   }

   @Override
   protected blw a(dlj $$0, cvr $$1, hz $$2, chl $$3, env $$4) {
      if ($$1.B) {
         return blw.a;
      } else {
         $$3.a($$0.b($$1, $$2));
         $$3.a(atv.ax);
         return blw.b;
      }
   }

   @Override
   protected bma b(dlj $$0, cvr $$1, hz $$2) {
      return new bmg(($$2x, $$3, $$4) -> new clk($$2x, $$3, ckq.a($$1, $$2)), b);
   }

   @Override
   public dlj a(crk $$0) {
      return this.o().a(aE, $$0.g().g());
   }

   @Override
   protected void a(dlk.a<cys, dlj> $$0) {
      $$0.a(aE);
   }
}
