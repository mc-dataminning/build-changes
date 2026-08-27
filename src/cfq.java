import com.google.common.annotations.VisibleForTesting;
import com.google.common.collect.Lists;
import it.unimi.dsi.fastutil.objects.ObjectArrayList;
import java.util.Map;
import java.util.Optional;
import javax.annotation.Nullable;

public class cfq extends bqa<cfn> {
   private static final int c = 4;
   private static final int d = 10;
   private static final int e = 2;
   private static final int f = Math.round(10.0F);
   private static final float g = 1.4F;
   private static final ObjectArrayList<Integer> h = new ObjectArrayList(Lists.newArrayList(new Integer[]{40, 55, 60, 75, 80}));

   @VisibleForTesting
   public cfq() {
      super(Map.of(bxl.o, bxm.a, bxl.aU, bxm.b, bxl.aZ, bxm.c, bxl.ba, bxm.c, bxl.aV, bxm.b, bxl.m, bxm.b, bxl.bb, bxm.c), 200);
   }

   protected boolean a(aow $$0, cfn $$1) {
      if (!$$1.aC() && !$$1.aZ()) {
         return false;
      } else if (bsu.a($$1)) {
         return false;
      } else if ($$1.dO().a(bxl.ba, bxm.a)) {
         return true;
      } else {
         boi $$2 = $$1.dO().c(bxl.o).orElse(null);
         if ($$2 == null) {
            return false;
         } else if (a($$1, $$2)) {
            $$1.dO().b(bxl.o);
            return false;
         } else if (b($$1, $$2)) {
            return false;
         } else if (!b($$0, $$1)) {
            return false;
         } else {
            hz $$3 = a($$1, cfp.a($$2, $$1.eh()));
            if ($$3 == null) {
               return false;
            } else if (!cfp.a($$1, $$3.b()) && !cfp.a($$1, $$3.b(4).b())) {
               return false;
            } else {
               $$1.dO().a(bxl.ba, $$3);
               return true;
            }
         }
      }
   }

   protected boolean a(aow $$0, cfn $$1, long $$2) {
      return $$1.ap() != bot.a && !$$1.dO().a(bxl.aU);
   }

   protected void b(aow $$0, cfn $$1, long $$2) {
      if ($$1.dO().a(bxl.aZ, bxm.b)) {
         $$1.dO().a(bxl.aZ, axk.a, (long)f);
      }

      $$1.b(bot.r);
      $$0.a(null, $$1, atl.cx, atm.f, 1.0F, 1.0F);
      $$1.dO().c(bxl.ba).ifPresent($$1x -> $$1.a(eg.a.b, $$1x.b()));
   }

   protected void c(aow $$0, cfn $$1, long $$2) {
      boolean $$3 = $$1.aZ();
      if (!$$3 && $$1.dO().a(bxl.bb, bxm.a)) {
         $$1.dO().b(bxl.bb);
      }

      if (a($$1)) {
         enz $$4 = $$1.dO().c(bxl.ba).flatMap($$1x -> a($$1, $$1.eh(), enz.c($$1x))).orElse(null);
         if ($$4 == null) {
            $$1.b(bot.a);
            return;
         }

         if ($$3) {
            $$1.dO().a(bxl.bb, axk.a);
         }

         $$1.a(atl.cD, 1.0F, 1.0F);
         $$1.b(bot.g);
         $$1.r($$1.aU);
         $$1.p(true);
         $$1.g($$4);
      } else if (b($$1)) {
         $$1.a(atl.cE, 1.0F, 1.0F);
         $$1.b(bot.a);
         $$1.p(false);
         boolean $$5 = $$1.dO().a(bxl.x);
         $$1.dO().a(bxl.aU, axk.a, $$5 ? 2L : 10L);
         $$1.dO().a(bxl.aV, axk.a, 100L);
      }
   }

   protected void d(aow $$0, cfn $$1, long $$2) {
      if ($$1.ap() == bot.g || $$1.ap() == bot.r) {
         $$1.b(bot.a);
      }

      $$1.dO().b(bxl.ba);
      $$1.dO().b(bxl.aZ);
      $$1.dO().b(bxl.bb);
   }

   private static boolean a(cfn $$0) {
      return $$0.dO().c(bxl.aZ).isEmpty() && $$0.ap() == bot.r;
   }

   private static boolean b(cfn $$0) {
      boolean $$1 = $$0.ap() == bot.g;
      boolean $$2 = $$0.aC();
      boolean $$3 = $$0.aZ() && $$0.dO().a(bxl.bb, bxm.b);
      return $$1 && ($$2 || $$3);
   }

   @Nullable
   private static hz a(boi $$0, enz $$1) {
      cva $$2 = new cva($$1, $$1.a(ie.a, 10.0), cva.a.a, cva.b.a, $$0);
      enx $$3 = $$0.dM().a($$2);
      if ($$3.c() == enx.a.b) {
         return hz.a($$3.e()).c();
      } else {
         cva $$4 = new cva($$1, $$1.a(ie.b, 10.0), cva.a.a, cva.b.a, $$0);
         enx $$5 = $$0.dM().a($$4);
         return $$5.c() == enx.a.b ? hz.a($$3.e()).c() : null;
      }
   }

   private static boolean a(cfn $$0, boi $$1) {
      return !$$1.a($$0, 24.0);
   }

   private static boolean b(cfn $$0, boi $$1) {
      return $$1.e($$0) - 4.0F <= 0.0F;
   }

   private static boolean b(aow $$0, cfn $$1) {
      hz $$2 = $$1.dm();

      for (int $$3 = 1; $$3 <= 4; $$3++) {
         hz $$4 = $$2.a(ie.b, $$3);
         if (!$$0.a_($$4).i() && !$$0.b_($$4).a(auf.a)) {
            return false;
         }
      }

      return true;
   }

   private static Optional<enz> a(cfn $$0, awp $$1, enz $$2) {
      for (int $$4 : ac.a(h, $$1)) {
         Optional<enz> $$5 = bre.a($$0, $$2, 1.4F, $$4, false);
         if ($$5.isPresent()) {
            return $$5;
         }
      }

      return Optional.empty();
   }
}
