import javax.annotation.Nullable;

public abstract class etm<E extends etm.a<E>> extends esl<E> {
   private static final tl a = tl.c("narration.selection.usage");

   public etm(eqv $$0, int $$1, int $$2, int $$3, int $$4, int $$5) {
      super($$0, $$1, $$2, $$3, $$4, $$5);
   }

   @Nullable
   @Override
   public esc a(ewo $$0) {
      if (this.k() == 0) {
         return null;
      } else if (this.aD_() && $$0 instanceof ewo.a $$1) {
         E $$2 = this.a($$1.b());
         return $$2 != null ? esc.a(this, esc.a($$2)) : null;
      } else if (!this.aD_()) {
         E $$3 = this.f();
         if ($$3 == null) {
            $$3 = this.a($$0.a());
         }

         return $$3 == null ? null : esc.a(this, esc.a($$3));
      } else {
         return null;
      }
   }

   @Override
   public void b(ewi $$0) {
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

      if (this.aD_()) {
         $$0.a(ewh.d, a);
      }
   }

   public abstract static class a<E extends etm.a<E>> extends esl.a<E> implements ewj {
      public abstract tl a();

      @Override
      public void b(ewi $$0) {
         $$0.a(ewh.a, this.a());
      }
   }
}
