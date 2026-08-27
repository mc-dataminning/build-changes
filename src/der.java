import com.mojang.serialization.MapCodec;

public abstract class der extends dfc {
   protected static final int a = 2;
   protected static final exn b = dfc.a(6.0, 0.0, 6.0, 10.0, 10.0, 10.0);

   protected der(dtb.d $$0) {
      super($$0);
   }

   @Override
   protected abstract MapCodec<? extends der> a();

   @Override
   protected exn a(dtc $$0, dbg $$1, ir $$2, ewz $$3) {
      return b;
   }

   @Override
   protected dtc a(dtc $$0, iw $$1, dtc $$2, dcb $$3, ir $$4, ir $$5) {
      return $$1 == iw.a && !this.a($$0, $$3, $$4) ? dfe.a.n() : super.a($$0, $$1, $$2, $$3, $$4, $$5);
   }

   @Override
   protected boolean a(dtc $$0, dcd $$1, ir $$2) {
      return a($$1, $$2.d(), iw.b);
   }
}
