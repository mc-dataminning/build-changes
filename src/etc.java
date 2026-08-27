import javax.annotation.Nullable;

public abstract class etc<E extends etc.a<E>> extends esb<E> {
   private static final tf a = tf.c("narration.selection.usage");

   public etc(eql $$0, int $$1, int $$2, int $$3, int $$4, int $$5) {
      super($$0, $$1, $$2, $$3, $$4, $$5);
   }

   @Nullable
   @Override
   public ers a(ewe $$0) {
      if (this.k() == 0) {
         return null;
      } else if (this.aw_() && $$0 instanceof ewe.a $$1) {
         E $$2 = this.a($$1.b());
         return $$2 != null ? ers.a(this, ers.a($$2)) : null;
      } else if (!this.aw_()) {
         E $$3 = this.f();
         if ($$3 == null) {
            $$3 = this.a($$0.a());
         }

         return $$3 == null ? null : ers.a(this, ers.a($$3));
      } else {
         return null;
      }
   }

   @Override
   public void b(evy $$0) {
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

      if (this.aw_()) {
         $$0.a(evx.d, a);
      }
   }

   public abstract static class a<E extends etc.a<E>> extends esb.a<E> implements evz {
      public abstract tf a();

      @Override
      public void b(evy $$0) {
         $$0.a(evx.a, this.a());
      }
   }
}
