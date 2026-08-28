import com.google.common.collect.ImmutableMap;
import com.google.common.collect.Maps;
import com.mojang.serialization.MapCodec;
import java.util.Map;
import java.util.Map.Entry;
import java.util.function.Function;
import javax.annotation.Nullable;

public class dso extends dmf {
   public static final MapCodec<dso> a = b(dso::new);
   public static final ebf<ebm> b = eax.ae;
   public static final ebf<ebm> c = eax.ad;
   public static final ebf<ebm> d = eax.af;
   public static final ebf<ebm> e = eax.ag;
   public static final ebh f = eax.aW;
   public static final Map<ja, ebf<ebm>> g = ImmutableMap.copyOf(Maps.newEnumMap(Map.of(ja.c, b, ja.f, c, ja.d, d, ja.e, e)));
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
   private final Function<eah, ffk> D;
   private final eah R;
   private final exy S = new exr(this);
   private boolean T = true;

   @Override
   public MapCodec<dso> a() {
      return a;
   }

   public dso(eag.d $$0) {
      super($$0);
      this.l(this.C.b().b(b, ebm.c).b(c, ebm.c).b(d, ebm.c).b(e, ebm.c).b(f, Integer.valueOf(0)));
      this.D = this.b();
      this.R = this.m().b(b, ebm.b).b(c, ebm.b).b(d, ebm.b).b(e, ebm.b);
   }

   private Function<eah, ffk> b() {
      int $$0 = 1;
      int $$1 = 10;
      ffk $$2 = dmf.b(10.0, 0.0, 1.0);
      Map<ja, ffk> $$3 = ffh.c(dmf.a(10.0, 0.0, 1.0, 0.0, 8.0));
      Map<ja, ffk> $$4 = ffh.c(dmf.b(10.0, 16.0, 0.0, 1.0));
      return this.a($$3x -> {
         ffk $$4x = $$2;

         for (Entry<ja, ebf<ebm>> $$5 : g.entrySet()) {
            $$4x = switch ((ebm)$$3x.c($$5.getValue())) {
               case a -> ffh.a($$4x, $$3.get($$5.getKey()), $$4.get($$5.getKey()));
               case b -> ffh.a($$4x, $$3.get($$5.getKey()));
               case c -> $$4x;
            };
         }

         return $$4x;
      }, new ebk[]{f});
   }

   @Override
   protected ffk a(eah $$0, dig $$1, iu $$2, fev $$3) {
      return this.D.apply($$0);
   }

   @Override
   public eah a(dcw $$0) {
      return this.a($$0.q(), this.R, $$0.a());
   }

   private eah a(dig $$0, eah $$1, iu $$2) {
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
            $$1 = $$1.b(e, ebm.b);
         }

         if (!$$6 && $$8) {
            $$1 = $$1.b(c, ebm.b);
         }

         if (!$$4 && $$9) {
            $$1 = $$1.b(b, ebm.b);
         }

         if (!$$5 && $$9) {
            $$1 = $$1.b(d, ebm.b);
         }

