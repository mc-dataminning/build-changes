import javax.annotation.Nullable;

public abstract class etd<E extends etd.a<E>> extends esc<E> {
   private static final tf a = tf.c("narration.selection.usage");

   public etd(eqm $$0, int $$1, int $$2, int $$3, int $$4, int $$5) {
      super($$0, $$1, $$2, $$3, $$4, $$5);
   }

   @Nullable
   @Override
   public ert a(ewd $$0) {
      if (this.k() == 0) {
         return null;
      } else if (this.ax_() && $$0 instanceof ewd.a $$1) {
         E $$2 = this.a($$1.b());
         return $$2 != null ? ert.a(this, ert.a($$2)) : null;
      } else if (!this.ax_()) {
         E $$3 = this.f();
         if ($$3 == null) {
            $$3 = this.a($$0.a());
         }

         return $$3 == null ? null : ert.a(this, ert.a($$3));
      } else {
         return null;
      }
   }

   @Override
   public void b(evx $$0) {
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
         $$0.a(evw.d, a);
      }
   }

   public abstract static class a<E extends etd.a<E>> extends esc.a<E> implements evy {
      public abstract tf a();

      @Override
      public void b(evx $$0) {
         $$0.a(evw.a, this.a());
      }
   }
}
