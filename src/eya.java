import javax.annotation.Nullable;

public abstract class eya<E extends eya.a<E>> extends ewz<E> {
   private static final vf a = vf.c("narration.selection.usage");

   public eya(evg $$0, int $$1, int $$2, int $$3, int $$4) {
      super($$0, $$1, $$2, $$3, $$4);
   }

   @Nullable
   @Override
   public ewp a(fbd $$0) {
      if (this.n() == 0) {
         return null;
      } else if (this.aI_() && $$0 instanceof fbd.a $$1) {
         E $$2 = this.a($$1.b());
         return $$2 != null ? ewp.a(this, ewp.a($$2)) : null;
      } else if (!this.aI_()) {
         E $$3 = this.i();
         if ($$3 == null) {
            $$3 = this.a($$0.a());
         }

         return $$3 == null ? null : ewp.a(this, ewp.a($$3));
      } else {
         return null;
      }
   }

   @Override
   public void a(fax $$0) {
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
         $$0.a(faw.d, a);
      }
   }

   public abstract static class a<E extends eya.a<E>> extends ewz.a<E> implements fay {
      public abstract vf a();

      @Override
      public void b(fax $$0) {
         $$0.a(faw.a, this.a());
      }
   }
}
