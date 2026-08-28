import com.google.common.annotations.VisibleForTesting;
import com.google.common.collect.Lists;
import it.unimi.dsi.fastutil.objects.ObjectArrayList;
import java.util.Map;
import java.util.Optional;
import javax.annotation.Nullable;

public class cmw extends bwz<cmt> {
   private static final int c = 4;
   private static final int d = 10;
   private static final int e = 2;
   private static final int f = Math.round(10.0F);
   private static final float g = 24.0F;
   private static final float h = 1.4F;
   private static final float i = 0.058333334F;
   private static final ObjectArrayList<Integer> j = new ObjectArrayList(Lists.newArrayList(new Integer[]{40, 55, 60, 75, 80}));

   @VisibleForTesting
   public cmw() {
      super(Map.of(cek.o, cel.a, cek.aU, cel.b, cek.aZ, cel.c, cek.ba, cel.c, cek.aV, cel.b, cek.m, cel.b, cek.bb, cel.c), 200);
   }

   public static boolean a(ard $$0, cmt $$1) {
      if (!$$1.aJ() && !$$1.bj()) {
         return false;
      } else if (bzt.a($$1)) {
         return false;
      } else if ($$1.eb().a(cek.ba, cel.a)) {
         return true;
      } else {
         bvg $$2 = $$1.eb().c(cek.o).orElse(null);
         if ($$2 == null) {
            return false;
         } else if (a($$1, $$2)) {
            $$1.eb().b(cek.o);
            return false;
         } else if (b($$1, $$2)) {
            return false;
         } else if (!c($$0, $$1)) {
            return false;
         } else {
            ji $$3 = a($$1, cmv.a($$2, $$1.dY()));
            if ($$3 == null) {
               return false;
            } else {
               dww $$4 = $$0.a_($$3.e());
               if ($$1.aq().a($$4)) {
                  return false;
               } else if (!cmv.a($$1, $$3.b()) && !cmv.a($$1, $$3.b(4).b())) {
                  return false;
               } else {
                  $$1.eb().a(cek.ba, $$3);
                  return true;
               }
            }
         }
      }
   }

   protected boolean b(ard $$0, cmt $$1) {
      return a($$0, $$1);
   }

   protected boolean a(ard $$0, cmt $$1, long $$2) {
      return $$1.aw() != bvs.a && !$$1.eb().a(cek.aU);
   }

   protected void b(ard $$0, cmt $$1, long $$2) {
      if ($$1.eb().a(cek.aZ, cel.b)) {
         $$1.eb().a(cek.aZ, baf.a, (long)f);
      }

      $$1.b(bvs.r);
      $$0.a(null, $$1, awa.cE, awb.f, 1.0F, 1.0F);
      $$1.eb().c(cek.ba).ifPresent($$1x -> $$1.a(fj.a.b, $$1x.b()));
   }

   protected void c(ard $$0, cmt $$1, long $$2) {
      boolean $$3 = $$1.bj();
      if (!$$3 && $$1.eb().a(cek.bb, cel.a)) {
         $$1.eb().b(cek.bb);
      }

      if (a($$1)) {
         faz $$4 = $$1.eb().c(cek.ba).flatMap($$1x -> a($$1, $$1.dY(), faz.c($$1x))).orElse(null);
         if ($$4 == null) {
            $$1.b(bvs.a);
            return;
         }

         if ($$3) {
            $$1.eb().a(cek.bb, baf.a);
         }

         $$1.a(awa.cK, 1.0F, 1.0F);
         $$1.b(bvs.g);
         $$1.v($$1.aX);
         $$1.r(true);
         $$1.i($$4);
      } else if (b($$1)) {
         $$1.a(awa.cL, 1.0F, 1.0F);
         $$1.b(bvs.a);
         $$1.r(false);
         boolean $$5 = $$1.eb().a(cek.x);
         $$1.eb().a(cek.aU, baf.a, $$5 ? 2L : 10L);
         $$1.eb().a(cek.aV, baf.a, 100L);
      }
   }

   protected void d(ard $$0, cmt $$1, long $$2) {
      if ($$1.aw() == bvs.g || $$1.aw() == bvs.r) {
         $$1.b(bvs.a);
      }

      $$1.eb().b(cek.ba);
      $$1.eb().b(cek.aZ);
      $$1.eb().b(cek.bb);
   }

   private static boolean a(cmt $$0) {
      return $$0.eb().c(cek.aZ).isEmpty() && $$0.aw() == bvs.r;
   }

   private static boolean b(cmt $$0) {
      boolean $$1 = $$0.aw() == bvs.g;
      boolean $$2 = $$0.aJ();
      boolean $$3 = $$0.bj() && $$0.eb().a(cek.bb, cel.b);
      return $$1 && ($$2 || $$3);
   }

   @Nullable
   private static ji a(bvg $$0, faz $$1) {
      dfp $$2 = new dfp($$1, $$1.a(jn.a, 10.0), dfp.a.a, dfp.b.a, $$0);
      fax $$3 = $$0.dV().a($$2);
      if ($$3.d() == fax.a.b) {
         return ji.a((kb)$$3.g()).d();
      } else {
         dfp $$4 = new dfp($$1, $$1.a(jn.b, 10.0), dfp.a.a, dfp.b.a, $$0);
         fax $$5 = $$0.dV().a($$4);
         return $$5.d() == fax.a.b ? ji.a((kb)$$5.g()).d() : null;
      }
   }

   private static boolean a(cmt $$0, bvg $$1) {
      return !$$1.a($$0, $$0.h(bwo.m));
   }

   private static boolean b(cmt $$0, bvg $$1) {
      return $$1.f($$0) - 4.0F <= 0.0F;
   }

   private static boolean c(ard $$0, cmt $$1) {
      ji $$2 = $$1.dv();
      if ($$0.a_($$2).a(djn.pI)) {
         return false;
      } else {
         for (int $$3 = 1; $$3 <= 4; $$3++) {
            ji $$4 = $$2.a(jn.b, $$3);
            if (!$$0.a_($$4).l() && !$$0.b_($$4).a(awv.a)) {
               return false;
            }
         }

         return true;
      }
   }

   private static Optional<faz> a(cmt $$0, azh $$1, faz $$2) {
      for (int $$4 : af.a(j, $$1)) {
         float $$5 = 0.058333334F * (float)$$0.h(bwo.m);
         Optional<faz> $$6 = byd.a($$0, $$2, $$5, $$4, false);
         if ($$6.isPresent()) {
            if ($$0.b(btr.h)) {
               double $$7 = $$6.get().d().e * (double)$$0.fk();
               return $$6.map($$1x -> $$1x.b(0.0, $$7, 0.0));
            }

            return $$6;
         }
      }

      return Optional.empty();
   }
}
