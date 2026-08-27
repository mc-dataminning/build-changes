import com.mojang.serialization.MapCodec;
import javax.annotation.Nullable;

public class ddv extends djh implements djw {
   public static final MapCodec<ddv> a = b(ddv::new);
   public static final dqp b = dqo.C;
   protected static final float c = 6.5F;
   protected static final float d = 9.5F;
   protected static final ety e = dcv.a(6.5, 0.0, 6.5, 9.5, 16.0, 9.5);
   protected static final ety f = dcv.a(6.5, 6.5, 0.0, 9.5, 9.5, 16.0);
   protected static final ety g = dcv.a(0.0, 6.5, 6.5, 16.0, 9.5, 9.5);

   @Override
   public MapCodec<ddv> a() {
      return a;
   }

   public ddv(dpx.d $$0) {
      super($$0);
      this.k(this.E.b().a(b, Boolean.valueOf(false)).a(i, ir.a.b));
   }

   @Override
   protected ety a(dpy $$0, cza $$1, im $$2, etk $$3) {
      switch ((ir.a)$$0.c(i)) {
         case a:
         default:
            return g;
         case c:
            return f;
         case b:
            return e;
      }
   }

   @Nullable
   @Override
   public dpy a(cvl $$0) {
      elr $$1 = $$0.q().b_($$0.a());
      boolean $$2 = $$1.a() == els.c;
      return super.a($$0).a(b, Boolean.valueOf($$2));
   }

   @Override
   protected dpy a(dpy $$0, ir $$1, dpy $$2, czv $$3, im $$4, im $$5) {
      if ($$0.c(b)) {
         $$3.a($$4, els.c, els.c.a($$3));
      }

      return super.a($$0, $$1, $$2, $$3, $$4, $$5);
   }

   @Override
   protected void a(dpz.a<dcv, dpy> $$0) {
      $$0.a(b).a(i);
   }

   @Override
   protected elr c_(dpy $$0) {
      return $$0.c(b) ? els.c.a(false) : super.c_($$0);
   }

   @Override
   protected boolean a(dpy $$0, emg $$1) {
      return false;
   }
}
