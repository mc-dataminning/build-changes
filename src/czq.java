import com.google.common.annotations.VisibleForTesting;
import com.mojang.serialization.MapCodec;
import java.util.Optional;
import java.util.function.BiPredicate;
import java.util.function.Predicate;
import javax.annotation.Nullable;

public class czq extends cua implements cwt, daz {
   public static final MapCodec<czq> a = b(czq::new);
   public static final dgv b = dgr.bm;
   public static final dgz<dgy> c = dgr.bn;
   public static final dgs d = dgr.C;
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
   private static final eiy M = cua.a(5.0, 0.0, 5.0, 11.0, 16.0, 11.0);
   private static final eiy N = cua.a(5.0, 0.0, 5.0, 11.0, 11.0, 11.0);
   private static final eiy O = cua.a(5.0, 5.0, 5.0, 11.0, 16.0, 11.0);
   private static final eiy P = cua.a(4.0, 0.0, 4.0, 12.0, 16.0, 12.0);
   private static final eiy Q = cua.a(3.0, 0.0, 3.0, 13.0, 16.0, 13.0);
   private static final eiy R = cua.a(2.0, 0.0, 2.0, 14.0, 16.0, 14.0);
   private static final float S = 0.125F;
   private static final eiy T = cua.a(6.0, 0.0, 6.0, 10.0, 16.0, 10.0);

   @Override
   public MapCodec<czq> a() {
      return a;
   }

   public czq(dga.d $$0) {
      super($$0);
      this.k(this.E.b().a(b, hx.b).a(c, dgy.b).a(d, Boolean.valueOf(false)));
   }

   @Override
   protected void a(dgc.a<cua, dgb> $$0) {
      $$0.a(b, c, d);
   }

   @Override
   public boolean a(dgb $$0, crc $$1, ht $$2) {
      return c($$1, $$2, $$0.c(b));
   }

   @Override
   public dgb a(dgb $$0, hx $$1, dgb $$2, cra $$3, ht $$4, ht $$5) {
      if ($$0.c(d)) {
         $$3.a($$4, ebf.c, ebf.c.a($$3));
      }

      if ($$1 != hx.b && $$1 != hx.a) {
         return $$0;
      } else {
         hx $$6 = $$0.c(b);
         if ($$6 == hx.a && $$3.L().a($$4, this)) {
            return $$0;
         } else if ($$1 == $$6.g() && !this.a($$0, (crc)$$3, $$4)) {
            if ($$6 == hx.a) {
               $$3.a($$4, this, 2);
            } else {
               $$3.a($$4, this, 1);
            }

            return $$0;
         } else {
            boolean $$7 = $$0.c(c) == dgy.a;
            dgy $$8 = a($$3, $$4, $$6, $$7);
            return $$0.a(c, $$8);
         }
      }
   }

   @Override
   public void a(cqz $$0, dgb $$1, eib $$2, cdp $$3) {
      ht $$4 = $$2.a();
      if (!$$0.B && $$3.a($$0, $$4) && $$3 instanceof ceb && $$3.do().f() > 0.6) {
         $$0.b($$4, true);
      }
   }

   @Override
   public void a(cqz $$0, dgb $$1, ht $$2, bjt $$3, float $$4) {
      if ($$1.c(b) == hx.b && $$1.c(c) == dgy.b) {
         $$3.a($$4 + 2.0F, 2.0F, $$0.ag().u());
      } else {
         super.a($$0, $$1, $$2, $$3, $$4);
      }
   }

   @Override
   public void a(dgb $$0, cqz $$1, ht $$2, ate $$3) {
      if (h($$0)) {
         float $$4 = $$3.i();
         if (!($$4 > 0.12F)) {
            b($$1, $$2, $$0).filter($$1x -> $$4 < 0.02F || a($$1x.b)).ifPresent($$3x -> a($$1, $$2, $$0, $$3x.b));
         }
      }
   }

   @Override
   public void a(dgb $$0, alq $$1, ht $$2, ate $$3) {
      if (o($$0) && !this.a($$0, (crc)$$1, $$2)) {
         $$1.b($$2, true);
      } else {
         a($$0, $$1, $$2);
      }
   }

   @Override
   public void b(dgb $$0, alq $$1, ht $$2, ate $$3) {
      a($$0, $$1, $$2, $$3.i());
      if ($$3.i() < 0.011377778F && b($$0, (crc)$$1, $$2)) {
         c($$0, $$1, $$2, $$3);
      }
   }

