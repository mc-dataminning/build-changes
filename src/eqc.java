import javax.annotation.Nullable;

public abstract class eqc<E extends eqc.a<E>> extends epc<E> {
   private static final sw a = sw.c("narration.selection.usage");

   public eqc(enn $$0, int $$1, int $$2, int $$3, int $$4, int $$5) {
      super($$0, $$1, $$2, $$3, $$4, $$5);
   }

   @Nullable
   @Override
   public eou a(esv $$0) {
      if (this.k() == 0) {
         return null;
      } else if (this.aB_() && $$0 instanceof esv.a $$1) {
         E $$2 = this.a($$1.b());
         return $$2 != null ? eou.a(this, eou.a($$2)) : null;
      } else if (!this.aB_()) {
         E $$3 = this.f();
         if ($$3 == null) {
            $$3 = this.a($$0.a());
         }

         return $$3 == null ? null : eou.a(this, eou.a($$3));
      } else {
         return null;
      }
   }

   @Override
   public void b(esp $$0) {
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

      if (this.aB_()) {
         $$0.a(eso.d, a);
      }
   }

   public abstract static class a<E extends eqc.a<E>> extends epc.a<E> implements esq {
      public abstract sw a();

      @Override
      public void b(esp $$0) {
         $$0.a(eso.a, this.a());
      }
   }
}
