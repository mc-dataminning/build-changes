import com.google.common.collect.ImmutableMap;
import com.google.common.collect.Maps;
import com.google.common.collect.UnmodifiableIterator;
import com.mojang.serialization.MapCodec;
import java.util.Map;
import javax.annotation.Nullable;
import org.joml.Vector3f;

public class dnm extends dhj {
   public static final MapCodec<dnm> a = b(dnm::new);
   public static final dvm<dvt> b = dve.ab;
   public static final dvm<dvt> c = dve.aa;
   public static final dvm<dvt> d = dve.ac;
   public static final dvm<dvt> e = dve.ad;
   public static final dvo f = dve.aT;
   public static final Map<jj, dvm<dvt>> g = Maps.newEnumMap(ImmutableMap.of(jj.c, b, jj.f, c, jj.d, d, jj.e, e));
   protected static final int h = 1;
   protected static final int i = 3;
   protected static final int j = 13;
   protected static final int k = 3;
   protected static final int l = 13;
   private static final ezm m = dhj.a(3.0, 0.0, 3.0, 13.0, 1.0, 13.0);
   private static final Map<jj, ezm> n = Maps.newEnumMap(
      ImmutableMap.of(
         jj.c,
         dhj.a(3.0, 0.0, 0.0, 13.0, 1.0, 13.0),
         jj.d,
         dhj.a(3.0, 0.0, 3.0, 13.0, 1.0, 16.0),
         jj.f,
         dhj.a(3.0, 0.0, 3.0, 16.0, 1.0, 13.0),
         jj.e,
         dhj.a(0.0, 0.0, 3.0, 13.0, 1.0, 13.0)
      )
   );
   private static final Map<jj, ezm> o = Maps.newEnumMap(
      ImmutableMap.of(
         jj.c,
         ezj.a(n.get(jj.c), dhj.a(3.0, 0.0, 0.0, 13.0, 16.0, 1.0)),
         jj.d,
         ezj.a(n.get(jj.d), dhj.a(3.0, 0.0, 15.0, 13.0, 16.0, 16.0)),
         jj.f,
         ezj.a(n.get(jj.f), dhj.a(15.0, 0.0, 3.0, 16.0, 16.0, 13.0)),
         jj.e,
         ezj.a(n.get(jj.e), dhj.a(0.0, 0.0, 3.0, 1.0, 16.0, 13.0))
      )
   );
   private static final Map<duo, ezm> G = Maps.newHashMap();
   private static final Vector3f[] H = ad.a(new Vector3f[16], $$0 -> {
      for (int $$1 = 0; $$1 <= 15; $$1++) {
         float $$2 = (float)$$1 / 15.0F;
         float $$3 = $$2 * 0.6F + ($$2 > 0.0F ? 0.4F : 0.3F);
         float $$4 = azd.a($$2 * $$2 * 0.7F - 0.5F, 0.0F, 1.0F);
         float $$5 = azd.a($$2 * $$2 * 0.6F - 0.7F, 0.0F, 1.0F);
         $$0[$$1] = new Vector3f($$3, $$4, $$5);
      }
   });
   private static final float I = 0.2F;
   private final duo J;
   private final erz K = new ers(this);
   private boolean L = true;

   @Override
   public MapCodec<dnm> a() {
      return a;
   }

   public dnm(dun.d $$0) {
      super($$0);
      this.l(this.F.b().b(b, dvt.c).b(c, dvt.c).b(d, dvt.c).b(e, dvt.c).b(f, Integer.valueOf(0)));
      this.J = this.o().b(b, dvt.b).b(c, dvt.b).b(d, dvt.b).b(e, dvt.b);
      UnmodifiableIterator var2 = this.n().a().iterator();

      while (var2.hasNext()) {
         duo $$1 = (duo)var2.next();
         if ($$1.c(f) == 0) {
            G.put($$1, this.q($$1));
         }
      }
   }

   private ezm q(duo $$0) {
      ezm $$1 = m;

      for (jj $$2 : jj.c.a) {
         dvt $$3 = $$0.c(g.get($$2));
         if ($$3 == dvt.b) {
            $$1 = ezj.a($$1, n.get($$2));
         } else if ($$3 == dvt.a) {
            $$1 = ezj.a($$1, o.get($$2));
         }
      }

      return $$1;
   }

