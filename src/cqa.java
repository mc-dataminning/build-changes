import com.google.common.annotations.VisibleForTesting;
import com.google.common.collect.Lists;
import it.unimi.dsi.fastutil.objects.ObjectArrayList;
import java.util.Map;
import java.util.Optional;
import javax.annotation.Nullable;

public class cqa extends bzn<cpx> {
   private static final int c = 4;
   private static final int d = 10;
   private static final int e = 2;
   private static final int f = Math.round(10.0F);
   private static final float g = 24.0F;
   private static final float h = 1.4F;
   private static final float i = 0.058333334F;
   private static final ObjectArrayList<Integer> j = new ObjectArrayList(Lists.newArrayList(new Integer[]{40, 55, 60, 75, 80}));

   @VisibleForTesting
   public cqa() {
      super(Map.of(cgy.p, cgz.a, cgy.aV, cgz.b, cgy.ba, cgz.c, cgy.bb, cgz.c, cgy.aW, cgz.b, cgy.n, cgz.b, cgy.bc, cgz.c), 200);
   }

   public static boolean a(aru $$0, cpx $$1) {
      if (!$$1.aH() && !$$1.bi()) {
         return false;
      } else if (cch.a($$1)) {
         return false;
      } else if ($$1.ec().a(cgy.bb, cgz.a)) {
         return true;
      } else {
         bxw $$2 = $$1.ec().c(cgy.p).orElse(null);
         if ($$2 == null) {
            return false;
         } else if (a($$1, $$2)) {
            $$1.ec().b(cgy.p);
            return false;
         } else if (b($$1, $$2)) {
            return false;
         } else if (!c($$0, $$1)) {
            return false;
         } else {
            iw $$3 = a($$1, cpz.a($$2, $$1.dY()));
            if ($$3 == null) {
               return false;
            } else {
               ebg $$4 = $$0.a_($$3.e());
               if ($$1.an().a($$4)) {
                  return false;
               } else if (!cpz.a($$1, $$3.b()) && !cpz.a($$1, $$3.b(4).b())) {
                  return false;
               } else {
                  $$1.ec().a(cgy.bb, $$3);
                  return true;
               }
            }
         }
      }
   }

   protected boolean b(aru $$0, cpx $$1) {
      return a($$0, $$1);
   }

   protected boolean a(aru $$0, cpx $$1, long $$2) {
      return $$1.at() != byi.a && !$$1.ec().a(cgy.aV);
   }

   protected void b(aru $$0, cpx $$1, long $$2) {
      if ($$1.ec().a(cgy.ba, cgz.b)) {
         $$1.ec().a(cgy.ba, bay.a, (long)f);
      }

      $$1.b(byi.r);
      $$0.a(null, $$1, awr.cE, aws.f, 1.0F, 1.0F);
      $$1.ec().c(cgy.bb).ifPresent($$1x -> $$1.a(ew.a.b, $$1x.b()));
   }

   protected void c(aru $$0, cpx $$1, long $$2) {
      boolean $$3 = $$1.bi();
      if (!$$3 && $$1.ec().a(cgy.bc, cgz.a)) {
         $$1.ec().b(cgy.bc);
      }

      if (a($$1)) {
         ffs $$4 = $$1.ec().c(cgy.bb).flatMap($$1x -> a($$1, $$1.dY(), ffs.c($$1x))).orElse(null);
         if ($$4 == null) {
            $$1.b(byi.a);
            return;
         }

         if ($$3) {
            $$1.ec().a(cgy.bc, bay.a);
         }

         $$1.a(awr.cK, 1.0F, 1.0F);
         $$1.b(byi.g);
         $$1.w($$1.aV);
         $$1.q(true);
         $$1.i($$4);
      } else if (b($$1)) {
         $$1.a(awr.cL, 1.0F, 1.0F);
         $$1.b(byi.a);
         $$1.q(false);
         boolean $$5 = $$1.ec().a(cgy.y);
         $$1.ec().a(cgy.aV, bay.a, $$5 ? 2L : 10L);
         $$1.ec().a(cgy.aW, bay.a, 100L);
      }
   }

   protected void d(aru $$0, cpx $$1, long $$2) {
      if ($$1.at() == byi.g || $$1.at() == byi.r) {
         $$1.b(byi.a);
      }

      $$1.ec().b(cgy.bb);
      $$1.ec().b(cgy.ba);
      $$1.ec().b(cgy.bc);
   }

   private static boolean a(cpx $$0) {
      return $$0.ec().c(cgy.ba).isEmpty() && $$0.at() == byi.r;
   }

   private static boolean b(cpx $$0) {
      boolean $$1 = $$0.at() == byi.g;
      boolean $$2 = $$0.aH();
      boolean $$3 = $$0.bi() && $$0.ec().a(cgy.bc, cgz.b);
      return $$1 && ($$2 || $$3);
   }

   @Nullable
   private static iw a(bxw $$0, ffs $$1) {
      djg $$2 = new djg($$1, $$1.a(jc.a, 10.0), djg.a.a, djg.b.a, $$0);
      ffq $$3 = $$0.dV().a($$2);
      if ($$3.d() == ffq.a.b) {
         return iw.a((jq)$$3.g()).d();
      } else {
         djg $$4 = new djg($$1, $$1.a(jc.b, 10.0), djg.a.a, djg.b.a, $$0);
         ffq $$5 = $$0.dV().a($$4);
         return $$5.d() == ffq.a.b ? iw.a((jq)$$5.g()).d() : null;
      }
   }

   private static boolean a(cpx $$0, bxw $$1) {
      return !$$1.a($$0, $$0.h(bzc.m));
   }

   private static boolean b(cpx $$0, bxw $$1) {
      return $$1.f($$0) - 4.0F <= 0.0F;
   }

   private static boolean c(aru $$0, cpx $$1) {
      iw $$2 = $$1.dv();
      if ($$0.a_($$2).a(dng.pO)) {
         return false;
      } else {
         for (int $$3 = 1; $$3 <= 4; $$3++) {
            iw $$4 = $$2.a(jc.b, $$3);
            if (!$$0.a_($$4).l() && !$$0.b_($$4).a(axl.a)) {
               return false;
            }
         }

         return true;
      }
   }

   private static Optional<ffs> a(cpx $$0, azz $$1, ffs $$2) {
      for (int $$4 : ag.a(j, $$1)) {
         float $$5 = 0.058333334F * (float)$$0.h(bzc.m);
         Optional<ffs> $$6 = car.a($$0, $$2, $$5, $$4, false);
         if ($$6.isPresent()) {
            if ($$0.b(bwb.h)) {
               double $$7 = $$6.get().d().e * (double)$$0.fi();
               return $$6.map($$1x -> $$1x.b(0.0, $$7, 0.0));
            }

            return $$6;
         }
      }

      return Optional.empty();
   }
}
