import com.google.common.annotations.VisibleForTesting;
import com.google.common.collect.Lists;
import it.unimi.dsi.fastutil.objects.ObjectArrayList;
import java.util.Map;
import java.util.Optional;
import javax.annotation.Nullable;

public class cnv extends bxy<cns> {
   private static final int c = 4;
   private static final int d = 10;
   private static final int e = 2;
   private static final int f = Math.round(10.0F);
   private static final float g = 24.0F;
   private static final float h = 1.4F;
   private static final float i = 0.058333334F;
   private static final ObjectArrayList<Integer> j = new ObjectArrayList(Lists.newArrayList(new Integer[]{40, 55, 60, 75, 80}));

   @VisibleForTesting
   public cnv() {
      super(Map.of(cfj.o, cfk.a, cfj.aU, cfk.b, cfj.aZ, cfk.c, cfj.ba, cfk.c, cfj.aV, cfk.b, cfj.m, cfk.b, cfj.bb, cfk.c), 200);
   }

   public static boolean a(ash $$0, cns $$1) {
      if (!$$1.aJ() && !$$1.bj()) {
         return false;
      } else if (cas.a($$1)) {
         return false;
      } else if ($$1.eb().a(cfj.ba, cfk.a)) {
         return true;
      } else {
         bwf $$2 = $$1.eb().c(cfj.o).orElse(null);
         if ($$2 == null) {
            return false;
         } else if (a($$1, $$2)) {
            $$1.eb().b(cfj.o);
            return false;
         } else if (b($$1, $$2)) {
            return false;
         } else if (!c($$0, $$1)) {
            return false;
         } else {
            jh $$3 = a($$1, cnu.a($$2, $$1.dY()));
            if ($$3 == null) {
               return false;
            } else {
               dxu $$4 = $$0.a_($$3.e());
               if ($$1.aq().a($$4)) {
                  return false;
               } else if (!cnu.a($$1, $$3.b()) && !cnu.a($$1, $$3.b(4).b())) {
                  return false;
               } else {
                  $$1.eb().a(cfj.ba, $$3);
                  return true;
               }
            }
         }
      }
   }

   protected boolean b(ash $$0, cns $$1) {
      return a($$0, $$1);
   }

   protected boolean a(ash $$0, cns $$1, long $$2) {
      return $$1.aw() != bwr.a && !$$1.eb().a(cfj.aU);
   }

   protected void b(ash $$0, cns $$1, long $$2) {
      if ($$1.eb().a(cfj.aZ, cfk.b)) {
         $$1.eb().a(cfj.aZ, bbk.a, (long)f);
      }

      $$1.b(bwr.r);
      $$0.a(null, $$1, axf.cE, axg.f, 1.0F, 1.0F);
      $$1.eb().c(cfj.ba).ifPresent($$1x -> $$1.a(fi.a.b, $$1x.b()));
   }

   protected void c(ash $$0, cns $$1, long $$2) {
      boolean $$3 = $$1.bj();
      if (!$$3 && $$1.eb().a(cfj.bb, cfk.a)) {
         $$1.eb().b(cfj.bb);
      }

      if (a($$1)) {
         fbx $$4 = $$1.eb().c(cfj.ba).flatMap($$1x -> a($$1, $$1.dY(), fbx.c($$1x))).orElse(null);
         if ($$4 == null) {
            $$1.b(bwr.a);
            return;
         }

         if ($$3) {
            $$1.eb().a(cfj.bb, bbk.a);
         }

         $$1.a(axf.cK, 1.0F, 1.0F);
         $$1.b(bwr.g);
         $$1.v($$1.aX);
         $$1.r(true);
         $$1.h($$4);
      } else if (b($$1)) {
         $$1.a(axf.cL, 1.0F, 1.0F);
         $$1.b(bwr.a);
         $$1.r(false);
         boolean $$5 = $$1.eb().a(cfj.x);
         $$1.eb().a(cfj.aU, bbk.a, $$5 ? 2L : 10L);
         $$1.eb().a(cfj.aV, bbk.a, 100L);
      }
   }

   protected void d(ash $$0, cns $$1, long $$2) {
      if ($$1.aw() == bwr.g || $$1.aw() == bwr.r) {
         $$1.b(bwr.a);
      }

      $$1.eb().b(cfj.ba);
      $$1.eb().b(cfj.aZ);
      $$1.eb().b(cfj.bb);
   }

   private static boolean a(cns $$0) {
      return $$0.eb().c(cfj.aZ).isEmpty() && $$0.aw() == bwr.r;
   }

   private static boolean b(cns $$0) {
      boolean $$1 = $$0.aw() == bwr.g;
      boolean $$2 = $$0.aJ();
      boolean $$3 = $$0.bj() && $$0.eb().a(cfj.bb, cfk.b);
      return $$1 && ($$2 || $$3);
   }

   @Nullable
   private static jh a(bwf $$0, fbx $$1) {
      dgp $$2 = new dgp($$1, $$1.a(jm.a, 10.0), dgp.a.a, dgp.b.a, $$0);
      fbv $$3 = $$0.dV().a($$2);
      if ($$3.d() == fbv.a.b) {
         return jh.a((ka)$$3.g()).d();
      } else {
         dgp $$4 = new dgp($$1, $$1.a(jm.b, 10.0), dgp.a.a, dgp.b.a, $$0);
         fbv $$5 = $$0.dV().a($$4);
         return $$5.d() == fbv.a.b ? jh.a((ka)$$5.g()).d() : null;
      }
   }

   private static boolean a(cns $$0, bwf $$1) {
      return !$$1.a($$0, $$0.h(bxn.m));
   }

   private static boolean b(cns $$0, bwf $$1) {
      return $$1.f($$0) - 4.0F <= 0.0F;
   }

   private static boolean c(ash $$0, cns $$1) {
      jh $$2 = $$1.dv();

      for (int $$3 = 1; $$3 <= 4; $$3++) {
         jh $$4 = $$2.a(jm.b, $$3);
         if (!$$0.a_($$4).l() && !$$0.b_($$4).a(aya.a)) {
            return false;
         }
      }

      return true;
   }

   private static Optional<fbx> a(cns $$0, bam $$1, fbx $$2) {
      for (int $$4 : ae.a(j, $$1)) {
         float $$5 = 0.058333334F * (float)$$0.h(bxn.m);
         Optional<fbx> $$6 = bzc.a($$0, $$2, $$5, $$4, false);
         if ($$6.isPresent()) {
            return $$6;
         }
      }

      return Optional.empty();
   }
}
