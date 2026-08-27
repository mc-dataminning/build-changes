import java.util.Optional;

public abstract class cvw extends cvv implements csm {
   protected cvw(dex.d $$0, hb $$1, ehy $$2, boolean $$3) {
      super($$0, $$1, $$2, $$3);
   }

   protected dey a(dey $$0, dey $$1) {
      return $$1;
   }

   @Override
   public dey a(dey $$0, hb $$1, dey $$2, cpl $$3, gv $$4, gv $$5) {
      if ($$1 == this.a.g() && !$$0.a($$3, $$4)) {
         $$3.a($$4, this, 1);
      }

      cvx $$6 = this.b();
      if ($$1 == this.a && !$$2.a(this) && !$$2.a($$6)) {
         return this.a($$0, $$6.a($$3));
      } else {
         if (this.b) {
            $$3.a($$4, eac.c, eac.c.a($$3));
         }

         return super.a($$0, $$1, $$2, $$3, $$4, $$5);
      }
   }

   @Override
   public ciw a(coq $$0, gv $$1, dey $$2) {
      return new ciw(this.b());
   }

   @Override
   public boolean a(cpn $$0, gv $$1, dey $$2) {
      Optional<gv> $$3 = this.a($$0, $$1, $$2.b());
      return $$3.isPresent() && this.b().g($$0.a_($$3.get().a(this.a)));
   }

   @Override
   public boolean a(cpk $$0, art $$1, gv $$2, dey $$3) {
      return true;
   }

   @Override
   public void a(aki $$0, art $$1, gv $$2, dey $$3) {
      Optional<gv> $$4 = this.a($$0, $$2, $$3.b());
      if ($$4.isPresent()) {
         dey $$5 = $$0.a_($$4.get());
         ((cvx)$$5.b()).a($$0, $$1, $$4.get(), $$5);
      }
   }

   private Optional<gv> a(coq $$0, gv $$1, csk $$2) {
      return l.a($$0, $$1, $$2, this.a, this.b());
   }

   @Override
   public boolean a(dey $$0, cle $$1) {
      boolean $$2 = super.a($$0, $$1);
      return $$2 && $$1.n().a(this.b().k()) ? false : $$2;
   }

   @Override
   protected csk a() {
      return this;
   }
}
