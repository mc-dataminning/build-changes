import com.google.common.collect.ImmutableMap;
import com.google.common.collect.Maps;
import com.mojang.serialization.MapCodec;
import java.util.Map;
import java.util.Map.Entry;
import java.util.function.Function;
import javax.annotation.Nullable;

public class dsb extends dlu {
   public static final MapCodec<dsb> a = b(dsb::new);
   public static final eam<eat> b = eae.ae;
   public static final eam<eat> c = eae.ad;
   public static final eam<eat> d = eae.af;
   public static final eam<eat> e = eae.ag;
   public static final eao f = eae.aW;
   public static final Map<ja, eam<eat>> g = ImmutableMap.copyOf(Maps.newEnumMap(Map.of(ja.c, b, ja.f, c, ja.d, d, ja.e, e)));
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
   private final Function<dzo, feq> C;
   private final dzo Q;
   private final exf R = new ewy(this);
   private boolean S = true;

   @Override
   public MapCodec<dsb> a() {
      return a;
   }

   public dsb(dzn.d $$0) {
      super($$0);
      this.l(this.B.b().b(b, eat.c).b(c, eat.c).b(d, eat.c).b(e, eat.c).b(f, Integer.valueOf(0)));
      this.C = this.b();
      this.Q = this.m().b(b, eat.b).b(c, eat.b).b(d, eat.b).b(e, eat.b);
   }

   private Function<dzo, feq> b() {
      int $$0 = 1;
      int $$1 = 10;
      feq $$2 = dlu.b(10.0, 0.0, 1.0);
      Map<ja, feq> $$3 = fen.c(dlu.a(10.0, 0.0, 1.0, 0.0, 8.0));
      Map<ja, feq> $$4 = fen.c(dlu.b(10.0, 16.0, 0.0, 1.0));
      return this.a($$3x -> {
         feq $$4x = $$2;

         for (Entry<ja, eam<eat>> $$5 : g.entrySet()) {
            $$4x = switch ((eat)$$3x.c($$5.getValue())) {
               case a -> fen.a($$4x, $$3.get($$5.getKey()), $$4.get($$5.getKey()));
               case b -> fen.a($$4x, $$3.get($$5.getKey()));
               case c -> $$4x;
            };
         }

         return $$4x;
      }, new ear[]{f});
   }

   @Override
   protected feq a(dzo $$0, dhv $$1, iu $$2, feb $$3) {
      return this.C.apply($$0);
   }

   @Override
   public dzo a(dcl $$0) {
      return this.a($$0.q(), this.Q, $$0.a());
   }

   private dzo a(dhv $$0, dzo $$1, iu $$2) {
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
            $$1 = $$1.b(e, eat.b);
         }

         if (!$$6 && $$8) {
            $$1 = $$1.b(c, eat.b);
         }

         if (!$$4 && $$9) {
            $$1 = $$1.b(b, eat.b);
         }

         if (!$$5 && $$9) {
            $$1 = $$1.b(d, eat.b);
         }

