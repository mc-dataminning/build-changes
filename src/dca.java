import com.google.common.collect.ImmutableMap;
import com.google.common.collect.Maps;
import com.google.common.collect.Sets;
import com.google.common.collect.UnmodifiableIterator;
import com.mojang.serialization.MapCodec;
import java.util.Map;
import java.util.Set;
import javax.annotation.Nullable;

public class dca extends cvz {
   public static final MapCodec<dca> a = b(dca::new);
   public static final djn<dju> b = djf.ab;
   public static final djn<dju> c = djf.aa;
   public static final djn<dju> d = djf.ac;
   public static final djn<dju> e = djf.ad;
   public static final djp f = djf.aT;
   public static final Map<ia, djn<dju>> g = Maps.newEnumMap(ImmutableMap.of(ia.c, b, ia.f, c, ia.d, d, ia.e, e));
   protected static final int h = 1;
   protected static final int i = 3;
   protected static final int j = 13;
   protected static final int k = 3;
   protected static final int l = 13;
   private static final elu m = cvz.a(3.0, 0.0, 3.0, 13.0, 1.0, 13.0);
   private static final Map<ia, elu> n = Maps.newEnumMap(
      ImmutableMap.of(
         ia.c,
         cvz.a(3.0, 0.0, 0.0, 13.0, 1.0, 13.0),
         ia.d,
         cvz.a(3.0, 0.0, 3.0, 13.0, 1.0, 16.0),
         ia.f,
         cvz.a(3.0, 0.0, 3.0, 16.0, 1.0, 13.0),
         ia.e,
         cvz.a(0.0, 0.0, 3.0, 13.0, 1.0, 13.0)
      )
   );
   private static final Map<ia, elu> o = Maps.newEnumMap(
      ImmutableMap.of(
         ia.c,
         elr.a(n.get(ia.c), cvz.a(3.0, 0.0, 0.0, 13.0, 16.0, 1.0)),
         ia.d,
         elr.a(n.get(ia.d), cvz.a(3.0, 0.0, 15.0, 13.0, 16.0, 16.0)),
         ia.f,
         elr.a(n.get(ia.f), cvz.a(15.0, 0.0, 3.0, 16.0, 16.0, 13.0)),
         ia.e,
         elr.a(n.get(ia.e), cvz.a(0.0, 0.0, 3.0, 1.0, 16.0, 13.0))
      )
   );
   private static final Map<dip, elu> F = Maps.newHashMap();
   private static final elb[] G = ac.a(new elb[16], $$0 -> {
      for (int $$1 = 0; $$1 <= 15; $$1++) {
         float $$2 = (float)$$1 / 15.0F;
         float $$3 = $$2 * 0.6F + ($$2 > 0.0F ? 0.4F : 0.3F);
         float $$4 = aty.a($$2 * $$2 * 0.7F - 0.5F, 0.0F, 1.0F);
         float $$5 = aty.a($$2 * $$2 * 0.6F - 0.7F, 0.0F, 1.0F);
         $$0[$$1] = new elb((double)$$3, (double)$$4, (double)$$5);
      }
   });
   private static final float H = 0.2F;
   private final dip I;
   private boolean J = true;

   @Override
   public MapCodec<dca> a() {
      return a;
   }

   public dca(dio.d $$0) {
      super($$0);
      this.k(this.E.b().a(b, dju.c).a(c, dju.c).a(d, dju.c).a(e, dju.c).a(f, Integer.valueOf(0)));
      this.I = this.o().a(b, dju.b).a(c, dju.b).a(d, dju.b).a(e, dju.b);
      UnmodifiableIterator var2 = this.n().a().iterator();

      while (var2.hasNext()) {
         dip $$1 = (dip)var2.next();
         if ($$1.c(f) == 0) {
            F.put($$1, this.n($$1));
         }
      }
   }

   private elu n(dip $$0) {
      elu $$1 = m;

      for (ia $$2 : ia.c.a) {
         dju $$3 = $$0.c(g.get($$2));
         if ($$3 == dju.b) {
            $$1 = elr.a($$1, n.get($$2));
         } else if ($$3 == dju.a) {
            $$1 = elr.a($$1, o.get($$2));
         }
      }

      return $$1;
   }

