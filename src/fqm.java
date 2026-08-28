import javax.annotation.Nullable;

public abstract class fqm<E extends fqm.a<E>> extends fpk<E> {
   private static final wp a = wp.c("narration.selection.usage");

   public fqm(fmg $$0, int $$1, int $$2, int $$3, int $$4) {
      super($$0, $$1, $$2, $$3, $$4);
   }

   public fqm(fmg $$0, int $$1, int $$2, int $$3, int $$4, int $$5) {
      super($$0, $$1, $$2, $$3, $$4, $$5);
   }

   @Nullable
   @Override
   public foz a(ftt $$0) {
      if (this.t() == 0) {
         return null;
      } else if (this.aM_() && $$0 instanceof ftt.a $$1) {
         E $$2 = this.a($$1.b());
         if ($$2 != null) {
            return foz.a(this, foz.a($$2));
         } else {
            this.a(null);
            return null;
         }
      } else if (!this.aM_()) {
         E $$3 = this.p();
         if ($$3 == null) {
            $$3 = this.a($$0.a());
         }

         return $$3 == null ? null : foz.a(this, foz.a($$3));
      } else {
         return null;
      }
   }

   @Override
   public void a(ftn $$0) {
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
         $$0.a(ftm.d, a);
      }
   }

   public abstract static class a<E extends fqm.a<E>> extends fpk.a<E> implements fto {
      public abstract wp a();

      @Override
      public boolean a(double $$0, double $$1, int $$2) {
         return true;
      }

      @Override
      public void b(ftn $$0) {
         $$0.a(ftm.a, this.a());
      }
   }
}
