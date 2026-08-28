import javax.annotation.Nullable;

public abstract class fji<E extends fji.a<E>> extends fih<E> {
   private static final wz a = wz.c("narration.selection.usage");

   public fji(fgo $$0, int $$1, int $$2, int $$3, int $$4) {
      super($$0, $$1, $$2, $$3, $$4);
   }

   @Nullable
   @Override
   public fhw a(fmo $$0) {
      if (this.l() == 0) {
         return null;
      } else if (this.aO_() && $$0 instanceof fmo.a $$1) {
         E $$2 = this.a($$1.b());
         return $$2 != null ? fhw.a(this, fhw.a($$2)) : null;
      } else if (!this.aO_()) {
         E $$3 = this.h();
         if ($$3 == null) {
            $$3 = this.a($$0.a());
         }

         return $$3 == null ? null : fhw.a(this, fhw.a($$3));
      } else {
         return null;
      }
   }

   @Override
   public void a(fmi $$0) {
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

      if (this.aO_()) {
         $$0.a(fmh.d, a);
      }
   }

   public abstract static class a<E extends fji.a<E>> extends fih.a<E> implements fmj {
      public abstract wz a();

      @Override
      public boolean a(double $$0, double $$1, int $$2) {
         return true;
      }

      @Override
      public void b(fmi $$0) {
         $$0.a(fmh.a, this.a());
      }
   }
}
