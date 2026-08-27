import javax.annotation.Nullable;

public abstract class eth<E extends eth.a<E>> extends esg<E> {
   private static final ti a = ti.c("narration.selection.usage");

   public eth(eqq $$0, int $$1, int $$2, int $$3, int $$4, int $$5) {
      super($$0, $$1, $$2, $$3, $$4, $$5);
   }

   @Nullable
   @Override
   public erx a(ewj $$0) {
      if (this.k() == 0) {
         return null;
      } else if (this.ay_() && $$0 instanceof ewj.a $$1) {
         E $$2 = this.a($$1.b());
         return $$2 != null ? erx.a(this, erx.a($$2)) : null;
      } else if (!this.ay_()) {
         E $$3 = this.f();
         if ($$3 == null) {
            $$3 = this.a($$0.a());
         }

         return $$3 == null ? null : erx.a(this, erx.a($$3));
      } else {
         return null;
      }
   }

   @Override
   public void b(ewd $$0) {
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

      if (this.ay_()) {
         $$0.a(ewc.d, a);
      }
   }

   public abstract static class a<E extends eth.a<E>> extends esg.a<E> implements ewe {
      public abstract ti a();

      @Override
      public void b(ewd $$0) {
         $$0.a(ewc.a, this.a());
      }
   }
}
