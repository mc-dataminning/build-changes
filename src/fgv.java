import javax.annotation.Nullable;

public abstract class fgv<E extends fgv.a<E>> extends ffu<E> {
   private static final wx a = wx.c("narration.selection.usage");

   public fgv(fdz $$0, int $$1, int $$2, int $$3, int $$4) {
      super($$0, $$1, $$2, $$3, $$4);
   }

   @Nullable
   @Override
   public ffj a(fkb $$0) {
      if (this.l() == 0) {
         return null;
      } else if (this.aI_() && $$0 instanceof fkb.a $$1) {
         E $$2 = this.a($$1.b());
         return $$2 != null ? ffj.a(this, ffj.a($$2)) : null;
      } else if (!this.aI_()) {
         E $$3 = this.h();
         if ($$3 == null) {
            $$3 = this.a($$0.a());
         }

         return $$3 == null ? null : ffj.a(this, ffj.a($$3));
      } else {
         return null;
      }
   }

   @Override
   public void a(fjv $$0) {
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

      if (this.aI_()) {
         $$0.a(fju.d, a);
      }
   }

   public abstract static class a<E extends fgv.a<E>> extends ffu.a<E> implements fjw {
      public abstract wx a();

      @Override
      public boolean a(double $$0, double $$1, int $$2) {
         return true;
      }

      @Override
      public void b(fjv $$0) {
         $$0.a(fju.a, this.a());
      }
   }
}
