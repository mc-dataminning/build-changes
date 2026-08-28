import javax.annotation.Nullable;

public abstract class fkw<E extends fkw.a<E>> extends fjv<E> {
   private static final xd a = xd.c("narration.selection.usage");

   public fkw(fib $$0, int $$1, int $$2, int $$3, int $$4) {
      super($$0, $$1, $$2, $$3, $$4);
   }

   @Nullable
   @Override
   public fjk a(fod $$0) {
      if (this.l() == 0) {
         return null;
      } else if (this.aO_() && $$0 instanceof fod.a $$1) {
         E $$2 = this.a($$1.b());
         return $$2 != null ? fjk.a(this, fjk.a($$2)) : null;
      } else if (!this.aO_()) {
         E $$3 = this.h();
         if ($$3 == null) {
            $$3 = this.a($$0.a());
         }

         return $$3 == null ? null : fjk.a(this, fjk.a($$3));
      } else {
         return null;
      }
   }

   @Override
   public void a(fnx $$0) {
      E $$1 = this.v();
      if ($$1 != null) {
         this.a($$0.a(), $$1);
         $$1.b($$0);
      } else {
         E $$2 = this.h();
         if ($$2 != null) {
            this.a($$0.a(), $$2);
            $$2.b($$0);
         }
      }

      if (this.aO_()) {
         $$0.a(fnw.d, a);
      }
   }

   public abstract static class a<E extends fkw.a<E>> extends fjv.a<E> implements fny {
      public abstract xd a();

      @Override
      public boolean a(double $$0, double $$1, int $$2) {
         return true;
      }

      @Override
      public void b(fnx $$0) {
         $$0.a(fnw.a, this.a());
      }
   }
}
