import com.google.common.annotations.VisibleForTesting;
import com.google.common.collect.Lists;
import it.unimi.dsi.fastutil.objects.ObjectArrayList;
import java.util.Map;
import java.util.Optional;
import javax.annotation.Nullable;

public class cnr extends bxu<cno> {
   private static final int c = 4;
   private static final int d = 10;
   private static final int e = 2;
   private static final int f = Math.round(10.0F);
   private static final float g = 24.0F;
   private static final float h = 1.4F;
   private static final float i = 0.058333334F;
   private static final ObjectArrayList<Integer> j = new ObjectArrayList(Lists.newArrayList(new Integer[]{40, 55, 60, 75, 80}));

   @VisibleForTesting
   public cnr() {
      super(Map.of(cff.o, cfg.a, cff.aU, cfg.b, cff.aZ, cfg.c, cff.ba, cfg.c, cff.aV, cfg.b, cff.m, cfg.b, cff.bb, cfg.c), 200);
   }

   public static boolean a(ash $$0, cno $$1) {
      if (!$$1.aJ() && !$$1.bj()) {
         return false;
      } else if (cao.a($$1)) {
         return false;
      } else if ($$1.eb().a(cff.ba, cfg.a)) {
         return true;
      } else {
         bwb $$2 = $$1.eb().c(cff.o).orElse(null);
         if ($$2 == null) {
            return false;
         } else if (a($$1, $$2)) {
            $$1.eb().b(cff.o);
            return false;
         } else if (b($$1, $$2)) {
            return false;
         } else if (!c($$0, $$1)) {
            return false;
         } else {
            jh $$3 = a($$1, cnq.a($$2, $$1.dY()));
            if ($$3 == null) {
               return false;
            } else {
               dxn $$4 = $$0.a_($$3.e());
               if ($$1.aq().a($$4)) {
                  return false;
               } else if (!cnq.a($$1, $$3.b()) && !cnq.a($$1, $$3.b(4).b())) {
                  return false;
               } else {
                  $$1.eb().a(cff.ba, $$3);
                  return true;
               }
            }
         }
      }
   }

   protected boolean b(ash $$0, cno $$1) {
      return a($$0, $$1);
   }

   protected boolean a(ash $$0, cno $$1, long $$2) {
      return $$1.aw() != bwn.a && !$$1.eb().a(cff.aU);
   }

   protected void b(ash $$0, cno $$1, long $$2) {
      if ($$1.eb().a(cff.aZ, cfg.b)) {
         $$1.eb().a(cff.aZ, bbk.a, (long)f);
      }

      $$1.b(bwn.r);
      $$0.a(null, $$1, axf.cE, axg.f, 1.0F, 1.0F);
      $$1.eb().c(cff.ba).ifPresent($$1x -> $$1.a(fi.a.b, $$1x.b()));
   }

   protected void c(ash $$0, cno $$1, long $$2) {
      boolean $$3 = $$1.bj();
      if (!$$3 && $$1.eb().a(cff.bb, cfg.a)) {
         $$1.eb().b(cff.bb);
      }

      if (a($$1)) {
         fbs $$4 = $$1.eb().c(cff.ba).flatMap($$1x -> a($$1, $$1.dY(), fbs.c($$1x))).orElse(null);
         if ($$4 == null) {
            $$1.b(bwn.a);
            return;
         }

         if ($$3) {
            $$1.eb().a(cff.bb, bbk.a);
         }

         $$1.a(axf.cK, 1.0F, 1.0F);
         $$1.b(bwn.g);
         $$1.v($$1.aX);
         $$1.r(true);
         $$1.h($$4);
      } else if (b($$1)) {
         $$1.a(axf.cL, 1.0F, 1.0F);
         $$1.b(bwn.a);
         $$1.r(false);
         boolean $$5 = $$1.eb().a(cff.x);
         $$1.eb().a(cff.aU, bbk.a, $$5 ? 2L : 10L);
         $$1.eb().a(cff.aV, bbk.a, 100L);
      }
   }

   protected void d(ash $$0, cno $$1, long $$2) {
      if ($$1.aw() == bwn.g || $$1.aw() == bwn.r) {
         $$1.b(bwn.a);
      }

      $$1.eb().b(cff.ba);
      $$1.eb().b(cff.aZ);
      $$1.eb().b(cff.bb);
   }

   private static boolean a(cno $$0) {
      return $$0.eb().c(cff.aZ).isEmpty() && $$0.aw() == bwn.r;
   }

   private static boolean b(cno $$0) {
      boolean $$1 = $$0.aw() == bwn.g;
      boolean $$2 = $$0.aJ();
      boolean $$3 = $$0.bj() && $$0.eb().a(cff.bb, cfg.b);
      return $$1 && ($$2 || $$3);
   }

   @Nullable
   private static jh a(bwb $$0, fbs $$1) {
      dgi $$2 = new dgi($$1, $$1.a(jm.a, 10.0), dgi.a.a, dgi.b.a, $$0);
      fbq $$3 = $$0.dV().a($$2);
      if ($$3.d() == fbq.a.b) {
         return jh.a((ka)$$3.g()).d();
      } else {
         dgi $$4 = new dgi($$1, $$1.a(jm.b, 10.0), dgi.a.a, dgi.b.a, $$0);
         fbq $$5 = $$0.dV().a($$4);
         return $$5.d() == fbq.a.b ? jh.a((ka)$$5.g()).d() : null;
      }
   }

   private static boolean a(cno $$0, bwb $$1) {
      return !$$1.a($$0, $$0.h(bxj.m));
   }

   private static boolean b(cno $$0, bwb $$1) {
      return $$1.f($$0) - 4.0F <= 0.0F;
   }

   private static boolean c(ash $$0, cno $$1) {
      jh $$2 = $$1.dv();

      for (int $$3 = 1; $$3 <= 4; $$3++) {
         jh $$4 = $$2.a(jm.b, $$3);
         if (!$$0.a_($$4).l() && !$$0.b_($$4).a(aya.a)) {
            return false;
         }
      }

      return true;
   }

   private static Optional<fbs> a(cno $$0, bam $$1, fbs $$2) {
      for (int $$4 : ae.a(j, $$1)) {
         float $$5 = 0.058333334F * (float)$$0.h(bxj.m);
         Optional<fbs> $$6 = byy.a($$0, $$2, $$5, $$4, false);
         if ($$6.isPresent()) {
            return $$6;
         }
      }

      return Optional.empty();
   }
}
