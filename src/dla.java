import com.google.common.collect.ImmutableMap;
import com.google.common.collect.Maps;
import com.google.common.collect.Sets;
import com.google.common.collect.UnmodifiableIterator;
import com.mojang.serialization.MapCodec;
import java.util.Map;
import java.util.Set;
import javax.annotation.Nullable;

public class dla extends dey {
   public static final MapCodec<dla> a = b(dla::new);
   public static final dsz<dtg> b = dsr.ab;
   public static final dsz<dtg> c = dsr.aa;
   public static final dsz<dtg> d = dsr.ac;
   public static final dsz<dtg> e = dsr.ad;
   public static final dtb f = dsr.aT;
   public static final Map<je, dsz<dtg>> g = Maps.newEnumMap(ImmutableMap.of(je.c, b, je.f, c, je.d, d, je.e, e));
   protected static final int h = 1;
   protected static final int i = 3;
   protected static final int j = 13;
   protected static final int k = 3;
   protected static final int l = 13;
   private static final ewj m = dey.a(3.0, 0.0, 3.0, 13.0, 1.0, 13.0);
   private static final Map<je, ewj> n = Maps.newEnumMap(
      ImmutableMap.of(
         je.c,
         dey.a(3.0, 0.0, 0.0, 13.0, 1.0, 13.0),
         je.d,
         dey.a(3.0, 0.0, 3.0, 13.0, 1.0, 16.0),
         je.f,
         dey.a(3.0, 0.0, 3.0, 16.0, 1.0, 13.0),
         je.e,
         dey.a(0.0, 0.0, 3.0, 13.0, 1.0, 13.0)
      )
   );
   private static final Map<je, ewj> o = Maps.newEnumMap(
      ImmutableMap.of(
         je.c,
         ewg.a(n.get(je.c), dey.a(3.0, 0.0, 0.0, 13.0, 16.0, 1.0)),
         je.d,
         ewg.a(n.get(je.d), dey.a(3.0, 0.0, 15.0, 13.0, 16.0, 16.0)),
         je.f,
         ewg.a(n.get(je.f), dey.a(15.0, 0.0, 3.0, 16.0, 16.0, 13.0)),
         je.e,
         ewg.a(n.get(je.e), dey.a(0.0, 0.0, 3.0, 1.0, 16.0, 13.0))
      )
   );
   private static final Map<dsb, ewj> F = Maps.newHashMap();
   private static final evq[] G = ac.a(new evq[16], $$0 -> {
      for (int $$1 = 0; $$1 <= 15; $$1++) {
         float $$2 = (float)$$1 / 15.0F;
         float $$3 = $$2 * 0.6F + ($$2 > 0.0F ? 0.4F : 0.3F);
         float $$4 = ayy.a($$2 * $$2 * 0.7F - 0.5F, 0.0F, 1.0F);
         float $$5 = ayy.a($$2 * $$2 * 0.6F - 0.7F, 0.0F, 1.0F);
         $$0[$$1] = new evq((double)$$3, (double)$$4, (double)$$5);
      }
   });
   private static final float H = 0.2F;
   private final dsb I;
   private boolean J = true;

   @Override
   public MapCodec<dla> a() {
      return a;
   }

   public dla(dsa.d $$0) {
      super($$0);
      this.k(this.E.b().a(b, dtg.c).a(c, dtg.c).a(d, dtg.c).a(e, dtg.c).a(f, Integer.valueOf(0)));
      this.I = this.o().a(b, dtg.b).a(c, dtg.b).a(d, dtg.b).a(e, dtg.b);
      UnmodifiableIterator var2 = this.l().a().iterator();

      while (var2.hasNext()) {
         dsb $$1 = (dsb)var2.next();
         if ($$1.c(f) == 0) {
            F.put($$1, this.n($$1));
         }
      }
   }

   private ewj n(dsb $$0) {
      ewj $$1 = m;

      for (je $$2 : je.c.a) {
         dtg $$3 = $$0.c(g.get($$2));
         if ($$3 == dtg.b) {
            $$1 = ewg.a($$1, n.get($$2));
         } else if ($$3 == dtg.a) {
            $$1 = ewg.a($$1, o.get($$2));
         }
      }

      return $$1;
   }

   @Override
   protected ewj a(dsb $$0, dbd $$1, iz $$2, evv $$3) {
      return F.get($$0.a(f, Integer.valueOf(0)));
   }

