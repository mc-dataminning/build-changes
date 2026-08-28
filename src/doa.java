import com.google.common.collect.ImmutableMap;
import com.google.common.collect.Maps;
import com.google.common.collect.UnmodifiableIterator;
import com.mojang.serialization.MapCodec;
import java.util.Map;
import javax.annotation.Nullable;
import org.joml.Vector3f;

public class doa extends dhy {
   public static final MapCodec<doa> a = b(doa::new);
   public static final dwb<dwi> b = dvt.ab;
   public static final dwb<dwi> c = dvt.aa;
   public static final dwb<dwi> d = dvt.ac;
   public static final dwb<dwi> e = dvt.ad;
   public static final dwd f = dvt.aT;
   public static final Map<jl, dwb<dwi>> g = Maps.newEnumMap(ImmutableMap.of(jl.c, b, jl.f, c, jl.d, d, jl.e, e));
   protected static final int h = 1;
   protected static final int i = 3;
   protected static final int j = 13;
   protected static final int k = 3;
   protected static final int l = 13;
   private static final fab m = dhy.a(3.0, 0.0, 3.0, 13.0, 1.0, 13.0);
   private static final Map<jl, fab> n = Maps.newEnumMap(
      ImmutableMap.of(
         jl.c,
         dhy.a(3.0, 0.0, 0.0, 13.0, 1.0, 13.0),
         jl.d,
         dhy.a(3.0, 0.0, 3.0, 13.0, 1.0, 16.0),
         jl.f,
         dhy.a(3.0, 0.0, 3.0, 16.0, 1.0, 13.0),
         jl.e,
         dhy.a(0.0, 0.0, 3.0, 13.0, 1.0, 13.0)
      )
   );
   private static final Map<jl, fab> o = Maps.newEnumMap(
      ImmutableMap.of(
         jl.c,
         ezy.a(n.get(jl.c), dhy.a(3.0, 0.0, 0.0, 13.0, 16.0, 1.0)),
         jl.d,
         ezy.a(n.get(jl.d), dhy.a(3.0, 0.0, 15.0, 13.0, 16.0, 16.0)),
         jl.f,
         ezy.a(n.get(jl.f), dhy.a(15.0, 0.0, 3.0, 16.0, 16.0, 13.0)),
         jl.e,
         ezy.a(n.get(jl.e), dhy.a(0.0, 0.0, 3.0, 1.0, 16.0, 13.0))
      )
   );
   private static final Map<dvd, fab> G = Maps.newHashMap();
   private static final Vector3f[] H = ad.a(new Vector3f[16], $$0 -> {
      for (int $$1 = 0; $$1 <= 15; $$1++) {
         float $$2 = (float)$$1 / 15.0F;
         float $$3 = $$2 * 0.6F + ($$2 > 0.0F ? 0.4F : 0.3F);
         float $$4 = azj.a($$2 * $$2 * 0.7F - 0.5F, 0.0F, 1.0F);
         float $$5 = azj.a($$2 * $$2 * 0.6F - 0.7F, 0.0F, 1.0F);
         $$0[$$1] = new Vector3f($$3, $$4, $$5);
      }
   });
   private static final float I = 0.2F;
   private final dvd J;
   private final eso K = new esh(this);
   private boolean L = true;

   @Override
   public MapCodec<doa> a() {
      return a;
   }

   public doa(dvc.d $$0) {
      super($$0);
      this.l(this.F.b().b(b, dwi.c).b(c, dwi.c).b(d, dwi.c).b(e, dwi.c).b(f, Integer.valueOf(0)));
      this.J = this.m().b(b, dwi.b).b(c, dwi.b).b(d, dwi.b).b(e, dwi.b);
      UnmodifiableIterator var2 = this.l().a().iterator();

      while (var2.hasNext()) {
         dvd $$1 = (dvd)var2.next();
         if ($$1.c(f) == 0) {
            G.put($$1, this.q($$1));
         }
      }
   }

