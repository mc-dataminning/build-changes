import javax.annotation.Nullable;

public abstract class fpo<E extends fpo.a<E>> extends fol<E> {
   private static final wo a = wo.c("narration.selection.usage");

   public fpo(flj $$0, int $$1, int $$2, int $$3, int $$4) {
      super($$0, $$1, $$2, $$3, $$4);
   }

   public fpo(flj $$0, int $$1, int $$2, int $$3, int $$4, int $$5) {
      super($$0, $$1, $$2, $$3, $$4, $$5);
   }

   @Nullable
   @Override
   public foa a(fsv $$0) {
      if (this.t() == 0) {
         return null;
      } else if (this.aM_() && $$0 instanceof fsv.a $$1) {
         E $$2 = this.a($$1.b());
         if ($$2 != null) {
            return foa.a(this, foa.a($$2));
         } else {
            this.a(null);
            return null;
         }
      } else if (!this.aM_()) {
         E $$3 = this.p();
         if ($$3 == null) {
            $$3 = this.a($$0.a());
         }

         return $$3 == null ? null : foa.a(this, foa.a($$3));
      } else {
         return null;
      }
   }

   @Override
   public void a(fsp $$0) {
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
         $$0.a(fso.d, a);
      }
   }

   public abstract static class a<E extends fpo.a<E>> extends fol.a<E> implements fsq {
      public abstract wo a();

      @Override
      public boolean a(double $$0, double $$1, int $$2) {
         return true;
      }

      @Override
      public void b(fsp $$0) {
         $$0.a(fso.a, this.a());
      }
   }
}
