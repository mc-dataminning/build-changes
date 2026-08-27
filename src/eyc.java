import javax.annotation.Nullable;

public abstract class eyc<E extends eyc.a<E>> extends exb<E> {
   private static final vf a = vf.c("narration.selection.usage");

   public eyc(evi $$0, int $$1, int $$2, int $$3, int $$4) {
      super($$0, $$1, $$2, $$3, $$4);
   }

   @Nullable
   @Override
   public ewr a(fbf $$0) {
      if (this.n() == 0) {
         return null;
      } else if (this.aI_() && $$0 instanceof fbf.a $$1) {
         E $$2 = this.a($$1.b());
         return $$2 != null ? ewr.a(this, ewr.a($$2)) : null;
      } else if (!this.aI_()) {
         E $$3 = this.i();
         if ($$3 == null) {
            $$3 = this.a($$0.a());
         }

         return $$3 == null ? null : ewr.a(this, ewr.a($$3));
      } else {
         return null;
      }
   }

   @Override
   public void a(faz $$0) {
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
         $$0.a(fay.d, a);
      }
   }

   public abstract static class a<E extends eyc.a<E>> extends exb.a<E> implements fba {
      public abstract vf a();

      @Override
      public void b(faz $$0) {
         $$0.a(fay.a, this.a());
      }
   }
}
