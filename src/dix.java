import com.google.common.collect.ImmutableMap;
import com.google.common.collect.Maps;
import com.google.common.collect.Sets;
import com.google.common.collect.UnmodifiableIterator;
import com.mojang.serialization.MapCodec;
import java.util.Map;
import java.util.Set;
import javax.annotation.Nullable;

public class dix extends dcv {
   public static final MapCodec<dix> a = b(dix::new);
   public static final dqw<drd> b = dqo.ab;
   public static final dqw<drd> c = dqo.aa;
   public static final dqw<drd> d = dqo.ac;
   public static final dqw<drd> e = dqo.ad;
   public static final dqy f = dqo.aT;
   public static final Map<ir, dqw<drd>> g = Maps.newEnumMap(ImmutableMap.of(ir.c, b, ir.f, c, ir.d, d, ir.e, e));
   protected static final int h = 1;
   protected static final int i = 3;
   protected static final int j = 13;
   protected static final int k = 3;
   protected static final int l = 13;
   private static final ety m = dcv.a(3.0, 0.0, 3.0, 13.0, 1.0, 13.0);
   private static final Map<ir, ety> n = Maps.newEnumMap(
      ImmutableMap.of(
         ir.c,
         dcv.a(3.0, 0.0, 0.0, 13.0, 1.0, 13.0),
         ir.d,
         dcv.a(3.0, 0.0, 3.0, 13.0, 1.0, 16.0),
         ir.f,
         dcv.a(3.0, 0.0, 3.0, 16.0, 1.0, 13.0),
         ir.e,
         dcv.a(0.0, 0.0, 3.0, 13.0, 1.0, 13.0)
      )
   );
   private static final Map<ir, ety> o = Maps.newEnumMap(
      ImmutableMap.of(
         ir.c,
         etv.a(n.get(ir.c), dcv.a(3.0, 0.0, 0.0, 13.0, 16.0, 1.0)),
         ir.d,
         etv.a(n.get(ir.d), dcv.a(3.0, 0.0, 15.0, 13.0, 16.0, 16.0)),
         ir.f,
         etv.a(n.get(ir.f), dcv.a(15.0, 0.0, 3.0, 16.0, 16.0, 13.0)),
         ir.e,
         etv.a(n.get(ir.e), dcv.a(0.0, 0.0, 3.0, 1.0, 16.0, 13.0))
      )
   );
   private static final Map<dpy, ety> F = Maps.newHashMap();
   private static final etf[] G = ac.a(new etf[16], $$0 -> {
      for (int $$1 = 0; $$1 <= 15; $$1++) {
         float $$2 = (float)$$1 / 15.0F;
         float $$3 = $$2 * 0.6F + ($$2 > 0.0F ? 0.4F : 0.3F);
         float $$4 = axw.a($$2 * $$2 * 0.7F - 0.5F, 0.0F, 1.0F);
         float $$5 = axw.a($$2 * $$2 * 0.6F - 0.7F, 0.0F, 1.0F);
         $$0[$$1] = new etf((double)$$3, (double)$$4, (double)$$5);
      }
   });
   private static final float H = 0.2F;
   private final dpy I;
   private boolean J = true;

   @Override
   public MapCodec<dix> a() {
      return a;
   }

   public dix(dpx.d $$0) {
      super($$0);
      this.k(this.E.b().a(b, drd.c).a(c, drd.c).a(d, drd.c).a(e, drd.c).a(f, Integer.valueOf(0)));
      this.I = this.n().a(b, drd.b).a(c, drd.b).a(d, drd.b).a(e, drd.b);
      UnmodifiableIterator var2 = this.l().a().iterator();

      while (var2.hasNext()) {
         dpy $$1 = (dpy)var2.next();
         if ($$1.c(f) == 0) {
            F.put($$1, this.n($$1));
         }
      }
   }

   private ety n(dpy $$0) {
      ety $$1 = m;

      for (ir $$2 : ir.c.a) {
         drd $$3 = $$0.c(g.get($$2));
         if ($$3 == drd.b) {
            $$1 = etv.a($$1, n.get($$2));
         } else if ($$3 == drd.a) {
            $$1 = etv.a($$1, o.get($$2));
         }
      }

      return $$1;
   }

   @Override
   protected ety a(dpy $$0, cza $$1, im $$2, etk $$3) {
      return F.get($$0.a(f, Integer.valueOf(0)));
   }

