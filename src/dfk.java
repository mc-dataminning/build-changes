import com.mojang.serialization.MapCodec;

public abstract class dfk extends dfb {
   protected dfk(dsd.d $$0) {
      super($$0);
   }

   @Override
   protected abstract MapCodec<? extends dfk> a();

   protected boolean b(dse $$0, dbg $$1, iz $$2) {
      return $$0.a(awp.af) || $$0.a(dfd.cC);
   }

   @Override
   protected dse a(dse $$0, je $$1, dse $$2, dcb $$3, iz $$4, iz $$5) {
      return !$$0.a($$3, $$4) ? dfd.a.o() : super.a($$0, $$1, $$2, $$3, $$4, $$5);
   }

   @Override
   protected boolean a(dse $$0, dcd $$1, iz $$2) {
      iz $$3 = $$2.d();
      return this.b($$1.a_($$3), $$1, $$3);
   }

   @Override
   protected boolean a_(dse $$0, dbg $$1, iz $$2) {
      return $$0.u().c();
   }

   @Override
   protected boolean a(dse $$0, eom $$1) {
      return $$1 == eom.c && !this.aG ? true : super.a($$0, $$1);
   }
}
