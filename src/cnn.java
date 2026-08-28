import com.google.common.annotations.VisibleForTesting;
import com.google.common.collect.Lists;
import it.unimi.dsi.fastutil.objects.ObjectArrayList;
import java.util.Map;
import java.util.Optional;
import javax.annotation.Nullable;

public class cnn extends bxq<cnk> {
   private static final int c = 4;
   private static final int d = 10;
   private static final int e = 2;
   private static final int f = Math.round(10.0F);
   private static final float g = 24.0F;
   private static final float h = 1.4F;
   private static final float i = 0.058333334F;
   private static final ObjectArrayList<Integer> j = new ObjectArrayList(Lists.newArrayList(new Integer[]{40, 55, 60, 75, 80}));

   @VisibleForTesting
   public cnn() {
      super(Map.of(cfb.o, cfc.a, cfb.aU, cfc.b, cfb.aZ, cfc.c, cfb.ba, cfc.c, cfb.aV, cfc.b, cfb.m, cfc.b, cfb.bb, cfc.c), 200);
   }

   public static boolean a(arx $$0, cnk $$1) {
      if (!$$1.aJ() && !$$1.bj()) {
         return false;
      } else if (cak.a($$1)) {
         return false;
      } else if ($$1.ec().a(cfb.ba, cfc.a)) {
         return true;
      } else {
         bvx $$2 = $$1.ec().c(cfb.o).orElse(null);
         if ($$2 == null) {
            return false;
         } else if (a($$1, $$2)) {
            $$1.ec().b(cfb.o);
            return false;
         } else if (b($$1, $$2)) {
            return false;
         } else if (!c($$0, $$1)) {
            return false;
         } else {
            jh $$3 = a($$1, cnm.a($$2, $$1.dZ()));
            if ($$3 == null) {
               return false;
            } else {
               dxo $$4 = $$0.a_($$3.e());
               if ($$1.aq().a($$4)) {
                  return false;
               } else if (!cnm.a($$1, $$3.b()) && !cnm.a($$1, $$3.b(4).b())) {
                  return false;
               } else {
                  $$1.ec().a(cfb.ba, $$3);
                  return true;
               }
            }
         }
      }
   }

   protected boolean b(arx $$0, cnk $$1) {
      return a($$0, $$1);
   }

   protected boolean a(arx $$0, cnk $$1, long $$2) {
      return $$1.aw() != bwj.a && !$$1.ec().a(cfb.aU);
   }

   protected void b(arx $$0, cnk $$1, long $$2) {
      if ($$1.ec().a(cfb.aZ, cfc.b)) {
         $$1.ec().a(cfb.aZ, bba.a, (long)f);
      }

      $$1.b(bwj.r);
      $$0.a(null, $$1, awv.cE, aww.f, 1.0F, 1.0F);
      $$1.ec().c(cfb.ba).ifPresent($$1x -> $$1.a(fi.a.b, $$1x.b()));
   }

   protected void c(arx $$0, cnk $$1, long $$2) {
      boolean $$3 = $$1.bj();
      if (!$$3 && $$1.ec().a(cfb.bb, cfc.a)) {
         $$1.ec().b(cfb.bb);
      }

      if (a($$1)) {
         fbr $$4 = $$1.ec().c(cfb.ba).flatMap($$1x -> a($$1, $$1.dZ(), fbr.c($$1x))).orElse(null);
         if ($$4 == null) {
            $$1.b(bwj.a);
            return;
         }

         if ($$3) {
            $$1.ec().a(cfb.bb, bba.a);
         }

         $$1.a(awv.cK, 1.0F, 1.0F);
         $$1.b(bwj.g);
         $$1.v($$1.aX);
         $$1.r(true);
         $$1.h($$4);
      } else if (b($$1)) {
         $$1.a(awv.cL, 1.0F, 1.0F);
         $$1.b(bwj.a);
         $$1.r(false);
         boolean $$5 = $$1.ec().a(cfb.x);
         $$1.ec().a(cfb.aU, bba.a, $$5 ? 2L : 10L);
         $$1.ec().a(cfb.aV, bba.a, 100L);
      }
   }

   protected void d(arx $$0, cnk $$1, long $$2) {
      if ($$1.aw() == bwj.g || $$1.aw() == bwj.r) {
         $$1.b(bwj.a);
      }

      $$1.ec().b(cfb.ba);
      $$1.ec().b(cfb.aZ);
      $$1.ec().b(cfb.bb);
   }

   private static boolean a(cnk $$0) {
      return $$0.ec().c(cfb.aZ).isEmpty() && $$0.aw() == bwj.r;
   }

   private static boolean b(cnk $$0) {
      boolean $$1 = $$0.aw() == bwj.g;
      boolean $$2 = $$0.aJ();
      boolean $$3 = $$0.bj() && $$0.ec().a(cfb.bb, cfc.b);
      return $$1 && ($$2 || $$3);
   }

   @Nullable
   private static jh a(bvx $$0, fbr $$1) {
      dgh $$2 = new dgh($$1, $$1.a(jm.a, 10.0), dgh.a.a, dgh.b.a, $$0);
      fbp $$3 = $$0.dW().a($$2);
      if ($$3.d() == fbp.a.b) {
         return jh.a((ka)$$3.g()).d();
      } else {
         dgh $$4 = new dgh($$1, $$1.a(jm.b, 10.0), dgh.a.a, dgh.b.a, $$0);
         fbp $$5 = $$0.dW().a($$4);
         return $$5.d() == fbp.a.b ? jh.a((ka)$$5.g()).d() : null;
      }
   }

   private static boolean a(cnk $$0, bvx $$1) {
      return !$$1.a($$0, $$0.h(bxf.m));
   }

   private static boolean b(cnk $$0, bvx $$1) {
      return $$1.f($$0) - 4.0F <= 0.0F;
   }

   private static boolean c(arx $$0, cnk $$1) {
      jh $$2 = $$1.dw();
      if ($$0.a_($$2).a(dkf.pI)) {
         return false;
      } else {
         for (int $$3 = 1; $$3 <= 4; $$3++) {
            jh $$4 = $$2.a(jm.b, $$3);
            if (!$$0.a_($$4).l() && !$$0.b_($$4).a(axq.a)) {
               return false;
            }
         }

         return true;
      }
   }

   private static Optional<fbr> a(cnk $$0, bac $$1, fbr $$2) {
      for (int $$4 : ae.a(j, $$1)) {
         float $$5 = 0.058333334F * (float)$$0.h(bxf.m);
         Optional<fbr> $$6 = byu.a($$0, $$2, $$5, $$4, false);
         if ($$6.isPresent()) {
            if ($$0.b(bui.h)) {
               double $$7 = $$6.get().d().e * (double)$$0.fk();
               return $$6.map($$1x -> $$1x.b(0.0, $$7, 0.0));
            }

            return $$6;
         }
      }

      return Optional.empty();
   }
}
