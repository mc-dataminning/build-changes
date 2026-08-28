import com.google.common.collect.ImmutableMap;
import com.google.common.collect.Maps;
import com.mojang.serialization.MapCodec;
import java.util.Map;
import java.util.Map.Entry;
import java.util.function.Function;
import javax.annotation.Nullable;

public class dtx extends dno {
   public static final MapCodec<dtx> a = b(dtx::new);
   public static final eco<ecv> b = ecg.ae;
   public static final eco<ecv> c = ecg.ad;
   public static final eco<ecv> d = ecg.af;
   public static final eco<ecv> e = ecg.ag;
   public static final ecq f = ecg.aW;
   public static final Map<jc, eco<ecv>> g = ImmutableMap.copyOf(Maps.newEnumMap(Map.of(jc.c, b, jc.f, c, jc.d, d, jc.e, e)));
   private static final int[] h = ag.a(new int[16], $$0 -> {
      for (int $$1 = 0; $$1 <= 15; $$1++) {
         float $$2 = (float)$$1 / 15.0F;
         float $$3 = $$2 * 0.6F + ($$2 > 0.0F ? 0.4F : 0.3F);
         float $$4 = azz.a($$2 * $$2 * 0.7F - 0.5F, 0.0F, 1.0F);
         float $$5 = azz.a($$2 * $$2 * 0.6F - 0.7F, 0.0F, 1.0F);
         $$0[$$1] = ayh.a(1.0F, $$3, $$4, $$5);
      }
   });
   private static final float i = 0.2F;
   private final Function<ebq, fgw> D;
   private final ebq R;
   private final ezk S = new ezd(this);
   private boolean T = true;

   @Override
   public MapCodec<dtx> a() {
      return a;
   }

   public dtx(ebp.d $$0) {
      super($$0);
      this.l(this.C.b().b(b, ecv.c).b(c, ecv.c).b(d, ecv.c).b(e, ecv.c).b(f, Integer.valueOf(0)));
      this.D = this.b();
      this.R = this.m().b(b, ecv.b).b(c, ecv.b).b(d, ecv.b).b(e, ecv.b);
   }

   private Function<ebq, fgw> b() {
      int $$0 = 1;
      int $$1 = 10;
      fgw $$2 = dno.b(10.0, 0.0, 1.0);
      Map<jc, fgw> $$3 = fgt.c(dno.a(10.0, 0.0, 1.0, 0.0, 8.0));
      Map<jc, fgw> $$4 = fgt.c(dno.b(10.0, 16.0, 0.0, 1.0));
      return this.a($$3x -> {
         fgw $$4x = $$2;

         for (Entry<jc, eco<ecv>> $$5 : g.entrySet()) {
            $$4x = switch ((ecv)$$3x.c($$5.getValue())) {
               case a -> fgt.a($$4x, $$3.get($$5.getKey()), $$4.get($$5.getKey()));
               case b -> fgt.a($$4x, $$3.get($$5.getKey()));
               case c -> $$4x;
            };
         }

         return $$4x;
      }, new ect[]{f});
   }

   @Override
   protected fgw a(ebq $$0, djn $$1, iw $$2, fgh $$3) {
      return this.D.apply($$0);
   }

   @Override
   public ebq a(ded $$0) {
      return this.a($$0.q(), this.R, $$0.a());
   }

   private ebq a(djn $$0, ebq $$1, iw $$2) {
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
            $$1 = $$1.b(e, ecv.b);
         }

         if (!$$6 && $$8) {
            $$1 = $$1.b(c, ecv.b);
         }

         if (!$$4 && $$9) {
            $$1 = $$1.b(b, ecv.b);
         }

         if (!$$5 && $$9) {
            $$1 = $$1.b(d, ecv.b);
         }

