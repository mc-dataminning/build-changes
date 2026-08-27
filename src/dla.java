import com.google.common.annotations.VisibleForTesting;
import com.mojang.serialization.Codec;
import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.Optional;
import java.util.function.BiPredicate;
import java.util.function.Predicate;
import javax.annotation.Nullable;

public class dla extends dfc implements dia, dmr {
   public static final MapCodec<dla> a = RecordCodecBuilder.mapCodec(
      $$0 -> $$0.group(Codec.BOOL.fieldOf("organic").forGetter($$0x -> $$0x.U), u()).apply($$0, dla::new)
   );
   public static final dtw b = dts.bm;
   public static final dua<dtz> c = dts.bn;
   public static final dtt d = dts.C;
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
   private static final exn M = dfc.a(5.0, 0.0, 5.0, 11.0, 16.0, 11.0);
   private static final exn N = dfc.a(5.0, 0.0, 5.0, 11.0, 11.0, 11.0);
   private static final exn O = dfc.a(5.0, 5.0, 5.0, 11.0, 16.0, 11.0);
   private static final exn P = dfc.a(4.0, 0.0, 4.0, 12.0, 16.0, 12.0);
   private static final exn Q = dfc.a(3.0, 0.0, 3.0, 13.0, 16.0, 13.0);
   private static final exn R = dfc.a(2.0, 0.0, 2.0, 14.0, 16.0, 14.0);
   private static final float S = 0.125F;
   private static final exn T = dfc.a(6.0, 0.0, 6.0, 10.0, 16.0, 10.0);
   private final boolean U;

   public boolean m(dtc $$0) {
      return this.U ? $$0.a(awe.cD) : $$0.a(dfe.tR);
   }

   @Override
   public MapCodec<dla> a() {
      return a;
   }

   public dla(boolean $$0, dtb.d $$1) {
      super($$1);
      this.U = $$0;
      this.k(this.E.b().a(b, iw.b).a(c, dtz.b).a(d, Boolean.valueOf(false)));
   }

   @Override
   protected void a(dtd.a<dfc, dtc> $$0) {
      $$0.a(b, c, d);
   }

   @Override
   protected boolean a(dtc $$0, dcd $$1, ir $$2) {
      return this.c($$1, $$2, $$0.c(b));
   }

   public dfc c() {
      return this.U ? dfe.n : dfe.tR;
   }

   @Override
   protected dtc a(dtc $$0, iw $$1, dtc $$2, dcb $$3, ir $$4, ir $$5) {
      if ($$0.c(d)) {
         $$3.a($$4, epf.c, epf.c.a($$3));
      }

      if ($$1 != iw.b && $$1 != iw.a) {
         return $$0;
      } else {
         iw $$6 = $$0.c(b);
         if ($$6 == iw.a && $$3.P().a($$4, this)) {
            return $$0;
         } else if ($$1 == $$6.g() && !this.a($$0, (dcd)$$3, $$4)) {
            if ($$6 == iw.a) {
               $$3.a($$4, this, 2);
            } else {
               $$3.a($$4, this, 1);
            }

            return $$0;
         } else {
            boolean $$7 = $$0.c(c) == dtz.a;
            dtz $$8 = this.a($$3, $$4, $$6, $$7);
            return $$0.a(c, $$8);
         }
      }
   }

   @Override
   protected void a(dca $$0, dtc $$1, ewq $$2, cms $$3) {
      if (!$$0.C) {
         ir $$4 = $$2.a();
         if ($$3.a($$0, $$4) && $$3.b($$0) && $$3 instanceof cnf && $$3.dx().f() > 0.6) {
            $$0.b($$4, true);
         }
      }
   }

   @Override
   public void a(dca $$0, dtc $$1, ir $$2, brv $$3, float $$4) {
      if ($$1.c(b) == iw.b && $$1.c(c) == dtz.b) {
         $$3.a($$4 + 2.0F, 2.0F, $$0.aj().w());
      } else {
         super.a($$0, $$1, $$2, $$3, $$4);
      }
   }

