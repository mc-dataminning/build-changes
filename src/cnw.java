import com.google.common.annotations.VisibleForTesting;
import com.google.common.collect.Lists;
import it.unimi.dsi.fastutil.objects.ObjectArrayList;
import java.util.Map;
import java.util.Optional;
import javax.annotation.Nullable;

public class cnw extends bxz<cnt> {
   private static final int c = 4;
   private static final int d = 10;
   private static final int e = 2;
   private static final int f = Math.round(10.0F);
   private static final float g = 24.0F;
   private static final float h = 1.4F;
   private static final float i = 0.058333334F;
   private static final ObjectArrayList<Integer> j = new ObjectArrayList(Lists.newArrayList(new Integer[]{40, 55, 60, 75, 80}));

   @VisibleForTesting
   public cnw() {
      super(Map.of(cfk.o, cfl.a, cfk.aU, cfl.b, cfk.aZ, cfl.c, cfk.ba, cfl.c, cfk.aV, cfl.b, cfk.m, cfl.b, cfk.bb, cfl.c), 200);
   }

   public static boolean a(ash $$0, cnt $$1) {
      if (!$$1.aJ() && !$$1.bj()) {
         return false;
      } else if (cat.a($$1)) {
         return false;
      } else if ($$1.ec().a(cfk.ba, cfl.a)) {
         return true;
      } else {
         bwg $$2 = $$1.ec().c(cfk.o).orElse(null);
         if ($$2 == null) {
            return false;
         } else if (a($$1, $$2)) {
            $$1.ec().b(cfk.o);
            return false;
         } else if (b($$1, $$2)) {
            return false;
         } else if (!c($$0, $$1)) {
            return false;
         } else {
            jh $$3 = a($$1, cnv.a($$2, $$1.dZ()));
            if ($$3 == null) {
               return false;
            } else {
               dxv $$4 = $$0.a_($$3.e());
               if ($$1.aq().a($$4)) {
                  return false;
               } else if (!cnv.a($$1, $$3.b()) && !cnv.a($$1, $$3.b(4).b())) {
                  return false;
               } else {
                  $$1.ec().a(cfk.ba, $$3);
                  return true;
               }
            }
         }
      }
   }

   protected boolean b(ash $$0, cnt $$1) {
      return a($$0, $$1);
   }

   protected boolean a(ash $$0, cnt $$1, long $$2) {
      return $$1.aw() != bws.a && !$$1.ec().a(cfk.aU);
   }

   protected void b(ash $$0, cnt $$1, long $$2) {
      if ($$1.ec().a(cfk.aZ, cfl.b)) {
         $$1.ec().a(cfk.aZ, bbk.a, (long)f);
      }

      $$1.b(bws.r);
      $$0.a(null, $$1, axf.cE, axg.f, 1.0F, 1.0F);
      $$1.ec().c(cfk.ba).ifPresent($$1x -> $$1.a(fi.a.b, $$1x.b()));
   }

   protected void c(ash $$0, cnt $$1, long $$2) {
      boolean $$3 = $$1.bj();
      if (!$$3 && $$1.ec().a(cfk.bb, cfl.a)) {
         $$1.ec().b(cfk.bb);
      }

      if (a($$1)) {
         fby $$4 = $$1.ec().c(cfk.ba).flatMap($$1x -> a($$1, $$1.dZ(), fby.c($$1x))).orElse(null);
         if ($$4 == null) {
            $$1.b(bws.a);
            return;
         }

         if ($$3) {
            $$1.ec().a(cfk.bb, bbk.a);
         }

         $$1.a(axf.cK, 1.0F, 1.0F);
         $$1.b(bws.g);
         $$1.v($$1.aX);
         $$1.r(true);
         $$1.h($$4);
      } else if (b($$1)) {
         $$1.a(axf.cL, 1.0F, 1.0F);
         $$1.b(bws.a);
         $$1.r(false);
         boolean $$5 = $$1.ec().a(cfk.x);
         $$1.ec().a(cfk.aU, bbk.a, $$5 ? 2L : 10L);
         $$1.ec().a(cfk.aV, bbk.a, 100L);
      }
   }

   protected void d(ash $$0, cnt $$1, long $$2) {
      if ($$1.aw() == bws.g || $$1.aw() == bws.r) {
         $$1.b(bws.a);
      }

      $$1.ec().b(cfk.ba);
      $$1.ec().b(cfk.aZ);
      $$1.ec().b(cfk.bb);
   }

   private static boolean a(cnt $$0) {
      return $$0.ec().c(cfk.aZ).isEmpty() && $$0.aw() == bws.r;
   }

   private static boolean b(cnt $$0) {
      boolean $$1 = $$0.aw() == bws.g;
      boolean $$2 = $$0.aJ();
      boolean $$3 = $$0.bj() && $$0.ec().a(cfk.bb, cfl.b);
      return $$1 && ($$2 || $$3);
   }

   @Nullable
   private static jh a(bwg $$0, fby $$1) {
      dgq $$2 = new dgq($$1, $$1.a(jm.a, 10.0), dgq.a.a, dgq.b.a, $$0);
      fbw $$3 = $$0.dW().a($$2);
      if ($$3.d() == fbw.a.b) {
         return jh.a((ka)$$3.g()).d();
      } else {
         dgq $$4 = new dgq($$1, $$1.a(jm.b, 10.0), dgq.a.a, dgq.b.a, $$0);
         fbw $$5 = $$0.dW().a($$4);
         return $$5.d() == fbw.a.b ? jh.a((ka)$$5.g()).d() : null;
      }
   }

   private static boolean a(cnt $$0, bwg $$1) {
      return !$$1.a($$0, $$0.h(bxo.m));
   }

   private static boolean b(cnt $$0, bwg $$1) {
      return $$1.f($$0) - 4.0F <= 0.0F;
   }

   private static boolean c(ash $$0, cnt $$1) {
      jh $$2 = $$1.dw();
      if ($$0.a_($$2).a(dko.pB)) {
         return false;
      } else {
         for (int $$3 = 1; $$3 <= 4; $$3++) {
            jh $$4 = $$2.a(jm.b, $$3);
            if (!$$0.a_($$4).l() && !$$0.b_($$4).a(aya.a)) {
               return false;
            }
         }

         return true;
      }
   }

   private static Optional<fby> a(cnt $$0, bam $$1, fby $$2) {
      for (int $$4 : ae.a(j, $$1)) {
         float $$5 = 0.058333334F * (float)$$0.h(bxo.m);
         Optional<fby> $$6 = bzd.a($$0, $$2, $$5, $$4, false);
         if ($$6.isPresent()) {
            if ($$0.b(bur.h)) {
               double $$7 = $$6.get().d().e * (double)$$0.fk();
               return $$6.map($$1x -> $$1x.b(0.0, $$7, 0.0));
            }

            return $$6;
         }
      }

      return Optional.empty();
   }
}
