import com.mojang.serialization.MapCodec;

public abstract class dkt extends dma {
   protected static final int a = 4;
   private static final ffc c = dma.b(12.0, 4.0, 16.0);
   private static final ffc d = af.a(() -> {
      int $$0 = 4;
      int $$1 = 3;
      int $$2 = 2;
      return fez.a(fez.b(), fez.a(dma.a(16.0, 8.0, 0.0, 3.0), dma.a(8.0, 16.0, 0.0, 3.0), dma.b(12.0, 0.0, 3.0), c), fem.e);
   });
   protected final kb.a b;

   @Override
   protected abstract MapCodec<? extends dkt> a();

   public dkt(dzy.d $$0, kb.a $$1) {
      super($$0);
      this.b = $$1;
   }

   protected double b(dzz $$0) {
      return 0.0;
   }

   protected boolean a(dzz $$0, iu $$1, bwd $$2) {
      return $$2.dC() < (double)$$1.v() + this.b($$0) && $$2.cR().e > (double)$$1.v() + 0.25;
   }

   @Override
   protected bub a(cyy $$0, dzz $$1, div $$2, iu $$3, cqy $$4, bua $$5, fee $$6) {
      kb $$7 = this.b.b().get($$0.h());
      return $$7.interact($$1, $$2, $$3, $$4, $$5, $$0);
   }

   @Override
   protected ffc a(dzz $$0, dib $$1, iu $$2, fen $$3) {
      return d;
   }

   @Override
   protected ffc a(dzz $$0, dib $$1, iu $$2) {
      return c;
   }

   @Override
   protected boolean c_(dzz $$0) {
      return true;
   }

   @Override
   protected boolean a(dzz $$0, ewv $$1) {
      return false;
   }

   public abstract boolean d(dzz var1);

   @Override
   protected void a(dzz $$0, arq $$1, iu $$2, azv $$3) {
      iu $$4 = drx.a((div)$$1, $$2);
      if ($$4 != null) {
         ewf $$5 = drx.a($$1, $$4);
         if ($$5 != ewh.a && this.a($$5)) {
            this.a($$0, $$1, $$2, $$5);
         }
      }
   }

   protected boolean a(ewf $$0) {
      return false;
   }

   protected void a(dzz $$0, div $$1, iu $$2, ewf $$3) {
   }
}
