import javax.annotation.Nullable;

public abstract class fpm<E extends fpm.a<E>> extends foj<E> {
   private static final wo a = wo.c("narration.selection.usage");

   public fpm(flh $$0, int $$1, int $$2, int $$3, int $$4) {
      super($$0, $$1, $$2, $$3, $$4);
   }

   public fpm(flh $$0, int $$1, int $$2, int $$3, int $$4, int $$5) {
      super($$0, $$1, $$2, $$3, $$4, $$5);
   }

   @Nullable
   @Override
   public fny a(fst $$0) {
      if (this.t() == 0) {
         return null;
      } else if (this.aM_() && $$0 instanceof fst.a $$1) {
         E $$2 = this.a($$1.b());
         if ($$2 != null) {
            return fny.a(this, fny.a($$2));
         } else {
            this.a(null);
            return null;
         }
      } else if (!this.aM_()) {
         E $$3 = this.p();
         if ($$3 == null) {
            $$3 = this.a($$0.a());
         }

         return $$3 == null ? null : fny.a(this, fny.a($$3));
      } else {
         return null;
      }
   }

   @Override
   public void a(fsn $$0) {
      E $$1 = this.x();
      if ($$1 != null) {
         this.a($$0.a(), $$1);
         $$1.b($$0);
      } else {
         E $$2 = this.p();
         if ($$2 != null) {
            this.a($$0.a(), $$2);
            $$2.b($$0);
         }
      }

      if (this.aM_()) {
         $$0.a(fsm.d, a);
      }
   }

   public abstract static class a<E extends fpm.a<E>> extends foj.a<E> implements fso {
      public abstract wo a();

      @Override
      public boolean a(double $$0, double $$1, int $$2) {
         return true;
      }

      @Override
      public void b(fsn $$0) {
         $$0.a(fsm.a, this.a());
      }
   }
}
