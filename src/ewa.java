import javax.annotation.Nullable;

public abstract class ewa<E extends ewa.a<E>> extends euz<E> {
   private static final uv a = uv.c("narration.selection.usage");

   public ewa(eti $$0, int $$1, int $$2, int $$3, int $$4, int $$5) {
      super($$0, $$1, $$2, $$3, $$4, $$5);
   }

   @Nullable
   @Override
   public euq a(ezd $$0) {
      if (this.k() == 0) {
         return null;
      } else if (this.aK_() && $$0 instanceof ezd.a $$1) {
         E $$2 = this.a($$1.b());
         return $$2 != null ? euq.a(this, euq.a($$2)) : null;
      } else if (!this.aK_()) {
         E $$3 = this.f();
         if ($$3 == null) {
            $$3 = this.a($$0.a());
         }

         return $$3 == null ? null : euq.a(this, euq.a($$3));
      } else {
         return null;
      }
   }

   @Override
   public void b(eyx $$0) {
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

      if (this.aK_()) {
         $$0.a(eyw.d, a);
      }
   }

   public abstract static class a<E extends ewa.a<E>> extends euz.a<E> implements eyy {
      public abstract uv a();

      @Override
      public void b(eyx $$0) {
         $$0.a(eyw.a, this.a());
      }
   }
}
