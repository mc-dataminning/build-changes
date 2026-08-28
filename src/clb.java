import com.google.common.annotations.VisibleForTesting;
import com.google.common.collect.Lists;
import it.unimi.dsi.fastutil.objects.ObjectArrayList;
import java.util.Map;
import java.util.Optional;
import javax.annotation.Nullable;

public class clb extends bvh<cky> {
   private static final int c = 4;
   private static final int d = 10;
   private static final int e = 2;
   private static final int f = Math.round(10.0F);
   private static final float g = 1.4F;
   private static final ObjectArrayList<Integer> h = new ObjectArrayList(Lists.newArrayList(new Integer[]{40, 55, 60, 75, 80}));

   @VisibleForTesting
   public clb() {
      super(Map.of(ccs.o, cct.a, ccs.aU, cct.b, ccs.aZ, cct.c, ccs.ba, cct.c, ccs.aV, cct.b, ccs.m, cct.b, ccs.bb, cct.c), 200);
   }

   public static boolean a(are $$0, cky $$1) {
      if (!$$1.aE() && !$$1.be()) {
         return false;
      } else if (byb.a($$1)) {
         return false;
      } else if ($$1.dS().a(ccs.ba, cct.a)) {
         return true;
      } else {
         bto $$2 = $$1.dS().c(ccs.o).orElse(null);
         if ($$2 == null) {
            return false;
         } else if (a($$1, $$2)) {
            $$1.dS().b(ccs.o);
            return false;
         } else if (b($$1, $$2)) {
            return false;
         } else if (!c($$0, $$1)) {
            return false;
         } else {
            iz $$3 = a($$1, cla.a($$2, $$1.el()));
            if ($$3 == null) {
               return false;
            } else {
               dsb $$4 = $$0.a_($$3.d());
               if ($$1.ak().a($$4)) {
                  return false;
               } else if (!cla.a($$1, $$3.b()) && !cla.a($$1, $$3.b(4).b())) {
                  return false;
               } else {
                  $$1.dS().a(ccs.ba, $$3);
                  return true;
               }
            }
         }
      }
   }

   protected boolean b(are $$0, cky $$1) {
      return a($$0, $$1);
   }

   protected boolean a(are $$0, cky $$1, long $$2) {
      return $$1.ar() != bua.a && !$$1.dS().a(ccs.aU);
   }

   protected void b(are $$0, cky $$1, long $$2) {
      if ($$1.dS().a(ccs.aZ, cct.b)) {
         $$1.dS().a(ccs.aZ, bab.a, (long)f);
      }

      $$1.b(bua.r);
      $$0.a(null, $$1, avz.cE, awa.f, 1.0F, 1.0F);
      $$1.dS().c(ccs.ba).ifPresent($$1x -> $$1.a(fb.a.b, $$1x.b()));
   }

   protected void c(are $$0, cky $$1, long $$2) {
      boolean $$3 = $$1.be();
      if (!$$3 && $$1.dS().a(ccs.bb, cct.a)) {
         $$1.dS().b(ccs.bb);
      }

      if (a($$1)) {
         evq $$4 = $$1.dS().c(ccs.ba).flatMap($$1x -> a($$1, $$1.el(), evq.c($$1x))).orElse(null);
         if ($$4 == null) {
            $$1.b(bua.a);
            return;
         }

         if ($$3) {
            $$1.dS().a(ccs.bb, bab.a);
         }

         $$1.a(avz.cK, 1.0F, 1.0F);
         $$1.b(bua.g);
         $$1.r($$1.aY);
         $$1.q(true);
         $$1.h($$4);
      } else if (b($$1)) {
         $$1.a(avz.cL, 1.0F, 1.0F);
         $$1.b(bua.a);
         $$1.q(false);
         boolean $$5 = $$1.dS().a(ccs.x);
         $$1.dS().a(ccs.aU, bab.a, $$5 ? 2L : 10L);
         $$1.dS().a(ccs.aV, bab.a, 100L);
      }
   }

   protected void d(are $$0, cky $$1, long $$2) {
      if ($$1.ar() == bua.g || $$1.ar() == bua.r) {
         $$1.b(bua.a);
      }

      $$1.dS().b(ccs.ba);
      $$1.dS().b(ccs.aZ);
      $$1.dS().b(ccs.bb);
   }

   private static boolean a(cky $$0) {
      return $$0.dS().c(ccs.aZ).isEmpty() && $$0.ar() == bua.r;
   }

   private static boolean b(cky $$0) {
      boolean $$1 = $$0.ar() == bua.g;
      boolean $$2 = $$0.aE();
      boolean $$3 = $$0.be() && $$0.dS().a(ccs.bb, cct.b);
      return $$1 && ($$2 || $$3);
   }

   @Nullable
   private static iz a(bto $$0, evq $$1) {
      dbg $$2 = new dbg($$1, $$1.a(je.a, 10.0), dbg.a.a, dbg.b.a, $$0);
      evo $$3 = $$0.dP().a($$2);
      if ($$3.c() == evo.a.b) {
         return iz.a($$3.e()).c();
      } else {
         dbg $$4 = new dbg($$1, $$1.a(je.b, 10.0), dbg.a.a, dbg.b.a, $$0);
         evo $$5 = $$0.dP().a($$4);
         return $$5.c() == evo.a.b ? iz.a($$5.e()).c() : null;
      }
   }

   private static boolean a(cky $$0, bto $$1) {
      return !$$1.a($$0, 24.0);
   }

   private static boolean b(cky $$0, bto $$1) {
      return $$1.f($$0) - 4.0F <= 0.0F;
   }

   private static boolean c(are $$0, cky $$1) {
      iz $$2 = $$1.dp();

      for (int $$3 = 1; $$3 <= 4; $$3++) {
         iz $$4 = $$2.a(je.b, $$3);
         if (!$$0.a_($$4).i() && !$$0.b_($$4).a(awu.a)) {
            return false;
         }
      }

      return true;
   }

   private static Optional<evq> a(cky $$0, azg $$1, evq $$2) {
      for (int $$4 : ac.a(h, $$1)) {
         Optional<evq> $$5 = bwl.a($$0, $$2, 1.4F, $$4, false);
         if ($$5.isPresent()) {
            return $$5;
         }
      }

      return Optional.empty();
   }
}
