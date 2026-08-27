import com.google.common.annotations.VisibleForTesting;
import com.mojang.serialization.MapCodec;
import java.util.Optional;
import java.util.function.BiPredicate;
import java.util.function.Predicate;
import javax.annotation.Nullable;

public class dbq extends cvz implements cyu, dcz {
   public static final MapCodec<dbq> a = b(dbq::new);
   public static final djj b = djf.bm;
   public static final djn<djm> c = djf.bn;
   public static final djg d = djf.C;
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
   private static final elu M = cvz.a(5.0, 0.0, 5.0, 11.0, 16.0, 11.0);
   private static final elu N = cvz.a(5.0, 0.0, 5.0, 11.0, 11.0, 11.0);
   private static final elu O = cvz.a(5.0, 5.0, 5.0, 11.0, 16.0, 11.0);
   private static final elu P = cvz.a(4.0, 0.0, 4.0, 12.0, 16.0, 12.0);
   private static final elu Q = cvz.a(3.0, 0.0, 3.0, 13.0, 16.0, 13.0);
   private static final elu R = cvz.a(2.0, 0.0, 2.0, 14.0, 16.0, 14.0);
   private static final float S = 0.125F;
   private static final elu T = cvz.a(6.0, 0.0, 6.0, 10.0, 16.0, 10.0);

   @Override
   public MapCodec<dbq> a() {
      return a;
   }

   public dbq(dio.d $$0) {
      super($$0);
      this.k(this.E.b().a(b, ia.b).a(c, djm.b).a(d, Boolean.valueOf(false)));
   }

   @Override
   protected void a(diq.a<cvz, dip> $$0) {
      $$0.a(b, c, d);
   }

   @Override
   public boolean a(dip $$0, ctb $$1, hv $$2) {
      return c($$1, $$2, $$0.c(b));
   }

   @Override
   public dip a(dip $$0, ia $$1, dip $$2, csz $$3, hv $$4, hv $$5) {
      if ($$0.c(d)) {
         $$3.a($$4, eea.c, eea.c.a($$3));
      }

      if ($$1 != ia.b && $$1 != ia.a) {
         return $$0;
      } else {
         ia $$6 = $$0.c(b);
         if ($$6 == ia.a && $$3.M().a($$4, this)) {
            return $$0;
         } else if ($$1 == $$6.g() && !this.a($$0, (ctb)$$3, $$4)) {
            if ($$6 == ia.a) {
               $$3.a($$4, this, 2);
            } else {
               $$3.a($$4, this, 1);
            }

            return $$0;
         } else {
            boolean $$7 = $$0.c(c) == djm.a;
            djm $$8 = a($$3, $$4, $$6, $$7);
            return $$0.a(c, $$8);
         }
      }
   }

   @Override
   public void a(csy $$0, dip $$1, ekx $$2, cfj $$3) {
      hv $$4 = $$2.a();
      if (!$$0.B && $$3.a($$0, $$4) && $$3.b($$0) && $$3 instanceof cfv && $$3.dp().f() > 0.6) {
         $$0.b($$4, true);
      }
   }

   @Override
   public void a(csy $$0, dip $$1, hv $$2, blf $$3, float $$4) {
      if ($$1.c(b) == ia.b && $$1.c(c) == djm.b) {
         $$3.a($$4 + 2.0F, 2.0F, $$0.ah().u());
      } else {
         super.a($$0, $$1, $$2, $$3, $$4);
      }
   }

   @Override
   public void a(dip $$0, csy $$1, hv $$2, auf $$3) {
      if (h($$0)) {
         float $$4 = $$3.i();
         if (!($$4 > 0.12F)) {
            b($$1, $$2, $$0).filter($$1x -> $$4 < 0.02F || a($$1x.b)).ifPresent($$3x -> a($$1, $$2, $$0, $$3x.b));
         }
      }
   }

   @Override
   public void a(dip $$0, amp $$1, hv $$2, auf $$3) {
      if (o($$0) && !this.a($$0, (ctb)$$1, $$2)) {
         $$1.b($$2, true);
      } else {
         a($$0, $$1, $$2);
      }
   }

   @Override
   public void b(dip $$0, amp $$1, hv $$2, auf $$3) {
      a($$0, $$1, $$2, $$3.i());
      if ($$3.i() < 0.011377778F && b($$0, (ctb)$$1, $$2)) {
         c($$0, $$1, $$2, $$3);
      }
   }