         return $$1;
      }
   }

   private ebq b(djn $$0, ebq $$1, iw $$2) {
      boolean $$3 = !$$0.a_($$2.d()).d($$0, $$2);

      for (jc $$4 : jc.c.a) {
         if (!$$1.c(g.get($$4)).a()) {
            ecv $$5 = this.a($$0, $$2, $$4, $$3);
            $$1 = $$1.b(g.get($$4), $$5);
         }
      }

      return $$1;
   }

   @Override
   protected ebq a(ebq $$0, dkm $$1, dky $$2, iw $$3, jc $$4, iw $$5, ebq $$6, bai $$7) {
      if ($$4 == jc.a) {
         return !this.a($$1, $$5, $$6) ? dnq.a.m() : $$0;
      } else if ($$4 == jc.b) {
         return this.a($$1, $$0, $$3);
      } else {
         ecv $$8 = this.a($$1, $$3, $$4);
         return $$8.a() == $$0.c(g.get($$4)).a() && !q($$0) ? $$0.b(g.get($$4), $$8) : this.a($$1, this.R.b(f, $$0.c(f)).b(g.get($$4), $$8), $$3);
      }
   }

   private static boolean q(ebq $$0) {
      return $$0.c(b).a() && $$0.c(d).a() && $$0.c(c).a() && $$0.c(e).a();
   }

   private static boolean r(ebq $$0) {
      return !$$0.c(b).a() && !$$0.c(d).a() && !$$0.c(c).a() && !$$0.c(e).a();
   }

   @Override
   protected void a(ebq $$0, dkk $$1, iw $$2, int $$3, int $$4) {
      iw.a $$5 = new iw.a();

      for (jc $$6 : jc.c.a) {
         ecv $$7 = $$0.c(g.get($$6));
         if ($$7 != ecv.c && !$$1.a_($$5.a($$2, $$6)).a(this)) {
            $$5.c(jc.a);
            ebq $$8 = $$1.a_($$5);
            if ($$8.a(this)) {
               iw $$9 = $$5.a($$6.g());
               $$1.a($$6.g(), $$5, $$9, $$1.a_($$9), $$3, $$4);
            }

            $$5.a($$2, $$6).c(jc.b);
            ebq $$10 = $$1.a_($$5);
            if ($$10.a(this)) {
               iw $$11 = $$5.a($$6.g());
               $$1.a($$6.g(), $$5, $$11, $$1.a_($$11), $$3, $$4);
            }
         }
      }
   }

   private ecv a(djn $$0, iw $$1, jc $$2) {
      return this.a($$0, $$1, $$2, !$$0.a_($$1.d()).d($$0, $$1));
   }

   private ecv a(djn $$0, iw $$1, jc $$2, boolean $$3) {
      iw $$4 = $$1.a($$2);
      ebq $$5 = $$0.a_($$4);
      if ($$3) {
         boolean $$6 = $$5.b() instanceof dwq || this.a($$0, $$4, $$5);
         if ($$6 && o($$0.a_($$4.d()))) {
            if ($$5.c($$0, $$4, $$2.g())) {
               return ecv.a;
            }

            return ecv.b;
         }
      }

      return !a($$5, $$2) && ($$5.d($$0, $$4) || !o($$0.a_($$4.e()))) ? ecv.c : ecv.b;
   }

   @Override
   protected boolean a(ebq $$0, dkm $$1, iw $$2) {
      iw $$3 = $$2.e();
      ebq $$4 = $$1.a_($$3);
      return this.a($$1, $$3, $$4);
   }

   private boolean a(djn $$0, iw $$1, ebq $$2) {
      return $$2.c($$0, $$1, jc.b) || $$2.a(dnq.hD);
   }

   private void a(dkj $$0, iw $$1, ebq $$2, @Nullable ezi $$3, boolean $$4) {
      if (a($$0)) {
         new ezf(this).a($$0, $$1, $$2, $$3, $$4);
      } else {
         this.S.a($$0, $$1, $$2, $$3, $$4);
      }
   }

   public int a(dkj $$0, iw $$1) {
      this.T = false;
      int $$2 = $$0.E($$1);
      this.T = true;
      return $$2;
   }

   private void b(dkj $$0, iw $$1) {
      if ($$0.a_($$1).a(this)) {
         $$0.a($$1, this);

         for (jc $$2 : jc.values()) {
            $$0.a($$1.a($$2), this);
         }
      }
   }

   @Override
   protected void a(ebq $$0, dkj $$1, iw $$2, ebq $$3, boolean $$4) {
      if (!$$3.a($$0.b()) && !$$1.C) {
         this.a($$1, $$2, $$0, null, true);

         for (jc $$5 : jc.c.b) {
            $$1.a($$2.a($$5), this);
         }

         this.c($$1, $$2);
      }
   }

   @Override
   protected void a(ebq $$0, asb $$1, iw $$2, boolean $$3) {
      if (!$$3) {
         for (jc $$4 : jc.values()) {
            $$1.a($$2.a($$4), this);
         }

         this.a($$1, $$2, $$0, null, false);
         this.c($$1, $$2);
      }
   }

   private void c(dkj $$0, iw $$1) {
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
   protected void a(ebq $$0, dkj $$1, iw $$2, dno $$3, @Nullable ezi $$4, boolean $$5) {
      if (!$$1.C) {
         if ($$3 != this || !a($$1)) {
            if ($$0.a((dkm)$$1, $$2)) {
               this.a($$1, $$2, $$0, $$4, false);
            } else {
               c($$0, $$1, $$2);
               $$1.a($$2, false);
            }
         }
      }
   }

   private static boolean a(dkj $$0) {
      return $$0.K().b(cvu.c);
   }

   @Override
   protected int b(ebq $$0, djn $$1, iw $$2, jc $$3) {
      return !this.T ? 0 : $$0.a($$1, $$2, $$3);
   }

   @Override
   protected int a(ebq $$0, djn $$1, iw $$2, jc $$3) {
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

   protected static boolean o(ebq $$0) {
      return a($$0, null);
   }

   protected static boolean a(ebq $$0, @Nullable jc $$1) {
      if ($$0.a(dnq.cH)) {
         return true;
      } else if ($$0.a(dnq.ey)) {
         jc $$2 = $$0.c(duc.e);
         return $$2 == $$1 || $$2.g() == $$1;
      } else {
         return $$0.a(dnq.lu) ? $$1 == $$0.c(dtg.a) : $$0.p() && $$1 != null;
      }
   }

   @Override
   protected boolean f_(ebq $$0) {
      return this.T;
   }

   public static int b(int $$0) {
      return h[$$0];
   }

   private static void a(dkj $$0, bai $$1, iw $$2, int $$3, jc $$4, jc $$5, float $$6, float $$7) {
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
   public void a(ebq $$0, dkj $$1, iw $$2, bai $$3) {
      int $$4 = $$0.c(f);
      if ($$4 != 0) {
         for (jc $$5 : jc.c.a) {
            ecv $$6 = $$0.c(g.get($$5));
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
   protected ebq a(ebq $$0, dui $$1) {
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
   protected ebq a(ebq $$0, dsr $$1) {
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
   protected void a(ebr.a<dno, ebq> $$0) {
      $$0.a(b, c, d, e, f);
   }

   @Override
   protected bvc a(ebq $$0, dkj $$1, iw $$2, csi $$3, ffy $$4) {
      if (!$$3.gk().e) {
         return bvc.e;
      } else {
         if (q($$0) || r($$0)) {
            ebq $$5 = q($$0) ? this.m() : this.R;
            $$5 = $$5.b(f, $$0.c(f));
            $$5 = this.a($$1, $$5, $$2);
            if ($$5 != $$0) {
               $$1.a($$2, $$5, 3);
               this.a($$1, $$2, $$0, $$5);
               return bvc.a;
            }
         }

         return bvc.e;
      }
   }

   private void a(dkj $$0, iw $$1, ebq $$2, ebq $$3) {
      ezi $$4 = eze.a($$0, null, jc.b);

      for (jc $$5 : jc.c.a) {
         iw $$6 = $$1.a($$5);
         if ($$2.c(g.get($$5)).a() != $$3.c(g.get($$5)).a() && $$0.a_($$6).d($$0, $$6)) {
            $$0.a($$6, $$3.b(), $$5.g(), eze.a($$4, $$5));
         }
      }
   }
}
