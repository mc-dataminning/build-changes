import com.google.common.annotations.VisibleForTesting;
import com.google.common.collect.Lists;
import it.unimi.dsi.fastutil.objects.ObjectArrayList;
import java.util.Map;
import java.util.Optional;
import javax.annotation.Nullable;

public class cmy extends bxb<cmv> {
   private static final int c = 4;
   private static final int d = 10;
   private static final int e = 2;
   private static final int f = Math.round(10.0F);
   private static final float g = 24.0F;
   private static final float h = 1.4F;
   private static final float i = 0.058333334F;
   private static final ObjectArrayList<Integer> j = new ObjectArrayList(Lists.newArrayList(new Integer[]{40, 55, 60, 75, 80}));

   @VisibleForTesting
   public cmy() {
      super(Map.of(cem.o, cen.a, cem.aU, cen.b, cem.aZ, cen.c, cem.ba, cen.c, cem.aV, cen.b, cem.m, cen.b, cem.bb, cen.c), 200);
   }

   public static boolean a(ard $$0, cmv $$1) {
      if (!$$1.aJ() && !$$1.bj()) {
         return false;
      } else if (bzv.a($$1)) {
         return false;
      } else if ($$1.eb().a(cem.ba, cen.a)) {
         return true;
      } else {
         bvi $$2 = $$1.eb().c(cem.o).orElse(null);
         if ($$2 == null) {
            return false;
         } else if (a($$1, $$2)) {
            $$1.eb().b(cem.o);
            return false;
         } else if (b($$1, $$2)) {
            return false;
         } else if (!c($$0, $$1)) {
            return false;
         } else {
            ji $$3 = a($$1, cmx.a($$2, $$1.dY()));
            if ($$3 == null) {
               return false;
            } else {
               dwy $$4 = $$0.a_($$3.e());
               if ($$1.aq().a($$4)) {
                  return false;
               } else if (!cmx.a($$1, $$3.b()) && !cmx.a($$1, $$3.b(4).b())) {
                  return false;
               } else {
                  $$1.eb().a(cem.ba, $$3);
                  return true;
               }
            }
         }
      }
   }

   protected boolean b(ard $$0, cmv $$1) {
      return a($$0, $$1);
   }

   protected boolean a(ard $$0, cmv $$1, long $$2) {
      return $$1.aw() != bvu.a && !$$1.eb().a(cem.aU);
   }

   protected void b(ard $$0, cmv $$1, long $$2) {
      if ($$1.eb().a(cem.aZ, cen.b)) {
         $$1.eb().a(cem.aZ, baf.a, (long)f);
      }

      $$1.b(bvu.r);
      $$0.a(null, $$1, awa.cE, awb.f, 1.0F, 1.0F);
      $$1.eb().c(cem.ba).ifPresent($$1x -> $$1.a(fj.a.b, $$1x.b()));
   }

   protected void c(ard $$0, cmv $$1, long $$2) {
      boolean $$3 = $$1.bj();
      if (!$$3 && $$1.eb().a(cem.bb, cen.a)) {
         $$1.eb().b(cem.bb);
      }

      if (a($$1)) {
         fbb $$4 = $$1.eb().c(cem.ba).flatMap($$1x -> a($$1, $$1.dY(), fbb.c($$1x))).orElse(null);
         if ($$4 == null) {
            $$1.b(bvu.a);
            return;
         }

         if ($$3) {
            $$1.eb().a(cem.bb, baf.a);
         }

         $$1.a(awa.cK, 1.0F, 1.0F);
         $$1.b(bvu.g);
         $$1.v($$1.aX);
         $$1.r(true);
         $$1.i($$4);
      } else if (b($$1)) {
         $$1.a(awa.cL, 1.0F, 1.0F);
         $$1.b(bvu.a);
         $$1.r(false);
         boolean $$5 = $$1.eb().a(cem.x);
         $$1.eb().a(cem.aU, baf.a, $$5 ? 2L : 10L);
         $$1.eb().a(cem.aV, baf.a, 100L);
      }
   }

   protected void d(ard $$0, cmv $$1, long $$2) {
      if ($$1.aw() == bvu.g || $$1.aw() == bvu.r) {
         $$1.b(bvu.a);
      }

      $$1.eb().b(cem.ba);
      $$1.eb().b(cem.aZ);
      $$1.eb().b(cem.bb);
   }

   private static boolean a(cmv $$0) {
      return $$0.eb().c(cem.aZ).isEmpty() && $$0.aw() == bvu.r;
   }

   private static boolean b(cmv $$0) {
      boolean $$1 = $$0.aw() == bvu.g;
      boolean $$2 = $$0.aJ();
      boolean $$3 = $$0.bj() && $$0.eb().a(cem.bb, cen.b);
      return $$1 && ($$2 || $$3);
   }

   @Nullable
   private static ji a(bvi $$0, fbb $$1) {
      dfr $$2 = new dfr($$1, $$1.a(jn.a, 10.0), dfr.a.a, dfr.b.a, $$0);
      faz $$3 = $$0.dV().a($$2);
      if ($$3.d() == faz.a.b) {
         return ji.a((kb)$$3.g()).d();
      } else {
         dfr $$4 = new dfr($$1, $$1.a(jn.b, 10.0), dfr.a.a, dfr.b.a, $$0);
         faz $$5 = $$0.dV().a($$4);
         return $$5.d() == faz.a.b ? ji.a((kb)$$5.g()).d() : null;
      }
   }

   private static boolean a(cmv $$0, bvi $$1) {
      return !$$1.a($$0, $$0.h(bwq.m));
   }

   private static boolean b(cmv $$0, bvi $$1) {
      return $$1.f($$0) - 4.0F <= 0.0F;
   }

   private static boolean c(ard $$0, cmv $$1) {
      ji $$2 = $$1.dv();
      if ($$0.a_($$2).a(djp.pI)) {
         return false;
      } else {
         for (int $$3 = 1; $$3 <= 4; $$3++) {
            ji $$4 = $$2.a(jn.b, $$3);
            if (!$$0.a_($$4).l() && !$$0.b_($$4).a(awv.a)) {
               return false;
            }
         }

         return true;
      }
   }

   private static Optional<fbb> a(cmv $$0, azh $$1, fbb $$2) {
      for (int $$4 : af.a(j, $$1)) {
         float $$5 = 0.058333334F * (float)$$0.h(bwq.m);
         Optional<fbb> $$6 = byf.a($$0, $$2, $$5, $$4, false);
         if ($$6.isPresent()) {
            if ($$0.b(btt.h)) {
               double $$7 = $$6.get().d().e * (double)$$0.fk();
               return $$6.map($$1x -> $$1x.b(0.0, $$7, 0.0));
            }

            return $$6;
         }
      }

      return Optional.empty();
   }
}
