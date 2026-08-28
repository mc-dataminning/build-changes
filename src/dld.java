import com.google.common.collect.ImmutableMap;
import com.google.common.collect.Maps;
import com.google.common.collect.Sets;
import com.google.common.collect.UnmodifiableIterator;
import com.mojang.serialization.MapCodec;
import java.util.Map;
import java.util.Set;
import javax.annotation.Nullable;

public class dld extends dfb {
   public static final MapCodec<dld> a = b(dld::new);
   public static final dtc<dtj> b = dsu.ab;
   public static final dtc<dtj> c = dsu.aa;
   public static final dtc<dtj> d = dsu.ac;
   public static final dtc<dtj> e = dsu.ad;
   public static final dte f = dsu.aT;
   public static final Map<je, dtc<dtj>> g = Maps.newEnumMap(ImmutableMap.of(je.c, b, je.f, c, je.d, d, je.e, e));
   protected static final int h = 1;
   protected static final int i = 3;
   protected static final int j = 13;
   protected static final int k = 3;
   protected static final int l = 13;
   private static final ewm m = dfb.a(3.0, 0.0, 3.0, 13.0, 1.0, 13.0);
   private static final Map<je, ewm> n = Maps.newEnumMap(
      ImmutableMap.of(
         je.c,
         dfb.a(3.0, 0.0, 0.0, 13.0, 1.0, 13.0),
         je.d,
         dfb.a(3.0, 0.0, 3.0, 13.0, 1.0, 16.0),
         je.f,
         dfb.a(3.0, 0.0, 3.0, 16.0, 1.0, 13.0),
         je.e,
         dfb.a(0.0, 0.0, 3.0, 13.0, 1.0, 13.0)
      )
   );
   private static final Map<je, ewm> o = Maps.newEnumMap(
      ImmutableMap.of(
         je.c,
         ewj.a(n.get(je.c), dfb.a(3.0, 0.0, 0.0, 13.0, 16.0, 1.0)),
         je.d,
         ewj.a(n.get(je.d), dfb.a(3.0, 0.0, 15.0, 13.0, 16.0, 16.0)),
         je.f,
         ewj.a(n.get(je.f), dfb.a(15.0, 0.0, 3.0, 16.0, 16.0, 13.0)),
         je.e,
         ewj.a(n.get(je.e), dfb.a(0.0, 0.0, 3.0, 1.0, 16.0, 13.0))
      )
   );
   private static final Map<dse, ewm> F = Maps.newHashMap();
   private static final evt[] G = ac.a(new evt[16], $$0 -> {
      for (int $$1 = 0; $$1 <= 15; $$1++) {
         float $$2 = (float)$$1 / 15.0F;
         float $$3 = $$2 * 0.6F + ($$2 > 0.0F ? 0.4F : 0.3F);
         float $$4 = ayz.a($$2 * $$2 * 0.7F - 0.5F, 0.0F, 1.0F);
         float $$5 = ayz.a($$2 * $$2 * 0.6F - 0.7F, 0.0F, 1.0F);
         $$0[$$1] = new evt((double)$$3, (double)$$4, (double)$$5);
      }
   });
   private static final float H = 0.2F;
   private final dse I;
   private boolean J = true;

   @Override
   public MapCodec<dld> a() {
      return a;
   }

   public dld(dsd.d $$0) {
      super($$0);
      this.k(this.E.b().a(b, dtj.c).a(c, dtj.c).a(d, dtj.c).a(e, dtj.c).a(f, Integer.valueOf(0)));
      this.I = this.o().a(b, dtj.b).a(c, dtj.b).a(d, dtj.b).a(e, dtj.b);
      UnmodifiableIterator var2 = this.l().a().iterator();

      while (var2.hasNext()) {
         dse $$1 = (dse)var2.next();
         if ($$1.c(f) == 0) {
            F.put($$1, this.n($$1));
         }
      }
   }

