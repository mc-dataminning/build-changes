import com.google.common.annotations.VisibleForTesting;
import com.google.common.collect.Lists;
import it.unimi.dsi.fastutil.objects.ObjectArrayList;
import java.util.Map;
import java.util.Optional;
import javax.annotation.Nullable;

public class ckx extends bvd<cku> {
   private static final int c = 4;
   private static final int d = 10;
   private static final int e = 2;
   private static final int f = Math.round(10.0F);
   private static final float g = 1.4F;
   private static final ObjectArrayList<Integer> h = new ObjectArrayList(Lists.newArrayList(new Integer[]{40, 55, 60, 75, 80}));

   @VisibleForTesting
   public ckx() {
      super(Map.of(cco.o, ccp.a, cco.aU, ccp.b, cco.aZ, ccp.c, cco.ba, ccp.c, cco.aV, ccp.b, cco.m, ccp.b, cco.bb, ccp.c), 200);
   }

   public static boolean a(arb $$0, cku $$1) {
      if (!$$1.aE() && !$$1.be()) {
         return false;
      } else if (bxx.a($$1)) {
         return false;
      } else if ($$1.dS().a(cco.ba, ccp.a)) {
         return true;
      } else {
         btk $$2 = $$1.dS().c(cco.o).orElse(null);
         if ($$2 == null) {
            return false;
         } else if (a($$1, $$2)) {
            $$1.dS().b(cco.o);
            return false;
         } else if (b($$1, $$2)) {
            return false;
         } else if (!c($$0, $$1)) {
            return false;
         } else {
            iz $$3 = a($$1, ckw.a($$2, $$1.el()));
            if ($$3 == null) {
               return false;
            } else {
               drx $$4 = $$0.a_($$3.d());
               if ($$1.ak().a($$4)) {
                  return false;
               } else if (!ckw.a($$1, $$3.b()) && !ckw.a($$1, $$3.b(4).b())) {
                  return false;
               } else {
                  $$1.dS().a(cco.ba, $$3);
                  return true;
               }
            }
         }
      }
   }

   protected boolean b(arb $$0, cku $$1) {
      return a($$0, $$1);
   }

   protected boolean a(arb $$0, cku $$1, long $$2) {
      return $$1.ar() != btw.a && !$$1.dS().a(cco.aU);
   }

   protected void b(arb $$0, cku $$1, long $$2) {
      if ($$1.dS().a(cco.aZ, ccp.b)) {
         $$1.dS().a(cco.aZ, azx.a, (long)f);
      }

      $$1.b(btw.r);
      $$0.a(null, $$1, avw.cE, avx.f, 1.0F, 1.0F);
      $$1.dS().c(cco.ba).ifPresent($$1x -> $$1.a(fb.a.b, $$1x.b()));
   }

   protected void c(arb $$0, cku $$1, long $$2) {
      boolean $$3 = $$1.be();
      if (!$$3 && $$1.dS().a(cco.bb, ccp.a)) {
         $$1.dS().b(cco.bb);
      }

      if (a($$1)) {
         evm $$4 = $$1.dS().c(cco.ba).flatMap($$1x -> a($$1, $$1.el(), evm.c($$1x))).orElse(null);
         if ($$4 == null) {
            $$1.b(btw.a);
            return;
         }

         if ($$3) {
            $$1.dS().a(cco.bb, azx.a);
         }

         $$1.a(avw.cK, 1.0F, 1.0F);
         $$1.b(btw.g);
         $$1.r($$1.aY);
         $$1.q(true);
         $$1.h($$4);
      } else if (b($$1)) {
         $$1.a(avw.cL, 1.0F, 1.0F);
         $$1.b(btw.a);
         $$1.q(false);
         boolean $$5 = $$1.dS().a(cco.x);
         $$1.dS().a(cco.aU, azx.a, $$5 ? 2L : 10L);
         $$1.dS().a(cco.aV, azx.a, 100L);
      }
   }

   protected void d(arb $$0, cku $$1, long $$2) {
      if ($$1.ar() == btw.g || $$1.ar() == btw.r) {
         $$1.b(btw.a);
      }

      $$1.dS().b(cco.ba);
      $$1.dS().b(cco.aZ);
      $$1.dS().b(cco.bb);
   }

   private static boolean a(cku $$0) {
      return $$0.dS().c(cco.aZ).isEmpty() && $$0.ar() == btw.r;
   }

   private static boolean b(cku $$0) {
      boolean $$1 = $$0.ar() == btw.g;
      boolean $$2 = $$0.aE();
      boolean $$3 = $$0.be() && $$0.dS().a(cco.bb, ccp.b);
      return $$1 && ($$2 || $$3);
   }

   @Nullable
   private static iz a(btk $$0, evm $$1) {
      dbc $$2 = new dbc($$1, $$1.a(je.a, 10.0), dbc.a.a, dbc.b.a, $$0);
      evk $$3 = $$0.dP().a($$2);
      if ($$3.c() == evk.a.b) {
         return iz.a($$3.e()).c();
      } else {
         dbc $$4 = new dbc($$1, $$1.a(je.b, 10.0), dbc.a.a, dbc.b.a, $$0);
         evk $$5 = $$0.dP().a($$4);
         return $$5.c() == evk.a.b ? iz.a($$5.e()).c() : null;
      }
   }

   private static boolean a(cku $$0, btk $$1) {
      return !$$1.a($$0, 24.0);
   }

   private static boolean b(cku $$0, btk $$1) {
      return $$1.f($$0) - 4.0F <= 0.0F;
   }

   private static boolean c(arb $$0, cku $$1) {
      iz $$2 = $$1.dp();

      for (int $$3 = 1; $$3 <= 4; $$3++) {
         iz $$4 = $$2.a(je.b, $$3);
         if (!$$0.a_($$4).i() && !$$0.b_($$4).a(awr.a)) {
            return false;
         }
      }

      return true;
   }

   private static Optional<evm> a(cku $$0, azc $$1, evm $$2) {
      for (int $$4 : ac.a(h, $$1)) {
         Optional<evm> $$5 = bwh.a($$0, $$2, 1.4F, $$4, false);
         if ($$5.isPresent()) {
            return $$5;
         }
      }

      return Optional.empty();
   }
}
