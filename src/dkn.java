import com.mojang.serialization.MapCodec;

public abstract class dkn extends dlu {
   protected static final int a = 4;
   private static final feq c = dlu.b(12.0, 4.0, 16.0);
   private static final feq d = af.a(() -> {
      int $$0 = 4;
      int $$1 = 3;
      int $$2 = 2;
      return fen.a(fen.b(), fen.a(dlu.a(16.0, 8.0, 0.0, 3.0), dlu.a(8.0, 16.0, 0.0, 3.0), dlu.b(12.0, 0.0, 3.0), c), fea.e);
   });
   protected final kb.a b;

   @Override
   protected abstract MapCodec<? extends dkn> a();

   public dkn(dzn.d $$0, kb.a $$1) {
      super($$0);
      this.b = $$1;
   }

   protected double b(dzo $$0) {
      return 0.0;
   }

   protected boolean a(dzo $$0, iu $$1, bwa $$2) {
      return $$2.dC() < (double)$$1.v() + this.b($$0) && $$2.cR().e > (double)$$1.v() + 0.25;
   }

   @Override
   protected bty a(cys $$0, dzo $$1, dip $$2, iu $$3, cqs $$4, btx $$5, fds $$6) {
      kb $$7 = this.b.b().get($$0.h());
      return $$7.interact($$1, $$2, $$3, $$4, $$5, $$0);
   }

   @Override
   protected feq a(dzo $$0, dhv $$1, iu $$2, feb $$3) {
      return d;
   }

   @Override
   protected feq a(dzo $$0, dhv $$1, iu $$2) {
      return c;
   }

   @Override
   protected boolean c_(dzo $$0) {
      return true;
   }

   @Override
   protected boolean a(dzo $$0, ewk $$1) {
      return false;
   }

   public abstract boolean d(dzo var1);

   @Override
   protected void a(dzo $$0, aro $$1, iu $$2, azt $$3) {
      iu $$4 = drq.a((dip)$$1, $$2);
      if ($$4 != null) {
         evu $$5 = drq.a($$1, $$4);
         if ($$5 != evw.a && this.a($$5)) {
            this.a($$0, $$1, $$2, $$5);
         }
      }
   }

   protected boolean a(evu $$0) {
      return false;
   }

   protected void a(dzo $$0, dip $$1, iu $$2, evu $$3) {
   }
}
