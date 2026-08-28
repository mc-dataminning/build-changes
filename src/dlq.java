import com.mojang.serialization.MapCodec;

public abstract class dlq extends dma {
   private static final ffc a = dma.b(4.0, 0.0, 10.0);

   protected dlq(dzy.d $$0) {
      super($$0);
   }

   @Override
   protected abstract MapCodec<? extends dlq> a();

   @Override
   protected ffc a(dzz $$0, dib $$1, iu $$2, fen $$3) {
      return a;
   }

   @Override
   protected dzz a(dzz $$0, diy $$1, djk $$2, iu $$3, ja $$4, iu $$5, dzz $$6, azv $$7) {
      return $$4 == ja.a && !this.a($$0, $$1, $$3) ? dmc.a.m() : super.a($$0, $$1, $$2, $$3, $$4, $$5, $$6, $$7);
   }

   @Override
   protected boolean a(dzz $$0, diy $$1, iu $$2) {
      return a($$1, $$2.e(), ja.b);
   }
}