   private fab q(dvd $$0) {
      fab $$1 = m;

      for (jl $$2 : jl.c.a) {
         dwi $$3 = $$0.c(g.get($$2));
         if ($$3 == dwi.b) {
            $$1 = ezy.a($$1, n.get($$2));
         } else if ($$3 == dwi.a) {
            $$1 = ezy.a($$1, o.get($$2));
         }
      }

      return $$1;
   }

   @Override
   protected fab a(dvd $$0, dea $$1, jg $$2, ezm $$3) {
      return G.get($$0.b(f, Integer.valueOf(0)));
   }

   @Override
   public dvd a(czm $$0) {
      return this.a($$0.q(), this.J, $$0.a());
   }

   private dvd a(dea $$0, dvd $$1, jg $$2) {
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
            $$1 = $$1.b(e, dwi.b);
         }

         if (!$$6 && $$8) {
            $$1 = $$1.b(c, dwi.b);
         }

         if (!$$4 && $$9) {
            $$1 = $$1.b(b, dwi.b);
         }

         if (!$$5 && $$9) {
            $$1 = $$1.b(d, dwi.b);
         }

         return $$1;
      }
   }

   private dvd b(dea $$0, dvd $$1, jg $$2) {
      boolean $$3 = !$$0.a_($$2.d()).d($$0, $$2);

      for (jl $$4 : jl.c.a) {
         if (!$$1.c(g.get($$4)).a()) {
            dwi $$5 = this.a($$0, $$2, $$4, $$3);
            $$1 = $$1.b(g.get($$4), $$5);
         }
      }

      return $$1;
   }

   @Override
   protected dvd a(dvd $$0, jl $$1, dvd $$2, dew $$3, jg $$4, jg $$5) {
      if ($$1 == jl.a) {
         return !this.a($$3, $$5, $$2) ? dia.a.m() : $$0;
      } else if ($$1 == jl.b) {
         return this.a($$3, $$0, $$4);
      } else {
         dwi $$6 = this.a($$3, $$4, $$1);
         return $$6.a() == $$0.c(g.get($$1)).a() && !r($$0) ? $$0.b(g.get($$1), $$6) : this.a($$3, this.J.b(f, $$0.c(f)).b(g.get($$1), $$6), $$4);
      }
   }

   private static boolean r(dvd $$0) {
      return $$0.c(b).a() && $$0.c(d).a() && $$0.c(c).a() && $$0.c(e).a();
   }

   private static boolean s(dvd $$0) {
      return !$$0.c(b).a() && !$$0.c(d).a() && !$$0.c(c).a() && !$$0.c(e).a();
   }

   @Override
   protected void a(dvd $$0, dew $$1, jg $$2, int $$3, int $$4) {
      jg.a $$5 = new jg.a();

      for (jl $$6 : jl.c.a) {
         dwi $$7 = $$0.c(g.get($$6));
         if ($$7 != dwi.c && !$$1.a_($$5.a($$2, $$6)).a(this)) {
            $$5.c(jl.a);
            dvd $$8 = $$1.a_($$5);
            if ($$8.a(this)) {
               jg $$9 = $$5.a($$6.g());
               $$1.a($$6.g(), $$5, $$9, $$1.a_($$9), $$3, $$4);
            }

            $$5.a($$2, $$6).c(jl.b);
            dvd $$10 = $$1.a_($$5);
            if ($$10.a(this)) {
               jg $$11 = $$5.a($$6.g());
               $$1.a($$6.g(), $$5, $$11, $$1.a_($$11), $$3, $$4);
            }
         }
      }
   }

   private dwi a(dea $$0, jg $$1, jl $$2) {
      return this.a($$0, $$1, $$2, !$$0.a_($$1.d()).d($$0, $$1));
   }

   private dwi a(dea $$0, jg $$1, jl $$2, boolean $$3) {
      jg $$4 = $$1.a($$2);
      dvd $$5 = $$0.a_($$4);
      if ($$3) {
         boolean $$6 = $$5.b() instanceof dql || this.a($$0, $$4, $$5);
         if ($$6 && o($$0.a_($$4.d()))) {
            if ($$5.c($$0, $$4, $$2.g())) {
               return dwi.a;
            }

            return dwi.b;
         }
      }

      return !a($$5, $$2) && ($$5.d($$0, $$4) || !o($$0.a_($$4.e()))) ? dwi.c : dwi.b;
   }

   @Override
   protected boolean a(dvd $$0, dey $$1, jg $$2) {
      jg $$3 = $$2.e();
      dvd $$4 = $$1.a_($$3);
      return this.a($$1, $$3, $$4);
   }

   private boolean a(dea $$0, jg $$1, dvd $$2) {
      return $$2.c($$0, $$1, jl.b) || $$2.a(dia.hc);
   }

   private void a(dev $$0, jg $$1, dvd $$2, @Nullable esm $$3, boolean $$4) {
      if (a($$0)) {
         new esj(this).a($$0, $$1, $$2, $$3, $$4);
      } else {
         this.K.a($$0, $$1, $$2, $$3, $$4);
      }
   }

   public int a(dev $$0, jg $$1) {
      this.L = false;
      int $$2 = $$0.D($$1);
      this.L = true;
      return $$2;
   }

   private void b(dev $$0, jg $$1) {
      if ($$0.a_($$1).a(this)) {
         $$0.a($$1, this);

         for (jl $$2 : jl.values()) {
            $$0.a($$1.a($$2), this);
         }
      }
   }

   @Override
   protected void b(dvd $$0, dev $$1, jg $$2, dvd $$3, boolean $$4) {
      if (!$$3.a($$0.b()) && !$$1.C) {
         this.a($$1, $$2, $$0, null, true);

         for (jl $$5 : jl.c.b) {
            $$1.a($$2.a($$5), this);
         }

         this.c($$1, $$2);
      }
   }

   @Override
   protected void a(dvd $$0, dev $$1, jg $$2, dvd $$3, boolean $$4) {
      if (!$$4 && !$$0.a($$3.b())) {
         super.a($$0, $$1, $$2, $$3, $$4);
         if (!$$1.C) {
            for (jl $$5 : jl.values()) {
               $$1.a($$2.a($$5), this);
            }

            this.a($$1, $$2, $$0, null, false);
            this.c($$1, $$2);
         }
      }
   }

   private void c(dev $$0, jg $$1) {
      for (jl $$2 : jl.c.a) {
         this.b($$0, $$1.a($$2));
      }

      for (jl $$3 : jl.c.a) {
         jg $$4 = $$1.a($$3);
         if ($$0.a_($$4).d($$0, $$4)) {
            this.b($$0, $$4.d());
         } else {
            this.b($$0, $$4.e());
         }
      }
   }

   @Override
   protected void a(dvd $$0, dev $$1, jg $$2, dhy $$3, @Nullable esm $$4, boolean $$5) {
      if (!$$1.C) {
         if ($$3 != this || !a($$1)) {
            if ($$0.a((dey)$$1, $$2)) {
               this.a($$1, $$2, $$0, $$4, false);
            } else {
               c($$0, $$1, $$2);
               $$1.a($$2, false);
            }
         }
      }
   }

   private static boolean a(dev $$0) {
      return $$0.J().b(crc.d);
   }

   @Override
   protected int b(dvd $$0, dea $$1, jg $$2, jl $$3) {
      return !this.L ? 0 : $$0.a($$1, $$2, $$3);
   }

   @Override
   protected int a(dvd $$0, dea $$1, jg $$2, jl $$3) {
      if (this.L && $$3 != jl.a) {
         int $$4 = $$0.c(f);
         if ($$4 == 0) {
            return 0;
         } else {
            return $$3 != jl.b && !this.a($$1, $$0, $$2).c(g.get($$3.g())).a() ? 0 : $$4;
         }
      } else {
         return 0;
      }
   }

   protected static boolean o(dvd $$0) {
      return a($$0, null);
   }

   protected static boolean a(dvd $$0, @Nullable jl $$1) {
      if ($$0.a(dia.cw)) {
         return true;
      } else if ($$0.a(dia.eh)) {
         jl $$2 = $$0.c(dof.aF);
         return $$2 == $$1 || $$2.g() == $$1;
      } else {
         return $$0.a(dia.kO) ? $$1 == $$0.c(dni.a) : $$0.p() && $$1 != null;
      }
   }

   @Override
   protected boolean f_(dvd $$0) {
      return this.L;
   }

   public static int b(int $$0) {
      Vector3f $$1 = H[$$0];
      return axu.a(0.0F, $$1.x(), $$1.y(), $$1.z());
   }

   private void a(dev $$0, azr $$1, jg $$2, Vector3f $$3, jl $$4, jl $$5, float $$6, float $$7) {
      float $$8 = $$7 - $$6;
      if (!($$1.i() >= 0.2F * $$8)) {
         float $$9 = 0.4375F;
         float $$10 = $$6 + $$8 * $$1.i();
         double $$11 = 0.5 + (double)(0.4375F * (float)$$4.j()) + (double)($$10 * (float)$$5.j());
         double $$12 = 0.5 + (double)(0.4375F * (float)$$4.k()) + (double)($$10 * (float)$$5.k());
         double $$13 = 0.5 + (double)(0.4375F * (float)$$4.l()) + (double)($$10 * (float)$$5.l());
         $$0.a(new ll($$3, 1.0F), (double)$$2.u() + $$11, (double)$$2.v() + $$12, (double)$$2.w() + $$13, 0.0, 0.0, 0.0);
      }
   }

   @Override
   public void a(dvd $$0, dev $$1, jg $$2, azr $$3) {
      int $$4 = $$0.c(f);
      if ($$4 != 0) {
         for (jl $$5 : jl.c.a) {
            dwi $$6 = $$0.c(g.get($$5));
            switch ($$6) {
               case a:
                  this.a($$1, $$3, $$2, H[$$4], $$5, jl.b, -0.5F, 0.5F);
               case b:
                  this.a($$1, $$3, $$2, H[$$4], jl.a, $$5, 0.0F, 0.5F);
                  break;
               case c:
               default:
                  this.a($$1, $$3, $$2, H[$$4], jl.a, $$5, 0.0F, 0.3F);
            }
         }
      }
   }

   @Override
   protected dvd a(dvd $$0, dol $$1) {
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
   protected dvd a(dvd $$0, dmu $$1) {
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
   protected void a(dve.a<dhy, dvd> $$0) {
      $$0.a(b, c, d, e, f);
   }

   @Override
   protected bry a(dvd $$0, dev $$1, jg $$2, coh $$3, ezd $$4) {
      if (!$$3.gl().e) {
         return bry.e;
      } else {
         if (r($$0) || s($$0)) {
            dvd $$5 = r($$0) ? this.m() : this.J;
            $$5 = $$5.b(f, $$0.c(f));
            $$5 = this.a($$1, $$5, $$2);
            if ($$5 != $$0) {
               $$1.a($$2, $$5, 3);
               this.a($$1, $$2, $$0, $$5);
               return bry.a;
            }
         }

         return bry.e;
      }
   }

   private void a(dev $$0, jg $$1, dvd $$2, dvd $$3) {
      esm $$4 = esi.a($$0, null, jl.b);

      for (jl $$5 : jl.c.a) {
         jg $$6 = $$1.a($$5);
         if ($$2.c(g.get($$5)).a() != $$3.c(g.get($$5)).a() && $$0.a_($$6).d($$0, $$6)) {
            $$0.a($$6, $$3.b(), $$5.g(), esi.a($$4, $$5));
         }
      }
   }
}
