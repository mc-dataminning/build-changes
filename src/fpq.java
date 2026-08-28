import javax.annotation.Nullable;

public abstract class fpq<E extends fpq.a<E>> extends fon<E> {
   private static final wp a = wp.c("narration.selection.usage");

   public fpq(flk $$0, int $$1, int $$2, int $$3, int $$4) {
      super($$0, $$1, $$2, $$3, $$4);
   }

   public fpq(flk $$0, int $$1, int $$2, int $$3, int $$4, int $$5) {
      super($$0, $$1, $$2, $$3, $$4, $$5);
   }

   @Nullable
   @Override
   public foc a(fsx $$0) {
      if (this.t() == 0) {
         return null;
      } else if (this.aM_() && $$0 instanceof fsx.a $$1) {
         E $$2 = this.a($$1.b());
         if ($$2 != null) {
            return foc.a(this, foc.a($$2));
         } else {
            this.a(null);
            return null;
         }
      } else if (!this.aM_()) {
         E $$3 = this.p();
         if ($$3 == null) {
            $$3 = this.a($$0.a());
         }

         return $$3 == null ? null : foc.a(this, foc.a($$3));
      } else {
         return null;
      }
   }

   @Override
   public void a(fsr $$0) {
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
         $$0.a(fsq.d, a);
      }
   }

   public abstract static class a<E extends fpq.a<E>> extends fon.a<E> implements fss {
      public abstract wp a();

      @Override
      public boolean a(double $$0, double $$1, int $$2) {
         return true;
      }

      @Override
      public void b(fsr $$0) {
         $$0.a(fsq.a, this.a());
      }
   }
}
