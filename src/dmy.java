import com.google.common.collect.ImmutableMap;
import com.google.common.collect.Maps;
import com.google.common.collect.UnmodifiableIterator;
import com.mojang.serialization.MapCodec;
import java.util.Map;
import javax.annotation.Nullable;
import org.joml.Vector3f;

public class dmy extends dgv {
   public static final MapCodec<dmy> a = b(dmy::new);
   public static final duy<dvf> b = duq.ab;
   public static final duy<dvf> c = duq.aa;
   public static final duy<dvf> d = duq.ac;
   public static final duy<dvf> e = duq.ad;
   public static final dva f = duq.aT;
   public static final Map<jj, duy<dvf>> g = Maps.newEnumMap(ImmutableMap.of(jj.c, b, jj.f, c, jj.d, d, jj.e, e));
   protected static final int h = 1;
   protected static final int i = 3;
   protected static final int j = 13;
   protected static final int k = 3;
   protected static final int l = 13;
   private static final eyx m = dgv.a(3.0, 0.0, 3.0, 13.0, 1.0, 13.0);
   private static final Map<jj, eyx> n = Maps.newEnumMap(
      ImmutableMap.of(
         jj.c,
         dgv.a(3.0, 0.0, 0.0, 13.0, 1.0, 13.0),
         jj.d,
         dgv.a(3.0, 0.0, 3.0, 13.0, 1.0, 16.0),
         jj.f,
         dgv.a(3.0, 0.0, 3.0, 16.0, 1.0, 13.0),
         jj.e,
         dgv.a(0.0, 0.0, 3.0, 13.0, 1.0, 13.0)
      )
   );
   private static final Map<jj, eyx> o = Maps.newEnumMap(
      ImmutableMap.of(
         jj.c,
         eyu.a(n.get(jj.c), dgv.a(3.0, 0.0, 0.0, 13.0, 16.0, 1.0)),
         jj.d,
         eyu.a(n.get(jj.d), dgv.a(3.0, 0.0, 15.0, 13.0, 16.0, 16.0)),
         jj.f,
         eyu.a(n.get(jj.f), dgv.a(15.0, 0.0, 3.0, 16.0, 16.0, 13.0)),
         jj.e,
         eyu.a(n.get(jj.e), dgv.a(0.0, 0.0, 3.0, 1.0, 16.0, 13.0))
      )
   );
   private static final Map<dua, eyx> F = Maps.newHashMap();
   private static final Vector3f[] G = ad.a(new Vector3f[16], $$0 -> {
      for (int $$1 = 0; $$1 <= 15; $$1++) {
         float $$2 = (float)$$1 / 15.0F;
         float $$3 = $$2 * 0.6F + ($$2 > 0.0F ? 0.4F : 0.3F);
         float $$4 = azc.a($$2 * $$2 * 0.7F - 0.5F, 0.0F, 1.0F);
         float $$5 = azc.a($$2 * $$2 * 0.6F - 0.7F, 0.0F, 1.0F);
         $$0[$$1] = new Vector3f($$3, $$4, $$5);
      }
   });
   private static final float H = 0.2F;
   private final dua I;
   private final erl J = new ere(this);
   private boolean K = true;

   @Override
   public MapCodec<dmy> a() {
      return a;
   }

   public dmy(dtz.d $$0) {
      super($$0);
      this.l(this.E.b().b(b, dvf.c).b(c, dvf.c).b(d, dvf.c).b(e, dvf.c).b(f, Integer.valueOf(0)));
      this.I = this.o().b(b, dvf.b).b(c, dvf.b).b(d, dvf.b).b(e, dvf.b);
      UnmodifiableIterator var2 = this.l().a().iterator();

      while (var2.hasNext()) {
         dua $$1 = (dua)var2.next();
         if ($$1.c(f) == 0) {
            F.put($$1, this.q($$1));
         }
      }
   }

   private eyx q(dua $$0) {
      eyx $$1 = m;

      for (jj $$2 : jj.c.a) {
         dvf $$3 = $$0.c(g.get($$2));
         if ($$3 == dvf.b) {
            $$1 = eyu.a($$1, n.get($$2));
         } else if ($$3 == dvf.a) {
            $$1 = eyu.a($$1, o.get($$2));
         }
      }

      return $$1;
   }

   @Override
   protected eyx a(dua $$0, dcx $$1, je $$2, eyj $$3) {
      return F.get($$0.b(f, Integer.valueOf(0)));
   }

   @Override
   public dua a(cyw $$0) {
      return this.a($$0.q(), this.I, $$0.a());
   }

   private dua a(dcx $$0, dua $$1, je $$2) {
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
            $$1 = $$1.b(e, dvf.b);
         }

