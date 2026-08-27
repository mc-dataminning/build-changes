import com.mojang.serialization.MapCodec;

public abstract class czo extends czf {
   protected czo(dmd.d $$0) {
      super($$0);
   }

   @Override
   protected abstract MapCodec<? extends czo> a();

   protected boolean b(dme $$0, cvk $$1, ib $$2) {
      return $$0.a(aue.af) || $$0.a(czh.cC);
   }

   @Override
   protected dme a(dme $$0, ih $$1, dme $$2, cwf $$3, ib $$4, ib $$5) {
      return !$$0.a($$3, $$4) ? czh.a.o() : super.a($$0, $$1, $$2, $$3, $$4, $$5);
   }

   @Override
   protected boolean a(dme $$0, cwh $$1, ib $$2) {
      ib $$3 = $$2.d();
      return this.b($$1.a_($$3), $$1, $$3);
   }

   @Override
   protected boolean a_(dme $$0, cvk $$1, ib $$2) {
      return $$0.u().c();
   }

   @Override
   protected boolean a(dme $$0, cvk $$1, ib $$2, eih $$3) {
      return $$3 == eih.c && !this.aG ? true : super.a($$0, $$1, $$2, $$3);
   }
}
