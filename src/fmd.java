import javax.annotation.Nullable;

public abstract class fmd<E extends fmd.a<E>> extends flc<E> {
   private static final xi a = xi.c("narration.selection.usage");

   public fmd(fji $$0, int $$1, int $$2, int $$3, int $$4) {
      super($$0, $$1, $$2, $$3, $$4);
   }

   @Nullable
   @Override
   public fkr a(fpl $$0) {
      if (this.l() == 0) {
         return null;
      } else if (this.aM_() && $$0 instanceof fpl.a $$1) {
         E $$2 = this.a($$1.b());
         return $$2 != null ? fkr.a(this, fkr.a($$2)) : null;
      } else if (!this.aM_()) {
         E $$3 = this.h();
         if ($$3 == null) {
            $$3 = this.a($$0.a());
         }

         return $$3 == null ? null : fkr.a(this, fkr.a($$3));
      } else {
         return null;
      }
   }

   @Override
   public void a(fpf $$0) {
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

      if (this.aM_()) {
         $$0.a(fpe.d, a);
      }
   }

   public abstract static class a<E extends fmd.a<E>> extends flc.a<E> implements fpg {
      public abstract xi a();

      @Override
      public boolean a(double $$0, double $$1, int $$2) {
         return true;
      }

      @Override
      public void b(fpf $$0) {
         $$0.a(fpe.a, this.a());
      }
   }
}
