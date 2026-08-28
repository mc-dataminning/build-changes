import com.mojang.serialization.MapCodec;

public class dtu extends dma {
   public static final MapCodec<dtu> a = b(dtu::new);
   private static final ffc b = dma.b(16.0, 0.0, 14.0);
   private static final int c = 20;

   @Override
   public MapCodec<dtu> a() {
      return a;
   }

   public dtu(dzy.d $$0) {
      super($$0);
   }

   @Override
   protected ffc b(dzz $$0, dib $$1, iu $$2, fen $$3) {
      return b;
   }

   @Override
   protected ffc b_(dzz $$0, dib $$1, iu $$2) {
      return fez.b();
   }

   @Override
   protected ffc c(dzz $$0, dib $$1, iu $$2, fen $$3) {
      return fez.b();
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

   @Override
   protected boolean a(dzz $$0, ewv $$1) {
      return false;
   }

   @Override
   protected float c(dzz $$0, dib $$1, iu $$2) {
      return 0.2F;
   }
}
