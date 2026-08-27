import com.google.common.annotations.VisibleForTesting;
import com.google.common.collect.Lists;
import it.unimi.dsi.fastutil.objects.ObjectArrayList;
import java.util.Map;
import java.util.Optional;
import javax.annotation.Nullable;

public class cfm extends bpw<cfj> {
   private static final int c = 4;
   private static final int d = 10;
   private static final int e = 2;
   private static final int f = Math.round(10.0F);
   private static final float g = 1.4F;
   private static final ObjectArrayList<Integer> h = new ObjectArrayList(Lists.newArrayList(new Integer[]{40, 55, 60, 75, 80}));

   @VisibleForTesting
   public cfm() {
      super(Map.of(bxh.o, bxi.a, bxh.aU, bxi.b, bxh.aZ, bxi.c, bxh.ba, bxi.c, bxh.aV, bxi.b, bxh.m, bxi.b, bxh.bb, bxi.c), 200);
   }

   protected boolean a(aov $$0, cfj $$1) {
      if (!$$1.aC() && !$$1.aZ()) {
         return false;
      } else if (bsq.a($$1)) {
         return false;
      } else if ($$1.dO().a(bxh.ba, bxi.a)) {
         return true;
      } else {
         bog $$2 = $$1.dO().c(bxh.o).orElse(null);
         if ($$2 == null) {
            return false;
         } else if (a($$1, $$2)) {
            $$1.dO().b(bxh.o);
            return false;
         } else if (b($$1, $$2)) {
            return false;
         } else if (!b($$0, $$1)) {
            return false;
         } else {
            hz $$3 = a($$1, cfl.a($$2, $$1.eh()));
            if ($$3 == null) {
               return false;
            } else if (!cfl.a($$1, $$3.b()) && !cfl.a($$1, $$3.b(4).b())) {
               return false;
            } else {
               $$1.dO().a(bxh.ba, $$3);
               return true;
            }
         }
      }
   }

   protected boolean a(aov $$0, cfj $$1, long $$2) {
      return $$1.ap() != bor.a && !$$1.dO().a(bxh.aU);
   }

   protected void b(aov $$0, cfj $$1, long $$2) {
      if ($$1.dO().a(bxh.aZ, bxi.b)) {
         $$1.dO().a(bxh.aZ, axk.a, (long)f);
      }

      $$1.b(bor.r);
      $$0.a(null, $$1, atk.cw, atl.f, 1.0F, 1.0F);
      $$1.dO().c(bxh.ba).ifPresent($$1x -> $$1.a(eg.a.b, $$1x.b()));
   }

   protected void c(aov $$0, cfj $$1, long $$2) {
      boolean $$3 = $$1.aZ();
      if (!$$3 && $$1.dO().a(bxh.bb, bxi.a)) {
         $$1.dO().b(bxh.bb);
      }

      if (a($$1)) {
         ens $$4 = $$1.dO().c(bxh.ba).flatMap($$1x -> a($$1, $$1.eh(), ens.c($$1x))).orElse(null);
         if ($$4 == null) {
            $$1.b(bor.a);
            return;
         }

         if ($$3) {
            $$1.dO().a(bxh.bb, axk.a);
         }

         $$1.a(atk.cC, 1.0F, 1.0F);
         $$1.b(bor.g);
         $$1.r($$1.aU);
         $$1.p(true);
         $$1.g($$4);
      } else if (b($$1)) {
         $$1.a(atk.cD, 1.0F, 1.0F);
         $$1.b(bor.a);
         $$1.p(false);
         boolean $$5 = $$1.dO().a(bxh.x);
         $$1.dO().a(bxh.aU, axk.a, $$5 ? 2L : 10L);
         $$1.dO().a(bxh.aV, axk.a, 100L);
      }
   }

   protected void d(aov $$0, cfj $$1, long $$2) {
      if ($$1.ap() == bor.g || $$1.ap() == bor.r) {
         $$1.b(bor.a);
      }

      $$1.dO().b(bxh.ba);
      $$1.dO().b(bxh.aZ);
      $$1.dO().b(bxh.bb);
   }

   private static boolean a(cfj $$0) {
      return $$0.dO().c(bxh.aZ).isEmpty() && $$0.ap() == bor.r;
   }

   private static boolean b(cfj $$0) {
      boolean $$1 = $$0.ap() == bor.g;
      boolean $$2 = $$0.aC();
      boolean $$3 = $$0.aZ() && $$0.dO().a(bxh.bb, bxi.b);
      return $$1 && ($$2 || $$3);
   }

   @Nullable
   private static hz a(bog $$0, ens $$1) {
      cuw $$2 = new cuw($$1, $$1.a(ie.a, 10.0), cuw.a.a, cuw.b.a, $$0);
      enq $$3 = $$0.dM().a($$2);
      if ($$3.c() == enq.a.b) {
         return hz.a($$3.e()).c();
      } else {
         cuw $$4 = new cuw($$1, $$1.a(ie.b, 10.0), cuw.a.a, cuw.b.a, $$0);
         enq $$5 = $$0.dM().a($$4);
         return $$5.c() == enq.a.b ? hz.a($$3.e()).c() : null;
      }
   }

   private static boolean a(cfj $$0, bog $$1) {
      return !$$1.a($$0, 24.0);
   }

   private static boolean b(cfj $$0, bog $$1) {
      return $$1.e($$0) - 4.0F <= 0.0F;
   }

   private static boolean b(aov $$0, cfj $$1) {
      hz $$2 = $$1.dm();

      for (int $$3 = 1; $$3 <= 4; $$3++) {
         hz $$4 = $$2.a(ie.b, $$3);
         if (!$$0.a_($$4).i() && !$$0.b_($$4).a(aue.a)) {
            return false;
         }
      }

      return true;
   }

   private static Optional<ens> a(cfj $$0, awo $$1, ens $$2) {
      for (int $$4 : ac.a(h, $$1)) {
         Optional<ens> $$5 = bra.a($$0, $$2, 1.4F, $$4, false);
         if ($$5.isPresent()) {
            return $$5;
         }
      }

      return Optional.empty();
   }
}
