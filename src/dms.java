import com.mojang.serialization.MapCodec;

public class dms extends dma {
   public static final MapCodec<dms> a = b(dms::new);
   private static final ffc b = dma.b(16.0, 0.0, 1.0);

   @Override
   public MapCodec<? extends dms> a() {
      return a;
   }

   public dms(dzy.d $$0) {
      super($$0);
   }

   @Override
   protected ffc a(dzz $$0, dib $$1, iu $$2, fen $$3) {
      return b;
   }

   @Override
   protected dzz a(dzz $$0, diy $$1, djk $$2, iu $$3, ja $$4, iu $$5, dzz $$6, azv $$7) {
      return !$$0.a($$1, $$3) ? dmc.a.m() : super.a($$0, $$1, $$2, $$3, $$4, $$5, $$6, $$7);
   }

   @Override
   protected boolean a(dzz $$0, diy $$1, iu $$2) {
      return !$$1.v($$2.e());
   }
}
