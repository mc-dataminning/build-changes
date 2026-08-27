import javax.annotation.Nullable;

public abstract class fgw<E extends fgw.a<E>> extends ffv<E> {
   private static final wx a = wx.c("narration.selection.usage");

   public fgw(feb $$0, int $$1, int $$2, int $$3, int $$4) {
      super($$0, $$1, $$2, $$3, $$4);
   }

   @Nullable
   @Override
   public ffk a(fkc $$0) {
      if (this.l() == 0) {
         return null;
      } else if (this.aJ_() && $$0 instanceof fkc.a $$1) {
         E $$2 = this.a($$1.b());
         return $$2 != null ? ffk.a(this, ffk.a($$2)) : null;
      } else if (!this.aJ_()) {
         E $$3 = this.h();
         if ($$3 == null) {
            $$3 = this.a($$0.a());
         }

         return $$3 == null ? null : ffk.a(this, ffk.a($$3));
      } else {
         return null;
      }
   }

   @Override
   public void a(fjw $$0) {
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

      if (this.aJ_()) {
         $$0.a(fjv.d, a);
      }
   }

   public abstract static class a<E extends fgw.a<E>> extends ffv.a<E> implements fjx {
      public abstract wx a();

      @Override
      public boolean a(double $$0, double $$1, int $$2) {
         return true;
      }

      @Override
      public void b(fjw $$0) {
         $$0.a(fjv.a, this.a());
      }
   }
}
