import com.google.common.annotations.VisibleForTesting;
import com.mojang.serialization.MapCodec;
import java.util.Optional;
import java.util.function.BiPredicate;
import java.util.function.Predicate;
import javax.annotation.Nullable;

public class dca extends cwj implements cze, ddj {
   public static final MapCodec<dca> a = b(dca::new);
   public static final dju b = djq.bm;
   public static final djy<djx> c = djq.bn;
   public static final djr d = djq.C;
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
   private static final emf M = cwj.a(5.0, 0.0, 5.0, 11.0, 16.0, 11.0);
   private static final emf N = cwj.a(5.0, 0.0, 5.0, 11.0, 11.0, 11.0);
   private static final emf O = cwj.a(5.0, 5.0, 5.0, 11.0, 16.0, 11.0);
   private static final emf P = cwj.a(4.0, 0.0, 4.0, 12.0, 16.0, 12.0);
   private static final emf Q = cwj.a(3.0, 0.0, 3.0, 13.0, 16.0, 13.0);
   private static final emf R = cwj.a(2.0, 0.0, 2.0, 14.0, 16.0, 14.0);
   private static final float S = 0.125F;
   private static final emf T = cwj.a(6.0, 0.0, 6.0, 10.0, 16.0, 10.0);

   @Override
   public MapCodec<dca> a() {
      return a;
   }

   public dca(diz.d $$0) {
      super($$0);
      this.k(this.E.b().a(b, ic.b).a(c, djx.b).a(d, Boolean.valueOf(false)));
   }

   @Override
   protected void a(djb.a<cwj, dja> $$0) {
      $$0.a(b, c, d);
   }

   @Override
   public boolean a(dja $$0, ctl $$1, hx $$2) {
      return c($$1, $$2, $$0.c(b));
   }

   @Override
   public dja a(dja $$0, ic $$1, dja $$2, ctj $$3, hx $$4, hx $$5) {
      if ($$0.c(d)) {
         $$3.a($$4, eel.c, eel.c.a($$3));
      }

      if ($$1 != ic.b && $$1 != ic.a) {
         return $$0;
      } else {
         ic $$6 = $$0.c(b);
         if ($$6 == ic.a && $$3.N().a($$4, this)) {
            return $$0;
         } else if ($$1 == $$6.g() && !this.a($$0, (ctl)$$3, $$4)) {
            if ($$6 == ic.a) {
               $$3.a($$4, this, 2);
            } else {
               $$3.a($$4, this, 1);
            }

            return $$0;
         } else {
            boolean $$7 = $$0.c(c) == djx.a;
            djx $$8 = a($$3, $$4, $$6, $$7);
            return $$0.a(c, $$8);
         }
      }
   }

   @Override
   public void a(cti $$0, dja $$1, eli $$2, cft $$3) {
      hx $$4 = $$2.a();
      if (!$$0.B && $$3.a($$0, $$4) && $$3.b($$0) && $$3 instanceof cgf && $$3.dp().f() > 0.6) {
         $$0.b($$4, true);
      }
   }

   @Override
   public void a(cti $$0, dja $$1, hx $$2, blp $$3, float $$4) {
      if ($$1.c(b) == ic.b && $$1.c(c) == djx.b) {
         $$3.a($$4 + 2.0F, 2.0F, $$0.ai().u());
      } else {
         super.a($$0, $$1, $$2, $$3, $$4);
      }
   }

   @Override
   public void a(dja $$0, cti $$1, hx $$2, aup $$3) {
      if (h($$0)) {
         float $$4 = $$3.i();
         if (!($$4 > 0.12F)) {
            b($$1, $$2, $$0).filter($$1x -> $$4 < 0.02F || a($$1x.b)).ifPresent($$3x -> a($$1, $$2, $$0, $$3x.b));
         }
      }
   }

   @Override
   public void a(dja $$0, amz $$1, hx $$2, aup $$3) {
      if (o($$0) && !this.a($$0, (ctl)$$1, $$2)) {
         $$1.b($$2, true);
      } else {
         a($$0, $$1, $$2);
      }
   }

   @Override
   public void b(dja $$0, amz $$1, hx $$2, aup $$3) {
      a($$0, $$1, $$2, $$3.i());
      if ($$3.i() < 0.011377778F && b($$0, (ctl)$$1, $$2)) {
         c($$0, $$1, $$2, $$3);
      }
   }

