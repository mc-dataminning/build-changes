import com.google.common.collect.ImmutableMap;
import com.google.common.collect.Maps;
import com.google.common.collect.Sets;
import com.google.common.collect.UnmodifiableIterator;
import com.mojang.serialization.MapCodec;
import java.util.Map;
import java.util.Set;
import javax.annotation.Nullable;

public class dbg extends cvf {
   public static final MapCodec<dbg> a = b(dbg::new);
   public static final dil<dis> b = did.ab;
   public static final dil<dis> c = did.aa;
   public static final dil<dis> d = did.ac;
   public static final dil<dis> e = did.ad;
   public static final din f = did.aT;
   public static final Map<ib, dil<dis>> g = Maps.newEnumMap(ImmutableMap.of(ib.c, b, ib.f, c, ib.d, d, ib.e, e));
   protected static final int h = 1;
   protected static final int i = 3;
   protected static final int j = 13;
   protected static final int k = 3;
   protected static final int l = 13;
   private static final eks m = cvf.a(3.0, 0.0, 3.0, 13.0, 1.0, 13.0);
   private static final Map<ib, eks> n = Maps.newEnumMap(
      ImmutableMap.of(
         ib.c,
         cvf.a(3.0, 0.0, 0.0, 13.0, 1.0, 13.0),
         ib.d,
         cvf.a(3.0, 0.0, 3.0, 13.0, 1.0, 16.0),
         ib.f,
         cvf.a(3.0, 0.0, 3.0, 16.0, 1.0, 13.0),
         ib.e,
         cvf.a(0.0, 0.0, 3.0, 13.0, 1.0, 13.0)
      )
   );
   private static final Map<ib, eks> o = Maps.newEnumMap(
      ImmutableMap.of(
         ib.c,
         ekp.a(n.get(ib.c), cvf.a(3.0, 0.0, 0.0, 13.0, 16.0, 1.0)),
         ib.d,
         ekp.a(n.get(ib.d), cvf.a(3.0, 0.0, 15.0, 13.0, 16.0, 16.0)),
         ib.f,
         ekp.a(n.get(ib.f), cvf.a(15.0, 0.0, 3.0, 16.0, 16.0, 13.0)),
         ib.e,
         ekp.a(n.get(ib.e), cvf.a(0.0, 0.0, 3.0, 1.0, 16.0, 13.0))
      )
   );
   private static final Map<dhn, eks> F = Maps.newHashMap();
   private static final ejz[] G = ac.a(new ejz[16], $$0 -> {
      for (int $$1 = 0; $$1 <= 15; $$1++) {
         float $$2 = (float)$$1 / 15.0F;
         float $$3 = $$2 * 0.6F + ($$2 > 0.0F ? 0.4F : 0.3F);
         float $$4 = atq.a($$2 * $$2 * 0.7F - 0.5F, 0.0F, 1.0F);
         float $$5 = atq.a($$2 * $$2 * 0.6F - 0.7F, 0.0F, 1.0F);
         $$0[$$1] = new ejz((double)$$3, (double)$$4, (double)$$5);
      }
   });
   private static final float H = 0.2F;
   private final dhn I;
   private boolean J = true;

   @Override
   public MapCodec<dbg> a() {
      return a;
   }

   public dbg(dhm.d $$0) {
      super($$0);
      this.k(this.E.b().a(b, dis.c).a(c, dis.c).a(d, dis.c).a(e, dis.c).a(f, Integer.valueOf(0)));
      this.I = this.o().a(b, dis.b).a(c, dis.b).a(d, dis.b).a(e, dis.b);
      UnmodifiableIterator var2 = this.n().a().iterator();

      while (var2.hasNext()) {
         dhn $$1 = (dhn)var2.next();
         if ($$1.c(f) == 0) {
            F.put($$1, this.n($$1));
         }
      }
   }

