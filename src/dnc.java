import com.mojang.serialization.MapCodec;

public class dnc extends dfc {
   public static final MapCodec<dnc> a = b(dnc::new);
   protected static final exn b = dfc.a(0.0, 0.0, 0.0, 16.0, 14.0, 16.0);
   private static final int c = 20;

   @Override
   public MapCodec<dnc> a() {
      return a;
   }

   public dnc(dtb.d $$0) {
      super($$0);
   }

   @Override
   protected exn b(dtc $$0, dbg $$1, ir $$2, ewz $$3) {
      return b;
   }

   @Override
   protected exn b_(dtc $$0, dbg $$1, ir $$2) {
      return exk.b();
   }

   @Override
   protected exn c(dtc $$0, dbg $$1, ir $$2, ewz $$3) {
      return exk.b();
   }

   @Override
   protected void a(dtc $$0, aqt $$1, ir $$2, ayt $$3) {
      dfi.b($$1, $$2.c(), $$0);
   }

   @Override
   protected dtc a(dtc $$0, iw $$1, dtc $$2, dcb $$3, ir $$4, ir $$5) {
      if ($$1 == iw.b && $$2.a(dfe.al)) {
         $$3.a($$4, this, 20);
      }

      return super.a($$0, $$1, $$2, $$3, $$4, $$5);
   }

   @Override
   protected void b(dtc $$0, dca $$1, ir $$2, dtc $$3, boolean $$4) {
      $$1.a($$2, this, 20);
   }

   @Override
   protected boolean a(dtc $$0, ept $$1) {
      return false;
   }

   @Override
   protected float d(dtc $$0, dbg $$1, ir $$2) {
      return 0.2F;
   }
}
