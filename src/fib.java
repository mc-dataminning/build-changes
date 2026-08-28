import javax.annotation.Nullable;

public abstract class fib<E extends fib.a<E>> extends fha<E> {
   private static final xp a = xp.c("narration.selection.usage");

   public fib(ffg $$0, int $$1, int $$2, int $$3, int $$4) {
      super($$0, $$1, $$2, $$3, $$4);
   }

   @Nullable
   @Override
   public fgp a(flh $$0) {
      if (this.l() == 0) {
         return null;
      } else if (this.aH_() && $$0 instanceof flh.a $$1) {
         E $$2 = this.a($$1.b());
         return $$2 != null ? fgp.a(this, fgp.a($$2)) : null;
      } else if (!this.aH_()) {
         E $$3 = this.h();
         if ($$3 == null) {
            $$3 = this.a($$0.a());
         }

         return $$3 == null ? null : fgp.a(this, fgp.a($$3));
      } else {
         return null;
      }
   }

   @Override
   public void a(flb $$0) {
      E $$1 = this.u();
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

      if (this.aH_()) {
         $$0.a(fla.d, a);
      }
   }

   public abstract static class a<E extends fib.a<E>> extends fha.a<E> implements flc {
      public abstract xp a();

      @Override
      public boolean a(double $$0, double $$1, int $$2) {
         return true;
      }

      @Override
      public void b(flb $$0) {
         $$0.a(fla.a, this.a());
      }
   }
}
