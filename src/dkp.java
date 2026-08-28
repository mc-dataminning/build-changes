import com.google.common.annotations.VisibleForTesting;
import com.mojang.serialization.MapCodec;
import java.util.Optional;
import java.util.function.BiPredicate;
import java.util.function.Predicate;
import javax.annotation.Nullable;

public class dkp extends dex implements dhs, dly {
   public static final MapCodec<dkp> a = b(dkp::new);
   public static final dsu b = dsq.bm;
   public static final dsy<dsx> c = dsq.bn;
   public static final dsr d = dsq.C;
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
   private static final ewi M = dex.a(5.0, 0.0, 5.0, 11.0, 16.0, 11.0);
   private static final ewi N = dex.a(5.0, 0.0, 5.0, 11.0, 11.0, 11.0);
   private static final ewi O = dex.a(5.0, 5.0, 5.0, 11.0, 16.0, 11.0);
   private static final ewi P = dex.a(4.0, 0.0, 4.0, 12.0, 16.0, 12.0);
   private static final ewi Q = dex.a(3.0, 0.0, 3.0, 13.0, 16.0, 13.0);
   private static final ewi R = dex.a(2.0, 0.0, 2.0, 14.0, 16.0, 14.0);
   private static final float S = 0.125F;
   private static final ewi T = dex.a(6.0, 0.0, 6.0, 10.0, 16.0, 10.0);

   @Override
   public MapCodec<dkp> a() {
      return a;
   }

   public dkp(drz.d $$0) {
      super($$0);
      this.k(this.E.b().a(b, je.b).a(c, dsx.b).a(d, Boolean.valueOf(false)));
   }

   @Override
   protected void a(dsb.a<dex, dsa> $$0) {
      $$0.a(b, c, d);
   }

   @Override
   protected boolean a(dsa $$0, dbz $$1, iz $$2) {
      return c($$1, $$2, $$0.c(b));
   }

   @Override
   protected dsa a(dsa $$0, je $$1, dsa $$2, dbx $$3, iz $$4, iz $$5) {
      if ($$0.c(d)) {
         $$3.a($$4, enu.c, enu.c.a($$3));
      }

      if ($$1 != je.b && $$1 != je.a) {
         return $$0;
      } else {
         je $$6 = $$0.c(b);
         if ($$6 == je.a && $$3.P().a($$4, this)) {
            return $$0;
         } else if ($$1 == $$6.g() && !this.a($$0, (dbz)$$3, $$4)) {
            if ($$6 == je.a) {
               $$3.a($$4, this, 2);
            } else {
               $$3.a($$4, this, 1);
            }

            return $$0;
         } else {
            boolean $$7 = $$0.c(c) == dsx.a;
            dsx $$8 = a($$3, $$4, $$6, $$7);
            return $$0.a(c, $$8);
         }
      }
   }

   @Override
   protected void a(dbw $$0, dsa $$1, evl $$2, cnn $$3) {
      if (!$$0.B) {
         iz $$4 = $$2.a();
         if ($$3.a($$0, $$4) && $$3.b($$0) && $$3 instanceof coa && $$3.ds().f() > 0.6) {
            $$0.b($$4, true);
         }
      }
   }

   @Override
   public void a(dbw $$0, dsa $$1, iz $$2, bss $$3, float $$4) {
      if ($$1.c(b) == je.b && $$1.c(c) == dsx.b) {
         $$3.a($$4 + 2.0F, 2.0F, $$0.aj().u());
      } else {
         super.a($$0, $$1, $$2, $$3, $$4);
      }
   }

   @Override
   public void a(dsa $$0, dbw $$1, iz $$2, azf $$3) {
      if (m($$0)) {
         float $$4 = $$3.i();
         if (!($$4 > 0.12F)) {
            b($$1, $$2, $$0).filter($$1x -> $$4 < 0.02F || a($$1x.b)).ifPresent($$3x -> a($$1, $$2, $$0, $$3x.b));
         }
      }
   }

   @Override
   protected void a(dsa $$0, are $$1, iz $$2, azf $$3) {
      if (o($$0) && !this.a($$0, (dbz)$$1, $$2)) {
         $$1.b($$2, true);
      } else {
         a($$0, $$1, $$2);
      }
   }

   @Override
   protected void b(dsa $$0, are $$1, iz $$2, azf $$3) {
      a($$0, $$1, $$2, $$3.i());
      if ($$3.i() < 0.011377778F && b($$0, (dbz)$$1, $$2)) {
         c($$0, $$1, $$2, $$3);
      }
   }

