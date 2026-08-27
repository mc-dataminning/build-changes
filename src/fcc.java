import javax.annotation.Nullable;

public abstract class fcc<E extends fcc.a<E>> extends fbb<E> {
   private static final vu a = vu.c("narration.selection.usage");

   public fcc(ezg $$0, int $$1, int $$2, int $$3, int $$4) {
      super($$0, $$1, $$2, $$3, $$4);
   }

   @Nullable
   @Override
   public faq a(ffi $$0) {
      if (this.n() == 0) {
         return null;
      } else if (this.aJ_() && $$0 instanceof ffi.a $$1) {
         E $$2 = this.a($$1.b());
         return $$2 != null ? faq.a(this, faq.a($$2)) : null;
      } else if (!this.aJ_()) {
         E $$3 = this.i();
         if ($$3 == null) {
            $$3 = this.a($$0.a());
         }

         return $$3 == null ? null : faq.a(this, faq.a($$3));
      } else {
         return null;
      }
   }

   @Override
   public void a(ffc $$0) {
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

      if (this.aJ_()) {
         $$0.a(ffb.d, a);
      }
   }

   public abstract static class a<E extends fcc.a<E>> extends fbb.a<E> implements ffd {
      public abstract vu a();

      @Override
      public void b(ffc $$0) {
         $$0.a(ffb.a, this.a());
      }
   }
}
