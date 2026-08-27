import javax.annotation.Nullable;

public abstract class fak<E extends fak.a<E>> extends ezj<E> {
   private static final vq a = vq.c("narration.selection.usage");

   public fak(exo $$0, int $$1, int $$2, int $$3, int $$4) {
      super($$0, $$1, $$2, $$3, $$4);
   }

   @Nullable
   @Override
   public eyy a(fdp $$0) {
      if (this.n() == 0) {
         return null;
      } else if (this.aL_() && $$0 instanceof fdp.a $$1) {
         E $$2 = this.a($$1.b());
         return $$2 != null ? eyy.a(this, eyy.a($$2)) : null;
      } else if (!this.aL_()) {
         E $$3 = this.i();
         if ($$3 == null) {
            $$3 = this.a($$0.a());
         }

         return $$3 == null ? null : eyy.a(this, eyy.a($$3));
      } else {
         return null;
      }
   }

   @Override
   public void a(fdj $$0) {
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

      if (this.aL_()) {
         $$0.a(fdi.d, a);
      }
   }

   public abstract static class a<E extends fak.a<E>> extends ezj.a<E> implements fdk {
      public abstract vq a();

      @Override
      public void b(fdj $$0) {
         $$0.a(fdi.a, this.a());
      }
   }
}
