import com.google.common.annotations.VisibleForTesting;
import com.mojang.serialization.MapCodec;
import java.util.Optional;
import java.util.function.BiPredicate;
import java.util.function.Predicate;
import javax.annotation.Nullable;

public class dar extends cva implements cxv, dca {
   public static final MapCodec<dar> a = b(dar::new);
   public static final dic b = dhy.bm;
   public static final dig<dif> c = dhy.bn;
   public static final dhz d = dhy.C;
   private static final int e = 11;
   private static final int f = 2;
   private static final float g = 0.02F;
   private static final float h = 0.12F;
   private static final int i = 11;
   private static final float j = 0.17578125F;
   private static final float k = 0.05859375F;
   private static final double l = 0.6;
   private static final float m = 1.0F;
   private static final int n = 40;
   private static final int o = 6;
   private static final float F = 2.0F;
   private static final int G = 2;
   private static final float H = 5.0F;
   private static final float I = 0.011377778F;
   private static final int J = 7;
   private static final int K = 10;
   private static final float L = 0.6875F;
   private static final ekn M = cva.a(5.0, 0.0, 5.0, 11.0, 16.0, 11.0);
   private static final ekn N = cva.a(5.0, 0.0, 5.0, 11.0, 11.0, 11.0);
   private static final ekn O = cva.a(5.0, 5.0, 5.0, 11.0, 16.0, 11.0);
   private static final ekn P = cva.a(4.0, 0.0, 4.0, 12.0, 16.0, 12.0);
   private static final ekn Q = cva.a(3.0, 0.0, 3.0, 13.0, 16.0, 13.0);
   private static final ekn R = cva.a(2.0, 0.0, 2.0, 14.0, 16.0, 14.0);
   private static final float S = 0.125F;
   private static final ekn T = cva.a(6.0, 0.0, 6.0, 10.0, 16.0, 10.0);

   @Override
   public MapCodec<dar> a() {
      return a;
   }

   public dar(dhh.d $$0) {
      super($$0);
      this.k(this.E.b().a(b, hx.b).a(c, dif.b).a(d, Boolean.valueOf(false)));
   }

   @Override
   protected void a(dhj.a<cva, dhi> $$0) {
      $$0.a(b, c, d);
   }

   @Override
   public boolean a(dhi $$0, csd $$1, ht $$2) {
      return c($$1, $$2, $$0.c(b));
   }

   @Override
   public dhi a(dhi $$0, hx $$1, dhi $$2, csb $$3, ht $$4, ht $$5) {
      if ($$0.c(d)) {
         $$3.a($$4, ect.c, ect.c.a($$3));
      }

      if ($$1 != hx.b && $$1 != hx.a) {
         return $$0;
      } else {
         hx $$6 = $$0.c(b);
         if ($$6 == hx.a && $$3.M().a($$4, this)) {
            return $$0;
         } else if ($$1 == $$6.g() && !this.a($$0, (csd)$$3, $$4)) {
            if ($$6 == hx.a) {
               $$3.a($$4, this, 2);
            } else {
               $$3.a($$4, this, 1);
            }

            return $$0;
         } else {
            boolean $$7 = $$0.c(c) == dif.a;
            dif $$8 = a($$3, $$4, $$6, $$7);
            return $$0.a(c, $$8);
         }
      }
   }

   @Override
   public void a(csa $$0, dhi $$1, ejq $$2, cem $$3) {
      ht $$4 = $$2.a();
      if (!$$0.B && $$3.a($$0, $$4) && $$3.b($$0) && $$3 instanceof cey && $$3.dq().f() > 0.6) {
         $$0.b($$4, true);
      }
   }

   @Override
   public void a(csa $$0, dhi $$1, ht $$2, bkq $$3, float $$4) {
      if ($$1.c(b) == hx.b && $$1.c(c) == dif.b) {
         $$3.a($$4 + 2.0F, 2.0F, $$0.ah().u());
      } else {
         super.a($$0, $$1, $$2, $$3, $$4);
      }
   }

   @Override
   public void a(dhi $$0, csa $$1, ht $$2, ats $$3) {
      if (h($$0)) {
         float $$4 = $$3.i();
         if (!($$4 > 0.12F)) {
            b($$1, $$2, $$0).filter($$1x -> $$4 < 0.02F || a($$1x.b)).ifPresent($$3x -> a($$1, $$2, $$0, $$3x.b));
         }
      }
   }

   @Override
   public void a(dhi $$0, ame $$1, ht $$2, ats $$3) {
      if (o($$0) && !this.a($$0, (csd)$$1, $$2)) {
         $$1.b($$2, true);
      } else {
         a($$0, $$1, $$2);
      }
   }

