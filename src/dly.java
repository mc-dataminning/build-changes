import com.mojang.serialization.MapCodec;

public class dly extends dde {
   public static final MapCodec<dly> a = b(dly::new);
   protected static final ety b = dcv.a(1.0, 0.0, 1.0, 15.0, 1.5, 15.0);

   @Override
   public MapCodec<dly> a() {
      return a;
   }

   protected dly(dpx.d $$0) {
      super($$0);
   }

   @Override
   protected void a(dpy $$0, czu $$1, im $$2, bql $$3) {
      super.a($$0, $$1, $$2, $$3);
      if ($$1 instanceof aqe && $$3 instanceof cmi) {
         $$1.a(new im($$2), true, $$3);
      }
   }

   @Override
   protected ety a(dpy $$0, cza $$1, im $$2, etk $$3) {
      return b;
   }

   @Override
   protected boolean b(dpy $$0, cza $$1, im $$2) {
      elr $$3 = $$1.b_($$2);
      elr $$4 = $$1.b_($$2.c());
      return ($$3.a() == els.c || $$0.b() instanceof dgt) && $$4.a() == els.a;
   }
}
