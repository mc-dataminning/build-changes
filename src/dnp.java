import com.google.common.collect.ImmutableMap;
import com.google.common.collect.Maps;
import com.google.common.collect.UnmodifiableIterator;
import com.mojang.serialization.MapCodec;
import java.util.Map;
import javax.annotation.Nullable;
import org.joml.Vector3f;

public class dnp extends dhm {
   public static final MapCodec<dnp> a = b(dnp::new);
   public static final dvq<dvx> b = dvi.ab;
   public static final dvq<dvx> c = dvi.aa;
   public static final dvq<dvx> d = dvi.ac;
   public static final dvq<dvx> e = dvi.ad;
   public static final dvs f = dvi.aT;
   public static final Map<jk, dvq<dvx>> g = Maps.newEnumMap(ImmutableMap.of(jk.c, b, jk.f, c, jk.d, d, jk.e, e));
   protected static final int h = 1;
   protected static final int i = 3;
   protected static final int j = 13;
   protected static final int k = 3;
   protected static final int l = 13;
   private static final ezq m = dhm.a(3.0, 0.0, 3.0, 13.0, 1.0, 13.0);
   private static final Map<jk, ezq> n = Maps.newEnumMap(
      ImmutableMap.of(
         jk.c,
         dhm.a(3.0, 0.0, 0.0, 13.0, 1.0, 13.0),
         jk.d,
         dhm.a(3.0, 0.0, 3.0, 13.0, 1.0, 16.0),
         jk.f,
         dhm.a(3.0, 0.0, 3.0, 16.0, 1.0, 13.0),
         jk.e,
         dhm.a(0.0, 0.0, 3.0, 13.0, 1.0, 13.0)
      )
   );
   private static final Map<jk, ezq> o = Maps.newEnumMap(
      ImmutableMap.of(
         jk.c,
         ezn.a(n.get(jk.c), dhm.a(3.0, 0.0, 0.0, 13.0, 16.0, 1.0)),
         jk.d,
         ezn.a(n.get(jk.d), dhm.a(3.0, 0.0, 15.0, 13.0, 16.0, 16.0)),
         jk.f,
         ezn.a(n.get(jk.f), dhm.a(15.0, 0.0, 3.0, 16.0, 16.0, 13.0)),
         jk.e,
         ezn.a(n.get(jk.e), dhm.a(0.0, 0.0, 3.0, 1.0, 16.0, 13.0))
      )
   );
   private static final Map<dus, ezq> G = Maps.newHashMap();
   private static final Vector3f[] H = ad.a(new Vector3f[16], $$0 -> {
      for (int $$1 = 0; $$1 <= 15; $$1++) {
         float $$2 = (float)$$1 / 15.0F;
         float $$3 = $$2 * 0.6F + ($$2 > 0.0F ? 0.4F : 0.3F);
         float $$4 = azf.a($$2 * $$2 * 0.7F - 0.5F, 0.0F, 1.0F);
         float $$5 = azf.a($$2 * $$2 * 0.6F - 0.7F, 0.0F, 1.0F);
         $$0[$$1] = new Vector3f($$3, $$4, $$5);
      }
   });
   private static final float I = 0.2F;
   private final dus J;
   private final esd K = new erw(this);
   private boolean L = true;

   @Override
   public MapCodec<dnp> a() {
      return a;
   }

   public dnp(dur.d $$0) {
      super($$0);
      this.l(this.F.b().b(b, dvx.c).b(c, dvx.c).b(d, dvx.c).b(e, dvx.c).b(f, Integer.valueOf(0)));
      this.J = this.n().b(b, dvx.b).b(c, dvx.b).b(d, dvx.b).b(e, dvx.b);
      UnmodifiableIterator var2 = this.k().a().iterator();

      while (var2.hasNext()) {
         dus $$1 = (dus)var2.next();
         if ($$1.c(f) == 0) {
            G.put($$1, this.q($$1));
         }
      }
   }