   @Override
   public dpy a(cvl $$0) {
      return this.a($$0.q(), this.I, $$0.a());
   }

   private dpy a(cza $$0, dpy $$1, im $$2) {
      boolean $$3 = p($$1);
      $$1 = this.b($$0, this.n().a(f, $$1.c(f)), $$2);
      if ($$3 && p($$1)) {
         return $$1;
      } else {
         boolean $$4 = $$1.c(b).a();
         boolean $$5 = $$1.c(d).a();
         boolean $$6 = $$1.c(c).a();
         boolean $$7 = $$1.c(e).a();
         boolean $$8 = !$$4 && !$$5;
         boolean $$9 = !$$6 && !$$7;
         if (!$$7 && $$8) {
            $$1 = $$1.a(e, drd.b);
         }

         if (!$$6 && $$8) {
            $$1 = $$1.a(c, drd.b);
         }

         if (!$$4 && $$9) {
            $$1 = $$1.a(b, drd.b);
         }

         if (!$$5 && $$9) {
            $$1 = $$1.a(d, drd.b);
         }

         return $$1;
      }
   }

   private dpy b(cza $$0, dpy $$1, im $$2) {
      boolean $$3 = !$$0.a_($$2.c()).g($$0, $$2);

      for (ir $$4 : ir.c.a) {
         if (!$$1.c(g.get($$4)).a()) {
            drd $$5 = this.a($$0, $$2, $$4, $$3);
            $$1 = $$1.a(g.get($$4), $$5);
         }
      }

      return $$1;
   }

   @Override
   protected dpy a(dpy $$0, ir $$1, dpy $$2, czv $$3, im $$4, im $$5) {
      if ($$1 == ir.a) {
         return !this.a($$3, $$5, $$2) ? dcx.a.n() : $$0;
      } else if ($$1 == ir.b) {
         return this.a($$3, $$0, $$4);
      } else {
         drd $$6 = this.a($$3, $$4, $$1);
         return $$6.a() == $$0.c(g.get($$1)).a() && !o($$0) ? $$0.a(g.get($$1), $$6) : this.a($$3, this.I.a(f, $$0.c(f)).a(g.get($$1), $$6), $$4);
      }
   }

   private static boolean o(dpy $$0) {
      return $$0.c(b).a() && $$0.c(d).a() && $$0.c(c).a() && $$0.c(e).a();
   }

   private static boolean p(dpy $$0) {
      return !$$0.c(b).a() && !$$0.c(d).a() && !$$0.c(c).a() && !$$0.c(e).a();
   }

   @Override
   protected void a(dpy $$0, czv $$1, im $$2, int $$3, int $$4) {
      im.a $$5 = new im.a();

      for (ir $$6 : ir.c.a) {
         drd $$7 = $$0.c(g.get($$6));
         if ($$7 != drd.c && !$$1.a_($$5.a($$2, $$6)).a(this)) {
            $$5.c(ir.a);
            dpy $$8 = $$1.a_($$5);
            if ($$8.a(this)) {
               im $$9 = $$5.a($$6.g());
               $$1.a($$6.g(), $$1.a_($$9), $$5, $$9, $$3, $$4);
            }

            $$5.a($$2, $$6).c(ir.b);
            dpy $$10 = $$1.a_($$5);
            if ($$10.a(this)) {
               im $$11 = $$5.a($$6.g());
               $$1.a($$6.g(), $$1.a_($$11), $$5, $$11, $$3, $$4);
            }
         }
      }
   }

   private drd a(cza $$0, im $$1, ir $$2) {
      return this.a($$0, $$1, $$2, !$$0.a_($$1.c()).g($$0, $$1));
   }

   private drd a(cza $$0, im $$1, ir $$2, boolean $$3) {
      im $$4 = $$1.a($$2);
      dpy $$5 = $$0.a_($$4);
      if ($$3) {
         boolean $$6 = $$5.b() instanceof dli || this.a($$0, $$4, $$5);
         if ($$6 && m($$0.a_($$4.c()))) {
            if ($$5.d($$0, $$4, $$2.g())) {
               return drd.a;
            }

            return drd.b;
         }
      }

      return !a($$5, $$2) && ($$5.g($$0, $$4) || !m($$0.a_($$4.d()))) ? drd.c : drd.b;
   }