         return $$1;
      }
   }

   private eah b(dig $$0, eah $$1, iu $$2) {
      boolean $$3 = !$$0.a_($$2.d()).d($$0, $$2);

      for (ja $$4 : ja.c.a) {
         if (!$$1.c(g.get($$4)).a()) {
            ebm $$5 = this.a($$0, $$2, $$4, $$3);
            $$1 = $$1.b(g.get($$4), $$5);
         }
      }

      return $$1;
   }

   @Override
   protected eah a(eah $$0, djd $$1, djp $$2, iu $$3, ja $$4, iu $$5, eah $$6, azv $$7) {
      if ($$4 == ja.a) {
         return !this.a($$1, $$5, $$6) ? dmh.a.m() : $$0;
      } else if ($$4 == ja.b) {
         return this.a($$1, $$0, $$3);
      } else {
         ebm $$8 = this.a($$1, $$3, $$4);
         return $$8.a() == $$0.c(g.get($$4)).a() && !q($$0) ? $$0.b(g.get($$4), $$8) : this.a($$1, this.R.b(f, $$0.c(f)).b(g.get($$4), $$8), $$3);
      }
   }

   private static boolean q(eah $$0) {
      return $$0.c(b).a() && $$0.c(d).a() && $$0.c(c).a() && $$0.c(e).a();
   }

   private static boolean r(eah $$0) {
      return !$$0.c(b).a() && !$$0.c(d).a() && !$$0.c(c).a() && !$$0.c(e).a();
   }

   @Override
   protected void a(eah $$0, djb $$1, iu $$2, int $$3, int $$4) {
      iu.a $$5 = new iu.a();

      for (ja $$6 : ja.c.a) {
         ebm $$7 = $$0.c(g.get($$6));
         if ($$7 != ebm.c && !$$1.a_($$5.a($$2, $$6)).a(this)) {
            $$5.c(ja.a);
            eah $$8 = $$1.a_($$5);
            if ($$8.a(this)) {
               iu $$9 = $$5.a($$6.g());
               $$1.a($$6.g(), $$5, $$9, $$1.a_($$9), $$3, $$4);
            }

            $$5.a($$2, $$6).c(ja.b);
            eah $$10 = $$1.a_($$5);
            if ($$10.a(this)) {
               iu $$11 = $$5.a($$6.g());
               $$1.a($$6.g(), $$5, $$11, $$1.a_($$11), $$3, $$4);
            }
         }
      }
   }

   private ebm a(dig $$0, iu $$1, ja $$2) {
      return this.a($$0, $$1, $$2, !$$0.a_($$1.d()).d($$0, $$1));
   }

   private ebm a(dig $$0, iu $$1, ja $$2, boolean $$3) {
      iu $$4 = $$1.a($$2);
      eah $$5 = $$0.a_($$4);
      if ($$3) {
         boolean $$6 = $$5.b() instanceof dvh || this.a($$0, $$4, $$5);
         if ($$6 && o($$0.a_($$4.d()))) {
            if ($$5.c($$0, $$4, $$2.g())) {
               return ebm.a;
            }

            return ebm.b;
         }
      }

      return !a($$5, $$2) && ($$5.d($$0, $$4) || !o($$0.a_($$4.e()))) ? ebm.c : ebm.b;
   }

   @Override
   protected boolean a(eah $$0, djd $$1, iu $$2) {
      iu $$3 = $$2.e();
      eah $$4 = $$1.a_($$3);
      return this.a($$1, $$3, $$4);
   }

   private boolean a(dig $$0, iu $$1, eah $$2) {
      return $$2.c($$0, $$1, ja.b) || $$2.a(dmh.hD);
   }

   private void a(dja $$0, iu $$1, eah $$2, @Nullable exw $$3, boolean $$4) {
      if (a($$0)) {
         new ext(this).a($$0, $$1, $$2, $$3, $$4);
      } else {
         this.S.a($$0, $$1, $$2, $$3, $$4);
      }
   }

   public int a(dja $$0, iu $$1) {
      this.T = false;
      int $$2 = $$0.E($$1);
      this.T = true;
      return $$2;
   }

   private void b(dja $$0, iu $$1) {
      if ($$0.a_($$1).a(this)) {
         $$0.a($$1, this);

         for (ja $$2 : ja.values()) {
            $$0.a($$1.a($$2), this);
         }
      }
   }

   @Override
   protected void a(eah $$0, dja $$1, iu $$2, eah $$3, boolean $$4) {
      if (!$$3.a($$0.b()) && !$$1.C) {
         this.a($$1, $$2, $$0, null, true);

         for (ja $$5 : ja.c.b) {
            $$1.a($$2.a($$5), this);
         }

         this.c($$1, $$2);
      }
   }

   @Override
   protected void a(eah $$0, arq $$1, iu $$2, boolean $$3) {
      if (!$$3) {
         for (ja $$4 : ja.values()) {
            $$1.a($$2.a($$4), this);
         }

         this.a($$1, $$2, $$0, null, false);
         this.c($$1, $$2);
      }
   }

   private void c(dja $$0, iu $$1) {
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
   protected void a(eah $$0, dja $$1, iu $$2, dmf $$3, @Nullable exw $$4, boolean $$5) {
      if (!$$1.C) {
         if ($$3 != this || !a($$1)) {
            if ($$0.a((djd)$$1, $$2)) {
               this.a($$1, $$2, $$0, $$4, false);
            } else {
               c($$0, $$1, $$2);
               $$1.a($$2, false);
            }
         }
      }
   }

   private static boolean a(dja $$0) {
      return $$0.K().b(cuo.c);
   }

   @Override
   protected int b(eah $$0, dig $$1, iu $$2, ja $$3) {
      return !this.T ? 0 : $$0.a($$1, $$2, $$3);
   }

   @Override
   protected int a(eah $$0, dig $$1, iu $$2, ja $$3) {
      if (this.T && $$3 != ja.a) {
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

   protected static boolean o(eah $$0) {
      return a($$0, null);
   }

   protected static boolean a(eah $$0, @Nullable ja $$1) {
      if ($$0.a(dmh.cH)) {
         return true;
      } else if ($$0.a(dmh.ey)) {
         ja $$2 = $$0.c(dst.e);
         return $$2 == $$1 || $$2.g() == $$1;
      } else {
         return $$0.a(dmh.lu) ? $$1 == $$0.c(drx.a) : $$0.p() && $$1 != null;
      }
   }

   @Override
   protected boolean f_(eah $$0) {
      return this.T;
   }

   public static int b(int $$0) {
      return h[$$0];
   }

   private static void a(dja $$0, azv $$1, iu $$2, int $$3, ja $$4, ja $$5, float $$6, float $$7) {
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
   public void a(eah $$0, dja $$1, iu $$2, azv $$3) {
      int $$4 = $$0.c(f);
      if ($$4 != 0) {
         for (ja $$5 : ja.c.a) {
            ebm $$6 = $$0.c(g.get($$5));
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
   protected eah a(eah $$0, dsz $$1) {
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
   protected eah a(eah $$0, dri $$1) {
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
   protected void a(eai.a<dmf, eah> $$0) {
      $$0.a(b, c, d, e, f);
   }

   @Override
   protected bud a(eah $$0, dja $$1, iu $$2, crc $$3, fem $$4) {
      if (!$$3.gk().e) {
         return bud.e;
      } else {
         if (q($$0) || r($$0)) {
            eah $$5 = q($$0) ? this.m() : this.R;
            $$5 = $$5.b(f, $$0.c(f));
            $$5 = this.a($$1, $$5, $$2);
            if ($$5 != $$0) {
               $$1.a($$2, $$5, 3);
               this.a($$1, $$2, $$0, $$5);
               return bud.a;
            }
         }

         return bud.e;
      }
   }

   private void a(dja $$0, iu $$1, eah $$2, eah $$3) {
      exw $$4 = exs.a($$0, null, ja.b);

      for (ja $$5 : ja.c.a) {
         iu $$6 = $$1.a($$5);
         if ($$2.c(g.get($$5)).a() != $$3.c(g.get($$5)).a() && $$0.a_($$6).d($$0, $$6)) {
            $$0.a($$6, $$3.b(), $$5.g(), exs.a($$4, $$5));
         }
      }
   }
}
