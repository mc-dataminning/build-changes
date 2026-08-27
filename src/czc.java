import com.google.common.collect.ImmutableMap;
import com.google.common.collect.Maps;
import com.google.common.collect.Sets;
import com.google.common.collect.UnmodifiableIterator;
import com.mojang.serialization.MapCodec;
import java.util.Map;
import java.util.Set;
import javax.annotation.Nullable;

public class czc extends ctc {
   public static final MapCodec<czc> a = b(czc::new);
   public static final dgb<dgi> b = dft.ab;
   public static final dgb<dgi> c = dft.aa;
   public static final dgb<dgi> d = dft.ac;
   public static final dgb<dgi> e = dft.ad;
   public static final dgd f = dft.aT;
   public static final Map<ha, dgb<dgi>> g = Maps.newEnumMap(ImmutableMap.of(ha.c, b, ha.f, c, ha.d, d, ha.e, e));
   protected static final int h = 1;
   protected static final int i = 3;
   protected static final int j = 13;
   protected static final int k = 3;
   protected static final int l = 13;
   private static final eia m = ctc.a(3.0, 0.0, 3.0, 13.0, 1.0, 13.0);
   private static final Map<ha, eia> n = Maps.newEnumMap(
      ImmutableMap.of(
         ha.c,
         ctc.a(3.0, 0.0, 0.0, 13.0, 1.0, 13.0),
         ha.d,
         ctc.a(3.0, 0.0, 3.0, 13.0, 1.0, 16.0),
         ha.f,
         ctc.a(3.0, 0.0, 3.0, 16.0, 1.0, 13.0),
         ha.e,
         ctc.a(0.0, 0.0, 3.0, 13.0, 1.0, 13.0)
      )
   );
   private static final Map<ha, eia> o = Maps.newEnumMap(
      ImmutableMap.of(
         ha.c,
         ehx.a(n.get(ha.c), ctc.a(3.0, 0.0, 0.0, 13.0, 16.0, 1.0)),
         ha.d,
         ehx.a(n.get(ha.d), ctc.a(3.0, 0.0, 15.0, 13.0, 16.0, 16.0)),
         ha.f,
         ehx.a(n.get(ha.f), ctc.a(15.0, 0.0, 3.0, 16.0, 16.0, 13.0)),
         ha.e,
         ehx.a(n.get(ha.e), ctc.a(0.0, 0.0, 3.0, 1.0, 16.0, 13.0))
      )
   );
   private static final Map<dfd, eia> F = Maps.newHashMap();
   private static final ehh[] G = ac.a(new ehh[16], $$0 -> {
      for (int $$1 = 0; $$1 <= 15; $$1++) {
         float $$2 = (float)$$1 / 15.0F;
         float $$3 = $$2 * 0.6F + ($$2 > 0.0F ? 0.4F : 0.3F);
         float $$4 = asb.a($$2 * $$2 * 0.7F - 0.5F, 0.0F, 1.0F);
         float $$5 = asb.a($$2 * $$2 * 0.6F - 0.7F, 0.0F, 1.0F);
         $$0[$$1] = new ehh((double)$$3, (double)$$4, (double)$$5);
      }
   });
   private static final float H = 0.2F;
   private final dfd I;
   private boolean J = true;

   @Override
   public MapCodec<czc> a() {
      return a;
   }

   public czc(dfc.d $$0) {
      super($$0);
      this.k(this.E.b().a(b, dgi.c).a(c, dgi.c).a(d, dgi.c).a(e, dgi.c).a(f, Integer.valueOf(0)));
      this.I = this.o().a(b, dgi.b).a(c, dgi.b).a(d, dgi.b).a(e, dgi.b);
      UnmodifiableIterator var2 = this.n().a().iterator();

      while (var2.hasNext()) {
         dfd $$1 = (dfd)var2.next();
         if ($$1.c(f) == 0) {
            F.put($$1, this.n($$1));
         }
      }
   }

