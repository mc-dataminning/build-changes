import com.google.common.collect.ImmutableMap;
import com.google.common.collect.Maps;
import com.google.common.collect.Sets;
import com.google.common.collect.UnmodifiableIterator;
import com.mojang.serialization.MapCodec;
import java.util.Map;
import java.util.Set;
import javax.annotation.Nullable;

public class dcz extends cwy {
   public static final MapCodec<dcz> a = b(dcz::new);
   public static final dkn<dku> b = dkf.ab;
   public static final dkn<dku> c = dkf.aa;
   public static final dkn<dku> d = dkf.ac;
   public static final dkn<dku> e = dkf.ad;
   public static final dkp f = dkf.aT;
   public static final Map<ic, dkn<dku>> g = Maps.newEnumMap(ImmutableMap.of(ic.c, b, ic.f, c, ic.d, d, ic.e, e));
   protected static final int h = 1;
   protected static final int i = 3;
   protected static final int j = 13;
   protected static final int k = 3;
   protected static final int l = 13;
   private static final emv m = cwy.a(3.0, 0.0, 3.0, 13.0, 1.0, 13.0);
   private static final Map<ic, emv> n = Maps.newEnumMap(
      ImmutableMap.of(
         ic.c,
         cwy.a(3.0, 0.0, 0.0, 13.0, 1.0, 13.0),
         ic.d,
         cwy.a(3.0, 0.0, 3.0, 13.0, 1.0, 16.0),
         ic.f,
         cwy.a(3.0, 0.0, 3.0, 16.0, 1.0, 13.0),
         ic.e,
         cwy.a(0.0, 0.0, 3.0, 13.0, 1.0, 13.0)
      )
   );
   private static final Map<ic, emv> o = Maps.newEnumMap(
      ImmutableMap.of(
         ic.c,
         ems.a(n.get(ic.c), cwy.a(3.0, 0.0, 0.0, 13.0, 16.0, 1.0)),
         ic.d,
         ems.a(n.get(ic.d), cwy.a(3.0, 0.0, 15.0, 13.0, 16.0, 16.0)),
         ic.f,
         ems.a(n.get(ic.f), cwy.a(15.0, 0.0, 3.0, 16.0, 16.0, 13.0)),
         ic.e,
         ems.a(n.get(ic.e), cwy.a(0.0, 0.0, 3.0, 1.0, 16.0, 13.0))
      )
   );
   private static final Map<djp, emv> F = Maps.newHashMap();
   private static final emc[] G = ac.a(new emc[16], $$0 -> {
      for (int $$1 = 0; $$1 <= 15; $$1++) {
         float $$2 = (float)$$1 / 15.0F;
         float $$3 = $$2 * 0.6F + ($$2 > 0.0F ? 0.4F : 0.3F);
         float $$4 = aup.a($$2 * $$2 * 0.7F - 0.5F, 0.0F, 1.0F);
         float $$5 = aup.a($$2 * $$2 * 0.6F - 0.7F, 0.0F, 1.0F);
         $$0[$$1] = new emc((double)$$3, (double)$$4, (double)$$5);
      }
   });
   private static final float H = 0.2F;
   private final djp I;
   private boolean J = true;

   @Override
   public MapCodec<dcz> a() {
      return a;
   }

   public dcz(djo.d $$0) {
      super($$0);
      this.k(this.E.b().a(b, dku.c).a(c, dku.c).a(d, dku.c).a(e, dku.c).a(f, Integer.valueOf(0)));
      this.I = this.o().a(b, dku.b).a(c, dku.b).a(d, dku.b).a(e, dku.b);
      UnmodifiableIterator var2 = this.n().a().iterator();

      while (var2.hasNext()) {
         djp $$1 = (djp)var2.next();
         if ($$1.c(f) == 0) {
            F.put($$1, this.n($$1));
         }
      }
   }

   private emv n(djp $$0) {
      emv $$1 = m;

      for (ic $$2 : ic.c.a) {
         dku $$3 = $$0.c(g.get($$2));
         if ($$3 == dku.b) {
            $$1 = ems.a($$1, n.get($$2));
         } else if ($$3 == dku.a) {
            $$1 = ems.a($$1, o.get($$2));
         }
      }

      return $$1;
   }

