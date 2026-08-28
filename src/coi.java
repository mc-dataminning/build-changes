import com.google.common.annotations.VisibleForTesting;
import com.google.common.collect.Lists;
import it.unimi.dsi.fastutil.objects.ObjectArrayList;
import java.util.Map;
import java.util.Optional;
import javax.annotation.Nullable;

public class coi extends byi<cof> {
   private static final int c = 4;
   private static final int d = 10;
   private static final int e = 2;
   private static final int f = Math.round(10.0F);
   private static final float g = 24.0F;
   private static final float h = 1.4F;
   private static final float i = 0.058333334F;
   private static final ObjectArrayList<Integer> j = new ObjectArrayList(Lists.newArrayList(new Integer[]{40, 55, 60, 75, 80}));

   @VisibleForTesting
   public coi() {
      super(Map.of(cft.p, cfu.a, cft.aV, cfu.b, cft.ba, cfu.c, cft.bb, cfu.c, cft.aW, cfu.b, cft.n, cfu.b, cft.bc, cfu.c), 200);
   }

   public static boolean a(arn $$0, cof $$1) {
      if (!$$1.aJ() && !$$1.bj()) {
         return false;
      } else if (cbc.a($$1)) {
         return false;
      } else if ($$1.eb().a(cft.bb, cfu.a)) {
         return true;
      } else {
         bwr $$2 = $$1.eb().c(cft.p).orElse(null);
         if ($$2 == null) {
            return false;
         } else if (a($$1, $$2)) {
            $$1.eb().b(cft.p);
            return false;
         } else if (b($$1, $$2)) {
            return false;
         } else if (!c($$0, $$1)) {
            return false;
         } else {
            jj $$3 = a($$1, coh.a($$2, $$1.dY()));
            if ($$3 == null) {
               return false;
            } else {
               dym $$4 = $$0.a_($$3.e());
               if ($$1.aq().a($$4)) {
                  return false;
               } else if (!coh.a($$1, $$3.b()) && !coh.a($$1, $$3.b(4).b())) {
                  return false;
               } else {
                  $$1.eb().a(cft.bb, $$3);
                  return true;
               }
            }
         }
      }
   }

   protected boolean b(arn $$0, cof $$1) {
      return a($$0, $$1);
   }

   protected boolean a(arn $$0, cof $$1, long $$2) {
      return $$1.aw() != bxd.a && !$$1.eb().a(cft.aV);
   }

   protected void b(arn $$0, cof $$1, long $$2) {
      if ($$1.eb().a(cft.ba, cfu.b)) {
         $$1.eb().a(cft.ba, baq.a, (long)f);
      }

      $$1.b(bxd.r);
      $$0.a(null, $$1, awk.cE, awl.f, 1.0F, 1.0F);
      $$1.eb().c(cft.bb).ifPresent($$1x -> $$1.a(fj.a.b, $$1x.b()));
   }

   protected void c(arn $$0, cof $$1, long $$2) {
      boolean $$3 = $$1.bj();
      if (!$$3 && $$1.eb().a(cft.bc, cfu.a)) {
         $$1.eb().b(cft.bc);
      }

      if (a($$1)) {
         fcu $$4 = $$1.eb().c(cft.bb).flatMap($$1x -> a($$1, $$1.dY(), fcu.c($$1x))).orElse(null);
         if ($$4 == null) {
            $$1.b(bxd.a);
            return;
         }

         if ($$3) {
            $$1.eb().a(cft.bc, baq.a);
         }

         $$1.a(awk.cK, 1.0F, 1.0F);
         $$1.b(bxd.g);
         $$1.w($$1.aU);
         $$1.q(true);
         $$1.i($$4);
      } else if (b($$1)) {
         $$1.a(awk.cL, 1.0F, 1.0F);
         $$1.b(bxd.a);
         $$1.q(false);
         boolean $$5 = $$1.eb().a(cft.y);
         $$1.eb().a(cft.aV, baq.a, $$5 ? 2L : 10L);
         $$1.eb().a(cft.aW, baq.a, 100L);
      }
   }

   protected void d(arn $$0, cof $$1, long $$2) {
      if ($$1.aw() == bxd.g || $$1.aw() == bxd.r) {
         $$1.b(bxd.a);
      }

      $$1.eb().b(cft.bb);
      $$1.eb().b(cft.ba);
      $$1.eb().b(cft.bc);
   }

   private static boolean a(cof $$0) {
      return $$0.eb().c(cft.ba).isEmpty() && $$0.aw() == bxd.r;
   }

   private static boolean b(cof $$0) {
      boolean $$1 = $$0.aw() == bxd.g;
      boolean $$2 = $$0.aJ();
      boolean $$3 = $$0.bj() && $$0.eb().a(cft.bc, cfu.b);
      return $$1 && ($$2 || $$3);
   }

   @Nullable
   private static jj a(bwr $$0, fcu $$1) {
      dgy $$2 = new dgy($$1, $$1.a(jo.a, 10.0), dgy.a.a, dgy.b.a, $$0);
      fcs $$3 = $$0.dV().a($$2);
      if ($$3.d() == fcs.a.b) {
         return jj.a((kc)$$3.g()).d();
      } else {
         dgy $$4 = new dgy($$1, $$1.a(jo.b, 10.0), dgy.a.a, dgy.b.a, $$0);
         fcs $$5 = $$0.dV().a($$4);
         return $$5.d() == fcs.a.b ? jj.a((kc)$$5.g()).d() : null;
      }
   }

   private static boolean a(cof $$0, bwr $$1) {
      return !$$1.a($$0, $$0.h(bxx.m));
   }

   private static boolean b(cof $$0, bwr $$1) {
      return $$1.f($$0) - 4.0F <= 0.0F;
   }

   private static boolean c(arn $$0, cof $$1) {
      jj $$2 = $$1.dv();
      if ($$0.a_($$2).a(dkw.pK)) {
         return false;
      } else {
         for (int $$3 = 1; $$3 <= 4; $$3++) {
            jj $$4 = $$2.a(jo.b, $$3);
            if (!$$0.a_($$4).l() && !$$0.b_($$4).a(axf.a)) {
               return false;
            }
         }

         return true;
      }
   }

   private static Optional<fcu> a(cof $$0, azs $$1, fcu $$2) {
      for (int $$4 : af.a(j, $$1)) {
         float $$5 = 0.058333334F * (float)$$0.h(bxx.m);
         Optional<fcu> $$6 = bzm.a($$0, $$2, $$5, $$4, false);
         if ($$6.isPresent()) {
            if ($$0.b(buy.h)) {
               double $$7 = $$6.get().d().e * (double)$$0.fh();
               return $$6.map($$1x -> $$1x.b(0.0, $$7, 0.0));
            }

            return $$6;
         }
      }

      return Optional.empty();
   }
}
