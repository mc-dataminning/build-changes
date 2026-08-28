import com.google.common.collect.ImmutableMap;
import com.google.common.collect.Maps;
import com.mojang.serialization.MapCodec;
import java.util.Map;
import java.util.Map.Entry;
import java.util.function.Function;
import javax.annotation.Nullable;

public class dtn extends dne {
   public static final MapCodec<dtn> a = b(dtn::new);
   public static final ece<ecl> b = ebw.ae;
   public static final ece<ecl> c = ebw.ad;
   public static final ece<ecl> d = ebw.af;
   public static final ece<ecl> e = ebw.ag;
   public static final ecg f = ebw.aW;
   public static final Map<jc, ece<ecl>> g = ImmutableMap.copyOf(Maps.newEnumMap(Map.of(jc.c, b, jc.f, c, jc.d, d, jc.e, e)));
   private static final int[] h = ag.a(new int[16], $$0 -> {
      for (int $$1 = 0; $$1 <= 15; $$1++) {
         float $$2 = (float)$$1 / 15.0F;
         float $$3 = $$2 * 0.6F + ($$2 > 0.0F ? 0.4F : 0.3F);
         float $$4 = azq.a($$2 * $$2 * 0.7F - 0.5F, 0.0F, 1.0F);
         float $$5 = azq.a($$2 * $$2 * 0.6F - 0.7F, 0.0F, 1.0F);
         $$0[$$1] = aya.a(1.0F, $$3, $$4, $$5);
      }
   });
   private static final float i = 0.2F;
   private final Function<ebg, fgm> D;
   private final ebg R;
   private final eza S = new eyt(this);
   private boolean T = true;

   @Override
   public MapCodec<dtn> a() {
      return a;
   }

   public dtn(ebf.d $$0) {
      super($$0);
      this.l(this.C.b().b(b, ecl.c).b(c, ecl.c).b(d, ecl.c).b(e, ecl.c).b(f, Integer.valueOf(0)));
      this.D = this.b();
      this.R = this.m().b(b, ecl.b).b(c, ecl.b).b(d, ecl.b).b(e, ecl.b);
   }

   private Function<ebg, fgm> b() {
      int $$0 = 1;
      int $$1 = 10;
      fgm $$2 = dne.b(10.0, 0.0, 1.0);
      Map<jc, fgm> $$3 = fgj.c(dne.a(10.0, 0.0, 1.0, 0.0, 8.0));
      Map<jc, fgm> $$4 = fgj.c(dne.b(10.0, 16.0, 0.0, 1.0));
      return this.a($$3x -> {
         fgm $$4x = $$2;

         for (Entry<jc, ece<ecl>> $$5 : g.entrySet()) {
            $$4x = switch ((ecl)$$3x.c($$5.getValue())) {
               case a -> fgj.a($$4x, $$3.get($$5.getKey()), $$4.get($$5.getKey()));
               case b -> fgj.a($$4x, $$3.get($$5.getKey()));
               case c -> $$4x;
            };
         }

         return $$4x;
      }, new ecj[]{f});
   }

   @Override
   protected fgm a(ebg $$0, djd $$1, iw $$2, ffx $$3) {
      return this.D.apply($$0);
   }

   @Override
   public ebg a(ddt $$0) {
      return this.a($$0.q(), this.R, $$0.a());
   }

   private ebg a(djd $$0, ebg $$1, iw $$2) {
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
            $$1 = $$1.b(e, ecl.b);
         }

         if (!$$6 && $$8) {
            $$1 = $$1.b(c, ecl.b);
         }

         if (!$$4 && $$9) {
            $$1 = $$1.b(b, ecl.b);
         }

         if (!$$5 && $$9) {
            $$1 = $$1.b(d, ecl.b);
         }

