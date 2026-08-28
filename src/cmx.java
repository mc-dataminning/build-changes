import com.google.common.annotations.VisibleForTesting;
import com.google.common.collect.Lists;
import it.unimi.dsi.fastutil.objects.ObjectArrayList;
import java.util.Map;
import java.util.Optional;
import javax.annotation.Nullable;

public class cmx extends bxa<cmu> {
   private static final int c = 4;
   private static final int d = 10;
   private static final int e = 2;
   private static final int f = Math.round(10.0F);
   private static final float g = 24.0F;
   private static final float h = 1.4F;
   private static final float i = 0.058333334F;
   private static final ObjectArrayList<Integer> j = new ObjectArrayList(Lists.newArrayList(new Integer[]{40, 55, 60, 75, 80}));

   @VisibleForTesting
   public cmx() {
      super(Map.of(cel.o, cem.a, cel.aU, cem.b, cel.aZ, cem.c, cel.ba, cem.c, cel.aV, cem.b, cel.m, cem.b, cel.bb, cem.c), 200);
   }

   public static boolean a(ard $$0, cmu $$1) {
      if (!$$1.aJ() && !$$1.bj()) {
         return false;
      } else if (bzu.a($$1)) {
         return false;
      } else if ($$1.eb().a(cel.ba, cem.a)) {
         return true;
      } else {
         bvh $$2 = $$1.eb().c(cel.o).orElse(null);
         if ($$2 == null) {
            return false;
         } else if (a($$1, $$2)) {
            $$1.eb().b(cel.o);
            return false;
         } else if (b($$1, $$2)) {
            return false;
         } else if (!c($$0, $$1)) {
            return false;
         } else {
            ji $$3 = a($$1, cmw.a($$2, $$1.dY()));
            if ($$3 == null) {
               return false;
            } else {
               dwx $$4 = $$0.a_($$3.e());
               if ($$1.aq().a($$4)) {
                  return false;
               } else if (!cmw.a($$1, $$3.b()) && !cmw.a($$1, $$3.b(4).b())) {
                  return false;
               } else {
                  $$1.eb().a(cel.ba, $$3);
                  return true;
               }
            }
         }
      }
   }

   protected boolean b(ard $$0, cmu $$1) {
      return a($$0, $$1);
   }

   protected boolean a(ard $$0, cmu $$1, long $$2) {
      return $$1.aw() != bvt.a && !$$1.eb().a(cel.aU);
   }

   protected void b(ard $$0, cmu $$1, long $$2) {
      if ($$1.eb().a(cel.aZ, cem.b)) {
         $$1.eb().a(cel.aZ, baf.a, (long)f);
      }

      $$1.b(bvt.r);
      $$0.a(null, $$1, awa.cE, awb.f, 1.0F, 1.0F);
      $$1.eb().c(cel.ba).ifPresent($$1x -> $$1.a(fj.a.b, $$1x.b()));
   }

   protected void c(ard $$0, cmu $$1, long $$2) {
      boolean $$3 = $$1.bj();
      if (!$$3 && $$1.eb().a(cel.bb, cem.a)) {
         $$1.eb().b(cel.bb);
      }

      if (a($$1)) {
         fba $$4 = $$1.eb().c(cel.ba).flatMap($$1x -> a($$1, $$1.dY(), fba.c($$1x))).orElse(null);
         if ($$4 == null) {
            $$1.b(bvt.a);
            return;
         }

         if ($$3) {
            $$1.eb().a(cel.bb, baf.a);
         }

         $$1.a(awa.cK, 1.0F, 1.0F);
         $$1.b(bvt.g);
         $$1.v($$1.aX);
         $$1.r(true);
         $$1.i($$4);
      } else if (b($$1)) {
         $$1.a(awa.cL, 1.0F, 1.0F);
         $$1.b(bvt.a);
         $$1.r(false);
         boolean $$5 = $$1.eb().a(cel.x);
         $$1.eb().a(cel.aU, baf.a, $$5 ? 2L : 10L);
         $$1.eb().a(cel.aV, baf.a, 100L);
      }
   }

   protected void d(ard $$0, cmu $$1, long $$2) {
      if ($$1.aw() == bvt.g || $$1.aw() == bvt.r) {
         $$1.b(bvt.a);
      }

      $$1.eb().b(cel.ba);
      $$1.eb().b(cel.aZ);
      $$1.eb().b(cel.bb);
   }

   private static boolean a(cmu $$0) {
      return $$0.eb().c(cel.aZ).isEmpty() && $$0.aw() == bvt.r;
   }

   private static boolean b(cmu $$0) {
      boolean $$1 = $$0.aw() == bvt.g;
      boolean $$2 = $$0.aJ();
      boolean $$3 = $$0.bj() && $$0.eb().a(cel.bb, cem.b);
      return $$1 && ($$2 || $$3);
   }

   @Nullable
   private static ji a(bvh $$0, fba $$1) {
      dfq $$2 = new dfq($$1, $$1.a(jn.a, 10.0), dfq.a.a, dfq.b.a, $$0);
      fay $$3 = $$0.dV().a($$2);
      if ($$3.d() == fay.a.b) {
         return ji.a((kb)$$3.g()).d();
      } else {
         dfq $$4 = new dfq($$1, $$1.a(jn.b, 10.0), dfq.a.a, dfq.b.a, $$0);
         fay $$5 = $$0.dV().a($$4);
         return $$5.d() == fay.a.b ? ji.a((kb)$$5.g()).d() : null;
      }
   }

   private static boolean a(cmu $$0, bvh $$1) {
      return !$$1.a($$0, $$0.h(bwp.m));
   }

   private static boolean b(cmu $$0, bvh $$1) {
      return $$1.f($$0) - 4.0F <= 0.0F;
   }

   private static boolean c(ard $$0, cmu $$1) {
      ji $$2 = $$1.dv();
      if ($$0.a_($$2).a(djo.pI)) {
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

   private static Optional<fba> a(cmu $$0, azh $$1, fba $$2) {
      for (int $$4 : af.a(j, $$1)) {
         float $$5 = 0.058333334F * (float)$$0.h(bwp.m);
         Optional<fba> $$6 = bye.a($$0, $$2, $$5, $$4, false);
         if ($$6.isPresent()) {
            if ($$0.b(bts.h)) {
               double $$7 = $$6.get().d().e * (double)$$0.fk();
               return $$6.map($$1x -> $$1x.b(0.0, $$7, 0.0));
            }

            return $$6;
         }
      }

      return Optional.empty();
   }
}
