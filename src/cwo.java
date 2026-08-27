import com.mojang.serialization.MapCodec;

public abstract class cwo extends cwy {
   protected static final int a = 2;
   protected static final emv b = cwy.a(6.0, 0.0, 6.0, 10.0, 10.0, 10.0);

   protected cwo(djo.d $$0) {
      super($$0);
   }

   @Override
   protected abstract MapCodec<? extends cwo> a();

   @Override
   public emv a(djp $$0, ctd $$1, hx $$2, emh $$3) {
      return b;
   }

   @Override
   public djp a(djp $$0, ic $$1, djp $$2, cty $$3, hx $$4, hx $$5) {
      return $$1 == ic.a && !this.a($$0, $$3, $$4) ? cxa.a.o() : super.a($$0, $$1, $$2, $$3, $$4, $$5);
   }

   @Override
   public boolean a(djp $$0, cua $$1, hx $$2) {
      return a($$1, $$2.d(), ic.b);
   }
}
