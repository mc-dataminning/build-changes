import com.google.common.annotations.VisibleForTesting;
import com.google.common.collect.Lists;
import it.unimi.dsi.fastutil.objects.ObjectArrayList;
import java.util.Map;
import java.util.Optional;
import javax.annotation.Nullable;

public class cqj extends bzw<cqg> {
   private static final int c = 4;
   private static final int d = 10;
   private static final int e = 2;
   private static final int f = Math.round(10.0F);
   private static final float g = 24.0F;
   private static final float h = 1.4F;
   private static final float i = 0.058333334F;
   private static final ObjectArrayList<Integer> j = new ObjectArrayList(Lists.newArrayList(new Integer[]{40, 55, 60, 75, 80}));

   @VisibleForTesting
   public cqj() {
      super(Map.of(chh.p, chi.a, chh.aV, chi.b, chh.ba, chi.c, chh.bb, chi.c, chh.aW, chi.b, chh.n, chi.b, chh.bc, chi.c), 200);
   }

   public static boolean a(asb $$0, cqg $$1) {
      if (!$$1.aH() && !$$1.bi()) {
         return false;
      } else if (ccq.a($$1)) {
         return false;
      } else if ($$1.ec().a(chh.bb, chi.a)) {
         return true;
      } else {
         byf $$2 = $$1.ec().c(chh.p).orElse(null);
         if ($$2 == null) {
            return false;
         } else if (a($$1, $$2)) {
            $$1.ec().b(chh.p);
            return false;
         } else if (b($$1, $$2)) {
            return false;
         } else if (!c($$0, $$1)) {
            return false;
         } else {
            iw $$3 = a($$1, cqi.a($$2, $$1.dY()));
            if ($$3 == null) {
               return false;
            } else {
               ebq $$4 = $$0.a_($$3.e());
               if ($$1.an().a($$4)) {
                  return false;
               } else if (!cqi.a($$1, $$3.b()) && !cqi.a($$1, $$3.b(4).b())) {
                  return false;
               } else {
                  $$1.ec().a(chh.bb, $$3);
                  return true;
               }
            }
         }
      }
   }

   protected boolean b(asb $$0, cqg $$1) {
      return a($$0, $$1);
   }

   protected boolean a(asb $$0, cqg $$1, long $$2) {
      return $$1.at() != byr.a && !$$1.ec().a(chh.aV);
   }

   protected void b(asb $$0, cqg $$1, long $$2) {
      if ($$1.ec().a(chh.ba, chi.b)) {
         $$1.ec().a(chh.ba, bbh.a, (long)f);
      }

      $$1.b(byr.r);
      $$0.a(null, $$1, awy.cE, awz.f, 1.0F, 1.0F);
      $$1.ec().c(chh.bb).ifPresent($$1x -> $$1.a(ew.a.b, $$1x.b()));
   }

   protected void c(asb $$0, cqg $$1, long $$2) {
      boolean $$3 = $$1.bi();
      if (!$$3 && $$1.ec().a(chh.bc, chi.a)) {
         $$1.ec().b(chh.bc);
      }

      if (a($$1)) {
         fgc $$4 = $$1.ec().c(chh.bb).flatMap($$1x -> a($$1, $$1.dY(), fgc.c($$1x))).orElse(null);
         if ($$4 == null) {
            $$1.b(byr.a);
            return;
         }

         if ($$3) {
            $$1.ec().a(chh.bc, bbh.a);
         }

         $$1.a(awy.cK, 1.0F, 1.0F);
         $$1.b(byr.g);
         $$1.w($$1.aV);
         $$1.q(true);
         $$1.i($$4);
      } else if (b($$1)) {
         $$1.a(awy.cL, 1.0F, 1.0F);
         $$1.b(byr.a);
         $$1.q(false);
         boolean $$5 = $$1.ec().a(chh.y);
         $$1.ec().a(chh.aV, bbh.a, $$5 ? 2L : 10L);
         $$1.ec().a(chh.aW, bbh.a, 100L);
      }
   }

   protected void d(asb $$0, cqg $$1, long $$2) {
      if ($$1.at() == byr.g || $$1.at() == byr.r) {
         $$1.b(byr.a);
      }

      $$1.ec().b(chh.bb);
      $$1.ec().b(chh.ba);
      $$1.ec().b(chh.bc);
   }

   private static boolean a(cqg $$0) {
      return $$0.ec().c(chh.ba).isEmpty() && $$0.at() == byr.r;
   }

   private static boolean b(cqg $$0) {
      boolean $$1 = $$0.at() == byr.g;
      boolean $$2 = $$0.aH();
      boolean $$3 = $$0.bi() && $$0.ec().a(chh.bc, chi.b);
      return $$1 && ($$2 || $$3);
   }

   @Nullable
   private static iw a(byf $$0, fgc $$1) {
      djq $$2 = new djq($$1, $$1.a(jc.a, 10.0), djq.a.a, djq.b.a, $$0);
      fga $$3 = $$0.dV().a($$2);
      if ($$3.d() == fga.a.b) {
         return iw.a((jq)$$3.g()).d();
      } else {
         djq $$4 = new djq($$1, $$1.a(jc.b, 10.0), djq.a.a, djq.b.a, $$0);
         fga $$5 = $$0.dV().a($$4);
         return $$5.d() == fga.a.b ? iw.a((jq)$$5.g()).d() : null;
      }
   }

   private static boolean a(cqg $$0, byf $$1) {
      return !$$1.a($$0, $$0.h(bzl.m));
   }

   private static boolean b(cqg $$0, byf $$1) {
      return $$1.f($$0) - 4.0F <= 0.0F;
   }

   private static boolean c(asb $$0, cqg $$1) {
      iw $$2 = $$1.dv();
      if ($$0.a_($$2).a(dnq.pO)) {
         return false;
      } else {
         for (int $$3 = 1; $$3 <= 4; $$3++) {
            iw $$4 = $$2.a(jc.b, $$3);
            if (!$$0.a_($$4).l() && !$$0.b_($$4).a(axs.a)) {
               return false;
            }
         }

         return true;
      }
   }

   private static Optional<fgc> a(cqg $$0, bai $$1, fgc $$2) {
      for (int $$4 : ag.a(j, $$1)) {
         float $$5 = 0.058333334F * (float)$$0.h(bzl.m);
         Optional<fgc> $$6 = cba.a($$0, $$2, $$5, $$4, false);
         if ($$6.isPresent()) {
            if ($$0.b(bwk.h)) {
               double $$7 = $$6.get().d().e * (double)$$0.fi();
               return $$6.map($$1x -> $$1x.b(0.0, $$7, 0.0));
            }

            return $$6;
         }
      }

      return Optional.empty();
   }
}
