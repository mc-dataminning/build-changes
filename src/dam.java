import com.mojang.serialization.MapCodec;
import java.util.Optional;

public abstract class dam extends dal implements cxb {
   protected dam(djo.d $$0, ic $$1, emv $$2, boolean $$3) {
      super($$0, $$1, $$2, $$3);
   }

   @Override
   protected abstract MapCodec<? extends dam> a();

   protected djp a(djp $$0, djp $$1) {
      return $$1;
   }

   @Override
   public djp a(djp $$0, ic $$1, djp $$2, cty $$3, hx $$4, hx $$5) {
      if ($$1 == this.a.g() && !$$0.a($$3, $$4)) {
         $$3.a($$4, this, 1);
      }

      dan $$6 = this.c();
      if ($$1 == this.a && !$$2.a(this) && !$$2.a($$6)) {
         return this.a($$0, $$6.a($$3));
      } else {
         if (this.b) {
            $$3.a($$4, efa.c, efa.c.a($$3));
         }

         return super.a($$0, $$1, $$2, $$3, $$4, $$5);
      }
   }

   @Override
   public cng a(cua $$0, hx $$1, djp $$2) {
      return new cng(this.c());
   }

   @Override
   public boolean b(cua $$0, hx $$1, djp $$2) {
      Optional<hx> $$3 = this.a($$0, $$1, $$2.b());
      return $$3.isPresent() && this.c().g($$0.a_($$3.get().a(this.a)));
   }

   @Override
   public boolean a(ctx $$0, auw $$1, hx $$2, djp $$3) {
      return true;
   }

   @Override
   public void a(ane $$0, auw $$1, hx $$2, djp $$3) {
      Optional<hx> $$4 = this.a($$0, $$2, $$3.b());
      if ($$4.isPresent()) {
         djp $$5 = $$0.a_($$4.get());
         ((dan)$$5.b()).a($$0, $$1, $$4.get(), $$5);
      }
   }

   private Optional<hx> a(ctd $$0, hx $$1, cwy $$2) {
      return l.a($$0, $$1, $$2, this.a, this.c());
   }

   @Override
   public boolean a(djp $$0, cpp $$1) {
      boolean $$2 = super.a($$0, $$1);
      return $$2 && $$1.n().a(this.c().j()) ? false : $$2;
   }

   @Override
   protected cwy b() {
      return this;
   }
}