   private eks n(dhn $$0) {
      eks $$1 = m;

      for (ib $$2 : ib.c.a) {
         dis $$3 = $$0.c(g.get($$2));
         if ($$3 == dis.b) {
            $$1 = ekp.a($$1, n.get($$2));
         } else if ($$3 == dis.a) {
            $$1 = ekp.a($$1, o.get($$2));
         }
      }

      return $$1;
   }

   @Override
   public eks a(dhn $$0, crl $$1, hx $$2, eke $$3) {
      return F.get($$0.a(f, Integer.valueOf(0)));
   }

   @Override
   public dhn a(cnw $$0) {
      return this.a($$0.q(), this.I, $$0.a());
   }

   private dhn a(crl $$0, dhn $$1, hx $$2) {
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
            $$1 = $$1.a(e, dis.b);
         }

         if (!$$6 && $$8) {
            $$1 = $$1.a(c, dis.b);
         }

         if (!$$4 && $$9) {
            $$1 = $$1.a(b, dis.b);
         }

         if (!$$5 && $$9) {
            $$1 = $$1.a(d, dis.b);
         }

         return $$1;
      }
   }

   private dhn b(crl $$0, dhn $$1, hx $$2) {
      boolean $$3 = !$$0.a_($$2.c()).g($$0, $$2);

      for (ib $$4 : ib.c.a) {
         if (!$$1.c(g.get($$4)).a()) {
            dis $$5 = this.a($$0, $$2, $$4, $$3);
            $$1 = $$1.a(g.get($$4), $$5);
         }
      }

      return $$1;
   }

   @Override
   public dhn a(dhn $$0, ib $$1, dhn $$2, csg $$3, hx $$4, hx $$5) {
      if ($$1 == ib.a) {
         return !this.a($$3, $$5, $$2) ? cvh.a.o() : $$0;
      } else if ($$1 == ib.b) {
         return this.a($$3, $$0, $$4);
      } else {
         dis $$6 = this.a($$3, $$4, $$1);
         return $$6.a() == $$0.c(g.get($$1)).a() && !o($$0) ? $$0.a(g.get($$1), $$6) : this.a($$3, this.I.a(f, $$0.c(f)).a(g.get($$1), $$6), $$4);
      }
   }

   private static boolean o(dhn $$0) {
      return $$0.c(b).a() && $$0.c(d).a() && $$0.c(c).a() && $$0.c(e).a();
   }

   private static boolean p(dhn $$0) {
      return !$$0.c(b).a() && !$$0.c(d).a() && !$$0.c(c).a() && !$$0.c(e).a();
   }

   @Override
   public void a(dhn $$0, csg $$1, hx $$2, int $$3, int $$4) {
      hx.a $$5 = new hx.a();

      for (ib $$6 : ib.c.a) {
         dis $$7 = $$0.c(g.get($$6));
         if ($$7 != dis.c && !$$1.a_($$5.a($$2, $$6)).a(this)) {
            $$5.c(ib.a);
            dhn $$8 = $$1.a_($$5);
            if ($$8.a(this)) {
               hx $$9 = $$5.a($$6.g());
               $$1.a($$6.g(), $$1.a_($$9), $$5, $$9, $$3, $$4);
            }

            $$5.a($$2, $$6).c(ib.b);
            dhn $$10 = $$1.a_($$5);
            if ($$10.a(this)) {
               hx $$11 = $$5.a($$6.g());
               $$1.a($$6.g(), $$1.a_($$11), $$5, $$11, $$3, $$4);
            }
         }
      }
   }

   private dis a(crl $$0, hx $$1, ib $$2) {
      return this.a($$0, $$1, $$2, !$$0.a_($$1.c()).g($$0, $$1));
   }

   private dis a(crl $$0, hx $$1, ib $$2, boolean $$3) {
      hx $$4 = $$1.a($$2);
      dhn $$5 = $$0.a_($$4);
      if ($$3) {
         boolean $$6 = $$5.b() instanceof ddr || this.a($$0, $$4, $$5);
         if ($$6 && h($$0.a_($$4.c()))) {
            if ($$5.d($$0, $$4, $$2.g())) {
               return dis.a;
            }

            return dis.b;
         }
      }

      return !a($$5, $$2) && ($$5.g($$0, $$4) || !h($$0.a_($$4.d()))) ? dis.c : dis.b;
   }

   @Override
   public boolean a(dhn $$0, csi $$1, hx $$2) {
      hx $$3 = $$2.d();
      dhn $$4 = $$1.a_($$3);
      return this.a($$1, $$3, $$4);
   }

   private boolean a(crl $$0, hx $$1, dhn $$2) {
      return $$2.d($$0, $$1, ib.b) || $$2.a(cvh.hc);
   }

   private void a(csf $$0, hx $$1, dhn $$2) {
      int $$3 = this.a($$0, $$1);
      if ($$2.c(f) != $$3) {
         if ($$0.a_($$1) == $$2) {
            $$0.a($$1, $$2.a(f, Integer.valueOf($$3)), 2);
         }

         Set<hx> $$4 = Sets.newHashSet();
         $$4.add($$1);

         for (ib $$5 : ib.values()) {
            $$4.add($$1.a($$5));
         }

         for (hx $$6 : $$4) {
            $$0.a($$6, this);
         }
      }
   }

   private int a(csf $$0, hx $$1) {
      this.J = false;
      int $$2 = $$0.C($$1);
      this.J = true;
      int $$3 = 0;
      if ($$2 < 15) {
         for (ib $$4 : ib.c.a) {
            hx $$5 = $$1.a($$4);
            dhn $$6 = $$0.a_($$5);
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

   private int q(dhn $$0) {
      return $$0.a(this) ? $$0.c(f) : 0;
   }

   private void b(csf $$0, hx $$1) {
      if ($$0.a_($$1).a(this)) {
         $$0.a($$1, this);

         for (ib $$2 : ib.values()) {
            $$0.a($$1.a($$2), this);
         }
      }
   }

   @Override
   public void b(dhn $$0, csf $$1, hx $$2, dhn $$3, boolean $$4) {
      if (!$$3.a($$0.b()) && !$$1.B) {
         this.a($$1, $$2, $$0);

         for (ib $$5 : ib.c.b) {
            $$1.a($$2.a($$5), this);
         }

         this.c($$1, $$2);
      }
   }

   @Override
   public void a(dhn $$0, csf $$1, hx $$2, dhn $$3, boolean $$4) {
      if (!$$4 && !$$0.a($$3.b())) {
         super.a($$0, $$1, $$2, $$3, $$4);
         if (!$$1.B) {
            for (ib $$5 : ib.values()) {
               $$1.a($$2.a($$5), this);
            }

            this.a($$1, $$2, $$0);
            this.c($$1, $$2);
         }
      }
   }

   private void c(csf $$0, hx $$1) {
      for (ib $$2 : ib.c.a) {
         this.b($$0, $$1.a($$2));
      }

      for (ib $$3 : ib.c.a) {
         hx $$4 = $$1.a($$3);
         if ($$0.a_($$4).g($$0, $$4)) {
            this.b($$0, $$4.c());
         } else {
            this.b($$0, $$4.d());
         }
      }
   }

   @Override
   public void a(dhn $$0, csf $$1, hx $$2, cvf $$3, hx $$4, boolean $$5) {
      if (!$$1.B) {
         if ($$0.a((csi)$$1, $$2)) {
            this.a($$1, $$2, $$0);
         } else {
            c($$0, $$1, $$2);
            $$1.a($$2, false);
         }
      }
   }

   @Override
   public int b(dhn $$0, crl $$1, hx $$2, ib $$3) {
      return !this.J ? 0 : $$0.b($$1, $$2, $$3);
   }

   @Override
   public int a(dhn $$0, crl $$1, hx $$2, ib $$3) {
      if (this.J && $$3 != ib.a) {
         int $$4 = $$0.c(f);
         if ($$4 == 0) {
            return 0;
         } else {
            return $$3 != ib.b && !this.a($$1, $$0, $$2).c(g.get($$3.g())).a() ? 0 : $$4;
         }
      } else {
         return 0;
      }
   }

   protected static boolean h(dhn $$0) {
      return a($$0, null);
   }

   protected static boolean a(dhn $$0, @Nullable ib $$1) {
      if ($$0.a(cvh.cw)) {
         return true;
      } else if ($$0.a(cvh.eh)) {
         ib $$2 = $$0.c(dbl.aE);
         return $$2 == $$1 || $$2.g() == $$1;
      } else {
         return $$0.a(cvh.kO) ? $$1 == $$0.c(dap.a) : $$0.m() && $$1 != null;
      }
   }

   @Override
   public boolean f_(dhn $$0) {
      return this.J;
   }

   public static int b(int $$0) {
      ejz $$1 = G[$$0];
      return atq.f((float)$$1.a(), (float)$$1.b(), (float)$$1.c());
   }

   private void a(csf $$0, atw $$1, hx $$2, ejz $$3, ib $$4, ib $$5, float $$6, float $$7) {
      float $$8 = $$7 - $$6;
      if (!($$1.i() >= 0.2F * $$8)) {
         float $$9 = 0.4375F;
         float $$10 = $$6 + $$8 * $$1.i();
         double $$11 = 0.5 + (double)(0.4375F * (float)$$4.j()) + (double)($$10 * (float)$$5.j());
         double $$12 = 0.5 + (double)(0.4375F * (float)$$4.k()) + (double)($$10 * (float)$$5.k());
         double $$13 = 0.5 + (double)(0.4375F * (float)$$4.l()) + (double)($$10 * (float)$$5.l());
         $$0.a(new jq($$3.j(), 1.0F), (double)$$2.u() + $$11, (double)$$2.v() + $$12, (double)$$2.w() + $$13, 0.0, 0.0, 0.0);
      }
   }

   @Override
   public void a(dhn $$0, csf $$1, hx $$2, atw $$3) {
      int $$4 = $$0.c(f);
      if ($$4 != 0) {
         for (ib $$5 : ib.c.a) {
            dis $$6 = $$0.c(g.get($$5));
            switch ($$6) {
               case a:
                  this.a($$1, $$3, $$2, G[$$4], $$5, ib.b, -0.5F, 0.5F);
               case b:
                  this.a($$1, $$3, $$2, G[$$4], ib.a, $$5, 0.0F, 0.5F);
                  break;
               case c:
               default:
                  this.a($$1, $$3, $$2, G[$$4], ib.a, $$5, 0.0F, 0.3F);
            }
         }
      }
   }

   @Override
   public dhn a(dhn $$0, dbr $$1) {
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
   public dhn a(dhn $$0, dab $$1) {
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
   protected void a(dho.a<cvf, dhn> $$0) {
      $$0.a(b, c, d, e, f);
   }

   @Override
   public bjb a(dhn $$0, csf $$1, hx $$2, cdz $$3, bja $$4, ejv $$5) {
      if (!$$3.fU().e) {
         return bjb.d;
      } else {
         if (o($$0) || p($$0)) {
            dhn $$6 = o($$0) ? this.o() : this.I;
            $$6 = $$6.a(f, $$0.c(f));
            $$6 = this.a($$1, $$6, $$2);
            if ($$6 != $$0) {
               $$1.a($$2, $$6, 3);
               this.a($$1, $$2, $$0, $$6);
               return bjb.a;
            }
         }

         return bjb.d;
      }
   }

   private void a(csf $$0, hx $$1, dhn $$2, dhn $$3) {
      for (ib $$4 : ib.c.a) {
         hx $$5 = $$1.a($$4);
         if ($$2.c(g.get($$4)).a() != $$3.c(g.get($$4)).a() && $$0.a_($$5).g($$0, $$5)) {
            $$0.a($$5, $$3.b(), $$4.g());
         }
      }
   }
}
