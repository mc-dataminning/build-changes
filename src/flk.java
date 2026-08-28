import javax.annotation.Nullable;

public abstract class flk<E extends flk.a<E>> extends fkj<E> {
   private static final xe a = xe.c("narration.selection.usage");

   public flk(fip $$0, int $$1, int $$2, int $$3, int $$4) {
      super($$0, $$1, $$2, $$3, $$4);
   }

   @Nullable
   @Override
   public fjy a(fos $$0) {
      if (this.l() == 0) {
         return null;
      } else if (this.aN_() && $$0 instanceof fos.a $$1) {
         E $$2 = this.a($$1.b());
         return $$2 != null ? fjy.a(this, fjy.a($$2)) : null;
      } else if (!this.aN_()) {
         E $$3 = this.h();
         if ($$3 == null) {
            $$3 = this.a($$0.a());
         }

         return $$3 == null ? null : fjy.a(this, fjy.a($$3));
      } else {
         return null;
      }
   }

   @Override
   public void a(fol $$0) {
      E $$1 = this.v();
      if ($$1 != null) {
         this.a($$0.a(), $$1);
         $$1.b($$0);
      } else {
         E $$2 = this.h();
         if ($$2 != null) {
            this.a($$0.a(), $$2);
            $$2.b($$0);
         }
      }

      if (this.aN_()) {
         $$0.a(fok.d, a);
      }
   }

   public abstract static class a<E extends flk.a<E>> extends fkj.a<E> implements fom {
      public abstract xe a();

      @Override
      public boolean a(double $$0, double $$1, int $$2) {
         return true;
      }

      @Override
      public void b(fol $$0) {
         $$0.a(fok.a, this.a());
      }
   }
}
