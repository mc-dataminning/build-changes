import com.mojang.serialization.MapCodec;

public abstract class dal extends dac {
   protected dal(dna.d $$0) {
      super($$0);
   }

   @Override
   protected abstract MapCodec<? extends dal> a();

   protected boolean b(dnb $$0, cwh $$1, ib $$2) {
      return $$0.a(aun.af) || $$0.a(dae.cC);
   }

   @Override
   protected dnb a(dnb $$0, ih $$1, dnb $$2, cxc $$3, ib $$4, ib $$5) {
      return !$$0.a($$3, $$4) ? dae.a.o() : super.a($$0, $$1, $$2, $$3, $$4, $$5);
   }

   @Override
   protected boolean a(dnb $$0, cxe $$1, ib $$2) {
      ib $$3 = $$2.d();
      return this.b($$1.a_($$3), $$1, $$3);
   }

   @Override
   protected boolean a_(dnb $$0, cwh $$1, ib $$2) {
      return $$0.u().c();
   }

   @Override
   protected boolean a(dnb $$0, cwh $$1, ib $$2, eje $$3) {
      return $$3 == eje.c && !this.aG ? true : super.a($$0, $$1, $$2, $$3);
   }
}
