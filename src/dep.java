import com.google.common.collect.ImmutableMap;
import com.google.common.collect.Maps;
import com.google.common.collect.Sets;
import com.google.common.collect.UnmodifiableIterator;
import com.mojang.serialization.MapCodec;
import java.util.Map;
import java.util.Set;
import javax.annotation.Nullable;

public class dep extends cyo {
   public static final MapCodec<dep> a = b(dep::new);
   public static final dmd<dmk> b = dlv.ab;
   public static final dmd<dmk> c = dlv.aa;
   public static final dmd<dmk> d = dlv.ac;
   public static final dmd<dmk> e = dlv.ad;
   public static final dmf f = dlv.aT;
   public static final Map<ie, dmd<dmk>> g = Maps.newEnumMap(ImmutableMap.of(ie.c, b, ie.f, c, ie.d, d, ie.e, e));
   protected static final int h = 1;
   protected static final int i = 3;
   protected static final int j = 13;
   protected static final int k = 3;
   protected static final int l = 13;
   private static final eol m = cyo.a(3.0, 0.0, 3.0, 13.0, 1.0, 13.0);
   private static final Map<ie, eol> n = Maps.newEnumMap(
      ImmutableMap.of(
         ie.c,
         cyo.a(3.0, 0.0, 0.0, 13.0, 1.0, 13.0),
         ie.d,
         cyo.a(3.0, 0.0, 3.0, 13.0, 1.0, 16.0),
         ie.f,
         cyo.a(3.0, 0.0, 3.0, 16.0, 1.0, 13.0),
         ie.e,
         cyo.a(0.0, 0.0, 3.0, 13.0, 1.0, 13.0)
      )
   );
   private static final Map<ie, eol> o = Maps.newEnumMap(
      ImmutableMap.of(
         ie.c,
         eoi.a(n.get(ie.c), cyo.a(3.0, 0.0, 0.0, 13.0, 16.0, 1.0)),
         ie.d,
         eoi.a(n.get(ie.d), cyo.a(3.0, 0.0, 15.0, 13.0, 16.0, 16.0)),
         ie.f,
         eoi.a(n.get(ie.f), cyo.a(15.0, 0.0, 3.0, 16.0, 16.0, 13.0)),
         ie.e,
         eoi.a(n.get(ie.e), cyo.a(0.0, 0.0, 3.0, 1.0, 16.0, 13.0))
      )
   );
   private static final Map<dlf, eol> F = Maps.newHashMap();
   private static final ens[] G = ac.a(new ens[16], $$0 -> {
      for (int $$1 = 0; $$1 <= 15; $$1++) {
         float $$2 = (float)$$1 / 15.0F;
         float $$3 = $$2 * 0.6F + ($$2 > 0.0F ? 0.4F : 0.3F);
         float $$4 = awh.a($$2 * $$2 * 0.7F - 0.5F, 0.0F, 1.0F);
         float $$5 = awh.a($$2 * $$2 * 0.6F - 0.7F, 0.0F, 1.0F);
         $$0[$$1] = new ens((double)$$3, (double)$$4, (double)$$5);
      }
   });
   private static final float H = 0.2F;
   private final dlf I;
   private boolean J = true;

   @Override
   public MapCodec<dep> a() {
      return a;
   }

   public dep(dle.d $$0) {
      super($$0);
      this.k(this.E.b().a(b, dmk.c).a(c, dmk.c).a(d, dmk.c).a(e, dmk.c).a(f, Integer.valueOf(0)));
      this.I = this.o().a(b, dmk.b).a(c, dmk.b).a(d, dmk.b).a(e, dmk.b);
      UnmodifiableIterator var2 = this.n().a().iterator();

      while (var2.hasNext()) {
         dlf $$1 = (dlf)var2.next();
         if ($$1.c(f) == 0) {
            F.put($$1, this.n($$1));
         }
      }
   }

   private eol n(dlf $$0) {
      eol $$1 = m;

      for (ie $$2 : ie.c.a) {
         dmk $$3 = $$0.c(g.get($$2));
         if ($$3 == dmk.b) {
            $$1 = eoi.a($$1, n.get($$2));
         } else if ($$3 == dmk.a) {
            $$1 = eoi.a($$1, o.get($$2));
         }
      }

      return $$1;
   }

