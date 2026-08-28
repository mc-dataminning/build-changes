import javax.annotation.Nullable;

public abstract class fms<E extends fms.a<E>> extends flr<E> {
   private static final xl a = xl.c("narration.selection.usage");

   public fms(fjx $$0, int $$1, int $$2, int $$3, int $$4) {
      super($$0, $$1, $$2, $$3, $$4);
   }

   @Nullable
   @Override
   public flg a(fqa $$0) {
      if (this.l() == 0) {
         return null;
      } else if (this.aM_() && $$0 instanceof fqa.a $$1) {
         E $$2 = this.a($$1.b());
         return $$2 != null ? flg.a(this, flg.a($$2)) : null;
      } else if (!this.aM_()) {
         E $$3 = this.h();
         if ($$3 == null) {
            $$3 = this.a($$0.a());
         }

         return $$3 == null ? null : flg.a(this, flg.a($$3));
      } else {
         return null;
      }
   }

   @Override
   public void a(fpu $$0) {
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
         $$0.a(fpt.d, a);
      }
   }

   public abstract static class a<E extends fms.a<E>> extends flr.a<E> implements fpv {
      public abstract xl a();

      @Override
      public boolean a(double $$0, double $$1, int $$2) {
         return true;
      }

      @Override
      public void b(fpu $$0) {
         $$0.a(fpt.a, this.a());
      }
   }
}