   @VisibleForTesting
   public static void a(dsa $$0, are $$1, iz $$2, float $$3) {
      if (!($$3 > 0.17578125F) || !($$3 > 0.05859375F)) {
         if (b($$0, (dbz)$$1, $$2)) {
            Optional<dkp.a> $$4 = b($$1, $$2, $$0);
            if (!$$4.isEmpty()) {
               ens $$5 = $$4.get().b;
               float $$6;
               if ($$5 == enu.c) {
                  $$6 = 0.17578125F;
               } else {
                  if ($$5 != enu.e) {
                     return;
                  }

                  $$6 = 0.05859375F;
               }

               if (!($$3 >= $$6)) {
                  iz $$9 = a($$0, $$1, $$2, 11, false);
                  if ($$9 != null) {
                     if ($$4.get().c.a(dez.sI) && $$5 == enu.c) {
                        dsa $$10 = dez.dR.o();
                        $$1.b($$4.get().a, $$10);
                        dex.a($$4.get().c, $$10, $$1, $$4.get().a);
                        $$1.a(dwt.c, $$4.get().a, dwt.a.a($$10));
                        $$1.c(1504, $$9, 0);
                     } else {
                        iz $$11 = a($$1, $$9, $$5);
                        if ($$11 != null) {
                           $$1.c(1504, $$9, 0);
                           int $$12 = $$9.v() - $$11.v();
                           int $$13 = 50 + $$12;
                           dsa $$14 = $$1.a_($$11);
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
   public dsa a(cxy $$0) {
      dbx $$1 = $$0.q();
      iz $$2 = $$0.a();
      je $$3 = $$0.e().g();
      je $$4 = b($$1, $$2, $$3);
      if ($$4 == null) {
         return null;
      } else {
         boolean $$5 = !$$0.h();
         dsx $$6 = a($$1, $$2, $$4, $$5);
         return $$6 == null ? null : this.o().a(b, $$4).a(c, $$6).a(d, Boolean.valueOf($$1.b_($$2).a() == enu.c));
      }
   }

   @Override
   protected ent b_(dsa $$0) {
      return $$0.c(d) ? enu.c.a(false) : super.b_($$0);
   }

   @Override
   protected ewi f(dsa $$0, dbc $$1, iz $$2) {
      return ewf.a();
   }

   @Override
   protected ewi a(dsa $$0, dbc $$1, iz $$2, evu $$3) {
      dsx $$4 = $$0.c(c);
      ewi $$5;
      if ($$4 == dsx.a) {
         $$5 = M;
      } else if ($$4 == dsx.b) {
         if ($$0.c(b) == je.a) {
            $$5 = O;
         } else {
            $$5 = N;
         }
      } else if ($$4 == dsx.c) {
         $$5 = P;
      } else if ($$4 == dsx.d) {
         $$5 = Q;
      } else {
         $$5 = R;
      }

      evp $$11 = $$0.n($$1, $$2);
      return $$5.a($$11.c, 0.0, $$11.e);
   }

   @Override
   protected boolean c(dsa $$0, dbc $$1, iz $$2) {
      return false;
   }

   @Override
   protected float ar_() {
      return 0.125F;
   }

   @Override
   public void a(dbw $$0, iz $$1, cje $$2) {
      if (!$$2.aW()) {
         $$0.c(1045, $$1, 0);
      }
   }

   @Override
   public brl a(bss $$0) {
      return $$0.dQ().c($$0);
   }

   private static void a(dsa $$0, are $$1, iz $$2) {
      iz.a $$3 = $$2.j();
      dsa $$4 = $$0;

      while (n($$4)) {
         cje $$5 = cje.a($$1, $$3, $$4);
         if (a($$4, true)) {
            int $$6 = Math.max(1 + $$2.v() - $$3.v(), 6);
            float $$7 = 1.0F * (float)$$6;
            $$5.b($$7, 40);
            break;
         }

         $$3.c(je.a);
         $$4 = $$1.a_($$3);
      }
   }

   @VisibleForTesting
   public static void c(dsa $$0, are $$1, iz $$2, azf $$3) {
      dsa $$4 = $$1.a_($$2.b(1));
      dsa $$5 = $$1.a_($$2.b(2));
      if (a($$4, $$5)) {
         iz $$6 = a($$0, $$1, $$2, 7, false);
         if ($$6 != null) {
            dsa $$7 = $$1.a_($$6);
            if (m($$7) && b($$7, $$1, $$6)) {
               if ($$3.h()) {
                  a($$1, $$6, je.a);
               } else {
                  b($$1, $$6);
               }
            }
         }
      }
   }

   private static void b(are $$0, iz $$1) {
      iz.a $$2 = $$1.j();

      for (int $$3 = 0; $$3 < 10; $$3++) {
         $$2.c(je.a);
         dsa $$4 = $$0.a_($$2);
         if (!$$4.u().c()) {
            return;
         }

         if (a($$4, je.b) && b($$4, $$0, $$2)) {
            a($$0, $$2, je.b);
            return;
         }

         if (c($$0, $$2, je.b) && !$$0.z($$2.d())) {
            a($$0, $$2.d(), je.b);
            return;
         }

         if (!a((dbc)$$0, $$2, $$4)) {
            return;
         }
      }
   }

   private static void a(are $$0, iz $$1, je $$2) {
      iz $$3 = $$1.a($$2);
      dsa $$4 = $$0.a_($$3);
      if (a($$4, $$2.g())) {
         a($$4, (dbx)$$0, $$3);
      } else if ($$4.i() || $$4.a(dez.G)) {
         a($$0, $$3, $$2, dsx.b);
      }
   }

   private static void a(dbx $$0, iz $$1, je $$2, dsx $$3) {
      dsa $$4 = dez.st.o().a(b, $$2).a(c, $$3).a(d, Boolean.valueOf($$0.b_($$1).a() == enu.c));
      $$0.a($$1, $$4, 3);
   }

   private static void a(dsa $$0, dbx $$1, iz $$2) {
      iz $$4;
      iz $$3;
      if ($$0.c(b) == je.b) {
         $$3 = $$2;
         $$4 = $$2.c();
      } else {
         $$4 = $$2;
         $$3 = $$2.d();
      }

      a($$1, $$4, je.a, dsx.a);
      a($$1, $$3, je.b, dsx.a);
   }

   public static void a(dbw $$0, iz $$1, dsa $$2) {
      b($$0, $$1, $$2).ifPresent($$3 -> a($$0, $$1, $$2, $$3.b));
   }

   private static void a(dbw $$0, iz $$1, dsa $$2, ens $$3) {
      evp $$4 = $$2.n($$0, $$1);
      double $$5 = 0.0625;
      double $$6 = (double)$$1.u() + 0.5 + $$4.c;
      double $$7 = (double)((float)($$1.v() + 1) - 0.6875F) - 0.0625;
      double $$8 = (double)$$1.w() + 0.5 + $$4.e;
      ens $$9 = a($$0, $$3);
      lg $$10 = $$9.a(awu.b) ? li.aL : li.aN;
      $$0.a($$10, $$6, $$7, $$8, 0.0, 0.0, 0.0);
   }

   @Nullable
   private static iz a(dsa $$0, dbx $$1, iz $$2, int $$3, boolean $$4) {
      if (a($$0, $$4)) {
         return $$2;
      } else {
         je $$5 = $$0.c(b);
         BiPredicate<iz, dsa> $$6 = ($$1x, $$2x) -> $$2x.a(dez.st) && $$2x.c(b) == $$5;
         return a($$1, $$2, $$5.f(), $$6, $$1x -> a($$1x, $$4), $$3).orElse(null);
      }
   }

   @Nullable
   private static je b(dbz $$0, iz $$1, je $$2) {
      je $$3;
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

   private static dsx a(dbz $$0, iz $$1, je $$2, boolean $$3) {
      je $$4 = $$2.g();
      dsa $$5 = $$0.a_($$1.a($$2));
      if (b($$5, $$4)) {
         return !$$3 && $$5.c(c) != dsx.a ? dsx.b : dsx.a;
      } else if (!b($$5, $$2)) {
         return dsx.b;
      } else {
         dsx $$6 = $$5.c(c);
         if ($$6 != dsx.b && $$6 != dsx.a) {
            dsa $$7 = $$0.a_($$1.a($$4));
            return !b($$7, $$2) ? dsx.e : dsx.d;
         } else {
            return dsx.c;
         }
      }
   }

   public static boolean m(dsa $$0) {
      return n($$0) && $$0.c(c) == dsx.b && !$$0.c(d);
   }

   private static boolean b(dsa $$0, are $$1, iz $$2) {
      je $$3 = $$0.c(b);
      iz $$4 = $$2.a($$3);
      dsa $$5 = $$1.a_($$4);
      if (!$$5.u().c()) {
         return false;
      } else {
         return $$5.i() ? true : a($$5, $$3.g());
      }
   }

   private static Optional<iz> a(dbw $$0, iz $$1, dsa $$2, int $$3) {
      je $$4 = $$2.c(b);
      BiPredicate<iz, dsa> $$5 = ($$1x, $$2x) -> $$2x.a(dez.st) && $$2x.c(b) == $$4;
      return a($$0, $$1, $$4.g().f(), $$5, $$0x -> !$$0x.a(dez.st), $$3);
   }

   private static boolean c(dbz $$0, iz $$1, je $$2) {
      iz $$3 = $$1.a($$2.g());
      dsa $$4 = $$0.a_($$3);
      return $$4.d($$0, $$3, $$2) || b($$4, $$2);
   }

   private static boolean a(dsa $$0, boolean $$1) {
      if (!$$0.a(dez.st)) {
         return false;
      } else {
         dsx $$2 = $$0.c(c);
         return $$2 == dsx.b || $$1 && $$2 == dsx.a;
      }
   }

   private static boolean a(dsa $$0, je $$1) {
      return a($$0, false) && $$0.c(b) == $$1;
   }

   private static boolean n(dsa $$0) {
      return b($$0, je.a);
   }

   private static boolean o(dsa $$0) {
      return b($$0, je.b);
   }

   private static boolean b(dsa $$0, dbz $$1, iz $$2) {
      return n($$0) && !$$1.a_($$2.c()).a(dez.st);
   }

   @Override
   protected boolean a(dsa $$0, eoi $$1) {
      return false;
   }

   private static boolean b(dsa $$0, je $$1) {
      return $$0.a(dez.st) && $$0.c(b) == $$1;
   }

   @Nullable
   private static iz a(dbw $$0, iz $$1, ens $$2) {
      Predicate<dsa> $$3 = $$1x -> $$1x.b() instanceof ddq && ((ddq)$$1x.b()).a($$2);
      BiPredicate<iz, dsa> $$4 = ($$1x, $$2x) -> a((dbc)$$0, $$1x, $$2x);
      return a($$0, $$1, je.a.f(), $$4, $$3, 11).orElse(null);
   }

   @Nullable
   public static iz a(dbw $$0, iz $$1) {
      BiPredicate<iz, dsa> $$2 = ($$1x, $$2x) -> a((dbc)$$0, $$1x, $$2x);
      return a($$0, $$1, je.b.f(), $$2, dkp::m, 11).orElse(null);
   }

   public static ens a(are $$0, iz $$1) {
      return b($$0, $$1, $$0.a_($$1)).map($$0x -> $$0x.b).filter(dkp::a).orElse(enu.a);
   }

   private static Optional<dkp.a> b(dbw $$0, iz $$1, dsa $$2) {
      return !n($$2) ? Optional.empty() : a($$0, $$1, $$2, 11).map($$1x -> {
         iz $$2x = $$1x.c();
         dsa $$3 = $$0.a_($$2x);
         ens $$4;
         if ($$3.a(dez.sI) && !$$0.D_().i()) {
            $$4 = enu.c;
         } else {
            $$4 = $$0.b_($$2x).a();
         }

         return new dkp.a($$2x, $$4, $$3);
      });
   }

   private static boolean a(ens $$0) {
      return $$0 == enu.e || $$0 == enu.c;
   }

   private static boolean a(dsa $$0, dsa $$1) {
      return $$0.a(dez.su) && $$1.a(dez.G) && $$1.u().b();
   }

   private static ens a(dbw $$0, ens $$1) {
      if ($$1.a(enu.a)) {
         return $$0.D_().i() ? enu.e : enu.c;
      } else {
         return $$1;
      }
   }

   private static Optional<iz> a(dbx $$0, iz $$1, je.b $$2, BiPredicate<iz, dsa> $$3, Predicate<dsa> $$4, int $$5) {
      je $$6 = je.a($$2, je.a.b);
      iz.a $$7 = $$1.j();

      for (int $$8 = 1; $$8 < $$5; $$8++) {
         $$7.c($$6);
         dsa $$9 = $$0.a_($$7);
         if ($$4.test($$9)) {
            return Optional.of($$7.i());
         }

         if ($$0.d($$7.v()) || !$$3.test($$7, $$9)) {
            return Optional.empty();
         }
      }

      return Optional.empty();
   }

   private static boolean a(dbc $$0, iz $$1, dsa $$2) {
      if ($$2.i()) {
         return true;
      } else if ($$2.i($$0, $$1)) {
         return false;
      } else if (!$$2.u().c()) {
         return false;
      } else {
         ewi $$3 = $$2.k($$0, $$1);
         return !ewf.c(T, $$3, evt.i);
      }
   }

   static record a(iz a, ens b, dsa c) {
   }
}
