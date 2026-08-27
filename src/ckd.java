import com.google.common.annotations.VisibleForTesting;
import com.google.common.collect.Lists;
import it.unimi.dsi.fastutil.objects.ObjectArrayList;
import java.util.Map;
import java.util.Optional;
import javax.annotation.Nullable;

public class ckd extends bug<cka> {
   private static final int c = 4;
   private static final int d = 10;
   private static final int e = 2;
   private static final int f = Math.round(10.0F);
   private static final float g = 1.4F;
   private static final ObjectArrayList<Integer> h = new ObjectArrayList(Lists.newArrayList(new Integer[]{40, 55, 60, 75, 80}));

   @VisibleForTesting
   public ckd() {
      super(Map.of(cbr.o, cbs.a, cbr.aU, cbs.b, cbr.aZ, cbs.c, cbr.ba, cbs.c, cbr.aV, cbs.b, cbr.m, cbs.b, cbr.bb, cbs.c), 200);
   }

   protected boolean a(aqt $$0, cka $$1) {
      if (!$$1.aE() && !$$1.bi()) {
         return false;
      } else if (bxa.a($$1)) {
         return false;
      } else if ($$1.dZ().a(cbr.ba, cbs.a)) {
         return true;
      } else {
         bso $$2 = $$1.dZ().c(cbr.o).orElse(null);
         if ($$2 == null) {
            return false;
         } else if (a($$1, $$2)) {
            $$1.dZ().b(cbr.o);
            return false;
         } else if (b($$1, $$2)) {
            return false;
         } else if (!b($$0, $$1)) {
            return false;
         } else {
            ir $$3 = a($$1, ckc.a($$2, $$1.et()));
            if ($$3 == null) {
               return false;
            } else if (!ckc.a($$1, $$3.b()) && !ckc.a($$1, $$3.b(4).b())) {
               return false;
            } else {
               $$1.dZ().a(cbr.ba, $$3);
               return true;
            }
         }
      }
   }

   protected boolean a(aqt $$0, cka $$1, long $$2) {
      return $$1.ar() != bsz.a && !$$1.dZ().a(cbr.aU);
   }

   protected void b(aqt $$0, cka $$1, long $$2) {
      if ($$1.dZ().a(cbr.aZ, cbs.b)) {
         $$1.dZ().a(cbr.aZ, azo.a, (long)f);
      }

      $$1.b(bsz.r);
      $$0.a(null, $$1, avo.cJ, avq.f, 1.0F, 1.0F);
      $$1.dZ().c(cbr.ba).ifPresent($$1x -> $$1.a(et.a.b, $$1x.b()));
   }

   protected void c(aqt $$0, cka $$1, long $$2) {
      boolean $$3 = $$1.bi();
      if (!$$3 && $$1.dZ().a(cbr.bb, cbs.a)) {
         $$1.dZ().b(cbr.bb);
      }

      if (a($$1)) {
         ewu $$4 = $$1.dZ().c(cbr.ba).flatMap($$1x -> a($$1, $$1.et(), ewu.c($$1x))).orElse(null);
         if ($$4 == null) {
            $$1.b(bsz.a);
            return;
         }

         if ($$3) {
            $$1.dZ().a(cbr.bb, azo.a);
         }

         $$1.a(avo.cP, 1.0F, 1.0F);
         $$1.b(bsz.g);
         $$1.r($$1.bj);
         $$1.q(true);
         $$1.g($$4);
      } else if (b($$1)) {
         $$1.a(avo.cQ, 1.0F, 1.0F);
         $$1.b(bsz.a);
         $$1.q(false);
         boolean $$5 = $$1.dZ().a(cbr.x);
         $$1.dZ().a(cbr.aU, azo.a, $$5 ? 2L : 10L);
         $$1.dZ().a(cbr.aV, azo.a, 100L);
      }
   }

   protected void d(aqt $$0, cka $$1, long $$2) {
      if ($$1.ar() == bsz.g || $$1.ar() == bsz.r) {
         $$1.b(bsz.a);
      }

      $$1.dZ().b(cbr.ba);
      $$1.dZ().b(cbr.aZ);
      $$1.dZ().b(cbr.bb);
   }

   private static boolean a(cka $$0) {
      return $$0.dZ().c(cbr.aZ).isEmpty() && $$0.ar() == bsz.r;
   }

   private static boolean b(cka $$0) {
      boolean $$1 = $$0.ar() == bsz.g;
      boolean $$2 = $$0.aE();
      boolean $$3 = $$0.bi() && $$0.dZ().a(cbr.bb, cbs.b);
      return $$1 && ($$2 || $$3);
   }

   @Nullable
   private static ir a(bso $$0, ewu $$1) {
      dbj $$2 = new dbj($$1, $$1.a(iw.a, 10.0), dbj.a.a, dbj.b.a, $$0);
      ews $$3 = $$0.dU().a($$2);
      if ($$3.c() == ews.a.b) {
         return ir.a($$3.e()).c();
      } else {
         dbj $$4 = new dbj($$1, $$1.a(iw.b, 10.0), dbj.a.a, dbj.b.a, $$0);
         ews $$5 = $$0.dU().a($$4);
         return $$5.c() == ews.a.b ? ir.a($$3.e()).c() : null;
      }
   }

   private static boolean a(cka $$0, bso $$1) {
      return !$$1.a($$0, 24.0);
   }

   private static boolean b(cka $$0, bso $$1) {
      return $$1.f($$0) - 4.0F <= 0.0F;
   }

   private static boolean b(aqt $$0, cka $$1) {
      ir $$2 = $$1.du();

      for (int $$3 = 1; $$3 <= 4; $$3++) {
         ir $$4 = $$2.a(iw.b, $$3);
         if (!$$0.a_($$4).i() && !$$0.b_($$4).a(awj.a)) {
            return false;
         }
      }

      return true;
   }

   private static Optional<ewu> a(cka $$0, ayt $$1, ewu $$2) {
      for (int $$4 : ad.a(h, $$1)) {
         Optional<ewu> $$5 = bvk.a($$0, $$2, 1.4F, $$4, false);
         if ($$5.isPresent()) {
            return $$5;
         }
      }

      return Optional.empty();
   }
}