   private ewm n(dse $$0) {
      ewm $$1 = m;

      for (je $$2 : je.c.a) {
         dtj $$3 = $$0.c(g.get($$2));
         if ($$3 == dtj.b) {
            $$1 = ewj.a($$1, n.get($$2));
         } else if ($$3 == dtj.a) {
            $$1 = ewj.a($$1, o.get($$2));
         }
      }

      return $$1;
   }

   @Override
   protected ewm a(dse $$0, dbg $$1, iz $$2, evy $$3) {
      return F.get($$0.a(f, Integer.valueOf(0)));
   }

   @Override
   public dse a(cyc $$0) {
      return this.a($$0.q(), this.I, $$0.a());
   }

   private dse a(dbg $$0, dse $$1, iz $$2) {
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
            $$1 = $$1.a(e, dtj.b);
         }

         if (!$$6 && $$8) {
            $$1 = $$1.a(c, dtj.b);
         }

         if (!$$4 && $$9) {
            $$1 = $$1.a(b, dtj.b);
         }

         if (!$$5 && $$9) {
            $$1 = $$1.a(d, dtj.b);
         }

         return $$1;
      }
   }

   private dse b(dbg $$0, dse $$1, iz $$2) {
      boolean $$3 = !$$0.a_($$2.c()).g($$0, $$2);

      for (je $$4 : je.c.a) {
         if (!$$1.c(g.get($$4)).a()) {
            dtj $$5 = this.a($$0, $$2, $$4, $$3);
            $$1 = $$1.a(g.get($$4), $$5);
         }
      }

      return $$1;
   }

   @Override
   protected dse a(dse $$0, je $$1, dse $$2, dcb $$3, iz $$4, iz $$5) {
      if ($$1 == je.a) {
         return !this.a($$3, $$5, $$2) ? dfd.a.o() : $$0;
      } else if ($$1 == je.b) {
         return this.a($$3, $$0, $$4);
      } else {
         dtj $$6 = this.a($$3, $$4, $$1);
         return $$6.a() == $$0.c(g.get($$1)).a() && !o($$0) ? $$0.a(g.get($$1), $$6) : this.a($$3, this.I.a(f, $$0.c(f)).a(g.get($$1), $$6), $$4);
      }
   }

   private static boolean o(dse $$0) {
      return $$0.c(b).a() && $$0.c(d).a() && $$0.c(c).a() && $$0.c(e).a();
   }

   private static boolean p(dse $$0) {
      return !$$0.c(b).a() && !$$0.c(d).a() && !$$0.c(c).a() && !$$0.c(e).a();
   }

   @Override
   protected void a(dse $$0, dcb $$1, iz $$2, int $$3, int $$4) {
      iz.a $$5 = new iz.a();

      for (je $$6 : je.c.a) {
         dtj $$7 = $$0.c(g.get($$6));
         if ($$7 != dtj.c && !$$1.a_($$5.a($$2, $$6)).a(this)) {
            $$5.c(je.a);
            dse $$8 = $$1.a_($$5);
            if ($$8.a(this)) {
               iz $$9 = $$5.a($$6.g());
               $$1.a($$6.g(), $$1.a_($$9), $$5, $$9, $$3, $$4);
            }

            $$5.a($$2, $$6).c(je.b);
            dse $$10 = $$1.a_($$5);
            if ($$10.a(this)) {
               iz $$11 = $$5.a($$6.g());
               $$1.a($$6.g(), $$1.a_($$11), $$5, $$11, $$3, $$4);
            }
         }
      }
   }

   private dtj a(dbg $$0, iz $$1, je $$2) {
      return this.a($$0, $$1, $$2, !$$0.a_($$1.c()).g($$0, $$1));
   }

   private dtj a(dbg $$0, iz $$1, je $$2, boolean $$3) {
      iz $$4 = $$1.a($$2);
      dse $$5 = $$0.a_($$4);
      if ($$3) {
         boolean $$6 = $$5.b() instanceof dno || this.a($$0, $$4, $$5);
         if ($$6 && m($$0.a_($$4.c()))) {
            if ($$5.d($$0, $$4, $$2.g())) {
               return dtj.a;
            }

            return dtj.b;
         }
      }

      return !a($$5, $$2) && ($$5.g($$0, $$4) || !m($$0.a_($$4.d()))) ? dtj.c : dtj.b;
   }

   @Override
   protected boolean a(dse $$0, dcd $$1, iz $$2) {
      iz $$3 = $$2.d();
      dse $$4 = $$1.a_($$3);
      return this.a($$1, $$3, $$4);
   }

   private boolean a(dbg $$0, iz $$1, dse $$2) {
      return $$2.d($$0, $$1, je.b) || $$2.a(dfd.hc);
   }

   private void a(dca $$0, iz $$1, dse $$2) {
      int $$3 = this.a($$0, $$1);
      if ($$2.c(f) != $$3) {
         if ($$0.a_($$1) == $$2) {
            $$0.a($$1, $$2.a(f, Integer.valueOf($$3)), 2);
         }

         Set<iz> $$4 = Sets.newHashSet();
         $$4.add($$1);

         for (je $$5 : je.values()) {
            $$4.add($$1.a($$5));
         }

         for (iz $$6 : $$4) {
            $$0.a($$6, this);
         }
      }
   }

   private int a(dca $$0, iz $$1) {
      this.J = false;
      int $$2 = $$0.D($$1);
      this.J = true;
      int $$3 = 0;
      if ($$2 < 15) {
         for (je $$4 : je.c.a) {
            iz $$5 = $$1.a($$4);
            dse $$6 = $$0.a_($$5);
            $$3 = Math.max($$3, this.q($$6));
            iz $$7 = $$1.c();
            if ($$6.g($$0, $$5) && !$$0.a_($$7).g($$0, $$7)) {
               $$3 = Math.max($$3, this.q($$0.a_($$5.c())));
            } else if (!$$6.g($$0, $$5)) {
               $$3 = Math.max($$3, this.q($$0.a_($$5.d())));
            }
         }
      }

      return Math.max($$2, $$3 - 1);
   }

   private int q(dse $$0) {
      return $$0.a(this) ? $$0.c(f) : 0;
   }

   private void b(dca $$0, iz $$1) {
      if ($$0.a_($$1).a(this)) {
         $$0.a($$1, this);

         for (je $$2 : je.values()) {
            $$0.a($$1.a($$2), this);
         }
      }
   }

   @Override
   protected void b(dse $$0, dca $$1, iz $$2, dse $$3, boolean $$4) {
      if (!$$3.a($$0.b()) && !$$1.B) {
         this.a($$1, $$2, $$0);

         for (je $$5 : je.c.b) {
            $$1.a($$2.a($$5), this);
         }

         this.c($$1, $$2);
      }
   }

   @Override
   protected void a(dse $$0, dca $$1, iz $$2, dse $$3, boolean $$4) {
      if (!$$4 && !$$0.a($$3.b())) {
         super.a($$0, $$1, $$2, $$3, $$4);
         if (!$$1.B) {
            for (je $$5 : je.values()) {
               $$1.a($$2.a($$5), this);
            }

            this.a($$1, $$2, $$0);
            this.c($$1, $$2);
         }
      }
   }

   private void c(dca $$0, iz $$1) {
      for (je $$2 : je.c.a) {
         this.b($$0, $$1.a($$2));
      }

      for (je $$3 : je.c.a) {
         iz $$4 = $$1.a($$3);
         if ($$0.a_($$4).g($$0, $$4)) {
            this.b($$0, $$4.c());
         } else {
            this.b($$0, $$4.d());
         }
      }
   }

   @Override
   protected void a(dse $$0, dca $$1, iz $$2, dfb $$3, iz $$4, boolean $$5) {
      if (!$$1.B) {
         if ($$0.a((dcd)$$1, $$2)) {
            this.a($$1, $$2, $$0);
         } else {
            c($$0, $$1, $$2);
            $$1.a($$2, false);
         }
      }
   }

   @Override
   protected int b(dse $$0, dbg $$1, iz $$2, je $$3) {
      return !this.J ? 0 : $$0.b($$1, $$2, $$3);
   }

   @Override
   protected int a(dse $$0, dbg $$1, iz $$2, je $$3) {
      if (this.J && $$3 != je.a) {
         int $$4 = $$0.c(f);
         if ($$4 == 0) {
            return 0;
         } else {
            return $$3 != je.b && !this.a($$1, $$0, $$2).c(g.get($$3.g())).a() ? 0 : $$4;
         }
      } else {
         return 0;
      }
   }

   protected static boolean m(dse $$0) {
      return a($$0, null);
   }

   protected static boolean a(dse $$0, @Nullable je $$1) {
      if ($$0.a(dfd.cw)) {
         return true;
      } else if ($$0.a(dfd.eh)) {
         je $$2 = $$0.c(dli.aE);
         return $$2 == $$1 || $$2.g() == $$1;
      } else {
         return $$0.a(dfd.kO) ? $$1 == $$0.c(dkm.a) : $$0.m() && $$1 != null;
      }
   }

   @Override
   protected boolean e_(dse $$0) {
      return this.J;
   }

   public static int b(int $$0) {
      evt $$1 = G[$$0];
      return ayz.f((float)$$1.a(), (float)$$1.b(), (float)$$1.c());
   }

   private void a(dca $$0, azh $$1, iz $$2, evt $$3, je $$4, je $$5, float $$6, float $$7) {
      float $$8 = $$7 - $$6;
      if (!($$1.i() >= 0.2F * $$8)) {
         float $$9 = 0.4375F;
         float $$10 = $$6 + $$8 * $$1.i();
         double $$11 = 0.5 + (double)(0.4375F * (float)$$4.j()) + (double)($$10 * (float)$$5.j());
         double $$12 = 0.5 + (double)(0.4375F * (float)$$4.k()) + (double)($$10 * (float)$$5.k());
         double $$13 = 0.5 + (double)(0.4375F * (float)$$4.l()) + (double)($$10 * (float)$$5.l());
         $$0.a(new ld($$3.j(), 1.0F), (double)$$2.u() + $$11, (double)$$2.v() + $$12, (double)$$2.w() + $$13, 0.0, 0.0, 0.0);
      }
   }

   @Override
   public void a(dse $$0, dca $$1, iz $$2, azh $$3) {
      int $$4 = $$0.c(f);
      if ($$4 != 0) {
         for (je $$5 : je.c.a) {
            dtj $$6 = $$0.c(g.get($$5));
            switch ($$6) {
               case a:
                  this.a($$1, $$3, $$2, G[$$4], $$5, je.b, -0.5F, 0.5F);
               case b:
                  this.a($$1, $$3, $$2, G[$$4], je.a, $$5, 0.0F, 0.5F);
                  break;
               case c:
               default:
                  this.a($$1, $$3, $$2, G[$$4], je.a, $$5, 0.0F, 0.3F);
            }
         }
      }
   }

   @Override
   protected dse a(dse $$0, dlo $$1) {
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
   protected dse a(dse $$0, djy $$1) {
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
   protected void a(dsf.a<dfb, dse> $$0) {
      $$0.a(b, c, d, e, f);
   }

   @Override
   protected bqw a(dse $$0, dca $$1, iz $$2, cmz $$3, evp $$4) {
      if (!$$3.gd().e) {
         return bqw.e;
      } else {
         if (o($$0) || p($$0)) {
            dse $$5 = o($$0) ? this.o() : this.I;
            $$5 = $$5.a(f, $$0.c(f));
            $$5 = this.a($$1, $$5, $$2);
            if ($$5 != $$0) {
               $$1.a($$2, $$5, 3);
               this.a($$1, $$2, $$0, $$5);
               return bqw.a;
            }
         }

         return bqw.e;
      }
   }

   private void a(dca $$0, iz $$1, dse $$2, dse $$3) {
      for (je $$4 : je.c.a) {
         iz $$5 = $$1.a($$4);
         if ($$2.c(g.get($$4)).a() != $$3.c(g.get($$4)).a() && $$0.a_($$5).g($$0, $$5)) {
            $$0.a($$5, $$3.b(), $$4.g());
         }
      }
   }
}
