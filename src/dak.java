import com.google.common.annotations.VisibleForTesting;
import com.mojang.serialization.MapCodec;
import java.util.Optional;
import java.util.function.BiPredicate;
import java.util.function.Predicate;
import javax.annotation.Nullable;

public class dak extends cut implements cxn, dbt {
   public static final MapCodec<dak> a = b(dak::new);
   public static final dhq b = dhm.bm;
   public static final dhu<dht> c = dhm.bn;
   public static final dhn d = dhm.C;
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
   private static final ekb M = cut.a(5.0, 0.0, 5.0, 11.0, 16.0, 11.0);
   private static final ekb N = cut.a(5.0, 0.0, 5.0, 11.0, 11.0, 11.0);
   private static final ekb O = cut.a(5.0, 5.0, 5.0, 11.0, 16.0, 11.0);
   private static final ekb P = cut.a(4.0, 0.0, 4.0, 12.0, 16.0, 12.0);
   private static final ekb Q = cut.a(3.0, 0.0, 3.0, 13.0, 16.0, 13.0);
   private static final ekb R = cut.a(2.0, 0.0, 2.0, 14.0, 16.0, 14.0);
   private static final float S = 0.125F;
   private static final ekb T = cut.a(6.0, 0.0, 6.0, 10.0, 16.0, 10.0);

   @Override
   public MapCodec<dak> a() {
      return a;
   }

   public dak(dgv.d $$0) {
      super($$0);
      this.k(this.E.b().a(b, hx.b).a(c, dht.b).a(d, Boolean.valueOf(false)));
   }

   @Override
   protected void a(dgx.a<cut, dgw> $$0) {
      $$0.a(b, c, d);
   }

   @Override
   public boolean a(dgw $$0, crv $$1, ht $$2) {
      return c($$1, $$2, $$0.c(b));
   }

   @Override
   public dgw a(dgw $$0, hx $$1, dgw $$2, crt $$3, ht $$4, ht $$5) {
      if ($$0.c(d)) {
         $$3.a($$4, ech.c, ech.c.a($$3));
      }

      if ($$1 != hx.b && $$1 != hx.a) {
         return $$0;
      } else {
         hx $$6 = $$0.c(b);
         if ($$6 == hx.a && $$3.L().a($$4, this)) {
            return $$0;
         } else if ($$1 == $$6.g() && !this.a($$0, (crv)$$3, $$4)) {
            if ($$6 == hx.a) {
               $$3.a($$4, this, 2);
            } else {
               $$3.a($$4, this, 1);
            }

            return $$0;
         } else {
            boolean $$7 = $$0.c(c) == dht.a;
            dht $$8 = a($$3, $$4, $$6, $$7);
            return $$0.a(c, $$8);
         }
      }
   }

   @Override
   public void a(crs $$0, dgw $$1, eje $$2, cee $$3) {
      ht $$4 = $$2.a();
      if (!$$0.B && $$3.a($$0, $$4) && $$3.b($$0) && $$3 instanceof ceq && $$3.do().f() > 0.6) {
         $$0.b($$4, true);
      }
   }

   @Override
   public void a(crs $$0, dgw $$1, ht $$2, bki $$3, float $$4) {
      if ($$1.c(b) == hx.b && $$1.c(c) == dht.b) {
         $$3.a($$4 + 2.0F, 2.0F, $$0.ag().u());
      } else {
         super.a($$0, $$1, $$2, $$3, $$4);
      }
   }

   @Override
   public void a(dgw $$0, crs $$1, ht $$2, ato $$3) {
      if (h($$0)) {
         float $$4 = $$3.i();
         if (!($$4 > 0.12F)) {
            b($$1, $$2, $$0).filter($$1x -> $$4 < 0.02F || a($$1x.b)).ifPresent($$3x -> a($$1, $$2, $$0, $$3x.b));
         }
      }
   }

   @Override
   public void a(dgw $$0, ama $$1, ht $$2, ato $$3) {
      if (o($$0) && !this.a($$0, (crv)$$1, $$2)) {
         $$1.b($$2, true);
      } else {
         a($$0, $$1, $$2);
      }
   }

   @Override
   public void b(dgw $$0, ama $$1, ht $$2, ato $$3) {
      a($$0, $$1, $$2, $$3.i());
      if ($$3.i() < 0.011377778F && b($$0, (crv)$$1, $$2)) {
         c($$0, $$1, $$2, $$3);
      }
   }

