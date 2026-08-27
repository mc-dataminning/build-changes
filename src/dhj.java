import com.mojang.serialization.MapCodec;
import java.util.function.ToIntFunction;

public class dhj extends dcv implements djw {
   public static final MapCodec<dhj> a = b(dhj::new);
   public static final int b = 15;
   public static final dqy c = dqo.aP;
   public static final dqp d = dqo.C;
   public static final ToIntFunction<dpy> e = $$0 -> $$0.c(c);

   @Override
   public MapCodec<dhj> a() {
      return a;
   }

   public dhj(dpx.d $$0) {
      super($$0);
      this.k(this.E.b().a(c, Integer.valueOf(15)).a(d, Boolean.valueOf(false)));
   }

   @Override
   protected void a(dpz.a<dcv, dpy> $$0) {
      $$0.a(c, d);
   }

   @Override
   protected boq a(dpy $$0, czu $$1, im $$2, ckl $$3, etb $$4) {
      if (!$$1.B && $$3.gx()) {
         $$1.a($$2, $$0.a(c), 2);
         return boq.a;
      } else {
         return boq.b;
      }
   }

   @Override
   protected ety a(dpy $$0, cza $$1, im $$2, etk $$3) {
      return $$3.a(csg.hC) ? etv.b() : etv.a();
   }

   @Override
   protected boolean a_(dpy $$0, cza $$1, im $$2) {
      return true;
   }

   @Override
   protected djb b_(dpy $$0) {
      return djb.a;
   }

   @Override
   protected float d(dpy $$0, cza $$1, im $$2) {
      return 1.0F;
   }

   @Override
   protected dpy a(dpy $$0, ir $$1, dpy $$2, czv $$3, im $$4, im $$5) {
      if ($$0.c(d)) {
         $$3.a($$4, els.c, els.c.a($$3));
      }

      return super.a($$0, $$1, $$2, $$3, $$4, $$5);
   }

   @Override
   protected elr c_(dpy $$0) {
      return $$0.c(d) ? els.c.a(false) : super.c_($$0);
   }

   @Override
   public csd a(czx $$0, im $$1, dpy $$2) {
      return a(super.a($$0, $$1, $$2), $$2.c(c));
   }

   public static csd a(csd $$0, int $$1) {
      if ($$1 != 15) {
         $$0.b(jz.R, cum.a.a(c, $$1));
      }

      return $$0;
   }
}
