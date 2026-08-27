import com.mojang.serialization.MapCodec;
import javax.annotation.Nullable;

public class dhb extends dcv implements djw {
   public static final MapCodec<dhb> a = b(dhb::new);
   public static final dqs b = dgr.aE;
   public static final dqp c = dqo.C;
   protected static final float d = 3.0F;
   protected static final ety e = dcv.a(0.0, 0.0, 0.0, 3.0, 16.0, 16.0);
   protected static final ety f = dcv.a(13.0, 0.0, 0.0, 16.0, 16.0, 16.0);
   protected static final ety g = dcv.a(0.0, 0.0, 0.0, 16.0, 16.0, 3.0);
   protected static final ety h = dcv.a(0.0, 0.0, 13.0, 16.0, 16.0, 16.0);

   @Override
   public MapCodec<dhb> a() {
      return a;
   }

   protected dhb(dpx.d $$0) {
      super($$0);
      this.k(this.E.b().a(b, ir.c).a(c, Boolean.valueOf(false)));
   }

   @Override
   protected ety a(dpy $$0, cza $$1, im $$2, etk $$3) {
      switch ((ir)$$0.c(b)) {
         case c:
            return h;
         case d:
            return g;
         case e:
            return f;
         case f:
         default:
            return e;
      }
   }

   private boolean a(cza $$0, im $$1, ir $$2) {
      dpy $$3 = $$0.a_($$1);
      return $$3.d($$0, $$1, $$2);
   }

   @Override
   protected boolean a(dpy $$0, czx $$1, im $$2) {
      ir $$3 = $$0.c(b);
      return this.a($$1, $$2.a($$3.g()), $$3);
   }

   @Override
   protected dpy a(dpy $$0, ir $$1, dpy $$2, czv $$3, im $$4, im $$5) {
      if ($$1.g() == $$0.c(b) && !$$0.a($$3, $$4)) {
         return dcx.a.n();
      } else {
         if ($$0.c(c)) {
            $$3.a($$4, els.c, els.c.a($$3));
         }

         return super.a($$0, $$1, $$2, $$3, $$4, $$5);
      }
   }

   @Nullable
   @Override
   public dpy a(cvl $$0) {
      if (!$$0.c()) {
         dpy $$1 = $$0.q().a_($$0.a().a($$0.k().g()));
         if ($$1.a(this) && $$1.c(b) == $$0.k()) {
            return null;
         }
      }

      dpy $$2 = this.n();
      czx $$3 = $$0.q();
      im $$4 = $$0.a();
      elr $$5 = $$0.q().b_($$0.a());

      for (ir $$6 : $$0.f()) {
         if ($$6.o().d()) {
            $$2 = $$2.a(b, $$6.g());
            if ($$2.a($$3, $$4)) {
               return $$2.a(c, Boolean.valueOf($$5.a() == els.c));
            }
         }
      }

      return null;
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
   protected elr c_(dpy $$0) {
      return $$0.c(c) ? els.c.a(false) : super.c_($$0);
   }
}