   @Override
   protected boolean a(dpy $$0, czx $$1, im $$2) {
      im $$3 = $$2.d();
      dpy $$4 = $$1.a_($$3);
      return this.a($$1, $$3, $$4);
   }

   private boolean a(cza $$0, im $$1, dpy $$2) {
      return $$2.d($$0, $$1, ir.b) || $$2.a(dcx.hc);
   }

   private void a(czu $$0, im $$1, dpy $$2) {
      int $$3 = this.a($$0, $$1);
      if ($$2.c(f) != $$3) {
         if ($$0.a_($$1) == $$2) {
            $$0.a($$1, $$2.a(f, Integer.valueOf($$3)), 2);
         }

         Set<im> $$4 = Sets.newHashSet();
         $$4.add($$1);

         for (ir $$5 : ir.values()) {
            $$4.add($$1.a($$5));
         }

         for (im $$6 : $$4) {
            $$0.a($$6, this);
         }
      }
   }

   private int a(czu $$0, im $$1) {
      this.J = false;
      int $$2 = $$0.D($$1);
      this.J = true;
      int $$3 = 0;
      if ($$2 < 15) {
         for (ir $$4 : ir.c.a) {
            im $$5 = $$1.a($$4);
            dpy $$6 = $$0.a_($$5);
            $$3 = Math.max($$3, this.q($$6));
            im $$7 = $$1.c();
            if ($$6.g($$0, $$5) && !$$0.a_($$7).g($$0, $$7)) {
               $$3 = Math.max($$3, this.q($$0.a_($$5.c())));
            } else if (!$$6.g($$0, $$5)) {
               $$3 = Math.max($$3, this.q($$0.a_($$5.d())));
            }
         }
      }

      return Math.max($$2, $$3 - 1);
   }

   private int q(dpy $$0) {
      return $$0.a(this) ? $$0.c(f) : 0;
   }

   private void b(czu $$0, im $$1) {
      if ($$0.a_($$1).a(this)) {
         $$0.a($$1, this);

         for (ir $$2 : ir.values()) {
            $$0.a($$1.a($$2), this);
         }
      }
   }

   @Override
   protected void b(dpy $$0, czu $$1, im $$2, dpy $$3, boolean $$4) {
      if (!$$3.a($$0.b()) && !$$1.B) {
         this.a($$1, $$2, $$0);

         for (ir $$5 : ir.c.b) {
            $$1.a($$2.a($$5), this);
         }

         this.c($$1, $$2);
      }
   }

   @Override
   protected void a(dpy $$0, czu $$1, im $$2, dpy $$3, boolean $$4) {
      if (!$$4 && !$$0.a($$3.b())) {
         super.a($$0, $$1, $$2, $$3, $$4);
         if (!$$1.B) {
            for (ir $$5 : ir.values()) {
               $$1.a($$2.a($$5), this);
            }

            this.a($$1, $$2, $$0);
            this.c($$1, $$2);
         }
      }
   }

   private void c(czu $$0, im $$1) {
      for (ir $$2 : ir.c.a) {
         this.b($$0, $$1.a($$2));
      }

      for (ir $$3 : ir.c.a) {
         im $$4 = $$1.a($$3);
         if ($$0.a_($$4).g($$0, $$4)) {
            this.b($$0, $$4.c());
         } else {
            this.b($$0, $$4.d());
         }
      }
   }

   @Override
   protected void a(dpy $$0, czu $$1, im $$2, dcv $$3, im $$4, boolean $$5) {
      if (!$$1.B) {
         if ($$0.a((czx)$$1, $$2)) {
            this.a($$1, $$2, $$0);
         } else {
            c($$0, $$1, $$2);
            $$1.a($$2, false);
         }
      }
   }

   @Override
   protected int b(dpy $$0, cza $$1, im $$2, ir $$3) {
      return !this.J ? 0 : $$0.b($$1, $$2, $$3);
   }

   @Override
   protected int a(dpy $$0, cza $$1, im $$2, ir $$3) {
      if (this.J && $$3 != ir.a) {
         int $$4 = $$0.c(f);
         if ($$4 == 0) {
            return 0;
         } else {
            return $$3 != ir.b && !this.a($$1, $$0, $$2).c(g.get($$3.g())).a() ? 0 : $$4;
         }
      } else {
         return 0;
      }
   }

   protected static boolean m(dpy $$0) {
      return a($$0, null);
   }