   @VisibleForTesting
   public static void a(dip $$0, amp $$1, hv $$2, float $$3) {
      if (!($$3 > 0.17578125F) || !($$3 > 0.05859375F)) {
         if (b($$0, (ctb)$$1, $$2)) {
            Optional<dbq.a> $$4 = b($$1, $$2, $$0);
            if (!$$4.isEmpty()) {
               edy $$5 = $$4.get().b;
               float $$6;
               if ($$5 == eea.c) {
                  $$6 = 0.17578125F;
               } else {
                  if ($$5 != eea.e) {
                     return;
                  }

                  $$6 = 0.05859375F;
               }

               if (!($$3 >= $$6)) {
                  hv $$9 = a($$0, $$1, $$2, 11, false);
                  if ($$9 != null) {
                     if ($$4.get().c.a(cwb.sI) && $$5 == eea.c) {
                        dip $$10 = cwb.dR.o();
                        $$1.b($$4.get().a, $$10);
                        cvz.a($$4.get().c, $$10, $$1, $$4.get().a);
                        $$1.a(dmz.c, $$4.get().a, dmz.a.a($$10));
                        $$1.c(1504, $$9, 0);
                     } else {
                        hv $$11 = a($$1, $$9, $$5);
                        if ($$11 != null) {
                           $$1.c(1504, $$9, 0);
                           int $$12 = $$9.v() - $$11.v();
                           int $$13 = 50 + $$12;
                           dip $$14 = $$1.a_($$11);
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
   public dip a(coq $$0) {
      csz $$1 = $$0.q();
      hv $$2 = $$0.a();
      ia $$3 = $$0.e().g();
      ia $$4 = b($$1, $$2, $$3);
      if ($$4 == null) {
         return null;
      } else {
         boolean $$5 = !$$0.h();
         djm $$6 = a($$1, $$2, $$4, $$5);
         return $$6 == null ? null : this.o().a(b, $$4).a(c, $$6).a(d, Boolean.valueOf($$1.b_($$2).a() == eea.c));
      }
   }

   @Override
   public edz c_(dip $$0) {
      return $$0.c(d) ? eea.c.a(false) : super.c_($$0);
   }

   @Override
   public elu f(dip $$0, cse $$1, hv $$2) {
      return elr.a();
   }

   @Override
   public elu a(dip $$0, cse $$1, hv $$2, elg $$3) {
      djm $$4 = $$0.c(c);
      elu $$5;
      if ($$4 == djm.a) {
         $$5 = M;
      } else if ($$4 == djm.b) {
         if ($$0.c(b) == ia.a) {
            $$5 = O;
         } else {
            $$5 = N;
         }
      } else if ($$4 == djm.c) {
         $$5 = P;
      } else if ($$4 == djm.d) {
         $$5 = Q;
      } else {
         $$5 = R;
      }

      elb $$11 = $$0.n($$1, $$2);
      return $$5.a($$11.c, 0.0, $$11.e);
   }

   @Override
   public boolean c(dip $$0, cse $$1, hv $$2) {
      return false;
   }

   @Override
   public float at_() {
      return 0.125F;
   }

   @Override
   public void a(csy $$0, hv $$1, cbd $$2) {
      if (!$$2.aU()) {
         $$0.c(1045, $$1, 0);
      }
   }

   @Override
   public bkd a(blf $$0) {
      return $$0.dN().c($$0);
   }

   private static void a(dip $$0, amp $$1, hv $$2) {
      hv.a $$3 = $$2.j();
      dip $$4 = $$0;

      while (n($$4)) {
         cbd $$5 = cbd.a($$1, $$3, $$4);
         if (a($$4, true)) {
            int $$6 = Math.max(1 + $$2.v() - $$3.v(), 6);
            float $$7 = 1.0F * (float)$$6;
            $$5.b($$7, 40);
            break;
         }

         $$3.c(ia.a);
         $$4 = $$1.a_($$3);
      }
   }

   @VisibleForTesting
   public static void c(dip $$0, amp $$1, hv $$2, auf $$3) {
      dip $$4 = $$1.a_($$2.b(1));
      dip $$5 = $$1.a_($$2.b(2));
      if (a($$4, $$5)) {
         hv $$6 = a($$0, $$1, $$2, 7, false);
         if ($$6 != null) {
            dip $$7 = $$1.a_($$6);
            if (h($$7) && b($$7, $$1, $$6)) {
               if ($$3.h()) {
                  a($$1, $$6, ia.a);
               } else {
                  b($$1, $$6);
               }
            }
         }
      }
   }

   private static void b(amp $$0, hv $$1) {
      hv.a $$2 = $$1.j();

      for (int $$3 = 0; $$3 < 10; $$3++) {
         $$2.c(ia.a);
         dip $$4 = $$0.a_($$2);
         if (!$$4.u().c()) {
            return;
         }

         if (a($$4, ia.b) && b($$4, $$0, $$2)) {
            a($$0, $$2, ia.b);
            return;
         }

         if (c($$0, $$2, ia.b) && !$$0.y($$2.d())) {
            a($$0, $$2.d(), ia.b);
            return;
         }

         if (!a((cse)$$0, $$2, $$4)) {
            return;
         }
      }
   }

   private static void a(amp $$0, hv $$1, ia $$2) {
      hv $$3 = $$1.a($$2);
      dip $$4 = $$0.a_($$3);
      if (a($$4, $$2.g())) {
         a($$4, (csz)$$0, $$3);
      } else if ($$4.i() || $$4.a(cwb.G)) {
         a($$0, $$3, $$2, djm.b);
      }
   }

   private static void a(csz $$0, hv $$1, ia $$2, djm $$3) {
      dip $$4 = cwb.st.o().a(b, $$2).a(c, $$3).a(d, Boolean.valueOf($$0.b_($$1).a() == eea.c));
      $$0.a($$1, $$4, 3);
   }

   private static void a(dip $$0, csz $$1, hv $$2) {
      hv $$4;
      hv $$3;
      if ($$0.c(b) == ia.b) {
         $$3 = $$2;
         $$4 = $$2.c();
      } else {
         $$4 = $$2;
         $$3 = $$2.d();
      }

      a($$1, $$4, ia.a, djm.a);
      a($$1, $$3, ia.b, djm.a);
   }

   public static void a(csy $$0, hv $$1, dip $$2) {
      b($$0, $$1, $$2).ifPresent($$3 -> a($$0, $$1, $$2, $$3.b));
   }

   private static void a(csy $$0, hv $$1, dip $$2, edy $$3) {
      elb $$4 = $$2.n($$0, $$1);
      double $$5 = 0.0625;
      double $$6 = (double)$$1.u() + 0.5 + $$4.c;
      double $$7 = (double)((float)($$1.v() + 1) - 0.6875F) - 0.0625;
      double $$8 = (double)$$1.w() + 0.5 + $$4.e;
      edy $$9 = a($$0, $$3);
      jt $$10 = $$9.a(arw.b) ? jv.aI : jv.aK;
      $$0.a($$10, $$6, $$7, $$8, 0.0, 0.0, 0.0);
   }

   @Nullable
   private static hv a(dip $$0, csz $$1, hv $$2, int $$3, boolean $$4) {
      if (a($$0, $$4)) {
         return $$2;
      } else {
         ia $$5 = $$0.c(b);
         BiPredicate<hv, dip> $$6 = ($$1x, $$2x) -> $$2x.a(cwb.st) && $$2x.c(b) == $$5;
         return a($$1, $$2, $$5.f(), $$6, $$1x -> a($$1x, $$4), $$3).orElse(null);
      }
   }

   @Nullable
   private static ia b(ctb $$0, hv $$1, ia $$2) {
      ia $$3;
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

   private static djm a(ctb $$0, hv $$1, ia $$2, boolean $$3) {
      ia $$4 = $$2.g();
      dip $$5 = $$0.a_($$1.a($$2));
      if (b($$5, $$4)) {
         return !$$3 && $$5.c(c) != djm.a ? djm.b : djm.a;
      } else if (!b($$5, $$2)) {
         return djm.b;
      } else {
         djm $$6 = $$5.c(c);
         if ($$6 != djm.b && $$6 != djm.a) {
            dip $$7 = $$0.a_($$1.a($$4));
            return !b($$7, $$2) ? djm.e : djm.d;
         } else {
            return djm.c;
         }
      }
   }

   public static boolean h(dip $$0) {
      return n($$0) && $$0.c(c) == djm.b && !$$0.c(d);
   }

   private static boolean b(dip $$0, amp $$1, hv $$2) {
      ia $$3 = $$0.c(b);
      hv $$4 = $$2.a($$3);
      dip $$5 = $$1.a_($$4);
      if (!$$5.u().c()) {
         return false;
      } else {
         return $$5.i() ? true : a($$5, $$3.g());
      }
   }

   private static Optional<hv> a(csy $$0, hv $$1, dip $$2, int $$3) {
      ia $$4 = $$2.c(b);
      BiPredicate<hv, dip> $$5 = ($$1x, $$2x) -> $$2x.a(cwb.st) && $$2x.c(b) == $$4;
      return a($$0, $$1, $$4.g().f(), $$5, $$0x -> !$$0x.a(cwb.st), $$3);
   }

   private static boolean c(ctb $$0, hv $$1, ia $$2) {
      hv $$3 = $$1.a($$2.g());
      dip $$4 = $$0.a_($$3);
      return $$4.d($$0, $$3, $$2) || b($$4, $$2);
   }

   private static boolean a(dip $$0, boolean $$1) {
      if (!$$0.a(cwb.st)) {
         return false;
      } else {
         djm $$2 = $$0.c(c);
         return $$2 == djm.b || $$1 && $$2 == djm.a;
      }
   }

   private static boolean a(dip $$0, ia $$1) {
      return a($$0, false) && $$0.c(b) == $$1;
   }

   private static boolean n(dip $$0) {
      return b($$0, ia.a);
   }

   private static boolean o(dip $$0) {
      return b($$0, ia.b);
   }

   private static boolean b(dip $$0, ctb $$1, hv $$2) {
      return n($$0) && !$$1.a_($$2.c()).a(cwb.st);
   }

   @Override
   public boolean a(dip $$0, cse $$1, hv $$2, eep $$3) {
      return false;
   }

   private static boolean b(dip $$0, ia $$1) {
      return $$0.a(cwb.st) && $$0.c(b) == $$1;
   }

   @Nullable
   private static hv a(csy $$0, hv $$1, edy $$2) {
      Predicate<dip> $$3 = $$1x -> $$1x.b() instanceof cus && ((cus)$$1x.b()).a($$2);
      BiPredicate<hv, dip> $$4 = ($$1x, $$2x) -> a((cse)$$0, $$1x, $$2x);
      return a($$0, $$1, ia.a.f(), $$4, $$3, 11).orElse(null);
   }

   @Nullable
   public static hv a(csy $$0, hv $$1) {
      BiPredicate<hv, dip> $$2 = ($$1x, $$2x) -> a((cse)$$0, $$1x, $$2x);
      return a($$0, $$1, ia.b.f(), $$2, dbq::h, 11).orElse(null);
   }

   public static edy a(amp $$0, hv $$1) {
      return b($$0, $$1, $$0.a_($$1)).map($$0x -> $$0x.b).filter(dbq::a).orElse(eea.a);
   }

   private static Optional<dbq.a> b(csy $$0, hv $$1, dip $$2) {
      return !n($$2) ? Optional.empty() : a($$0, $$1, $$2, 11).map($$1x -> {
         hv $$2x = $$1x.c();
         dip $$3 = $$0.a_($$2x);
         edy $$4;
         if ($$3.a(cwb.sI) && !$$0.E_().i()) {
            $$4 = eea.c;
         } else {
            $$4 = $$0.b_($$2x).a();
         }

         return new dbq.a($$2x, $$4, $$3);
      });
   }

   private static boolean a(edy $$0) {
      return $$0 == eea.e || $$0 == eea.c;
   }

   private static boolean a(dip $$0, dip $$1) {
      return $$0.a(cwb.su) && $$1.a(cwb.G) && $$1.u().b();
   }

   private static edy a(csy $$0, edy $$1) {
      if ($$1.a(eea.a)) {
         return $$0.E_().i() ? eea.e : eea.c;
      } else {
         return $$1;
      }
   }

   private static Optional<hv> a(csz $$0, hv $$1, ia.b $$2, BiPredicate<hv, dip> $$3, Predicate<dip> $$4, int $$5) {
      ia $$6 = ia.a($$2, ia.a.b);
      hv.a $$7 = $$1.j();

      for (int $$8 = 1; $$8 < $$5; $$8++) {
         $$7.c($$6);
         dip $$9 = $$0.a_($$7);
         if ($$4.test($$9)) {
            return Optional.of($$7.i());
         }

         if ($$0.d($$7.v()) || !$$3.test($$7, $$9)) {
            return Optional.empty();
         }
      }

      return Optional.empty();
   }

   private static boolean a(cse $$0, hv $$1, dip $$2) {
      if ($$2.i()) {
         return true;
      } else if ($$2.i($$0, $$1)) {
         return false;
      } else if (!$$2.u().c()) {
         return false;
      } else {
         elu $$3 = $$2.k($$0, $$1);
         return !elr.c(T, $$3, elf.i);
      }
   }

   static record a(hv a, edy b, dip c) {
   }
}
