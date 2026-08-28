import com.google.common.annotations.VisibleForTesting;
import com.google.common.collect.Lists;
import it.unimi.dsi.fastutil.objects.ObjectArrayList;
import java.util.Map;
import java.util.Optional;
import javax.annotation.Nullable;

public class ckp extends buu<ckm> {
   private static final int c = 4;
   private static final int d = 10;
   private static final int e = 2;
   private static final int f = Math.round(10.0F);
   private static final float g = 1.4F;
   private static final ObjectArrayList<Integer> h = new ObjectArrayList(Lists.newArrayList(new Integer[]{40, 55, 60, 75, 80}));

   @VisibleForTesting
   public ckp() {
      super(Map.of(ccf.o, ccg.a, ccf.aU, ccg.b, ccf.aZ, ccg.c, ccf.ba, ccg.c, ccf.aV, ccg.b, ccf.m, ccg.b, ccf.bb, ccg.c), 200);
   }

   public static boolean a(aqm $$0, ckm $$1) {
      if (!$$1.aF() && !$$1.bf()) {
         return false;
      } else if (bxo.a($$1)) {
         return false;
      } else if ($$1.dU().a(ccf.ba, ccg.a)) {
         return true;
      } else {
         btb $$2 = $$1.dU().c(ccf.o).orElse(null);
         if ($$2 == null) {
            return false;
         } else if (a($$1, $$2)) {
            $$1.dU().b(ccf.o);
            return false;
         } else if (b($$1, $$2)) {
            return false;
         } else if (!c($$0, $$1)) {
            return false;
         } else {
            ja $$3 = a($$1, cko.a($$2, $$1.dT()));
            if ($$3 == null) {
               return false;
            } else {
               dsk $$4 = $$0.a_($$3.d());
               if ($$1.al().a($$4)) {
                  return false;
               } else if (!cko.a($$1, $$3.b()) && !cko.a($$1, $$3.b(4).b())) {
                  return false;
               } else {
                  $$1.dU().a(ccf.ba, $$3);
                  return true;
               }
            }
         }
      }
   }

   protected boolean b(aqm $$0, ckm $$1) {
      return a($$0, $$1);
   }

   protected boolean a(aqm $$0, ckm $$1, long $$2) {
      return $$1.as() != btn.a && !$$1.dU().a(ccf.aU);
   }

   protected void b(aqm $$0, ckm $$1, long $$2) {
      if ($$1.dU().a(ccf.aZ, ccg.b)) {
         $$1.dU().a(ccf.aZ, azk.a, (long)f);
      }

      $$1.b(btn.r);
      $$0.a(null, $$1, avh.cE, avi.f, 1.0F, 1.0F);
      $$1.dU().c(ccf.ba).ifPresent($$1x -> $$1.a(fc.a.b, $$1x.b()));
   }

   protected void c(aqm $$0, ckm $$1, long $$2) {
      boolean $$3 = $$1.bf();
      if (!$$3 && $$1.dU().a(ccf.bb, ccg.a)) {
         $$1.dU().b(ccf.bb);
      }

      if (a($$1)) {
         ewf $$4 = $$1.dU().c(ccf.ba).flatMap($$1x -> a($$1, $$1.dT(), ewf.c($$1x))).orElse(null);
         if ($$4 == null) {
            $$1.b(btn.a);
            return;
         }

         if ($$3) {
            $$1.dU().a(ccf.bb, azk.a);
         }

         $$1.a(avh.cK, 1.0F, 1.0F);
         $$1.b(btn.g);
         $$1.s($$1.aY);
         $$1.q(true);
         $$1.i($$4);
      } else if (b($$1)) {
         $$1.a(avh.cL, 1.0F, 1.0F);
         $$1.b(btn.a);
         $$1.q(false);
         boolean $$5 = $$1.dU().a(ccf.x);
         $$1.dU().a(ccf.aU, azk.a, $$5 ? 2L : 10L);
         $$1.dU().a(ccf.aV, azk.a, 100L);
      }
   }

   protected void d(aqm $$0, ckm $$1, long $$2) {
      if ($$1.as() == btn.g || $$1.as() == btn.r) {
         $$1.b(btn.a);
      }

      $$1.dU().b(ccf.ba);
      $$1.dU().b(ccf.aZ);
      $$1.dU().b(ccf.bb);
   }

   private static boolean a(ckm $$0) {
      return $$0.dU().c(ccf.aZ).isEmpty() && $$0.as() == btn.r;
   }

   private static boolean b(ckm $$0) {
      boolean $$1 = $$0.as() == btn.g;
      boolean $$2 = $$0.aF();
      boolean $$3 = $$0.bf() && $$0.dU().a(ccf.bb, ccg.b);
      return $$1 && ($$2 || $$3);
   }

   @Nullable
   private static ja a(btb $$0, ewf $$1) {
      dbo $$2 = new dbo($$1, $$1.a(jf.a, 10.0), dbo.a.a, dbo.b.a, $$0);
      ewd $$3 = $$0.dQ().a($$2);
      if ($$3.c() == ewd.a.b) {
         return ja.a($$3.e()).c();
      } else {
         dbo $$4 = new dbo($$1, $$1.a(jf.b, 10.0), dbo.a.a, dbo.b.a, $$0);
         ewd $$5 = $$0.dQ().a($$4);
         return $$5.c() == ewd.a.b ? ja.a($$5.e()).c() : null;
      }
   }

   private static boolean a(ckm $$0, btb $$1) {
      return !$$1.a($$0, 24.0);
   }

   private static boolean b(ckm $$0, btb $$1) {
      return $$1.f($$0) - 4.0F <= 0.0F;
   }

   private static boolean c(aqm $$0, ckm $$1) {
      ja $$2 = $$1.dq();

      for (int $$3 = 1; $$3 <= 4; $$3++) {
         ja $$4 = $$2.a(jf.b, $$3);
         if (!$$0.a_($$4).i() && !$$0.b_($$4).a(awc.a)) {
            return false;
         }
      }

      return true;
   }

   private static Optional<ewf> a(ckm $$0, ayo $$1, ewf $$2) {
      for (int $$4 : ac.a(h, $$1)) {
         Optional<ewf> $$5 = bvy.a($$0, $$2, 1.4F, $$4, false);
         if ($$5.isPresent()) {
            return $$5;
         }
      }

      return Optional.empty();
   }
}