   private eia n(dfd $$0) {
      eia $$1 = m;

      for (ha $$2 : ha.c.a) {
         dgi $$3 = $$0.c(g.get($$2));
         if ($$3 == dgi.b) {
            $$1 = ehx.a($$1, n.get($$2));
         } else if ($$3 == dgi.a) {
            $$1 = ehx.a($$1, o.get($$2));
         }
      }

      return $$1;
   }

   @Override
   public eia a(dfd $$0, cph $$1, gw $$2, ehm $$3) {
      return F.get($$0.a(f, Integer.valueOf(0)));
   }

   @Override
   public dfd a(clt $$0) {
      return this.a($$0.q(), this.I, $$0.a());
   }

   private dfd a(cph $$0, dfd $$1, gw $$2) {
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
            $$1 = $$1.a(e, dgi.b);
         }

         if (!$$6 && $$8) {
            $$1 = $$1.a(c, dgi.b);
         }

         if (!$$4 && $$9) {
            $$1 = $$1.a(b, dgi.b);
         }

         if (!$$5 && $$9) {
            $$1 = $$1.a(d, dgi.b);
         }

         return $$1;
      }
   }

   private dfd b(cph $$0, dfd $$1, gw $$2) {
      boolean $$3 = !$$0.a_($$2.c()).g($$0, $$2);

      for (ha $$4 : ha.c.a) {
         if (!$$1.c(g.get($$4)).a()) {
            dgi $$5 = this.a($$0, $$2, $$4, $$3);
            $$1 = $$1.a(g.get($$4), $$5);
         }
      }

      return $$1;
   }

   @Override
   public dfd a(dfd $$0, ha $$1, dfd $$2, cqc $$3, gw $$4, gw $$5) {
      if ($$1 == ha.a) {
         return !this.a($$3, $$5, $$2) ? cte.a.o() : $$0;
      } else if ($$1 == ha.b) {
         return this.a($$3, $$0, $$4);
      } else {
         dgi $$6 = this.a($$3, $$4, $$1);
         return $$6.a() == $$0.c(g.get($$1)).a() && !o($$0) ? $$0.a(g.get($$1), $$6) : this.a($$3, this.I.a(f, $$0.c(f)).a(g.get($$1), $$6), $$4);
      }
   }

   private static boolean o(dfd $$0) {
      return $$0.c(b).a() && $$0.c(d).a() && $$0.c(c).a() && $$0.c(e).a();
   }

   private static boolean p(dfd $$0) {
      return !$$0.c(b).a() && !$$0.c(d).a() && !$$0.c(c).a() && !$$0.c(e).a();
   }

   @Override
   public void a(dfd $$0, cqc $$1, gw $$2, int $$3, int $$4) {
      gw.a $$5 = new gw.a();

      for (ha $$6 : ha.c.a) {
         dgi $$7 = $$0.c(g.get($$6));
         if ($$7 != dgi.c && !$$1.a_($$5.a($$2, $$6)).a(this)) {
            $$5.c(ha.a);
            dfd $$8 = $$1.a_($$5);
            if ($$8.a(this)) {
               gw $$9 = $$5.a($$6.g());
               $$1.a($$6.g(), $$1.a_($$9), $$5, $$9, $$3, $$4);
            }

            $$5.a($$2, $$6).c(ha.b);
            dfd $$10 = $$1.a_($$5);
            if ($$10.a(this)) {
               gw $$11 = $$5.a($$6.g());
               $$1.a($$6.g(), $$1.a_($$11), $$5, $$11, $$3, $$4);
            }
         }
      }
   }

   private dgi a(cph $$0, gw $$1, ha $$2) {
      return this.a($$0, $$1, $$2, !$$0.a_($$1.c()).g($$0, $$1));
   }

   private dgi a(cph $$0, gw $$1, ha $$2, boolean $$3) {
      gw $$4 = $$1.a($$2);
      dfd $$5 = $$0.a_($$4);
      if ($$3) {
         boolean $$6 = $$5.b() instanceof dbm || this.a($$0, $$4, $$5);
         if ($$6 && h($$0.a_($$4.c()))) {
            if ($$5.d($$0, $$4, $$2.g())) {
               return dgi.a;
            }

            return dgi.b;
         }
      }

      return !a($$5, $$2) && ($$5.g($$0, $$4) || !h($$0.a_($$4.d()))) ? dgi.c : dgi.b;
   }

   @Override
   public boolean a(dfd $$0, cqe $$1, gw $$2) {
      gw $$3 = $$2.d();
      dfd $$4 = $$1.a_($$3);
      return this.a($$1, $$3, $$4);
   }

   private boolean a(cph $$0, gw $$1, dfd $$2) {
      return $$2.d($$0, $$1, ha.b) || $$2.a(cte.hc);
   }

   private void a(cqb $$0, gw $$1, dfd $$2) {
      int $$3 = this.a($$0, $$1);
      if ($$2.c(f) != $$3) {
         if ($$0.a_($$1) == $$2) {
            $$0.a($$1, $$2.a(f, Integer.valueOf($$3)), 2);
         }

         Set<gw> $$4 = Sets.newHashSet();
         $$4.add($$1);

         for (ha $$5 : ha.values()) {
            $$4.add($$1.a($$5));
         }

         for (gw $$6 : $$4) {
            $$0.a($$6, this);
         }
      }
   }

   private int a(cqb $$0, gw $$1) {
      this.J = false;
      int $$2 = $$0.C($$1);
      this.J = true;
      int $$3 = 0;
      if ($$2 < 15) {
         for (ha $$4 : ha.c.a) {
            gw $$5 = $$1.a($$4);
            dfd $$6 = $$0.a_($$5);
            $$3 = Math.max($$3, this.q($$6));
            gw $$7 = $$1.c();
            if ($$6.g($$0, $$5) && !$$0.a_($$7).g($$0, $$7)) {
               $$3 = Math.max($$3, this.q($$0.a_($$5.c())));
            } else if (!$$6.g($$0, $$5)) {
               $$3 = Math.max($$3, this.q($$0.a_($$5.d())));
            }
         }
      }

      return Math.max($$2, $$3 - 1);
   }

   private int q(dfd $$0) {
      return $$0.a(this) ? $$0.c(f) : 0;
   }

   private void b(cqb $$0, gw $$1) {
      if ($$0.a_($$1).a(this)) {
         $$0.a($$1, this);

         for (ha $$2 : ha.values()) {
            $$0.a($$1.a($$2), this);
         }
      }
   }

   @Override
   public void b(dfd $$0, cqb $$1, gw $$2, dfd $$3, boolean $$4) {
      if (!$$3.a($$0.b()) && !$$1.B) {
         this.a($$1, $$2, $$0);

         for (ha $$5 : ha.c.b) {
            $$1.a($$2.a($$5), this);
         }

         this.c($$1, $$2);
      }
   }

   @Override
   public void a(dfd $$0, cqb $$1, gw $$2, dfd $$3, boolean $$4) {
      if (!$$4 && !$$0.a($$3.b())) {
         super.a($$0, $$1, $$2, $$3, $$4);
         if (!$$1.B) {
            for (ha $$5 : ha.values()) {
               $$1.a($$2.a($$5), this);
            }

            this.a($$1, $$2, $$0);
            this.c($$1, $$2);
         }
      }
   }

   private void c(cqb $$0, gw $$1) {
      for (ha $$2 : ha.c.a) {
         this.b($$0, $$1.a($$2));
      }

      for (ha $$3 : ha.c.a) {
         gw $$4 = $$1.a($$3);
         if ($$0.a_($$4).g($$0, $$4)) {
            this.b($$0, $$4.c());
         } else {
            this.b($$0, $$4.d());
         }
      }
   }

   @Override
   public void a(dfd $$0, cqb $$1, gw $$2, ctc $$3, gw $$4, boolean $$5) {
      if (!$$1.B) {
         if ($$0.a((cqe)$$1, $$2)) {
            this.a($$1, $$2, $$0);
         } else {
            c($$0, $$1, $$2);
            $$1.a($$2, false);
         }
      }
   }

   @Override
   public int b(dfd $$0, cph $$1, gw $$2, ha $$3) {
      return !this.J ? 0 : $$0.b($$1, $$2, $$3);
   }

   @Override
   public int a(dfd $$0, cph $$1, gw $$2, ha $$3) {
      if (this.J && $$3 != ha.a) {
         int $$4 = $$0.c(f);
         if ($$4 == 0) {
            return 0;
         } else {
            return $$3 != ha.b && !this.a($$1, $$0, $$2).c(g.get($$3.g())).a() ? 0 : $$4;
         }
      } else {
         return 0;
      }
   }

   protected static boolean h(dfd $$0) {
      return a($$0, null);
   }

   protected static boolean a(dfd $$0, @Nullable ha $$1) {
      if ($$0.a(cte.cw)) {
         return true;
      } else if ($$0.a(cte.eh)) {
         ha $$2 = $$0.c(czh.aE);
         return $$2 == $$1 || $$2.g() == $$1;
      } else {
         return $$0.a(cte.kO) ? $$1 == $$0.c(cyl.a) : $$0.m() && $$1 != null;
      }
   }

   @Override
   public boolean f_(dfd $$0) {
      return this.J;
   }

   public static int b(int $$0) {
      ehh $$1 = G[$$0];
      return asb.f((float)$$1.a(), (float)$$1.b(), (float)$$1.c());
   }

   private void a(cqb $$0, ash $$1, gw $$2, ehh $$3, ha $$4, ha $$5, float $$6, float $$7) {
      float $$8 = $$7 - $$6;
      if (!($$1.i() >= 0.2F * $$8)) {
         float $$9 = 0.4375F;
         float $$10 = $$6 + $$8 * $$1.i();
         double $$11 = 0.5 + (double)(0.4375F * (float)$$4.j()) + (double)($$10 * (float)$$5.j());
         double $$12 = 0.5 + (double)(0.4375F * (float)$$4.k()) + (double)($$10 * (float)$$5.k());
         double $$13 = 0.5 + (double)(0.4375F * (float)$$4.l()) + (double)($$10 * (float)$$5.l());
         $$0.a(new ip($$3.j(), 1.0F), (double)$$2.u() + $$11, (double)$$2.v() + $$12, (double)$$2.w() + $$13, 0.0, 0.0, 0.0);
      }
   }

   @Override
   public void a(dfd $$0, cqb $$1, gw $$2, ash $$3) {
      int $$4 = $$0.c(f);
      if ($$4 != 0) {
         for (ha $$5 : ha.c.a) {
            dgi $$6 = $$0.c(g.get($$5));
            switch ($$6) {
               case a:
                  this.a($$1, $$3, $$2, G[$$4], $$5, ha.b, -0.5F, 0.5F);
               case b:
                  this.a($$1, $$3, $$2, G[$$4], ha.a, $$5, 0.0F, 0.5F);
                  break;
               case c:
               default:
                  this.a($$1, $$3, $$2, G[$$4], ha.a, $$5, 0.0F, 0.3F);
            }
         }
      }
   }

   @Override
   public dfd a(dfd $$0, czn $$1) {
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
   public dfd a(dfd $$0, cxx $$1) {
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
   protected void a(dfe.a<ctc, dfd> $$0) {
      $$0.a(b, c, d, e, f);
   }

   @Override
   public bhe a(dfd $$0, cqb $$1, gw $$2, cca $$3, bhd $$4, ehd $$5) {
      if (!$$3.fT().e) {
         return bhe.d;
      } else {
         if (o($$0) || p($$0)) {
            dfd $$6 = o($$0) ? this.o() : this.I;
            $$6 = $$6.a(f, $$0.c(f));
            $$6 = this.a($$1, $$6, $$2);
            if ($$6 != $$0) {
               $$1.a($$2, $$6, 3);
               this.a($$1, $$2, $$0, $$6);
               return bhe.a;
            }
         }

         return bhe.d;
      }
   }

   private void a(cqb $$0, gw $$1, dfd $$2, dfd $$3) {
      for (ha $$4 : ha.c.a) {
         gw $$5 = $$1.a($$4);
         if ($$2.c(g.get($$4)).a() != $$3.c(g.get($$4)).a() && $$0.a_($$5).g($$0, $$5)) {
            $$0.a($$5, $$3.b(), $$4.g());
         }
      }
   }
}
