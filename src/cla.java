import com.google.common.annotations.VisibleForTesting;
import com.google.common.collect.Lists;
import it.unimi.dsi.fastutil.objects.ObjectArrayList;
import java.util.Map;
import java.util.Optional;
import javax.annotation.Nullable;

public class cla extends bvf<ckx> {
   private static final int c = 4;
   private static final int d = 10;
   private static final int e = 2;
   private static final int f = Math.round(10.0F);
   private static final float g = 1.4F;
   private static final ObjectArrayList<Integer> h = new ObjectArrayList(Lists.newArrayList(new Integer[]{40, 55, 60, 75, 80}));

   @VisibleForTesting
   public cla() {
      super(Map.of(ccq.o, ccr.a, ccq.aU, ccr.b, ccq.aZ, ccr.c, ccq.ba, ccr.c, ccq.aV, ccr.b, ccq.m, ccr.b, ccq.bb, ccr.c), 200);
   }

   public static boolean a(aqt $$0, ckx $$1) {
      if (!$$1.aF() && !$$1.bf()) {
         return false;
      } else if (bxz.a($$1)) {
         return false;
      } else if ($$1.dU().a(ccq.ba, ccr.a)) {
         return true;
      } else {
         btl $$2 = $$1.dU().c(ccq.o).orElse(null);
         if ($$2 == null) {
            return false;
         } else if (a($$1, $$2)) {
            $$1.dU().b(ccq.o);
            return false;
         } else if (b($$1, $$2)) {
            return false;
         } else if (!c($$0, $$1)) {
            return false;
         } else {
            jd $$3 = a($$1, ckz.a($$2, $$1.dT()));
            if ($$3 == null) {
               return false;
            } else {
               dta $$4 = $$0.a_($$3.d());
               if ($$1.am().a($$4)) {
                  return false;
               } else if (!ckz.a($$1, $$3.b()) && !ckz.a($$1, $$3.b(4).b())) {
                  return false;
               } else {
                  $$1.dU().a(ccq.ba, $$3);
                  return true;
               }
            }
         }
      }
   }

   protected boolean b(aqt $$0, ckx $$1) {
      return a($$0, $$1);
   }

   protected boolean a(aqt $$0, ckx $$1, long $$2) {
      return $$1.at() != bty.a && !$$1.dU().a(ccq.aU);
   }

   protected void b(aqt $$0, ckx $$1, long $$2) {
      if ($$1.dU().a(ccq.aZ, ccr.b)) {
         $$1.dU().a(ccq.aZ, azr.a, (long)f);
      }

      $$1.b(bty.r);
      $$0.a(null, $$1, avo.cE, avp.f, 1.0F, 1.0F);
      $$1.dU().c(ccq.ba).ifPresent($$1x -> $$1.a(ff.a.b, $$1x.b()));
   }

   protected void c(aqt $$0, ckx $$1, long $$2) {
      boolean $$3 = $$1.bf();
      if (!$$3 && $$1.dU().a(ccq.bb, ccr.a)) {
         $$1.dU().b(ccq.bb);
      }

      if (a($$1)) {
         eww $$4 = $$1.dU().c(ccq.ba).flatMap($$1x -> a($$1, $$1.dT(), eww.c($$1x))).orElse(null);
         if ($$4 == null) {
            $$1.b(bty.a);
            return;
         }

         if ($$3) {
            $$1.dU().a(ccq.bb, azr.a);
         }

         $$1.a(avo.cK, 1.0F, 1.0F);
         $$1.b(bty.g);
         $$1.s($$1.aY);
         $$1.r(true);
         $$1.i($$4);
      } else if (b($$1)) {
         $$1.a(avo.cL, 1.0F, 1.0F);
         $$1.b(bty.a);
         $$1.r(false);
         boolean $$5 = $$1.dU().a(ccq.x);
         $$1.dU().a(ccq.aU, azr.a, $$5 ? 2L : 10L);
         $$1.dU().a(ccq.aV, azr.a, 100L);
      }
   }

   protected void d(aqt $$0, ckx $$1, long $$2) {
      if ($$1.at() == bty.g || $$1.at() == bty.r) {
         $$1.b(bty.a);
      }

      $$1.dU().b(ccq.ba);
      $$1.dU().b(ccq.aZ);
      $$1.dU().b(ccq.bb);
   }

   private static boolean a(ckx $$0) {
      return $$0.dU().c(ccq.aZ).isEmpty() && $$0.at() == bty.r;
   }

   private static boolean b(ckx $$0) {
      boolean $$1 = $$0.at() == bty.g;
      boolean $$2 = $$0.aF();
      boolean $$3 = $$0.bf() && $$0.dU().a(ccq.bb, ccr.b);
      return $$1 && ($$2 || $$3);
   }

   @Nullable
   private static jd a(btl $$0, eww $$1) {
      dcd $$2 = new dcd($$1, $$1.a(ji.a, 10.0), dcd.a.a, dcd.b.a, $$0);
      ewu $$3 = $$0.dQ().a($$2);
      if ($$3.c() == ewu.a.b) {
         return jd.a((jw)$$3.e()).c();
      } else {
         dcd $$4 = new dcd($$1, $$1.a(ji.b, 10.0), dcd.a.a, dcd.b.a, $$0);
         ewu $$5 = $$0.dQ().a($$4);
         return $$5.c() == ewu.a.b ? jd.a((jw)$$5.e()).c() : null;
      }
   }

   private static boolean a(ckx $$0, btl $$1) {
      return !$$1.a($$0, 24.0);
   }

   private static boolean b(ckx $$0, btl $$1) {
      return $$1.f($$0) - 4.0F <= 0.0F;
   }

   private static boolean c(aqt $$0, ckx $$1) {
      jd $$2 = $$1.dq();

      for (int $$3 = 1; $$3 <= 4; $$3++) {
         jd $$4 = $$2.a(ji.b, $$3);
         if (!$$0.a_($$4).i() && !$$0.b_($$4).a(awj.a)) {
            return false;
         }
      }

      return true;
   }

   private static Optional<eww> a(ckx $$0, ayv $$1, eww $$2) {
      for (int $$4 : ad.a(h, $$1)) {
         Optional<eww> $$5 = bwj.a($$0, $$2, 1.4F, $$4, false);
         if ($$5.isPresent()) {
            return $$5;
         }
      }

      return Optional.empty();
   }
}
