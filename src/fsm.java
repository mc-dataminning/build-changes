import javax.annotation.Nullable;

public abstract class fsm<E extends fsm.a<E>> extends frk<E> {
   private static final ww a = ww.c("narration.selection.usage");

   public fsm(fof $$0, int $$1, int $$2, int $$3, int $$4) {
      super($$0, $$1, $$2, $$3, $$4);
   }

   public fsm(fof $$0, int $$1, int $$2, int $$3, int $$4, int $$5) {
      super($$0, $$1, $$2, $$3, $$4, $$5);
   }

   @Nullable
   @Override
   public fqz a(fvt $$0) {
      if (this.t() == 0) {
         return null;
      } else if (this.aI_() && $$0 instanceof fvt.a $$1) {
         E $$2 = this.a($$1.b());
         if ($$2 != null) {
            return fqz.a(this, fqz.a($$2));
         } else {
            this.a(null);
            return null;
         }
      } else if (!this.aI_()) {
         E $$3 = this.p();
         if ($$3 == null) {
            $$3 = this.a($$0.a());
         }

         return $$3 == null ? null : fqz.a(this, fqz.a($$3));
      } else {
         return null;
      }
   }

   @Override
   public void a(fvn $$0) {
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

      if (this.aI_()) {
         $$0.a(fvm.d, a);
      }
   }

   public abstract static class a<E extends fsm.a<E>> extends frk.a<E> implements fvo {
      public abstract ww a();

      @Override
      public boolean a(double $$0, double $$1, int $$2) {
         return true;
      }

      @Override
      public void b(fvn $$0) {
         $$0.a(fvm.a, this.a());
      }
   }
}