   @Override
   public elu a(dip $$0, cse $$1, hv $$2, elg $$3) {
      return F.get($$0.a(f, Integer.valueOf(0)));
   }

   @Override
   public dip a(coq $$0) {
      return this.a($$0.q(), this.I, $$0.a());
   }

   private dip a(cse $$0, dip $$1, hv $$2) {
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
            $$1 = $$1.a(e, dju.b);
         }

         if (!$$6 && $$8) {
            $$1 = $$1.a(c, dju.b);
         }

         if (!$$4 && $$9) {
            $$1 = $$1.a(b, dju.b);
         }

         if (!$$5 && $$9) {
            $$1 = $$1.a(d, dju.b);
         }

         return $$1;
      }
   }

   private dip b(cse $$0, dip $$1, hv $$2) {
      boolean $$3 = !$$0.a_($$2.c()).g($$0, $$2);

      for (ia $$4 : ia.c.a) {
         if (!$$1.c(g.get($$4)).a()) {
            dju $$5 = this.a($$0, $$2, $$4, $$3);
            $$1 = $$1.a(g.get($$4), $$5);
         }
      }

      return $$1;
   }

   @Override
   public dip a(dip $$0, ia $$1, dip $$2, csz $$3, hv $$4, hv $$5) {
      if ($$1 == ia.a) {
         return !this.a($$3, $$5, $$2) ? cwb.a.o() : $$0;
      } else if ($$1 == ia.b) {
         return this.a($$3, $$0, $$4);
      } else {
         dju $$6 = this.a($$3, $$4, $$1);
         return $$6.a() == $$0.c(g.get($$1)).a() && !o($$0) ? $$0.a(g.get($$1), $$6) : this.a($$3, this.I.a(f, $$0.c(f)).a(g.get($$1), $$6), $$4);
      }
   }

   private static boolean o(dip $$0) {
      return $$0.c(b).a() && $$0.c(d).a() && $$0.c(c).a() && $$0.c(e).a();
   }

   private static boolean p(dip $$0) {
      return !$$0.c(b).a() && !$$0.c(d).a() && !$$0.c(c).a() && !$$0.c(e).a();
   }

   @Override
   public void a(dip $$0, csz $$1, hv $$2, int $$3, int $$4) {
      hv.a $$5 = new hv.a();

      for (ia $$6 : ia.c.a) {
         dju $$7 = $$0.c(g.get($$6));
         if ($$7 != dju.c && !$$1.a_($$5.a($$2, $$6)).a(this)) {
            $$5.c(ia.a);
            dip $$8 = $$1.a_($$5);
            if ($$8.a(this)) {
               hv $$9 = $$5.a($$6.g());
               $$1.a($$6.g(), $$1.a_($$9), $$5, $$9, $$3, $$4);
            }

            $$5.a($$2, $$6).c(ia.b);
            dip $$10 = $$1.a_($$5);
            if ($$10.a(this)) {
               hv $$11 = $$5.a($$6.g());
               $$1.a($$6.g(), $$1.a_($$11), $$5, $$11, $$3, $$4);
            }
         }
      }
   }

   private dju a(cse $$0, hv $$1, ia $$2) {
      return this.a($$0, $$1, $$2, !$$0.a_($$1.c()).g($$0, $$1));
   }

   private dju a(cse $$0, hv $$1, ia $$2, boolean $$3) {
      hv $$4 = $$1.a($$2);
      dip $$5 = $$0.a_($$4);
      if ($$3) {
         boolean $$6 = $$5.b() instanceof del || this.a($$0, $$4, $$5);
         if ($$6 && h($$0.a_($$4.c()))) {
            if ($$5.d($$0, $$4, $$2.g())) {
               return dju.a;
            }

            return dju.b;
         }
      }

      return !a($$5, $$2) && ($$5.g($$0, $$4) || !h($$0.a_($$4.d()))) ? dju.c : dju.b;
   }

   @Override
   public boolean a(dip $$0, ctb $$1, hv $$2) {
      hv $$3 = $$2.d();
      dip $$4 = $$1.a_($$3);
      return this.a($$1, $$3, $$4);
   }

   private boolean a(cse $$0, hv $$1, dip $$2) {
      return $$2.d($$0, $$1, ia.b) || $$2.a(cwb.hc);
   }

   private void a(csy $$0, hv $$1, dip $$2) {
      int $$3 = this.a($$0, $$1);
      if ($$2.c(f) != $$3) {
         if ($$0.a_($$1) == $$2) {
            $$0.a($$1, $$2.a(f, Integer.valueOf($$3)), 2);
         }

         Set<hv> $$4 = Sets.newHashSet();
         $$4.add($$1);

         for (ia $$5 : ia.values()) {
            $$4.add($$1.a($$5));
         }

         for (hv $$6 : $$4) {
            $$0.a($$6, this);
         }
      }
   }

   private int a(csy $$0, hv $$1) {
      this.J = false;
      int $$2 = $$0.C($$1);
      this.J = true;
      int $$3 = 0;
      if ($$2 < 15) {
         for (ia $$4 : ia.c.a) {
            hv $$5 = $$1.a($$4);
            dip $$6 = $$0.a_($$5);
            $$3 = Math.max($$3, this.q($$6));
            hv $$7 = $$1.c();
            if ($$6.g($$0, $$5) && !$$0.a_($$7).g($$0, $$7)) {
               $$3 = Math.max($$3, this.q($$0.a_($$5.c())));
            } else if (!$$6.g($$0, $$5)) {
               $$3 = Math.max($$3, this.q($$0.a_($$5.d())));
            }
         }
      }

      return Math.max($$2, $$3 - 1);
   }

   private int q(dip $$0) {
      return $$0.a(this) ? $$0.c(f) : 0;
   }

   private void b(csy $$0, hv $$1) {
      if ($$0.a_($$1).a(this)) {
         $$0.a($$1, this);

         for (ia $$2 : ia.values()) {
            $$0.a($$1.a($$2), this);
         }
      }
   }

   @Override
   public void b(dip $$0, csy $$1, hv $$2, dip $$3, boolean $$4) {
      if (!$$3.a($$0.b()) && !$$1.B) {
         this.a($$1, $$2, $$0);

         for (ia $$5 : ia.c.b) {
            $$1.a($$2.a($$5), this);
         }

         this.c($$1, $$2);
      }
   }

   @Override
   public void a(dip $$0, csy $$1, hv $$2, dip $$3, boolean $$4) {
      if (!$$4 && !$$0.a($$3.b())) {
         super.a($$0, $$1, $$2, $$3, $$4);
         if (!$$1.B) {
            for (ia $$5 : ia.values()) {
               $$1.a($$2.a($$5), this);
            }

            this.a($$1, $$2, $$0);
            this.c($$1, $$2);
         }
      }
   }

   private void c(csy $$0, hv $$1) {
      for (ia $$2 : ia.c.a) {
         this.b($$0, $$1.a($$2));
      }

      for (ia $$3 : ia.c.a) {
         hv $$4 = $$1.a($$3);
         if ($$0.a_($$4).g($$0, $$4)) {
            this.b($$0, $$4.c());
         } else {
            this.b($$0, $$4.d());
         }
      }
   }

   @Override
   public void a(dip $$0, csy $$1, hv $$2, cvz $$3, hv $$4, boolean $$5) {
      if (!$$1.B) {
         if ($$0.a((ctb)$$1, $$2)) {
            this.a($$1, $$2, $$0);
         } else {
            c($$0, $$1, $$2);
            $$1.a($$2, false);
         }
      }
   }

   @Override
   public int b(dip $$0, cse $$1, hv $$2, ia $$3) {
      return !this.J ? 0 : $$0.b($$1, $$2, $$3);
   }

   @Override
   public int a(dip $$0, cse $$1, hv $$2, ia $$3) {
      if (this.J && $$3 != ia.a) {
         int $$4 = $$0.c(f);
         if ($$4 == 0) {
            return 0;
         } else {
            return $$3 != ia.b && !this.a($$1, $$0, $$2).c(g.get($$3.g())).a() ? 0 : $$4;
         }
      } else {
         return 0;
      }
   }

   protected static boolean h(dip $$0) {
      return a($$0, null);
   }

   protected static boolean a(dip $$0, @Nullable ia $$1) {
      if ($$0.a(cwb.cw)) {
         return true;
      } else if ($$0.a(cwb.eh)) {
         ia $$2 = $$0.c(dcf.aE);
         return $$2 == $$1 || $$2.g() == $$1;
      } else {
         return $$0.a(cwb.kO) ? $$1 == $$0.c(dbj.a) : $$0.m() && $$1 != null;
      }
   }

   @Override
   public boolean f_(dip $$0) {
      return this.J;
   }

   public static int b(int $$0) {
      elb $$1 = G[$$0];
      return aty.f((float)$$1.a(), (float)$$1.b(), (float)$$1.c());
   }

   private void a(csy $$0, auf $$1, hv $$2, elb $$3, ia $$4, ia $$5, float $$6, float $$7) {
      float $$8 = $$7 - $$6;
      if (!($$1.i() >= 0.2F * $$8)) {
         float $$9 = 0.4375F;
         float $$10 = $$6 + $$8 * $$1.i();
         double $$11 = 0.5 + (double)(0.4375F * (float)$$4.j()) + (double)($$10 * (float)$$5.j());
         double $$12 = 0.5 + (double)(0.4375F * (float)$$4.k()) + (double)($$10 * (float)$$5.k());
         double $$13 = 0.5 + (double)(0.4375F * (float)$$4.l()) + (double)($$10 * (float)$$5.l());
         $$0.a(new jp($$3.j(), 1.0F), (double)$$2.u() + $$11, (double)$$2.v() + $$12, (double)$$2.w() + $$13, 0.0, 0.0, 0.0);
      }
   }

   @Override
   public void a(dip $$0, csy $$1, hv $$2, auf $$3) {
      int $$4 = $$0.c(f);
      if ($$4 != 0) {
         for (ia $$5 : ia.c.a) {
            dju $$6 = $$0.c(g.get($$5));
            switch ($$6) {
               case a:
                  this.a($$1, $$3, $$2, G[$$4], $$5, ia.b, -0.5F, 0.5F);
               case b:
                  this.a($$1, $$3, $$2, G[$$4], ia.a, $$5, 0.0F, 0.5F);
                  break;
               case c:
               default:
                  this.a($$1, $$3, $$2, G[$$4], ia.a, $$5, 0.0F, 0.3F);
            }
         }
      }
   }

   @Override
   public dip a(dip $$0, dcl $$1) {
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
   public dip a(dip $$0, dav $$1) {
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
   protected void a(diq.a<cvz, dip> $$0) {
      $$0.a(b, c, d, e, f);
   }

   @Override
   public bjl a(dip $$0, csy $$1, hv $$2, cer $$3, bjk $$4, ekx $$5) {
      if (!$$3.fT().e) {
         return bjl.d;
      } else {
         if (o($$0) || p($$0)) {
            dip $$6 = o($$0) ? this.o() : this.I;
            $$6 = $$6.a(f, $$0.c(f));
            $$6 = this.a($$1, $$6, $$2);
            if ($$6 != $$0) {
               $$1.a($$2, $$6, 3);
               this.a($$1, $$2, $$0, $$6);
               return bjl.a;
            }
         }

         return bjl.d;
      }
   }

   private void a(csy $$0, hv $$1, dip $$2, dip $$3) {
      for (ia $$4 : ia.c.a) {
         hv $$5 = $$1.a($$4);
         if ($$2.c(g.get($$4)).a() != $$3.c(g.get($$4)).a() && $$0.a_($$5).g($$0, $$5)) {
            $$0.a($$5, $$3.b(), $$4.g());
         }
      }
   }
}
