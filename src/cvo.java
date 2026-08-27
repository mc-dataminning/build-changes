import com.mojang.serialization.MapCodec;

public abstract class cvo extends cvf {
   protected cvo(dhm.d $$0) {
      super($$0);
   }

   @Override
   protected abstract MapCodec<? extends cvo> a();

   protected boolean b(dhn $$0, crl $$1, hx $$2) {
      return $$0.a(ark.af) || $$0.a(cvh.cC);
   }

   @Override
   public dhn a(dhn $$0, ib $$1, dhn $$2, csg $$3, hx $$4, hx $$5) {
      return !$$0.a($$3, $$4) ? cvh.a.o() : super.a($$0, $$1, $$2, $$3, $$4, $$5);
   }

   @Override
   public boolean a(dhn $$0, csi $$1, hx $$2) {
      hx $$3 = $$2.d();
      return this.b($$1.a_($$3), $$1, $$3);
   }

   @Override
   public boolean a_(dhn $$0, crl $$1, hx $$2) {
      return $$0.u().c();
   }

   @Override
   public boolean a(dhn $$0, crl $$1, hx $$2, edn $$3) {
      return $$3 == edn.c && !this.aG ? true : super.a($$0, $$1, $$2, $$3);
   }
}
