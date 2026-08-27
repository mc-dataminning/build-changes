import javax.annotation.Nullable;

public abstract class evi<E extends evi.a<E>> extends euh<E> {
   private static final ur a = ur.c("narration.selection.usage");

   public evi(esr $$0, int $$1, int $$2, int $$3, int $$4, int $$5) {
      super($$0, $$1, $$2, $$3, $$4, $$5);
   }

   @Nullable
   @Override
   public ety a(eyl $$0) {
      if (this.k() == 0) {
         return null;
      } else if (this.aI_() && $$0 instanceof eyl.a $$1) {
         E $$2 = this.a($$1.b());
         return $$2 != null ? ety.a(this, ety.a($$2)) : null;
      } else if (!this.aI_()) {
         E $$3 = this.f();
         if ($$3 == null) {
            $$3 = this.a($$0.a());
         }

         return $$3 == null ? null : ety.a(this, ety.a($$3));
      } else {
         return null;
      }
   }

   @Override
   public void b(eyf $$0) {
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

      if (this.aI_()) {
         $$0.a(eye.d, a);
      }
   }

   public abstract static class a<E extends evi.a<E>> extends euh.a<E> implements eyg {
      public abstract ur a();

      @Override
      public void b(eyf $$0) {
         $$0.a(eye.a, this.a());
      }
   }
}