   @Override
   public emv a(djp $$0, ctd $$1, hx $$2, emh $$3) {
      return F.get($$0.a(f, Integer.valueOf(0)));
   }

   @Override
   public djp a(cpp $$0) {
      return this.a($$0.q(), this.I, $$0.a());
   }

   private djp a(ctd $$0, djp $$1, hx $$2) {
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
            $$1 = $$1.a(e, dku.b);
         }

         if (!$$6 && $$8) {
            $$1 = $$1.a(c, dku.b);
         }

         if (!$$4 && $$9) {
            $$1 = $$1.a(b, dku.b);
         }

         if (!$$5 && $$9) {
            $$1 = $$1.a(d, dku.b);
         }

         return $$1;
      }
   }

   private djp b(ctd $$0, djp $$1, hx $$2) {
      boolean $$3 = !$$0.a_($$2.c()).g($$0, $$2);

      for (ic $$4 : ic.c.a) {
         if (!$$1.c(g.get($$4)).a()) {
            dku $$5 = this.a($$0, $$2, $$4, $$3);
            $$1 = $$1.a(g.get($$4), $$5);
         }
      }

      return $$1;
   }

   @Override
   public djp a(djp $$0, ic $$1, djp $$2, cty $$3, hx $$4, hx $$5) {
      if ($$1 == ic.a) {
         return !this.a($$3, $$5, $$2) ? cxa.a.o() : $$0;
      } else if ($$1 == ic.b) {
         return this.a($$3, $$0, $$4);
      } else {
         dku $$6 = this.a($$3, $$4, $$1);
         return $$6.a() == $$0.c(g.get($$1)).a() && !o($$0) ? $$0.a(g.get($$1), $$6) : this.a($$3, this.I.a(f, $$0.c(f)).a(g.get($$1), $$6), $$4);
      }
   }

   private static boolean o(djp $$0) {
      return $$0.c(b).a() && $$0.c(d).a() && $$0.c(c).a() && $$0.c(e).a();
   }

   private static boolean p(djp $$0) {
      return !$$0.c(b).a() && !$$0.c(d).a() && !$$0.c(c).a() && !$$0.c(e).a();
   }

   @Override
   public void a(djp $$0, cty $$1, hx $$2, int $$3, int $$4) {
      hx.a $$5 = new hx.a();

      for (ic $$6 : ic.c.a) {
         dku $$7 = $$0.c(g.get($$6));
         if ($$7 != dku.c && !$$1.a_($$5.a($$2, $$6)).a(this)) {
            $$5.c(ic.a);
            djp $$8 = $$1.a_($$5);
            if ($$8.a(this)) {
               hx $$9 = $$5.a($$6.g());
               $$1.a($$6.g(), $$1.a_($$9), $$5, $$9, $$3, $$4);
            }

            $$5.a($$2, $$6).c(ic.b);
            djp $$10 = $$1.a_($$5);
            if ($$10.a(this)) {
               hx $$11 = $$5.a($$6.g());
               $$1.a($$6.g(), $$1.a_($$11), $$5, $$11, $$3, $$4);
            }
         }
      }
   }

   private dku a(ctd $$0, hx $$1, ic $$2) {
      return this.a($$0, $$1, $$2, !$$0.a_($$1.c()).g($$0, $$1));
   }

   private dku a(ctd $$0, hx $$1, ic $$2, boolean $$3) {
      hx $$4 = $$1.a($$2);
      djp $$5 = $$0.a_($$4);
      if ($$3) {
         boolean $$6 = $$5.b() instanceof dfk || this.a($$0, $$4, $$5);
         if ($$6 && h($$0.a_($$4.c()))) {
            if ($$5.d($$0, $$4, $$2.g())) {
               return dku.a;
            }

            return dku.b;
         }
      }

      return !a($$5, $$2) && ($$5.g($$0, $$4) || !h($$0.a_($$4.d()))) ? dku.c : dku.b;
   }

   @Override
   public boolean a(djp $$0, cua $$1, hx $$2) {
      hx $$3 = $$2.d();
      djp $$4 = $$1.a_($$3);
      return this.a($$1, $$3, $$4);
   }

   private boolean a(ctd $$0, hx $$1, djp $$2) {
      return $$2.d($$0, $$1, ic.b) || $$2.a(cxa.hc);
   }

   private void a(ctx $$0, hx $$1, djp $$2) {
      int $$3 = this.a($$0, $$1);
      if ($$2.c(f) != $$3) {
         if ($$0.a_($$1) == $$2) {
            $$0.a($$1, $$2.a(f, Integer.valueOf($$3)), 2);
         }

         Set<hx> $$4 = Sets.newHashSet();
         $$4.add($$1);

         for (ic $$5 : ic.values()) {
            $$4.add($$1.a($$5));
         }

         for (hx $$6 : $$4) {
            $$0.a($$6, this);
         }
      }
   }

   private int a(ctx $$0, hx $$1) {
      this.J = false;
      int $$2 = $$0.D($$1);
      this.J = true;
      int $$3 = 0;
      if ($$2 < 15) {
         for (ic $$4 : ic.c.a) {
            hx $$5 = $$1.a($$4);
            djp $$6 = $$0.a_($$5);
            $$3 = Math.max($$3, this.q($$6));
            hx $$7 = $$1.c();
            if ($$6.g($$0, $$5) && !$$0.a_($$7).g($$0, $$7)) {
               $$3 = Math.max($$3, this.q($$0.a_($$5.c())));
            } else if (!$$6.g($$0, $$5)) {
               $$3 = Math.max($$3, this.q($$0.a_($$5.d())));
            }
         }
      }

      return Math.max($$2, $$3 - 1);
   }

   private int q(djp $$0) {
      return $$0.a(this) ? $$0.c(f) : 0;
   }

   private void b(ctx $$0, hx $$1) {
      if ($$0.a_($$1).a(this)) {
         $$0.a($$1, this);

         for (ic $$2 : ic.values()) {
            $$0.a($$1.a($$2), this);
         }
      }
   }

   @Override
   public void b(djp $$0, ctx $$1, hx $$2, djp $$3, boolean $$4) {
      if (!$$3.a($$0.b()) && !$$1.B) {
         this.a($$1, $$2, $$0);

         for (ic $$5 : ic.c.b) {
            $$1.a($$2.a($$5), this);
         }

         this.c($$1, $$2);
      }
   }

   @Override
   public void a(djp $$0, ctx $$1, hx $$2, djp $$3, boolean $$4) {
      if (!$$4 && !$$0.a($$3.b())) {
         super.a($$0, $$1, $$2, $$3, $$4);
         if (!$$1.B) {
            for (ic $$5 : ic.values()) {
               $$1.a($$2.a($$5), this);
            }

            this.a($$1, $$2, $$0);
            this.c($$1, $$2);
         }
      }
   }

   private void c(ctx $$0, hx $$1) {
      for (ic $$2 : ic.c.a) {
         this.b($$0, $$1.a($$2));
      }

      for (ic $$3 : ic.c.a) {
         hx $$4 = $$1.a($$3);
         if ($$0.a_($$4).g($$0, $$4)) {
            this.b($$0, $$4.c());
         } else {
            this.b($$0, $$4.d());
         }
      }
   }

   @Override
   public void a(djp $$0, ctx $$1, hx $$2, cwy $$3, hx $$4, boolean $$5) {
      if (!$$1.B) {
         if ($$0.a((cua)$$1, $$2)) {
            this.a($$1, $$2, $$0);
         } else {
            c($$0, $$1, $$2);
            $$1.a($$2, false);
         }
      }
   }

   @Override
   public int b(djp $$0, ctd $$1, hx $$2, ic $$3) {
      return !this.J ? 0 : $$0.b($$1, $$2, $$3);
   }

   @Override
   public int a(djp $$0, ctd $$1, hx $$2, ic $$3) {
      if (this.J && $$3 != ic.a) {
         int $$4 = $$0.c(f);
         if ($$4 == 0) {
            return 0;
         } else {
            return $$3 != ic.b && !this.a($$1, $$0, $$2).c(g.get($$3.g())).a() ? 0 : $$4;
         }
      } else {
         return 0;
      }
   }

   protected static boolean h(djp $$0) {
      return a($$0, null);
   }

   protected static boolean a(djp $$0, @Nullable ic $$1) {
      if ($$0.a(cxa.cw)) {
         return true;
      } else if ($$0.a(cxa.eh)) {
         ic $$2 = $$0.c(dde.aE);
         return $$2 == $$1 || $$2.g() == $$1;
      } else {
         return $$0.a(cxa.kO) ? $$1 == $$0.c(dci.a) : $$0.m() && $$1 != null;
      }
   }

   @Override
   public boolean f_(djp $$0) {
      return this.J;
   }

   public static int b(int $$0) {
      emc $$1 = G[$$0];
      return aup.f((float)$$1.a(), (float)$$1.b(), (float)$$1.c());
   }

   private void a(ctx $$0, auw $$1, hx $$2, emc $$3, ic $$4, ic $$5, float $$6, float $$7) {
      float $$8 = $$7 - $$6;
      if (!($$1.i() >= 0.2F * $$8)) {
         float $$9 = 0.4375F;
         float $$10 = $$6 + $$8 * $$1.i();
         double $$11 = 0.5 + (double)(0.4375F * (float)$$4.j()) + (double)($$10 * (float)$$5.j());
         double $$12 = 0.5 + (double)(0.4375F * (float)$$4.k()) + (double)($$10 * (float)$$5.k());
         double $$13 = 0.5 + (double)(0.4375F * (float)$$4.l()) + (double)($$10 * (float)$$5.l());
         $$0.a(new jr($$3.j(), 1.0F), (double)$$2.u() + $$11, (double)$$2.v() + $$12, (double)$$2.w() + $$13, 0.0, 0.0, 0.0);
      }
   }

   @Override
   public void a(djp $$0, ctx $$1, hx $$2, auw $$3) {
      int $$4 = $$0.c(f);
      if ($$4 != 0) {
         for (ic $$5 : ic.c.a) {
            dku $$6 = $$0.c(g.get($$5));
            switch ($$6) {
               case a:
                  this.a($$1, $$3, $$2, G[$$4], $$5, ic.b, -0.5F, 0.5F);
               case b:
                  this.a($$1, $$3, $$2, G[$$4], ic.a, $$5, 0.0F, 0.5F);
                  break;
               case c:
               default:
                  this.a($$1, $$3, $$2, G[$$4], ic.a, $$5, 0.0F, 0.3F);
            }
         }
      }
   }

   @Override
   public djp a(djp $$0, ddk $$1) {
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
   public djp a(djp $$0, dbu $$1) {
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
   protected void a(djq.a<cwy, djp> $$0) {
      $$0.a(b, c, d, e, f);
   }

   @Override
   public bkc a(djp $$0, ctx $$1, hx $$2, cfq $$3, ely $$4) {
      if (!$$3.fT().e) {
         return bkc.d;
      } else {
         if (o($$0) || p($$0)) {
            djp $$5 = o($$0) ? this.o() : this.I;
            $$5 = $$5.a(f, $$0.c(f));
            $$5 = this.a($$1, $$5, $$2);
            if ($$5 != $$0) {
               $$1.a($$2, $$5, 3);
               this.a($$1, $$2, $$0, $$5);
               return bkc.a;
            }
         }

         return bkc.d;
      }
   }

   private void a(ctx $$0, hx $$1, djp $$2, djp $$3) {
      for (ic $$4 : ic.c.a) {
         hx $$5 = $$1.a($$4);
         if ($$2.c(g.get($$4)).a() != $$3.c(g.get($$4)).a() && $$0.a_($$5).g($$0, $$5)) {
            $$0.a($$5, $$3.b(), $$4.g());
         }
      }
   }
}
