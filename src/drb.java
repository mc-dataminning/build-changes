import com.google.common.collect.ImmutableMap;
import com.google.common.collect.Maps;
import com.mojang.serialization.MapCodec;
import java.util.Map;
import java.util.Map.Entry;
import java.util.function.Function;
import javax.annotation.Nullable;

public class drb extends dku {
   public static final MapCodec<drb> a = b(drb::new);
   public static final dzk<dzr> b = dzc.ae;
   public static final dzk<dzr> c = dzc.ad;
   public static final dzk<dzr> d = dzc.af;
   public static final dzk<dzr> e = dzc.ag;
   public static final dzm f = dzc.aW;
   public static final Map<jo, dzk<dzr>> g = ImmutableMap.copyOf(Maps.newEnumMap(Map.of(jo.c, b, jo.f, c, jo.d, d, jo.e, e)));
   private static final int[] h = af.a(new int[16], $$0 -> {
      for (int $$1 = 0; $$1 <= 15; $$1++) {
         float $$2 = (float)$$1 / 15.0F;
         float $$3 = $$2 * 0.6F + ($$2 > 0.0F ? 0.4F : 0.3F);
         float $$4 = azk.a($$2 * $$2 * 0.7F - 0.5F, 0.0F, 1.0F);
         float $$5 = azk.a($$2 * $$2 * 0.6F - 0.7F, 0.0F, 1.0F);
         $$0[$$1] = axu.a(1.0F, $$3, $$4, $$5);
      }
   });
   private static final float i = 0.2F;
   private final Function<dym, fdo> C;
   private final dym Q;
   private final ewd R = new evw(this);
   private boolean S = true;

   @Override
   public MapCodec<drb> a() {
      return a;
   }

   public drb(dyl.d $$0) {
      super($$0);
      this.l(this.B.b().b(b, dzr.c).b(c, dzr.c).b(d, dzr.c).b(e, dzr.c).b(f, Integer.valueOf(0)));
      this.C = this.b();
      this.Q = this.m().b(b, dzr.b).b(c, dzr.b).b(d, dzr.b).b(e, dzr.b);
   }

   private Function<dym, fdo> b() {
      int $$0 = 1;
      int $$1 = 10;
      fdo $$2 = dku.b(10.0, 0.0, 1.0);
      Map<jo, fdo> $$3 = fdl.c(dku.a(10.0, 0.0, 1.0, 0.0, 8.0));
      Map<jo, fdo> $$4 = fdl.c(dku.b(10.0, 16.0, 0.0, 1.0));
      return this.a($$3x -> {
         fdo $$4x = $$2;

         for (Entry<jo, dzk<dzr>> $$5 : g.entrySet()) {
            $$4x = switch ((dzr)$$3x.c($$5.getValue())) {
               case a -> fdl.a($$4x, $$3.get($$5.getKey()), $$4.get($$5.getKey()));
               case b -> fdl.a($$4x, $$3.get($$5.getKey()));
               case c -> $$4x;
            };
         }

         return $$4x;
      }, new dzp[]{f});
   }

   @Override
   protected fdo a(dym $$0, dgv $$1, jj $$2, fcz $$3) {
      return this.C.apply($$0);
   }

   @Override
   public dym a(dbn $$0) {
      return this.a($$0.q(), this.Q, $$0.a());
   }

   private dym a(dgv $$0, dym $$1, jj $$2) {
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
            $$1 = $$1.b(e, dzr.b);
         }

         if (!$$6 && $$8) {
            $$1 = $$1.b(c, dzr.b);
         }

         if (!$$4 && $$9) {
            $$1 = $$1.b(b, dzr.b);
         }

         if (!$$5 && $$9) {
            $$1 = $$1.b(d, dzr.b);
         }

