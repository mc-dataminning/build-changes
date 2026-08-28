import com.google.common.collect.ImmutableMap;
import com.google.common.collect.Maps;
import com.google.common.collect.Sets;
import com.google.common.collect.UnmodifiableIterator;
import com.mojang.serialization.MapCodec;
import java.util.Map;
import java.util.Set;
import javax.annotation.Nullable;

public class dlh extends dff {
   public static final MapCodec<dlh> a = b(dlh::new);
   public static final dtf<dtm> b = dsx.ab;
   public static final dtf<dtm> c = dsx.aa;
   public static final dtf<dtm> d = dsx.ac;
   public static final dtf<dtm> e = dsx.ad;
   public static final dth f = dsx.aT;
   public static final Map<jf, dtf<dtm>> g = Maps.newEnumMap(ImmutableMap.of(jf.c, b, jf.f, c, jf.d, d, jf.e, e));
   protected static final int h = 1;
   protected static final int i = 3;
   protected static final int j = 13;
   protected static final int k = 3;
   protected static final int l = 13;
   private static final ews m = dff.a(3.0, 0.0, 3.0, 13.0, 1.0, 13.0);
   private static final Map<jf, ews> n = Maps.newEnumMap(
      ImmutableMap.of(
         jf.c,
         dff.a(3.0, 0.0, 0.0, 13.0, 1.0, 13.0),
         jf.d,
         dff.a(3.0, 0.0, 3.0, 13.0, 1.0, 16.0),
         jf.f,
         dff.a(3.0, 0.0, 3.0, 16.0, 1.0, 13.0),
         jf.e,
         dff.a(0.0, 0.0, 3.0, 13.0, 1.0, 13.0)
      )
   );
   private static final Map<jf, ews> o = Maps.newEnumMap(
      ImmutableMap.of(
         jf.c,
         ewp.a(n.get(jf.c), dff.a(3.0, 0.0, 0.0, 13.0, 16.0, 1.0)),
         jf.d,
         ewp.a(n.get(jf.d), dff.a(3.0, 0.0, 15.0, 13.0, 16.0, 16.0)),
         jf.f,
         ewp.a(n.get(jf.f), dff.a(15.0, 0.0, 3.0, 16.0, 16.0, 13.0)),
         jf.e,
         ewp.a(n.get(jf.e), dff.a(0.0, 0.0, 3.0, 1.0, 16.0, 13.0))
      )
   );
   private static final Map<dsh, ews> F = Maps.newHashMap();
   private static final evz[] G = ac.a(new evz[16], $$0 -> {
      for (int $$1 = 0; $$1 <= 15; $$1++) {
         float $$2 = (float)$$1 / 15.0F;
         float $$3 = $$2 * 0.6F + ($$2 > 0.0F ? 0.4F : 0.3F);
         float $$4 = aye.a($$2 * $$2 * 0.7F - 0.5F, 0.0F, 1.0F);
         float $$5 = aye.a($$2 * $$2 * 0.6F - 0.7F, 0.0F, 1.0F);
         $$0[$$1] = new evz((double)$$3, (double)$$4, (double)$$5);
      }
   });
   private static final float H = 0.2F;
   private final dsh I;
   private boolean J = true;

   @Override
   public MapCodec<dlh> a() {
      return a;
   }

   public dlh(dsg.d $$0) {
      super($$0);
      this.k(this.E.b().a(b, dtm.c).a(c, dtm.c).a(d, dtm.c).a(e, dtm.c).a(f, Integer.valueOf(0)));
      this.I = this.o().a(b, dtm.b).a(c, dtm.b).a(d, dtm.b).a(e, dtm.b);
      UnmodifiableIterator var2 = this.l().a().iterator();

      while (var2.hasNext()) {
         dsh $$1 = (dsh)var2.next();
         if ($$1.c(f) == 0) {
            F.put($$1, this.n($$1));
         }
      }
   }

   private ews n(dsh $$0) {
      ews $$1 = m;

      for (jf $$2 : jf.c.a) {
         dtm $$3 = $$0.c(g.get($$2));
         if ($$3 == dtm.b) {
            $$1 = ewp.a($$1, n.get($$2));
         } else if ($$3 == dtm.a) {
            $$1 = ewp.a($$1, o.get($$2));
         }
      }

      return $$1;
   }

