import javax.annotation.Nullable;

public abstract class ete<E extends ete.a<E>> extends esd<E> {
   private static final te a = te.c("narration.selection.usage");

   public ete(eqn $$0, int $$1, int $$2, int $$3, int $$4, int $$5) {
      super($$0, $$1, $$2, $$3, $$4, $$5);
   }

   @Nullable
   @Override
   public eru a(evz $$0) {
      if (this.k() == 0) {
         return null;
      } else if (this.ax_() && $$0 instanceof evz.a $$1) {
         E $$2 = this.a($$1.b());
         return $$2 != null ? eru.a(this, eru.a($$2)) : null;
      } else if (!this.ax_()) {
         E $$3 = this.f();
         if ($$3 == null) {
            $$3 = this.a($$0.a());
         }

         return $$3 == null ? null : eru.a(this, eru.a($$3));
      } else {
         return null;
      }
   }

   @Override
   public void b(evt $$0) {
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

      if (this.ax_()) {
         $$0.a(evs.d, a);
      }
   }

   public abstract static class a<E extends ete.a<E>> extends esd.a<E> implements evu {
      public abstract te a();

      @Override
      public void b(evt $$0) {
         $$0.a(evs.a, this.a());
      }
   }
}
