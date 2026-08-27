import com.google.common.annotations.VisibleForTesting;
import com.google.common.collect.Lists;
import it.unimi.dsi.fastutil.objects.ObjectArrayList;
import java.util.Map;
import java.util.Optional;
import javax.annotation.Nullable;

public class ckd extends buj<cka> {
   private static final int c = 4;
   private static final int d = 10;
   private static final int e = 2;
   private static final int f = Math.round(10.0F);
   private static final float g = 1.4F;
   private static final ObjectArrayList<Integer> h = new ObjectArrayList(Lists.newArrayList(new Integer[]{40, 55, 60, 75, 80}));

   @VisibleForTesting
   public ckd() {
      super(Map.of(cbu.o, cbv.a, cbu.aU, cbv.b, cbu.aZ, cbv.c, cbu.ba, cbv.c, cbu.aV, cbv.b, cbu.m, cbv.b, cbu.bb, cbv.c), 200);
   }

   public static boolean a(aqn $$0, cka $$1) {
      if (!$$1.aE() && !$$1.be()) {
         return false;
      } else if (bxd.a($$1)) {
         return false;
      } else if ($$1.dS().a(cbu.ba, cbv.a)) {
         return true;
      } else {
         bsq $$2 = $$1.dS().c(cbu.o).orElse(null);
         if ($$2 == null) {
            return false;
         } else if (a($$1, $$2)) {
            $$1.dS().b(cbu.o);
            return false;
         } else if (b($$1, $$2)) {
            return false;
         } else if (!c($$0, $$1)) {
            return false;
         } else {
            io $$3 = a($$1, ckc.a($$2, $$1.el()));
            if ($$3 == null) {
               return false;
            } else {
               drd $$4 = $$0.a_($$3.d());
               if ($$1.ak().a($$4)) {
                  return false;
               } else if (!ckc.a($$1, $$3.b()) && !ckc.a($$1, $$3.b(4).b())) {
                  return false;
               } else {
                  $$1.dS().a(cbu.ba, $$3);
                  return true;
               }
            }
         }
      }
   }

   protected boolean b(aqn $$0, cka $$1) {
      return a($$0, $$1);
   }

   protected boolean a(aqn $$0, cka $$1, long $$2) {
      return $$1.ar() != btc.a && !$$1.dS().a(cbu.aU);
   }

   protected void b(aqn $$0, cka $$1, long $$2) {
      if ($$1.dS().a(cbu.aZ, cbv.b)) {
         $$1.dS().a(cbu.aZ, azh.a, (long)f);
      }

      $$1.b(btc.r);
      $$0.a(null, $$1, avi.cE, avj.f, 1.0F, 1.0F);
      $$1.dS().c(cbu.ba).ifPresent($$1x -> $$1.a(eq.a.b, $$1x.b()));
   }

   protected void c(aqn $$0, cka $$1, long $$2) {
      boolean $$3 = $$1.be();
      if (!$$3 && $$1.dS().a(cbu.bb, cbv.a)) {
         $$1.dS().b(cbu.bb);
      }

      if (a($$1)) {
         eum $$4 = $$1.dS().c(cbu.ba).flatMap($$1x -> a($$1, $$1.el(), eum.c($$1x))).orElse(null);
         if ($$4 == null) {
            $$1.b(btc.a);
            return;
         }

         if ($$3) {
            $$1.dS().a(cbu.bb, azh.a);
         }

         $$1.a(avi.cK, 1.0F, 1.0F);
         $$1.b(btc.g);
         $$1.r($$1.aY);
         $$1.q(true);
         $$1.g($$4);
      } else if (b($$1)) {
         $$1.a(avi.cL, 1.0F, 1.0F);
         $$1.b(btc.a);
         $$1.q(false);
         boolean $$5 = $$1.dS().a(cbu.x);
         $$1.dS().a(cbu.aU, azh.a, $$5 ? 2L : 10L);
         $$1.dS().a(cbu.aV, azh.a, 100L);
      }
   }

   protected void d(aqn $$0, cka $$1, long $$2) {
      if ($$1.ar() == btc.g || $$1.ar() == btc.r) {
         $$1.b(btc.a);
      }

      $$1.dS().b(cbu.ba);
      $$1.dS().b(cbu.aZ);
      $$1.dS().b(cbu.bb);
   }

   private static boolean a(cka $$0) {
      return $$0.dS().c(cbu.aZ).isEmpty() && $$0.ar() == btc.r;
   }

   private static boolean b(cka $$0) {
      boolean $$1 = $$0.ar() == btc.g;
      boolean $$2 = $$0.aE();
      boolean $$3 = $$0.be() && $$0.dS().a(cbu.bb, cbv.b);
      return $$1 && ($$2 || $$3);
   }

   @Nullable
   private static io a(bsq $$0, eum $$1) {
      dai $$2 = new dai($$1, $$1.a(it.a, 10.0), dai.a.a, dai.b.a, $$0);
      euk $$3 = $$0.dP().a($$2);
      if ($$3.c() == euk.a.b) {
         return io.a($$3.e()).c();
      } else {
         dai $$4 = new dai($$1, $$1.a(it.b, 10.0), dai.a.a, dai.b.a, $$0);
         euk $$5 = $$0.dP().a($$4);
         return $$5.c() == euk.a.b ? io.a($$5.e()).c() : null;
      }
   }

   private static boolean a(cka $$0, bsq $$1) {
      return !$$1.a($$0, 24.0);
   }

   private static boolean b(cka $$0, bsq $$1) {
      return $$1.f($$0) - 4.0F <= 0.0F;
   }

   private static boolean c(aqn $$0, cka $$1) {
      io $$2 = $$1.dp();

      for (int $$3 = 1; $$3 <= 4; $$3++) {
         io $$4 = $$2.a(it.b, $$3);
         if (!$$0.a_($$4).i() && !$$0.b_($$4).a(awc.a)) {
            return false;
         }
      }

      return true;
   }

   private static Optional<eum> a(cka $$0, aym $$1, eum $$2) {
      for (int $$4 : ac.a(h, $$1)) {
         Optional<eum> $$5 = bvn.a($$0, $$2, 1.4F, $$4, false);
         if ($$5.isPresent()) {
            return $$5;
         }
      }

      return Optional.empty();
   }
}
