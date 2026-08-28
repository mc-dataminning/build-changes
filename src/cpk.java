import com.google.common.annotations.VisibleForTesting;
import com.google.common.collect.Lists;
import it.unimi.dsi.fastutil.objects.ObjectArrayList;
import java.util.Map;
import java.util.Optional;
import javax.annotation.Nullable;

public class cpk extends bza<cph> {
   private static final int c = 4;
   private static final int d = 10;
   private static final int e = 2;
   private static final int f = Math.round(10.0F);
   private static final float g = 24.0F;
   private static final float h = 1.4F;
   private static final float i = 0.058333334F;
   private static final ObjectArrayList<Integer> j = new ObjectArrayList(Lists.newArrayList(new Integer[]{40, 55, 60, 75, 80}));

   @VisibleForTesting
   public cpk() {
      super(Map.of(cgl.p, cgm.a, cgl.aV, cgm.b, cgl.ba, cgm.c, cgl.bb, cgm.c, cgl.aW, cgm.b, cgl.n, cgm.b, cgl.bc, cgm.c), 200);
   }

   public static boolean a(arq $$0, cph $$1) {
      if (!$$1.aH() && !$$1.bh()) {
         return false;
      } else if (cbu.a($$1)) {
         return false;
      } else if ($$1.eb().a(cgl.bb, cgm.a)) {
         return true;
      } else {
         bxj $$2 = $$1.eb().c(cgl.p).orElse(null);
         if ($$2 == null) {
            return false;
         } else if (a($$1, $$2)) {
            $$1.eb().b(cgl.p);
            return false;
         } else if (b($$1, $$2)) {
            return false;
         } else if (!c($$0, $$1)) {
            return false;
         } else {
            iv $$3 = a($$1, cpj.a($$2, $$1.dX()));
            if ($$3 == null) {
               return false;
            } else {
               eao $$4 = $$0.a_($$3.e());
               if ($$1.an().a($$4)) {
                  return false;
               } else if (!cpj.a($$1, $$3.b()) && !cpj.a($$1, $$3.b(4).b())) {
                  return false;
               } else {
                  $$1.eb().a(cgl.bb, $$3);
                  return true;
               }
            }
         }
      }
   }

   protected boolean b(arq $$0, cph $$1) {
      return a($$0, $$1);
   }

   protected boolean a(arq $$0, cph $$1, long $$2) {
      return $$1.at() != bxv.a && !$$1.eb().a(cgl.aV);
   }

   protected void b(arq $$0, cph $$1, long $$2) {
      if ($$1.eb().a(cgl.ba, cgm.b)) {
         $$1.eb().a(cgl.ba, bau.a, (long)f);
      }

      $$1.b(bxv.r);
      $$0.a(null, $$1, awn.cE, awo.f, 1.0F, 1.0F);
      $$1.eb().c(cgl.bb).ifPresent($$1x -> $$1.a(ev.a.b, $$1x.b()));
   }

   protected void c(arq $$0, cph $$1, long $$2) {
      boolean $$3 = $$1.bh();
      if (!$$3 && $$1.eb().a(cgl.bc, cgm.a)) {
         $$1.eb().b(cgl.bc);
      }

      if (a($$1)) {
         fex $$4 = $$1.eb().c(cgl.bb).flatMap($$1x -> a($$1, $$1.dX(), fex.c($$1x))).orElse(null);
         if ($$4 == null) {
            $$1.b(bxv.a);
            return;
         }

         if ($$3) {
            $$1.eb().a(cgl.bc, bau.a);
         }

         $$1.a(awn.cK, 1.0F, 1.0F);
         $$1.b(bxv.g);
         $$1.w($$1.aV);
         $$1.q(true);
         $$1.i($$4);
      } else if (b($$1)) {
         $$1.a(awn.cL, 1.0F, 1.0F);
         $$1.b(bxv.a);
         $$1.q(false);
         boolean $$5 = $$1.eb().a(cgl.y);
         $$1.eb().a(cgl.aV, bau.a, $$5 ? 2L : 10L);
         $$1.eb().a(cgl.aW, bau.a, 100L);
      }
   }

   protected void d(arq $$0, cph $$1, long $$2) {
      if ($$1.at() == bxv.g || $$1.at() == bxv.r) {
         $$1.b(bxv.a);
      }

      $$1.eb().b(cgl.bb);
      $$1.eb().b(cgl.ba);
      $$1.eb().b(cgl.bc);
   }

   private static boolean a(cph $$0) {
      return $$0.eb().c(cgl.ba).isEmpty() && $$0.at() == bxv.r;
   }

   private static boolean b(cph $$0) {
      boolean $$1 = $$0.at() == bxv.g;
      boolean $$2 = $$0.aH();
      boolean $$3 = $$0.bh() && $$0.eb().a(cgl.bc, cgm.b);
      return $$1 && ($$2 || $$3);
   }

   @Nullable
   private static iv a(bxj $$0, fex $$1) {
      diq $$2 = new diq($$1, $$1.a(jb.a, 10.0), diq.a.a, diq.b.a, $$0);
      fev $$3 = $$0.dU().a($$2);
      if ($$3.d() == fev.a.b) {
         return iv.a((jp)$$3.g()).d();
      } else {
         diq $$4 = new diq($$1, $$1.a(jb.b, 10.0), diq.a.a, diq.b.a, $$0);
         fev $$5 = $$0.dU().a($$4);
         return $$5.d() == fev.a.b ? iv.a((jp)$$5.g()).d() : null;
      }
   }

   private static boolean a(cph $$0, bxj $$1) {
      return !$$1.a($$0, $$0.h(byp.m));
   }

   private static boolean b(cph $$0, bxj $$1) {
      return $$1.f($$0) - 4.0F <= 0.0F;
   }

   private static boolean c(arq $$0, cph $$1) {
      iv $$2 = $$1.du();
      if ($$0.a_($$2).a(dmo.pO)) {
         return false;
      } else {
         for (int $$3 = 1; $$3 <= 4; $$3++) {
            iv $$4 = $$2.a(jb.b, $$3);
            if (!$$0.a_($$4).l() && !$$0.b_($$4).a(axh.a)) {
               return false;
            }
         }

         return true;
      }
   }

   private static Optional<fex> a(cph $$0, azv $$1, fex $$2) {
      for (int $$4 : ag.a(j, $$1)) {
         float $$5 = 0.058333334F * (float)$$0.h(byp.m);
         Optional<fex> $$6 = cae.a($$0, $$2, $$5, $$4, false);
         if ($$6.isPresent()) {
            if ($$0.b(bvo.h)) {
               double $$7 = $$6.get().d().e * (double)$$0.fh();
               return $$6.map($$1x -> $$1x.b(0.0, $$7, 0.0));
            }

            return $$6;
         }
      }

      return Optional.empty();
   }
}
