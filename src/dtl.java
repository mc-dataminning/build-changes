import com.google.common.collect.ImmutableMap;
import com.google.common.collect.Maps;
import com.mojang.serialization.MapCodec;
import java.util.Map;
import java.util.Map.Entry;
import java.util.function.Function;
import javax.annotation.Nullable;

public class dtl extends dnc {
   public static final MapCodec<dtl> a = b(dtl::new);
   public static final ecc<ecj> b = ebu.ae;
   public static final ecc<ecj> c = ebu.ad;
   public static final ecc<ecj> d = ebu.af;
   public static final ecc<ecj> e = ebu.ag;
   public static final ece f = ebu.aW;
   public static final Map<jb, ecc<ecj>> g = ImmutableMap.copyOf(Maps.newEnumMap(Map.of(jb.c, b, jb.f, c, jb.d, d, jb.e, e)));
   private static final int[] h = ag.a(new int[16], $$0 -> {
      for (int $$1 = 0; $$1 <= 15; $$1++) {
         float $$2 = (float)$$1 / 15.0F;
         float $$3 = $$2 * 0.6F + ($$2 > 0.0F ? 0.4F : 0.3F);
         float $$4 = azo.a($$2 * $$2 * 0.7F - 0.5F, 0.0F, 1.0F);
         float $$5 = azo.a($$2 * $$2 * 0.6F - 0.7F, 0.0F, 1.0F);
         $$0[$$1] = axy.a(1.0F, $$3, $$4, $$5);
      }
   });
   private static final float i = 0.2F;
   private final Function<ebe, fgk> D;
   private final ebe R;
   private final eyy S = new eyr(this);
   private boolean T = true;

   @Override
   public MapCodec<dtl> a() {
      return a;
   }

   public dtl(ebd.d $$0) {
      super($$0);
      this.l(this.C.b().b(b, ecj.c).b(c, ecj.c).b(d, ecj.c).b(e, ecj.c).b(f, Integer.valueOf(0)));
      this.D = this.b();
      this.R = this.m().b(b, ecj.b).b(c, ecj.b).b(d, ecj.b).b(e, ecj.b);
   }

   private Function<ebe, fgk> b() {
      int $$0 = 1;
      int $$1 = 10;
      fgk $$2 = dnc.b(10.0, 0.0, 1.0);
      Map<jb, fgk> $$3 = fgh.c(dnc.a(10.0, 0.0, 1.0, 0.0, 8.0));
      Map<jb, fgk> $$4 = fgh.c(dnc.b(10.0, 16.0, 0.0, 1.0));
      return this.a($$3x -> {
         fgk $$4x = $$2;

         for (Entry<jb, ecc<ecj>> $$5 : g.entrySet()) {
            $$4x = switch ((ecj)$$3x.c($$5.getValue())) {
               case a -> fgh.a($$4x, $$3.get($$5.getKey()), $$4.get($$5.getKey()));
               case b -> fgh.a($$4x, $$3.get($$5.getKey()));
               case c -> $$4x;
            };
         }

         return $$4x;
      }, new ech[]{f});
   }

   @Override
   protected fgk a(ebe $$0, djb $$1, iv $$2, ffv $$3) {
      return this.D.apply($$0);
   }

   @Override
   public ebe a(ddr $$0) {
      return this.a($$0.q(), this.R, $$0.a());
   }

   private ebe a(djb $$0, ebe $$1, iv $$2) {
      boolean $$3 = r($$1);
      $$1 = this.b($$0, this.m().b(f, $$1.c(f)), $$2);
      if ($$3 && r($$1)) {
         return $$1;
      } else {
         boolean $$4 = $$1.c(b).a();
         boolean $$5 = $$1.c(d).a();
         boolean $$6 = $$1.c(c).a();
         boolean $$7 = $$1.c(e).a();
         boolean $$8 = !$$4 && !$$5;
         boolean $$9 = !$$6 && !$$7;
         if (!$$7 && $$8) {
            $$1 = $$1.b(e, ecj.b);
         }

         if (!$$6 && $$8) {
            $$1 = $$1.b(c, ecj.b);
         }

         if (!$$4 && $$9) {
            $$1 = $$1.b(b, ecj.b);
         }

         if (!$$5 && $$9) {
            $$1 = $$1.b(d, ecj.b);
         }

         return $$1;
      }
   }

   private ebe b(djb $$0, ebe $$1, iv $$2) {
      boolean $$3 = !$$0.a_($$2.d()).d($$0, $$2);

      for (jb $$4 : jb.c.a) {
         if (!$$1.c(g.get($$4)).a()) {
            ecj $$5 = this.a($$0, $$2, $$4, $$3);
            $$1 = $$1.b(g.get($$4), $$5);
         }
      }

      return $$1;
   }