   @Override
   public void a(dtc $$0, dca $$1, ir $$2, ayt $$3) {
      if (this.n($$0)) {
         float $$4 = $$3.i();
         if (!($$4 > 0.12F)) {
            this.b($$1, $$2, $$0).filter($$1x -> $$4 < 0.02F || a($$1x.b)).ifPresent($$3x -> a($$1, $$2, $$0, $$3x.b));
         }
      }
   }

   @Override
   protected void a(dtc $$0, aqt $$1, ir $$2, ayt $$3) {
      if (this.p($$0) && !this.a($$0, (dcd)$$1, $$2)) {
         $$1.b($$2, true);
      } else {
         this.a($$0, $$1, $$2);
      }
   }

   @Override
   protected void b(dtc $$0, aqt $$1, ir $$2, ayt $$3) {
      this.a($$0, $$1, $$2, $$3.i());
      float $$4 = 0.011377778F;
      if (this.U) {
         $$4 = 0.2F;
      }

      if ($$3.i() < $$4) {
         if (this.U) {
            this.a($$1, $$2);
            this.b($$1, $$2);
         } else if (this.b($$0, (dcd)$$1, $$2)) {
            this.c($$0, $$1, $$2, $$3);
         }
      }
   }

   @VisibleForTesting
   public void a(dtc $$0, aqt $$1, ir $$2, float $$3) {
      if (!($$3 > 0.17578125F) || !($$3 > 0.05859375F)) {
         if (this.b($$0, (dcd)$$1, $$2)) {
            Optional<dla.a> $$4 = this.b($$1, $$2, $$0);
            if (!$$4.isEmpty()) {
               epd $$5 = $$4.get().b;
               float $$6;
               if ($$5 == epf.c) {
                  $$6 = 0.17578125F;
               } else {
                  if ($$5 != epf.e) {
                     return;
                  }

                  $$6 = 0.05859375F;
               }

               if (!($$3 >= $$6)) {
                  ir $$9 = this.a($$0, $$1, $$2, 11, false);
                  if ($$9 != null) {
                     if ($$4.get().c.a(dfe.uf) && $$5 == epf.c) {
                        dtc $$10 = dfe.eF.n();
                        $$1.b($$4.get().a, $$10);
                        dfc.a($$4.get().c, $$10, $$1, $$4.get().a);
                        $$1.a(dxv.c, $$4.get().a, dxv.a.a($$10));
                        $$1.c(1504, $$9, 0);
                     } else {
                        ir $$11 = a($$1, $$9, $$5);
                        if ($$11 != null) {
                           $$1.c(1504, $$9, 0);
                           int $$12 = $$9.v() - $$11.v();
                           int $$13 = 50 + $$12;
                           dtc $$14 = $$1.a_($$11);
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
   public dtc a(cyd $$0) {
      dcb $$1 = $$0.q();
      ir $$2 = $$0.a();
      iw $$3 = $$0.e().g();
      iw $$4 = this.b($$1, $$2, $$3);
      if ($$4 == null) {
         return null;
      } else {
         boolean $$5 = !$$0.h();
         dtz $$6 = this.a($$1, $$2, $$4, $$5);
         return $$6 == null ? null : this.n().a(b, $$4).a(c, $$6).a(d, Boolean.valueOf($$1.b_($$2).a() == epf.c));
      }
   }

   @Override
   protected epe b_(dtc $$0) {
      return $$0.c(d) ? epf.c.a(false) : super.b_($$0);
   }

   @Override
   protected exn g(dtc $$0, dbg $$1, ir $$2) {
      return exk.a();
   }

   @Override
   protected exn a(dtc $$0, dbg $$1, ir $$2, ewz $$3) {
      dtz $$4 = $$0.c(c);
      exn $$5;
      if ($$4 == dtz.a) {
         $$5 = M;
      } else if ($$4 == dtz.b) {
         if ($$0.c(b) == iw.a) {
            $$5 = O;
         } else {
            $$5 = N;
         }
      } else if ($$4 == dtz.c) {
         $$5 = P;
      } else if ($$4 == dtz.d) {
         $$5 = Q;
      } else {
         $$5 = R;
      }

      ewu $$11 = $$0.n($$1, $$2);
      return $$5.a($$11.c, 0.0, $$11.e);
   }

   @Override
   protected boolean c(dtc $$0, dbg $$1, ir $$2) {
      return false;
   }

   @Override
   protected float at_() {
      return 0.125F;
   }

   @Override
   public void a(dca $$0, ir $$1, cif $$2) {
      if (!$$2.ba()) {
         $$0.c(1045, $$1, 0);
      }
   }

   @Override
   public bqt a(brv $$0) {
      return $$0.dX().c($$0);
   }

   private void a(dtc $$0, aqt $$1, ir $$2) {
      ir.a $$3 = $$2.j();
      dtc $$4 = $$0;

      while (this.o($$4)) {
         cif $$5 = cif.a($$1, $$3, $$4);
         if (this.a($$4, true)) {
            int $$6 = Math.max(1 + $$2.v() - $$3.v(), 6);
            float $$7 = 1.0F * (float)$$6;
            $$5.b($$7, 40);
            break;
         }

         $$3.d(iw.a);
         $$4 = $$1.a_($$3);
      }
   }

   @VisibleForTesting
   public void c(dtc $$0, aqt $$1, ir $$2, ayt $$3) {
      dtc $$4 = $$1.a_($$2.b(1));
      dtc $$5 = $$1.a_($$2.b(2));
      if (this.a($$4, $$5)) {
         ir $$6 = this.a($$0, $$1, $$2, 7, false);
         if ($$6 != null) {
            dtc $$7 = $$1.a_($$6);
            if (this.n($$7) && this.b($$7, $$1, $$6)) {
               if ($$3.h()) {
                  this.a($$1, $$6, iw.a);
               } else {
                  this.d($$1, $$6);
               }
            }
         }
      }
   }

   public void a(aqt $$0, ir $$1) {
      ir.a $$2 = $$1.j();

      for (int $$3 = 0; $$3 < 3; $$3++) {
         dtc $$4 = $$0.a_($$2);
         if (this.a($$4, iw.b) && !$$0.a_($$2.b(0, -24, 0)).a(this)) {
            this.a($$0, $$2, iw.b);
            return;
         }

         $$2.d(iw.b);
      }
   }

   public void b(aqt $$0, ir $$1) {
      ir.a $$2 = $$1.j();

      for (int $$3 = 0; $$3 < 3; $$3++) {
         dtc $$4 = $$0.a_($$2);
         if (this.a($$4, iw.a) && !$$0.a_($$2.b(0, 24, 0)).a(this)) {
            this.a($$0, $$2, iw.a);
            return;
         }

         $$2.d(iw.a);
      }
   }

   private void d(aqt $$0, ir $$1) {
      ir.a $$2 = $$1.j();

      for (int $$3 = 0; $$3 < 10; $$3++) {
         $$2.d(iw.a);
         dtc $$4 = $$0.a_($$2);
         if (!$$4.u().c()) {
            return;
         }

         if (this.a($$4, iw.b) && this.b($$4, $$0, $$2)) {
            this.a($$0, $$2, iw.b);
            return;
         }

         if (this.c($$0, $$2, iw.b) && !$$0.z($$2.d())) {
            this.a($$0, $$2.d(), iw.b);
            return;
         }

         if (!a((dbg)$$0, $$2, $$4)) {
            return;
         }
      }
   }

   private void a(aqt $$0, ir $$1, iw $$2) {
      ir $$3 = $$1.a($$2);
      dtc $$4 = $$0.a_($$3);
      if (this.a($$4, $$2.g())) {
         this.a($$4, (dcb)$$0, $$3);
      } else if ($$4.i() || $$4.a(dfe.al)) {
         this.a($$0, $$3, $$2, dtz.b);
      }
   }

   private void a(dcb $$0, ir $$1, iw $$2, dtz $$3) {
      dtc $$4 = this.n().a(b, $$2).a(c, $$3).a(d, Boolean.valueOf($$0.b_($$1).a() == epf.c));
      $$0.a($$1, $$4, 3);
   }

   private void a(dtc $$0, dcb $$1, ir $$2) {
      ir $$4;
      ir $$3;
      if ($$0.c(b) == iw.b) {
         $$3 = $$2;
         $$4 = $$2.c();
      } else {
         $$4 = $$2;
         $$3 = $$2.d();
      }

      this.a($$1, $$4, iw.a, dtz.a);
      this.a($$1, $$3, iw.b, dtz.a);
   }

   public static void a(dca $$0, ir $$1, dtc $$2) {
      if ($$2.b() instanceof dla $$3) {
         $$3.b($$0, $$1, $$2).ifPresent($$3x -> a($$0, $$1, $$2, $$3x.b));
      }
   }

   private static void a(dca $$0, ir $$1, dtc $$2, epd $$3) {
      ewu $$4 = $$2.n($$0, $$1);
      double $$5 = 0.0625;
      double $$6 = (double)$$1.u() + 0.5 + $$4.c;
      double $$7 = (double)((float)($$1.v() + 1) - 0.6875F) - 0.0625;
      double $$8 = (double)$$1.w() + 0.5 + $$4.e;
      epd $$9 = a($$0, $$3);
      kz $$10 = $$9.a(awj.b) ? lb.aM : lb.aO;
      $$0.a($$10, $$6, $$7, $$8, 0.0, 0.0, 0.0);
   }

   @Nullable
   private ir a(dtc $$0, dcb $$1, ir $$2, int $$3, boolean $$4) {
      if (this.a($$0, $$4)) {
         return $$2;
      } else {
         iw $$5 = $$0.c(b);
         BiPredicate<ir, dtc> $$6 = ($$1x, $$2x) -> $$2x.a(this) && $$2x.c(b) == $$5;
         return a($$1, $$2, $$5.f(), $$6, $$1x -> this.a($$1x, $$4), $$3).orElse(null);
      }
   }

   @Nullable
   private iw b(dcd $$0, ir $$1, iw $$2) {
      iw $$3;
      if (this.c($$0, $$1, $$2)) {
         $$3 = $$2;
      } else {
         if (!this.c($$0, $$1, $$2.g())) {
            return null;
         }

         $$3 = $$2.g();
      }

      return $$3;
   }

   private dtz a(dcd $$0, ir $$1, iw $$2, boolean $$3) {
      iw $$4 = $$2.g();
      dtc $$5 = $$0.a_($$1.a($$2));
      if (this.b($$5, $$4)) {
         return !$$3 && $$5.c(c) != dtz.a ? dtz.b : dtz.a;
      } else if (!this.b($$5, $$2)) {
         return dtz.b;
      } else {
         dtz $$6 = $$5.c(c);
         if ($$6 != dtz.b && $$6 != dtz.a) {
            dtc $$7 = $$0.a_($$1.a($$4));
            return !this.b($$7, $$2) ? dtz.e : dtz.d;
         } else {
            return dtz.c;
         }
      }
   }

   public boolean n(dtc $$0) {
      return this.o($$0) && $$0.c(c) == dtz.b && !$$0.c(d);
   }

   private boolean b(dtc $$0, aqt $$1, ir $$2) {
      iw $$3 = $$0.c(b);
      ir $$4 = $$2.a($$3);
      dtc $$5 = $$1.a_($$4);
      if (!$$5.u().c()) {
         return false;
      } else {
         return $$5.i() ? true : this.a($$5, $$3.g());
      }
   }

   private Optional<ir> a(dca $$0, ir $$1, dtc $$2, int $$3) {
      iw $$4 = $$2.c(b);
      BiPredicate<ir, dtc> $$5 = ($$1x, $$2x) -> $$2x.a(this) && $$2x.c(b) == $$4;
      return a($$0, $$1, $$4.g().f(), $$5, $$0x -> !$$0x.a(this), $$3);
   }

   private boolean c(dcd $$0, ir $$1, iw $$2) {
      ir $$3 = $$1.a($$2.g());
      dtc $$4 = $$0.a_($$3);
      return (this.U ? this.m($$4) : $$4.d($$0, $$3, $$2)) || this.b($$4, $$2);
   }

   private boolean a(dtc $$0, boolean $$1) {
      if (!$$0.a(this)) {
         return false;
      } else {
         dtz $$2 = $$0.c(c);
         return $$2 == dtz.b || $$1 && $$2 == dtz.a;
      }
   }

   private boolean a(dtc $$0, iw $$1) {
      return this.a($$0, false) && $$0.c(b) == $$1;
   }

   private boolean o(dtc $$0) {
      return this.b($$0, iw.a);
   }

   private boolean p(dtc $$0) {
      return this.b($$0, iw.b);
   }

   private boolean b(dtc $$0, dcd $$1, ir $$2) {
      return this.o($$0) && !$$1.a_($$2.c()).a(this);
   }

   @Override
   protected boolean a(dtc $$0, ept $$1) {
      return false;
   }

   private boolean b(dtc $$0, iw $$1) {
      return $$0.a(this) && $$0.c(b) == $$1;
   }

   @Nullable
   private static ir a(dca $$0, ir $$1, epd $$2) {
      Predicate<dtc> $$3 = $$1x -> $$1x.b() instanceof ddu && ((ddu)$$1x.b()).a($$2);
      BiPredicate<ir, dtc> $$4 = ($$1x, $$2x) -> a((dbg)$$0, $$1x, $$2x);
      return a($$0, $$1, iw.a.f(), $$4, $$3, 11).orElse(null);
   }

   @Nullable
   public static ir a(dfc $$0, dca $$1, ir $$2) {
      if ($$0 instanceof dla $$3) {
         BiPredicate $$5 = ($$1x, $$2x) -> a((dbg)$$1, $$1x, $$2x);
         return a($$1, $$2, iw.b.f(), $$5, $$3::n, 11).orElse(null);
      } else {
         return null;
      }
   }

   public epd c(aqt $$0, ir $$1) {
      return this.b($$0, $$1, $$0.a_($$1)).map($$0x -> $$0x.b).filter(dla::a).orElse(epf.a);
   }

   private Optional<dla.a> b(dca $$0, ir $$1, dtc $$2) {
      return !this.o($$2) ? Optional.empty() : this.a($$0, $$1, $$2, 11).map($$1x -> {
         ir $$2x = $$1x.c();
         dtc $$3 = $$0.a_($$2x);
         epd $$4;
         if ($$3.a(dfe.uf) && !$$0.E_().i()) {
            $$4 = epf.c;
         } else {
            $$4 = $$0.b_($$2x).a();
         }

         return new dla.a($$2x, $$4, $$3);
      });
   }

   private static boolean a(epd $$0) {
      return $$0 == epf.e || $$0 == epf.c;
   }

   private boolean a(dtc $$0, dtc $$1) {
      return $$0.a(dfe.tR) && $$1.a(dfe.al) && $$1.u().b();
   }

   private static epd a(dca $$0, epd $$1) {
      if ($$1.a(epf.a)) {
         return $$0.E_().i() ? epf.e : epf.c;
      } else {
         return $$1;
      }
   }

   private static Optional<ir> a(dcb $$0, ir $$1, iw.b $$2, BiPredicate<ir, dtc> $$3, Predicate<dtc> $$4, int $$5) {
      iw $$6 = iw.a($$2, iw.a.b);
      ir.a $$7 = $$1.j();

      for (int $$8 = 1; $$8 < $$5; $$8++) {
         $$7.d($$6);
         dtc $$9 = $$0.a_($$7);
         if ($$4.test($$9)) {
            return Optional.of($$7.i());
         }

         if ($$0.d($$7.v()) || !$$3.test($$7, $$9)) {
            return Optional.empty();
         }
      }

      return Optional.empty();
   }

   private static boolean a(dbg $$0, ir $$1, dtc $$2) {
      if ($$2.i()) {
         return true;
      } else if ($$2.i($$0, $$1)) {
         return false;
      } else if (!$$2.u().c()) {
         return false;
      } else {
         exn $$3 = $$2.k($$0, $$1);
         return !exk.c(T, $$3, ewy.i);
      }
   }

   static record a(ir a, epd b, dtc c) {
   }
}
