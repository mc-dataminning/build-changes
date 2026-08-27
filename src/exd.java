import javax.annotation.Nullable;

public abstract class exd<E extends exd.a<E>> extends ewc<E> {
   private static final vb a = vb.c("narration.selection.usage");

   public exd(euk $$0, int $$1, int $$2, int $$3, int $$4, int $$5) {
      super($$0, $$1, $$2, $$3, $$4, $$5);
   }

   @Nullable
   @Override
   public evt a(fag $$0) {
      if (this.k() == 0) {
         return null;
      } else if (this.aJ_() && $$0 instanceof fag.a $$1) {
         E $$2 = this.a($$1.b());
         return $$2 != null ? evt.a(this, evt.a($$2)) : null;
      } else if (!this.aJ_()) {
         E $$3 = this.f();
         if ($$3 == null) {
            $$3 = this.a($$0.a());
         }

         return $$3 == null ? null : evt.a(this, evt.a($$3));
      } else {
         return null;
      }
   }

   @Override
   public void b(faa $$0) {
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

      if (this.aJ_()) {
         $$0.a(ezz.d, a);
      }
   }

   public abstract static class a<E extends exd.a<E>> extends ewc.a<E> implements fab {
      public abstract vb a();

      @Override
      public void b(faa $$0) {
         $$0.a(ezz.a, this.a());
      }
   }
}
