import com.mojang.serialization.MapCodec;

public class djz extends dfc {
   public static final MapCodec<djz> a = b(djz::new);
   private static final int b = 20;

   @Override
   public MapCodec<djz> a() {
      return a;
   }

   public djz(dtb.d $$0) {
      super($$0);
   }

   @Override
   public void a(dca $$0, ir $$1, dtc $$2, brv $$3) {
      if (!$$3.cb() && $$3 instanceof bso && !dae.j((bso)$$3)) {
         $$3.a($$0.aj().f(), 1.0F);
      }

      super.a($$0, $$1, $$2, $$3);
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
}