   private ezq q(dus $$0) {
      ezq $$1 = m;

      for (jk $$2 : jk.c.a) {
         dvx $$3 = $$0.c(g.get($$2));
         if ($$3 == dvx.b) {
            $$1 = ezn.a($$1, n.get($$2));
         } else if ($$3 == dvx.a) {
            $$1 = ezn.a($$1, o.get($$2));
         }
      }

      return $$1;
   }

   @Override
   protected ezq a(dus $$0, ddo $$1, jf $$2, ezb $$3) {
      return G.get($$0.b(f, Integer.valueOf(0)));
   }

   @Override
   public dus a(czn $$0) {
      return this.a($$0.q(), this.J, $$0.a());
   }

   private dus a(ddo $$0, dus $$1, jf $$2) {
      boolean $$3 = s($$1);
      $$1 = this.b($$0, this.n().b(f, $$1.c(f)), $$2);
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
            $$1 = $$1.b(e, dvx.b);
         }

         if (!$$6 && $$8) {
            $$1 = $$1.b(c, dvx.b);
         }

         if (!$$4 && $$9) {
            $$1 = $$1.b(b, dvx.b);
         }

         if (!$$5 && $$9) {
            $$1 = $$1.b(d, dvx.b);
         }

         return $$1;
      }
   }

   private dus b(ddo $$0, dus $$1, jf $$2) {
      boolean $$3 = !$$0.a_($$2.d()).d($$0, $$2);

      for (jk $$4 : jk.c.a) {
         if (!$$1.c(g.get($$4)).a()) {
            dvx $$5 = this.a($$0, $$2, $$4, $$3);
            $$1 = $$1.b(g.get($$4), $$5);
         }
      }

      return $$1;
   }

   @Override
   protected dus a(dus $$0, jk $$1, dus $$2, dek $$3, jf $$4, jf $$5) {
      if ($$1 == jk.a) {
         return !this.a($$3, $$5, $$2) ? dho.a.n() : $$0;
      } else if ($$1 == jk.b) {
         return this.a($$3, $$0, $$4);
      } else {
         dvx $$6 = this.a($$3, $$4, $$1);
         return $$6.a() == $$0.c(g.get($$1)).a() && !r($$0) ? $$0.b(g.get($$1), $$6) : this.a($$3, this.J.b(f, $$0.c(f)).b(g.get($$1), $$6), $$4);
      }
   }

   private static boolean r(dus $$0) {
      return $$0.c(b).a() && $$0.c(d).a() && $$0.c(c).a() && $$0.c(e).a();
   }

   private static boolean s(dus $$0) {
      return !$$0.c(b).a() && !$$0.c(d).a() && !$$0.c(c).a() && !$$0.c(e).a();
   }

   @Override
   protected void a(dus $$0, dek $$1, jf $$2, int $$3, int $$4) {
      jf.a $$5 = new jf.a();

      for (jk $$6 : jk.c.a) {
         dvx $$7 = $$0.c(g.get($$6));
         if ($$7 != dvx.c && !$$1.a_($$5.a($$2, $$6)).a(this)) {
            $$5.c(jk.a);
            dus $$8 = $$1.a_($$5);
            if ($$8.a(this)) {
               jf $$9 = $$5.a($$6.g());
               $$1.a($$6.g(), $$5, $$9, $$1.a_($$9), $$3, $$4);
            }

            $$5.a($$2, $$6).c(jk.b);
            dus $$10 = $$1.a_($$5);
            if ($$10.a(this)) {
               jf $$11 = $$5.a($$6.g());
               $$1.a($$6.g(), $$5, $$11, $$1.a_($$11), $$3, $$4);
            }
         }
      }
   }

   private dvx a(ddo $$0, jf $$1, jk $$2) {
      return this.a($$0, $$1, $$2, !$$0.a_($$1.d()).d($$0, $$1));
   }

   private dvx a(ddo $$0, jf $$1, jk $$2, boolean $$3) {
      jf $$4 = $$1.a($$2);
      dus $$5 = $$0.a_($$4);
      if ($$3) {
         boolean $$6 = $$5.b() instanceof dqa || this.a($$0, $$4, $$5);
         if ($$6 && o($$0.a_($$4.d()))) {
            if ($$5.c($$0, $$4, $$2.g())) {
               return dvx.a;
            }

            return dvx.b;
         }
      }

      return !a($$5, $$2) && ($$5.d($$0, $$4) || !o($$0.a_($$4.e()))) ? dvx.c : dvx.b;
   }

   @Override
   protected boolean a(dus $$0, dem $$1, jf $$2) {
      jf $$3 = $$2.e();
      dus $$4 = $$1.a_($$3);
      return this.a($$1, $$3, $$4);
   }

   private boolean a(ddo $$0, jf $$1, dus $$2) {
      return $$2.c($$0, $$1, jk.b) || $$2.a(dho.hc);
   }

   private void a(dej $$0, jf $$1, dus $$2, @Nullable esb $$3, boolean $$4) {
      if (a($$0)) {
         new ery(this).a($$0, $$1, $$2, $$3, $$4);
      } else {
         this.K.a($$0, $$1, $$2, $$3, $$4);
      }
   }

   public int a(dej $$0, jf $$1) {
      this.L = false;
      int $$2 = $$0.D($$1);
      this.L = true;
      return $$2;
   }

   private void b(dej $$0, jf $$1) {
      if ($$0.a_($$1).a(this)) {
         $$0.a($$1, this);

         for (jk $$2 : jk.values()) {
            $$0.a($$1.a($$2), this);
         }
      }
   }

   @Override
   protected void b(dus $$0, dej $$1, jf $$2, dus $$3, boolean $$4) {
      if (!$$3.a($$0.b()) && !$$1.B) {
         this.a($$1, $$2, $$0, null, true);

         for (jk $$5 : jk.c.b) {
            $$1.a($$2.a($$5), this);
         }

         this.c($$1, $$2);
      }
   }

   @Override
   protected void a(dus $$0, dej $$1, jf $$2, dus $$3, boolean $$4) {
      if (!$$4 && !$$0.a($$3.b())) {
         super.a($$0, $$1, $$2, $$3, $$4);
         if (!$$1.B) {
            for (jk $$5 : jk.values()) {
               $$1.a($$2.a($$5), this);
            }

            this.a($$1, $$2, $$0, null, false);
            this.c($$1, $$2);
         }
      }
   }

   private void c(dej $$0, jf $$1) {
      for (jk $$2 : jk.c.a) {
         this.b($$0, $$1.a($$2));
      }

      for (jk $$3 : jk.c.a) {
         jf $$4 = $$1.a($$3);
         if ($$0.a_($$4).d($$0, $$4)) {
            this.b($$0, $$4.d());
         } else {
            this.b($$0, $$4.e());
         }
      }
   }

   @Override
   protected void a(dus $$0, dej $$1, jf $$2, dhm $$3, @Nullable esb $$4, boolean $$5) {
      if (!$$1.B) {
         if ($$3 != this || !a($$1)) {
            if ($$0.a((dem)$$1, $$2)) {
               this.a($$1, $$2, $$0, $$4, false);
            } else {
               c($$0, $$1, $$2);
               $$1.a($$2, false);
            }
         }
      }
   }

   private static boolean a(dej $$0) {
      return $$0.J().b(cqs.d);
   }

   @Override
   protected int b(dus $$0, ddo $$1, jf $$2, jk $$3) {
      return !this.L ? 0 : $$0.a($$1, $$2, $$3);
   }

   @Override
   protected int a(dus $$0, ddo $$1, jf $$2, jk $$3) {
      if (this.L && $$3 != jk.a) {
         int $$4 = $$0.c(f);
         if ($$4 == 0) {
            return 0;
         } else {
            return $$3 != jk.b && !this.a($$1, $$0, $$2).c(g.get($$3.g())).a() ? 0 : $$4;
         }
      } else {
         return 0;
      }
   }

   protected static boolean o(dus $$0) {
      return a($$0, null);
   }

   protected static boolean a(dus $$0, @Nullable jk $$1) {
      if ($$0.a(dho.cw)) {
         return true;
      } else if ($$0.a(dho.eh)) {
         jk $$2 = $$0.c(dnu.aF);
         return $$2 == $$1 || $$2.g() == $$1;
      } else {
         return $$0.a(dho.kO) ? $$1 == $$0.c(dmx.a) : $$0.p() && $$1 != null;
      }
   }

   @Override
   protected boolean f_(dus $$0) {
      return this.L;
   }

   public static int b(int $$0) {
      Vector3f $$1 = H[$$0];
      return axq.a(0.0F, $$1.x(), $$1.y(), $$1.z());
   }

   private void a(dej $$0, azn $$1, jf $$2, Vector3f $$3, jk $$4, jk $$5, float $$6, float $$7) {
      float $$8 = $$7 - $$6;
      if (!($$1.i() >= 0.2F * $$8)) {
         float $$9 = 0.4375F;
         float $$10 = $$6 + $$8 * $$1.i();
         double $$11 = 0.5 + (double)(0.4375F * (float)$$4.j()) + (double)($$10 * (float)$$5.j());
         double $$12 = 0.5 + (double)(0.4375F * (float)$$4.k()) + (double)($$10 * (float)$$5.k());
         double $$13 = 0.5 + (double)(0.4375F * (float)$$4.l()) + (double)($$10 * (float)$$5.l());
         $$0.a(new lj($$3, 1.0F), (double)$$2.u() + $$11, (double)$$2.v() + $$12, (double)$$2.w() + $$13, 0.0, 0.0, 0.0);
      }
   }

   @Override
   public void a(dus $$0, dej $$1, jf $$2, azn $$3) {
      int $$4 = $$0.c(f);
      if ($$4 != 0) {
         for (jk $$5 : jk.c.a) {
            dvx $$6 = $$0.c(g.get($$5));
            switch ($$6) {
               case a:
                  this.a($$1, $$3, $$2, H[$$4], $$5, jk.b, -0.5F, 0.5F);
               case b:
                  this.a($$1, $$3, $$2, H[$$4], jk.a, $$5, 0.0F, 0.5F);
                  break;
               case c:
               default:
                  this.a($$1, $$3, $$2, H[$$4], jk.a, $$5, 0.0F, 0.3F);
            }
         }
      }
   }

   @Override
   protected dus a(dus $$0, doa $$1) {
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
   protected dus a(dus $$0, dmj $$1) {
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
   protected void a(dut.a<dhm, dus> $$0) {
      $$0.a(b, c, d, e, f);
   }

   @Override
   protected brs a(dus $$0, dej $$1, jf $$2, cnx $$3, eys $$4) {
      if (!$$3.ge().e) {
         return brs.e;
      } else {
         if (r($$0) || s($$0)) {
            dus $$5 = r($$0) ? this.n() : this.J;
            $$5 = $$5.b(f, $$0.c(f));
            $$5 = this.a($$1, $$5, $$2);
            if ($$5 != $$0) {
               $$1.a($$2, $$5, 3);
               this.a($$1, $$2, $$0, $$5);
               return brs.a;
            }
         }

         return brs.e;
      }
   }

   private void a(dej $$0, jf $$1, dus $$2, dus $$3) {
      esb $$4 = erx.a($$0, null, jk.b);

      for (jk $$5 : jk.c.a) {
         jf $$6 = $$1.a($$5);
         if ($$2.c(g.get($$5)).a() != $$3.c(g.get($$5)).a() && $$0.a_($$6).d($$0, $$6)) {
            $$0.a($$6, $$3.b(), $$5.g(), erx.a($$4, $$5));
         }
      }
   }
}
