import com.google.common.annotations.VisibleForTesting;
import com.google.common.collect.Lists;
import it.unimi.dsi.fastutil.objects.ObjectArrayList;
import java.util.Map;
import java.util.Optional;
import javax.annotation.Nullable;

public class cmq extends bwt<cmn> {
   private static final int c = 4;
   private static final int d = 10;
   private static final int e = 2;
   private static final int f = Math.round(10.0F);
   private static final float g = 24.0F;
   private static final float h = 1.4F;
   private static final float i = 0.058333334F;
   private static final ObjectArrayList<Integer> j = new ObjectArrayList(Lists.newArrayList(new Integer[]{40, 55, 60, 75, 80}));

   @VisibleForTesting
   public cmq() {
      super(Map.of(cee.o, cef.a, cee.aU, cef.b, cee.aZ, cef.c, cee.ba, cef.c, cee.aV, cef.b, cee.m, cef.b, cee.bb, cef.c), 200);
   }

   public static boolean a(arn $$0, cmn $$1) {
      if (!$$1.aK() && !$$1.bk()) {
         return false;
      } else if (bzn.a($$1)) {
         return false;
      } else if ($$1.ed().a(cee.ba, cef.a)) {
         return true;
      } else {
         bva $$2 = $$1.ed().c(cee.o).orElse(null);
         if ($$2 == null) {
            return false;
         } else if (a($$1, $$2)) {
            $$1.ed().b(cee.o);
            return false;
         } else if (b($$1, $$2)) {
            return false;
         } else if (!c($$0, $$1)) {
            return false;
         } else {
            jh $$3 = a($$1, cmp.a($$2, $$1.ea()));
            if ($$3 == null) {
               return false;
            } else {
               dvj $$4 = $$0.a_($$3.e());
               if ($$1.ar().a($$4)) {
                  return false;
               } else if (!cmp.a($$1, $$3.b()) && !cmp.a($$1, $$3.b(4).b())) {
                  return false;
               } else {
                  $$1.ed().a(cee.ba, $$3);
                  return true;
               }
            }
         }
      }
   }

   protected boolean b(arn $$0, cmn $$1) {
      return a($$0, $$1);
   }

   protected boolean a(arn $$0, cmn $$1, long $$2) {
      return $$1.ay() != bvm.a && !$$1.ed().a(cee.aU);
   }

   protected void b(arn $$0, cmn $$1, long $$2) {
      if ($$1.ed().a(cee.aZ, cef.b)) {
         $$1.ed().a(cee.aZ, bap.a, (long)f);
      }

      $$1.b(bvm.r);
      $$0.a(null, $$1, awl.cE, awm.f, 1.0F, 1.0F);
      $$1.ed().c(cee.ba).ifPresent($$1x -> $$1.a(fi.a.b, $$1x.b()));
   }

   protected void c(arn $$0, cmn $$1, long $$2) {
      boolean $$3 = $$1.bk();
      if (!$$3 && $$1.ed().a(cee.bb, cef.a)) {
         $$1.ed().b(cee.bb);
      }

      if (a($$1)) {
         ezn $$4 = $$1.ed().c(cee.ba).flatMap($$1x -> a($$1, $$1.ea(), ezn.c($$1x))).orElse(null);
         if ($$4 == null) {
            $$1.b(bvm.a);
            return;
         }

         if ($$3) {
            $$1.ed().a(cee.bb, bap.a);
         }

         $$1.a(awl.cK, 1.0F, 1.0F);
         $$1.b(bvm.g);
         $$1.v($$1.aX);
         $$1.r(true);
         $$1.h($$4);
      } else if (b($$1)) {
         $$1.a(awl.cL, 1.0F, 1.0F);
         $$1.b(bvm.a);
         $$1.r(false);
         boolean $$5 = $$1.ed().a(cee.x);
         $$1.ed().a(cee.aU, bap.a, $$5 ? 2L : 10L);
         $$1.ed().a(cee.aV, bap.a, 100L);
      }
   }

   protected void d(arn $$0, cmn $$1, long $$2) {
      if ($$1.ay() == bvm.g || $$1.ay() == bvm.r) {
         $$1.b(bvm.a);
      }

      $$1.ed().b(cee.ba);
      $$1.ed().b(cee.aZ);
      $$1.ed().b(cee.bb);
   }

   private static boolean a(cmn $$0) {
      return $$0.ed().c(cee.aZ).isEmpty() && $$0.ay() == bvm.r;
   }

   private static boolean b(cmn $$0) {
      boolean $$1 = $$0.ay() == bvm.g;
      boolean $$2 = $$0.aK();
      boolean $$3 = $$0.bk() && $$0.ed().a(cee.bb, cef.b);
      return $$1 && ($$2 || $$3);
   }

   @Nullable
   private static jh a(bva $$0, ezn $$1) {
      dej $$2 = new dej($$1, $$1.a(jm.a, 10.0), dej.a.a, dej.b.a, $$0);
      ezl $$3 = $$0.dX().a($$2);
      if ($$3.d() == ezl.a.b) {
         return jh.a((ka)$$3.g()).d();
      } else {
         dej $$4 = new dej($$1, $$1.a(jm.b, 10.0), dej.a.a, dej.b.a, $$0);
         ezl $$5 = $$0.dX().a($$4);
         return $$5.d() == ezl.a.b ? jh.a((ka)$$5.g()).d() : null;
      }
   }

   private static boolean a(cmn $$0, bva $$1) {
      return !$$1.a($$0, $$0.h(bwi.m));
   }

   private static boolean b(cmn $$0, bva $$1) {
      return $$1.f($$0) - 4.0F <= 0.0F;
   }

   private static boolean c(arn $$0, cmn $$1) {
      jh $$2 = $$1.dx();

      for (int $$3 = 1; $$3 <= 4; $$3++) {
         jh $$4 = $$2.a(jm.b, $$3);
         if (!$$0.a_($$4).l() && !$$0.b_($$4).a(axg.a)) {
            return false;
         }
      }

      return true;
   }

   private static Optional<ezn> a(cmn $$0, azs $$1, ezn $$2) {
      for (int $$4 : ae.a(j, $$1)) {
         float $$5 = 0.058333334F * (float)$$0.h(bwi.m);
         Optional<ezn> $$6 = bxx.a($$0, $$2, $$5, $$4, false);
         if ($$6.isPresent()) {
            return $$6;
         }
      }

      return Optional.empty();
   }
}
