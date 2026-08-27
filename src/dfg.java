import com.google.common.collect.ImmutableMap;
import com.google.common.collect.Maps;
import com.google.common.collect.Sets;
import com.google.common.collect.UnmodifiableIterator;
import com.mojang.serialization.MapCodec;
import java.util.Map;
import java.util.Set;
import javax.annotation.Nullable;

public class dfg extends czf {
   public static final MapCodec<dfg> a = b(dfg::new);
   public static final dnc<dnj> b = dmu.ab;
   public static final dnc<dnj> c = dmu.aa;
   public static final dnc<dnj> d = dmu.ac;
   public static final dnc<dnj> e = dmu.ad;
   public static final dne f = dmu.aT;
   public static final Map<ih, dnc<dnj>> g = Maps.newEnumMap(ImmutableMap.of(ih.c, b, ih.f, c, ih.d, d, ih.e, e));
   protected static final int h = 1;
   protected static final int i = 3;
   protected static final int j = 13;
   protected static final int k = 3;
   protected static final int l = 13;
   private static final epo m = czf.a(3.0, 0.0, 3.0, 13.0, 1.0, 13.0);
   private static final Map<ih, epo> n = Maps.newEnumMap(
      ImmutableMap.of(
         ih.c,
         czf.a(3.0, 0.0, 0.0, 13.0, 1.0, 13.0),
         ih.d,
         czf.a(3.0, 0.0, 3.0, 13.0, 1.0, 16.0),
         ih.f,
         czf.a(3.0, 0.0, 3.0, 16.0, 1.0, 13.0),
         ih.e,
         czf.a(0.0, 0.0, 3.0, 13.0, 1.0, 13.0)
      )
   );
   private static final Map<ih, epo> o = Maps.newEnumMap(
      ImmutableMap.of(
         ih.c,
         epl.a(n.get(ih.c), czf.a(3.0, 0.0, 0.0, 13.0, 16.0, 1.0)),
         ih.d,
         epl.a(n.get(ih.d), czf.a(3.0, 0.0, 15.0, 13.0, 16.0, 16.0)),
         ih.f,
         epl.a(n.get(ih.f), czf.a(15.0, 0.0, 3.0, 16.0, 16.0, 13.0)),
         ih.e,
         epl.a(n.get(ih.e), czf.a(0.0, 0.0, 3.0, 1.0, 16.0, 13.0))
      )
   );
   private static final Map<dme, epo> F = Maps.newHashMap();
   private static final eov[] G = ac.a(new eov[16], $$0 -> {
      for (int $$1 = 0; $$1 <= 15; $$1++) {
         float $$2 = (float)$$1 / 15.0F;
         float $$3 = $$2 * 0.6F + ($$2 > 0.0F ? 0.4F : 0.3F);
         float $$4 = awm.a($$2 * $$2 * 0.7F - 0.5F, 0.0F, 1.0F);
         float $$5 = awm.a($$2 * $$2 * 0.6F - 0.7F, 0.0F, 1.0F);
         $$0[$$1] = new eov((double)$$3, (double)$$4, (double)$$5);
      }
   });
   private static final float H = 0.2F;
   private final dme I;
   private boolean J = true;

   @Override
   public MapCodec<dfg> a() {
      return a;
   }

   public dfg(dmd.d $$0) {
      super($$0);
      this.k(this.E.b().a(b, dnj.c).a(c, dnj.c).a(d, dnj.c).a(e, dnj.c).a(f, Integer.valueOf(0)));
      this.I = this.o().a(b, dnj.b).a(c, dnj.b).a(d, dnj.b).a(e, dnj.b);
      UnmodifiableIterator var2 = this.n().a().iterator();

      while (var2.hasNext()) {
         dme $$1 = (dme)var2.next();
         if ($$1.c(f) == 0) {
            F.put($$1, this.n($$1));
         }
      }
   }

   private epo n(dme $$0) {
      epo $$1 = m;

      for (ih $$2 : ih.c.a) {
         dnj $$3 = $$0.c(g.get($$2));
         if ($$3 == dnj.b) {
            $$1 = epl.a($$1, n.get($$2));
         } else if ($$3 == dnj.a) {
            $$1 = epl.a($$1, o.get($$2));
         }
      }

      return $$1;
   }