   @Override
   protected ews a(dsh $$0, dbj $$1, ja $$2, ewe $$3) {
      return F.get($$0.a(f, Integer.valueOf(0)));
   }

   @Override
   public dsh a(cxk $$0) {
      return this.a($$0.q(), this.I, $$0.a());
   }

   private dsh a(dbj $$0, dsh $$1, ja $$2) {
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
            $$1 = $$1.a(e, dtm.b);
         }

         if (!$$6 && $$8) {
            $$1 = $$1.a(c, dtm.b);
         }

         if (!$$4 && $$9) {
            $$1 = $$1.a(b, dtm.b);
         }

         if (!$$5 && $$9) {
            $$1 = $$1.a(d, dtm.b);
         }

         return $$1;
      }
   }

   private dsh b(dbj $$0, dsh $$1, ja $$2) {
      boolean $$3 = !$$0.a_($$2.c()).g($$0, $$2);

      for (jf $$4 : jf.c.a) {
         if (!$$1.c(g.get($$4)).a()) {
            dtm $$5 = this.a($$0, $$2, $$4, $$3);
            $$1 = $$1.a(g.get($$4), $$5);
         }
      }

      return $$1;
   }

   @Override
   protected dsh a(dsh $$0, jf $$1, dsh $$2, dce $$3, ja $$4, ja $$5) {
      if ($$1 == jf.a) {
         return !this.a($$3, $$5, $$2) ? dfh.a.o() : $$0;
      } else if ($$1 == jf.b) {
         return this.a($$3, $$0, $$4);
      } else {
         dtm $$6 = this.a($$3, $$4, $$1);
         return $$6.a() == $$0.c(g.get($$1)).a() && !o($$0) ? $$0.a(g.get($$1), $$6) : this.a($$3, this.I.a(f, $$0.c(f)).a(g.get($$1), $$6), $$4);
      }
   }

   private static boolean o(dsh $$0) {
      return $$0.c(b).a() && $$0.c(d).a() && $$0.c(c).a() && $$0.c(e).a();
   }

   private static boolean p(dsh $$0) {
      return !$$0.c(b).a() && !$$0.c(d).a() && !$$0.c(c).a() && !$$0.c(e).a();
   }

   @Override
   protected void a(dsh $$0, dce $$1, ja $$2, int $$3, int $$4) {
      ja.a $$5 = new ja.a();

      for (jf $$6 : jf.c.a) {
         dtm $$7 = $$0.c(g.get($$6));
         if ($$7 != dtm.c && !$$1.a_($$5.a($$2, $$6)).a(this)) {
            $$5.c(jf.a);
            dsh $$8 = $$1.a_($$5);
            if ($$8.a(this)) {
               ja $$9 = $$5.a($$6.g());
               $$1.a($$6.g(), $$1.a_($$9), $$5, $$9, $$3, $$4);
            }

            $$5.a($$2, $$6).c(jf.b);
            dsh $$10 = $$1.a_($$5);
            if ($$10.a(this)) {
               ja $$11 = $$5.a($$6.g());
               $$1.a($$6.g(), $$1.a_($$11), $$5, $$11, $$3, $$4);
            }
         }
      }
   }

   private dtm a(dbj $$0, ja $$1, jf $$2) {
      return this.a($$0, $$1, $$2, !$$0.a_($$1.c()).g($$0, $$1));
   }

   private dtm a(dbj $$0, ja $$1, jf $$2, boolean $$3) {
      ja $$4 = $$1.a($$2);
      dsh $$5 = $$0.a_($$4);
      if ($$3) {
         boolean $$6 = $$5.b() instanceof dns || this.a($$0, $$4, $$5);
         if ($$6 && m($$0.a_($$4.c()))) {
            if ($$5.d($$0, $$4, $$2.g())) {
               return dtm.a;
            }

            return dtm.b;
         }
      }

      return !a($$5, $$2) && ($$5.g($$0, $$4) || !m($$0.a_($$4.d()))) ? dtm.c : dtm.b;
   }

   @Override
   protected boolean a(dsh $$0, dcg $$1, ja $$2) {
      ja $$3 = $$2.d();
      dsh $$4 = $$1.a_($$3);
      return this.a($$1, $$3, $$4);
   }

   private boolean a(dbj $$0, ja $$1, dsh $$2) {
      return $$2.d($$0, $$1, jf.b) || $$2.a(dfh.hc);
   }

   private void a(dcd $$0, ja $$1, dsh $$2) {
      int $$3 = this.a($$0, $$1);
      if ($$2.c(f) != $$3) {
         if ($$0.a_($$1) == $$2) {
            $$0.a($$1, $$2.a(f, Integer.valueOf($$3)), 2);
         }

         Set<ja> $$4 = Sets.newHashSet();
         $$4.add($$1);

         for (jf $$5 : jf.values()) {
            $$4.add($$1.a($$5));
         }

         for (ja $$6 : $$4) {
            $$0.a($$6, this);
         }
      }
   }

   private int a(dcd $$0, ja $$1) {
      this.J = false;
      int $$2 = $$0.D($$1);
      this.J = true;
      int $$3 = 0;
      if ($$2 < 15) {
         for (jf $$4 : jf.c.a) {
            ja $$5 = $$1.a($$4);
            dsh $$6 = $$0.a_($$5);
            $$3 = Math.max($$3, this.q($$6));
            ja $$7 = $$1.c();
            if ($$6.g($$0, $$5) && !$$0.a_($$7).g($$0, $$7)) {
               $$3 = Math.max($$3, this.q($$0.a_($$5.c())));
            } else if (!$$6.g($$0, $$5)) {
               $$3 = Math.max($$3, this.q($$0.a_($$5.d())));
            }
         }
      }

      return Math.max($$2, $$3 - 1);
   }

   private int q(dsh $$0) {
      return $$0.a(this) ? $$0.c(f) : 0;
   }

   private void b(dcd $$0, ja $$1) {
      if ($$0.a_($$1).a(this)) {
         $$0.a($$1, this);

         for (jf $$2 : jf.values()) {
            $$0.a($$1.a($$2), this);
         }
      }
   }

   @Override
   protected void b(dsh $$0, dcd $$1, ja $$2, dsh $$3, boolean $$4) {
      if (!$$3.a($$0.b()) && !$$1.B) {
         this.a($$1, $$2, $$0);

         for (jf $$5 : jf.c.b) {
            $$1.a($$2.a($$5), this);
         }

         this.c($$1, $$2);
      }
   }

   @Override
   protected void a(dsh $$0, dcd $$1, ja $$2, dsh $$3, boolean $$4) {
      if (!$$4 && !$$0.a($$3.b())) {
         super.a($$0, $$1, $$2, $$3, $$4);
         if (!$$1.B) {
            for (jf $$5 : jf.values()) {
               $$1.a($$2.a($$5), this);
            }

            this.a($$1, $$2, $$0);
            this.c($$1, $$2);
         }
      }
   }

   private void c(dcd $$0, ja $$1) {
      for (jf $$2 : jf.c.a) {
         this.b($$0, $$1.a($$2));
      }

      for (jf $$3 : jf.c.a) {
         ja $$4 = $$1.a($$3);
         if ($$0.a_($$4).g($$0, $$4)) {
            this.b($$0, $$4.c());
         } else {
            this.b($$0, $$4.d());
         }
      }
   }

   @Override
   protected void a(dsh $$0, dcd $$1, ja $$2, dff $$3, ja $$4, boolean $$5) {
      if (!$$1.B) {
         if ($$0.a((dcg)$$1, $$2)) {
            this.a($$1, $$2, $$0);
         } else {
            c($$0, $$1, $$2);
            $$1.a($$2, false);
         }
      }
   }

   @Override
   protected int b(dsh $$0, dbj $$1, ja $$2, jf $$3) {
      return !this.J ? 0 : $$0.b($$1, $$2, $$3);
   }

   @Override
   protected int a(dsh $$0, dbj $$1, ja $$2, jf $$3) {
      if (this.J && $$3 != jf.a) {
         int $$4 = $$0.c(f);
         if ($$4 == 0) {
            return 0;
         } else {
            return $$3 != jf.b && !this.a($$1, $$0, $$2).c(g.get($$3.g())).a() ? 0 : $$4;
         }
      } else {
         return 0;
      }
   }

   protected static boolean m(dsh $$0) {
      return a($$0, null);
   }

   protected static boolean a(dsh $$0, @Nullable jf $$1) {
      if ($$0.a(dfh.cw)) {
         return true;
      } else if ($$0.a(dfh.eh)) {
         jf $$2 = $$0.c(dlm.aE);
         return $$2 == $$1 || $$2.g() == $$1;
      } else {
         return $$0.a(dfh.kO) ? $$1 == $$0.c(dkq.a) : $$0.m() && $$1 != null;
      }
   }

   @Override
   protected boolean e_(dsh $$0) {
      return this.J;
   }

   public static int b(int $$0) {
      evz $$1 = G[$$0];
      return aye.f((float)$$1.a(), (float)$$1.b(), (float)$$1.c());
   }

   private void a(dcd $$0, aym $$1, ja $$2, evz $$3, jf $$4, jf $$5, float $$6, float $$7) {
      float $$8 = $$7 - $$6;
      if (!($$1.i() >= 0.2F * $$8)) {
         float $$9 = 0.4375F;
         float $$10 = $$6 + $$8 * $$1.i();
         double $$11 = 0.5 + (double)(0.4375F * (float)$$4.j()) + (double)($$10 * (float)$$5.j());
         double $$12 = 0.5 + (double)(0.4375F * (float)$$4.k()) + (double)($$10 * (float)$$5.k());
         double $$13 = 0.5 + (double)(0.4375F * (float)$$4.l()) + (double)($$10 * (float)$$5.l());
         $$0.a(new le($$3.j(), 1.0F), (double)$$2.u() + $$11, (double)$$2.v() + $$12, (double)$$2.w() + $$13, 0.0, 0.0, 0.0);
      }
   }

   @Override
   public void a(dsh $$0, dcd $$1, ja $$2, aym $$3) {
      int $$4 = $$0.c(f);
      if ($$4 != 0) {
         for (jf $$5 : jf.c.a) {
            dtm $$6 = $$0.c(g.get($$5));
            switch ($$6) {
               case a:
                  this.a($$1, $$3, $$2, G[$$4], $$5, jf.b, -0.5F, 0.5F);
               case b:
                  this.a($$1, $$3, $$2, G[$$4], jf.a, $$5, 0.0F, 0.5F);
                  break;
               case c:
               default:
                  this.a($$1, $$3, $$2, G[$$4], jf.a, $$5, 0.0F, 0.3F);
            }
         }
      }
   }

   @Override
   protected dsh a(dsh $$0, dls $$1) {
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
   protected dsh a(dsh $$0, dkc $$1) {
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
   protected void a(dsi.a<dff, dsh> $$0) {
      $$0.a(b, c, d, e, f);
   }

   @Override
   protected bqd a(dsh $$0, dcd $$1, ja $$2, cmh $$3, evv $$4) {
      if (!$$3.fZ().e) {
         return bqd.e;
      } else {
         if (o($$0) || p($$0)) {
            dsh $$5 = o($$0) ? this.o() : this.I;
            $$5 = $$5.a(f, $$0.c(f));
            $$5 = this.a($$1, $$5, $$2);
            if ($$5 != $$0) {
               $$1.a($$2, $$5, 3);
               this.a($$1, $$2, $$0, $$5);
               return bqd.a;
            }
         }

         return bqd.e;
      }
   }

   private void a(dcd $$0, ja $$1, dsh $$2, dsh $$3) {
      for (jf $$4 : jf.c.a) {
         ja $$5 = $$1.a($$4);
         if ($$2.c(g.get($$4)).a() != $$3.c(g.get($$4)).a() && $$0.a_($$5).g($$0, $$5)) {
            $$0.a($$5, $$3.b(), $$4.g());
         }
      }
   }
}