   @VisibleForTesting
   public static void a(dgb $$0, alq $$1, ht $$2, float $$3) {
      if (!($$3 > 0.17578125F) || !($$3 > 0.05859375F)) {
         if (b($$0, (crc)$$1, $$2)) {
            Optional<czq.a> $$4 = b($$1, $$2, $$0);
            if (!$$4.isEmpty()) {
               ebd $$5 = $$4.get().b;
               float $$6;
               if ($$5 == ebf.c) {
                  $$6 = 0.17578125F;
               } else {
                  if ($$5 != ebf.e) {
                     return;
                  }

                  $$6 = 0.05859375F;
               }

               if (!($$3 >= $$6)) {
                  ht $$9 = a($$0, $$1, $$2, 11, false);
                  if ($$9 != null) {
                     if ($$4.get().c.a(cuc.rH) && $$5 == ebf.c) {
                        dgb $$10 = cuc.dR.o();
                        $$1.b($$4.get().a, $$10);
                        cua.a($$4.get().c, $$10, $$1, $$4.get().a);
                        $$1.a(dkl.c, $$4.get().a, dkl.a.a($$10));
                        $$1.c(1504, $$9, 0);
                     } else {
                        ht $$11 = a($$1, $$9, $$5);
                        if ($$11 != null) {
                           $$1.c(1504, $$9, 0);
                           int $$12 = $$9.v() - $$11.v();
                           int $$13 = 50 + $$12;
                           dgb $$14 = $$1.a_($$11);
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
   public dgb a(cmr $$0) {
      cra $$1 = $$0.q();
      ht $$2 = $$0.a();
      hx $$3 = $$0.e().g();
      hx $$4 = b($$1, $$2, $$3);
      if ($$4 == null) {
         return null;
      } else {
         boolean $$5 = !$$0.h();
         dgy $$6 = a($$1, $$2, $$4, $$5);
         return $$6 == null ? null : this.o().a(b, $$4).a(c, $$6).a(d, Boolean.valueOf($$1.b_($$2).a() == ebf.c));
      }
   }

   @Override
   public ebe c_(dgb $$0) {
      return $$0.c(d) ? ebf.c.a(false) : super.c_($$0);
   }

   @Override
   public eiy f(dgb $$0, cqf $$1, ht $$2) {
      return eiv.a();
   }

   @Override
   public eiy a(dgb $$0, cqf $$1, ht $$2, eik $$3) {
      dgy $$4 = $$0.c(c);
      eiy $$5;
      if ($$4 == dgy.a) {
         $$5 = M;
      } else if ($$4 == dgy.b) {
         if ($$0.c(b) == hx.a) {
            $$5 = O;
         } else {
            $$5 = N;
         }
      } else if ($$4 == dgy.c) {
         $$5 = P;
      } else if ($$4 == dgy.d) {
         $$5 = Q;
      } else {
         $$5 = R;
      }

      eif $$11 = $$0.n($$1, $$2);
      return $$5.a($$11.c, 0.0, $$11.e);
   }

   @Override
   public boolean a_(dgb $$0, cqf $$1, ht $$2) {
      return false;
   }

   @Override
   public float as_() {
      return 0.125F;
   }

   @Override
   public void a(cqz $$0, ht $$1, bzp $$2) {
      if (!$$2.aS()) {
         $$0.c(1045, $$1, 0);
      }
   }

   @Override
   public bir a(bjt $$0) {
      return $$0.dM().c($$0);
   }

   private static void a(dgb $$0, alq $$1, ht $$2) {
      ht.a $$3 = $$2.j();
      dgb $$4 = $$0;

      while (n($$4)) {
         bzp $$5 = bzp.a($$1, $$3, $$4);
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
   public static void c(dgb $$0, alq $$1, ht $$2, ate $$3) {
      dgb $$4 = $$1.a_($$2.b(1));
      dgb $$5 = $$1.a_($$2.b(2));
      if (a($$4, $$5)) {
         ht $$6 = a($$0, $$1, $$2, 7, false);
         if ($$6 != null) {
            dgb $$7 = $$1.a_($$6);
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

   private static void b(alq $$0, ht $$1) {
      ht.a $$2 = $$1.j();

      for (int $$3 = 0; $$3 < 10; $$3++) {
         $$2.c(hx.a);
         dgb $$4 = $$0.a_($$2);
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

         if (!a((cqf)$$0, $$2, $$4)) {
            return;
         }
      }
   }

   private static void a(alq $$0, ht $$1, hx $$2) {
      ht $$3 = $$1.a($$2);
      dgb $$4 = $$0.a_($$3);
      if (a($$4, $$2.g())) {
         a($$4, (cra)$$0, $$3);
      } else if ($$4.i() || $$4.a(cuc.G)) {
         a($$0, $$3, $$2, dgy.b);
      }
   }

   private static void a(cra $$0, ht $$1, hx $$2, dgy $$3) {
      dgb $$4 = cuc.rs.o().a(b, $$2).a(c, $$3).a(d, Boolean.valueOf($$0.b_($$1).a() == ebf.c));
      $$0.a($$1, $$4, 3);
   }

   private static void a(dgb $$0, cra $$1, ht $$2) {
      ht $$4;
      ht $$3;
      if ($$0.c(b) == hx.b) {
         $$3 = $$2;
         $$4 = $$2.c();
      } else {
         $$4 = $$2;
         $$3 = $$2.d();
      }

      a($$1, $$4, hx.a, dgy.a);
      a($$1, $$3, hx.b, dgy.a);
   }

   public static void a(cqz $$0, ht $$1, dgb $$2) {
      b($$0, $$1, $$2).ifPresent($$3 -> a($$0, $$1, $$2, $$3.b));
   }

   private static void a(cqz $$0, ht $$1, dgb $$2, ebd $$3) {
      eif $$4 = $$2.n($$0, $$1);
      double $$5 = 0.0625;
      double $$6 = (double)$$1.u() + 0.5 + $$4.c;
      double $$7 = (double)((float)($$1.v() + 1) - 0.6875F) - 0.0625;
      double $$8 = (double)$$1.w() + 0.5 + $$4.e;
      ebd $$9 = a($$0, $$3);
      jq $$10 = $$9.a(aqx.b) ? js.aF : js.aH;
      $$0.a($$10, $$6, $$7, $$8, 0.0, 0.0, 0.0);
   }

   @Nullable
   private static ht a(dgb $$0, cra $$1, ht $$2, int $$3, boolean $$4) {
      if (a($$0, $$4)) {
         return $$2;
      } else {
         hx $$5 = $$0.c(b);
         BiPredicate<ht, dgb> $$6 = ($$1x, $$2x) -> $$2x.a(cuc.rs) && $$2x.c(b) == $$5;
         return a($$1, $$2, $$5.f(), $$6, $$1x -> a($$1x, $$4), $$3).orElse(null);
      }
   }

   @Nullable
   private static hx b(crc $$0, ht $$1, hx $$2) {
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

   private static dgy a(crc $$0, ht $$1, hx $$2, boolean $$3) {
      hx $$4 = $$2.g();
      dgb $$5 = $$0.a_($$1.a($$2));
      if (b($$5, $$4)) {
         return !$$3 && $$5.c(c) != dgy.a ? dgy.b : dgy.a;
      } else if (!b($$5, $$2)) {
         return dgy.b;
      } else {
         dgy $$6 = $$5.c(c);
         if ($$6 != dgy.b && $$6 != dgy.a) {
            dgb $$7 = $$0.a_($$1.a($$4));
            return !b($$7, $$2) ? dgy.e : dgy.d;
         } else {
            return dgy.c;
         }
      }
   }

   public static boolean h(dgb $$0) {
      return n($$0) && $$0.c(c) == dgy.b && !$$0.c(d);
   }

   private static boolean b(dgb $$0, alq $$1, ht $$2) {
      hx $$3 = $$0.c(b);
      ht $$4 = $$2.a($$3);
      dgb $$5 = $$1.a_($$4);
      if (!$$5.u().c()) {
         return false;
      } else {
         return $$5.i() ? true : a($$5, $$3.g());
      }
   }

   private static Optional<ht> a(cqz $$0, ht $$1, dgb $$2, int $$3) {
      hx $$4 = $$2.c(b);
      BiPredicate<ht, dgb> $$5 = ($$1x, $$2x) -> $$2x.a(cuc.rs) && $$2x.c(b) == $$4;
      return a($$0, $$1, $$4.g().f(), $$5, $$0x -> !$$0x.a(cuc.rs), $$3);
   }

   private static boolean c(crc $$0, ht $$1, hx $$2) {
      ht $$3 = $$1.a($$2.g());
      dgb $$4 = $$0.a_($$3);
      return $$4.d($$0, $$3, $$2) || b($$4, $$2);
   }

   private static boolean a(dgb $$0, boolean $$1) {
      if (!$$0.a(cuc.rs)) {
         return false;
      } else {
         dgy $$2 = $$0.c(c);
         return $$2 == dgy.b || $$1 && $$2 == dgy.a;
      }
   }

   private static boolean a(dgb $$0, hx $$1) {
      return a($$0, false) && $$0.c(b) == $$1;
   }

   private static boolean n(dgb $$0) {
      return b($$0, hx.a);
   }

   private static boolean o(dgb $$0) {
      return b($$0, hx.b);
   }

   private static boolean b(dgb $$0, crc $$1, ht $$2) {
      return n($$0) && !$$1.a_($$2.c()).a(cuc.rs);
   }

   @Override
   public boolean a(dgb $$0, cqf $$1, ht $$2, ebu $$3) {
      return false;
   }

   private static boolean b(dgb $$0, hx $$1) {
      return $$0.a(cuc.rs) && $$0.c(b) == $$1;
   }

   @Nullable
   private static ht a(cqz $$0, ht $$1, ebd $$2) {
      Predicate<dgb> $$3 = $$1x -> $$1x.b() instanceof css && ((css)$$1x.b()).a($$2);
      BiPredicate<ht, dgb> $$4 = ($$1x, $$2x) -> a((cqf)$$0, $$1x, $$2x);
      return a($$0, $$1, hx.a.f(), $$4, $$3, 11).orElse(null);
   }

   @Nullable
   public static ht a(cqz $$0, ht $$1) {
      BiPredicate<ht, dgb> $$2 = ($$1x, $$2x) -> a((cqf)$$0, $$1x, $$2x);
      return a($$0, $$1, hx.b.f(), $$2, czq::h, 11).orElse(null);
   }

   public static ebd a(alq $$0, ht $$1) {
      return b($$0, $$1, $$0.a_($$1)).map($$0x -> $$0x.b).filter(czq::a).orElse(ebf.a);
   }

   private static Optional<czq.a> b(cqz $$0, ht $$1, dgb $$2) {
      return !n($$2) ? Optional.empty() : a($$0, $$1, $$2, 11).map($$1x -> {
         ht $$2x = $$1x.c();
         dgb $$3 = $$0.a_($$2x);
         ebd $$4;
         if ($$3.a(cuc.rH) && !$$0.D_().i()) {
            $$4 = ebf.c;
         } else {
            $$4 = $$0.b_($$2x).a();
         }

         return new czq.a($$2x, $$4, $$3);
      });
   }

   private static boolean a(ebd $$0) {
      return $$0 == ebf.e || $$0 == ebf.c;
   }

   private static boolean a(dgb $$0, dgb $$1) {
      return $$0.a(cuc.rt) && $$1.a(cuc.G) && $$1.u().b();
   }

   private static ebd a(cqz $$0, ebd $$1) {
      if ($$1.a(ebf.a)) {
         return $$0.D_().i() ? ebf.e : ebf.c;
      } else {
         return $$1;
      }
   }

   private static Optional<ht> a(cra $$0, ht $$1, hx.b $$2, BiPredicate<ht, dgb> $$3, Predicate<dgb> $$4, int $$5) {
      hx $$6 = hx.a($$2, hx.a.b);
      ht.a $$7 = $$1.j();

      for (int $$8 = 1; $$8 < $$5; $$8++) {
         $$7.c($$6);
         dgb $$9 = $$0.a_($$7);
         if ($$4.test($$9)) {
            return Optional.of($$7.i());
         }

         if ($$0.d($$7.v()) || !$$3.test($$7, $$9)) {
            return Optional.empty();
         }
      }

      return Optional.empty();
   }

   private static boolean a(cqf $$0, ht $$1, dgb $$2) {
      if ($$2.i()) {
         return true;
      } else if ($$2.i($$0, $$1)) {
         return false;
      } else if (!$$2.u().c()) {
         return false;
      } else {
         eiy $$3 = $$2.k($$0, $$1);
         return !eiv.c(T, $$3, eij.i);
      }
   }

   static record a(ht a, ebd b, dgb c) {
   }
}
