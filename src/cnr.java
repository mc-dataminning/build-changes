import com.google.common.annotations.VisibleForTesting;
import com.google.common.collect.Lists;
import it.unimi.dsi.fastutil.objects.ObjectArrayList;
import java.util.Map;
import java.util.Optional;
import javax.annotation.Nullable;

public class cnr extends bxr<cno> {
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
      super(Map.of(cfc.o, cfd.a, cfc.aU, cfd.b, cfc.aZ, cfd.c, cfc.ba, cfd.c, cfc.aV, cfd.b, cfc.m, cfd.b, cfc.bb, cfd.c), 200);
   }

   public static boolean a(ard $$0, cno $$1) {
      if (!$$1.aJ() && !$$1.bj()) {
         return false;
      } else if (cal.a($$1)) {
         return false;
      } else if ($$1.ea().a(cfc.ba, cfd.a)) {
         return true;
      } else {
         bvy $$2 = $$1.ea().c(cfc.o).orElse(null);
         if ($$2 == null) {
            return false;
         } else if (a($$1, $$2)) {
            $$1.ea().b(cfc.o);
            return false;
         } else if (b($$1, $$2)) {
            return false;
         } else if (!c($$0, $$1)) {
            return false;
         } else {
            ji $$3 = a($$1, cnq.a($$2, $$1.dX()));
            if ($$3 == null) {
               return false;
            } else {
               dxq $$4 = $$0.a_($$3.e());
               if ($$1.aq().a($$4)) {
                  return false;
               } else if (!cnq.a($$1, $$3.b()) && !cnq.a($$1, $$3.b(4).b())) {
                  return false;
               } else {
                  $$1.ea().a(cfc.ba, $$3);
                  return true;
               }
            }
         }
      }
   }

   protected boolean b(ard $$0, cno $$1) {
      return a($$0, $$1);
   }

   protected boolean a(ard $$0, cno $$1, long $$2) {
      return $$1.aw() != bwk.a && !$$1.ea().a(cfc.aU);
   }

   protected void b(ard $$0, cno $$1, long $$2) {
      if ($$1.ea().a(cfc.aZ, cfd.b)) {
         $$1.ea().a(cfc.aZ, baf.a, (long)f);
      }

      $$1.b(bwk.r);
      $$0.a(null, $$1, awa.cE, awb.f, 1.0F, 1.0F);
      $$1.ea().c(cfc.ba).ifPresent($$1x -> $$1.a(fj.a.b, $$1x.b()));
   }

   protected void c(ard $$0, cno $$1, long $$2) {
      boolean $$3 = $$1.bj();
      if (!$$3 && $$1.ea().a(cfc.bb, cfd.a)) {
         $$1.ea().b(cfc.bb);
      }

      if (a($$1)) {
         fbx $$4 = $$1.ea().c(cfc.ba).flatMap($$1x -> a($$1, $$1.dX(), fbx.c($$1x))).orElse(null);
         if ($$4 == null) {
            $$1.b(bwk.a);
            return;
         }

         if ($$3) {
            $$1.ea().a(cfc.bb, baf.a);
         }

         $$1.a(awa.cK, 1.0F, 1.0F);
         $$1.b(bwk.g);
         $$1.w($$1.aV);
         $$1.q(true);
         $$1.i($$4);
      } else if (b($$1)) {
         $$1.a(awa.cL, 1.0F, 1.0F);
         $$1.b(bwk.a);
         $$1.q(false);
         boolean $$5 = $$1.ea().a(cfc.x);
         $$1.ea().a(cfc.aU, baf.a, $$5 ? 2L : 10L);
         $$1.ea().a(cfc.aV, baf.a, 100L);
      }
   }

   protected void d(ard $$0, cno $$1, long $$2) {
      if ($$1.aw() == bwk.g || $$1.aw() == bwk.r) {
         $$1.b(bwk.a);
      }

      $$1.ea().b(cfc.ba);
      $$1.ea().b(cfc.aZ);
      $$1.ea().b(cfc.bb);
   }

   private static boolean a(cno $$0) {
      return $$0.ea().c(cfc.aZ).isEmpty() && $$0.aw() == bwk.r;
   }

   private static boolean b(cno $$0) {
      boolean $$1 = $$0.aw() == bwk.g;
      boolean $$2 = $$0.aJ();
      boolean $$3 = $$0.bj() && $$0.ea().a(cfc.bb, cfd.b);
      return $$1 && ($$2 || $$3);
   }

   @Nullable
   private static ji a(bvy $$0, fbx $$1) {
      dgi $$2 = new dgi($$1, $$1.a(jn.a, 10.0), dgi.a.a, dgi.b.a, $$0);
      fbv $$3 = $$0.dU().a($$2);
      if ($$3.d() == fbv.a.b) {
         return ji.a((kb)$$3.g()).d();
      } else {
         dgi $$4 = new dgi($$1, $$1.a(jn.b, 10.0), dgi.a.a, dgi.b.a, $$0);
         fbv $$5 = $$0.dU().a($$4);
         return $$5.d() == fbv.a.b ? ji.a((kb)$$5.g()).d() : null;
      }
   }

   private static boolean a(cno $$0, bvy $$1) {
      return !$$1.a($$0, $$0.h(bxg.m));
   }

   private static boolean b(cno $$0, bvy $$1) {
      return $$1.f($$0) - 4.0F <= 0.0F;
   }

   private static boolean c(ard $$0, cno $$1) {
      ji $$2 = $$1.du();
      if ($$0.a_($$2).a(dkg.pI)) {
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

   private static Optional<fbx> a(cno $$0, azh $$1, fbx $$2) {
      for (int $$4 : af.a(j, $$1)) {
         float $$5 = 0.058333334F * (float)$$0.h(bxg.m);
         Optional<fbx> $$6 = byv.a($$0, $$2, $$5, $$4, false);
         if ($$6.isPresent()) {
            if ($$0.b(bug.h)) {
               double $$7 = $$6.get().d().e * (double)$$0.fk();
               return $$6.map($$1x -> $$1x.b(0.0, $$7, 0.0));
            }

            return $$6;
         }
      }

      return Optional.empty();
   }
}
