import com.google.common.annotations.VisibleForTesting;
import com.google.common.collect.Lists;
import it.unimi.dsi.fastutil.objects.ObjectArrayList;
import java.util.Map;
import java.util.Optional;
import javax.annotation.Nullable;

public class cla extends bvg<ckx> {
   private static final int c = 4;
   private static final int d = 10;
   private static final int e = 2;
   private static final int f = Math.round(10.0F);
   private static final float g = 1.4F;
   private static final ObjectArrayList<Integer> h = new ObjectArrayList(Lists.newArrayList(new Integer[]{40, 55, 60, 75, 80}));

   @VisibleForTesting
   public cla() {
      super(Map.of(ccr.o, ccs.a, ccr.aU, ccs.b, ccr.aZ, ccs.c, ccr.ba, ccs.c, ccr.aV, ccs.b, ccr.m, ccs.b, ccr.bb, ccs.c), 200);
   }

   public static boolean a(are $$0, ckx $$1) {
      if (!$$1.aE() && !$$1.be()) {
         return false;
      } else if (bya.a($$1)) {
         return false;
      } else if ($$1.dS().a(ccr.ba, ccs.a)) {
         return true;
      } else {
         btn $$2 = $$1.dS().c(ccr.o).orElse(null);
         if ($$2 == null) {
            return false;
         } else if (a($$1, $$2)) {
            $$1.dS().b(ccr.o);
            return false;
         } else if (b($$1, $$2)) {
            return false;
         } else if (!c($$0, $$1)) {
            return false;
         } else {
            iz $$3 = a($$1, ckz.a($$2, $$1.el()));
            if ($$3 == null) {
               return false;
            } else {
               dsa $$4 = $$0.a_($$3.d());
               if ($$1.ak().a($$4)) {
                  return false;
               } else if (!ckz.a($$1, $$3.b()) && !ckz.a($$1, $$3.b(4).b())) {
                  return false;
               } else {
                  $$1.dS().a(ccr.ba, $$3);
                  return true;
               }
            }
         }
      }
   }

   protected boolean b(are $$0, ckx $$1) {
      return a($$0, $$1);
   }

   protected boolean a(are $$0, ckx $$1, long $$2) {
      return $$1.ar() != btz.a && !$$1.dS().a(ccr.aU);
   }

   protected void b(are $$0, ckx $$1, long $$2) {
      if ($$1.dS().a(ccr.aZ, ccs.b)) {
         $$1.dS().a(ccr.aZ, baa.a, (long)f);
      }

      $$1.b(btz.r);
      $$0.a(null, $$1, avz.cE, awa.f, 1.0F, 1.0F);
      $$1.dS().c(ccr.ba).ifPresent($$1x -> $$1.a(fb.a.b, $$1x.b()));
   }

   protected void c(are $$0, ckx $$1, long $$2) {
      boolean $$3 = $$1.be();
      if (!$$3 && $$1.dS().a(ccr.bb, ccs.a)) {
         $$1.dS().b(ccr.bb);
      }

      if (a($$1)) {
         evp $$4 = $$1.dS().c(ccr.ba).flatMap($$1x -> a($$1, $$1.el(), evp.c($$1x))).orElse(null);
         if ($$4 == null) {
            $$1.b(btz.a);
            return;
         }

         if ($$3) {
            $$1.dS().a(ccr.bb, baa.a);
         }

         $$1.a(avz.cK, 1.0F, 1.0F);
         $$1.b(btz.g);
         $$1.r($$1.aY);
         $$1.q(true);
         $$1.h($$4);
      } else if (b($$1)) {
         $$1.a(avz.cL, 1.0F, 1.0F);
         $$1.b(btz.a);
         $$1.q(false);
         boolean $$5 = $$1.dS().a(ccr.x);
         $$1.dS().a(ccr.aU, baa.a, $$5 ? 2L : 10L);
         $$1.dS().a(ccr.aV, baa.a, 100L);
      }
   }

   protected void d(are $$0, ckx $$1, long $$2) {
      if ($$1.ar() == btz.g || $$1.ar() == btz.r) {
         $$1.b(btz.a);
      }

      $$1.dS().b(ccr.ba);
      $$1.dS().b(ccr.aZ);
      $$1.dS().b(ccr.bb);
   }

   private static boolean a(ckx $$0) {
      return $$0.dS().c(ccr.aZ).isEmpty() && $$0.ar() == btz.r;
   }

   private static boolean b(ckx $$0) {
      boolean $$1 = $$0.ar() == btz.g;
      boolean $$2 = $$0.aE();
      boolean $$3 = $$0.be() && $$0.dS().a(ccr.bb, ccs.b);
      return $$1 && ($$2 || $$3);
   }

   @Nullable
   private static iz a(btn $$0, evp $$1) {
      dbf $$2 = new dbf($$1, $$1.a(je.a, 10.0), dbf.a.a, dbf.b.a, $$0);
      evn $$3 = $$0.dP().a($$2);
      if ($$3.c() == evn.a.b) {
         return iz.a($$3.e()).c();
      } else {
         dbf $$4 = new dbf($$1, $$1.a(je.b, 10.0), dbf.a.a, dbf.b.a, $$0);
         evn $$5 = $$0.dP().a($$4);
         return $$5.c() == evn.a.b ? iz.a($$5.e()).c() : null;
      }
   }

   private static boolean a(ckx $$0, btn $$1) {
      return !$$1.a($$0, 24.0);
   }

   private static boolean b(ckx $$0, btn $$1) {
      return $$1.f($$0) - 4.0F <= 0.0F;
   }

   private static boolean c(are $$0, ckx $$1) {
      iz $$2 = $$1.dp();

      for (int $$3 = 1; $$3 <= 4; $$3++) {
         iz $$4 = $$2.a(je.b, $$3);
         if (!$$0.a_($$4).i() && !$$0.b_($$4).a(awu.a)) {
            return false;
         }
      }

      return true;
   }

   private static Optional<evp> a(ckx $$0, azf $$1, evp $$2) {
      for (int $$4 : ac.a(h, $$1)) {
         Optional<evp> $$5 = bwk.a($$0, $$2, 1.4F, $$4, false);
         if ($$5.isPresent()) {
            return $$5;
         }
      }

      return Optional.empty();
   }
}
