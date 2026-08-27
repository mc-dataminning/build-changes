import com.mojang.serialization.MapCodec;
import javax.annotation.Nullable;

public class dcz extends dch {
   public static final MapCodec<dcz> a = b(dcz::new);
   public static final dqp[] b = new dqp[]{dqo.k, dqo.l, dqo.m};
   protected static final ety c = etv.a(dcv.a(1.0, 0.0, 1.0, 15.0, 2.0, 15.0), dcv.a(7.0, 0.0, 7.0, 9.0, 14.0, 9.0));

   @Override
   public MapCodec<dcz> a() {
      return a;
   }

   public dcz(dpx.d $$0) {
      super($$0);
      this.k(this.E.b().a(b[0], Boolean.valueOf(false)).a(b[1], Boolean.valueOf(false)).a(b[2], Boolean.valueOf(false)));
   }

   @Override
   protected djb b_(dpy $$0) {
      return djb.c;
   }

   @Override
   public dnd a(im $$0, dpy $$1) {
      return new dng($$0, $$1);
   }

   @Nullable
   @Override
   public <T extends dnd> dne<T> a(czu $$0, dpy $$1, dnf<T> $$2) {
      return $$0.B ? null : a($$2, dnf.l, dng::a);
   }

   @Override
   protected ety a(dpy $$0, cza $$1, im $$2, etk $$3) {
      return c;
   }

   @Override
   protected boq a(dpy $$0, czu $$1, im $$2, ckl $$3, etb $$4) {
      if ($$1.B) {
         return boq.a;
      } else {
         dnd $$5 = $$1.c_($$2);
         if ($$5 instanceof dng) {
            $$3.a((dng)$$5);
            $$3.a(avj.aa);
         }

         return boq.b;
      }
   }

   @Override
   public void a(dpy $$0, czu $$1, im $$2, ayd $$3) {
      double $$4 = (double)$$2.u() + 0.4 + (double)$$3.i() * 0.2;
      double $$5 = (double)$$2.v() + 0.7 + (double)$$3.i() * 0.3;
      double $$6 = (double)$$2.w() + 0.4 + (double)$$3.i() * 0.2;
      $$1.a(kw.ab, $$4, $$5, $$6, 0.0, 0.0, 0.0);
   }

   @Override
   protected void a(dpy $$0, czu $$1, im $$2, dpy $$3, boolean $$4) {
      bom.a($$0, $$3, $$1, $$2);
      super.a($$0, $$1, $$2, $$3, $$4);
   }

   @Override
   protected boolean d_(dpy $$0) {
      return true;
   }

   @Override
   protected int a(dpy $$0, czu $$1, im $$2) {
      return cnh.a($$1.c_($$2));
   }

   @Override
   protected void a(dpz.a<dcv, dpy> $$0) {
      $$0.a(b[0], b[1], b[2]);
   }

   @Override
   protected boolean a(dpy $$0, emg $$1) {
      return false;
   }
}
