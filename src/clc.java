import com.google.common.annotations.VisibleForTesting;
import com.google.common.collect.Lists;
import it.unimi.dsi.fastutil.objects.ObjectArrayList;
import java.util.Map;
import java.util.Optional;
import javax.annotation.Nullable;

public class clc extends bvi<ckz> {
   private static final int c = 4;
   private static final int d = 10;
   private static final int e = 2;
   private static final int f = Math.round(10.0F);
   private static final float g = 1.4F;
   private static final ObjectArrayList<Integer> h = new ObjectArrayList(Lists.newArrayList(new Integer[]{40, 55, 60, 75, 80}));

   @VisibleForTesting
   public clc() {
      super(Map.of(cct.o, ccu.a, cct.aU, ccu.b, cct.aZ, ccu.c, cct.ba, ccu.c, cct.aV, ccu.b, cct.m, ccu.b, cct.bb, ccu.c), 200);
   }

   public static boolean a(arf $$0, ckz $$1) {
      if (!$$1.aE() && !$$1.be()) {
         return false;
      } else if (byc.a($$1)) {
         return false;
      } else if ($$1.dS().a(cct.ba, ccu.a)) {
         return true;
      } else {
         btp $$2 = $$1.dS().c(cct.o).orElse(null);
         if ($$2 == null) {
            return false;
         } else if (a($$1, $$2)) {
            $$1.dS().b(cct.o);
            return false;
         } else if (b($$1, $$2)) {
            return false;
         } else if (!c($$0, $$1)) {
            return false;
         } else {
            iz $$3 = a($$1, clb.a($$2, $$1.el()));
            if ($$3 == null) {
               return false;
            } else {
               dsc $$4 = $$0.a_($$3.d());
               if ($$1.ak().a($$4)) {
                  return false;
               } else if (!clb.a($$1, $$3.b()) && !clb.a($$1, $$3.b(4).b())) {
                  return false;
               } else {
                  $$1.dS().a(cct.ba, $$3);
                  return true;
               }
            }
         }
      }
   }

   protected boolean b(arf $$0, ckz $$1) {
      return a($$0, $$1);
   }

   protected boolean a(arf $$0, ckz $$1, long $$2) {
      return $$1.ar() != bub.a && !$$1.dS().a(cct.aU);
   }

   protected void b(arf $$0, ckz $$1, long $$2) {
      if ($$1.dS().a(cct.aZ, ccu.b)) {
         $$1.dS().a(cct.aZ, bac.a, (long)f);
      }

      $$1.b(bub.r);
      $$0.a(null, $$1, awa.cE, awb.f, 1.0F, 1.0F);
      $$1.dS().c(cct.ba).ifPresent($$1x -> $$1.a(fb.a.b, $$1x.b()));
   }

   protected void c(arf $$0, ckz $$1, long $$2) {
      boolean $$3 = $$1.be();
      if (!$$3 && $$1.dS().a(cct.bb, ccu.a)) {
         $$1.dS().b(cct.bb);
      }

      if (a($$1)) {
         evr $$4 = $$1.dS().c(cct.ba).flatMap($$1x -> a($$1, $$1.el(), evr.c($$1x))).orElse(null);
         if ($$4 == null) {
            $$1.b(bub.a);
            return;
         }

         if ($$3) {
            $$1.dS().a(cct.bb, bac.a);
         }

         $$1.a(awa.cK, 1.0F, 1.0F);
         $$1.b(bub.g);
         $$1.r($$1.aY);
         $$1.q(true);
         $$1.h($$4);
      } else if (b($$1)) {
         $$1.a(awa.cL, 1.0F, 1.0F);
         $$1.b(bub.a);
         $$1.q(false);
         boolean $$5 = $$1.dS().a(cct.x);
         $$1.dS().a(cct.aU, bac.a, $$5 ? 2L : 10L);
         $$1.dS().a(cct.aV, bac.a, 100L);
      }
   }

   protected void d(arf $$0, ckz $$1, long $$2) {
      if ($$1.ar() == bub.g || $$1.ar() == bub.r) {
         $$1.b(bub.a);
      }

      $$1.dS().b(cct.ba);
      $$1.dS().b(cct.aZ);
      $$1.dS().b(cct.bb);
   }

   private static boolean a(ckz $$0) {
      return $$0.dS().c(cct.aZ).isEmpty() && $$0.ar() == bub.r;
   }

   private static boolean b(ckz $$0) {
      boolean $$1 = $$0.ar() == bub.g;
      boolean $$2 = $$0.aE();
      boolean $$3 = $$0.be() && $$0.dS().a(cct.bb, ccu.b);
      return $$1 && ($$2 || $$3);
   }

   @Nullable
   private static iz a(btp $$0, evr $$1) {
      dbh $$2 = new dbh($$1, $$1.a(je.a, 10.0), dbh.a.a, dbh.b.a, $$0);
      evp $$3 = $$0.dP().a($$2);
      if ($$3.c() == evp.a.b) {
         return iz.a($$3.e()).c();
      } else {
         dbh $$4 = new dbh($$1, $$1.a(je.b, 10.0), dbh.a.a, dbh.b.a, $$0);
         evp $$5 = $$0.dP().a($$4);
         return $$5.c() == evp.a.b ? iz.a($$5.e()).c() : null;
      }
   }

   private static boolean a(ckz $$0, btp $$1) {
      return !$$1.a($$0, 24.0);
   }

   private static boolean b(ckz $$0, btp $$1) {
      return $$1.f($$0) - 4.0F <= 0.0F;
   }

   private static boolean c(arf $$0, ckz $$1) {
      iz $$2 = $$1.dp();

      for (int $$3 = 1; $$3 <= 4; $$3++) {
         iz $$4 = $$2.a(je.b, $$3);
         if (!$$0.a_($$4).i() && !$$0.b_($$4).a(awv.a)) {
            return false;
         }
      }

      return true;
   }

   private static Optional<evr> a(ckz $$0, azh $$1, evr $$2) {
      for (int $$4 : ac.a(h, $$1)) {
         Optional<evr> $$5 = bwm.a($$0, $$2, 1.4F, $$4, false);
         if ($$5.isPresent()) {
            return $$5;
         }
      }

      return Optional.empty();
   }
}
