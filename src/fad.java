import javax.annotation.Nullable;

public abstract class fad<E extends fad.a<E>> extends ezc<E> {
   private static final vq a = vq.c("narration.selection.usage");

   public fad(exh $$0, int $$1, int $$2, int $$3, int $$4) {
      super($$0, $$1, $$2, $$3, $$4);
   }

   @Nullable
   @Override
   public eyr a(fdi $$0) {
      if (this.n() == 0) {
         return null;
      } else if (this.aL_() && $$0 instanceof fdi.a $$1) {
         E $$2 = this.a($$1.b());
         return $$2 != null ? eyr.a(this, eyr.a($$2)) : null;
      } else if (!this.aL_()) {
         E $$3 = this.i();
         if ($$3 == null) {
            $$3 = this.a($$0.a());
         }

         return $$3 == null ? null : eyr.a(this, eyr.a($$3));
      } else {
         return null;
      }
   }

   @Override
   public void a(fdc $$0) {
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
         $$0.a(fdb.d, a);
      }
   }

   public abstract static class a<E extends fad.a<E>> extends ezc.a<E> implements fdd {
      public abstract vq a();

      @Override
      public void b(fdc $$0) {
         $$0.a(fdb.a, this.a());
      }
   }
}
