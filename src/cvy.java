import java.util.Optional;

public abstract class cvy extends cvx implements cso {
   protected cvy(dez.d $$0, ha $$1, ehx $$2, boolean $$3) {
      super($$0, $$1, $$2, $$3);
   }

   protected dfa a(dfa $$0, dfa $$1) {
      return $$1;
   }

   @Override
   public dfa a(dfa $$0, ha $$1, dfa $$2, cpn $$3, gu $$4, gu $$5) {
      if ($$1 == this.a.g() && !$$0.a($$3, $$4)) {
         $$3.a($$4, this, 1);
      }

      cvz $$6 = this.b();
      if ($$1 == this.a && !$$2.a(this) && !$$2.a($$6)) {
         return this.a($$0, $$6.a($$3));
      } else {
         if (this.b) {
            $$3.a($$4, eae.c, eae.c.a($$3));
         }

         return super.a($$0, $$1, $$2, $$3, $$4, $$5);
      }
   }

   @Override
   public ciy a(cos $$0, gu $$1, dfa $$2) {
      return new ciy(this.b());
   }

   @Override
   public boolean a(cpp $$0, gu $$1, dfa $$2) {
      Optional<gu> $$3 = this.a($$0, $$1, $$2.b());
      return $$3.isPresent() && this.b().g($$0.a_($$3.get().a(this.a)));
   }

   @Override
   public boolean a(cpm $$0, aru $$1, gu $$2, dfa $$3) {
      return true;
   }

   @Override
   public void a(akk $$0, aru $$1, gu $$2, dfa $$3) {
      Optional<gu> $$4 = this.a($$0, $$2, $$3.b());
      if ($$4.isPresent()) {
         dfa $$5 = $$0.a_($$4.get());
         ((cvz)$$5.b()).a($$0, $$1, $$4.get(), $$5);
      }
   }

   private Optional<gu> a(cos $$0, gu $$1, csm $$2) {
      return l.a($$0, $$1, $$2, this.a, this.b());
   }

   @Override
   public boolean a(dfa $$0, clg $$1) {
      boolean $$2 = super.a($$0, $$1);
      return $$2 && $$1.n().a(this.b().k()) ? false : $$2;
   }

   @Override
   protected csm a() {
      return this;
   }
}
