import com.google.common.annotations.VisibleForTesting;
import com.google.common.collect.Lists;
import it.unimi.dsi.fastutil.objects.ObjectArrayList;
import java.util.Map;
import java.util.Optional;
import javax.annotation.Nullable;

public class ckb extends buh<cjy> {
   private static final int c = 4;
   private static final int d = 10;
   private static final int e = 2;
   private static final int f = Math.round(10.0F);
   private static final float g = 1.4F;
   private static final ObjectArrayList<Integer> h = new ObjectArrayList(Lists.newArrayList(new Integer[]{40, 55, 60, 75, 80}));

   @VisibleForTesting
   public ckb() {
      super(Map.of(cbs.o, cbt.a, cbs.aU, cbt.b, cbs.aZ, cbt.c, cbs.ba, cbt.c, cbs.aV, cbt.b, cbs.m, cbt.b, cbs.bb, cbt.c), 200);
   }

   public static boolean a(aqm $$0, cjy $$1) {
      if (!$$1.aE() && !$$1.be()) {
         return false;
      } else if (bxb.a($$1)) {
         return false;
      } else if ($$1.dS().a(cbs.ba, cbt.a)) {
         return true;
      } else {
         bso $$2 = $$1.dS().c(cbs.o).orElse(null);
         if ($$2 == null) {
            return false;
         } else if (a($$1, $$2)) {
            $$1.dS().b(cbs.o);
            return false;
         } else if (b($$1, $$2)) {
            return false;
         } else if (!c($$0, $$1)) {
            return false;
         } else {
            io $$3 = a($$1, cka.a($$2, $$1.el()));
            if ($$3 == null) {
               return false;
            } else {
               drb $$4 = $$0.a_($$3.d());
               if ($$1.ak().a($$4)) {
                  return false;
               } else if (!cka.a($$1, $$3.b()) && !cka.a($$1, $$3.b(4).b())) {
                  return false;
               } else {
                  $$1.dS().a(cbs.ba, $$3);
                  return true;
               }
            }
         }
      }
   }

   protected boolean b(aqm $$0, cjy $$1) {
      return a($$0, $$1);
   }

   protected boolean a(aqm $$0, cjy $$1, long $$2) {
      return $$1.ar() != bta.a && !$$1.dS().a(cbs.aU);
   }

   protected void b(aqm $$0, cjy $$1, long $$2) {
      if ($$1.dS().a(cbs.aZ, cbt.b)) {
         $$1.dS().a(cbs.aZ, azf.a, (long)f);
      }

      $$1.b(bta.r);
      $$0.a(null, $$1, avh.cE, avi.f, 1.0F, 1.0F);
      $$1.dS().c(cbs.ba).ifPresent($$1x -> $$1.a(eq.a.b, $$1x.b()));
   }

   protected void c(aqm $$0, cjy $$1, long $$2) {
      boolean $$3 = $$1.be();
      if (!$$3 && $$1.dS().a(cbs.bb, cbt.a)) {
         $$1.dS().b(cbs.bb);
      }

      if (a($$1)) {
         euk $$4 = $$1.dS().c(cbs.ba).flatMap($$1x -> a($$1, $$1.el(), euk.c($$1x))).orElse(null);
         if ($$4 == null) {
            $$1.b(bta.a);
            return;
         }

         if ($$3) {
            $$1.dS().a(cbs.bb, azf.a);
         }

         $$1.a(avh.cK, 1.0F, 1.0F);
         $$1.b(bta.g);
         $$1.r($$1.aZ);
         $$1.q(true);
         $$1.g($$4);
      } else if (b($$1)) {
         $$1.a(avh.cL, 1.0F, 1.0F);
         $$1.b(bta.a);
         $$1.q(false);
         boolean $$5 = $$1.dS().a(cbs.x);
         $$1.dS().a(cbs.aU, azf.a, $$5 ? 2L : 10L);
         $$1.dS().a(cbs.aV, azf.a, 100L);
      }
   }

   protected void d(aqm $$0, cjy $$1, long $$2) {
      if ($$1.ar() == bta.g || $$1.ar() == bta.r) {
         $$1.b(bta.a);
      }

      $$1.dS().b(cbs.ba);
      $$1.dS().b(cbs.aZ);
      $$1.dS().b(cbs.bb);
   }

   private static boolean a(cjy $$0) {
      return $$0.dS().c(cbs.aZ).isEmpty() && $$0.ar() == bta.r;
   }

   private static boolean b(cjy $$0) {
      boolean $$1 = $$0.ar() == bta.g;
      boolean $$2 = $$0.aE();
      boolean $$3 = $$0.be() && $$0.dS().a(cbs.bb, cbt.b);
      return $$1 && ($$2 || $$3);
   }

   @Nullable
   private static io a(bso $$0, euk $$1) {
      dag $$2 = new dag($$1, $$1.a(it.a, 10.0), dag.a.a, dag.b.a, $$0);
      eui $$3 = $$0.dP().a($$2);
      if ($$3.c() == eui.a.b) {
         return io.a($$3.e()).c();
      } else {
         dag $$4 = new dag($$1, $$1.a(it.b, 10.0), dag.a.a, dag.b.a, $$0);
         eui $$5 = $$0.dP().a($$4);
         return $$5.c() == eui.a.b ? io.a($$5.e()).c() : null;
      }
   }

   private static boolean a(cjy $$0, bso $$1) {
      return !$$1.a($$0, 24.0);
   }

   private static boolean b(cjy $$0, bso $$1) {
      return $$1.f($$0) - 4.0F <= 0.0F;
   }

   private static boolean c(aqm $$0, cjy $$1) {
      io $$2 = $$1.dp();

      for (int $$3 = 1; $$3 <= 4; $$3++) {
         io $$4 = $$2.a(it.b, $$3);
         if (!$$0.a_($$4).i() && !$$0.b_($$4).a(awb.a)) {
            return false;
         }
      }

      return true;
   }

   private static Optional<euk> a(cjy $$0, ayk $$1, euk $$2) {
      for (int $$4 : ac.a(h, $$1)) {
         Optional<euk> $$5 = bvl.a($$0, $$2, 1.4F, $$4, false);
         if ($$5.isPresent()) {
            return $$5;
         }
      }

      return Optional.empty();
   }
}