   @Override
   public void b(dhi $$0, ame $$1, ht $$2, ats $$3) {
      a($$0, $$1, $$2, $$3.i());
      if ($$3.i() < 0.011377778F && b($$0, (csd)$$1, $$2)) {
         c($$0, $$1, $$2, $$3);
      }
   }

   @VisibleForTesting
   public static void a(dhi $$0, ame $$1, ht $$2, float $$3) {
      if (!($$3 > 0.17578125F) || !($$3 > 0.05859375F)) {
         if (b($$0, (csd)$$1, $$2)) {
            Optional<dar.a> $$4 = b($$1, $$2, $$0);
            if (!$$4.isEmpty()) {
               ecr $$5 = $$4.get().b;
               float $$6;
               if ($$5 == ect.c) {
                  $$6 = 0.17578125F;
               } else {
                  if ($$5 != ect.e) {
                     return;
                  }

                  $$6 = 0.05859375F;
               }

               if (!($$3 >= $$6)) {
                  ht $$9 = a($$0, $$1, $$2, 11, false);
                  if ($$9 != null) {
                     if ($$4.get().c.a(cvc.sI) && $$5 == ect.c) {
                        dhi $$10 = cvc.dR.o();
                        $$1.b($$4.get().a, $$10);
                        cva.a($$4.get().c, $$10, $$1, $$4.get().a);
                        $$1.a(dls.c, $$4.get().a, dls.a.a($$10));
                        $$1.c(1504, $$9, 0);
                     } else {
                        ht $$11 = a($$1, $$9, $$5);
                        if ($$11 != null) {
                           $$1.c(1504, $$9, 0);
                           int $$12 = $$9.v() - $$11.v();
                           int $$13 = 50 + $$12;
                           dhi $$14 = $$1.a_($$11);
                           $$1.a($$11, $$14.b(), $$13);
                        }
                     }
                  }
               }
            }
         }
      }
   }

   @Nullable
   @Override
   public dhi a(cnr $$0) {
      csb $$1 = $$0.q();
      ht $$2 = $$0.a();
      hx $$3 = $$0.e().g();
      hx $$4 = b($$1, $$2, $$3);
      if ($$4 == null) {
         return null;
      } else {
         boolean $$5 = !$$0.h();
         dif $$6 = a($$1, $$2, $$4, $$5);
         return $$6 == null ? null : this.o().a(b, $$4).a(c, $$6).a(d, Boolean.valueOf($$1.b_($$2).a() == ect.c));
      }
   }

   @Override
   public ecs c_(dhi $$0) {
      return $$0.c(d) ? ect.c.a(false) : super.c_($$0);
   }

   @Override
   public ekn f(dhi $$0, crg $$1, ht $$2) {
      return ekk.a();
   }

   @Override
   public ekn a(dhi $$0, crg $$1, ht $$2, ejz $$3) {
      dif $$4 = $$0.c(c);
      ekn $$5;
      if ($$4 == dif.a) {
         $$5 = M;
      } else if ($$4 == dif.b) {
         if ($$0.c(b) == hx.a) {
            $$5 = O;
         } else {
            $$5 = N;
         }
      } else if ($$4 == dif.c) {
         $$5 = P;
      } else if ($$4 == dif.d) {
         $$5 = Q;
      } else {
         $$5 = R;
      }

      eju $$11 = $$0.n($$1, $$2);
      return $$5.a($$11.c, 0.0, $$11.e);
   }

   @Override
   public boolean c(dhi $$0, crg $$1, ht $$2) {
      return false;
   }

   @Override
   public float as_() {
      return 0.125F;
   }

   @Override
   public void a(csa $$0, ht $$1, cam $$2) {
      if (!$$2.aU()) {
         $$0.c(1045, $$1, 0);
      }
   }

   @Override
   public bjo a(bkq $$0) {
      return $$0.dO().c($$0);
   }

   private static void a(dhi $$0, ame $$1, ht $$2) {
      ht.a $$3 = $$2.j();
      dhi $$4 = $$0;

      while (n($$4)) {
         cam $$5 = cam.a($$1, $$3, $$4);
         if (a($$4, true)) {
            int $$6 = Math.max(1 + $$2.v() - $$3.v(), 6);
            float $$7 = 1.0F * (float)$$6;
            $$5.b($$7, 40);
            break;
         }

         $$3.c(hx.a);
         $$4 = $$1.a_($$3);
      }
   }

   @VisibleForTesting
   public static void c(dhi $$0, ame $$1, ht $$2, ats $$3) {
      dhi $$4 = $$1.a_($$2.b(1));
      dhi $$5 = $$1.a_($$2.b(2));
      if (a($$4, $$5)) {
         ht $$6 = a($$0, $$1, $$2, 7, false);
         if ($$6 != null) {
            dhi $$7 = $$1.a_($$6);
            if (h($$7) && b($$7, $$1, $$6)) {
               if ($$3.h()) {
                  a($$1, $$6, hx.a);
               } else {
                  b($$1, $$6);
               }
            }
         }
      }
   }

