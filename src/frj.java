import javax.annotation.Nullable;

public abstract class frj<E extends frj.a<E>> extends fqh<E> {
   private static final wv a = wv.c("narration.selection.usage");

   public frj(fnd $$0, int $$1, int $$2, int $$3, int $$4) {
      super($$0, $$1, $$2, $$3, $$4);
   }

   public frj(fnd $$0, int $$1, int $$2, int $$3, int $$4, int $$5) {
      super($$0, $$1, $$2, $$3, $$4, $$5);
   }

   @Nullable
   @Override
   public fpw a(fuq $$0) {
      if (this.t() == 0) {
         return null;
      } else if (this.aI_() && $$0 instanceof fuq.a $$1) {
         E $$2 = this.a($$1.b());
         if ($$2 != null) {
            return fpw.a(this, fpw.a($$2));
         } else {
            this.a(null);
            return null;
         }
      } else if (!this.aI_()) {
         E $$3 = this.p();
         if ($$3 == null) {
            $$3 = this.a($$0.a());
         }

         return $$3 == null ? null : fpw.a(this, fpw.a($$3));
      } else {
         return null;
      }
   }

   @Override
   public void a(fuk $$0) {
      E $$1 = this.x();
      if ($$1 != null) {
         this.a($$0.a(), $$1);
         $$1.b($$0);
      } else {
         E $$2 = this.p();
         if ($$2 != null) {
            this.a($$0.a(), $$2);
            $$2.b($$0);
         }
      }

      if (this.aI_()) {
         $$0.a(fuj.d, a);
      }
   }

   public abstract static class a<E extends frj.a<E>> extends fqh.a<E> implements ful {
      public abstract wv a();

      @Override
      public boolean a(double $$0, double $$1, int $$2) {
         return true;
      }

      @Override
      public void b(fuk $$0) {
         $$0.a(fuj.a, this.a());
      }
   }
}
