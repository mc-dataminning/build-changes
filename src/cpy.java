import com.google.common.annotations.VisibleForTesting;
import com.google.common.collect.Lists;
import it.unimi.dsi.fastutil.objects.ObjectArrayList;
import java.util.Map;
import java.util.Optional;
import javax.annotation.Nullable;

public class cpy extends bzl<cpv> {
   private static final int c = 4;
   private static final int d = 10;
   private static final int e = 2;
   private static final int f = Math.round(10.0F);
   private static final float g = 24.0F;
   private static final float h = 1.4F;
   private static final float i = 0.058333334F;
   private static final ObjectArrayList<Integer> j = new ObjectArrayList(Lists.newArrayList(new Integer[]{40, 55, 60, 75, 80}));

   @VisibleForTesting
   public cpy() {
      super(Map.of(cgw.p, cgx.a, cgw.aV, cgx.b, cgw.ba, cgx.c, cgw.bb, cgx.c, cgw.aW, cgx.b, cgw.n, cgx.b, cgw.bc, cgx.c), 200);
   }

   public static boolean a(ars $$0, cpv $$1) {
      if (!$$1.aH() && !$$1.bi()) {
         return false;
      } else if (ccf.a($$1)) {
         return false;
      } else if ($$1.ec().a(cgw.bb, cgx.a)) {
         return true;
      } else {
         bxu $$2 = $$1.ec().c(cgw.p).orElse(null);
         if ($$2 == null) {
            return false;
         } else if (a($$1, $$2)) {
            $$1.ec().b(cgw.p);
            return false;
         } else if (b($$1, $$2)) {
            return false;
         } else if (!c($$0, $$1)) {
            return false;
         } else {
            iv $$3 = a($$1, cpx.a($$2, $$1.dY()));
            if ($$3 == null) {
               return false;
            } else {
               ebe $$4 = $$0.a_($$3.e());
               if ($$1.an().a($$4)) {
                  return false;
               } else if (!cpx.a($$1, $$3.b()) && !cpx.a($$1, $$3.b(4).b())) {
                  return false;
               } else {
                  $$1.ec().a(cgw.bb, $$3);
                  return true;
               }
            }
         }
      }
   }

   protected boolean b(ars $$0, cpv $$1) {
      return a($$0, $$1);
   }

   protected boolean a(ars $$0, cpv $$1, long $$2) {
      return $$1.at() != byg.a && !$$1.ec().a(cgw.aV);
   }

   protected void b(ars $$0, cpv $$1, long $$2) {
      if ($$1.ec().a(cgw.ba, cgx.b)) {
         $$1.ec().a(cgw.ba, baw.a, (long)f);
      }

      $$1.b(byg.r);
      $$0.a(null, $$1, awp.cE, awq.f, 1.0F, 1.0F);
      $$1.ec().c(cgw.bb).ifPresent($$1x -> $$1.a(ev.a.b, $$1x.b()));
   }

   protected void c(ars $$0, cpv $$1, long $$2) {
      boolean $$3 = $$1.bi();
      if (!$$3 && $$1.ec().a(cgw.bc, cgx.a)) {
         $$1.ec().b(cgw.bc);
      }

      if (a($$1)) {
         ffq $$4 = $$1.ec().c(cgw.bb).flatMap($$1x -> a($$1, $$1.dY(), ffq.c($$1x))).orElse(null);
         if ($$4 == null) {
            $$1.b(byg.a);
            return;
         }

         if ($$3) {
            $$1.ec().a(cgw.bc, baw.a);
         }

         $$1.a(awp.cK, 1.0F, 1.0F);
         $$1.b(byg.g);
         $$1.w($$1.aV);
         $$1.q(true);
         $$1.i($$4);
      } else if (b($$1)) {
         $$1.a(awp.cL, 1.0F, 1.0F);
         $$1.b(byg.a);
         $$1.q(false);
         boolean $$5 = $$1.ec().a(cgw.y);
         $$1.ec().a(cgw.aV, baw.a, $$5 ? 2L : 10L);
         $$1.ec().a(cgw.aW, baw.a, 100L);
      }
   }

   protected void d(ars $$0, cpv $$1, long $$2) {
      if ($$1.at() == byg.g || $$1.at() == byg.r) {
         $$1.b(byg.a);
      }

      $$1.ec().b(cgw.bb);
      $$1.ec().b(cgw.ba);
      $$1.ec().b(cgw.bc);
   }

   private static boolean a(cpv $$0) {
      return $$0.ec().c(cgw.ba).isEmpty() && $$0.at() == byg.r;
   }

   private static boolean b(cpv $$0) {
      boolean $$1 = $$0.at() == byg.g;
      boolean $$2 = $$0.aH();
      boolean $$3 = $$0.bi() && $$0.ec().a(cgw.bc, cgx.b);
      return $$1 && ($$2 || $$3);
   }

   @Nullable
   private static iv a(bxu $$0, ffq $$1) {
      dje $$2 = new dje($$1, $$1.a(jb.a, 10.0), dje.a.a, dje.b.a, $$0);
      ffo $$3 = $$0.dV().a($$2);
      if ($$3.d() == ffo.a.b) {
         return iv.a((jp)$$3.g()).d();
      } else {
         dje $$4 = new dje($$1, $$1.a(jb.b, 10.0), dje.a.a, dje.b.a, $$0);
         ffo $$5 = $$0.dV().a($$4);
         return $$5.d() == ffo.a.b ? iv.a((jp)$$5.g()).d() : null;
      }
   }

   private static boolean a(cpv $$0, bxu $$1) {
      return !$$1.a($$0, $$0.h(bza.m));
   }

   private static boolean b(cpv $$0, bxu $$1) {
      return $$1.f($$0) - 4.0F <= 0.0F;
   }

   private static boolean c(ars $$0, cpv $$1) {
      iv $$2 = $$1.dv();
      if ($$0.a_($$2).a(dne.pO)) {
         return false;
      } else {
         for (int $$3 = 1; $$3 <= 4; $$3++) {
            iv $$4 = $$2.a(jb.b, $$3);
            if (!$$0.a_($$4).l() && !$$0.b_($$4).a(axj.a)) {
               return false;
            }
         }

         return true;
      }
   }

   private static Optional<ffq> a(cpv $$0, azx $$1, ffq $$2) {
      for (int $$4 : ag.a(j, $$1)) {
         float $$5 = 0.058333334F * (float)$$0.h(bza.m);
         Optional<ffq> $$6 = cap.a($$0, $$2, $$5, $$4, false);
         if ($$6.isPresent()) {
            if ($$0.b(bvz.h)) {
               double $$7 = $$6.get().d().e * (double)$$0.fi();
               return $$6.map($$1x -> $$1x.b(0.0, $$7, 0.0));
            }

            return $$6;
         }
      }

      return Optional.empty();
   }
}