   private static void b(ame $$0, ht $$1) {
      ht.a $$2 = $$1.j();

      for (int $$3 = 0; $$3 < 10; $$3++) {
         $$2.c(hx.a);
         dhi $$4 = $$0.a_($$2);
         if (!$$4.u().c()) {
            return;
         }

         if (a($$4, hx.b) && b($$4, $$0, $$2)) {
            a($$0, $$2, hx.b);
            return;
         }

         if (c($$0, $$2, hx.b) && !$$0.y($$2.d())) {
            a($$0, $$2.d(), hx.b);
            return;
         }

         if (!a((crg)$$0, $$2, $$4)) {
            return;
         }
      }
   }

   private static void a(ame $$0, ht $$1, hx $$2) {
      ht $$3 = $$1.a($$2);
      dhi $$4 = $$0.a_($$3);
      if (a($$4, $$2.g())) {
         a($$4, (csb)$$0, $$3);
      } else if ($$4.i() || $$4.a(cvc.G)) {
         a($$0, $$3, $$2, dif.b);
      }
   }

   private static void a(csb $$0, ht $$1, hx $$2, dif $$3) {
      dhi $$4 = cvc.st.o().a(b, $$2).a(c, $$3).a(d, Boolean.valueOf($$0.b_($$1).a() == ect.c));
      $$0.a($$1, $$4, 3);
   }

   private static void a(dhi $$0, csb $$1, ht $$2) {
      ht $$4;
      ht $$3;
      if ($$0.c(b) == hx.b) {
         $$3 = $$2;
         $$4 = $$2.c();
      } else {
         $$4 = $$2;
         $$3 = $$2.d();
      }

      a($$1, $$4, hx.a, dif.a);
      a($$1, $$3, hx.b, dif.a);
   }

   public static void a(csa $$0, ht $$1, dhi $$2) {
      b($$0, $$1, $$2).ifPresent($$3 -> a($$0, $$1, $$2, $$3.b));
   }

   private static void a(csa $$0, ht $$1, dhi $$2, ecr $$3) {
      eju $$4 = $$2.n($$0, $$1);
      double $$5 = 0.0625;
      double $$6 = (double)$$1.u() + 0.5 + $$4.c;
      double $$7 = (double)((float)($$1.v() + 1) - 0.6875F) - 0.0625;
      double $$8 = (double)$$1.w() + 0.5 + $$4.e;
      ecr $$9 = a($$0, $$3);
      jq $$10 = $$9.a(arl.b) ? js.aG : js.aI;
      $$0.a($$10, $$6, $$7, $$8, 0.0, 0.0, 0.0);
   }

   @Nullable
   private static ht a(dhi $$0, csb $$1, ht $$2, int $$3, boolean $$4) {
      if (a($$0, $$4)) {
         return $$2;
      } else {
         hx $$5 = $$0.c(b);
         BiPredicate<ht, dhi> $$6 = ($$1x, $$2x) -> $$2x.a(cvc.st) && $$2x.c(b) == $$5;
         return a($$1, $$2, $$5.f(), $$6, $$1x -> a($$1x, $$4), $$3).orElse(null);
      }
   }

   @Nullable
   private static hx b(csd $$0, ht $$1, hx $$2) {
      hx $$3;
      if (c($$0, $$1, $$2)) {
         $$3 = $$2;
      } else {
         if (!c($$0, $$1, $$2.g())) {
            return null;
         }

         $$3 = $$2.g();
      }

      return $$3;
   }

   private static dif a(csd $$0, ht $$1, hx $$2, boolean $$3) {
      hx $$4 = $$2.g();
      dhi $$5 = $$0.a_($$1.a($$2));
      if (b($$5, $$4)) {
         return !$$3 && $$5.c(c) != dif.a ? dif.b : dif.a;
      } else if (!b($$5, $$2)) {
         return dif.b;
      } else {
         dif $$6 = $$5.c(c);
         if ($$6 != dif.b && $$6 != dif.a) {
            dhi $$7 = $$0.a_($$1.a($$4));
            return !b($$7, $$2) ? dif.e : dif.d;
         } else {
            return dif.c;
         }
      }
   }

   public static boolean h(dhi $$0) {
      return n($$0) && $$0.c(c) == dif.b && !$$0.c(d);
   }

   private static boolean b(dhi $$0, ame $$1, ht $$2) {
      hx $$3 = $$0.c(b);
      ht $$4 = $$2.a($$3);
      dhi $$5 = $$1.a_($$4);
      if (!$$5.u().c()) {
         return false;
      } else {
         return $$5.i() ? true : a($$5, $$3.g());
      }
   }

