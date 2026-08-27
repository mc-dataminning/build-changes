import com.mojang.serialization.MapCodec;

public abstract class dfl extends dfc {
   protected dfl(dtb.d $$0) {
      super($$0);
   }

   @Override
   protected abstract MapCodec<? extends dfl> a();

   protected boolean b(dtc $$0, dbg $$1, ir $$2) {
      return $$0.a(awe.ag) || $$0.a(dfe.dn) || $$0.a(dfe.do);
   }

   @Override
   protected dtc a(dtc $$0, iw $$1, dtc $$2, dcb $$3, ir $$4, ir $$5) {
      return !$$0.a($$3, $$4) ? dfe.a.n() : super.a($$0, $$1, $$2, $$3, $$4, $$5);
   }

   @Override
   protected boolean a(dtc $$0, dcd $$1, ir $$2) {
      ir $$3 = $$2.d();
      return this.b($$1.a_($$3), $$1, $$3);
   }

   @Override
   protected boolean a_(dtc $$0, dbg $$1, ir $$2) {
      return $$0.u().c();
   }

   @Override
   protected boolean a(dtc $$0, ept $$1) {
      return $$1 == ept.c && !this.aG ? true : super.a($$0, $$1);
   }
}
