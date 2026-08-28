import com.mojang.serialization.MapCodec;

public class dqx extends dqa {
   public static final MapCodec<dqx> a = b(dqx::new);
   private static final wy b = wy.c("container.loom");

   @Override
   public MapCodec<dqx> a() {
      return a;
   }

   protected dqx(dzy.d $$0) {
      super($$0);
   }

   @Override
   protected bub a(dzz $$0, div $$1, iu $$2, cqy $$3, fee $$4) {
      if (!$$1.C) {
         $$3.a($$0.b($$1, $$2));
         $$3.a(awx.ax);
      }

      return bub.a;
   }

   @Override
   protected bud b(dzz $$0, div $$1, iu $$2) {
      return new buj(($$2x, $$3, $$4) -> new cvx($$2x, $$3, cvd.a($$1, $$2)), b);
   }

   @Override
   public dzz a(dcr $$0) {
      return this.m().b(e, $$0.g().g());
   }

   @Override
   protected void a(eaa.a<dma, dzz> $$0) {
      $$0.a(e);
   }
}
