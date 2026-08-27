import com.mojang.serialization.MapCodec;
import javax.annotation.Nullable;

public class dlb extends dfd implements dhm {
   public static final MapCodec<dlb> c = b(dlb::new);
   public static final dqw<dqu> d = dfd.b;
   protected static final float e = 6.0F;
   protected static final ety f = dcv.a(2.0, 0.0, 2.0, 14.0, 16.0, 14.0);

   @Override
   public MapCodec<dlb> a() {
      return c;
   }

   public dlb(dpx.d $$0) {
      super($$0);
   }

   @Override
   protected ety a(dpy $$0, cza $$1, im $$2, etk $$3) {
      return f;
   }

   @Override
   protected boolean b(dpy $$0, cza $$1, im $$2) {
      return $$0.d($$1, $$2, ir.b) && !$$0.a(dcx.kJ);
   }

   @Override
   public csd a(czx $$0, im $$1, dpy $$2) {
      return new csd(dcx.bw);
   }

   @Nullable
   @Override
   public dpy a(cvl $$0) {
      dpy $$1 = super.a($$0);
      if ($$1 != null) {
         elr $$2 = $$0.q().b_($$0.a().c());
         if ($$2.a(avt.a) && $$2.e() == 8) {
            return $$1;
         }
      }

      return null;
   }

   @Override
   protected boolean a(dpy $$0, czx $$1, im $$2) {
      if ($$0.c(d) == dqu.a) {
         dpy $$3 = $$1.a_($$2.d());
         return $$3.a(this) && $$3.c(d) == dqu.b;
      } else {
         elr $$4 = $$1.b_($$2);
         return super.a($$0, $$1, $$2) && $$4.a(avt.a) && $$4.e() == 8;
      }
   }

   @Override
   protected elr c_(dpy $$0) {
      return els.c.a(false);
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
