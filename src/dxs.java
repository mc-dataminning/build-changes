import com.mojang.serialization.MapCodec;

public class dxs extends dno {
   public static final MapCodec<dxs> a = b(dxs::new);

   @Override
   public MapCodec<dxs> a() {
      return a;
   }

   public dxs(ebp.d $$0) {
      super($$0);
   }

   @Override
   protected void a(ebq $$0, dkj $$1, iw $$2, bxe $$3, bxx $$4) {
      fgc $$5 = new fgc(0.25, 0.05F, 0.25);
      if ($$3 instanceof byf $$6 && $$6.b(bwk.K)) {
         $$5 = new fgc(0.5, 0.25, 0.5);
      }

      $$3.a($$0, $$5);
   }
}
