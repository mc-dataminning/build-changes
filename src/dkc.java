import com.google.common.collect.ImmutableMap;
import com.google.common.collect.Maps;
import com.google.common.collect.Sets;
import com.google.common.collect.UnmodifiableIterator;
import com.mojang.serialization.MapCodec;
import java.util.Map;
import java.util.Set;
import javax.annotation.Nullable;

public class dkc extends dea {
   public static final MapCodec<dkc> a = b(dkc::new);
   public static final dsb<dsi> b = drt.ab;
   public static final dsb<dsi> c = drt.aa;
   public static final dsb<dsi> d = drt.ac;
   public static final dsb<dsi> e = drt.ad;
   public static final dsd f = drt.aT;
   public static final Map<it, dsb<dsi>> g = Maps.newEnumMap(ImmutableMap.of(it.c, b, it.f, c, it.d, d, it.e, e));
   protected static final int h = 1;
   protected static final int i = 3;
   protected static final int j = 13;
   protected static final int k = 3;
   protected static final int l = 13;
   private static final evf m = dea.a(3.0, 0.0, 3.0, 13.0, 1.0, 13.0);
   private static final Map<it, evf> n = Maps.newEnumMap(
      ImmutableMap.of(
         it.c,
         dea.a(3.0, 0.0, 0.0, 13.0, 1.0, 13.0),
         it.d,
         dea.a(3.0, 0.0, 3.0, 13.0, 1.0, 16.0),
         it.f,
         dea.a(3.0, 0.0, 3.0, 16.0, 1.0, 13.0),
         it.e,
         dea.a(0.0, 0.0, 3.0, 13.0, 1.0, 13.0)
      )
   );
   private static final Map<it, evf> o = Maps.newEnumMap(
      ImmutableMap.of(
         it.c,
         evc.a(n.get(it.c), dea.a(3.0, 0.0, 0.0, 13.0, 16.0, 1.0)),
         it.d,
         evc.a(n.get(it.d), dea.a(3.0, 0.0, 15.0, 13.0, 16.0, 16.0)),
         it.f,
         evc.a(n.get(it.f), dea.a(15.0, 0.0, 3.0, 16.0, 16.0, 13.0)),
         it.e,
         evc.a(n.get(it.e), dea.a(0.0, 0.0, 3.0, 1.0, 16.0, 13.0))
      )
   );
   private static final Map<drd, evf> F = Maps.newHashMap();
   private static final eum[] G = ac.a(new eum[16], $$0 -> {
      for (int $$1 = 0; $$1 <= 15; $$1++) {
         float $$2 = (float)$$1 / 15.0F;
         float $$3 = $$2 * 0.6F + ($$2 > 0.0F ? 0.4F : 0.3F);
         float $$4 = ayf.a($$2 * $$2 * 0.7F - 0.5F, 0.0F, 1.0F);
         float $$5 = ayf.a($$2 * $$2 * 0.6F - 0.7F, 0.0F, 1.0F);
         $$0[$$1] = new eum((double)$$3, (double)$$4, (double)$$5);
      }
   });
   private static final float H = 0.2F;
   private final drd I;
   private boolean J = true;

   @Override
   public MapCodec<dkc> a() {
      return a;
   }

   public dkc(drc.d $$0) {
      super($$0);
      this.k(this.E.b().a(b, dsi.c).a(c, dsi.c).a(d, dsi.c).a(e, dsi.c).a(f, Integer.valueOf(0)));
      this.I = this.n().a(b, dsi.b).a(c, dsi.b).a(d, dsi.b).a(e, dsi.b);
      UnmodifiableIterator var2 = this.l().a().iterator();

      while (var2.hasNext()) {
         drd $$1 = (drd)var2.next();
         if ($$1.c(f) == 0) {
            F.put($$1, this.n($$1));
         }
      }
   }

