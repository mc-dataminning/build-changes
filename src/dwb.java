import com.mojang.serialization.MapCodec;

public class dwb extends dma {
   public static final MapCodec<dwb> a = b(dwb::new);

   @Override
   public MapCodec<dwb> a() {
      return a;
   }

   public dwb(dzy.d $$0) {
      super($$0);
   }

   @Override
   protected void a(dzz $$0, div $$1, iu $$2, bwd $$3) {
      fei $$4 = new fei(0.25, 0.05F, 0.25);
      if ($$3 instanceof bxc $$5 && $$5.b(bvj.K)) {
         $$4 = new fei(0.5, 0.25, 0.5);
      }

      $$3.a($$0, $$4);
   }
}
