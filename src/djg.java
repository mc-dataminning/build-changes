import com.google.common.collect.ImmutableMap;
import com.google.common.collect.Maps;
import com.google.common.collect.Sets;
import com.google.common.collect.UnmodifiableIterator;
import com.mojang.serialization.MapCodec;
import java.util.Map;
import java.util.Set;
import javax.annotation.Nullable;

public class djg extends dde {
   public static final MapCodec<djg> a = b(djg::new);
   public static final drf<drm> b = dqx.ab;
   public static final drf<drm> c = dqx.aa;
   public static final drf<drm> d = dqx.ac;
   public static final drf<drm> e = dqx.ad;
   public static final drh f = dqx.aT;
   public static final Map<is, drf<drm>> g = Maps.newEnumMap(ImmutableMap.of(is.c, b, is.f, c, is.d, d, is.e, e));
   protected static final int h = 1;
   protected static final int i = 3;
   protected static final int j = 13;
   protected static final int k = 3;
   protected static final int l = 13;
   private static final eui m = dde.a(3.0, 0.0, 3.0, 13.0, 1.0, 13.0);
   private static final Map<is, eui> n = Maps.newEnumMap(
      ImmutableMap.of(
         is.c,
         dde.a(3.0, 0.0, 0.0, 13.0, 1.0, 13.0),
         is.d,
         dde.a(3.0, 0.0, 3.0, 13.0, 1.0, 16.0),
         is.f,
         dde.a(3.0, 0.0, 3.0, 16.0, 1.0, 13.0),
         is.e,
         dde.a(0.0, 0.0, 3.0, 13.0, 1.0, 13.0)
      )
   );
   private static final Map<is, eui> o = Maps.newEnumMap(
      ImmutableMap.of(
         is.c,
         euf.a(n.get(is.c), dde.a(3.0, 0.0, 0.0, 13.0, 16.0, 1.0)),
         is.d,
         euf.a(n.get(is.d), dde.a(3.0, 0.0, 15.0, 13.0, 16.0, 16.0)),
         is.f,
         euf.a(n.get(is.f), dde.a(15.0, 0.0, 3.0, 16.0, 16.0, 13.0)),
         is.e,
         euf.a(n.get(is.e), dde.a(0.0, 0.0, 3.0, 1.0, 16.0, 13.0))
      )
   );
   private static final Map<dqh, eui> F = Maps.newHashMap();
   private static final etp[] G = ac.a(new etp[16], $$0 -> {
      for (int $$1 = 0; $$1 <= 15; $$1++) {
         float $$2 = (float)$$1 / 15.0F;
         float $$3 = $$2 * 0.6F + ($$2 > 0.0F ? 0.4F : 0.3F);
         float $$4 = axz.a($$2 * $$2 * 0.7F - 0.5F, 0.0F, 1.0F);
         float $$5 = axz.a($$2 * $$2 * 0.6F - 0.7F, 0.0F, 1.0F);
         $$0[$$1] = new etp((double)$$3, (double)$$4, (double)$$5);
      }
   });
   private static final float H = 0.2F;
   private final dqh I;
   private boolean J = true;

   @Override
   public MapCodec<djg> a() {
      return a;
   }

   public djg(dqg.d $$0) {
      super($$0);
      this.k(this.E.b().a(b, drm.c).a(c, drm.c).a(d, drm.c).a(e, drm.c).a(f, Integer.valueOf(0)));
      this.I = this.n().a(b, drm.b).a(c, drm.b).a(d, drm.b).a(e, drm.b);
      UnmodifiableIterator var2 = this.l().a().iterator();

      while (var2.hasNext()) {
         dqh $$1 = (dqh)var2.next();
         if ($$1.c(f) == 0) {
            F.put($$1, this.n($$1));
         }
      }
   }

   private eui n(dqh $$0) {
      eui $$1 = m;

      for (is $$2 : is.c.a) {
         drm $$3 = $$0.c(g.get($$2));
         if ($$3 == drm.b) {
            $$1 = euf.a($$1, n.get($$2));
         } else if ($$3 == drm.a) {
            $$1 = euf.a($$1, o.get($$2));
         }
      }

      return $$1;
   }