   @Override
   protected ebe a(ebe $$0, dka $$1, dkm $$2, iv $$3, jb $$4, iv $$5, ebe $$6, azx $$7) {
      if ($$4 == jb.a) {
         return !this.a($$1, $$5, $$6) ? dne.a.m() : $$0;
      } else if ($$4 == jb.b) {
         return this.a($$1, $$0, $$3);
      } else {
         ecj $$8 = this.a($$1, $$3, $$4);
         return $$8.a() == $$0.c(g.get($$4)).a() && !q($$0) ? $$0.b(g.get($$4), $$8) : this.a($$1, this.R.b(f, $$0.c(f)).b(g.get($$4), $$8), $$3);
      }
   }

   private static boolean q(ebe $$0) {
      return $$0.c(b).a() && $$0.c(d).a() && $$0.c(c).a() && $$0.c(e).a();
   }

   private static boolean r(ebe $$0) {
      return !$$0.c(b).a() && !$$0.c(d).a() && !$$0.c(c).a() && !$$0.c(e).a();
   }

   @Override
   protected void a(ebe $$0, djy $$1, iv $$2, int $$3, int $$4) {
      iv.a $$5 = new iv.a();

      for (jb $$6 : jb.c.a) {
         ecj $$7 = $$0.c(g.get($$6));
         if ($$7 != ecj.c && !$$1.a_($$5.a($$2, $$6)).a(this)) {
            $$5.c(jb.a);
            ebe $$8 = $$1.a_($$5);
            if ($$8.a(this)) {
               iv $$9 = $$5.a($$6.g());
               $$1.a($$6.g(), $$5, $$9, $$1.a_($$9), $$3, $$4);
            }

            $$5.a($$2, $$6).c(jb.b);
            ebe $$10 = $$1.a_($$5);
            if ($$10.a(this)) {
               iv $$11 = $$5.a($$6.g());
               $$1.a($$6.g(), $$5, $$11, $$1.a_($$11), $$3, $$4);
            }
         }
      }
   }

   private ecj a(djb $$0, iv $$1, jb $$2) {
      return this.a($$0, $$1, $$2, !$$0.a_($$1.d()).d($$0, $$1));
   }

   private ecj a(djb $$0, iv $$1, jb $$2, boolean $$3) {
      iv $$4 = $$1.a($$2);
      ebe $$5 = $$0.a_($$4);
      if ($$3) {
         boolean $$6 = $$5.b() instanceof dwe || this.a($$0, $$4, $$5);
         if ($$6 && o($$0.a_($$4.d()))) {
            if ($$5.c($$0, $$4, $$2.g())) {
               return ecj.a;
            }

            return ecj.b;
         }
      }

      return !a($$5, $$2) && ($$5.d($$0, $$4) || !o($$0.a_($$4.e()))) ? ecj.c : ecj.b;
   }

   @Override
   protected boolean a(ebe $$0, dka $$1, iv $$2) {
      iv $$3 = $$2.e();
      ebe $$4 = $$1.a_($$3);
      return this.a($$1, $$3, $$4);
   }

   private boolean a(djb $$0, iv $$1, ebe $$2) {
      return $$2.c($$0, $$1, jb.b) || $$2.a(dne.hD);
   }

   private void a(djx $$0, iv $$1, ebe $$2, @Nullable eyw $$3, boolean $$4) {
      if (a($$0)) {
         new eyt(this).a($$0, $$1, $$2, $$3, $$4);
      } else {
         this.S.a($$0, $$1, $$2, $$3, $$4);
      }
   }

   public int a(djx $$0, iv $$1) {
      this.T = false;
      int $$2 = $$0.E($$1);
      this.T = true;
      return $$2;
   }

   private void b(djx $$0, iv $$1) {
      if ($$0.a_($$1).a(this)) {
         $$0.a($$1, this);

         for (jb $$2 : jb.values()) {
            $$0.a($$1.a($$2), this);
         }
      }
   }

   @Override
   protected void a(ebe $$0, djx $$1, iv $$2, ebe $$3, boolean $$4) {
      if (!$$3.a($$0.b()) && !$$1.C) {
         this.a($$1, $$2, $$0, null, true);

         for (jb $$5 : jb.c.b) {
            $$1.a($$2.a($$5), this);
         }

         this.c($$1, $$2);
      }
   }

   @Override
   protected void a(ebe $$0, ars $$1, iv $$2, boolean $$3) {
      if (!$$3) {
         for (jb $$4 : jb.values()) {
            $$1.a($$2.a($$4), this);
         }

         this.a($$1, $$2, $$0, null, false);
         this.c($$1, $$2);
      }
   }

   private void c(djx $$0, iv $$1) {
      for (jb $$2 : jb.c.a) {
         this.b($$0, $$1.a($$2));
      }

      for (jb $$3 : jb.c.a) {
         iv $$4 = $$1.a($$3);
         if ($$0.a_($$4).d($$0, $$4)) {
            this.b($$0, $$4.d());
         } else {
            this.b($$0, $$4.e());
         }
      }
   }