         return $$1;
      }
   }

   private dym b(dgv $$0, dym $$1, jj $$2) {
      boolean $$3 = !$$0.a_($$2.d()).d($$0, $$2);

      for (jo $$4 : jo.c.a) {
         if (!$$1.c(g.get($$4)).a()) {
            dzr $$5 = this.a($$0, $$2, $$4, $$3);
            $$1 = $$1.b(g.get($$4), $$5);
         }
      }

      return $$1;
   }

   @Override
   protected dym a(dym $$0, dhs $$1, die $$2, jj $$3, jo $$4, jj $$5, dym $$6, azs $$7) {
      if ($$4 == jo.a) {
         return !this.a($$1, $$5, $$6) ? dkw.a.m() : $$0;
      } else if ($$4 == jo.b) {
         return this.a($$1, $$0, $$3);
      } else {
         dzr $$8 = this.a($$1, $$3, $$4);
         return $$8.a() == $$0.c(g.get($$4)).a() && !q($$0) ? $$0.b(g.get($$4), $$8) : this.a($$1, this.Q.b(f, $$0.c(f)).b(g.get($$4), $$8), $$3);
      }
   }

   private static boolean q(dym $$0) {
      return $$0.c(b).a() && $$0.c(d).a() && $$0.c(c).a() && $$0.c(e).a();
   }

   private static boolean r(dym $$0) {
      return !$$0.c(b).a() && !$$0.c(d).a() && !$$0.c(c).a() && !$$0.c(e).a();
   }

   @Override
   protected void a(dym $$0, dhq $$1, jj $$2, int $$3, int $$4) {
      jj.a $$5 = new jj.a();

      for (jo $$6 : jo.c.a) {
         dzr $$7 = $$0.c(g.get($$6));
         if ($$7 != dzr.c && !$$1.a_($$5.a($$2, $$6)).a(this)) {
            $$5.c(jo.a);
            dym $$8 = $$1.a_($$5);
            if ($$8.a(this)) {
               jj $$9 = $$5.a($$6.g());
               $$1.a($$6.g(), $$5, $$9, $$1.a_($$9), $$3, $$4);
            }

            $$5.a($$2, $$6).c(jo.b);
            dym $$10 = $$1.a_($$5);
            if ($$10.a(this)) {
               jj $$11 = $$5.a($$6.g());
               $$1.a($$6.g(), $$5, $$11, $$1.a_($$11), $$3, $$4);
            }
         }
      }
   }

   private dzr a(dgv $$0, jj $$1, jo $$2) {
      return this.a($$0, $$1, $$2, !$$0.a_($$1.d()).d($$0, $$1));
   }

   private dzr a(dgv $$0, jj $$1, jo $$2, boolean $$3) {
      jj $$4 = $$1.a($$2);
      dym $$5 = $$0.a_($$4);
      if ($$3) {
         boolean $$6 = $$5.b() instanceof dtp || this.a($$0, $$4, $$5);
         if ($$6 && o($$0.a_($$4.d()))) {
            if ($$5.c($$0, $$4, $$2.g())) {
               return dzr.a;
            }

            return dzr.b;
         }
      }

      return !a($$5, $$2) && ($$5.d($$0, $$4) || !o($$0.a_($$4.e()))) ? dzr.c : dzr.b;
   }

   @Override
   protected boolean a(dym $$0, dhs $$1, jj $$2) {
      jj $$3 = $$2.e();
      dym $$4 = $$1.a_($$3);
      return this.a($$1, $$3, $$4);
   }

   private boolean a(dgv $$0, jj $$1, dym $$2) {
      return $$2.c($$0, $$1, jo.b) || $$2.a(dkw.hz);
   }

   private void a(dhp $$0, jj $$1, dym $$2, @Nullable ewb $$3, boolean $$4) {
      if (a($$0)) {
         new evy(this).a($$0, $$1, $$2, $$3, $$4);
      } else {
         this.R.a($$0, $$1, $$2, $$3, $$4);
      }
   }

   public int a(dhp $$0, jj $$1) {
      this.S = false;
      int $$2 = $$0.D($$1);
      this.S = true;
      return $$2;
   }

   private void b(dhp $$0, jj $$1) {
      if ($$0.a_($$1).a(this)) {
         $$0.a($$1, this);

         for (jo $$2 : jo.values()) {
            $$0.a($$1.a($$2), this);
         }
      }
   }

   @Override
   protected void a(dym $$0, dhp $$1, jj $$2, dym $$3, boolean $$4) {
      if (!$$3.a($$0.b()) && !$$1.C) {
         this.a($$1, $$2, $$0, null, true);

         for (jo $$5 : jo.c.b) {
            $$1.a($$2.a($$5), this);
         }

         this.c($$1, $$2);
      }
   }

   @Override
   protected void a(dym $$0, arn $$1, jj $$2, boolean $$3) {
      if (!$$3) {
         for (jo $$4 : jo.values()) {
            $$1.a($$2.a($$4), this);
         }

         this.a($$1, $$2, $$0, null, false);
         this.c($$1, $$2);
      }
   }

   private void c(dhp $$0, jj $$1) {
      for (jo $$2 : jo.c.a) {
         this.b($$0, $$1.a($$2));
      }

      for (jo $$3 : jo.c.a) {
         jj $$4 = $$1.a($$3);
         if ($$0.a_($$4).d($$0, $$4)) {
            this.b($$0, $$4.d());
         } else {
            this.b($$0, $$4.e());
         }
      }
   }

   @Override
   protected void a(dym $$0, dhp $$1, jj $$2, dku $$3, @Nullable ewb $$4, boolean $$5) {
      if (!$$1.C) {
         if ($$3 != this || !a($$1)) {
            if ($$0.a((dhs)$$1, $$2)) {
               this.a($$1, $$2, $$0, $$4, false);
            } else {
               c($$0, $$1, $$2);
               $$1.a($$2, false);
            }
         }
      }
   }

   private static boolean a(dhp $$0) {
      return $$0.K().b(ctg.c);
   }

   @Override
   protected int b(dym $$0, dgv $$1, jj $$2, jo $$3) {
      return !this.S ? 0 : $$0.a($$1, $$2, $$3);
   }

   @Override
   protected int a(dym $$0, dgv $$1, jj $$2, jo $$3) {
      if (this.S && $$3 != jo.a) {
         int $$4 = $$0.c(f);
         if ($$4 == 0) {
            return 0;
         } else {
            return $$3 != jo.b && !this.a($$1, $$0, $$2).c(g.get($$3.g())).a() ? 0 : $$4;
         }
      } else {
         return 0;
      }
   }

   protected static boolean o(dym $$0) {
      return a($$0, null);
   }

   protected static boolean a(dym $$0, @Nullable jo $$1) {
      if ($$0.a(dkw.cE)) {
         return true;
      } else if ($$0.a(dkw.eu)) {
         jo $$2 = $$0.c(drg.e);
         return $$2 == $$1 || $$2.g() == $$1;
      } else {
         return $$0.a(dkw.lq) ? $$1 == $$0.c(dqk.a) : $$0.p() && $$1 != null;
      }
   }

   @Override
   protected boolean f_(dym $$0) {
      return this.S;
   }

   public static int b(int $$0) {
      return h[$$0];
   }

   private static void a(dhp $$0, azs $$1, jj $$2, int $$3, jo $$4, jo $$5, float $$6, float $$7) {
      float $$8 = $$7 - $$6;
      if (!($$1.i() >= 0.2F * $$8)) {
         float $$9 = 0.4375F;
         float $$10 = $$6 + $$8 * $$1.i();
         double $$11 = 0.5 + (double)(0.4375F * (float)$$4.j()) + (double)($$10 * (float)$$5.j());
         double $$12 = 0.5 + (double)(0.4375F * (float)$$4.k()) + (double)($$10 * (float)$$5.k());
         double $$13 = 0.5 + (double)(0.4375F * (float)$$4.l()) + (double)($$10 * (float)$$5.l());
         $$0.a(new lq($$3, 1.0F), (double)$$2.u() + $$11, (double)$$2.v() + $$12, (double)$$2.w() + $$13, 0.0, 0.0, 0.0);
      }
   }

   @Override
   public void a(dym $$0, dhp $$1, jj $$2, azs $$3) {
      int $$4 = $$0.c(f);
      if ($$4 != 0) {
         for (jo $$5 : jo.c.a) {
            dzr $$6 = $$0.c(g.get($$5));
            switch ($$6) {
               case a:
                  a($$1, $$3, $$2, h[$$4], $$5, jo.b, -0.5F, 0.5F);
               case b:
                  a($$1, $$3, $$2, h[$$4], jo.a, $$5, 0.0F, 0.5F);
                  break;
               case c:
               default:
                  a($$1, $$3, $$2, h[$$4], jo.a, $$5, 0.0F, 0.3F);
            }
         }
      }
   }

   @Override
   protected dym a(dym $$0, drm $$1) {
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
   protected dym a(dym $$0, dpv $$1) {
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
   protected void a(dyn.a<dku, dym> $$0) {
      $$0.a(b, c, d, e, f);
   }

   @Override
   protected btq a(dym $$0, dhp $$1, jj $$2, cqi $$3, fcq $$4) {
      if (!$$3.gj().e) {
         return btq.e;
      } else {
         if (q($$0) || r($$0)) {
            dym $$5 = q($$0) ? this.m() : this.Q;
            $$5 = $$5.b(f, $$0.c(f));
            $$5 = this.a($$1, $$5, $$2);
            if ($$5 != $$0) {
               $$1.a($$2, $$5, 3);
               this.a($$1, $$2, $$0, $$5);
               return btq.a;
            }
         }

         return btq.e;
      }
   }

   private void a(dhp $$0, jj $$1, dym $$2, dym $$3) {
      ewb $$4 = evx.a($$0, null, jo.b);

      for (jo $$5 : jo.c.a) {
         jj $$6 = $$1.a($$5);
         if ($$2.c(g.get($$5)).a() != $$3.c(g.get($$5)).a() && $$0.a_($$6).d($$0, $$6)) {
            $$0.a($$6, $$3.b(), $$5.g(), evx.a($$4, $$5));
         }
      }
   }
}