   @Override
   protected eui a(dqh $$0, czj $$1, in $$2, etu $$3) {
      return F.get($$0.a(f, Integer.valueOf(0)));
   }

   @Override
   public dqh a(cwi $$0) {
      return this.a($$0.q(), this.I, $$0.a());
   }

   private dqh a(czj $$0, dqh $$1, in $$2) {
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
            $$1 = $$1.a(e, drm.b);
         }

         if (!$$6 && $$8) {
            $$1 = $$1.a(c, drm.b);
         }

         if (!$$4 && $$9) {
            $$1 = $$1.a(b, drm.b);
         }

         if (!$$5 && $$9) {
            $$1 = $$1.a(d, drm.b);
         }

         return $$1;
      }
   }

   private dqh b(czj $$0, dqh $$1, in $$2) {
      boolean $$3 = !$$0.a_($$2.c()).g($$0, $$2);

      for (is $$4 : is.c.a) {
         if (!$$1.c(g.get($$4)).a()) {
            drm $$5 = this.a($$0, $$2, $$4, $$3);
            $$1 = $$1.a(g.get($$4), $$5);
         }
      }

      return $$1;
   }

   @Override
   protected dqh a(dqh $$0, is $$1, dqh $$2, dae $$3, in $$4, in $$5) {
      if ($$1 == is.a) {
         return !this.a($$3, $$5, $$2) ? ddg.a.n() : $$0;
      } else if ($$1 == is.b) {
         return this.a($$3, $$0, $$4);
      } else {
         drm $$6 = this.a($$3, $$4, $$1);
         return $$6.a() == $$0.c(g.get($$1)).a() && !o($$0) ? $$0.a(g.get($$1), $$6) : this.a($$3, this.I.a(f, $$0.c(f)).a(g.get($$1), $$6), $$4);
      }
   }

   private static boolean o(dqh $$0) {
      return $$0.c(b).a() && $$0.c(d).a() && $$0.c(c).a() && $$0.c(e).a();
   }

   private static boolean p(dqh $$0) {
      return !$$0.c(b).a() && !$$0.c(d).a() && !$$0.c(c).a() && !$$0.c(e).a();
   }

   @Override
   protected void a(dqh $$0, dae $$1, in $$2, int $$3, int $$4) {
      in.a $$5 = new in.a();

      for (is $$6 : is.c.a) {
         drm $$7 = $$0.c(g.get($$6));
         if ($$7 != drm.c && !$$1.a_($$5.a($$2, $$6)).a(this)) {
            $$5.c(is.a);
            dqh $$8 = $$1.a_($$5);
            if ($$8.a(this)) {
               in $$9 = $$5.a($$6.g());
               $$1.a($$6.g(), $$1.a_($$9), $$5, $$9, $$3, $$4);
            }

            $$5.a($$2, $$6).c(is.b);
            dqh $$10 = $$1.a_($$5);
            if ($$10.a(this)) {
               in $$11 = $$5.a($$6.g());
               $$1.a($$6.g(), $$1.a_($$11), $$5, $$11, $$3, $$4);
            }
         }
      }
   }

   private drm a(czj $$0, in $$1, is $$2) {
      return this.a($$0, $$1, $$2, !$$0.a_($$1.c()).g($$0, $$1));
   }

   private drm a(czj $$0, in $$1, is $$2, boolean $$3) {
      in $$4 = $$1.a($$2);
      dqh $$5 = $$0.a_($$4);
      if ($$3) {
         boolean $$6 = $$5.b() instanceof dlr || this.a($$0, $$4, $$5);
         if ($$6 && m($$0.a_($$4.c()))) {
            if ($$5.d($$0, $$4, $$2.g())) {
               return drm.a;
            }

            return drm.b;
         }
      }

      return !a($$5, $$2) && ($$5.g($$0, $$4) || !m($$0.a_($$4.d()))) ? drm.c : drm.b;
   }

   @Override
   protected boolean a(dqh $$0, dag $$1, in $$2) {
      in $$3 = $$2.d();
      dqh $$4 = $$1.a_($$3);
      return this.a($$1, $$3, $$4);
   }

   private boolean a(czj $$0, in $$1, dqh $$2) {
      return $$2.d($$0, $$1, is.b) || $$2.a(ddg.hc);
   }

   private void a(dad $$0, in $$1, dqh $$2) {
      int $$3 = this.a($$0, $$1);
      if ($$2.c(f) != $$3) {
         if ($$0.a_($$1) == $$2) {
            $$0.a($$1, $$2.a(f, Integer.valueOf($$3)), 2);
         }

         Set<in> $$4 = Sets.newHashSet();
         $$4.add($$1);

         for (is $$5 : is.values()) {
            $$4.add($$1.a($$5));
         }

         for (in $$6 : $$4) {
            $$0.a($$6, this);
         }
      }
   }

   private int a(dad $$0, in $$1) {
      this.J = false;
      int $$2 = $$0.D($$1);
      this.J = true;
      int $$3 = 0;
      if ($$2 < 15) {
         for (is $$4 : is.c.a) {
            in $$5 = $$1.a($$4);
            dqh $$6 = $$0.a_($$5);
            $$3 = Math.max($$3, this.q($$6));
            in $$7 = $$1.c();
            if ($$6.g($$0, $$5) && !$$0.a_($$7).g($$0, $$7)) {
               $$3 = Math.max($$3, this.q($$0.a_($$5.c())));
            } else if (!$$6.g($$0, $$5)) {
               $$3 = Math.max($$3, this.q($$0.a_($$5.d())));
            }
         }
      }

      return Math.max($$2, $$3 - 1);
   }

   private int q(dqh $$0) {
      return $$0.a(this) ? $$0.c(f) : 0;
   }

   private void b(dad $$0, in $$1) {
      if ($$0.a_($$1).a(this)) {
         $$0.a($$1, this);

         for (is $$2 : is.values()) {
            $$0.a($$1.a($$2), this);
         }
      }
   }

   @Override
   protected void b(dqh $$0, dad $$1, in $$2, dqh $$3, boolean $$4) {
      if (!$$3.a($$0.b()) && !$$1.B) {
         this.a($$1, $$2, $$0);

         for (is $$5 : is.c.b) {
            $$1.a($$2.a($$5), this);
         }

         this.c($$1, $$2);
      }
   }

   @Override
   protected void a(dqh $$0, dad $$1, in $$2, dqh $$3, boolean $$4) {
      if (!$$4 && !$$0.a($$3.b())) {
         super.a($$0, $$1, $$2, $$3, $$4);
         if (!$$1.B) {
            for (is $$5 : is.values()) {
               $$1.a($$2.a($$5), this);
            }

            this.a($$1, $$2, $$0);
            this.c($$1, $$2);
         }
      }
   }

   private void c(dad $$0, in $$1) {
      for (is $$2 : is.c.a) {
         this.b($$0, $$1.a($$2));
      }

      for (is $$3 : is.c.a) {
         in $$4 = $$1.a($$3);
         if ($$0.a_($$4).g($$0, $$4)) {
            this.b($$0, $$4.c());
         } else {
            this.b($$0, $$4.d());
         }
      }
   }

   @Override
   protected void a(dqh $$0, dad $$1, in $$2, dde $$3, in $$4, boolean $$5) {
      if (!$$1.B) {
         if ($$0.a((dag)$$1, $$2)) {
            this.a($$1, $$2, $$0);
         } else {
            c($$0, $$1, $$2);
            $$1.a($$2, false);
         }
      }
   }

   @Override
   protected int b(dqh $$0, czj $$1, in $$2, is $$3) {
      return !this.J ? 0 : $$0.b($$1, $$2, $$3);
   }

   @Override
   protected int a(dqh $$0, czj $$1, in $$2, is $$3) {
      if (this.J && $$3 != is.a) {
         int $$4 = $$0.c(f);
         if ($$4 == 0) {
            return 0;
         } else {
            return $$3 != is.b && !this.a($$1, $$0, $$2).c(g.get($$3.g())).a() ? 0 : $$4;
         }
      } else {
         return 0;
      }
   }

   protected static boolean m(dqh $$0) {
      return a($$0, null);
   }

   protected static boolean a(dqh $$0, @Nullable is $$1) {
      if ($$0.a(ddg.cw)) {
         return true;
      } else if ($$0.a(ddg.eh)) {
         is $$2 = $$0.c(djl.aE);
         return $$2 == $$1 || $$2.g() == $$1;
      } else {
         return $$0.a(ddg.kO) ? $$1 == $$0.c(dip.a) : $$0.m() && $$1 != null;
      }
   }

   @Override
   protected boolean e_(dqh $$0) {
      return this.J;
   }

   public static int b(int $$0) {
      etp $$1 = G[$$0];
      return axz.f((float)$$1.a(), (float)$$1.b(), (float)$$1.c());
   }

   private void a(dad $$0, ayg $$1, in $$2, etp $$3, is $$4, is $$5, float $$6, float $$7) {
      float $$8 = $$7 - $$6;
      if (!($$1.i() >= 0.2F * $$8)) {
         float $$9 = 0.4375F;
         float $$10 = $$6 + $$8 * $$1.i();
         double $$11 = 0.5 + (double)(0.4375F * (float)$$4.j()) + (double)($$10 * (float)$$5.j());
         double $$12 = 0.5 + (double)(0.4375F * (float)$$4.k()) + (double)($$10 * (float)$$5.k());
         double $$13 = 0.5 + (double)(0.4375F * (float)$$4.l()) + (double)($$10 * (float)$$5.l());
         $$0.a(new kr($$3.j(), 1.0F), (double)$$2.u() + $$11, (double)$$2.v() + $$12, (double)$$2.w() + $$13, 0.0, 0.0, 0.0);
      }
   }

   @Override
   public void a(dqh $$0, dad $$1, in $$2, ayg $$3) {
      int $$4 = $$0.c(f);
      if ($$4 != 0) {
         for (is $$5 : is.c.a) {
            drm $$6 = $$0.c(g.get($$5));
            switch ($$6) {
               case a:
                  this.a($$1, $$3, $$2, G[$$4], $$5, is.b, -0.5F, 0.5F);
               case b:
                  this.a($$1, $$3, $$2, G[$$4], is.a, $$5, 0.0F, 0.5F);
                  break;
               case c:
               default:
                  this.a($$1, $$3, $$2, G[$$4], is.a, $$5, 0.0F, 0.3F);
            }
         }
      }
   }

   @Override
   protected dqh a(dqh $$0, djr $$1) {
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
   protected dqh a(dqh $$0, dib $$1) {
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
   protected void a(dqi.a<dde, dqh> $$0) {
      $$0.a(b, c, d, e, f);
   }

   @Override
   protected bpm a(dqh $$0, dad $$1, in $$2, clh $$3, etl $$4) {
      if (!$$3.gb().e) {
         return bpm.d;
      } else {
         if (o($$0) || p($$0)) {
            dqh $$5 = o($$0) ? this.n() : this.I;
            $$5 = $$5.a(f, $$0.c(f));
            $$5 = this.a($$1, $$5, $$2);
            if ($$5 != $$0) {
               $$1.a($$2, $$5, 3);
               this.a($$1, $$2, $$0, $$5);
               return bpm.a;
            }
         }

         return bpm.d;
      }
   }

   private void a(dad $$0, in $$1, dqh $$2, dqh $$3) {
      for (is $$4 : is.c.a) {
         in $$5 = $$1.a($$4);
         if ($$2.c(g.get($$4)).a() != $$3.c(g.get($$4)).a() && $$0.a_($$5).g($$0, $$5)) {
            $$0.a($$5, $$3.b(), $$4.g());
         }
      }
   }
}
