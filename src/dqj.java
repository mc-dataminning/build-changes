import com.google.common.collect.ImmutableMap;
import com.google.common.collect.Maps;
import com.google.common.collect.UnmodifiableIterator;
import com.mojang.serialization.MapCodec;
import java.util.Map;
import javax.annotation.Nullable;
import org.joml.Vector3f;

public class dqj extends dke {
   public static final MapCodec<dqj> a = b(dqj::new);
   public static final dyk<dyr> b = dyd.ac;
   public static final dyk<dyr> c = dyd.ab;
   public static final dyk<dyr> d = dyd.ad;
   public static final dyk<dyr> e = dyd.ae;
   public static final dym f = dyd.aU;
   public static final Map<jm, dyk<dyr>> g = Maps.newEnumMap(ImmutableMap.of(jm.c, b, jm.f, c, jm.d, d, jm.e, e));
   protected static final int h = 1;
   protected static final int i = 3;
   protected static final int j = 13;
   protected static final int k = 3;
   protected static final int l = 13;
   private static final fcm m = dke.a(3.0, 0.0, 3.0, 13.0, 1.0, 13.0);
   private static final Map<jm, fcm> n = Maps.newEnumMap(
      ImmutableMap.of(
         jm.c,
         dke.a(3.0, 0.0, 0.0, 13.0, 1.0, 13.0),
         jm.d,
         dke.a(3.0, 0.0, 3.0, 13.0, 1.0, 16.0),
         jm.f,
         dke.a(3.0, 0.0, 3.0, 16.0, 1.0, 13.0),
         jm.e,
         dke.a(0.0, 0.0, 3.0, 13.0, 1.0, 13.0)
      )
   );
   private static final Map<jm, fcm> o = Maps.newEnumMap(
      ImmutableMap.of(
         jm.c,
         fcj.a(n.get(jm.c), dke.a(3.0, 0.0, 0.0, 13.0, 16.0, 1.0)),
         jm.d,
         fcj.a(n.get(jm.d), dke.a(3.0, 0.0, 15.0, 13.0, 16.0, 16.0)),
         jm.f,
         fcj.a(n.get(jm.f), dke.a(15.0, 0.0, 3.0, 16.0, 16.0, 13.0)),
         jm.e,
         fcj.a(n.get(jm.e), dke.a(0.0, 0.0, 3.0, 1.0, 16.0, 13.0))
      )
   );
   private static final Map<dxn, fcm> G = Maps.newHashMap();
   private static final Vector3f[] H = ae.a(new Vector3f[16], $$0 -> {
      for (int $$1 = 0; $$1 <= 15; $$1++) {
         float $$2 = (float)$$1 / 15.0F;
         float $$3 = $$2 * 0.6F + ($$2 > 0.0F ? 0.4F : 0.3F);
         float $$4 = bae.a($$2 * $$2 * 0.7F - 0.5F, 0.0F, 1.0F);
         float $$5 = bae.a($$2 * $$2 * 0.6F - 0.7F, 0.0F, 1.0F);
         $$0[$$1] = new Vector3f($$3, $$4, $$5);
      }
   });
   private static final float I = 0.2F;
   private final dxn J;
   private final euz K = new eus(this);
   private boolean L = true;

   @Override
   public MapCodec<dqj> a() {
      return a;
   }

   public dqj(dxm.d $$0) {
      super($$0);
      this.l(this.F.b().b(b, dyr.c).b(c, dyr.c).b(d, dyr.c).b(e, dyr.c).b(f, Integer.valueOf(0)));
      this.J = this.m().b(b, dyr.b).b(c, dyr.b).b(d, dyr.b).b(e, dyr.b);
      UnmodifiableIterator var2 = this.l().a().iterator();

      while (var2.hasNext()) {
         dxn $$1 = (dxn)var2.next();
         if ($$1.c(f) == 0) {
            G.put($$1, this.q($$1));
         }
      }
   }

