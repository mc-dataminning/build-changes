import com.mojang.serialization.MapCodec;

public class dft extends dfc {
   public static final MapCodec<dft> a = b(dft::new);
   protected static final exn b = dfc.a(0.0, 0.0, 0.0, 16.0, 1.0, 16.0);

   @Override
   public MapCodec<? extends dft> a() {
      return a;
   }

   public dft(dtb.d $$0) {
      super($$0);
   }

   @Override
   protected exn a(dtc $$0, dbg $$1, ir $$2, ewz $$3) {
      return b;
   }

   @Override
   protected dtc a(dtc $$0, iw $$1, dtc $$2, dcb $$3, ir $$4, ir $$5) {
      return !$$0.a($$3, $$4) ? dfe.a.n() : super.a($$0, $$1, $$2, $$3, $$4, $$5);
   }

   @Override
   protected boolean a(dtc $$0, dcd $$1, ir $$2) {
      return !$$1.u($$2.d());
   }
}