   @VisibleForTesting
   public static void a(dgw $$0, ama $$1, ht $$2, float $$3) {
      if (!($$3 > 0.17578125F) || !($$3 > 0.05859375F)) {
         if (b($$0, (crv)$$1, $$2)) {
            Optional<dak.a> $$4 = b($$1, $$2, $$0);
            if (!$$4.isEmpty()) {
               ecf $$5 = $$4.get().b;
               float $$6;
               if ($$5 == ech.c) {
                  $$6 = 0.17578125F;
               } else {
                  if ($$5 != ech.e) {
                     return;
                  }

                  $$6 = 0.05859375F;
               }

               if (!($$3 >= $$6)) {
                  ht $$9 = a($$0, $$1, $$2, 11, false);
                  if ($$9 != null) {
                     if ($$4.get().c.a(cuv.rH) && $$5 == ech.c) {
                        dgw $$10 = cuv.dR.o();
                        $$1.b($$4.get().a, $$10);
                        cut.a($$4.get().c, $$10, $$1, $$4.get().a);
                        $$1.a(dlg.c, $$4.get().a, dlg.a.a($$10));
                        $$1.c(1504, $$9, 0);
                     } else {
                        ht $$11 = a($$1, $$9, $$5);
                        if ($$11 != null) {
                           $$1.c(1504, $$9, 0);
                           int $$12 = $$9.v() - $$11.v();
                           int $$13 = 50 + $$12;
                           dgw $$14 = $$1.a_($$11);
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
   public dgw a(cnj $$0) {
      crt $$1 = $$0.q();
      ht $$2 = $$0.a();
      hx $$3 = $$0.e().g();
      hx $$4 = b($$1, $$2, $$3);
      if ($$4 == null) {
         return null;
      } else {
         boolean $$5 = !$$0.h();
         dht $$6 = a($$1, $$2, $$4, $$5);
         return $$6 == null ? null : this.o().a(b, $$4).a(c, $$6).a(d, Boolean.valueOf($$1.b_($$2).a() == ech.c));
      }
   }

   @Override
   public ecg c_(dgw $$0) {
      return $$0.c(d) ? ech.c.a(false) : super.c_($$0);
   }

   @Override
   public ekb f(dgw $$0, cqy $$1, ht $$2) {
      return ejy.a();
   }

   @Override
   public ekb a(dgw $$0, cqy $$1, ht $$2, ejn $$3) {
      dht $$4 = $$0.c(c);
      ekb $$5;
      if ($$4 == dht.a) {
         $$5 = M;
      } else if ($$4 == dht.b) {
         if ($$0.c(b) == hx.a) {
            $$5 = O;
         } else {
            $$5 = N;
         }
      } else if ($$4 == dht.c) {
         $$5 = P;
      } else if ($$4 == dht.d) {
         $$5 = Q;
      } else {
         $$5 = R;
      }

      eji $$11 = $$0.n($$1, $$2);
      return $$5.a($$11.c, 0.0, $$11.e);
   }

   @Override
   public boolean a_(dgw $$0, cqy $$1, ht $$2) {
      return false;
   }

   @Override
   public float as_() {
      return 0.125F;
   }

   @Override
   public void a(crs $$0, ht $$1, cae $$2) {
      if (!$$2.aS()) {
         $$0.c(1045, $$1, 0);
      }
   }

   @Override
   public bjg a(bki $$0) {
      return $$0.dM().c($$0);
   }

   private static void a(dgw $$0, ama $$1, ht $$2) {
      ht.a $$3 = $$2.j();
      dgw $$4 = $$0;

      while (n($$4)) {
         cae $$5 = cae.a($$1, $$3, $$4);
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
   public static void c(dgw $$0, ama $$1, ht $$2, ato $$3) {
      dgw $$4 = $$1.a_($$2.b(1));
      dgw $$5 = $$1.a_($$2.b(2));
      if (a($$4, $$5)) {
         ht $$6 = a($$0, $$1, $$2, 7, false);
         if ($$6 != null) {
            dgw $$7 = $$1.a_($$6);
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

   private static void b(ama $$0, ht $$1) {
      ht.a $$2 = $$1.j();

      for (int $$3 = 0; $$3 < 10; $$3++) {
         $$2.c(hx.a);
         dgw $$4 = $$0.a_($$2);
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

         if (!a((cqy)$$0, $$2, $$4)) {
            return;
         }
      }
   }

   private static void a(ama $$0, ht $$1, hx $$2) {
      ht $$3 = $$1.a($$2);
      dgw $$4 = $$0.a_($$3);
      if (a($$4, $$2.g())) {
         a($$4, (crt)$$0, $$3);
      } else if ($$4.i() || $$4.a(cuv.G)) {
         a($$0, $$3, $$2, dht.b);
      }
   }

   private static void a(crt $$0, ht $$1, hx $$2, dht $$3) {
      dgw $$4 = cuv.rs.o().a(b, $$2).a(c, $$3).a(d, Boolean.valueOf($$0.b_($$1).a() == ech.c));
      $$0.a($$1, $$4, 3);
   }

   private static void a(dgw $$0, crt $$1, ht $$2) {
      ht $$4;
      ht $$3;
      if ($$0.c(b) == hx.b) {
         $$3 = $$2;
         $$4 = $$2.c();
      } else {
         $$4 = $$2;
         $$3 = $$2.d();
      }

      a($$1, $$4, hx.a, dht.a);
      a($$1, $$3, hx.b, dht.a);
   }

   public static void a(crs $$0, ht $$1, dgw $$2) {
      b($$0, $$1, $$2).ifPresent($$3 -> a($$0, $$1, $$2, $$3.b));
   }

   private static void a(crs $$0, ht $$1, dgw $$2, ecf $$3) {
      eji $$4 = $$2.n($$0, $$1);
      double $$5 = 0.0625;
      double $$6 = (double)$$1.u() + 0.5 + $$4.c;
      double $$7 = (double)((float)($$1.v() + 1) - 0.6875F) - 0.0625;
      double $$8 = (double)$$1.w() + 0.5 + $$4.e;
      ecf $$9 = a($$0, $$3);
      jq $$10 = $$9.a(arh.b) ? js.aG : js.aI;
      $$0.a($$10, $$6, $$7, $$8, 0.0, 0.0, 0.0);
   }

   @Nullable
   private static ht a(dgw $$0, crt $$1, ht $$2, int $$3, boolean $$4) {
      if (a($$0, $$4)) {
         return $$2;
      } else {
         hx $$5 = $$0.c(b);
         BiPredicate<ht, dgw> $$6 = ($$1x, $$2x) -> $$2x.a(cuv.rs) && $$2x.c(b) == $$5;
         return a($$1, $$2, $$5.f(), $$6, $$1x -> a($$1x, $$4), $$3).orElse(null);
      }
   }

   @Nullable
   private static hx b(crv $$0, ht $$1, hx $$2) {
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

   private static dht a(crv $$0, ht $$1, hx $$2, boolean $$3) {
      hx $$4 = $$2.g();
      dgw $$5 = $$0.a_($$1.a($$2));
      if (b($$5, $$4)) {
         return !$$3 && $$5.c(c) != dht.a ? dht.b : dht.a;
      } else if (!b($$5, $$2)) {
         return dht.b;
      } else {
         dht $$6 = $$5.c(c);
         if ($$6 != dht.b && $$6 != dht.a) {
            dgw $$7 = $$0.a_($$1.a($$4));
            return !b($$7, $$2) ? dht.e : dht.d;
         } else {
            return dht.c;
         }
      }
   }

   public static boolean h(dgw $$0) {
      return n($$0) && $$0.c(c) == dht.b && !$$0.c(d);
   }

   private static boolean b(dgw $$0, ama $$1, ht $$2) {
      hx $$3 = $$0.c(b);
      ht $$4 = $$2.a($$3);
      dgw $$5 = $$1.a_($$4);
      if (!$$5.u().c()) {
         return false;
      } else {
         return $$5.i() ? true : a($$5, $$3.g());
      }
   }

   private static Optional<ht> a(crs $$0, ht $$1, dgw $$2, int $$3) {
      hx $$4 = $$2.c(b);
      BiPredicate<ht, dgw> $$5 = ($$1x, $$2x) -> $$2x.a(cuv.rs) && $$2x.c(b) == $$4;
      return a($$0, $$1, $$4.g().f(), $$5, $$0x -> !$$0x.a(cuv.rs), $$3);
   }

   private static boolean c(crv $$0, ht $$1, hx $$2) {
      ht $$3 = $$1.a($$2.g());
      dgw $$4 = $$0.a_($$3);
      return $$4.d($$0, $$3, $$2) || b($$4, $$2);
   }

   private static boolean a(dgw $$0, boolean $$1) {
      if (!$$0.a(cuv.rs)) {
         return false;
      } else {
         dht $$2 = $$0.c(c);
         return $$2 == dht.b || $$1 && $$2 == dht.a;
      }
   }

   private static boolean a(dgw $$0, hx $$1) {
      return a($$0, false) && $$0.c(b) == $$1;
   }

   private static boolean n(dgw $$0) {
      return b($$0, hx.a);
   }

   private static boolean o(dgw $$0) {
      return b($$0, hx.b);
   }

   private static boolean b(dgw $$0, crv $$1, ht $$2) {
      return n($$0) && !$$1.a_($$2.c()).a(cuv.rs);
   }

   @Override
   public boolean a(dgw $$0, cqy $$1, ht $$2, ecw $$3) {
      return false;
   }

   private static boolean b(dgw $$0, hx $$1) {
      return $$0.a(cuv.rs) && $$0.c(b) == $$1;
   }

   @Nullable
   private static ht a(crs $$0, ht $$1, ecf $$2) {
      Predicate<dgw> $$3 = $$1x -> $$1x.b() instanceof ctl && ((ctl)$$1x.b()).a($$2);
      BiPredicate<ht, dgw> $$4 = ($$1x, $$2x) -> a((cqy)$$0, $$1x, $$2x);
      return a($$0, $$1, hx.a.f(), $$4, $$3, 11).orElse(null);
   }

   @Nullable
   public static ht a(crs $$0, ht $$1) {
      BiPredicate<ht, dgw> $$2 = ($$1x, $$2x) -> a((cqy)$$0, $$1x, $$2x);
      return a($$0, $$1, hx.b.f(), $$2, dak::h, 11).orElse(null);
   }

   public static ecf a(ama $$0, ht $$1) {
      return b($$0, $$1, $$0.a_($$1)).map($$0x -> $$0x.b).filter(dak::a).orElse(ech.a);
   }

   private static Optional<dak.a> b(crs $$0, ht $$1, dgw $$2) {
      return !n($$2) ? Optional.empty() : a($$0, $$1, $$2, 11).map($$1x -> {
         ht $$2x = $$1x.c();
         dgw $$3 = $$0.a_($$2x);
         ecf $$4;
         if ($$3.a(cuv.rH) && !$$0.D_().i()) {
            $$4 = ech.c;
         } else {
            $$4 = $$0.b_($$2x).a();
         }

         return new dak.a($$2x, $$4, $$3);
      });
   }

   private static boolean a(ecf $$0) {
      return $$0 == ech.e || $$0 == ech.c;
   }

   private static boolean a(dgw $$0, dgw $$1) {
      return $$0.a(cuv.rt) && $$1.a(cuv.G) && $$1.u().b();
   }

   private static ecf a(crs $$0, ecf $$1) {
      if ($$1.a(ech.a)) {
         return $$0.D_().i() ? ech.e : ech.c;
      } else {
         return $$1;
      }
   }

   private static Optional<ht> a(crt $$0, ht $$1, hx.b $$2, BiPredicate<ht, dgw> $$3, Predicate<dgw> $$4, int $$5) {
      hx $$6 = hx.a($$2, hx.a.b);
      ht.a $$7 = $$1.j();

      for (int $$8 = 1; $$8 < $$5; $$8++) {
         $$7.c($$6);
         dgw $$9 = $$0.a_($$7);
         if ($$4.test($$9)) {
            return Optional.of($$7.i());
         }

         if ($$0.d($$7.v()) || !$$3.test($$7, $$9)) {
            return Optional.empty();
         }
      }

      return Optional.empty();
   }

   private static boolean a(cqy $$0, ht $$1, dgw $$2) {
      if ($$2.i()) {
         return true;
      } else if ($$2.i($$0, $$1)) {
         return false;
      } else if (!$$2.u().c()) {
         return false;
      } else {
         ekb $$3 = $$2.k($$0, $$1);
         return !ejy.c(T, $$3, ejm.i);
      }
   }

   static record a(ht a, ecf b, dgw c) {
   }
}
