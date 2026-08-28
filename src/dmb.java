import com.mojang.serialization.MapCodec;

public class dmb extends dlf {
   public static final MapCodec<dmb> a = b(dmb::new);
   private static final xd b = xd.c("container.loom");

   @Override
   public MapCodec<dmb> a() {
      return a;
   }

   protected dmb(dun.d $$0) {
      super($$0);
   }

   @Override
   protected brp a(duo $$0, deg $$1, je $$2, cnu $$3, eyo $$4) {
      if (!$$1.B) {
         $$3.a($$0.b($$1, $$2));
         $$3.a(awo.ax);
      }

      return brp.a;
   }

   @Override
   protected brr b(duo $$0, deg $$1, je $$2) {
      return new brx(($$2x, $$3, $$4) -> new csd($$2x, $$3, crj.a($$1, $$2)), b);
   }

   @Override
   public duo a(czk $$0) {
      return this.o().b(aF, $$0.g().g());
   }

   @Override
   protected void a(dup.a<dhj, duo> $$0) {
      $$0.a(aF);
   }
}
