import com.google.common.annotations.VisibleForTesting;
import com.google.common.collect.Lists;
import it.unimi.dsi.fastutil.objects.ObjectArrayList;
import java.util.Map;
import java.util.Optional;
import javax.annotation.Nullable;

public class cjm extends bts<cjj> {
   private static final int c = 4;
   private static final int d = 10;
   private static final int e = 2;
   private static final int f = Math.round(10.0F);
   private static final float g = 1.4F;
   private static final ObjectArrayList<Integer> h = new ObjectArrayList(Lists.newArrayList(new Integer[]{40, 55, 60, 75, 80}));

   @VisibleForTesting
   public cjm() {
      super(Map.of(cbd.o, cbe.a, cbd.aU, cbe.b, cbd.aZ, cbe.c, cbd.ba, cbe.c, cbd.aV, cbe.b, cbd.m, cbe.b, cbd.bb, cbe.c), 200);
   }

   protected boolean a(aqh $$0, cjj $$1) {
      if (!$$1.aC() && !$$1.bc()) {
         return false;
      } else if (bwm.a($$1)) {
         return false;
      } else if ($$1.dQ().a(cbd.ba, cbe.a)) {
         return true;
      } else {
         bsa $$2 = $$1.dQ().c(cbd.o).orElse(null);
         if ($$2 == null) {
            return false;
         } else if (a($$1, $$2)) {
            $$1.dQ().b(cbd.o);
            return false;
         } else if (b($$1, $$2)) {
            return false;
         } else if (!b($$0, $$1)) {
            return false;
         } else {
            in $$3 = a($$1, cjl.a($$2, $$1.ej()));
            if ($$3 == null) {
               return false;
            } else if (!cjl.a($$1, $$3.b()) && !cjl.a($$1, $$3.b(4).b())) {
               return false;
            } else {
               $$1.dQ().a(cbd.ba, $$3);
               return true;
            }
         }
      }
   }

   protected boolean a(aqh $$0, cjj $$1, long $$2) {
      return $$1.ap() != bsl.a && !$$1.dQ().a(cbd.aU);
   }

   protected void b(aqh $$0, cjj $$1, long $$2) {
      if ($$1.dQ().a(cbd.aZ, cbe.b)) {
         $$1.dQ().a(cbd.aZ, azb.a, (long)f);
      }

      $$1.b(bsl.r);
      $$0.a(null, $$1, avc.cE, avd.f, 1.0F, 1.0F);
      $$1.dQ().c(cbd.ba).ifPresent($$1x -> $$1.a(ep.a.b, $$1x.b()));
   }

   protected void c(aqh $$0, cjj $$1, long $$2) {
      boolean $$3 = $$1.bc();
      if (!$$3 && $$1.dQ().a(cbd.bb, cbe.a)) {
         $$1.dQ().b(cbd.bb);
      }

      if (a($$1)) {
         etp $$4 = $$1.dQ().c(cbd.ba).flatMap($$1x -> a($$1, $$1.ej(), etp.c($$1x))).orElse(null);
         if ($$4 == null) {
            $$1.b(bsl.a);
            return;
         }

         if ($$3) {
            $$1.dQ().a(cbd.bb, azb.a);
         }

         $$1.a(avc.cK, 1.0F, 1.0F);
         $$1.b(bsl.g);
         $$1.r($$1.aZ);
         $$1.q(true);
         $$1.g($$4);
      } else if (b($$1)) {
         $$1.a(avc.cL, 1.0F, 1.0F);
         $$1.b(bsl.a);
         $$1.q(false);
         boolean $$5 = $$1.dQ().a(cbd.x);
         $$1.dQ().a(cbd.aU, azb.a, $$5 ? 2L : 10L);
         $$1.dQ().a(cbd.aV, azb.a, 100L);
      }
   }

   protected void d(aqh $$0, cjj $$1, long $$2) {
      if ($$1.ap() == bsl.g || $$1.ap() == bsl.r) {
         $$1.b(bsl.a);
      }

      $$1.dQ().b(cbd.ba);
      $$1.dQ().b(cbd.aZ);
      $$1.dQ().b(cbd.bb);
   }

   private static boolean a(cjj $$0) {
      return $$0.dQ().c(cbd.aZ).isEmpty() && $$0.ap() == bsl.r;
   }

   private static boolean b(cjj $$0) {
      boolean $$1 = $$0.ap() == bsl.g;
      boolean $$2 = $$0.aC();
      boolean $$3 = $$0.bc() && $$0.dQ().a(cbd.bb, cbe.b);
      return $$1 && ($$2 || $$3);
   }

   @Nullable
   private static in a(bsa $$0, etp $$1) {
      czm $$2 = new czm($$1, $$1.a(is.a, 10.0), czm.a.a, czm.b.a, $$0);
      etn $$3 = $$0.dN().a($$2);
      if ($$3.c() == etn.a.b) {
         return in.a($$3.e()).c();
      } else {
         czm $$4 = new czm($$1, $$1.a(is.b, 10.0), czm.a.a, czm.b.a, $$0);
         etn $$5 = $$0.dN().a($$4);
         return $$5.c() == etn.a.b ? in.a($$3.e()).c() : null;
      }
   }

   private static boolean a(cjj $$0, bsa $$1) {
      return !$$1.a($$0, 24.0);
   }

   private static boolean b(cjj $$0, bsa $$1) {
      return $$1.f($$0) - 4.0F <= 0.0F;
   }

   private static boolean b(aqh $$0, cjj $$1) {
      in $$2 = $$1.dn();

      for (int $$3 = 1; $$3 <= 4; $$3++) {
         in $$4 = $$2.a(is.b, $$3);
         if (!$$0.a_($$4).i() && !$$0.b_($$4).a(avw.a)) {
            return false;
         }
      }

      return true;
   }

   private static Optional<etp> a(cjj $$0, ayg $$1, etp $$2) {
      for (int $$4 : ac.a(h, $$1)) {
         Optional<etp> $$5 = buw.a($$0, $$2, 1.4F, $$4, false);
         if ($$5.isPresent()) {
            return $$5;
         }
      }

      return Optional.empty();
   }
}
