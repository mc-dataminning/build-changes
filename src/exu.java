import javax.annotation.Nullable;

public abstract class exu<E extends exu.a<E>> extends ewt<E> {
   private static final vd a = vd.c("narration.selection.usage");

   public exu(eva $$0, int $$1, int $$2, int $$3, int $$4) {
      super($$0, $$1, $$2, $$3, $$4);
   }

   @Nullable
   @Override
   public ewj a(fax $$0) {
      if (this.n() == 0) {
         return null;
      } else if (this.aI_() && $$0 instanceof fax.a $$1) {
         E $$2 = this.a($$1.b());
         return $$2 != null ? ewj.a(this, ewj.a($$2)) : null;
      } else if (!this.aI_()) {
         E $$3 = this.i();
         if ($$3 == null) {
            $$3 = this.a($$0.a());
         }

         return $$3 == null ? null : ewj.a(this, ewj.a($$3));
      } else {
         return null;
      }
   }

   @Override
   public void a(far $$0) {
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

      if (this.aI_()) {
         $$0.a(faq.d, a);
      }
   }

   public abstract static class a<E extends exu.a<E>> extends ewt.a<E> implements fas {
      public abstract vd a();

      @Override
      public void b(far $$0) {
         $$0.a(faq.a, this.a());
      }
   }
}
