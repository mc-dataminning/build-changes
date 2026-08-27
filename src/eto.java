import javax.annotation.Nullable;

public abstract class eto<E extends eto.a<E>> extends esn<E> {
   private static final tn a = tn.c("narration.selection.usage");

   public eto(eqx $$0, int $$1, int $$2, int $$3, int $$4, int $$5) {
      super($$0, $$1, $$2, $$3, $$4, $$5);
   }

   @Nullable
   @Override
   public ese a(ewq $$0) {
      if (this.k() == 0) {
         return null;
      } else if (this.aC_() && $$0 instanceof ewq.a $$1) {
         E $$2 = this.a($$1.b());
         return $$2 != null ? ese.a(this, ese.a($$2)) : null;
      } else if (!this.aC_()) {
         E $$3 = this.f();
         if ($$3 == null) {
            $$3 = this.a($$0.a());
         }

         return $$3 == null ? null : ese.a(this, ese.a($$3));
      } else {
         return null;
      }
   }

   @Override
   public void b(ewk $$0) {
      E $$1 = this.r();
      if ($$1 != null) {
         this.a($$0.a(), $$1);
         $$1.b($$0);
      } else {
         E $$2 = this.f();
         if ($$2 != null) {
            this.a($$0.a(), $$2);
            $$2.b($$0);
         }
      }

      if (this.aC_()) {
         $$0.a(ewj.d, a);
      }
   }

   public abstract static class a<E extends eto.a<E>> extends esn.a<E> implements ewl {
      public abstract tn a();

      @Override
      public void b(ewk $$0) {
         $$0.a(ewj.a, this.a());
      }
   }
}
