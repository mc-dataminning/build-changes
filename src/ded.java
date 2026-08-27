import com.mojang.serialization.MapCodec;

public class ded extends dfl implements dff {
   public static final MapCodec<ded> a = b(ded::new);
   private static final exn b = exk.a(dfc.a(0.0, 8.0, 0.0, 16.0, 16.0, 16.0), dfc.a(6.0, 0.0, 6.0, 10.0, 8.0, 10.0));

   @Override
   public MapCodec<ded> a() {
      return a;
   }

   protected ded(dtb.d $$0) {
      super($$0);
   }

   @Override
   protected exn a(dtc $$0, dbg $$1, ir $$2, ewz $$3) {
      return b;
   }

   @Override
   protected boolean b(dtc $$0, dbg $$1, ir $$2) {
      return $$0.a(dfe.eF) || super.b($$0, $$1, $$2);
   }

   @Override
   public boolean b(dcd $$0, ir $$1, dtc $$2) {
      return $$0.b_($$1.c()).c();
   }

   @Override
   public boolean a(dca $$0, ayt $$1, ir $$2, dtc $$3) {
      return (double)$$0.A.i() < 0.45;
   }

   @Override
   public void a(aqt $$0, ayt $$1, ir $$2, dtc $$3) {
      dsr.f.a($$0, $$0.l().g(), $$2, $$3, $$1);
   }
}
