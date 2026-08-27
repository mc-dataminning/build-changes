import com.mojang.serialization.MapCodec;
import javax.annotation.Nullable;

public class dik extends dfd implements dcy {
   public static final MapCodec<dik> c = b(dik::new);
   public static final dqy d = dqo.at;
   public static final int e = 4;
   private static final int f = 3;
   private static final int g = 1;
   private static final ety h = dcv.a(3.0, 0.0, 3.0, 13.0, 15.0, 13.0);
   private static final ety i = dcv.a(3.0, -1.0, 3.0, 13.0, 16.0, 13.0);
   private static final ety j = dcv.a(5.0, -1.0, 5.0, 11.0, 3.0, 11.0);
   private static final ety k = dcv.a(3.0, -1.0, 3.0, 13.0, 5.0, 13.0);
   private static final ety[] l = new ety[]{dcv.a(3.0, 0.0, 3.0, 13.0, 11.0, 13.0), h};
   private static final ety[] m = new ety[]{j, dcv.a(3.0, -1.0, 3.0, 13.0, 14.0, 13.0), i, i, i};

   @Override
   public MapCodec<dik> a() {
      return c;
   }

   public dik(dpx.d $$0) {
      super($$0);
   }

   @Nullable
   @Override
   public dpy a(cvl $$0) {
      return this.n();
   }

   @Override
   public ety a(dpy $$0, cza $$1, im $$2, etk $$3) {
      return $$0.c(b) == dqu.a ? l[Math.min(Math.abs(4 - ($$0.c(d) + 1)), l.length - 1)] : m[$$0.c(d)];
   }

   @Override
   public ety b(dpy $$0, cza $$1, im $$2, etk $$3) {
      if ($$0.c(d) == 0) {
         return j;
      } else {
         return $$0.c(b) == dqu.b ? k : super.b($$0, $$1, $$2, $$3);
      }
   }

   @Override
   public dpy a(dpy $$0, ir $$1, dpy $$2, czv $$3, im $$4, im $$5) {
      if (b($$0.c(d))) {
         return super.a($$0, $$1, $$2, $$3, $$4, $$5);
      } else {
         return $$0.a($$3, $$4) ? $$0 : dcx.a.n();
      }
   }

   @Override
   public boolean a(dpy $$0, czx $$1, im $$2) {
      return m($$0) && !b($$1, $$2) ? false : super.a($$0, $$1, $$2);
   }

   @Override
   protected boolean b(dpy $$0, cza $$1, im $$2) {
      return $$0.a(dcx.cC);
   }

   @Override
   protected void a(dpz.a<dcv, dpy> $$0) {
      $$0.a(d);
      super.a($$0);
   }

   @Override
   public void a(dpy $$0, czu $$1, im $$2, bql $$3) {
      if ($$3 instanceof chw && $$1.aa().b(czq.c)) {
         $$1.a($$2, true, $$3);
      }

      super.a($$0, $$1, $$2, $$3);
   }

   @Override
   public boolean a(dpy $$0, cvl $$1) {
      return false;
   }

   @Override
   public void a(czu $$0, im $$1, dpy $$2, bre $$3, csd $$4) {
   }

   @Override
   public boolean e_(dpy $$0) {
      return $$0.c(b) == dqu.b && !this.n($$0);
   }

   @Override
   public void b(dpy $$0, aqe $$1, im $$2, ayd $$3) {
      float $$4 = deq.a(this, $$1, $$2);
      boolean $$5 = $$3.a((int)(25.0F / $$4) + 1) == 0;
      if ($$5) {
         this.a($$1, $$0, $$2, 1);
      }
   }

   private void a(aqe $$0, dpy $$1, im $$2, int $$3) {
      int $$4 = Math.min($$1.c(d) + $$3, 4);
      if (this.a($$0, $$2, $$1, $$4)) {
         dpy $$5 = $$1.a(d, Integer.valueOf($$4));
         $$0.a($$2, $$5, 2);
         if (b($$4)) {
            $$0.a($$2.c(), $$5.a(b, dqu.a), 3);
         }
      }
   }

   private static boolean a(czx $$0, im $$1) {
      dpy $$2 = $$0.a_($$1);
      return $$2.i() || $$2.a(dcx.kB);
   }

   private static boolean b(czx $$0, im $$1) {
      return deq.a($$0, $$1);
   }

   private static boolean m(dpy $$0) {
      return $$0.a(dcx.kB) && $$0.c(b) == dqu.b;
   }

   private static boolean b(int $$0) {
      return $$0 >= 3;
   }

   private boolean a(czx $$0, im $$1, dpy $$2, int $$3) {
      return !this.n($$2) && b($$0, $$1) && (!b($$3) || a($$0, $$1.c()));
   }

   private boolean n(dpy $$0) {
      return $$0.c(d) >= 4;
   }

   @Nullable
   private dik.a d(czx $$0, im $$1, dpy $$2) {
      if (m($$2)) {
         return new dik.a($$1, $$2);
      } else {
         im $$3 = $$1.d();
         dpy $$4 = $$0.a_($$3);
         return m($$4) ? new dik.a($$3, $$4) : null;
      }
   }

   @Override
   public boolean b(czx $$0, im $$1, dpy $$2) {
      dik.a $$3 = this.d($$0, $$1, $$2);
      return $$3 == null ? false : this.a($$0, $$3.a, $$3.b, $$3.b.c(d) + 1);
   }

   @Override
   public boolean a(czu $$0, ayd $$1, im $$2, dpy $$3) {
      return true;
   }

   @Override
   public void a(aqe $$0, ayd $$1, im $$2, dpy $$3) {
      dik.a $$4 = this.d($$0, $$2, $$3);
      if ($$4 != null) {
         this.a($$0, $$4.b, $$4.a, 1);
      }
   }

   static record a(im a, dpy b) {
   }
}