   @Override
   protected ezm a(duo $$0, ddl $$1, je $$2, eyx $$3) {
      return G.get($$0.b(f, Integer.valueOf(0)));
   }

   @Override
   public duo a(czk $$0) {
      return this.a($$0.q(), this.J, $$0.a());
   }

   private duo a(ddl $$0, duo $$1, je $$2) {
      boolean $$3 = s($$1);
      $$1 = this.b($$0, this.o().b(f, $$1.c(f)), $$2);
      if ($$3 && s($$1)) {
         return $$1;
      } else {
         boolean $$4 = $$1.c(b).a();
         boolean $$5 = $$1.c(d).a();
         boolean $$6 = $$1.c(c).a();
         boolean $$7 = $$1.c(e).a();
         boolean $$8 = !$$4 && !$$5;
         boolean $$9 = !$$6 && !$$7;
         if (!$$7 && $$8) {
            $$1 = $$1.b(e, dvt.b);
         }

         if (!$$6 && $$8) {
            $$1 = $$1.b(c, dvt.b);
         }

         if (!$$4 && $$9) {
            $$1 = $$1.b(b, dvt.b);
         }

         if (!$$5 && $$9) {
            $$1 = $$1.b(d, dvt.b);
         }

         return $$1;
      }
   }

   private duo b(ddl $$0, duo $$1, je $$2) {
      boolean $$3 = !$$0.a_($$2.d()).d($$0, $$2);

      for (jj $$4 : jj.c.a) {
         if (!$$1.c(g.get($$4)).a()) {
            dvt $$5 = this.a($$0, $$2, $$4, $$3);
            $$1 = $$1.b(g.get($$4), $$5);
         }
      }

      return $$1;
   }

   @Override
   protected duo a(duo $$0, jj $$1, duo $$2, deh $$3, je $$4, je $$5) {
      if ($$1 == jj.a) {
         return !this.a($$3, $$5, $$2) ? dhl.a.o() : $$0;
      } else if ($$1 == jj.b) {
         return this.a($$3, $$0, $$4);
      } else {
         dvt $$6 = this.a($$3, $$4, $$1);
         return $$6.a() == $$0.c(g.get($$1)).a() && !r($$0) ? $$0.b(g.get($$1), $$6) : this.a($$3, this.J.b(f, $$0.c(f)).b(g.get($$1), $$6), $$4);
      }
   }

   private static boolean r(duo $$0) {
      return $$0.c(b).a() && $$0.c(d).a() && $$0.c(c).a() && $$0.c(e).a();
   }

   private static boolean s(duo $$0) {
      return !$$0.c(b).a() && !$$0.c(d).a() && !$$0.c(c).a() && !$$0.c(e).a();
   }

   @Override
   protected void a(duo $$0, deh $$1, je $$2, int $$3, int $$4) {
      je.a $$5 = new je.a();

      for (jj $$6 : jj.c.a) {
         dvt $$7 = $$0.c(g.get($$6));
         if ($$7 != dvt.c && !$$1.a_($$5.a($$2, $$6)).a(this)) {
            $$5.c(jj.a);
            duo $$8 = $$1.a_($$5);
            if ($$8.a(this)) {
               je $$9 = $$5.a($$6.g());
               $$1.a($$6.g(), $$1.a_($$9), $$5, $$9, $$3, $$4);
            }

            $$5.a($$2, $$6).c(jj.b);
            duo $$10 = $$1.a_($$5);
            if ($$10.a(this)) {
               je $$11 = $$5.a($$6.g());
               $$1.a($$6.g(), $$1.a_($$11), $$5, $$11, $$3, $$4);
            }
         }
      }
   }

   private dvt a(ddl $$0, je $$1, jj $$2) {
      return this.a($$0, $$1, $$2, !$$0.a_($$1.d()).d($$0, $$1));
   }

