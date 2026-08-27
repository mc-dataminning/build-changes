import java.util.Optional;

public abstract class cwc extends cwb implements css {
   protected cwc(dfd.d $$0, hc $$1, eib $$2, boolean $$3) {
      super($$0, $$1, $$2, $$3);
   }

   protected dfe a(dfe $$0, dfe $$1) {
      return $$1;
   }

   @Override
   public dfe a(dfe $$0, hc $$1, dfe $$2, cpr $$3, gw $$4, gw $$5) {
      if ($$1 == this.a.g() && !$$0.a($$3, $$4)) {
         $$3.a($$4, this, 1);
      }

      cwd $$6 = this.b();
      if ($$1 == this.a && !$$2.a(this) && !$$2.a($$6)) {
         return this.a($$0, $$6.a($$3));
      } else {
         if (this.b) {
            $$3.a($$4, eai.c, eai.c.a($$3));
         }

         return super.a($$0, $$1, $$2, $$3, $$4, $$5);
      }
   }

   @Override
   public cja a(cow $$0, gw $$1, dfe $$2) {
      return new cja(this.b());
   }

   @Override
   public boolean a(cpt $$0, gw $$1, dfe $$2) {
      Optional<gw> $$3 = this.a($$0, $$1, $$2.b());
      return $$3.isPresent() && this.b().g($$0.a_($$3.get().a(this.a)));
   }

   @Override
   public boolean a(cpq $$0, arx $$1, gw $$2, dfe $$3) {
      return true;
   }

   @Override
   public void a(akn $$0, arx $$1, gw $$2, dfe $$3) {
      Optional<gw> $$4 = this.a($$0, $$2, $$3.b());
      if ($$4.isPresent()) {
         dfe $$5 = $$0.a_($$4.get());
         ((cwd)$$5.b()).a($$0, $$1, $$4.get(), $$5);
      }
   }

   private Optional<gw> a(cow $$0, gw $$1, csq $$2) {
      return l.a($$0, $$1, $$2, this.a, this.b());
   }

   @Override
   public boolean a(dfe $$0, cli $$1) {
      boolean $$2 = super.a($$0, $$1);
      return $$2 && $$1.n().a(this.b().k()) ? false : $$2;
   }

   @Override
   protected csq a() {
      return this;
   }
}
