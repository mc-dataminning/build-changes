import java.util.Optional;

public abstract class csz extends csy implements cpp {
   protected csz(dca.d $$0, ha $$1, efb $$2, boolean $$3) {
      super($$0, $$1, $$2, $$3);
   }

   protected dcb a(dcb $$0, dcb $$1) {
      return $$1;
   }

   @Override
   public dcb a(dcb $$0, ha $$1, dcb $$2, cmn $$3, gu $$4, gu $$5) {
      if ($$1 == this.a.g() && !$$0.a($$3, $$4)) {
         $$3.a($$4, this, 1);
      }

      cta $$6 = this.b();
      if ($$1 == this.a && !$$2.a(this) && !$$2.a($$6)) {
         return this.a($$0, $$6.a($$3));
      } else {
         if (this.b) {
            $$3.a($$4, dxf.c, dxf.c.a($$3));
         }

         return super.a($$0, $$1, $$2, $$3, $$4, $$5);
      }
   }

   @Override
   public cfz a(cls $$0, gu $$1, dcb $$2) {
      return new cfz(this.b());
   }

   @Override
   public boolean a(cmp $$0, gu $$1, dcb $$2, boolean $$3) {
      Optional<gu> $$4 = this.a($$0, $$1, $$2.b());
      return $$4.isPresent() && this.b().g($$0.a_($$4.get().a(this.a)));
   }

   @Override
   public boolean a(cmm $$0, apf $$1, gu $$2, dcb $$3) {
      return true;
   }

   @Override
   public void a(aif $$0, apf $$1, gu $$2, dcb $$3) {
      Optional<gu> $$4 = this.a($$0, $$2, $$3.b());
      if ($$4.isPresent()) {
         dcb $$5 = $$0.a_($$4.get());
         ((cta)$$5.b()).a($$0, $$1, $$4.get(), $$5);
      }
   }

   private Optional<gu> a(cls $$0, gu $$1, cpn $$2) {
      return l.a($$0, $$1, $$2, this.a, this.b());
   }

   @Override
   public boolean a(dcb $$0, cih $$1) {
      boolean $$2 = super.a($$0, $$1);
      return $$2 && $$1.n().a(this.b().k()) ? false : $$2;
   }

   @Override
   protected cpn a() {
      return this;
   }
}
