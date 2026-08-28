import com.mojang.serialization.MapCodec;

public class dus extends dqy {
   public static final MapCodec<dus> a = b(dus::new);

   @Override
   public MapCodec<dus> a() {
      return a;
   }

   public dus(ebf.d $$0) {
      super($$0);
   }

   @Override
   public void a(djz $$0, ebg $$1, iw $$2, bwv $$3, double $$4) {
      if (!$$3.ce()) {
         $$3.a($$4, 0.0F, $$0.al().l());
      }
   }

   @Override
   public void a(djd $$0, bwv $$1) {
      if ($$1.ce()) {
         super.a($$0, $$1);
      } else {
         this.a($$1);
      }
   }

   private void a(bwv $$0) {
      ffs $$1 = $$0.dy();
      if ($$1.e < 0.0) {
         double $$2 = $$0 instanceof bxw ? 1.0 : 0.8;
         $$0.n($$1.d, -$$1.e * $$2, $$1.f);
      }
   }

   @Override
   public void a(djz $$0, iw $$1, ebg $$2, bwv $$3) {
      double $$4 = Math.abs($$3.dy().e);
      if ($$4 < 0.1 && !$$3.cd()) {
         double $$5 = 0.4 + $$4 * 0.2;
         $$3.i($$3.dy().d($$5, 1.0, $$5));
      }

      super.a($$0, $$1, $$2, $$3);
   }
}
