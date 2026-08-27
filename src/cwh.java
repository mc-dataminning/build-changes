import java.util.Optional;

public abstract class cwh extends cwg implements csx {
   protected cwh(dfi.d $$0, ha $$1, eig $$2, boolean $$3) {
      super($$0, $$1, $$2, $$3);
   }

   protected dfj a(dfj $$0, dfj $$1) {
      return $$1;
   }

   @Override
   public dfj a(dfj $$0, ha $$1, dfj $$2, cpw $$3, gw $$4, gw $$5) {
      if ($$1 == this.a.g() && !$$0.a($$3, $$4)) {
         $$3.a($$4, this, 1);
      }

      cwi $$6 = this.b();
      if ($$1 == this.a && !$$2.a(this) && !$$2.a($$6)) {
         return this.a($$0, $$6.a($$3));
      } else {
         if (this.b) {
            $$3.a($$4, ean.c, ean.c.a($$3));
         }

         return super.a($$0, $$1, $$2, $$3, $$4, $$5);
      }
   }

   @Override
   public cjf a(cpb $$0, gw $$1, dfj $$2) {
      return new cjf(this.b());
   }

   @Override
   public boolean a(cpy $$0, gw $$1, dfj $$2) {
      Optional<gw> $$3 = this.a($$0, $$1, $$2.b());
      return $$3.isPresent() && this.b().g($$0.a_($$3.get().a(this.a)));
   }

   @Override
   public boolean a(cpv $$0, asc $$1, gw $$2, dfj $$3) {
      return true;
   }

   @Override
   public void a(akq $$0, asc $$1, gw $$2, dfj $$3) {
      Optional<gw> $$4 = this.a($$0, $$2, $$3.b());
      if ($$4.isPresent()) {
         dfj $$5 = $$0.a_($$4.get());
         ((cwi)$$5.b()).a($$0, $$1, $$4.get(), $$5);
      }
   }

   private Optional<gw> a(cpb $$0, gw $$1, csv $$2) {
      return l.a($$0, $$1, $$2, this.a, this.b());
   }

   @Override
   public boolean a(dfj $$0, cln $$1) {
      boolean $$2 = super.a($$0, $$1);
      return $$2 && $$1.n().a(this.b().k()) ? false : $$2;
   }

   @Override
   protected csv a() {
      return this;
   }
}
