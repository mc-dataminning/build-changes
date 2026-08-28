import javax.annotation.Nullable;

public abstract class ftw<E extends ftw.a<E>> extends fsu<E> {
   private static final wy a = wy.c("narration.selection.usage");

   public ftw(fpt $$0, int $$1, int $$2, int $$3, int $$4) {
      super($$0, $$1, $$2, $$3, $$4);
   }

   public ftw(fpt $$0, int $$1, int $$2, int $$3, int $$4, int $$5) {
      super($$0, $$1, $$2, $$3, $$4, $$5);
   }

   @Nullable
   @Override
   public fsj a(fxd $$0) {
      if (this.t() == 0) {
         return null;
      } else if (this.aJ_() && $$0 instanceof fxd.a $$1) {
         E $$2 = this.a($$1.b());
         if ($$2 != null) {
            return fsj.a(this, fsj.a($$2));
         } else {
            this.a(null);
            return null;
         }
      } else if (!this.aJ_()) {
         E $$3 = this.p();
         if ($$3 == null) {
            $$3 = this.a($$0.a());
         }

         return $$3 == null ? null : fsj.a(this, fsj.a($$3));
      } else {
         return null;
      }
   }

   @Override
   public void a(fwx $$0) {
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

      if (this.aJ_()) {
         $$0.a(fww.d, a);
      }
   }

   public abstract static class a<E extends ftw.a<E>> extends fsu.a<E> implements fwy {
      public abstract wy a();

      @Override
      public boolean a(double $$0, double $$1, int $$2) {
         return true;
      }

      @Override
      public void b(fwx $$0) {
         $$0.a(fww.a, this.a());
      }
   }
}