         return $$1;
      }
   }

   private ebg b(djd $$0, ebg $$1, iw $$2) {
      boolean $$3 = !$$0.a_($$2.d()).d($$0, $$2);

      for (jc $$4 : jc.c.a) {
         if (!$$1.c(g.get($$4)).a()) {
            ecl $$5 = this.a($$0, $$2, $$4, $$3);
            $$1 = $$1.b(g.get($$4), $$5);
         }
      }

      return $$1;
   }

   @Override
   protected ebg a(ebg $$0, dkc $$1, dko $$2, iw $$3, jc $$4, iw $$5, ebg $$6, azz $$7) {
      if ($$4 == jc.a) {
         return !this.a($$1, $$5, $$6) ? dng.a.m() : $$0;
      } else if ($$4 == jc.b) {
         return this.a($$1, $$0, $$3);
      } else {
         ecl $$8 = this.a($$1, $$3, $$4);
         return $$8.a() == $$0.c(g.get($$4)).a() && !q($$0) ? $$0.b(g.get($$4), $$8) : this.a($$1, this.R.b(f, $$0.c(f)).b(g.get($$4), $$8), $$3);
      }
   }

   private static boolean q(ebg $$0) {
      return $$0.c(b).a() && $$0.c(d).a() && $$0.c(c).a() && $$0.c(e).a();
   }

   private static boolean r(ebg $$0) {
      return !$$0.c(b).a() && !$$0.c(d).a() && !$$0.c(c).a() && !$$0.c(e).a();
   }

   @Override
   protected void a(ebg $$0, dka $$1, iw $$2, int $$3, int $$4) {
      iw.a $$5 = new iw.a();

      for (jc $$6 : jc.c.a) {
         ecl $$7 = $$0.c(g.get($$6));
         if ($$7 != ecl.c && !$$1.a_($$5.a($$2, $$6)).a(this)) {
            $$5.c(jc.a);
            ebg $$8 = $$1.a_($$5);
            if ($$8.a(this)) {
               iw $$9 = $$5.a($$6.g());
               $$1.a($$6.g(), $$5, $$9, $$1.a_($$9), $$3, $$4);
            }

            $$5.a($$2, $$6).c(jc.b);
            ebg $$10 = $$1.a_($$5);
            if ($$10.a(this)) {
               iw $$11 = $$5.a($$6.g());
               $$1.a($$6.g(), $$5, $$11, $$1.a_($$11), $$3, $$4);
            }
         }
      }
   }

   private ecl a(djd $$0, iw $$1, jc $$2) {
      return this.a($$0, $$1, $$2, !$$0.a_($$1.d()).d($$0, $$1));
   }

   private ecl a(djd $$0, iw $$1, jc $$2, boolean $$3) {
      iw $$4 = $$1.a($$2);
      ebg $$5 = $$0.a_($$4);
      if ($$3) {
         boolean $$6 = $$5.b() instanceof dwg || this.a($$0, $$4, $$5);
         if ($$6 && o($$0.a_($$4.d()))) {
            if ($$5.c($$0, $$4, $$2.g())) {
               return ecl.a;
            }

            return ecl.b;
         }
      }

      return !a($$5, $$2) && ($$5.d($$0, $$4) || !o($$0.a_($$4.e()))) ? ecl.c : ecl.b;
   }

   @Override
   protected boolean a(ebg $$0, dkc $$1, iw $$2) {
      iw $$3 = $$2.e();
      ebg $$4 = $$1.a_($$3);
      return this.a($$1, $$3, $$4);
   }

   private boolean a(djd $$0, iw $$1, ebg $$2) {
      return $$2.c($$0, $$1, jc.b) || $$2.a(dng.hD);
   }

   private void a(djz $$0, iw $$1, ebg $$2, @Nullable eyy $$3, boolean $$4) {
      if (a($$0)) {
         new eyv(this).a($$0, $$1, $$2, $$3, $$4);
      } else {
         this.S.a($$0, $$1, $$2, $$3, $$4);
      }
   }

   public int a(djz $$0, iw $$1) {
      this.T = false;
      int $$2 = $$0.E($$1);
      this.T = true;
      return $$2;
   }

   private void b(djz $$0, iw $$1) {
      if ($$0.a_($$1).a(this)) {
         $$0.a($$1, this);

         for (jc $$2 : jc.values()) {
            $$0.a($$1.a($$2), this);
         }
      }
   }

   @Override
   protected void a(ebg $$0, djz $$1, iw $$2, ebg $$3, boolean $$4) {
      if (!$$3.a($$0.b()) && !$$1.C) {
         this.a($$1, $$2, $$0, null, true);

         for (jc $$5 : jc.c.b) {
            $$1.a($$2.a($$5), this);
         }

         this.c($$1, $$2);
      }
   }

   @Override
   protected void a(ebg $$0, aru $$1, iw $$2, boolean $$3) {
      if (!$$3) {
         for (jc $$4 : jc.values()) {
            $$1.a($$2.a($$4), this);
         }

         this.a($$1, $$2, $$0, null, false);
         this.c($$1, $$2);
      }
   }

   private void c(djz $$0, iw $$1) {
      for (jc $$2 : jc.c.a) {
         this.b($$0, $$1.a($$2));
      }

      for (jc $$3 : jc.c.a) {
         iw $$4 = $$1.a($$3);
         if ($$0.a_($$4).d($$0, $$4)) {
            this.b($$0, $$4.d());
         } else {
            this.b($$0, $$4.e());
         }
      }
   }

   @Override
   protected void a(ebg $$0, djz $$1, iw $$2, dne $$3, @Nullable eyy $$4, boolean $$5) {
      if (!$$1.C) {
         if ($$3 != this || !a($$1)) {
            if ($$0.a((dkc)$$1, $$2)) {
               this.a($$1, $$2, $$0, $$4, false);
            } else {
               c($$0, $$1, $$2);
               $$1.a($$2, false);
            }
         }
      }
   }

   private static boolean a(djz $$0) {
      return $$0.K().b(cvl.c);
   }

   @Override
   protected int b(ebg $$0, djd $$1, iw $$2, jc $$3) {
      return !this.T ? 0 : $$0.a($$1, $$2, $$3);
   }

   @Override
   protected int a(ebg $$0, djd $$1, iw $$2, jc $$3) {
      if (this.T && $$3 != jc.a) {
         int $$4 = $$0.c(f);
         if ($$4 == 0) {
            return 0;
         } else {
            return $$3 != jc.b && !this.a($$1, $$0, $$2).c(g.get($$3.g())).a() ? 0 : $$4;
         }
      } else {
         return 0;
      }
   }

   protected static boolean o(ebg $$0) {
      return a($$0, null);
   }

   protected static boolean a(ebg $$0, @Nullable jc $$1) {
      if ($$0.a(dng.cH)) {
         return true;
      } else if ($$0.a(dng.ey)) {
         jc $$2 = $$0.c(dts.e);
         return $$2 == $$1 || $$2.g() == $$1;
      } else {
         return $$0.a(dng.lu) ? $$1 == $$0.c(dsw.a) : $$0.p() && $$1 != null;
      }
   }

   @Override
   protected boolean f_(ebg $$0) {
      return this.T;
   }

   public static int b(int $$0) {
      return h[$$0];
   }

   private static void a(djz $$0, azz $$1, iw $$2, int $$3, jc $$4, jc $$5, float $$6, float $$7) {
      float $$8 = $$7 - $$6;
      if (!($$1.i() >= 0.2F * $$8)) {
         float $$9 = 0.4375F;
         float $$10 = $$6 + $$8 * $$1.i();
         double $$11 = 0.5 + (double)(0.4375F * (float)$$4.j()) + (double)($$10 * (float)$$5.j());
         double $$12 = 0.5 + (double)(0.4375F * (float)$$4.k()) + (double)($$10 * (float)$$5.k());
         double $$13 = 0.5 + (double)(0.4375F * (float)$$4.l()) + (double)($$10 * (float)$$5.l());
         $$0.a(new lu($$3, 1.0F), (double)$$2.u() + $$11, (double)$$2.v() + $$12, (double)$$2.w() + $$13, 0.0, 0.0, 0.0);
      }
   }

   @Override
   public void a(ebg $$0, djz $$1, iw $$2, azz $$3) {
      int $$4 = $$0.c(f);
      if ($$4 != 0) {
         for (jc $$5 : jc.c.a) {
            ecl $$6 = $$0.c(g.get($$5));
            switch ($$6) {
               case a:
                  a($$1, $$3, $$2, h[$$4], $$5, jc.b, -0.5F, 0.5F);
               case b:
                  a($$1, $$3, $$2, h[$$4], jc.a, $$5, 0.0F, 0.5F);
                  break;
               case c:
               default:
                  a($$1, $$3, $$2, h[$$4], jc.a, $$5, 0.0F, 0.3F);
            }
         }
      }
   }

   @Override
   protected ebg a(ebg $$0, dty $$1) {
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
   protected ebg a(ebg $$0, dsh $$1) {
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
   protected void a(ebh.a<dne, ebg> $$0) {
      $$0.a(b, c, d, e, f);
   }

   @Override
   protected but a(ebg $$0, djz $$1, iw $$2, crz $$3, ffo $$4) {
      if (!$$3.gk().e) {
         return but.e;
      } else {
         if (q($$0) || r($$0)) {
            ebg $$5 = q($$0) ? this.m() : this.R;
            $$5 = $$5.b(f, $$0.c(f));
            $$5 = this.a($$1, $$5, $$2);
            if ($$5 != $$0) {
               $$1.a($$2, $$5, 3);
               this.a($$1, $$2, $$0, $$5);
               return but.a;
            }
         }

         return but.e;
      }
   }

   private void a(djz $$0, iw $$1, ebg $$2, ebg $$3) {
      eyy $$4 = eyu.a($$0, null, jc.b);

      for (jc $$5 : jc.c.a) {
         iw $$6 = $$1.a($$5);
         if ($$2.c(g.get($$5)).a() != $$3.c(g.get($$5)).a() && $$0.a_($$6).d($$0, $$6)) {
            $$0.a($$6, $$3.b(), $$5.g(), eyu.a($$4, $$5));
         }
      }
   }
}
