import com.mojang.serialization.MapCodec;
import javax.annotation.Nullable;

public class dlg extends dgh {
   public static final MapCodec<dlg> a = b(dlg::new);
   public static final duu b = dkr.aE;
   public static final dur c = duq.w;
   public static final dur d = duq.o;
   public static final eyx e = dgv.a(0.0, 0.0, 0.0, 16.0, 2.0, 16.0);
   public static final eyx f = dgv.a(4.0, 2.0, 4.0, 12.0, 14.0, 12.0);
   public static final eyx g = eyu.a(e, f);
   public static final eyx h = dgv.a(0.0, 15.0, 0.0, 16.0, 15.0, 16.0);
   public static final eyx i = eyu.a(g, h);
   public static final eyx j = eyu.a(
      dgv.a(1.0, 10.0, 0.0, 5.333333, 14.0, 16.0), dgv.a(5.333333, 12.0, 0.0, 9.666667, 16.0, 16.0), dgv.a(9.666667, 14.0, 0.0, 14.0, 18.0, 16.0), g
   );
   public static final eyx k = eyu.a(
      dgv.a(0.0, 10.0, 1.0, 16.0, 14.0, 5.333333), dgv.a(0.0, 12.0, 5.333333, 16.0, 16.0, 9.666667), dgv.a(0.0, 14.0, 9.666667, 16.0, 18.0, 14.0), g
   );
   public static final eyx l = eyu.a(
      dgv.a(10.666667, 10.0, 0.0, 15.0, 14.0, 16.0), dgv.a(6.333333, 12.0, 0.0, 10.666667, 16.0, 16.0), dgv.a(2.0, 14.0, 0.0, 6.333333, 18.0, 16.0), g
   );
   public static final eyx m = eyu.a(
      dgv.a(0.0, 10.0, 10.666667, 16.0, 14.0, 15.0), dgv.a(0.0, 12.0, 6.333333, 16.0, 16.0, 10.666667), dgv.a(0.0, 14.0, 2.0, 16.0, 18.0, 6.333333), g
   );
   private static final int n = 2;

   @Override
   public MapCodec<dlg> a() {
      return a;
   }

   protected dlg(dtz.d $$0) {
      super($$0);
      this.l(this.E.b().b(b, jj.c).b(c, Boolean.valueOf(false)).b(d, Boolean.valueOf(false)));
   }

   @Override
   protected dnc a_(dua $$0) {
      return dnc.c;
   }

   @Override
   protected eyx d_(dua $$0) {
      return g;
   }

   @Override
   protected boolean g_(dua $$0) {
      return true;
   }

   @Override
   public dua a(cyw $$0) {
      dds $$1 = $$0.q();
      cvl $$2 = $$0.n();
      cnp $$3 = $$0.o();
      boolean $$4 = false;
      if (!$$1.B && $$3 != null && $$3.gz()) {
         cya $$5 = $$2.a(kr.Q, cya.a);
         if ($$5.a("Book")) {
            $$4 = true;
         }
      }

      return this.o().b(b, $$0.g().g()).b(d, Boolean.valueOf($$4));
   }

   @Override
   protected eyx b(dua $$0, dcx $$1, je $$2, eyj $$3) {
      return i;
   }

   @Override
   protected eyx a(dua $$0, dcx $$1, je $$2, eyj $$3) {
      switch ((jj)$$0.c(b)) {
         case c:
            return k;
         case d:
            return m;
         case f:
            return l;
         case e:
            return j;
         default:
            return g;
      }
   }

   @Override
   protected dua a(dua $$0, dnj $$1) {
      return $$0.b(b, $$1.a($$0.c(b)));
   }

   @Override
   protected dua a(dua $$0, dls $$1) {
      return $$0.a($$1.a($$0.c(b)));
   }

   @Override
   protected void a(dub.a<dgv, dua> $$0) {
      $$0.a(b, c, d);
   }

   @Override
   public dre a(je $$0, dua $$1) {
      return new dsi($$0, $$1);
   }

   public static boolean a(@Nullable buf $$0, dds $$1, je $$2, dua $$3, cvl $$4) {
      if (!$$3.c(d)) {
         if (!$$1.B) {
            b($$0, $$1, $$2, $$3, $$4);
         }

         return true;
      } else {
         return false;
      }
   }

