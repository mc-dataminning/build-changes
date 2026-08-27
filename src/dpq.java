import com.mojang.serialization.MapCodec;
import java.util.Collections;
import java.util.List;
import javax.annotation.Nullable;

public class dpq extends dch {
   public static final MapCodec<dpq> a = b(dpq::new);
   public static final dqs b = dps.a;
   public static final dqw<dra> c = dps.c;

   @Override
   public MapCodec<dpq> a() {
      return a;
   }

   public dpq(dpx.d $$0) {
      super($$0);
      this.k(this.E.b().a(b, ir.c).a(c, dra.a));
   }

   @Nullable
   @Override
   public dnd a(im $$0, dpy $$1) {
      return null;
   }

   public static dnd a(im $$0, dpy $$1, dpy $$2, ir $$3, boolean $$4, boolean $$5) {
      return new dpu($$0, $$1, $$2, $$3, $$4, $$5);
   }

   @Nullable
   @Override
   public <T extends dnd> dne<T> a(czu $$0, dpy $$1, dnf<T> $$2) {
      return a($$2, dnf.k, dpu::a);
   }

   @Override
   protected void a(dpy $$0, czu $$1, im $$2, dpy $$3, boolean $$4) {
      if (!$$0.a($$3.b())) {
         dnd $$5 = $$1.c_($$2);
         if ($$5 instanceof dpu) {
            ((dpu)$$5).k();
         }
      }
   }

   @Override
   public void a(czv $$0, im $$1, dpy $$2) {
      im $$3 = $$1.a($$2.c(b).g());
      dpy $$4 = $$0.a_($$3);
      if ($$4.b() instanceof dpr && $$4.c(dpr.c)) {
         $$0.a($$3, false);
      }
   }

   @Override
   protected boq a(dpy $$0, czu $$1, im $$2, ckl $$3, etb $$4) {
      if (!$$1.B && $$1.c_($$2) == null) {
         $$1.a($$2, false);
         return boq.b;
      } else {
         return boq.d;
      }
   }

   @Override
   protected List<csd> a(dpy $$0, eog.a $$1) {
      dpu $$2 = this.a($$1.a(), im.a($$1.a(eqt.f)));
      return $$2 == null ? Collections.emptyList() : $$2.j().a($$1);
   }

   @Override
   protected ety a(dpy $$0, cza $$1, im $$2, etk $$3) {
      return etv.a();
   }

   @Override
   protected ety b(dpy $$0, cza $$1, im $$2, etk $$3) {
      dpu $$4 = this.a($$1, $$2);
      return $$4 != null ? $$4.a($$1, $$2) : etv.a();
   }

   @Nullable
   private dpu a(cza $$0, im $$1) {
      dnd $$2 = $$0.c_($$1);
      return $$2 instanceof dpu ? (dpu)$$2 : null;
   }

   @Override
   public csd a(czx $$0, im $$1, dpy $$2) {
      return csd.i;
   }

   @Override
   protected dpy a(dpy $$0, dji $$1) {
      return $$0.a(b, $$1.a($$0.c(b)));
   }

   @Override
   protected dpy a(dpy $$0, dhs $$1) {
      return $$0.a($$1.a($$0.c(b)));
   }

   @Override
   protected void a(dpz.a<dcv, dpy> $$0) {
      $$0.a(b, c);
   }

   @Override
   protected boolean a(dpy $$0, emg $$1) {
      return false;
   }
}
