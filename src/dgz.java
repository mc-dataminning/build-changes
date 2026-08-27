import com.mojang.serialization.MapCodec;
import javax.annotation.Nullable;

public class dgz extends dgk implements dhm {
   public static final MapCodec<dgz> c = b(dgz::new);
   protected static final ety g = dcv.a(0.0, 0.0, 0.0, 16.0, 9.0, 16.0);
   private static final double h = 0.14;

   @Override
   public MapCodec<dgz> a() {
      return c;
   }

   protected dgz(dpx.d $$0) {
      super($$0, ir.b, g, true, 0.14);
   }

   @Override
   protected boolean g(dpy $$0) {
      return $$0.a(dcx.G);
   }

   @Override
   protected dcv b() {
      return dcx.md;
   }

   @Override
   protected boolean m(dpy $$0) {
      return !$$0.a(dcx.kJ);
   }

   @Override
   public boolean a(@Nullable ckl $$0, cza $$1, im $$2, dpy $$3, elq $$4) {
      return false;
   }

   @Override
   public boolean a(czv $$0, im $$1, dpy $$2, elr $$3) {
      return false;
   }

   @Override
   protected int a(ayd $$0) {
      return 1;
   }

   @Nullable
   @Override
   public dpy a(cvl $$0) {
      elr $$1 = $$0.q().b_($$0.a());
      return $$1.a(avt.a) && $$1.e() == 8 ? super.a($$0) : null;
   }

   @Override
   protected elr c_(dpy $$0) {
      return els.c.a(false);
   }
}
