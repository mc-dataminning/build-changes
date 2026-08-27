import javax.annotation.Nullable;

public abstract class ffq<E extends ffq.a<E>> extends fep<E> {
   private static final ws a = ws.c("narration.selection.usage");

   public ffq(fcu $$0, int $$1, int $$2, int $$3, int $$4) {
      super($$0, $$1, $$2, $$3, $$4);
   }

   @Nullable
   @Override
   public fee a(fiw $$0) {
      if (this.l() == 0) {
         return null;
      } else if (this.aI_() && $$0 instanceof fiw.a $$1) {
         E $$2 = this.a($$1.b());
         return $$2 != null ? fee.a(this, fee.a($$2)) : null;
      } else if (!this.aI_()) {
         E $$3 = this.h();
         if ($$3 == null) {
            $$3 = this.a($$0.a());
         }

         return $$3 == null ? null : fee.a(this, fee.a($$3));
      } else {
         return null;
      }
   }

   @Override
   public void a(fiq $$0) {
      E $$1 = this.u();
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

      if (this.aI_()) {
         $$0.a(fip.d, a);
      }
   }

   public abstract static class a<E extends ffq.a<E>> extends fep.a<E> implements fir {
      public abstract ws a();

      @Override
      public boolean a(double $$0, double $$1, int $$2) {
         return true;
      }

      @Override
      public void b(fiq $$0) {
         $$0.a(fip.a, this.a());
      }
   }
}
