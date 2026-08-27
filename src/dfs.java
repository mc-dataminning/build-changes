import com.mojang.serialization.MapCodec;
import javax.annotation.Nullable;

public class dfs extends dcv {
   public static final MapCodec<dfs> a = b(dfs::new);
   public static final dqy b = dqo.aQ;
   protected static final ety c = dcv.a(0.0, 0.0, 0.0, 16.0, 15.0, 16.0);
   public static final int d = 7;

   @Override
   public MapCodec<dfs> a() {
      return a;
   }

   protected dfs(dpx.d $$0) {
      super($$0);
      this.k(this.E.b().a(b, Integer.valueOf(0)));
   }

   @Override
   protected dpy a(dpy $$0, ir $$1, dpy $$2, czv $$3, im $$4, im $$5) {
      if ($$1 == ir.b && !$$0.a($$3, $$4)) {
         $$3.a($$4, this, 1);
      }

      return super.a($$0, $$1, $$2, $$3, $$4, $$5);
   }

   @Override
   protected boolean a(dpy $$0, czx $$1, im $$2) {
      dpy $$3 = $$1.a_($$2.c());
      return !$$3.e() || $$3.b() instanceof dfu || $$3.b() instanceof dpq;
   }

   @Override
   public dpy a(cvl $$0) {
      return !this.n().a((czx)$$0.q(), $$0.a()) ? dcx.j.n() : super.a($$0);
   }

   @Override
   protected boolean g_(dpy $$0) {
      return true;
   }

   @Override
   protected ety a(dpy $$0, cza $$1, im $$2, etk $$3) {
      return c;
   }

   @Override
   protected void a(dpy $$0, aqe $$1, im $$2, ayd $$3) {
      if (!$$0.a($$1, $$2)) {
         a(null, $$0, $$1, $$2);
      }
   }

   @Override
   protected void b(dpy $$0, aqe $$1, im $$2, ayd $$3) {
      int $$4 = $$0.c(b);
      if (!a((czx)$$1, $$2) && !$$1.r($$2.c())) {
         if ($$4 > 0) {
            $$1.a($$2, $$0.a(b, Integer.valueOf($$4 - 1)), 2);
         } else if (!a((cza)$$1, $$2)) {
            a(null, $$0, $$1, $$2);
         }
      } else if ($$4 < 7) {
         $$1.a($$2, $$0.a(b, Integer.valueOf(7)), 2);
      }
   }

   @Override
   public void a(czu $$0, dpy $$1, im $$2, bql $$3, float $$4) {
      if (!$$0.B && $$0.z.i() < $$4 - 0.5F && $$3 instanceof bre && ($$3 instanceof ckl || $$0.aa().b(czq.c)) && $$3.dh() * $$3.dh() * $$3.di() > 0.512F) {
         a($$3, $$1, $$0, $$2);
      }

      super.a($$0, $$1, $$2, $$3, $$4);
   }

   public static void a(@Nullable bql $$0, dpy $$1, czu $$2, im $$3) {
      dpy $$4 = a($$1, dcx.j.n(), $$2, $$3);
      $$2.b($$3, $$4);
      $$2.a(dur.c, $$3, dur.a.a($$0, $$4));
   }

   private static boolean a(cza $$0, im $$1) {
      return $$0.a_($$1.c()).a(avo.cr);
   }

   private static boolean a(czx $$0, im $$1) {
      for (im $$2 : im.c($$1.b(-4, 0, -4), $$1.b(4, 1, 4))) {
         if ($$0.b_($$2).a(avt.a)) {
            return true;
         }
      }

      return false;
   }

   @Override
   protected void a(dpz.a<dcv, dpy> $$0) {
      $$0.a(b);
   }

   @Override
   protected boolean a(dpy $$0, emg $$1) {
      return false;
   }
}
