import javax.annotation.Nullable;

public abstract class euf<E extends euf.a<E>> extends ete<E> {
   private static final ui a = ui.c("narration.selection.usage");

   public euf(ero $$0, int $$1, int $$2, int $$3, int $$4, int $$5) {
      super($$0, $$1, $$2, $$3, $$4, $$5);
   }

   @Nullable
   @Override
   public esv a(exi $$0) {
      if (this.k() == 0) {
         return null;
      } else if (this.aG_() && $$0 instanceof exi.a $$1) {
         E $$2 = this.a($$1.b());
         return $$2 != null ? esv.a(this, esv.a($$2)) : null;
      } else if (!this.aG_()) {
         E $$3 = this.f();
         if ($$3 == null) {
            $$3 = this.a($$0.a());
         }

         return $$3 == null ? null : esv.a(this, esv.a($$3));
      } else {
         return null;
      }
   }

   @Override
   public void b(exc $$0) {
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

      if (this.aG_()) {
         $$0.a(exb.d, a);
      }
   }

   public abstract static class a<E extends euf.a<E>> extends ete.a<E> implements exd {
      public abstract ui a();

      @Override
      public void b(exc $$0) {
         $$0.a(exb.a, this.a());
      }
   }
}