   private dvt a(ddl $$0, je $$1, jj $$2, boolean $$3) {
      je $$4 = $$1.a($$2);
      duo $$5 = $$0.a_($$4);
      if ($$3) {
         boolean $$6 = $$5.b() instanceof dpx || this.a($$0, $$4, $$5);
         if ($$6 && o($$0.a_($$4.d()))) {
            if ($$5.c($$0, $$4, $$2.g())) {
               return dvt.a;
            }

            return dvt.b;
         }
      }

      return !a($$5, $$2) && ($$5.d($$0, $$4) || !o($$0.a_($$4.e()))) ? dvt.c : dvt.b;
   }

   @Override
   protected boolean a(duo $$0, dej $$1, je $$2) {
      je $$3 = $$2.e();
      duo $$4 = $$1.a_($$3);
      return this.a($$1, $$3, $$4);
   }

   private boolean a(ddl $$0, je $$1, duo $$2) {
      return $$2.c($$0, $$1, jj.b) || $$2.a(dhl.hc);
   }

   private void a(deg $$0, je $$1, duo $$2, @Nullable erx $$3, boolean $$4) {
      if (a($$0)) {
         new eru(this).a($$0, $$1, $$2, $$3, $$4);
      } else {
         this.K.a($$0, $$1, $$2, $$3, $$4);
      }
   }

   public int a(deg $$0, je $$1) {
      this.L = false;
      int $$2 = $$0.D($$1);
      this.L = true;
      return $$2;
   }

   private void b(deg $$0, je $$1) {
      if ($$0.a_($$1).a(this)) {
         $$0.a($$1, this);

         for (jj $$2 : jj.values()) {
            $$0.a($$1.a($$2), this);
         }
      }
   }

   @Override
   protected void b(duo $$0, deg $$1, je $$2, duo $$3, boolean $$4) {
      if (!$$3.a($$0.b()) && !$$1.B) {
         this.a($$1, $$2, $$0, null, true);

         for (jj $$5 : jj.c.b) {
            $$1.a($$2.a($$5), this);
         }

         this.c($$1, $$2);
      }
   }

   @Override
   protected void a(duo $$0, deg $$1, je $$2, duo $$3, boolean $$4) {
      if (!$$4 && !$$0.a($$3.b())) {
         super.a($$0, $$1, $$2, $$3, $$4);
         if (!$$1.B) {
            for (jj $$5 : jj.values()) {
               $$1.a($$2.a($$5), this);
            }

            this.a($$1, $$2, $$0, null, false);
            this.c($$1, $$2);
         }
      }
   }

   private void c(deg $$0, je $$1) {
      for (jj $$2 : jj.c.a) {
         this.b($$0, $$1.a($$2));
      }

      for (jj $$3 : jj.c.a) {
         je $$4 = $$1.a($$3);
         if ($$0.a_($$4).d($$0, $$4)) {
            this.b($$0, $$4.d());
         } else {
            this.b($$0, $$4.e());
         }
      }
   }

   @Override
   protected void a(duo $$0, deg $$1, je $$2, dhj $$3, @Nullable erx $$4, boolean $$5) {
      if (!$$1.B) {
         if ($$3 != this || !a($$1)) {
            if ($$0.a((dej)$$1, $$2)) {
               this.a($$1, $$2, $$0, $$4, false);
            } else {
               c($$0, $$1, $$2);
               $$1.a($$2, false);
            }
         }
      }
   }

   private static boolean a(deg $$0) {
      return $$0.J().b(cqp.d);
   }

   @Override
   protected int b(duo $$0, ddl $$1, je $$2, jj $$3) {
      return !this.L ? 0 : $$0.a($$1, $$2, $$3);
   }

   @Override
   protected int a(duo $$0, ddl $$1, je $$2, jj $$3) {
      if (this.L && $$3 != jj.a) {
         int $$4 = $$0.c(f);
         if ($$4 == 0) {
            return 0;
         } else {
            return $$3 != jj.b && !this.a($$1, $$0, $$2).c(g.get($$3.g())).a() ? 0 : $$4;
         }
      } else {
         return 0;
      }
   }

   protected static boolean o(duo $$0) {
      return a($$0, null);
   }

   protected static boolean a(duo $$0, @Nullable jj $$1) {
      if ($$0.a(dhl.cw)) {
         return true;
      } else if ($$0.a(dhl.eh)) {
         jj $$2 = $$0.c(dnr.aF);
         return $$2 == $$1 || $$2.g() == $$1;
      } else {
         return $$0.a(dhl.kO) ? $$1 == $$0.c(dmu.a) : $$0.p() && $$1 != null;
      }
   }