   private static Optional<ht> a(csa $$0, ht $$1, dhi $$2, int $$3) {
      hx $$4 = $$2.c(b);
      BiPredicate<ht, dhi> $$5 = ($$1x, $$2x) -> $$2x.a(cvc.st) && $$2x.c(b) == $$4;
      return a($$0, $$1, $$4.g().f(), $$5, $$0x -> !$$0x.a(cvc.st), $$3);
   }

   private static boolean c(csd $$0, ht $$1, hx $$2) {
      ht $$3 = $$1.a($$2.g());
      dhi $$4 = $$0.a_($$3);
      return $$4.d($$0, $$3, $$2) || b($$4, $$2);
   }

   private static boolean a(dhi $$0, boolean $$1) {
      if (!$$0.a(cvc.st)) {
         return false;
      } else {
         dif $$2 = $$0.c(c);
         return $$2 == dif.b || $$1 && $$2 == dif.a;
      }
   }

   private static boolean a(dhi $$0, hx $$1) {
      return a($$0, false) && $$0.c(b) == $$1;
   }

   private static boolean n(dhi $$0) {
      return b($$0, hx.a);
   }

   private static boolean o(dhi $$0) {
      return b($$0, hx.b);
   }

   private static boolean b(dhi $$0, csd $$1, ht $$2) {
      return n($$0) && !$$1.a_($$2.c()).a(cvc.st);
   }

   @Override
   public boolean a(dhi $$0, crg $$1, ht $$2, edi $$3) {
      return false;
   }

   private static boolean b(dhi $$0, hx $$1) {
      return $$0.a(cvc.st) && $$0.c(b) == $$1;
   }

   @Nullable
   private static ht a(csa $$0, ht $$1, ecr $$2) {
      Predicate<dhi> $$3 = $$1x -> $$1x.b() instanceof ctt && ((ctt)$$1x.b()).a($$2);
      BiPredicate<ht, dhi> $$4 = ($$1x, $$2x) -> a((crg)$$0, $$1x, $$2x);
      return a($$0, $$1, hx.a.f(), $$4, $$3, 11).orElse(null);
   }

   @Nullable
   public static ht a(csa $$0, ht $$1) {
      BiPredicate<ht, dhi> $$2 = ($$1x, $$2x) -> a((crg)$$0, $$1x, $$2x);
      return a($$0, $$1, hx.b.f(), $$2, dar::h, 11).orElse(null);
   }

   public static ecr a(ame $$0, ht $$1) {
      return b($$0, $$1, $$0.a_($$1)).map($$0x -> $$0x.b).filter(dar::a).orElse(ect.a);
   }

   private static Optional<dar.a> b(csa $$0, ht $$1, dhi $$2) {
      return !n($$2) ? Optional.empty() : a($$0, $$1, $$2, 11).map($$1x -> {
         ht $$2x = $$1x.c();
         dhi $$3 = $$0.a_($$2x);
         ecr $$4;
         if ($$3.a(cvc.sI) && !$$0.D_().i()) {
            $$4 = ect.c;
         } else {
            $$4 = $$0.b_($$2x).a();
         }

         return new dar.a($$2x, $$4, $$3);
      });
   }

   private static boolean a(ecr $$0) {
      return $$0 == ect.e || $$0 == ect.c;
   }

   private static boolean a(dhi $$0, dhi $$1) {
      return $$0.a(cvc.su) && $$1.a(cvc.G) && $$1.u().b();
   }

   private static ecr a(csa $$0, ecr $$1) {
      if ($$1.a(ect.a)) {
         return $$0.D_().i() ? ect.e : ect.c;
      } else {
         return $$1;
      }
   }

   private static Optional<ht> a(csb $$0, ht $$1, hx.b $$2, BiPredicate<ht, dhi> $$3, Predicate<dhi> $$4, int $$5) {
      hx $$6 = hx.a($$2, hx.a.b);
      ht.a $$7 = $$1.j();

      for (int $$8 = 1; $$8 < $$5; $$8++) {
         $$7.c($$6);
         dhi $$9 = $$0.a_($$7);
         if ($$4.test($$9)) {
            return Optional.of($$7.i());
         }

         if ($$0.d($$7.v()) || !$$3.test($$7, $$9)) {
            return Optional.empty();
         }
      }

      return Optional.empty();
   }

   private static boolean a(crg $$0, ht $$1, dhi $$2) {
      if ($$2.i()) {
         return true;
      } else if ($$2.i($$0, $$1)) {
         return false;
      } else if (!$$2.u().c()) {
         return false;
      } else {
         ekn $$3 = $$2.k($$0, $$1);
         return !ekk.c(T, $$3, ejy.i);
      }
   }

   static record a(ht a, ecr b, dhi c) {
   }
}
