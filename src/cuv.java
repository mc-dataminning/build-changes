import com.mojang.serialization.MapCodec;

public abstract class cuv extends cvf {
   protected static final int a = 2;
   protected static final eks b = cvf.a(6.0, 0.0, 6.0, 10.0, 10.0, 10.0);

   protected cuv(dhm.d $$0) {
      super($$0);
   }

   @Override
   protected abstract MapCodec<? extends cuv> a();

   @Override
   public eks a(dhn $$0, crl $$1, hx $$2, eke $$3) {
      return b;
   }

   @Override
   public dhn a(dhn $$0, ib $$1, dhn $$2, csg $$3, hx $$4, hx $$5) {
      return $$1 == ib.a && !this.a($$0, $$3, $$4) ? cvh.a.o() : super.a($$0, $$1, $$2, $$3, $$4, $$5);
   }

   @Override
   public boolean a(dhn $$0, csi $$1, hx $$2) {
      return a($$1, $$2.d(), ib.b);
   }
}
