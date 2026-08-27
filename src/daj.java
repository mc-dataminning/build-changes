import com.mojang.serialization.MapCodec;

public abstract class daj extends daa {
   protected daj(dmy.d $$0) {
      super($$0);
   }

   @Override
   protected abstract MapCodec<? extends daj> a();

   protected boolean b(dmz $$0, cwf $$1, ib $$2) {
      return $$0.a(aun.af) || $$0.a(dac.cC);
   }

   @Override
   protected dmz a(dmz $$0, ih $$1, dmz $$2, cxa $$3, ib $$4, ib $$5) {
      return !$$0.a($$3, $$4) ? dac.a.o() : super.a($$0, $$1, $$2, $$3, $$4, $$5);
   }

   @Override
   protected boolean a(dmz $$0, cxc $$1, ib $$2) {
      ib $$3 = $$2.d();
      return this.b($$1.a_($$3), $$1, $$3);
   }

   @Override
   protected boolean a_(dmz $$0, cwf $$1, ib $$2) {
      return $$0.u().c();
   }

   @Override
   protected boolean a(dmz $$0, cwf $$1, ib $$2, ejd $$3) {
      return $$3 == ejd.c && !this.aG ? true : super.a($$0, $$1, $$2, $$3);
   }
}
