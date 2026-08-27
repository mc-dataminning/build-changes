import com.mojang.serialization.MapCodec;

public class dho extends dcv {
   public static final MapCodec<dho> a = b(dho::new);
   private static final int b = 20;

   @Override
   public MapCodec<dho> a() {
      return a;
   }

   public dho(dpx.d $$0) {
      super($$0);
   }

   @Override
   public void a(czu $$0, im $$1, dpy $$2, bql $$3) {
      if (!$$3.bU() && $$3 instanceof bre && !cxo.j((bre)$$3)) {
         $$3.a($$0.ai().e(), 1.0F);
      }

      super.a($$0, $$1, $$2, $$3);
   }

   @Override
   protected void a(dpy $$0, aqe $$1, im $$2, ayd $$3) {
      ddb.b($$1, $$2.c(), $$0);
   }

   @Override
   protected dpy a(dpy $$0, ir $$1, dpy $$2, czv $$3, im $$4, im $$5) {
      if ($$1 == ir.b && $$2.a(dcx.G)) {
         $$3.a($$4, this, 20);
      }

      return super.a($$0, $$1, $$2, $$3, $$4, $$5);
   }

   @Override
   protected void b(dpy $$0, czu $$1, im $$2, dpy $$3, boolean $$4) {
      $$1.a($$2, this, 20);
   }
}