   protected static boolean a(dpy $$0, @Nullable ir $$1) {
      if ($$0.a(dcx.cw)) {
         return true;
      } else if ($$0.a(dcx.eh)) {
         ir $$2 = $$0.c(djc.aE);
         return $$2 == $$1 || $$2.g() == $$1;
      } else {
         return $$0.a(dcx.kO) ? $$1 == $$0.c(dig.a) : $$0.m() && $$1 != null;
      }
   }

   @Override
   protected boolean f_(dpy $$0) {
      return this.J;
   }

   public static int b(int $$0) {
      etf $$1 = G[$$0];
      return axw.f((float)$$1.a(), (float)$$1.b(), (float)$$1.c());
   }

   private void a(czu $$0, ayd $$1, im $$2, etf $$3, ir $$4, ir $$5, float $$6, float $$7) {
      float $$8 = $$7 - $$6;
      if (!($$1.i() >= 0.2F * $$8)) {
         float $$9 = 0.4375F;
         float $$10 = $$6 + $$8 * $$1.i();
         double $$11 = 0.5 + (double)(0.4375F * (float)$$4.j()) + (double)($$10 * (float)$$5.j());
         double $$12 = 0.5 + (double)(0.4375F * (float)$$4.k()) + (double)($$10 * (float)$$5.k());
         double $$13 = 0.5 + (double)(0.4375F * (float)$$4.l()) + (double)($$10 * (float)$$5.l());
         $$0.a(new kq($$3.j(), 1.0F), (double)$$2.u() + $$11, (double)$$2.v() + $$12, (double)$$2.w() + $$13, 0.0, 0.0, 0.0);
      }
   }

   @Override
   public void a(dpy $$0, czu $$1, im $$2, ayd $$3) {
      int $$4 = $$0.c(f);
      if ($$4 != 0) {
         for (ir $$5 : ir.c.a) {
            drd $$6 = $$0.c(g.get($$5));
            switch ($$6) {
               case a:
                  this.a($$1, $$3, $$2, G[$$4], $$5, ir.b, -0.5F, 0.5F);
               case b:
                  this.a($$1, $$3, $$2, G[$$4], ir.a, $$5, 0.0F, 0.5F);
                  break;
               case c:
               default:
                  this.a($$1, $$3, $$2, G[$$4], ir.a, $$5, 0.0F, 0.3F);
            }
         }
      }
   }

   @Override
   protected dpy a(dpy $$0, dji $$1) {
      switch ($$1) {
         case c:
            return $$0.a(b, $$0.c(d)).a(c, $$0.c(e)).a(d, $$0.c(b)).a(e, $$0.c(c));
         case d:
            return $$0.a(b, $$0.c(c)).a(c, $$0.c(d)).a(d, $$0.c(e)).a(e, $$0.c(b));
         case b:
            return $$0.a(b, $$0.c(e)).a(c, $$0.c(b)).a(d, $$0.c(c)).a(e, $$0.c(d));
         default:
            return $$0;
      }
   }

   @Override
   protected dpy a(dpy $$0, dhs $$1) {
      switch ($$1) {
         case b:
            return $$0.a(b, $$0.c(d)).a(d, $$0.c(b));
         case c:
            return $$0.a(c, $$0.c(e)).a(e, $$0.c(c));
         default:
            return super.a($$0, $$1);
      }
   }

   @Override
   protected void a(dpz.a<dcv, dpy> $$0) {
      $$0.a(b, c, d, e, f);
   }

   @Override
   protected boq a(dpy $$0, czu $$1, im $$2, ckl $$3, etb $$4) {
      if (!$$3.gb().e) {
         return boq.d;
      } else {
         if (o($$0) || p($$0)) {
            dpy $$5 = o($$0) ? this.n() : this.I;
            $$5 = $$5.a(f, $$0.c(f));
            $$5 = this.a($$1, $$5, $$2);
            if ($$5 != $$0) {
               $$1.a($$2, $$5, 3);
               this.a($$1, $$2, $$0, $$5);
               return boq.a;
            }
         }

         return boq.d;
      }
   }

   private void a(czu $$0, im $$1, dpy $$2, dpy $$3) {
      for (ir $$4 : ir.c.a) {
         im $$5 = $$1.a($$4);
         if ($$2.c(g.get($$4)).a() != $$3.c(g.get($$4)).a() && $$0.a_($$5).g($$0, $$5)) {
            $$0.a($$5, $$3.b(), $$4.g());
         }
      }
   }
}