         return $$1;
      }
   }

   private dzo b(dhv $$0, dzo $$1, iu $$2) {
      boolean $$3 = !$$0.a_($$2.d()).d($$0, $$2);

      for (ja $$4 : ja.c.a) {
         if (!$$1.c(g.get($$4)).a()) {
            eat $$5 = this.a($$0, $$2, $$4, $$3);
            $$1 = $$1.b(g.get($$4), $$5);
         }
      }

      return $$1;
   }

   @Override
   protected dzo a(dzo $$0, dis $$1, dje $$2, iu $$3, ja $$4, iu $$5, dzo $$6, azt $$7) {
      if ($$4 == ja.a) {
         return !this.a($$1, $$5, $$6) ? dlw.a.m() : $$0;
      } else if ($$4 == ja.b) {
         return this.a($$1, $$0, $$3);
      } else {
         eat $$8 = this.a($$1, $$3, $$4);
         return $$8.a() == $$0.c(g.get($$4)).a() && !q($$0) ? $$0.b(g.get($$4), $$8) : this.a($$1, this.Q.b(f, $$0.c(f)).b(g.get($$4), $$8), $$3);
      }
   }

   private static boolean q(dzo $$0) {
      return $$0.c(b).a() && $$0.c(d).a() && $$0.c(c).a() && $$0.c(e).a();
   }

   private static boolean r(dzo $$0) {
      return !$$0.c(b).a() && !$$0.c(d).a() && !$$0.c(c).a() && !$$0.c(e).a();
   }

   @Override
   protected void a(dzo $$0, diq $$1, iu $$2, int $$3, int $$4) {
      iu.a $$5 = new iu.a();

      for (ja $$6 : ja.c.a) {
         eat $$7 = $$0.c(g.get($$6));
         if ($$7 != eat.c && !$$1.a_($$5.a($$2, $$6)).a(this)) {
            $$5.c(ja.a);
            dzo $$8 = $$1.a_($$5);
            if ($$8.a(this)) {
               iu $$9 = $$5.a($$6.g());
               $$1.a($$6.g(), $$5, $$9, $$1.a_($$9), $$3, $$4);
            }

            $$5.a($$2, $$6).c(ja.b);
            dzo $$10 = $$1.a_($$5);
            if ($$10.a(this)) {
               iu $$11 = $$5.a($$6.g());
               $$1.a($$6.g(), $$5, $$11, $$1.a_($$11), $$3, $$4);
            }
         }
      }
   }

   private eat a(dhv $$0, iu $$1, ja $$2) {
      return this.a($$0, $$1, $$2, !$$0.a_($$1.d()).d($$0, $$1));
   }

   private eat a(dhv $$0, iu $$1, ja $$2, boolean $$3) {
      iu $$4 = $$1.a($$2);
      dzo $$5 = $$0.a_($$4);
      if ($$3) {
         boolean $$6 = $$5.b() instanceof duq || this.a($$0, $$4, $$5);
         if ($$6 && o($$0.a_($$4.d()))) {
            if ($$5.c($$0, $$4, $$2.g())) {
               return eat.a;
            }

            return eat.b;
         }
      }

      return !a($$5, $$2) && ($$5.d($$0, $$4) || !o($$0.a_($$4.e()))) ? eat.c : eat.b;
   }

   @Override
   protected boolean a(dzo $$0, dis $$1, iu $$2) {
      iu $$3 = $$2.e();
      dzo $$4 = $$1.a_($$3);
      return this.a($$1, $$3, $$4);
   }

   private boolean a(dhv $$0, iu $$1, dzo $$2) {
      return $$2.c($$0, $$1, ja.b) || $$2.a(dlw.hz);
   }

   private void a(dip $$0, iu $$1, dzo $$2, @Nullable exd $$3, boolean $$4) {
      if (a($$0)) {
         new exa(this).a($$0, $$1, $$2, $$3, $$4);
      } else {
         this.R.a($$0, $$1, $$2, $$3, $$4);
      }
   }

   public int a(dip $$0, iu $$1) {
      this.S = false;
      int $$2 = $$0.E($$1);
      this.S = true;
      return $$2;
   }

   private void b(dip $$0, iu $$1) {
      if ($$0.a_($$1).a(this)) {
         $$0.a($$1, this);

         for (ja $$2 : ja.values()) {
            $$0.a($$1.a($$2), this);
         }
      }
   }

   @Override
   protected void a(dzo $$0, dip $$1, iu $$2, dzo $$3, boolean $$4) {
      if (!$$3.a($$0.b()) && !$$1.C) {
         this.a($$1, $$2, $$0, null, true);

         for (ja $$5 : ja.c.b) {
            $$1.a($$2.a($$5), this);
         }

         this.c($$1, $$2);
      }
   }

   @Override
   protected void a(dzo $$0, aro $$1, iu $$2, boolean $$3) {
      if (!$$3) {
         for (ja $$4 : ja.values()) {
            $$1.a($$2.a($$4), this);
         }

         this.a($$1, $$2, $$0, null, false);
         this.c($$1, $$2);
      }
   }

   private void c(dip $$0, iu $$1) {
      for (ja $$2 : ja.c.a) {
         this.b($$0, $$1.a($$2));
      }

      for (ja $$3 : ja.c.a) {
         iu $$4 = $$1.a($$3);
         if ($$0.a_($$4).d($$0, $$4)) {
            this.b($$0, $$4.d());
         } else {
            this.b($$0, $$4.e());
         }
      }
   }

   @Override
   protected void a(dzo $$0, dip $$1, iu $$2, dlu $$3, @Nullable exd $$4, boolean $$5) {
      if (!$$1.C) {
         if ($$3 != this || !a($$1)) {
            if ($$0.a((dis)$$1, $$2)) {
               this.a($$1, $$2, $$0, $$4, false);
            } else {
               c($$0, $$1, $$2);
               $$1.a($$2, false);
            }
         }
      }
   }

   private static boolean a(dip $$0) {
      return $$0.K().b(cud.c);
   }

   @Override
   protected int b(dzo $$0, dhv $$1, iu $$2, ja $$3) {
      return !this.S ? 0 : $$0.a($$1, $$2, $$3);
   }

   @Override
   protected int a(dzo $$0, dhv $$1, iu $$2, ja $$3) {
      if (this.S && $$3 != ja.a) {
         int $$4 = $$0.c(f);
         if ($$4 == 0) {
            return 0;
         } else {
            return $$3 != ja.b && !this.a($$1, $$0, $$2).c(g.get($$3.g())).a() ? 0 : $$4;
         }
      } else {
         return 0;
      }
   }

   protected static boolean o(dzo $$0) {
      return a($$0, null);
   }

   protected static boolean a(dzo $$0, @Nullable ja $$1) {
      if ($$0.a(dlw.cE)) {
         return true;
      } else if ($$0.a(dlw.eu)) {
         ja $$2 = $$0.c(dsg.e);
         return $$2 == $$1 || $$2.g() == $$1;
      } else {
         return $$0.a(dlw.lq) ? $$1 == $$0.c(drk.a) : $$0.p() && $$1 != null;
      }
   }

   @Override
   protected boolean f_(dzo $$0) {
      return this.S;
   }

   public static int b(int $$0) {
      return h[$$0];
   }

   private static void a(dip $$0, azt $$1, iu $$2, int $$3, ja $$4, ja $$5, float $$6, float $$7) {
      float $$8 = $$7 - $$6;
      if (!($$1.i() >= 0.2F * $$8)) {
         float $$9 = 0.4375F;
         float $$10 = $$6 + $$8 * $$1.i();
         double $$11 = 0.5 + (double)(0.4375F * (float)$$4.j()) + (double)($$10 * (float)$$5.j());
         double $$12 = 0.5 + (double)(0.4375F * (float)$$4.k()) + (double)($$10 * (float)$$5.k());
         double $$13 = 0.5 + (double)(0.4375F * (float)$$4.l()) + (double)($$10 * (float)$$5.l());
         $$0.a(new ls($$3, 1.0F), (double)$$2.u() + $$11, (double)$$2.v() + $$12, (double)$$2.w() + $$13, 0.0, 0.0, 0.0);
      }
   }

   @Override
   public void a(dzo $$0, dip $$1, iu $$2, azt $$3) {
      int $$4 = $$0.c(f);
      if ($$4 != 0) {
         for (ja $$5 : ja.c.a) {
            eat $$6 = $$0.c(g.get($$5));
            switch ($$6) {
               case a:
                  a($$1, $$3, $$2, h[$$4], $$5, ja.b, -0.5F, 0.5F);
               case b:
                  a($$1, $$3, $$2, h[$$4], ja.a, $$5, 0.0F, 0.5F);
                  break;
               case c:
               default:
                  a($$1, $$3, $$2, h[$$4], ja.a, $$5, 0.0F, 0.3F);
            }
         }
      }
   }

   @Override
   protected dzo a(dzo $$0, dsm $$1) {
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
   protected dzo a(dzo $$0, dqv $$1) {
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
   protected void a(dzp.a<dlu, dzo> $$0) {
      $$0.a(b, c, d, e, f);
   }

   @Override
   protected bty a(dzo $$0, dip $$1, iu $$2, cqs $$3, fds $$4) {
      if (!$$3.gj().e) {
         return bty.e;
      } else {
         if (q($$0) || r($$0)) {
            dzo $$5 = q($$0) ? this.m() : this.Q;
            $$5 = $$5.b(f, $$0.c(f));
            $$5 = this.a($$1, $$5, $$2);
            if ($$5 != $$0) {
               $$1.a($$2, $$5, 3);
               this.a($$1, $$2, $$0, $$5);
               return bty.a;
            }
         }

         return bty.e;
      }
   }

   private void a(dip $$0, iu $$1, dzo $$2, dzo $$3) {
      exd $$4 = ewz.a($$0, null, ja.b);

      for (ja $$5 : ja.c.a) {
         iu $$6 = $$1.a($$5);
         if ($$2.c(g.get($$5)).a() != $$3.c(g.get($$5)).a() && $$0.a_($$6).d($$0, $$6)) {
            $$0.a($$6, $$3.b(), $$5.g(), ewz.a($$4, $$5));
         }
      }
   }
}