   @Override
   protected boolean f_(duo $$0) {
      return this.L;
   }

   public static int b(int $$0) {
      Vector3f $$1 = H[$$0];
      return axo.a(0.0F, $$1.x(), $$1.y(), $$1.z());
   }

   private void a(deg $$0, azl $$1, je $$2, Vector3f $$3, jj $$4, jj $$5, float $$6, float $$7) {
      float $$8 = $$7 - $$6;
      if (!($$1.i() >= 0.2F * $$8)) {
         float $$9 = 0.4375F;
         float $$10 = $$6 + $$8 * $$1.i();
         double $$11 = 0.5 + (double)(0.4375F * (float)$$4.j()) + (double)($$10 * (float)$$5.j());
         double $$12 = 0.5 + (double)(0.4375F * (float)$$4.k()) + (double)($$10 * (float)$$5.k());
         double $$13 = 0.5 + (double)(0.4375F * (float)$$4.l()) + (double)($$10 * (float)$$5.l());
         $$0.a(new li($$3, 1.0F), (double)$$2.u() + $$11, (double)$$2.v() + $$12, (double)$$2.w() + $$13, 0.0, 0.0, 0.0);
      }
   }

   @Override
   public void a(duo $$0, deg $$1, je $$2, azl $$3) {
      int $$4 = $$0.c(f);
      if ($$4 != 0) {
         for (jj $$5 : jj.c.a) {
            dvt $$6 = $$0.c(g.get($$5));
            switch ($$6) {
               case a:
                  this.a($$1, $$3, $$2, H[$$4], $$5, jj.b, -0.5F, 0.5F);
               case b:
                  this.a($$1, $$3, $$2, H[$$4], jj.a, $$5, 0.0F, 0.5F);
                  break;
               case c:
               default:
                  this.a($$1, $$3, $$2, H[$$4], jj.a, $$5, 0.0F, 0.3F);
            }
         }
      }
   }

   @Override
   protected duo a(duo $$0, dnx $$1) {
      switch ($$1) {
         case c:
            return $$0.b(b, $$0.c(d)).b(c, $$0.c(e)).b(d, $$0.c(b)).b(e, $$0.c(c));
         case d:
            return $$0.b(b, $$0.c(c)).b(c, $$0.c(d)).b(d, $$0.c(e)).b(e, $$0.c(b));
         case b:
            return $$0.b(b, $$0.c(e)).b(c, $$0.c(b)).b(d, $$0.c(c)).b(e, $$0.c(d));
         default:
            return $$0;
      }
   }

   @Override
   protected duo a(duo $$0, dmg $$1) {
      switch ($$1) {
         case b:
            return $$0.b(b, $$0.c(d)).b(d, $$0.c(b));
         case c:
            return $$0.b(c, $$0.c(e)).b(e, $$0.c(c));
         default:
            return super.a($$0, $$1);
      }
   }

   @Override
   protected void a(dup.a<dhj, duo> $$0) {
      $$0.a(b, c, d, e, f);
   }

   @Override
   protected brp a(duo $$0, deg $$1, je $$2, cnu $$3, eyo $$4) {
      if (!$$3.gd().e) {
         return brp.e;
      } else {
         if (r($$0) || s($$0)) {
            duo $$5 = r($$0) ? this.o() : this.J;
            $$5 = $$5.b(f, $$0.c(f));
            $$5 = this.a($$1, $$5, $$2);
            if ($$5 != $$0) {
               $$1.a($$2, $$5, 3);
               this.a($$1, $$2, $$0, $$5);
               return brp.a;
            }
         }

         return brp.e;
      }
   }

   private void a(deg $$0, je $$1, duo $$2, duo $$3) {
      erx $$4 = ert.a($$0, null, jj.b);

      for (jj $$5 : jj.c.a) {
         je $$6 = $$1.a($$5);
         if ($$2.c(g.get($$5)).a() != $$3.c(g.get($$5)).a() && $$0.a_($$6).d($$0, $$6)) {
            $$0.a($$6, $$3.b(), $$5.g(), ert.a($$4, $$5));
         }
      }
   }
}
