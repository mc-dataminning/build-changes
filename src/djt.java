import com.mojang.serialization.MapCodec;
import javax.annotation.Nullable;

public class djt extends dde implements dcy, dhm {
   public static final MapCodec<djt> a = b(djt::new);
   protected static final float b = 6.0F;
   protected static final ety c = dcv.a(2.0, 0.0, 2.0, 14.0, 12.0, 14.0);

   @Override
   public MapCodec<djt> a() {
      return a;
   }

   protected djt(dpx.d $$0) {
      super($$0);
   }

   @Override
   protected ety a(dpy $$0, cza $$1, im $$2, etk $$3) {
      return c;
   }

   @Override
   protected boolean b(dpy $$0, cza $$1, im $$2) {
      return $$0.d($$1, $$2, ir.b) && !$$0.a(dcx.kJ);
   }

   @Nullable
   @Override
   public dpy a(cvl $$0) {
      elr $$1 = $$0.q().b_($$0.a());
      return $$1.a(avt.a) && $$1.e() == 8 ? super.a($$0) : null;
   }

   @Override
   protected dpy a(dpy $$0, ir $$1, dpy $$2, czv $$3, im $$4, im $$5) {
      dpy $$6 = super.a($$0, $$1, $$2, $$3, $$4, $$5);
      if (!$$6.i()) {
         $$3.a($$4, els.c, els.c.a($$3));
      }

      return $$6;
   }

   @Override
   public boolean b(czx $$0, im $$1, dpy $$2) {
      return true;
   }

   @Override
   public boolean a(czu $$0, ayd $$1, im $$2, dpy $$3) {
      return true;
   }

   @Override
   protected elr c_(dpy $$0) {
      return els.c.a(false);
   }

   @Override
   public void a(aqe $$0, ayd $$1, im $$2, dpy $$3) {
      dpy $$4 = dcx.bx.n();
      dpy $$5 = $$4.a(dlb.d, dqu.a);
      im $$6 = $$2.c();
      if ($$0.a_($$6).a(dcx.G)) {
         $$0.a($$2, $$4, 2);
         $$0.a($$6, $$5, 2);
      }
   }

   @Override
   public boolean a(@Nullable ckl $$0, cza $$1, im $$2, dpy $$3, elq $$4) {
      return false;
   }

   @Override
   public boolean a(czv $$0, im $$1, dpy $$2, elr $$3) {
      return false;
   }
}
