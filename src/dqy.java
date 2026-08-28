import com.mojang.serialization.MapCodec;

public class dqy extends dma {
   public static final MapCodec<dqy> a = b(dqy::new);
   private static final int b = 20;

   @Override
   public MapCodec<dqy> a() {
      return a;
   }

   public dqy(dzy.d $$0) {
      super($$0);
   }

   @Override
   public void a(div $$0, iu $$1, dzz $$2, bwd $$3) {
      if (!$$3.ce() && $$3 instanceof bxc) {
         $$3.a($$0.al().f(), 1.0F);
      }

      super.a($$0, $$1, $$2, $$3);
   }

   @Override
   protected void a(dzz $$0, arq $$1, iu $$2, azv $$3) {
      dmh.b($$1, $$2.d(), $$0);
   }

   @Override
   protected dzz a(dzz $$0, diy $$1, djk $$2, iu $$3, ja $$4, iu $$5, dzz $$6, azv $$7) {
      if ($$4 == ja.b && $$6.a(dmc.J)) {
         $$2.a($$3, this, 20);
      }

      return super.a($$0, $$1, $$2, $$3, $$4, $$5, $$6, $$7);
   }

   @Override
   protected void a(dzz $$0, div $$1, iu $$2, dzz $$3, boolean $$4) {
      $$1.a($$2, this, 20);
   }
}