         if (!$$6 && $$8) {
            $$1 = $$1.b(c, dvf.b);
         }

         if (!$$4 && $$9) {
            $$1 = $$1.b(b, dvf.b);
         }

         if (!$$5 && $$9) {
            $$1 = $$1.b(d, dvf.b);
         }

         return $$1;
      }
   }

   private dua b(dcx $$0, dua $$1, je $$2) {
      boolean $$3 = !$$0.a_($$2.d()).d($$0, $$2);

      for (jj $$4 : jj.c.a) {
         if (!$$1.c(g.get($$4)).a()) {
            dvf $$5 = this.a($$0, $$2, $$4, $$3);
            $$1 = $$1.b(g.get($$4), $$5);
         }
      }

      return $$1;
   }

   @Override
   protected dua a(dua $$0, jj $$1, dua $$2, ddt $$3, je $$4, je $$5) {
      if ($$1 == jj.a) {
         return !this.a($$3, $$5, $$2) ? dgx.a.o() : $$0;
      } else if ($$1 == jj.b) {
         return this.a($$3, $$0, $$4);
      } else {
         dvf $$6 = this.a($$3, $$4, $$1);
         return $$6.a() == $$0.c(g.get($$1)).a() && !r($$0) ? $$0.b(g.get($$1), $$6) : this.a($$3, this.I.b(f, $$0.c(f)).b(g.get($$1), $$6), $$4);
      }
   }

   private static boolean r(dua $$0) {
      return $$0.c(b).a() && $$0.c(d).a() && $$0.c(c).a() && $$0.c(e).a();
   }

   private static boolean s(dua $$0) {
      return !$$0.c(b).a() && !$$0.c(d).a() && !$$0.c(c).a() && !$$0.c(e).a();
   }

   @Override
   protected void a(dua $$0, ddt $$1, je $$2, int $$3, int $$4) {
      je.a $$5 = new je.a();

      for (jj $$6 : jj.c.a) {
         dvf $$7 = $$0.c(g.get($$6));
         if ($$7 != dvf.c && !$$1.a_($$5.a($$2, $$6)).a(this)) {
            $$5.c(jj.a);
            dua $$8 = $$1.a_($$5);
            if ($$8.a(this)) {
               je $$9 = $$5.a($$6.g());
               $$1.a($$6.g(), $$1.a_($$9), $$5, $$9, $$3, $$4);
            }

            $$5.a($$2, $$6).c(jj.b);
            dua $$10 = $$1.a_($$5);
            if ($$10.a(this)) {
               je $$11 = $$5.a($$6.g());
               $$1.a($$6.g(), $$1.a_($$11), $$5, $$11, $$3, $$4);
            }
         }
      }
   }

   private dvf a(dcx $$0, je $$1, jj $$2) {
      return this.a($$0, $$1, $$2, !$$0.a_($$1.d()).d($$0, $$1));
   }

   private dvf a(dcx $$0, je $$1, jj $$2, boolean $$3) {
      je $$4 = $$1.a($$2);
      dua $$5 = $$0.a_($$4);
      if ($$3) {
         boolean $$6 = $$5.b() instanceof dpj || this.a($$0, $$4, $$5);
         if ($$6 && o($$0.a_($$4.d()))) {
            if ($$5.c($$0, $$4, $$2.g())) {
               return dvf.a;
            }

            return dvf.b;
         }
      }

      return !a($$5, $$2) && ($$5.d($$0, $$4) || !o($$0.a_($$4.e()))) ? dvf.c : dvf.b;
   }

   @Override
   protected boolean a(dua $$0, ddv $$1, je $$2) {
      je $$3 = $$2.e();
      dua $$4 = $$1.a_($$3);
      return this.a($$1, $$3, $$4);
   }

   private boolean a(dcx $$0, je $$1, dua $$2) {
      return $$2.c($$0, $$1, jj.b) || $$2.a(dgx.hc);
   }

   private void a(dds $$0, je $$1, dua $$2, @Nullable erj $$3) {
      if (a($$0)) {
         new erg(this).a($$0, $$1, $$2, $$3);
      } else {
         this.J.a($$0, $$1, $$2, $$3);
      }
   }

   public int a(dds $$0, je $$1) {
      this.K = false;
      int $$2 = $$0.D($$1);
      this.K = true;
      return $$2;
   }

   private void b(dds $$0, je $$1) {
      if ($$0.a_($$1).a(this)) {
         $$0.a($$1, this);

         for (jj $$2 : jj.values()) {
            $$0.a($$1.a($$2), this);
         }
      }
   }

   @Override
   protected void b(dua $$0, dds $$1, je $$2, dua $$3, boolean $$4) {
      if (!$$3.a($$0.b()) && !$$1.B) {
         this.a($$1, $$2, $$0, null);

         for (jj $$5 : jj.c.b) {
            $$1.a($$2.a($$5), this);
         }

         this.c($$1, $$2);
      }
   }

   @Override
   protected void a(dua $$0, dds $$1, je $$2, dua $$3, boolean $$4) {
      if (!$$4 && !$$0.a($$3.b())) {
         super.a($$0, $$1, $$2, $$3, $$4);
         if (!$$1.B) {
            for (jj $$5 : jj.values()) {
               $$1.a($$2.a($$5), this);
            }

            this.a($$1, $$2, $$0, null);
            this.c($$1, $$2);
         }
      }
   }

   private void c(dds $$0, je $$1) {
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
   protected void a(dua $$0, dds $$1, je $$2, dgv $$3, @Nullable erj $$4, boolean $$5) {
      if (!$$1.B) {
         if ($$3 != this || !a($$1)) {
            if ($$0.a((ddv)$$1, $$2)) {
               this.a($$1, $$2, $$0, $$4);
            } else {
               c($$0, $$1, $$2);
               $$1.a($$2, false);
            }
         }
      }
   }

   private static boolean a(dds $$0) {
      return $$0.J().b(cqj.d);
   }

   @Override
   protected int b(dua $$0, dcx $$1, je $$2, jj $$3) {
      return !this.K ? 0 : $$0.a($$1, $$2, $$3);
   }

   @Override
   protected int a(dua $$0, dcx $$1, je $$2, jj $$3) {
      if (this.K && $$3 != jj.a) {
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

   protected static boolean o(dua $$0) {
      return a($$0, null);
   }

   protected static boolean a(dua $$0, @Nullable jj $$1) {
      if ($$0.a(dgx.cw)) {
         return true;
      } else if ($$0.a(dgx.eh)) {
         jj $$2 = $$0.c(dnd.aE);
         return $$2 == $$1 || $$2.g() == $$1;
      } else {
         return $$0.a(dgx.kO) ? $$1 == $$0.c(dmg.a) : $$0.p() && $$1 != null;
      }
   }

   @Override
   protected boolean f_(dua $$0) {
      return this.K;
   }

   public static int b(int $$0) {
      Vector3f $$1 = G[$$0];
      return axn.a(0.0F, $$1.x(), $$1.y(), $$1.z());
   }

   private void a(dds $$0, azk $$1, je $$2, Vector3f $$3, jj $$4, jj $$5, float $$6, float $$7) {
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
   public void a(dua $$0, dds $$1, je $$2, azk $$3) {
      int $$4 = $$0.c(f);
      if ($$4 != 0) {
         for (jj $$5 : jj.c.a) {
            dvf $$6 = $$0.c(g.get($$5));
            switch ($$6) {
               case a:
                  this.a($$1, $$3, $$2, G[$$4], $$5, jj.b, -0.5F, 0.5F);
               case b:
                  this.a($$1, $$3, $$2, G[$$4], jj.a, $$5, 0.0F, 0.5F);
                  break;
               case c:
               default:
                  this.a($$1, $$3, $$2, G[$$4], jj.a, $$5, 0.0F, 0.3F);
            }
         }
      }
   }

   @Override
   protected dua a(dua $$0, dnj $$1) {
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
   protected dua a(dua $$0, dls $$1) {
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
   protected void a(dub.a<dgv, dua> $$0) {
      $$0.a(b, c, d, e, f);
   }

   @Override
   protected brk a(dua $$0, dds $$1, je $$2, cnp $$3, eya $$4) {
      if (!$$3.gd().e) {
         return brk.e;
      } else {
         if (r($$0) || s($$0)) {
            dua $$5 = r($$0) ? this.o() : this.I;
            $$5 = $$5.b(f, $$0.c(f));
            $$5 = this.a($$1, $$5, $$2);
            if ($$5 != $$0) {
               $$1.a($$2, $$5, 3);
               this.a($$1, $$2, $$0, $$5);
               return brk.a;
            }
         }

         return brk.e;
      }
   }

   private void a(dds $$0, je $$1, dua $$2, dua $$3) {
      erj $$4 = erf.a($$0, null, jj.b);

      for (jj $$5 : jj.c.a) {
         je $$6 = $$1.a($$5);
         if ($$2.c(g.get($$5)).a() != $$3.c(g.get($$5)).a() && $$0.a_($$6).d($$0, $$6)) {
            $$0.a($$6, $$3.b(), $$5.g(), erf.a($$4, $$5));
         }
      }
   }
}