   private fcm q(dxn $$0) {
      fcm $$1 = m;

      for (jm $$2 : jm.c.a) {
         dyr $$3 = $$0.c(g.get($$2));
         if ($$3 == dyr.b) {
            $$1 = fcj.a($$1, n.get($$2));
         } else if ($$3 == dyr.a) {
            $$1 = fcj.a($$1, o.get($$2));
         }
      }

      return $$1;
   }

   @Override
   protected fcm a(dxn $$0, dgf $$1, jh $$2, fbx $$3) {
      return G.get($$0.b(f, Integer.valueOf(0)));
   }

   @Override
   public dxn a(dbb $$0) {
      return this.a($$0.q(), this.J, $$0.a());
   }

   private dxn a(dgf $$0, dxn $$1, jh $$2) {
      boolean $$3 = s($$1);
      $$1 = this.b($$0, this.m().b(f, $$1.c(f)), $$2);
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
            $$1 = $$1.b(e, dyr.b);
         }

         if (!$$6 && $$8) {
            $$1 = $$1.b(c, dyr.b);
         }

         if (!$$4 && $$9) {
            $$1 = $$1.b(b, dyr.b);
         }

         if (!$$5 && $$9) {
            $$1 = $$1.b(d, dyr.b);
         }

         return $$1;
      }
   }

   private dxn b(dgf $$0, dxn $$1, jh $$2) {
      boolean $$3 = !$$0.a_($$2.d()).d($$0, $$2);

      for (jm $$4 : jm.c.a) {
         if (!$$1.c(g.get($$4)).a()) {
            dyr $$5 = this.a($$0, $$2, $$4, $$3);
            $$1 = $$1.b(g.get($$4), $$5);
         }
      }

      return $$1;
   }

   @Override
   protected dxn a(dxn $$0, dhd $$1, dhp $$2, jh $$3, jm $$4, jh $$5, dxn $$6, bam $$7) {
      if ($$4 == jm.a) {
         return !this.a($$1, $$5, $$6) ? dkg.a.m() : $$0;
      } else if ($$4 == jm.b) {
         return this.a($$1, $$0, $$3);
      } else {
         dyr $$8 = this.a($$1, $$3, $$4);
         return $$8.a() == $$0.c(g.get($$4)).a() && !r($$0) ? $$0.b(g.get($$4), $$8) : this.a($$1, this.J.b(f, $$0.c(f)).b(g.get($$4), $$8), $$3);
      }
   }

   private static boolean r(dxn $$0) {
      return $$0.c(b).a() && $$0.c(d).a() && $$0.c(c).a() && $$0.c(e).a();
   }

   private static boolean s(dxn $$0) {
      return !$$0.c(b).a() && !$$0.c(d).a() && !$$0.c(c).a() && !$$0.c(e).a();
   }

   @Override
   protected void a(dxn $$0, dhb $$1, jh $$2, int $$3, int $$4) {
      jh.a $$5 = new jh.a();

      for (jm $$6 : jm.c.a) {
         dyr $$7 = $$0.c(g.get($$6));
         if ($$7 != dyr.c && !$$1.a_($$5.a($$2, $$6)).a(this)) {
            $$5.c(jm.a);
            dxn $$8 = $$1.a_($$5);
            if ($$8.a(this)) {
               jh $$9 = $$5.a($$6.g());
               $$1.a($$6.g(), $$5, $$9, $$1.a_($$9), $$3, $$4);
            }

            $$5.a($$2, $$6).c(jm.b);
            dxn $$10 = $$1.a_($$5);
            if ($$10.a(this)) {
               jh $$11 = $$5.a($$6.g());
               $$1.a($$6.g(), $$5, $$11, $$1.a_($$11), $$3, $$4);
            }
         }
      }
   }

   private dyr a(dgf $$0, jh $$1, jm $$2) {
      return this.a($$0, $$1, $$2, !$$0.a_($$1.d()).d($$0, $$1));
   }

   private dyr a(dgf $$0, jh $$1, jm $$2, boolean $$3) {
      jh $$4 = $$1.a($$2);
      dxn $$5 = $$0.a_($$4);
      if ($$3) {
         boolean $$6 = $$5.b() instanceof dsu || this.a($$0, $$4, $$5);
         if ($$6 && o($$0.a_($$4.d()))) {
            if ($$5.c($$0, $$4, $$2.g())) {
               return dyr.a;
            }

            return dyr.b;
         }
      }

      return !a($$5, $$2) && ($$5.d($$0, $$4) || !o($$0.a_($$4.e()))) ? dyr.c : dyr.b;
   }

   @Override
   protected boolean a(dxn $$0, dhd $$1, jh $$2) {
      jh $$3 = $$2.e();
      dxn $$4 = $$1.a_($$3);
      return this.a($$1, $$3, $$4);
   }

   private boolean a(dgf $$0, jh $$1, dxn $$2) {
      return $$2.c($$0, $$1, jm.b) || $$2.a(dkg.hs);
   }

   private void a(dha $$0, jh $$1, dxn $$2, @Nullable eux $$3, boolean $$4) {
      if (a($$0)) {
         new euu(this).a($$0, $$1, $$2, $$3, $$4);
      } else {
         this.K.a($$0, $$1, $$2, $$3, $$4);
      }
   }

   public int a(dha $$0, jh $$1) {
      this.L = false;
      int $$2 = $$0.D($$1);
      this.L = true;
      return $$2;
   }

   private void b(dha $$0, jh $$1) {
      if ($$0.a_($$1).a(this)) {
         $$0.a($$1, this);

         for (jm $$2 : jm.values()) {
            $$0.a($$1.a($$2), this);
         }
      }
   }

   @Override
   protected void b(dxn $$0, dha $$1, jh $$2, dxn $$3, boolean $$4) {
      if (!$$3.a($$0.b()) && !$$1.C) {
         this.a($$1, $$2, $$0, null, true);

         for (jm $$5 : jm.c.b) {
            $$1.a($$2.a($$5), this);
         }

         this.c($$1, $$2);
      }
   }

   @Override
   protected void a(dxn $$0, dha $$1, jh $$2, dxn $$3, boolean $$4) {
      if (!$$4 && !$$0.a($$3.b())) {
         super.a($$0, $$1, $$2, $$3, $$4);
         if (!$$1.C) {
            for (jm $$5 : jm.values()) {
               $$1.a($$2.a($$5), this);
            }

            this.a($$1, $$2, $$0, null, false);
            this.c($$1, $$2);
         }
      }
   }

   private void c(dha $$0, jh $$1) {
      for (jm $$2 : jm.c.a) {
         this.b($$0, $$1.a($$2));
      }

      for (jm $$3 : jm.c.a) {
         jh $$4 = $$1.a($$3);
         if ($$0.a_($$4).d($$0, $$4)) {
            this.b($$0, $$4.d());
         } else {
            this.b($$0, $$4.e());
         }
      }
   }

   @Override
   protected void a(dxn $$0, dha $$1, jh $$2, dke $$3, @Nullable eux $$4, boolean $$5) {
      if (!$$1.C) {
         if ($$3 != this || !a($$1)) {
            if ($$0.a((dhd)$$1, $$2)) {
               this.a($$1, $$2, $$0, $$4, false);
            } else {
               c($$0, $$1, $$2);
               $$1.a($$2, false);
            }
         }
      }
   }

   private static boolean a(dha $$0) {
      return $$0.J().b(csq.d);
   }

   @Override
   protected int b(dxn $$0, dgf $$1, jh $$2, jm $$3) {
      return !this.L ? 0 : $$0.a($$1, $$2, $$3);
   }

   @Override
   protected int a(dxn $$0, dgf $$1, jh $$2, jm $$3) {
      if (this.L && $$3 != jm.a) {
         int $$4 = $$0.c(f);
         if ($$4 == 0) {
            return 0;
         } else {
            return $$3 != jm.b && !this.a($$1, $$0, $$2).c(g.get($$3.g())).a() ? 0 : $$4;
         }
      } else {
         return 0;
      }
   }

   protected static boolean o(dxn $$0) {
      return a($$0, null);
   }

   protected static boolean a(dxn $$0, @Nullable jm $$1) {
      if ($$0.a(dkg.cE)) {
         return true;
      } else if ($$0.a(dkg.eu)) {
         jm $$2 = $$0.c(dqo.aF);
         return $$2 == $$1 || $$2.g() == $$1;
      } else {
         return $$0.a(dkg.lj) ? $$1 == $$0.c(dpr.a) : $$0.p() && $$1 != null;
      }
   }

   @Override
   protected boolean f_(dxn $$0) {
      return this.L;
   }

   public static int b(int $$0) {
      Vector3f $$1 = H[$$0];
      return ayp.a(0.0F, $$1.x(), $$1.y(), $$1.z());
   }

   private void a(dha $$0, bam $$1, jh $$2, Vector3f $$3, jm $$4, jm $$5, float $$6, float $$7) {
      float $$8 = $$7 - $$6;
      if (!($$1.i() >= 0.2F * $$8)) {
         float $$9 = 0.4375F;
         float $$10 = $$6 + $$8 * $$1.i();
         double $$11 = 0.5 + (double)(0.4375F * (float)$$4.j()) + (double)($$10 * (float)$$5.j());
         double $$12 = 0.5 + (double)(0.4375F * (float)$$4.k()) + (double)($$10 * (float)$$5.k());
         double $$13 = 0.5 + (double)(0.4375F * (float)$$4.l()) + (double)($$10 * (float)$$5.l());
         $$0.a(new ln($$3, 1.0F), (double)$$2.u() + $$11, (double)$$2.v() + $$12, (double)$$2.w() + $$13, 0.0, 0.0, 0.0);
      }
   }

   @Override
   public void a(dxn $$0, dha $$1, jh $$2, bam $$3) {
      int $$4 = $$0.c(f);
      if ($$4 != 0) {
         for (jm $$5 : jm.c.a) {
            dyr $$6 = $$0.c(g.get($$5));
            switch ($$6) {
               case a:
                  this.a($$1, $$3, $$2, H[$$4], $$5, jm.b, -0.5F, 0.5F);
               case b:
                  this.a($$1, $$3, $$2, H[$$4], jm.a, $$5, 0.0F, 0.5F);
                  break;
               case c:
               default:
                  this.a($$1, $$3, $$2, H[$$4], jm.a, $$5, 0.0F, 0.3F);
            }
         }
      }
   }

   @Override
   protected dxn a(dxn $$0, dqu $$1) {
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
   protected dxn a(dxn $$0, dpd $$1) {
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
   protected void a(dxo.a<dke, dxn> $$0) {
      $$0.a(b, c, d, e, f);
   }

   @Override
   protected bte a(dxn $$0, dha $$1, jh $$2, cps $$3, fbo $$4) {
      if (!$$3.gh().e) {
         return bte.e;
      } else {
         if (r($$0) || s($$0)) {
            dxn $$5 = r($$0) ? this.m() : this.J;
            $$5 = $$5.b(f, $$0.c(f));
            $$5 = this.a($$1, $$5, $$2);
            if ($$5 != $$0) {
               $$1.a($$2, $$5, 3);
               this.a($$1, $$2, $$0, $$5);
               return bte.a;
            }
         }

         return bte.e;
      }
   }

   private void a(dha $$0, jh $$1, dxn $$2, dxn $$3) {
      eux $$4 = eut.a($$0, null, jm.b);

      for (jm $$5 : jm.c.a) {
         jh $$6 = $$1.a($$5);
         if ($$2.c(g.get($$5)).a() != $$3.c(g.get($$5)).a() && $$0.a_($$6).d($$0, $$6)) {
            $$0.a($$6, $$3.b(), $$5.g(), eut.a($$4, $$5));
         }
      }
   }
}
