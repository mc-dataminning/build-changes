import javax.annotation.Nullable;

public abstract class fii<E extends fii.a<E>> extends fhh<E> {
   private static final wu a = wu.c("narration.selection.usage");

   public fii(ffn $$0, int $$1, int $$2, int $$3, int $$4) {
      super($$0, $$1, $$2, $$3, $$4);
   }

   @Nullable
   @Override
   public fgw a(flo $$0) {
      if (this.l() == 0) {
         return null;
      } else if (this.aJ_() && $$0 instanceof flo.a $$1) {
         E $$2 = this.a($$1.b());
         return $$2 != null ? fgw.a(this, fgw.a($$2)) : null;
      } else if (!this.aJ_()) {
         E $$3 = this.h();
         if ($$3 == null) {
            $$3 = this.a($$0.a());
         }

         return $$3 == null ? null : fgw.a(this, fgw.a($$3));
      } else {
         return null;
      }
   }

   @Override
   public void a(fli $$0) {
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

      if (this.aJ_()) {
         $$0.a(flh.d, a);
      }
   }

   public abstract static class a<E extends fii.a<E>> extends fhh.a<E> implements flj {
      public abstract wu a();

      @Override
      public boolean a(double $$0, double $$1, int $$2) {
         return true;
      }

      @Override
      public void b(fli $$0) {
         $$0.a(flh.a, this.a());
      }
   }
}