   @Override
   protected void a(ebe $$0, djx $$1, iv $$2, dnc $$3, @Nullable eyw $$4, boolean $$5) {
      if (!$$1.C) {
         if ($$3 != this || !a($$1)) {
            if ($$0.a((dka)$$1, $$2)) {
               this.a($$1, $$2, $$0, $$4, false);
            } else {
               c($$0, $$1, $$2);
               $$1.a($$2, false);
            }
         }
      }
   }

   private static boolean a(djx $$0) {
      return $$0.K().b(cvj.c);
   }

   @Override
   protected int b(ebe $$0, djb $$1, iv $$2, jb $$3) {
      return !this.T ? 0 : $$0.a($$1, $$2, $$3);
   }

   @Override
   protected int a(ebe $$0, djb $$1, iv $$2, jb $$3) {
      if (this.T && $$3 != jb.a) {
         int $$4 = $$0.c(f);
         if ($$4 == 0) {
            return 0;
         } else {
            return $$3 != jb.b && !this.a($$1, $$0, $$2).c(g.get($$3.g())).a() ? 0 : $$4;
         }
      } else {
         return 0;
      }
   }

   protected static boolean o(ebe $$0) {
      return a($$0, null);
   }

   protected static boolean a(ebe $$0, @Nullable jb $$1) {
      if ($$0.a(dne.cH)) {
         return true;
      } else if ($$0.a(dne.ey)) {
         jb $$2 = $$0.c(dtq.e);
         return $$2 == $$1 || $$2.g() == $$1;
      } else {
         return $$0.a(dne.lu) ? $$1 == $$0.c(dsu.a) : $$0.p() && $$1 != null;
      }
   }

   @Override
   protected boolean f_(ebe $$0) {
      return this.T;
   }

   public static int b(int $$0) {
      return h[$$0];
   }

   private static void a(djx $$0, azx $$1, iv $$2, int $$3, jb $$4, jb $$5, float $$6, float $$7) {
      float $$8 = $$7 - $$6;
      if (!($$1.i() >= 0.2F * $$8)) {
         float $$9 = 0.4375F;
         float $$10 = $$6 + $$8 * $$1.i();
         double $$11 = 0.5 + (double)(0.4375F * (float)$$4.j()) + (double)($$10 * (float)$$5.j());
         double $$12 = 0.5 + (double)(0.4375F * (float)$$4.k()) + (double)($$10 * (float)$$5.k());
         double $$13 = 0.5 + (double)(0.4375F * (float)$$4.l()) + (double)($$10 * (float)$$5.l());
         $$0.a(new lt($$3, 1.0F), (double)$$2.u() + $$11, (double)$$2.v() + $$12, (double)$$2.w() + $$13, 0.0, 0.0, 0.0);
      }
   }

   @Override
   public void a(ebe $$0, djx $$1, iv $$2, azx $$3) {
      int $$4 = $$0.c(f);
      if ($$4 != 0) {
         for (jb $$5 : jb.c.a) {
            ecj $$6 = $$0.c(g.get($$5));
            switch ($$6) {
               case a:
                  a($$1, $$3, $$2, h[$$4], $$5, jb.b, -0.5F, 0.5F);
               case b:
                  a($$1, $$3, $$2, h[$$4], jb.a, $$5, 0.0F, 0.5F);
                  break;
               case c:
               default:
                  a($$1, $$3, $$2, h[$$4], jb.a, $$5, 0.0F, 0.3F);
            }
         }
      }
   }

   @Override
   protected ebe a(ebe $$0, dtw $$1) {
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
   protected ebe a(ebe $$0, dsf $$1) {
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
   protected void a(ebf.a<dnc, ebe> $$0) {
      $$0.a(b, c, d, e, f);
   }

   @Override
   protected bur a(ebe $$0, djx $$1, iv $$2, crx $$3, ffm $$4) {
      if (!$$3.gk().e) {
         return bur.e;
      } else {
         if (q($$0) || r($$0)) {
            ebe $$5 = q($$0) ? this.m() : this.R;
            $$5 = $$5.b(f, $$0.c(f));
            $$5 = this.a($$1, $$5, $$2);
            if ($$5 != $$0) {
               $$1.a($$2, $$5, 3);
               this.a($$1, $$2, $$0, $$5);
               return bur.a;
            }
         }

         return bur.e;
      }
   }

   private void a(djx $$0, iv $$1, ebe $$2, ebe $$3) {
      eyw $$4 = eys.a($$0, null, jb.b);

      for (jb $$5 : jb.c.a) {
         iv $$6 = $$1.a($$5);
         if ($$2.c(g.get($$5)).a() != $$3.c(g.get($$5)).a() && $$0.a_($$6).d($$0, $$6)) {
            $$0.a($$6, $$3.b(), $$5.g(), eys.a($$4, $$5));
         }
      }
   }
}
