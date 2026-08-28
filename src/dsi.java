import com.google.common.collect.ImmutableMap;
import com.google.common.collect.Maps;
import com.mojang.serialization.MapCodec;
import java.util.Map;
import java.util.Map.Entry;
import java.util.function.Function;
import javax.annotation.Nullable;

public class dsi extends dma {
   public static final MapCodec<dsi> a = b(dsi::new);
   public static final eax<ebe> b = eap.ae;
   public static final eax<ebe> c = eap.ad;
   public static final eax<ebe> d = eap.af;
   public static final eax<ebe> e = eap.ag;
   public static final eaz f = eap.aW;
   public static final Map<ja, eax<ebe>> g = ImmutableMap.copyOf(Maps.newEnumMap(Map.of(ja.c, b, ja.f, c, ja.d, d, ja.e, e)));
   private static final int[] h = af.a(new int[16], $$0 -> {
      for (int $$1 = 0; $$1 <= 15; $$1++) {
         float $$2 = (float)$$1 / 15.0F;
         float $$3 = $$2 * 0.6F + ($$2 > 0.0F ? 0.4F : 0.3F);
         float $$4 = azm.a($$2 * $$2 * 0.7F - 0.5F, 0.0F, 1.0F);
         float $$5 = azm.a($$2 * $$2 * 0.6F - 0.7F, 0.0F, 1.0F);
         $$0[$$1] = axw.a(1.0F, $$3, $$4, $$5);
      }
   });
   private static final float i = 0.2F;
   private final Function<dzz, ffc> C;
   private final dzz Q;
   private final exq R = new exj(this);
   private boolean S = true;

   @Override
   public MapCodec<dsi> a() {
      return a;
   }

   public dsi(dzy.d $$0) {
      super($$0);
      this.l(this.B.b().b(b, ebe.c).b(c, ebe.c).b(d, ebe.c).b(e, ebe.c).b(f, Integer.valueOf(0)));
      this.C = this.b();
      this.Q = this.m().b(b, ebe.b).b(c, ebe.b).b(d, ebe.b).b(e, ebe.b);
   }

   private Function<dzz, ffc> b() {
      int $$0 = 1;
      int $$1 = 10;
      ffc $$2 = dma.b(10.0, 0.0, 1.0);
      Map<ja, ffc> $$3 = fez.c(dma.a(10.0, 0.0, 1.0, 0.0, 8.0));
      Map<ja, ffc> $$4 = fez.c(dma.b(10.0, 16.0, 0.0, 1.0));
      return this.a($$3x -> {
         ffc $$4x = $$2;

         for (Entry<ja, eax<ebe>> $$5 : g.entrySet()) {
            $$4x = switch ((ebe)$$3x.c($$5.getValue())) {
               case a -> fez.a($$4x, $$3.get($$5.getKey()), $$4.get($$5.getKey()));
               case b -> fez.a($$4x, $$3.get($$5.getKey()));
               case c -> $$4x;
            };
         }

         return $$4x;
      }, new ebc[]{f});
   }

   @Override
   protected ffc a(dzz $$0, dib $$1, iu $$2, fen $$3) {
      return this.C.apply($$0);
   }

   @Override
   public dzz a(dcr $$0) {
      return this.a($$0.q(), this.Q, $$0.a());
   }

   private dzz a(dib $$0, dzz $$1, iu $$2) {
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
            $$1 = $$1.b(e, ebe.b);
         }

         if (!$$6 && $$8) {
            $$1 = $$1.b(c, ebe.b);
         }

         if (!$$4 && $$9) {
            $$1 = $$1.b(b, ebe.b);
         }

         if (!$$5 && $$9) {
            $$1 = $$1.b(d, ebe.b);
         }

