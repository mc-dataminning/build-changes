import javax.annotation.Nullable;

public abstract class fov<E extends fov.a<E>> extends fnt<E> {
   private static final xk a = xk.c("narration.selection.usage");

   public fov(flz $$0, int $$1, int $$2, int $$3, int $$4) {
      super($$0, $$1, $$2, $$3, $$4);
   }

   @Nullable
   @Override
   public fni a(fsc $$0) {
      if (this.k() == 0) {
         return null;
      } else if (this.aN_() && $$0 instanceof fsc.a $$1) {
         E $$2 = this.a($$1.b());
         if ($$2 != null) {
            return fni.a(this, fni.a($$2));
         } else {
            this.a(null);
            return null;
         }
      } else if (!this.aN_()) {
         E $$3 = this.g();
         if ($$3 == null) {
            $$3 = this.a($$0.a());
         }

         return $$3 == null ? null : fni.a(this, fni.a($$3));
      } else {
         return null;
      }
   }

   @Override
   public void a(frw $$0) {
      E $$1 = this.v();
      if ($$1 != null) {
         this.a($$0.a(), $$1);
         $$1.b($$0);
      } else {
         E $$2 = this.g();
         if ($$2 != null) {
            this.a($$0.a(), $$2);
            $$2.b($$0);
         }
      }

      if (this.aN_()) {
         $$0.a(frv.d, a);
      }
   }

   public abstract static class a<E extends fov.a<E>> extends fnt.a<E> implements frx {
      public abstract xk a();

      @Override
      public boolean a(double $$0, double $$1, int $$2) {
         return true;
      }

      @Override
      public void b(frw $$0) {
         $$0.a(frv.a, this.a());
      }
   }
}
