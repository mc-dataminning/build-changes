import com.mojang.serialization.MapCodec;

public class dlh extends dfl implements dff {
   public static final MapCodec<dlh> a = b(dlh::new);
   protected static final exn b = dfc.a(2.0, 0.0, 2.0, 14.0, 13.0, 14.0);

   @Override
   public MapCodec<dlh> a() {
      return a;
   }

   public dlh(dtb.d $$0) {
      super($$0);
   }

   @Override
   protected exn a(dtc $$0, dbg $$1, ir $$2, ewz $$3) {
      ewu $$4 = $$0.n($$1, $$2);
      return b.a($$4.c, $$4.d, $$4.e);
   }

   @Override
   protected boolean b(dtc $$0, dbg $$1, ir $$2) {
      return $$0.a(dfe.l) || $$0.a(dfe.k);
   }

   @Override
   public boolean b(dcd $$0, ir $$1, dtc $$2) {
      return true;
   }

   @Override
   public boolean a(dca $$0, ayt $$1, ir $$2, dtc $$3) {
      return (double)$$0.A.i() < 0.25;
   }

   @Override
   public void a(aqt $$0, ayt $$1, ir $$2, dtc $$3) {
      dsr.e.a($$0, $$0.l().g(), $$2, $$3, $$1);
   }
}
