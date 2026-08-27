import javax.annotation.Nullable;

public abstract class fbg<E extends fbg.a<E>> extends faf<E> {
   private static final vs a = vs.c("narration.selection.usage");

   public fbg(eyk $$0, int $$1, int $$2, int $$3, int $$4) {
      super($$0, $$1, $$2, $$3, $$4);
   }

   @Nullable
   @Override
   public ezu a(fel $$0) {
      if (this.n() == 0) {
         return null;
      } else if (this.aK_() && $$0 instanceof fel.a $$1) {
         E $$2 = this.a($$1.b());
         return $$2 != null ? ezu.a(this, ezu.a($$2)) : null;
      } else if (!this.aK_()) {
         E $$3 = this.i();
         if ($$3 == null) {
            $$3 = this.a($$0.a());
         }

         return $$3 == null ? null : ezu.a(this, ezu.a($$3));
      } else {
         return null;
      }
   }

   @Override
   public void a(fef $$0) {
      E $$1 = this.t();
      if ($$1 != null) {
         this.a($$0.a(), $$1);
         $$1.b($$0);
      } else {
         E $$2 = this.i();
         if ($$2 != null) {
            this.a($$0.a(), $$2);
            $$2.b($$0);
         }
      }

      if (this.aK_()) {
         $$0.a(fee.d, a);
      }
   }

   public abstract static class a<E extends fbg.a<E>> extends faf.a<E> implements feg {
      public abstract vs a();

      @Override
      public void b(fef $$0) {
         $$0.a(fee.a, this.a());
      }
   }
}