   @Override
   protected epo a(dme $$0, cvk $$1, ib $$2, epa $$3) {
      return F.get($$0.a(f, Integer.valueOf(0)));
   }

   @Override
   public dme a(crx $$0) {
      return this.a($$0.q(), this.I, $$0.a());
   }

   private dme a(cvk $$0, dme $$1, ib $$2) {
      boolean $$3 = p($$1);
      $$1 = this.b($$0, this.o().a(f, $$1.c(f)), $$2);
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
            $$1 = $$1.a(e, dnj.b);
         }

         if (!$$6 && $$8) {
            $$1 = $$1.a(c, dnj.b);
         }

         if (!$$4 && $$9) {
            $$1 = $$1.a(b, dnj.b);
         }

         if (!$$5 && $$9) {
            $$1 = $$1.a(d, dnj.b);
         }

         return $$1;
      }
   }

   private dme b(cvk $$0, dme $$1, ib $$2) {
      boolean $$3 = !$$0.a_($$2.c()).g($$0, $$2);

      for (ih $$4 : ih.c.a) {
         if (!$$1.c(g.get($$4)).a()) {
            dnj $$5 = this.a($$0, $$2, $$4, $$3);
            $$1 = $$1.a(g.get($$4), $$5);
         }
      }

      return $$1;
   }

   @Override
   protected dme a(dme $$0, ih $$1, dme $$2, cwf $$3, ib $$4, ib $$5) {
      if ($$1 == ih.a) {
         return !this.a($$3, $$5, $$2) ? czh.a.o() : $$0;
      } else if ($$1 == ih.b) {
         return this.a($$3, $$0, $$4);
      } else {
         dnj $$6 = this.a($$3, $$4, $$1);
         return $$6.a() == $$0.c(g.get($$1)).a() && !o($$0) ? $$0.a(g.get($$1), $$6) : this.a($$3, this.I.a(f, $$0.c(f)).a(g.get($$1), $$6), $$4);
      }
   }

   private static boolean o(dme $$0) {
      return $$0.c(b).a() && $$0.c(d).a() && $$0.c(c).a() && $$0.c(e).a();
   }

   private static boolean p(dme $$0) {
      return !$$0.c(b).a() && !$$0.c(d).a() && !$$0.c(c).a() && !$$0.c(e).a();
   }

   @Override
   protected void a(dme $$0, cwf $$1, ib $$2, int $$3, int $$4) {
      ib.a $$5 = new ib.a();

      for (ih $$6 : ih.c.a) {
         dnj $$7 = $$0.c(g.get($$6));
         if ($$7 != dnj.c && !$$1.a_($$5.a($$2, $$6)).a(this)) {
            $$5.c(ih.a);
            dme $$8 = $$1.a_($$5);
            if ($$8.a(this)) {
               ib $$9 = $$5.a($$6.g());
               $$1.a($$6.g(), $$1.a_($$9), $$5, $$9, $$3, $$4);
            }

            $$5.a($$2, $$6).c(ih.b);
            dme $$10 = $$1.a_($$5);
            if ($$10.a(this)) {
               ib $$11 = $$5.a($$6.g());
               $$1.a($$6.g(), $$1.a_($$11), $$5, $$11, $$3, $$4);
            }
         }
      }
   }

   private dnj a(cvk $$0, ib $$1, ih $$2) {
      return this.a($$0, $$1, $$2, !$$0.a_($$1.c()).g($$0, $$1));
   }

   private dnj a(cvk $$0, ib $$1, ih $$2, boolean $$3) {
      ib $$4 = $$1.a($$2);
      dme $$5 = $$0.a_($$4);
      if ($$3) {
         boolean $$6 = $$5.b() instanceof dhr || this.a($$0, $$4, $$5);
         if ($$6 && m($$0.a_($$4.c()))) {
            if ($$5.d($$0, $$4, $$2.g())) {
               return dnj.a;
            }

            return dnj.b;
         }
      }

      return !a($$5, $$2) && ($$5.g($$0, $$4) || !m($$0.a_($$4.d()))) ? dnj.c : dnj.b;
   }

   @Override
   protected boolean a(dme $$0, cwh $$1, ib $$2) {
      ib $$3 = $$2.d();
      dme $$4 = $$1.a_($$3);
      return this.a($$1, $$3, $$4);
   }

   private boolean a(cvk $$0, ib $$1, dme $$2) {
      return $$2.d($$0, $$1, ih.b) || $$2.a(czh.hc);
   }

   private void a(cwe $$0, ib $$1, dme $$2) {
      int $$3 = this.a($$0, $$1);
      if ($$2.c(f) != $$3) {
         if ($$0.a_($$1) == $$2) {
            $$0.a($$1, $$2.a(f, Integer.valueOf($$3)), 2);
         }

         Set<ib> $$4 = Sets.newHashSet();
         $$4.add($$1);

         for (ih $$5 : ih.values()) {
            $$4.add($$1.a($$5));
         }

         for (ib $$6 : $$4) {
            $$0.a($$6, this);
         }
      }
   }

   private int a(cwe $$0, ib $$1) {
      this.J = false;
      int $$2 = $$0.D($$1);
      this.J = true;
      int $$3 = 0;
      if ($$2 < 15) {
         for (ih $$4 : ih.c.a) {
            ib $$5 = $$1.a($$4);
            dme $$6 = $$0.a_($$5);
            $$3 = Math.max($$3, this.q($$6));
            ib $$7 = $$1.c();
            if ($$6.g($$0, $$5) && !$$0.a_($$7).g($$0, $$7)) {
               $$3 = Math.max($$3, this.q($$0.a_($$5.c())));
            } else if (!$$6.g($$0, $$5)) {
               $$3 = Math.max($$3, this.q($$0.a_($$5.d())));
            }
         }
      }

      return Math.max($$2, $$3 - 1);
   }

   private int q(dme $$0) {
      return $$0.a(this) ? $$0.c(f) : 0;
   }

   private void b(cwe $$0, ib $$1) {
      if ($$0.a_($$1).a(this)) {
         $$0.a($$1, this);

         for (ih $$2 : ih.values()) {
            $$0.a($$1.a($$2), this);
         }
      }
   }

   @Override
   protected void b(dme $$0, cwe $$1, ib $$2, dme $$3, boolean $$4) {
      if (!$$3.a($$0.b()) && !$$1.B) {
         this.a($$1, $$2, $$0);

         for (ih $$5 : ih.c.b) {
            $$1.a($$2.a($$5), this);
         }

         this.c($$1, $$2);
      }
   }

   @Override
   protected void a(dme $$0, cwe $$1, ib $$2, dme $$3, boolean $$4) {
      if (!$$4 && !$$0.a($$3.b())) {
         super.a($$0, $$1, $$2, $$3, $$4);
         if (!$$1.B) {
            for (ih $$5 : ih.values()) {
               $$1.a($$2.a($$5), this);
            }

            this.a($$1, $$2, $$0);
            this.c($$1, $$2);
         }
      }
   }

   private void c(cwe $$0, ib $$1) {
      for (ih $$2 : ih.c.a) {
         this.b($$0, $$1.a($$2));
      }

      for (ih $$3 : ih.c.a) {
         ib $$4 = $$1.a($$3);
         if ($$0.a_($$4).g($$0, $$4)) {
            this.b($$0, $$4.c());
         } else {
            this.b($$0, $$4.d());
         }
      }
   }

   @Override
   protected void a(dme $$0, cwe $$1, ib $$2, czf $$3, ib $$4, boolean $$5) {
      if (!$$1.B) {
         if ($$0.a((cwh)$$1, $$2)) {
            this.a($$1, $$2, $$0);
         } else {
            c($$0, $$1, $$2);
            $$1.a($$2, false);
         }
      }
   }

   @Override
   protected int b(dme $$0, cvk $$1, ib $$2, ih $$3) {
      return !this.J ? 0 : $$0.b($$1, $$2, $$3);
   }

   @Override
   protected int a(dme $$0, cvk $$1, ib $$2, ih $$3) {
      if (this.J && $$3 != ih.a) {
         int $$4 = $$0.c(f);
         if ($$4 == 0) {
            return 0;
         } else {
            return $$3 != ih.b && !this.a($$1, $$0, $$2).c(g.get($$3.g())).a() ? 0 : $$4;
         }
      } else {
         return 0;
      }
   }

   protected static boolean m(dme $$0) {
      return a($$0, null);
   }

   protected static boolean a(dme $$0, @Nullable ih $$1) {
      if ($$0.a(czh.cw)) {
         return true;
      } else if ($$0.a(czh.eh)) {
         ih $$2 = $$0.c(dfl.aE);
         return $$2 == $$1 || $$2.g() == $$1;
      } else {
         return $$0.a(czh.kO) ? $$1 == $$0.c(dep.a) : $$0.m() && $$1 != null;
      }
   }

   @Override
   protected boolean f_(dme $$0) {
      return this.J;
   }

   public static int b(int $$0) {
      eov $$1 = G[$$0];
      return awm.f((float)$$1.a(), (float)$$1.b(), (float)$$1.c());
   }

   private void a(cwe $$0, awt $$1, ib $$2, eov $$3, ih $$4, ih $$5, float $$6, float $$7) {
      float $$8 = $$7 - $$6;
      if (!($$1.i() >= 0.2F * $$8)) {
         float $$9 = 0.4375F;
         float $$10 = $$6 + $$8 * $$1.i();
         double $$11 = 0.5 + (double)(0.4375F * (float)$$4.j()) + (double)($$10 * (float)$$5.j());
         double $$12 = 0.5 + (double)(0.4375F * (float)$$4.k()) + (double)($$10 * (float)$$5.k());
         double $$13 = 0.5 + (double)(0.4375F * (float)$$4.l()) + (double)($$10 * (float)$$5.l());
         $$0.a(new jv($$3.j(), 1.0F), (double)$$2.u() + $$11, (double)$$2.v() + $$12, (double)$$2.w() + $$13, 0.0, 0.0, 0.0);
      }
   }

   @Override
   public void a(dme $$0, cwe $$1, ib $$2, awt $$3) {
      int $$4 = $$0.c(f);
      if ($$4 != 0) {
         for (ih $$5 : ih.c.a) {
            dnj $$6 = $$0.c(g.get($$5));
            switch ($$6) {
               case a:
                  this.a($$1, $$3, $$2, G[$$4], $$5, ih.b, -0.5F, 0.5F);
               case b:
                  this.a($$1, $$3, $$2, G[$$4], ih.a, $$5, 0.0F, 0.5F);
                  break;
               case c:
               default:
                  this.a($$1, $$3, $$2, G[$$4], ih.a, $$5, 0.0F, 0.3F);
            }
         }
      }
   }

   @Override
   protected dme a(dme $$0, dfr $$1) {
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
   protected dme a(dme $$0, deb $$1) {
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
   protected void a(dmf.a<czf, dme> $$0) {
      $$0.a(b, c, d, e, f);
   }

   @Override
   protected bml a(dme $$0, cwe $$1, ib $$2, cia $$3, eor $$4) {
      if (!$$3.fW().e) {
         return bml.d;
      } else {
         if (o($$0) || p($$0)) {
            dme $$5 = o($$0) ? this.o() : this.I;
            $$5 = $$5.a(f, $$0.c(f));
            $$5 = this.a($$1, $$5, $$2);
            if ($$5 != $$0) {
               $$1.a($$2, $$5, 3);
               this.a($$1, $$2, $$0, $$5);
               return bml.a;
            }
         }

         return bml.d;
      }
   }

   private void a(cwe $$0, ib $$1, dme $$2, dme $$3) {
      for (ih $$4 : ih.c.a) {
         ib $$5 = $$1.a($$4);
         if ($$2.c(g.get($$4)).a() != $$3.c(g.get($$4)).a() && $$0.a_($$5).g($$0, $$5)) {
            $$0.a($$5, $$3.b(), $$4.g());
         }
      }
   }
}