         return $$1;
      }
   }

   private dzz b(dib $$0, dzz $$1, iu $$2) {
      boolean $$3 = !$$0.a_($$2.d()).d($$0, $$2);

      for (ja $$4 : ja.c.a) {
         if (!$$1.c(g.get($$4)).a()) {
            ebe $$5 = this.a($$0, $$2, $$4, $$3);
            $$1 = $$1.b(g.get($$4), $$5);
         }
      }

      return $$1;
   }

   @Override
   protected dzz a(dzz $$0, diy $$1, djk $$2, iu $$3, ja $$4, iu $$5, dzz $$6, azv $$7) {
      if ($$4 == ja.a) {
         return !this.a($$1, $$5, $$6) ? dmc.a.m() : $$0;
      } else if ($$4 == ja.b) {
         return this.a($$1, $$0, $$3);
      } else {
         ebe $$8 = this.a($$1, $$3, $$4);
         return $$8.a() == $$0.c(g.get($$4)).a() && !q($$0) ? $$0.b(g.get($$4), $$8) : this.a($$1, this.Q.b(f, $$0.c(f)).b(g.get($$4), $$8), $$3);
      }
   }

   private static boolean q(dzz $$0) {
      return $$0.c(b).a() && $$0.c(d).a() && $$0.c(c).a() && $$0.c(e).a();
   }

   private static boolean r(dzz $$0) {
      return !$$0.c(b).a() && !$$0.c(d).a() && !$$0.c(c).a() && !$$0.c(e).a();
   }

   @Override
   protected void a(dzz $$0, diw $$1, iu $$2, int $$3, int $$4) {
      iu.a $$5 = new iu.a();

      for (ja $$6 : ja.c.a) {
         ebe $$7 = $$0.c(g.get($$6));
         if ($$7 != ebe.c && !$$1.a_($$5.a($$2, $$6)).a(this)) {
            $$5.c(ja.a);
            dzz $$8 = $$1.a_($$5);
            if ($$8.a(this)) {
               iu $$9 = $$5.a($$6.g());
               $$1.a($$6.g(), $$5, $$9, $$1.a_($$9), $$3, $$4);
            }

            $$5.a($$2, $$6).c(ja.b);
            dzz $$10 = $$1.a_($$5);
            if ($$10.a(this)) {
               iu $$11 = $$5.a($$6.g());
               $$1.a($$6.g(), $$5, $$11, $$1.a_($$11), $$3, $$4);
            }
         }
      }
   }

   private ebe a(dib $$0, iu $$1, ja $$2) {
      return this.a($$0, $$1, $$2, !$$0.a_($$1.d()).d($$0, $$1));
   }

   private ebe a(dib $$0, iu $$1, ja $$2, boolean $$3) {
      iu $$4 = $$1.a($$2);
      dzz $$5 = $$0.a_($$4);
      if ($$3) {
         boolean $$6 = $$5.b() instanceof duz || this.a($$0, $$4, $$5);
         if ($$6 && o($$0.a_($$4.d()))) {
            if ($$5.c($$0, $$4, $$2.g())) {
               return ebe.a;
            }

            return ebe.b;
         }
      }

      return !a($$5, $$2) && ($$5.d($$0, $$4) || !o($$0.a_($$4.e()))) ? ebe.c : ebe.b;
   }

   @Override
   protected boolean a(dzz $$0, diy $$1, iu $$2) {
      iu $$3 = $$2.e();
      dzz $$4 = $$1.a_($$3);
      return this.a($$1, $$3, $$4);
   }

   private boolean a(dib $$0, iu $$1, dzz $$2) {
      return $$2.c($$0, $$1, ja.b) || $$2.a(dmc.hA);
   }

   private void a(div $$0, iu $$1, dzz $$2, @Nullable exo $$3, boolean $$4) {
      if (a($$0)) {
         new exl(this).a($$0, $$1, $$2, $$3, $$4);
      } else {
         this.R.a($$0, $$1, $$2, $$3, $$4);
      }
   }

   public int a(div $$0, iu $$1) {
      this.S = false;
      int $$2 = $$0.E($$1);
      this.S = true;
      return $$2;
   }

   private void b(div $$0, iu $$1) {
      if ($$0.a_($$1).a(this)) {
         $$0.a($$1, this);

         for (ja $$2 : ja.values()) {
            $$0.a($$1.a($$2), this);
         }
      }
   }

   @Override
   protected void a(dzz $$0, div $$1, iu $$2, dzz $$3, boolean $$4) {
      if (!$$3.a($$0.b()) && !$$1.C) {
         this.a($$1, $$2, $$0, null, true);

         for (ja $$5 : ja.c.b) {
            $$1.a($$2.a($$5), this);
         }

         this.c($$1, $$2);
      }
   }

   @Override
   protected void a(dzz $$0, arq $$1, iu $$2, boolean $$3) {
      if (!$$3) {
         for (ja $$4 : ja.values()) {
            $$1.a($$2.a($$4), this);
         }

         this.a($$1, $$2, $$0, null, false);
         this.c($$1, $$2);
      }
   }

   private void c(div $$0, iu $$1) {
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
   protected void a(dzz $$0, div $$1, iu $$2, dma $$3, @Nullable exo $$4, boolean $$5) {
      if (!$$1.C) {
         if ($$3 != this || !a($$1)) {
            if ($$0.a((diy)$$1, $$2)) {
               this.a($$1, $$2, $$0, $$4, false);
            } else {
               c($$0, $$1, $$2);
               $$1.a($$2, false);
            }
         }
      }
   }

   private static boolean a(div $$0) {
      return $$0.K().b(cuj.c);
   }

   @Override
   protected int b(dzz $$0, dib $$1, iu $$2, ja $$3) {
      return !this.S ? 0 : $$0.a($$1, $$2, $$3);
   }

   @Override
   protected int a(dzz $$0, dib $$1, iu $$2, ja $$3) {
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

   protected static boolean o(dzz $$0) {
      return a($$0, null);
   }

   protected static boolean a(dzz $$0, @Nullable ja $$1) {
      if ($$0.a(dmc.cF)) {
         return true;
      } else if ($$0.a(dmc.ev)) {
         ja $$2 = $$0.c(dsn.e);
         return $$2 == $$1 || $$2.g() == $$1;
      } else {
         return $$0.a(dmc.lr) ? $$1 == $$0.c(drr.a) : $$0.p() && $$1 != null;
      }
   }

   @Override
   protected boolean f_(dzz $$0) {
      return this.S;
   }

   public static int b(int $$0) {
      return h[$$0];
   }

   private static void a(div $$0, azv $$1, iu $$2, int $$3, ja $$4, ja $$5, float $$6, float $$7) {
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
   public void a(dzz $$0, div $$1, iu $$2, azv $$3) {
      int $$4 = $$0.c(f);
      if ($$4 != 0) {
         for (ja $$5 : ja.c.a) {
            ebe $$6 = $$0.c(g.get($$5));
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
   protected dzz a(dzz $$0, dst $$1) {
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
   protected dzz a(dzz $$0, drc $$1) {
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
   protected void a(eaa.a<dma, dzz> $$0) {
      $$0.a(b, c, d, e, f);
   }

   @Override
   protected bub a(dzz $$0, div $$1, iu $$2, cqy $$3, fee $$4) {
      if (!$$3.gj().e) {
         return bub.e;
      } else {
         if (q($$0) || r($$0)) {
            dzz $$5 = q($$0) ? this.m() : this.Q;
            $$5 = $$5.b(f, $$0.c(f));
            $$5 = this.a($$1, $$5, $$2);
            if ($$5 != $$0) {
               $$1.a($$2, $$5, 3);
               this.a($$1, $$2, $$0, $$5);
               return bub.a;
            }
         }

         return bub.e;
      }
   }

   private void a(div $$0, iu $$1, dzz $$2, dzz $$3) {
      exo $$4 = exk.a($$0, null, ja.b);

      for (ja $$5 : ja.c.a) {
         iu $$6 = $$1.a($$5);
         if ($$2.c(g.get($$5)).a() != $$3.c(g.get($$5)).a() && $$0.a_($$6).d($$0, $$6)) {
            $$0.a($$6, $$3.b(), $$5.g(), exk.a($$4, $$5));
         }
      }
   }
}
