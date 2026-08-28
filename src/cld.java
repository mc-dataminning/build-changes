import com.google.common.annotations.VisibleForTesting;
import com.google.common.collect.Lists;
import it.unimi.dsi.fastutil.objects.ObjectArrayList;
import java.util.Map;
import java.util.Optional;
import javax.annotation.Nullable;

public class cld extends bvj<cla> {
   private static final int c = 4;
   private static final int d = 10;
   private static final int e = 2;
   private static final int f = Math.round(10.0F);
   private static final float g = 1.4F;
   private static final ObjectArrayList<Integer> h = new ObjectArrayList(Lists.newArrayList(new Integer[]{40, 55, 60, 75, 80}));

   @VisibleForTesting
   public cld() {
      super(Map.of(ccu.o, ccv.a, ccu.aU, ccv.b, ccu.aZ, ccv.c, ccu.ba, ccv.c, ccu.aV, ccv.b, ccu.m, ccv.b, ccu.bb, ccv.c), 200);
   }

   public static boolean a(arf $$0, cla $$1) {
      if (!$$1.aE() && !$$1.be()) {
         return false;
      } else if (byd.a($$1)) {
         return false;
      } else if ($$1.dS().a(ccu.ba, ccv.a)) {
         return true;
      } else {
         btq $$2 = $$1.dS().c(ccu.o).orElse(null);
         if ($$2 == null) {
            return false;
         } else if (a($$1, $$2)) {
            $$1.dS().b(ccu.o);
            return false;
         } else if (b($$1, $$2)) {
            return false;
         } else if (!c($$0, $$1)) {
            return false;
         } else {
            iz $$3 = a($$1, clc.a($$2, $$1.el()));
            if ($$3 == null) {
               return false;
            } else {
               dsd $$4 = $$0.a_($$3.d());
               if ($$1.ak().a($$4)) {
                  return false;
               } else if (!clc.a($$1, $$3.b()) && !clc.a($$1, $$3.b(4).b())) {
                  return false;
               } else {
                  $$1.dS().a(ccu.ba, $$3);
                  return true;
               }
            }
         }
      }
   }

   protected boolean b(arf $$0, cla $$1) {
      return a($$0, $$1);
   }

   protected boolean a(arf $$0, cla $$1, long $$2) {
      return $$1.ar() != buc.a && !$$1.dS().a(ccu.aU);
   }

   protected void b(arf $$0, cla $$1, long $$2) {
      if ($$1.dS().a(ccu.aZ, ccv.b)) {
         $$1.dS().a(ccu.aZ, bac.a, (long)f);
      }

      $$1.b(buc.r);
      $$0.a(null, $$1, awa.cE, awb.f, 1.0F, 1.0F);
      $$1.dS().c(ccu.ba).ifPresent($$1x -> $$1.a(fb.a.b, $$1x.b()));
   }

   protected void c(arf $$0, cla $$1, long $$2) {
      boolean $$3 = $$1.be();
      if (!$$3 && $$1.dS().a(ccu.bb, ccv.a)) {
         $$1.dS().b(ccu.bb);
      }

      if (a($$1)) {
         evs $$4 = $$1.dS().c(ccu.ba).flatMap($$1x -> a($$1, $$1.el(), evs.c($$1x))).orElse(null);
         if ($$4 == null) {
            $$1.b(buc.a);
            return;
         }

         if ($$3) {
            $$1.dS().a(ccu.bb, bac.a);
         }

         $$1.a(awa.cK, 1.0F, 1.0F);
         $$1.b(buc.g);
         $$1.r($$1.aY);
         $$1.q(true);
         $$1.h($$4);
      } else if (b($$1)) {
         $$1.a(awa.cL, 1.0F, 1.0F);
         $$1.b(buc.a);
         $$1.q(false);
         boolean $$5 = $$1.dS().a(ccu.x);
         $$1.dS().a(ccu.aU, bac.a, $$5 ? 2L : 10L);
         $$1.dS().a(ccu.aV, bac.a, 100L);
      }
   }

   protected void d(arf $$0, cla $$1, long $$2) {
      if ($$1.ar() == buc.g || $$1.ar() == buc.r) {
         $$1.b(buc.a);
      }

      $$1.dS().b(ccu.ba);
      $$1.dS().b(ccu.aZ);
      $$1.dS().b(ccu.bb);
   }

   private static boolean a(cla $$0) {
      return $$0.dS().c(ccu.aZ).isEmpty() && $$0.ar() == buc.r;
   }

   private static boolean b(cla $$0) {
      boolean $$1 = $$0.ar() == buc.g;
      boolean $$2 = $$0.aE();
      boolean $$3 = $$0.be() && $$0.dS().a(ccu.bb, ccv.b);
      return $$1 && ($$2 || $$3);
   }

   @Nullable
   private static iz a(btq $$0, evs $$1) {
      dbi $$2 = new dbi($$1, $$1.a(je.a, 10.0), dbi.a.a, dbi.b.a, $$0);
      evq $$3 = $$0.dP().a($$2);
      if ($$3.c() == evq.a.b) {
         return iz.a($$3.e()).c();
      } else {
         dbi $$4 = new dbi($$1, $$1.a(je.b, 10.0), dbi.a.a, dbi.b.a, $$0);
         evq $$5 = $$0.dP().a($$4);
         return $$5.c() == evq.a.b ? iz.a($$5.e()).c() : null;
      }
   }

   private static boolean a(cla $$0, btq $$1) {
      return !$$1.a($$0, 24.0);
   }

   private static boolean b(cla $$0, btq $$1) {
      return $$1.f($$0) - 4.0F <= 0.0F;
   }

   private static boolean c(arf $$0, cla $$1) {
      iz $$2 = $$1.dp();

      for (int $$3 = 1; $$3 <= 4; $$3++) {
         iz $$4 = $$2.a(je.b, $$3);
         if (!$$0.a_($$4).i() && !$$0.b_($$4).a(awv.a)) {
            return false;
         }
      }

      return true;
   }

   private static Optional<evs> a(cla $$0, azh $$1, evs $$2) {
      for (int $$4 : ac.a(h, $$1)) {
         Optional<evs> $$5 = bwn.a($$0, $$2, 1.4F, $$4, false);
         if ($$5.isPresent()) {
            return $$5;
         }
      }

      return Optional.empty();
   }
}
