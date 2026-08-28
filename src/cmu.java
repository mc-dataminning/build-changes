import com.google.common.annotations.VisibleForTesting;
import com.google.common.collect.Lists;
import it.unimi.dsi.fastutil.objects.ObjectArrayList;
import java.util.Map;
import java.util.Optional;
import javax.annotation.Nullable;

public class cmu extends bwx<cmr> {
   private static final int c = 4;
   private static final int d = 10;
   private static final int e = 2;
   private static final int f = Math.round(10.0F);
   private static final float g = 24.0F;
   private static final float h = 1.4F;
   private static final float i = 0.058333334F;
   private static final ObjectArrayList<Integer> j = new ObjectArrayList(Lists.newArrayList(new Integer[]{40, 55, 60, 75, 80}));

   @VisibleForTesting
   public cmu() {
      super(Map.of(cei.o, cej.a, cei.aU, cej.b, cei.aZ, cej.c, cei.ba, cej.c, cei.aV, cej.b, cei.m, cej.b, cei.bb, cej.c), 200);
   }

   public static boolean a(arq $$0, cmr $$1) {
      if (!$$1.aL() && !$$1.bl()) {
         return false;
      } else if (bzr.a($$1)) {
         return false;
      } else if ($$1.ee().a(cei.ba, cej.a)) {
         return true;
      } else {
         bve $$2 = $$1.ee().c(cei.o).orElse(null);
         if ($$2 == null) {
            return false;
         } else if (a($$1, $$2)) {
            $$1.ee().b(cei.o);
            return false;
         } else if (b($$1, $$2)) {
            return false;
         } else if (!c($$0, $$1)) {
            return false;
         } else {
            jh $$3 = a($$1, cmt.a($$2, $$1.eb()));
            if ($$3 == null) {
               return false;
            } else {
               dvo $$4 = $$0.a_($$3.e());
               if ($$1.ar().a($$4)) {
                  return false;
               } else if (!cmt.a($$1, $$3.b()) && !cmt.a($$1, $$3.b(4).b())) {
                  return false;
               } else {
                  $$1.ee().a(cei.ba, $$3);
                  return true;
               }
            }
         }
      }
   }

   protected boolean b(arq $$0, cmr $$1) {
      return a($$0, $$1);
   }

   protected boolean a(arq $$0, cmr $$1, long $$2) {
      return $$1.ay() != bvq.a && !$$1.ee().a(cei.aU);
   }

   protected void b(arq $$0, cmr $$1, long $$2) {
      if ($$1.ee().a(cei.aZ, cej.b)) {
         $$1.ee().a(cei.aZ, bat.a, (long)f);
      }

      $$1.b(bvq.r);
      $$0.a(null, $$1, awo.cE, awp.f, 1.0F, 1.0F);
      $$1.ee().c(cei.ba).ifPresent($$1x -> $$1.a(fi.a.b, $$1x.b()));
   }

   protected void c(arq $$0, cmr $$1, long $$2) {
      boolean $$3 = $$1.bl();
      if (!$$3 && $$1.ee().a(cei.bb, cej.a)) {
         $$1.ee().b(cei.bb);
      }

      if (a($$1)) {
         ezr $$4 = $$1.ee().c(cei.ba).flatMap($$1x -> a($$1, $$1.eb(), ezr.c($$1x))).orElse(null);
         if ($$4 == null) {
            $$1.b(bvq.a);
            return;
         }

         if ($$3) {
            $$1.ee().a(cei.bb, bat.a);
         }

         $$1.a(awo.cK, 1.0F, 1.0F);
         $$1.b(bvq.g);
         $$1.v($$1.aX);
         $$1.r(true);
         $$1.h($$4);
      } else if (b($$1)) {
         $$1.a(awo.cL, 1.0F, 1.0F);
         $$1.b(bvq.a);
         $$1.r(false);
         boolean $$5 = $$1.ee().a(cei.x);
         $$1.ee().a(cei.aU, bat.a, $$5 ? 2L : 10L);
         $$1.ee().a(cei.aV, bat.a, 100L);
      }
   }

   protected void d(arq $$0, cmr $$1, long $$2) {
      if ($$1.ay() == bvq.g || $$1.ay() == bvq.r) {
         $$1.b(bvq.a);
      }

      $$1.ee().b(cei.ba);
      $$1.ee().b(cei.aZ);
      $$1.ee().b(cei.bb);
   }

   private static boolean a(cmr $$0) {
      return $$0.ee().c(cei.aZ).isEmpty() && $$0.ay() == bvq.r;
   }

   private static boolean b(cmr $$0) {
      boolean $$1 = $$0.ay() == bvq.g;
      boolean $$2 = $$0.aL();
      boolean $$3 = $$0.bl() && $$0.ee().a(cei.bb, cej.b);
      return $$1 && ($$2 || $$3);
   }

   @Nullable
   private static jh a(bve $$0, ezr $$1) {
      den $$2 = new den($$1, $$1.a(jm.a, 10.0), den.a.a, den.b.a, $$0);
      ezp $$3 = $$0.dY().a($$2);
      if ($$3.d() == ezp.a.b) {
         return jh.a((ka)$$3.g()).d();
      } else {
         den $$4 = new den($$1, $$1.a(jm.b, 10.0), den.a.a, den.b.a, $$0);
         ezp $$5 = $$0.dY().a($$4);
         return $$5.d() == ezp.a.b ? jh.a((ka)$$5.g()).d() : null;
      }
   }

   private static boolean a(cmr $$0, bve $$1) {
      return !$$1.a($$0, $$0.h(bwm.m));
   }

   private static boolean b(cmr $$0, bve $$1) {
      return $$1.f($$0) - 4.0F <= 0.0F;
   }

   private static boolean c(arq $$0, cmr $$1) {
      jh $$2 = $$1.dy();

      for (int $$3 = 1; $$3 <= 4; $$3++) {
         jh $$4 = $$2.a(jm.b, $$3);
         if (!$$0.a_($$4).l() && !$$0.b_($$4).a(axj.a)) {
            return false;
         }
      }

      return true;
   }

   private static Optional<ezr> a(cmr $$0, azv $$1, ezr $$2) {
      for (int $$4 : ae.a(j, $$1)) {
         float $$5 = 0.058333334F * (float)$$0.h(bwm.m);
         Optional<ezr> $$6 = byb.a($$0, $$2, $$5, $$4, false);
         if ($$6.isPresent()) {
            return $$6;
         }
      }

      return Optional.empty();
   }
}