   private static void b(@Nullable buf $$0, dds $$1, je $$2, dua $$3, cvl $$4) {
      if ($$1.c_($$2) instanceof dsi $$6) {
         $$6.b($$4.b(1, $$0));
         a($$0, $$1, $$2, $$3, true);
         $$1.a(null, $$2, awd.cz, awe.e, 1.0F, 1.0F);
      }
   }

   public static void a(@Nullable btj $$0, dds $$1, je $$2, dua $$3, boolean $$4) {
      dua $$5 = $$3.b(c, Boolean.valueOf(false)).b(d, Boolean.valueOf($$4));
      $$1.a($$2, $$5, 3);
      $$1.a(dyx.c, $$2, dyx.a.a($$0, $$5));
      b($$1, $$2, $$3);
   }

   public static void a(dds $$0, je $$1, dua $$2) {
      a($$0, $$1, $$2, true);
      $$0.a($$1, $$2.b(), 2);
      $$0.c(1043, $$1, 0);
   }

   private static void a(dds $$0, je $$1, dua $$2, boolean $$3) {
      $$0.a($$1, $$2.b(c, Boolean.valueOf($$3)), 3);
      b($$0, $$1, $$2);
   }

   private static void b(dds $$0, je $$1, dua $$2) {
      erj $$3 = erf.a($$0, $$2.c(b).g(), jj.b);
      $$0.a($$1.e(), $$2.b(), $$3);
   }

   @Override
   protected void a(dua $$0, arg $$1, je $$2, azk $$3) {
      a($$1, $$2, $$0, false);
   }

   @Override
   protected void a(dua $$0, dds $$1, je $$2, dua $$3, boolean $$4) {
      if (!$$0.a($$3.b())) {
         if ($$0.c(d)) {
            this.d($$0, $$1, $$2);
         }

         super.a($$0, $$1, $$2, $$3, $$4);
         if ($$0.c(c)) {
            b($$1, $$2, $$0);
         }
      }
   }

   private void d(dua $$0, dds $$1, je $$2) {
      if ($$1.c_($$2) instanceof dsi $$4) {
         jj $$5 = $$0.c(b);
         cvl $$6 = $$4.b().u();
         float $$7 = 0.25F * (float)$$5.j();
         float $$8 = 0.25F * (float)$$5.l();
         cjz $$9 = new cjz($$1, (double)$$2.u() + 0.5 + (double)$$7, (double)($$2.v() + 1), (double)$$2.w() + 0.5 + (double)$$8, $$6);
         $$9.q();
         $$1.b($$9);
         $$4.a();
      }
   }

   @Override
   protected boolean f_(dua $$0) {
      return true;
   }

   @Override
   protected int a(dua $$0, dcx $$1, je $$2, jj $$3) {
      return $$0.c(c) ? 15 : 0;
   }

   @Override
   protected int b(dua $$0, dcx $$1, je $$2, jj $$3) {
      return $$3 == jj.b && $$0.c(c) ? 15 : 0;
   }

   @Override
   protected boolean c_(dua $$0) {
      return true;
   }

   @Override
   protected int a(dua $$0, dds $$1, je $$2) {
      if ($$0.c(d)) {
         dre $$3 = $$1.c_($$2);
         if ($$3 instanceof dsi) {
            return ((dsi)$$3).j();
         }
      }

      return 0;
   }

   @Override
   protected brk a(cvl $$0, dua $$1, dds $$2, je $$3, cnp $$4, brj $$5, eya $$6) {
      if ($$1.c(d)) {
         return brk.f;
      } else if ($$0.a(axb.aU)) {
         return (brk)(a($$4, $$2, $$3, $$1, $$0) ? brk.a : brk.e);
      } else {
         return (brk)($$0.f() && $$5 == brj.a ? brk.e : brk.f);
      }
   }

   @Override
   protected brk a(dua $$0, dds $$1, je $$2, cnp $$3, eya $$4) {
      if ($$0.c(d)) {
         if (!$$1.B) {
            this.a($$1, $$2, $$3);
         }

         return brk.a;
      } else {
         return brk.c;
      }
   }

   @Nullable
   @Override
   protected brm b(dua $$0, dds $$1, je $$2) {
      return !$$0.c(d) ? null : super.b($$0, $$1, $$2);
   }

   private void a(dds $$0, je $$1, cnp $$2) {
      dre $$3 = $$0.c_($$1);
      if ($$3 instanceof dsi) {
         $$2.a((dsi)$$3);
         $$2.a(awn.au);
      }
   }

   @Override
   protected boolean a(dua $$0, eqq $$1) {
      return false;
   }
}
