import com.mojang.serialization.MapCodec;

public abstract class cxh extends cwy {
   protected cxh(djo.d $$0) {
      super($$0);
   }

   @Override
   protected abstract MapCodec<? extends cxh> a();

   protected boolean b(djp $$0, ctd $$1, hx $$2) {
      return $$0.a(asi.af) || $$0.a(cxa.cC);
   }

   @Override
   public djp a(djp $$0, ic $$1, djp $$2, cty $$3, hx $$4, hx $$5) {
      return !$$0.a($$3, $$4) ? cxa.a.o() : super.a($$0, $$1, $$2, $$3, $$4, $$5);
   }

   @Override
   public boolean a(djp $$0, cua $$1, hx $$2) {
      hx $$3 = $$2.d();
      return this.b($$1.a_($$3), $$1, $$3);
   }

   @Override
   public boolean a_(djp $$0, ctd $$1, hx $$2) {
      return $$0.u().c();
   }

   @Override
   public boolean a(djp $$0, ctd $$1, hx $$2, efp $$3) {
      return $$3 == efp.c && !this.aG ? true : super.a($$0, $$1, $$2, $$3);
   }
}