   @VisibleForTesting
   public static void a(dja $$0, amz $$1, hx $$2, float $$3) {
      if (!($$3 > 0.17578125F) || !($$3 > 0.05859375F)) {
         if (b($$0, (ctl)$$1, $$2)) {
            Optional<dca.a> $$4 = b($$1, $$2, $$0);
            if (!$$4.isEmpty()) {
               eej $$5 = $$4.get().b;
               float $$6;
               if ($$5 == eel.c) {
                  $$6 = 0.17578125F;
               } else {
                  if ($$5 != eel.e) {
                     return;
                  }

                  $$6 = 0.05859375F;
               }

               if (!($$3 >= $$6)) {
                  hx $$9 = a($$0, $$1, $$2, 11, false);
                  if ($$9 != null) {
                     if ($$4.get().c.a(cwl.sI) && $$5 == eel.c) {
                        dja $$10 = cwl.dR.o();
                        $$1.b($$4.get().a, $$10);
                        cwj.a($$4.get().c, $$10, $$1, $$4.get().a);
                        $$1.a(dnk.c, $$4.get().a, dnk.a.a($$10));
                        $$1.c(1504, $$9, 0);
                     } else {
                        hx $$11 = a($$1, $$9, $$5);
                        if ($$11 != null) {
                           $$1.c(1504, $$9, 0);
                           int $$12 = $$9.v() - $$11.v();
                           int $$13 = 50 + $$12;
                           dja $$14 = $$1.a_($$11);
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
   public dja a(cpa $$0) {
      ctj $$1 = $$0.q();
      hx $$2 = $$0.a();
      ic $$3 = $$0.e().g();
      ic $$4 = b($$1, $$2, $$3);
      if ($$4 == null) {
         return null;
      } else {
         boolean $$5 = !$$0.h();
         djx $$6 = a($$1, $$2, $$4, $$5);
         return $$6 == null ? null : this.o().a(b, $$4).a(c, $$6).a(d, Boolean.valueOf($$1.b_($$2).a() == eel.c));
      }
   }

   @Override
   public eek c_(dja $$0) {
      return $$0.c(d) ? eel.c.a(false) : super.c_($$0);
   }

   @Override
   public emf f(dja $$0, cso $$1, hx $$2) {
      return emc.a();
   }

   @Override
   public emf a(dja $$0, cso $$1, hx $$2, elr $$3) {
      djx $$4 = $$0.c(c);
      emf $$5;
      if ($$4 == djx.a) {
         $$5 = M;
      } else if ($$4 == djx.b) {
         if ($$0.c(b) == ic.a) {
            $$5 = O;
         } else {
            $$5 = N;
         }
      } else if ($$4 == djx.c) {
         $$5 = P;
      } else if ($$4 == djx.d) {
         $$5 = Q;
      } else {
         $$5 = R;
      }

      elm $$11 = $$0.n($$1, $$2);
      return $$5.a($$11.c, 0.0, $$11.e);
   }

   @Override
   public boolean c(dja $$0, cso $$1, hx $$2) {
      return false;
   }

   @Override
   public float at_() {
      return 0.125F;
   }

   @Override
   public void a(cti $$0, hx $$1, cbn $$2) {
      if (!$$2.aU()) {
         $$0.c(1045, $$1, 0);
      }
   }

   @Override
   public bkn a(blp $$0) {
      return $$0.dN().c($$0);
   }

   private static void a(dja $$0, amz $$1, hx $$2) {
      hx.a $$3 = $$2.j();
      dja $$4 = $$0;

      while (n($$4)) {
         cbn $$5 = cbn.a($$1, $$3, $$4);
         if (a($$4, true)) {
            int $$6 = Math.max(1 + $$2.v() - $$3.v(), 6);
            float $$7 = 1.0F * (float)$$6;
            $$5.b($$7, 40);
            break;
         }

         $$3.c(ic.a);
         $$4 = $$1.a_($$3);
      }
   }

   @VisibleForTesting
   public static void c(dja $$0, amz $$1, hx $$2, aup $$3) {
      dja $$4 = $$1.a_($$2.b(1));
      dja $$5 = $$1.a_($$2.b(2));
      if (a($$4, $$5)) {
         hx $$6 = a($$0, $$1, $$2, 7, false);
         if ($$6 != null) {
            dja $$7 = $$1.a_($$6);
            if (h($$7) && b($$7, $$1, $$6)) {
               if ($$3.h()) {
                  a($$1, $$6, ic.a);
               } else {
                  b($$1, $$6);
               }
            }
         }
      }
   }

   private static void b(amz $$0, hx $$1) {
      hx.a $$2 = $$1.j();

      for (int $$3 = 0; $$3 < 10; $$3++) {
         $$2.c(ic.a);
         dja $$4 = $$0.a_($$2);
         if (!$$4.u().c()) {
            return;
         }

         if (a($$4, ic.b) && b($$4, $$0, $$2)) {
            a($$0, $$2, ic.b);
            return;
         }

         if (c($$0, $$2, ic.b) && !$$0.z($$2.d())) {
            a($$0, $$2.d(), ic.b);
            return;
         }

         if (!a((cso)$$0, $$2, $$4)) {
            return;
         }
      }
   }

   private static void a(amz $$0, hx $$1, ic $$2) {
      hx $$3 = $$1.a($$2);
      dja $$4 = $$0.a_($$3);
      if (a($$4, $$2.g())) {
         a($$4, (ctj)$$0, $$3);
      } else if ($$4.i() || $$4.a(cwl.G)) {
         a($$0, $$3, $$2, djx.b);
      }
   }

   private static void a(ctj $$0, hx $$1, ic $$2, djx $$3) {
      dja $$4 = cwl.st.o().a(b, $$2).a(c, $$3).a(d, Boolean.valueOf($$0.b_($$1).a() == eel.c));
      $$0.a($$1, $$4, 3);
   }

   private static void a(dja $$0, ctj $$1, hx $$2) {
      hx $$4;
      hx $$3;
      if ($$0.c(b) == ic.b) {
         $$3 = $$2;
         $$4 = $$2.c();
      } else {
         $$4 = $$2;
         $$3 = $$2.d();
      }

      a($$1, $$4, ic.a, djx.a);
      a($$1, $$3, ic.b, djx.a);
   }

   public static void a(cti $$0, hx $$1, dja $$2) {
      b($$0, $$1, $$2).ifPresent($$3 -> a($$0, $$1, $$2, $$3.b));
   }

   private static void a(cti $$0, hx $$1, dja $$2, eej $$3) {
      elm $$4 = $$2.n($$0, $$1);
      double $$5 = 0.0625;
      double $$6 = (double)$$1.u() + 0.5 + $$4.c;
      double $$7 = (double)((float)($$1.v() + 1) - 0.6875F) - 0.0625;
      double $$8 = (double)$$1.w() + 0.5 + $$4.e;
      eej $$9 = a($$0, $$3);
      jv $$10 = $$9.a(asg.b) ? jx.aI : jx.aK;
      $$0.a($$10, $$6, $$7, $$8, 0.0, 0.0, 0.0);
   }

   @Nullable
   private static hx a(dja $$0, ctj $$1, hx $$2, int $$3, boolean $$4) {
      if (a($$0, $$4)) {
         return $$2;
      } else {
         ic $$5 = $$0.c(b);
         BiPredicate<hx, dja> $$6 = ($$1x, $$2x) -> $$2x.a(cwl.st) && $$2x.c(b) == $$5;
         return a($$1, $$2, $$5.f(), $$6, $$1x -> a($$1x, $$4), $$3).orElse(null);
      }
   }

   @Nullable
   private static ic b(ctl $$0, hx $$1, ic $$2) {
      ic $$3;
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

   private static djx a(ctl $$0, hx $$1, ic $$2, boolean $$3) {
      ic $$4 = $$2.g();
      dja $$5 = $$0.a_($$1.a($$2));
      if (b($$5, $$4)) {
         return !$$3 && $$5.c(c) != djx.a ? djx.b : djx.a;
      } else if (!b($$5, $$2)) {
         return djx.b;
      } else {
         djx $$6 = $$5.c(c);
         if ($$6 != djx.b && $$6 != djx.a) {
            dja $$7 = $$0.a_($$1.a($$4));
            return !b($$7, $$2) ? djx.e : djx.d;
         } else {
            return djx.c;
         }
      }
   }

   public static boolean h(dja $$0) {
      return n($$0) && $$0.c(c) == djx.b && !$$0.c(d);
   }

   private static boolean b(dja $$0, amz $$1, hx $$2) {
      ic $$3 = $$0.c(b);
      hx $$4 = $$2.a($$3);
      dja $$5 = $$1.a_($$4);
      if (!$$5.u().c()) {
         return false;
      } else {
         return $$5.i() ? true : a($$5, $$3.g());
      }
   }

   private static Optional<hx> a(cti $$0, hx $$1, dja $$2, int $$3) {
      ic $$4 = $$2.c(b);
      BiPredicate<hx, dja> $$5 = ($$1x, $$2x) -> $$2x.a(cwl.st) && $$2x.c(b) == $$4;
      return a($$0, $$1, $$4.g().f(), $$5, $$0x -> !$$0x.a(cwl.st), $$3);
   }

   private static boolean c(ctl $$0, hx $$1, ic $$2) {
      hx $$3 = $$1.a($$2.g());
      dja $$4 = $$0.a_($$3);
      return $$4.d($$0, $$3, $$2) || b($$4, $$2);
   }

   private static boolean a(dja $$0, boolean $$1) {
      if (!$$0.a(cwl.st)) {
         return false;
      } else {
         djx $$2 = $$0.c(c);
         return $$2 == djx.b || $$1 && $$2 == djx.a;
      }
   }

   private static boolean a(dja $$0, ic $$1) {
      return a($$0, false) && $$0.c(b) == $$1;
   }

   private static boolean n(dja $$0) {
      return b($$0, ic.a);
   }

   private static boolean o(dja $$0) {
      return b($$0, ic.b);
   }

   private static boolean b(dja $$0, ctl $$1, hx $$2) {
      return n($$0) && !$$1.a_($$2.c()).a(cwl.st);
   }

   @Override
   public boolean a(dja $$0, cso $$1, hx $$2, efa $$3) {
      return false;
   }

   private static boolean b(dja $$0, ic $$1) {
      return $$0.a(cwl.st) && $$0.c(b) == $$1;
   }

   @Nullable
   private static hx a(cti $$0, hx $$1, eej $$2) {
      Predicate<dja> $$3 = $$1x -> $$1x.b() instanceof cvc && ((cvc)$$1x.b()).a($$2);
      BiPredicate<hx, dja> $$4 = ($$1x, $$2x) -> a((cso)$$0, $$1x, $$2x);
      return a($$0, $$1, ic.a.f(), $$4, $$3, 11).orElse(null);
   }

   @Nullable
   public static hx a(cti $$0, hx $$1) {
      BiPredicate<hx, dja> $$2 = ($$1x, $$2x) -> a((cso)$$0, $$1x, $$2x);
      return a($$0, $$1, ic.b.f(), $$2, dca::h, 11).orElse(null);
   }

   public static eej a(amz $$0, hx $$1) {
      return b($$0, $$1, $$0.a_($$1)).map($$0x -> $$0x.b).filter(dca::a).orElse(eel.a);
   }

   private static Optional<dca.a> b(cti $$0, hx $$1, dja $$2) {
      return !n($$2) ? Optional.empty() : a($$0, $$1, $$2, 11).map($$1x -> {
         hx $$2x = $$1x.c();
         dja $$3 = $$0.a_($$2x);
         eej $$4;
         if ($$3.a(cwl.sI) && !$$0.E_().i()) {
            $$4 = eel.c;
         } else {
            $$4 = $$0.b_($$2x).a();
         }

         return new dca.a($$2x, $$4, $$3);
      });
   }

   private static boolean a(eej $$0) {
      return $$0 == eel.e || $$0 == eel.c;
   }

   private static boolean a(dja $$0, dja $$1) {
      return $$0.a(cwl.su) && $$1.a(cwl.G) && $$1.u().b();
   }

   private static eej a(cti $$0, eej $$1) {
      if ($$1.a(eel.a)) {
         return $$0.E_().i() ? eel.e : eel.c;
      } else {
         return $$1;
      }
   }

   private static Optional<hx> a(ctj $$0, hx $$1, ic.b $$2, BiPredicate<hx, dja> $$3, Predicate<dja> $$4, int $$5) {
      ic $$6 = ic.a($$2, ic.a.b);
      hx.a $$7 = $$1.j();

      for (int $$8 = 1; $$8 < $$5; $$8++) {
         $$7.c($$6);
         dja $$9 = $$0.a_($$7);
         if ($$4.test($$9)) {
            return Optional.of($$7.i());
         }

         if ($$0.d($$7.v()) || !$$3.test($$7, $$9)) {
            return Optional.empty();
         }
      }

      return Optional.empty();
   }

   private static boolean a(cso $$0, hx $$1, dja $$2) {
      if ($$2.i()) {
         return true;
      } else if ($$2.i($$0, $$1)) {
         return false;
      } else if (!$$2.u().c()) {
         return false;
      } else {
         emf $$3 = $$2.k($$0, $$1);
         return !emc.c(T, $$3, elq.i);
      }
   }

   static record a(hx a, eej b, dja c) {
   }
}
