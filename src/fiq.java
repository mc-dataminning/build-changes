import javax.annotation.Nullable;

public abstract class fiq<E extends fiq.a<E>> extends fhp<E> {
   private static final wu a = wu.c("narration.selection.usage");

   public fiq(ffw $$0, int $$1, int $$2, int $$3, int $$4) {
      super($$0, $$1, $$2, $$3, $$4);
   }

   @Nullable
   @Override
   public fhe a(flw $$0) {
      if (this.l() == 0) {
         return null;
      } else if (this.aK_() && $$0 instanceof flw.a $$1) {
         E $$2 = this.a($$1.b());
         return $$2 != null ? fhe.a(this, fhe.a($$2)) : null;
      } else if (!this.aK_()) {
         E $$3 = this.h();
         if ($$3 == null) {
            $$3 = this.a($$0.a());
         }

         return $$3 == null ? null : fhe.a(this, fhe.a($$3));
      } else {
         return null;
      }
   }

   @Override
   public void a(flq $$0) {
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

      if (this.aK_()) {
         $$0.a(flp.d, a);
      }
   }

   public abstract static class a<E extends fiq.a<E>> extends fhp.a<E> implements flr {
      public abstract wu a();

      @Override
      public boolean a(double $$0, double $$1, int $$2) {
         return true;
      }

      @Override
      public void b(flq $$0) {
         $$0.a(flp.a, this.a());
      }
   }
}