   private evf n(drd $$0) {
      evf $$1 = m;

      for (it $$2 : it.c.a) {
         dsi $$3 = $$0.c(g.get($$2));
         if ($$3 == dsi.b) {
            $$1 = evc.a($$1, n.get($$2));
         } else if ($$3 == dsi.a) {
            $$1 = evc.a($$1, o.get($$2));
         }
      }

      return $$1;
   }

   @Override
   protected evf a(drd $$0, daf $$1, io $$2, eur $$3) {
      return F.get($$0.a(f, Integer.valueOf(0)));
   }

   @Override
   public drd a(cxb $$0) {
      return this.a($$0.q(), this.I, $$0.a());
   }

   private drd a(daf $$0, drd $$1, io $$2) {
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
            $$1 = $$1.a(e, dsi.b);
         }

         if (!$$6 && $$8) {
            $$1 = $$1.a(c, dsi.b);
         }

         if (!$$4 && $$9) {
            $$1 = $$1.a(b, dsi.b);
         }

         if (!$$5 && $$9) {
            $$1 = $$1.a(d, dsi.b);
         }

         return $$1;
      }
   }

   private drd b(daf $$0, drd $$1, io $$2) {
      boolean $$3 = !$$0.a_($$2.c()).g($$0, $$2);

      for (it $$4 : it.c.a) {
         if (!$$1.c(g.get($$4)).a()) {
            dsi $$5 = this.a($$0, $$2, $$4, $$3);
            $$1 = $$1.a(g.get($$4), $$5);
         }
      }

      return $$1;
   }

   @Override
   protected drd a(drd $$0, it $$1, drd $$2, dba $$3, io $$4, io $$5) {
      if ($$1 == it.a) {
         return !this.a($$3, $$5, $$2) ? dec.a.n() : $$0;
      } else if ($$1 == it.b) {
         return this.a($$3, $$0, $$4);
      } else {
         dsi $$6 = this.a($$3, $$4, $$1);
         return $$6.a() == $$0.c(g.get($$1)).a() && !o($$0) ? $$0.a(g.get($$1), $$6) : this.a($$3, this.I.a(f, $$0.c(f)).a(g.get($$1), $$6), $$4);
      }
   }

   private static boolean o(drd $$0) {
      return $$0.c(b).a() && $$0.c(d).a() && $$0.c(c).a() && $$0.c(e).a();
   }

   private static boolean p(drd $$0) {
      return !$$0.c(b).a() && !$$0.c(d).a() && !$$0.c(c).a() && !$$0.c(e).a();
   }

   @Override
   protected void a(drd $$0, dba $$1, io $$2, int $$3, int $$4) {
      io.a $$5 = new io.a();

      for (it $$6 : it.c.a) {
         dsi $$7 = $$0.c(g.get($$6));
         if ($$7 != dsi.c && !$$1.a_($$5.a($$2, $$6)).a(this)) {
            $$5.c(it.a);
            drd $$8 = $$1.a_($$5);
            if ($$8.a(this)) {
               io $$9 = $$5.a($$6.g());
               $$1.a($$6.g(), $$1.a_($$9), $$5, $$9, $$3, $$4);
            }

            $$5.a($$2, $$6).c(it.b);
            drd $$10 = $$1.a_($$5);
            if ($$10.a(this)) {
               io $$11 = $$5.a($$6.g());
               $$1.a($$6.g(), $$1.a_($$11), $$5, $$11, $$3, $$4);
            }
         }
      }
   }

   private dsi a(daf $$0, io $$1, it $$2) {
      return this.a($$0, $$1, $$2, !$$0.a_($$1.c()).g($$0, $$1));
   }

   private dsi a(daf $$0, io $$1, it $$2, boolean $$3) {
      io $$4 = $$1.a($$2);
      drd $$5 = $$0.a_($$4);
      if ($$3) {
         boolean $$6 = $$5.b() instanceof dmn || this.a($$0, $$4, $$5);
         if ($$6 && m($$0.a_($$4.c()))) {
            if ($$5.d($$0, $$4, $$2.g())) {
               return dsi.a;
            }

            return dsi.b;
         }
      }

      return !a($$5, $$2) && ($$5.g($$0, $$4) || !m($$0.a_($$4.d()))) ? dsi.c : dsi.b;
   }

   @Override
   protected boolean a(drd $$0, dbc $$1, io $$2) {
      io $$3 = $$2.d();
      drd $$4 = $$1.a_($$3);
      return this.a($$1, $$3, $$4);
   }

   private boolean a(daf $$0, io $$1, drd $$2) {
      return $$2.d($$0, $$1, it.b) || $$2.a(dec.hc);
   }

   private void a(daz $$0, io $$1, drd $$2) {
      int $$3 = this.a($$0, $$1);
      if ($$2.c(f) != $$3) {
         if ($$0.a_($$1) == $$2) {
            $$0.a($$1, $$2.a(f, Integer.valueOf($$3)), 2);
         }

         Set<io> $$4 = Sets.newHashSet();
         $$4.add($$1);

         for (it $$5 : it.values()) {
            $$4.add($$1.a($$5));
         }

         for (io $$6 : $$4) {
            $$0.a($$6, this);
         }
      }
   }

   private int a(daz $$0, io $$1) {
      this.J = false;
      int $$2 = $$0.D($$1);
      this.J = true;
      int $$3 = 0;
      if ($$2 < 15) {
         for (it $$4 : it.c.a) {
            io $$5 = $$1.a($$4);
            drd $$6 = $$0.a_($$5);
            $$3 = Math.max($$3, this.q($$6));
            io $$7 = $$1.c();
            if ($$6.g($$0, $$5) && !$$0.a_($$7).g($$0, $$7)) {
               $$3 = Math.max($$3, this.q($$0.a_($$5.c())));
            } else if (!$$6.g($$0, $$5)) {
               $$3 = Math.max($$3, this.q($$0.a_($$5.d())));
            }
         }
      }

      return Math.max($$2, $$3 - 1);
   }

   private int q(drd $$0) {
      return $$0.a(this) ? $$0.c(f) : 0;
   }

   private void b(daz $$0, io $$1) {
      if ($$0.a_($$1).a(this)) {
         $$0.a($$1, this);

         for (it $$2 : it.values()) {
            $$0.a($$1.a($$2), this);
         }
      }
   }

   @Override
   protected void b(drd $$0, daz $$1, io $$2, drd $$3, boolean $$4) {
      if (!$$3.a($$0.b()) && !$$1.B) {
         this.a($$1, $$2, $$0);

         for (it $$5 : it.c.b) {
            $$1.a($$2.a($$5), this);
         }

         this.c($$1, $$2);
      }
   }

   @Override
   protected void a(drd $$0, daz $$1, io $$2, drd $$3, boolean $$4) {
      if (!$$4 && !$$0.a($$3.b())) {
         super.a($$0, $$1, $$2, $$3, $$4);
         if (!$$1.B) {
            for (it $$5 : it.values()) {
               $$1.a($$2.a($$5), this);
            }

            this.a($$1, $$2, $$0);
            this.c($$1, $$2);
         }
      }
   }

   private void c(daz $$0, io $$1) {
      for (it $$2 : it.c.a) {
         this.b($$0, $$1.a($$2));
      }

      for (it $$3 : it.c.a) {
         io $$4 = $$1.a($$3);
         if ($$0.a_($$4).g($$0, $$4)) {
            this.b($$0, $$4.c());
         } else {
            this.b($$0, $$4.d());
         }
      }
   }

   @Override
   protected void a(drd $$0, daz $$1, io $$2, dea $$3, io $$4, boolean $$5) {
      if (!$$1.B) {
         if ($$0.a((dbc)$$1, $$2)) {
            this.a($$1, $$2, $$0);
         } else {
            c($$0, $$1, $$2);
            $$1.a($$2, false);
         }
      }
   }

   @Override
   protected int b(drd $$0, daf $$1, io $$2, it $$3) {
      return !this.J ? 0 : $$0.b($$1, $$2, $$3);
   }

   @Override
   protected int a(drd $$0, daf $$1, io $$2, it $$3) {
      if (this.J && $$3 != it.a) {
         int $$4 = $$0.c(f);
         if ($$4 == 0) {
            return 0;
         } else {
            return $$3 != it.b && !this.a($$1, $$0, $$2).c(g.get($$3.g())).a() ? 0 : $$4;
         }
      } else {
         return 0;
      }
   }

   protected static boolean m(drd $$0) {
      return a($$0, null);
   }

   protected static boolean a(drd $$0, @Nullable it $$1) {
      if ($$0.a(dec.cw)) {
         return true;
      } else if ($$0.a(dec.eh)) {
         it $$2 = $$0.c(dkh.aE);
         return $$2 == $$1 || $$2.g() == $$1;
      } else {
         return $$0.a(dec.kO) ? $$1 == $$0.c(djl.a) : $$0.m() && $$1 != null;
      }
   }

   @Override
   protected boolean e_(drd $$0) {
      return this.J;
   }

   public static int b(int $$0) {
      eum $$1 = G[$$0];
      return ayf.f((float)$$1.a(), (float)$$1.b(), (float)$$1.c());
   }

   private void a(daz $$0, aym $$1, io $$2, eum $$3, it $$4, it $$5, float $$6, float $$7) {
      float $$8 = $$7 - $$6;
      if (!($$1.i() >= 0.2F * $$8)) {
         float $$9 = 0.4375F;
         float $$10 = $$6 + $$8 * $$1.i();
         double $$11 = 0.5 + (double)(0.4375F * (float)$$4.j()) + (double)($$10 * (float)$$5.j());
         double $$12 = 0.5 + (double)(0.4375F * (float)$$4.k()) + (double)($$10 * (float)$$5.k());
         double $$13 = 0.5 + (double)(0.4375F * (float)$$4.l()) + (double)($$10 * (float)$$5.l());
         $$0.a(new ks($$3.j(), 1.0F), (double)$$2.u() + $$11, (double)$$2.v() + $$12, (double)$$2.w() + $$13, 0.0, 0.0, 0.0);
      }
   }

   @Override
   public void a(drd $$0, daz $$1, io $$2, aym $$3) {
      int $$4 = $$0.c(f);
      if ($$4 != 0) {
         for (it $$5 : it.c.a) {
            dsi $$6 = $$0.c(g.get($$5));
            switch ($$6) {
               case a:
                  this.a($$1, $$3, $$2, G[$$4], $$5, it.b, -0.5F, 0.5F);
               case b:
                  this.a($$1, $$3, $$2, G[$$4], it.a, $$5, 0.0F, 0.5F);
                  break;
               case c:
               default:
                  this.a($$1, $$3, $$2, G[$$4], it.a, $$5, 0.0F, 0.3F);
            }
         }
      }
   }

   @Override
   protected drd a(drd $$0, dkn $$1) {
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
   protected drd a(drd $$0, dix $$1) {
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
   protected void a(dre.a<dea, drd> $$0) {
      $$0.a(b, c, d, e, f);
   }

   @Override
   protected bpw a(drd $$0, daz $$1, io $$2, cly $$3, eui $$4) {
      if (!$$3.gd().e) {
         return bpw.d;
      } else {
         if (o($$0) || p($$0)) {
            drd $$5 = o($$0) ? this.n() : this.I;
            $$5 = $$5.a(f, $$0.c(f));
            $$5 = this.a($$1, $$5, $$2);
            if ($$5 != $$0) {
               $$1.a($$2, $$5, 3);
               this.a($$1, $$2, $$0, $$5);
               return bpw.a;
            }
         }

         return bpw.d;
      }
   }

   private void a(daz $$0, io $$1, drd $$2, drd $$3) {
      for (it $$4 : it.c.a) {
         io $$5 = $$1.a($$4);
         if ($$2.c(g.get($$4)).a() != $$3.c(g.get($$4)).a() && $$0.a_($$5).g($$0, $$5)) {
            $$0.a($$5, $$3.b(), $$4.g());
         }
      }
   }
}