   @Override
   protected eol a(dlf $$0, cut $$1, hz $$2, enx $$3) {
      return F.get($$0.a(f, Integer.valueOf(0)));
   }

   @Override
   public dlf a(crg $$0) {
      return this.a($$0.q(), this.I, $$0.a());
   }

   private dlf a(cut $$0, dlf $$1, hz $$2) {
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
            $$1 = $$1.a(e, dmk.b);
         }

         if (!$$6 && $$8) {
            $$1 = $$1.a(c, dmk.b);
         }

         if (!$$4 && $$9) {
            $$1 = $$1.a(b, dmk.b);
         }

         if (!$$5 && $$9) {
            $$1 = $$1.a(d, dmk.b);
         }

         return $$1;
      }
   }

   private dlf b(cut $$0, dlf $$1, hz $$2) {
      boolean $$3 = !$$0.a_($$2.c()).g($$0, $$2);

      for (ie $$4 : ie.c.a) {
         if (!$$1.c(g.get($$4)).a()) {
            dmk $$5 = this.a($$0, $$2, $$4, $$3);
            $$1 = $$1.a(g.get($$4), $$5);
         }
      }

      return $$1;
   }

   @Override
   protected dlf a(dlf $$0, ie $$1, dlf $$2, cvo $$3, hz $$4, hz $$5) {
      if ($$1 == ie.a) {
         return !this.a($$3, $$5, $$2) ? cyq.a.o() : $$0;
      } else if ($$1 == ie.b) {
         return this.a($$3, $$0, $$4);
      } else {
         dmk $$6 = this.a($$3, $$4, $$1);
         return $$6.a() == $$0.c(g.get($$1)).a() && !o($$0) ? $$0.a(g.get($$1), $$6) : this.a($$3, this.I.a(f, $$0.c(f)).a(g.get($$1), $$6), $$4);
      }
   }

   private static boolean o(dlf $$0) {
      return $$0.c(b).a() && $$0.c(d).a() && $$0.c(c).a() && $$0.c(e).a();
   }

   private static boolean p(dlf $$0) {
      return !$$0.c(b).a() && !$$0.c(d).a() && !$$0.c(c).a() && !$$0.c(e).a();
   }

   @Override
   protected void a(dlf $$0, cvo $$1, hz $$2, int $$3, int $$4) {
      hz.a $$5 = new hz.a();

      for (ie $$6 : ie.c.a) {
         dmk $$7 = $$0.c(g.get($$6));
         if ($$7 != dmk.c && !$$1.a_($$5.a($$2, $$6)).a(this)) {
            $$5.c(ie.a);
            dlf $$8 = $$1.a_($$5);
            if ($$8.a(this)) {
               hz $$9 = $$5.a($$6.g());
               $$1.a($$6.g(), $$1.a_($$9), $$5, $$9, $$3, $$4);
            }

            $$5.a($$2, $$6).c(ie.b);
            dlf $$10 = $$1.a_($$5);
            if ($$10.a(this)) {
               hz $$11 = $$5.a($$6.g());
               $$1.a($$6.g(), $$1.a_($$11), $$5, $$11, $$3, $$4);
            }
         }
      }
   }

   private dmk a(cut $$0, hz $$1, ie $$2) {
      return this.a($$0, $$1, $$2, !$$0.a_($$1.c()).g($$0, $$1));
   }

   private dmk a(cut $$0, hz $$1, ie $$2, boolean $$3) {
      hz $$4 = $$1.a($$2);
      dlf $$5 = $$0.a_($$4);
      if ($$3) {
         boolean $$6 = $$5.b() instanceof dha || this.a($$0, $$4, $$5);
         if ($$6 && m($$0.a_($$4.c()))) {
            if ($$5.d($$0, $$4, $$2.g())) {
               return dmk.a;
            }

            return dmk.b;
         }
      }

      return !a($$5, $$2) && ($$5.g($$0, $$4) || !m($$0.a_($$4.d()))) ? dmk.c : dmk.b;
   }

   @Override
   protected boolean a(dlf $$0, cvq $$1, hz $$2) {
      hz $$3 = $$2.d();
      dlf $$4 = $$1.a_($$3);
      return this.a($$1, $$3, $$4);
   }

   private boolean a(cut $$0, hz $$1, dlf $$2) {
      return $$2.d($$0, $$1, ie.b) || $$2.a(cyq.hc);
   }

   private void a(cvn $$0, hz $$1, dlf $$2) {
      int $$3 = this.a($$0, $$1);
      if ($$2.c(f) != $$3) {
         if ($$0.a_($$1) == $$2) {
            $$0.a($$1, $$2.a(f, Integer.valueOf($$3)), 2);
         }

         Set<hz> $$4 = Sets.newHashSet();
         $$4.add($$1);

         for (ie $$5 : ie.values()) {
            $$4.add($$1.a($$5));
         }

         for (hz $$6 : $$4) {
            $$0.a($$6, this);
         }
      }
   }

   private int a(cvn $$0, hz $$1) {
      this.J = false;
      int $$2 = $$0.D($$1);
      this.J = true;
      int $$3 = 0;
      if ($$2 < 15) {
         for (ie $$4 : ie.c.a) {
            hz $$5 = $$1.a($$4);
            dlf $$6 = $$0.a_($$5);
            $$3 = Math.max($$3, this.q($$6));
            hz $$7 = $$1.c();
            if ($$6.g($$0, $$5) && !$$0.a_($$7).g($$0, $$7)) {
               $$3 = Math.max($$3, this.q($$0.a_($$5.c())));
            } else if (!$$6.g($$0, $$5)) {
               $$3 = Math.max($$3, this.q($$0.a_($$5.d())));
            }
         }
      }

      return Math.max($$2, $$3 - 1);
   }

   private int q(dlf $$0) {
      return $$0.a(this) ? $$0.c(f) : 0;
   }

   private void b(cvn $$0, hz $$1) {
      if ($$0.a_($$1).a(this)) {
         $$0.a($$1, this);

         for (ie $$2 : ie.values()) {
            $$0.a($$1.a($$2), this);
         }
      }
   }

   @Override
   protected void b(dlf $$0, cvn $$1, hz $$2, dlf $$3, boolean $$4) {
      if (!$$3.a($$0.b()) && !$$1.B) {
         this.a($$1, $$2, $$0);

         for (ie $$5 : ie.c.b) {
            $$1.a($$2.a($$5), this);
         }

         this.c($$1, $$2);
      }
   }

   @Override
   protected void a(dlf $$0, cvn $$1, hz $$2, dlf $$3, boolean $$4) {
      if (!$$4 && !$$0.a($$3.b())) {
         super.a($$0, $$1, $$2, $$3, $$4);
         if (!$$1.B) {
            for (ie $$5 : ie.values()) {
               $$1.a($$2.a($$5), this);
            }

            this.a($$1, $$2, $$0);
            this.c($$1, $$2);
         }
      }
   }

   private void c(cvn $$0, hz $$1) {
      for (ie $$2 : ie.c.a) {
         this.b($$0, $$1.a($$2));
      }

      for (ie $$3 : ie.c.a) {
         hz $$4 = $$1.a($$3);
         if ($$0.a_($$4).g($$0, $$4)) {
            this.b($$0, $$4.c());
         } else {
            this.b($$0, $$4.d());
         }
      }
   }

   @Override
   protected void a(dlf $$0, cvn $$1, hz $$2, cyo $$3, hz $$4, boolean $$5) {
      if (!$$1.B) {
         if ($$0.a((cvq)$$1, $$2)) {
            this.a($$1, $$2, $$0);
         } else {
            c($$0, $$1, $$2);
            $$1.a($$2, false);
         }
      }
   }

   @Override
   protected int b(dlf $$0, cut $$1, hz $$2, ie $$3) {
      return !this.J ? 0 : $$0.b($$1, $$2, $$3);
   }

   @Override
   protected int a(dlf $$0, cut $$1, hz $$2, ie $$3) {
      if (this.J && $$3 != ie.a) {
         int $$4 = $$0.c(f);
         if ($$4 == 0) {
            return 0;
         } else {
            return $$3 != ie.b && !this.a($$1, $$0, $$2).c(g.get($$3.g())).a() ? 0 : $$4;
         }
      } else {
         return 0;
      }
   }

   protected static boolean m(dlf $$0) {
      return a($$0, null);
   }

   protected static boolean a(dlf $$0, @Nullable ie $$1) {
      if ($$0.a(cyq.cw)) {
         return true;
      } else if ($$0.a(cyq.eh)) {
         ie $$2 = $$0.c(deu.aE);
         return $$2 == $$1 || $$2.g() == $$1;
      } else {
         return $$0.a(cyq.kO) ? $$1 == $$0.c(ddy.a) : $$0.m() && $$1 != null;
      }
   }

   @Override
   protected boolean f_(dlf $$0) {
      return this.J;
   }

   public static int b(int $$0) {
      ens $$1 = G[$$0];
      return awh.f((float)$$1.a(), (float)$$1.b(), (float)$$1.c());
   }

   private void a(cvn $$0, awo $$1, hz $$2, ens $$3, ie $$4, ie $$5, float $$6, float $$7) {
      float $$8 = $$7 - $$6;
      if (!($$1.i() >= 0.2F * $$8)) {
         float $$9 = 0.4375F;
         float $$10 = $$6 + $$8 * $$1.i();
         double $$11 = 0.5 + (double)(0.4375F * (float)$$4.j()) + (double)($$10 * (float)$$5.j());
         double $$12 = 0.5 + (double)(0.4375F * (float)$$4.k()) + (double)($$10 * (float)$$5.k());
         double $$13 = 0.5 + (double)(0.4375F * (float)$$4.l()) + (double)($$10 * (float)$$5.l());
         $$0.a(new jt($$3.j(), 1.0F), (double)$$2.u() + $$11, (double)$$2.v() + $$12, (double)$$2.w() + $$13, 0.0, 0.0, 0.0);
      }
   }

   @Override
   public void a(dlf $$0, cvn $$1, hz $$2, awo $$3) {
      int $$4 = $$0.c(f);
      if ($$4 != 0) {
         for (ie $$5 : ie.c.a) {
            dmk $$6 = $$0.c(g.get($$5));
            switch ($$6) {
               case a:
                  this.a($$1, $$3, $$2, G[$$4], $$5, ie.b, -0.5F, 0.5F);
               case b:
                  this.a($$1, $$3, $$2, G[$$4], ie.a, $$5, 0.0F, 0.5F);
                  break;
               case c:
               default:
                  this.a($$1, $$3, $$2, G[$$4], ie.a, $$5, 0.0F, 0.3F);
            }
         }
      }
   }

   @Override
   protected dlf a(dlf $$0, dfa $$1) {
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
   protected dlf a(dlf $$0, ddk $$1) {
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
   protected void a(dlg.a<cyo, dlf> $$0) {
      $$0.a(b, c, d, e, f);
   }

   @Override
   protected blu a(dlf $$0, cvn $$1, hz $$2, chh $$3, eno $$4) {
      if (!$$3.fU().e) {
         return blu.d;
      } else {
         if (o($$0) || p($$0)) {
            dlf $$5 = o($$0) ? this.o() : this.I;
            $$5 = $$5.a(f, $$0.c(f));
            $$5 = this.a($$1, $$5, $$2);
            if ($$5 != $$0) {
               $$1.a($$2, $$5, 3);
               this.a($$1, $$2, $$0, $$5);
               return blu.a;
            }
         }

         return blu.d;
      }
   }

   private void a(cvn $$0, hz $$1, dlf $$2, dlf $$3) {
      for (ie $$4 : ie.c.a) {
         hz $$5 = $$1.a($$4);
         if ($$2.c(g.get($$4)).a() != $$3.c(g.get($$4)).a() && $$0.a_($$5).g($$0, $$5)) {
            $$0.a($$5, $$3.b(), $$4.g());
         }
      }
   }
}
