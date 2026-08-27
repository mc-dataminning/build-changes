import com.mojang.serialization.MapCodec;
import javax.annotation.Nullable;

public class djy extends dcv implements djw {
   public static final MapCodec<djy> a = b(djy::new);
   public static final dqw<drg> b = dqo.bh;
   public static final dqp c = dqo.C;
   protected static final ety d = dcv.a(0.0, 0.0, 0.0, 16.0, 8.0, 16.0);
   protected static final ety e = dcv.a(0.0, 8.0, 0.0, 16.0, 16.0, 16.0);

   @Override
   public MapCodec<? extends djy> a() {
      return a;
   }

   public djy(dpx.d $$0) {
      super($$0);
      this.k(this.n().a(b, drg.b).a(c, Boolean.valueOf(false)));
   }

   @Override
   protected boolean g_(dpy $$0) {
      return $$0.c(b) != drg.c;
   }

   @Override
   protected void a(dpz.a<dcv, dpy> $$0) {
      $$0.a(b, c);
   }

   @Override
   protected ety a(dpy $$0, cza $$1, im $$2, etk $$3) {
      drg $$4 = $$0.c(b);
      switch ($$4) {
         case c:
            return etv.b();
         case a:
            return e;
         default:
            return d;
      }
   }

   @Nullable
   @Override
   public dpy a(cvl $$0) {
      im $$1 = $$0.a();
      dpy $$2 = $$0.q().a_($$1);
      if ($$2.a(this)) {
         return $$2.a(b, drg.c).a(c, Boolean.valueOf(false));
      } else {
         elr $$3 = $$0.q().b_($$1);
         dpy $$4 = this.n().a(b, drg.b).a(c, Boolean.valueOf($$3.a() == els.c));
         ir $$5 = $$0.k();
         return $$5 != ir.a && ($$5 == ir.b || !($$0.l().d - (double)$$1.v() > 0.5)) ? $$4 : $$4.a(b, drg.a);
      }
   }

   @Override
   protected boolean a(dpy $$0, cvl $$1) {
      csd $$2 = $$1.n();
      drg $$3 = $$0.c(b);
      if ($$3 == drg.c || !$$2.a(this.p())) {
         return false;
      } else if ($$1.c()) {
         boolean $$4 = $$1.l().d - (double)$$1.a().v() > 0.5;
         ir $$5 = $$1.k();
         return $$3 == drg.b ? $$5 == ir.b || $$4 && $$5.o().d() : $$5 == ir.a || !$$4 && $$5.o().d();
      } else {
         return true;
      }
   }

   @Override
   protected elr c_(dpy $$0) {
      return $$0.c(c) ? els.c.a(false) : super.c_($$0);
   }

   @Override
   public boolean a(czv $$0, im $$1, dpy $$2, elr $$3) {
      return $$2.c(b) != drg.c ? djw.super.a($$0, $$1, $$2, $$3) : false;
   }

   @Override
   public boolean a(@Nullable ckl $$0, cza $$1, im $$2, dpy $$3, elq $$4) {
      return $$3.c(b) != drg.c ? djw.super.a($$0, $$1, $$2, $$3, $$4) : false;
   }

   @Override
   protected dpy a(dpy $$0, ir $$1, dpy $$2, czv $$3, im $$4, im $$5) {
      if ($$0.c(c)) {
         $$3.a($$4, els.c, els.c.a($$3));
      }

      return super.a($$0, $$1, $$2, $$3, $$4, $$5);
   }

   @Override
   protected boolean a(dpy $$0, emg $$1) {
      switch ($$1) {
         case a:
            return false;
         case b:
            return $$0.u().a(avt.a);
         case c:
            return false;
         default:
            return false;
      }
   }
}