   @Override
   public dsb a(cxz $$0) {
      return this.a($$0.q(), this.I, $$0.a());
   }

   private dsb a(dbd $$0, dsb $$1, iz $$2) {
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
            $$1 = $$1.a(e, dtg.b);
         }

         if (!$$6 && $$8) {
            $$1 = $$1.a(c, dtg.b);
         }

         if (!$$4 && $$9) {
            $$1 = $$1.a(b, dtg.b);
         }

         if (!$$5 && $$9) {
            $$1 = $$1.a(d, dtg.b);
         }

         return $$1;
      }
   }

   private dsb b(dbd $$0, dsb $$1, iz $$2) {
      boolean $$3 = !$$0.a_($$2.c()).g($$0, $$2);

      for (je $$4 : je.c.a) {
         if (!$$1.c(g.get($$4)).a()) {
            dtg $$5 = this.a($$0, $$2, $$4, $$3);
            $$1 = $$1.a(g.get($$4), $$5);
         }
      }

      return $$1;
   }

   @Override
   protected dsb a(dsb $$0, je $$1, dsb $$2, dby $$3, iz $$4, iz $$5) {
      if ($$1 == je.a) {
         return !this.a($$3, $$5, $$2) ? dfa.a.o() : $$0;
      } else if ($$1 == je.b) {
         return this.a($$3, $$0, $$4);
      } else {
         dtg $$6 = this.a($$3, $$4, $$1);
         return $$6.a() == $$0.c(g.get($$1)).a() && !o($$0) ? $$0.a(g.get($$1), $$6) : this.a($$3, this.I.a(f, $$0.c(f)).a(g.get($$1), $$6), $$4);
      }
   }

   private static boolean o(dsb $$0) {
      return $$0.c(b).a() && $$0.c(d).a() && $$0.c(c).a() && $$0.c(e).a();
   }

   private static boolean p(dsb $$0) {
      return !$$0.c(b).a() && !$$0.c(d).a() && !$$0.c(c).a() && !$$0.c(e).a();
   }

   @Override
   protected void a(dsb $$0, dby $$1, iz $$2, int $$3, int $$4) {
      iz.a $$5 = new iz.a();

      for (je $$6 : je.c.a) {
         dtg $$7 = $$0.c(g.get($$6));
         if ($$7 != dtg.c && !$$1.a_($$5.a($$2, $$6)).a(this)) {
            $$5.c(je.a);
            dsb $$8 = $$1.a_($$5);
            if ($$8.a(this)) {
               iz $$9 = $$5.a($$6.g());
               $$1.a($$6.g(), $$1.a_($$9), $$5, $$9, $$3, $$4);
            }

            $$5.a($$2, $$6).c(je.b);
            dsb $$10 = $$1.a_($$5);
            if ($$10.a(this)) {
               iz $$11 = $$5.a($$6.g());
               $$1.a($$6.g(), $$1.a_($$11), $$5, $$11, $$3, $$4);
            }
         }
      }
   }

   private dtg a(dbd $$0, iz $$1, je $$2) {
      return this.a($$0, $$1, $$2, !$$0.a_($$1.c()).g($$0, $$1));
   }

   private dtg a(dbd $$0, iz $$1, je $$2, boolean $$3) {
      iz $$4 = $$1.a($$2);
      dsb $$5 = $$0.a_($$4);
      if ($$3) {
         boolean $$6 = $$5.b() instanceof dnl || this.a($$0, $$4, $$5);
         if ($$6 && m($$0.a_($$4.c()))) {
            if ($$5.d($$0, $$4, $$2.g())) {
               return dtg.a;
            }

            return dtg.b;
         }
      }

      return !a($$5, $$2) && ($$5.g($$0, $$4) || !m($$0.a_($$4.d()))) ? dtg.c : dtg.b;
   }

   @Override
   protected boolean a(dsb $$0, dca $$1, iz $$2) {
      iz $$3 = $$2.d();
      dsb $$4 = $$1.a_($$3);
      return this.a($$1, $$3, $$4);
   }

   private boolean a(dbd $$0, iz $$1, dsb $$2) {
      return $$2.d($$0, $$1, je.b) || $$2.a(dfa.hc);
   }

   private void a(dbx $$0, iz $$1, dsb $$2) {
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

   private int a(dbx $$0, iz $$1) {
      this.J = false;
      int $$2 = $$0.D($$1);
      this.J = true;
      int $$3 = 0;
      if ($$2 < 15) {
         for (je $$4 : je.c.a) {
            iz $$5 = $$1.a($$4);
            dsb $$6 = $$0.a_($$5);
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

   private int q(dsb $$0) {
      return $$0.a(this) ? $$0.c(f) : 0;
   }

   private void b(dbx $$0, iz $$1) {
      if ($$0.a_($$1).a(this)) {
         $$0.a($$1, this);

         for (je $$2 : je.values()) {
            $$0.a($$1.a($$2), this);
         }
      }
   }

   @Override
   protected void b(dsb $$0, dbx $$1, iz $$2, dsb $$3, boolean $$4) {
      if (!$$3.a($$0.b()) && !$$1.B) {
         this.a($$1, $$2, $$0);

         for (je $$5 : je.c.b) {
            $$1.a($$2.a($$5), this);
         }

         this.c($$1, $$2);
      }
   }

   @Override
   protected void a(dsb $$0, dbx $$1, iz $$2, dsb $$3, boolean $$4) {
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

   private void c(dbx $$0, iz $$1) {
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
   protected void a(dsb $$0, dbx $$1, iz $$2, dey $$3, iz $$4, boolean $$5) {
      if (!$$1.B) {
         if ($$0.a((dca)$$1, $$2)) {
            this.a($$1, $$2, $$0);
         } else {
            c($$0, $$1, $$2);
            $$1.a($$2, false);
         }
      }
   }

   @Override
   protected int b(dsb $$0, dbd $$1, iz $$2, je $$3) {
      return !this.J ? 0 : $$0.b($$1, $$2, $$3);
   }

   @Override
   protected int a(dsb $$0, dbd $$1, iz $$2, je $$3) {
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

   protected static boolean m(dsb $$0) {
      return a($$0, null);
   }

   protected static boolean a(dsb $$0, @Nullable je $$1) {
      if ($$0.a(dfa.cw)) {
         return true;
      } else if ($$0.a(dfa.eh)) {
         je $$2 = $$0.c(dlf.aE);
         return $$2 == $$1 || $$2.g() == $$1;
      } else {
         return $$0.a(dfa.kO) ? $$1 == $$0.c(dkj.a) : $$0.m() && $$1 != null;
      }
   }

   @Override
   protected boolean e_(dsb $$0) {
      return this.J;
   }

   public static int b(int $$0) {
      evq $$1 = G[$$0];
      return ayy.f((float)$$1.a(), (float)$$1.b(), (float)$$1.c());
   }

   private void a(dbx $$0, azg $$1, iz $$2, evq $$3, je $$4, je $$5, float $$6, float $$7) {
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
   public void a(dsb $$0, dbx $$1, iz $$2, azg $$3) {
      int $$4 = $$0.c(f);
      if ($$4 != 0) {
         for (je $$5 : je.c.a) {
            dtg $$6 = $$0.c(g.get($$5));
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
   protected dsb a(dsb $$0, dll $$1) {
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
   protected dsb a(dsb $$0, djv $$1) {
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
   protected void a(dsc.a<dey, dsb> $$0) {
      $$0.a(b, c, d, e, f);
   }

   @Override
   protected bqt a(dsb $$0, dbx $$1, iz $$2, cmw $$3, evm $$4) {
      if (!$$3.gd().e) {
         return bqt.e;
      } else {
         if (o($$0) || p($$0)) {
            dsb $$5 = o($$0) ? this.o() : this.I;
            $$5 = $$5.a(f, $$0.c(f));
            $$5 = this.a($$1, $$5, $$2);
            if ($$5 != $$0) {
               $$1.a($$2, $$5, 3);
               this.a($$1, $$2, $$0, $$5);
               return bqt.a;
            }
         }

         return bqt.e;
      }
   }

   private void a(dbx $$0, iz $$1, dsb $$2, dsb $$3) {
      for (je $$4 : je.c.a) {
         iz $$5 = $$1.a($$4);
         if ($$2.c(g.get($$4)).a() != $$3.c(g.get($$4)).a() && $$0.a_($$5).g($$0, $$5)) {
            $$0.a($$5, $$3.b(), $$4.g());
         }
      }
   }
}
