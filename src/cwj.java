import java.util.Optional;

public abstract class cwj extends cwi implements csz {
   protected cwj(dfk.d $$0, hc $$1, eii $$2, boolean $$3) {
      super($$0, $$1, $$2, $$3);
   }

   protected dfl a(dfl $$0, dfl $$1) {
      return $$1;
   }

   @Override
   public dfl a(dfl $$0, hc $$1, dfl $$2, cpy $$3, gw $$4, gw $$5) {
      if ($$1 == this.a.g() && !$$0.a($$3, $$4)) {
         $$3.a($$4, this, 1);
      }

      cwk $$6 = this.b();
      if ($$1 == this.a && !$$2.a(this) && !$$2.a($$6)) {
         return this.a($$0, $$6.a($$3));
      } else {
         if (this.b) {
            $$3.a($$4, eap.c, eap.c.a($$3));
         }

         return super.a($$0, $$1, $$2, $$3, $$4, $$5);
      }
   }

   @Override
   public cjh a(cpd $$0, gw $$1, dfl $$2) {
      return new cjh(this.b());
   }

   @Override
   public boolean a(cqa $$0, gw $$1, dfl $$2) {
      Optional<gw> $$3 = this.a($$0, $$1, $$2.b());
      return $$3.isPresent() && this.b().g($$0.a_($$3.get().a(this.a)));
   }

   @Override
   public boolean a(cpx $$0, ase $$1, gw $$2, dfl $$3) {
      return true;
   }

   @Override
   public void a(aks $$0, ase $$1, gw $$2, dfl $$3) {
      Optional<gw> $$4 = this.a($$0, $$2, $$3.b());
      if ($$4.isPresent()) {
         dfl $$5 = $$0.a_($$4.get());
         ((cwk)$$5.b()).a($$0, $$1, $$4.get(), $$5);
      }
   }

   private Optional<gw> a(cpd $$0, gw $$1, csx $$2) {
      return l.a($$0, $$1, $$2, this.a, this.b());
   }

   @Override
   public boolean a(dfl $$0, clp $$1) {
      boolean $$2 = super.a($$0, $$1);
      return $$2 && $$1.n().a(this.b().k()) ? false : $$2;
   }

   @Override
   protected csx a() {
      return this;
   }
}
