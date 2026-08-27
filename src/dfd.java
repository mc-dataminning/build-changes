import com.mojang.serialization.MapCodec;
import javax.annotation.Nullable;

public class dfd extends dde {
   public static final MapCodec<dfd> a = b(dfd::new);
   public static final dqw<dqu> b = dqo.ae;

   @Override
   public MapCodec<? extends dfd> a() {
      return a;
   }

   public dfd(dpx.d $$0) {
      super($$0);
      this.k(this.E.b().a(b, dqu.b));
   }

   @Override
   protected dpy a(dpy $$0, ir $$1, dpy $$2, czv $$3, im $$4, im $$5) {
      dqu $$6 = $$0.c(b);
      if ($$1.o() != ir.a.b || $$6 == dqu.b != ($$1 == ir.b) || $$2.a(this) && $$2.c(b) != $$6) {
         return $$6 == dqu.b && $$1 == ir.a && !$$0.a($$3, $$4) ? dcx.a.n() : super.a($$0, $$1, $$2, $$3, $$4, $$5);
      } else {
         return dcx.a.n();
      }
   }

   @Nullable
   @Override
   public dpy a(cvl $$0) {
      im $$1 = $$0.a();
      czu $$2 = $$0.q();
      return $$1.v() < $$2.al() - 1 && $$2.a_($$1.c()).a($$0) ? super.a($$0) : null;
   }

   @Override
   public void a(czu $$0, im $$1, dpy $$2, bre $$3, csd $$4) {
      im $$5 = $$1.c();
      $$0.a($$5, c($$0, $$5, this.n().a(b, dqu.a)), 3);
   }

   @Override
   protected boolean a(dpy $$0, czx $$1, im $$2) {
      if ($$0.c(b) != dqu.a) {
         return super.a($$0, $$1, $$2);
      } else {
         dpy $$3 = $$1.a_($$2.d());
         return $$3.a(this) && $$3.c(b) == dqu.b;
      }
   }

   public static void a(czv $$0, dpy $$1, im $$2, int $$3) {
      im $$4 = $$2.c();
      $$0.a($$2, c($$0, $$2, $$1.a(b, dqu.b)), $$3);
      $$0.a($$4, c($$0, $$4, $$1.a(b, dqu.a)), $$3);
   }

   public static dpy c(czx $$0, im $$1, dpy $$2) {
      return $$2.b(dqo.C) ? $$2.a(dqo.C, Boolean.valueOf($$0.z($$1))) : $$2;
   }

   @Override
   public dpy a(czu $$0, im $$1, dpy $$2, ckl $$3) {
      if (!$$0.B) {
         if ($$3.f()) {
            b($$0, $$1, $$2, $$3);
         } else {
            a($$2, $$0, $$1, null, $$3, $$3.eV());
         }
      }

      return super.a($$0, $$1, $$2, $$3);
   }

   @Override
   public void a(czu $$0, ckl $$1, im $$2, dpy $$3, @Nullable dnd $$4, csd $$5) {
      super.a($$0, $$1, $$2, dcx.a.n(), $$4, $$5);
   }

   protected static void b(czu $$0, im $$1, dpy $$2, ckl $$3) {
      dqu $$4 = $$2.c(b);
      if ($$4 == dqu.a) {
         im $$5 = $$1.d();
         dpy $$6 = $$0.a_($$5);
         if ($$6.a($$2.b()) && $$6.c(b) == dqu.b) {
            dpy $$7 = $$6.u().b(els.c) ? dcx.G.n() : dcx.a.n();
            $$0.a($$5, $$7, 35);
            $$0.a($$3, 2001, $$5, dcv.i($$6));
         }
      }
   }

   @Override
   protected void a(dpz.a<dcv, dpy> $$0) {
      $$0.a(b);
   }

   @Override
   protected long a(dpy $$0, im $$1) {
      return axw.b($$1.u(), $$1.c($$0.c(b) == dqu.b ? 0 : 1).v(), $$1.w());
   }
}
