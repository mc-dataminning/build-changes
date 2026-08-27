import java.util.Optional;

public abstract class cvx extends cvw implements csn {
   protected cvx(dey.d $$0, ha $$1, ehw $$2, boolean $$3) {
      super($$0, $$1, $$2, $$3);
   }

   protected dez a(dez $$0, dez $$1) {
      return $$1;
   }

   @Override
   public dez a(dez $$0, ha $$1, dez $$2, cpm $$3, gu $$4, gu $$5) {
      if ($$1 == this.a.g() && !$$0.a($$3, $$4)) {
         $$3.a($$4, this, 1);
      }

      cvy $$6 = this.b();
      if ($$1 == this.a && !$$2.a(this) && !$$2.a($$6)) {
         return this.a($$0, $$6.a($$3));
      } else {
         if (this.b) {
            $$3.a($$4, ead.c, ead.c.a($$3));
         }

         return super.a($$0, $$1, $$2, $$3, $$4, $$5);
      }
   }

   @Override
   public cix a(cor $$0, gu $$1, dez $$2) {
      return new cix(this.b());
   }

   @Override
   public boolean a(cpo $$0, gu $$1, dez $$2) {
      Optional<gu> $$3 = this.a($$0, $$1, $$2.b());
      return $$3.isPresent() && this.b().g($$0.a_($$3.get().a(this.a)));
   }

   @Override
   public boolean a(cpl $$0, aru $$1, gu $$2, dez $$3) {
      return true;
   }

   @Override
   public void a(akk $$0, aru $$1, gu $$2, dez $$3) {
      Optional<gu> $$4 = this.a($$0, $$2, $$3.b());
      if ($$4.isPresent()) {
         dez $$5 = $$0.a_($$4.get());
         ((cvy)$$5.b()).a($$0, $$1, $$4.get(), $$5);
      }
   }

   private Optional<gu> a(cor $$0, gu $$1, csl $$2) {
      return l.a($$0, $$1, $$2, this.a, this.b());
   }

   @Override
   public boolean a(dez $$0, clf $$1) {
      boolean $$2 = super.a($$0, $$1);
      return $$2 && $$1.n().a(this.b().k()) ? false : $$2;
   }

   @Override
   protected csl a() {
      return this;
   }
}
