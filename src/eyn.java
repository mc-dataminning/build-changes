import javax.annotation.Nullable;

public abstract class eyn<E extends eyn.a<E>> extends exm<E> {
   private static final vg a = vg.c("narration.selection.usage");

   public eyn(evr $$0, int $$1, int $$2, int $$3, int $$4) {
      super($$0, $$1, $$2, $$3, $$4);
   }

   @Nullable
   @Override
   public exb a(fbq $$0) {
      if (this.n() == 0) {
         return null;
      } else if (this.aK_() && $$0 instanceof fbq.a $$1) {
         E $$2 = this.a($$1.b());
         return $$2 != null ? exb.a(this, exb.a($$2)) : null;
      } else if (!this.aK_()) {
         E $$3 = this.i();
         if ($$3 == null) {
            $$3 = this.a($$0.a());
         }

         return $$3 == null ? null : exb.a(this, exb.a($$3));
      } else {
         return null;
      }
   }

   @Override
   public void a(fbk $$0) {
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
         $$0.a(fbj.d, a);
      }
   }

   public abstract static class a<E extends eyn.a<E>> extends exm.a<E> implements fbl {
      public abstract vg a();

      @Override
      public void b(fbk $$0) {
         $$0.a(fbj.a, this.a());
      }
   }
}
