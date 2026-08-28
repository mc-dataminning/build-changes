import com.google.common.annotations.VisibleForTesting;
import com.google.common.collect.Lists;
import it.unimi.dsi.fastutil.objects.ObjectArrayList;
import java.util.Map;
import java.util.Optional;
import javax.annotation.Nullable;

public class ckm extends bur<ckj> {
   private static final int c = 4;
   private static final int d = 10;
   private static final int e = 2;
   private static final int f = Math.round(10.0F);
   private static final float g = 1.4F;
   private static final ObjectArrayList<Integer> h = new ObjectArrayList(Lists.newArrayList(new Integer[]{40, 55, 60, 75, 80}));

   @VisibleForTesting
   public ckm() {
      super(Map.of(ccc.o, ccd.a, ccc.aU, ccd.b, ccc.aZ, ccd.c, ccc.ba, ccd.c, ccc.aV, ccd.b, ccc.m, ccd.b, ccc.bb, ccd.c), 200);
   }

   public static boolean a(aqk $$0, ckj $$1) {
      if (!$$1.aE() && !$$1.be()) {
         return false;
      } else if (bxl.a($$1)) {
         return false;
      } else if ($$1.dT().a(ccc.ba, ccd.a)) {
         return true;
      } else {
         bsy $$2 = $$1.dT().c(ccc.o).orElse(null);
         if ($$2 == null) {
            return false;
         } else if (a($$1, $$2)) {
            $$1.dT().b(ccc.o);
            return false;
         } else if (b($$1, $$2)) {
            return false;
         } else if (!c($$0, $$1)) {
            return false;
         } else {
            ja $$3 = a($$1, ckl.a($$2, $$1.dS()));
            if ($$3 == null) {
               return false;
            } else {
               dsh $$4 = $$0.a_($$3.d());
               if ($$1.ak().a($$4)) {
                  return false;
               } else if (!ckl.a($$1, $$3.b()) && !ckl.a($$1, $$3.b(4).b())) {
                  return false;
               } else {
                  $$1.dT().a(ccc.ba, $$3);
                  return true;
               }
            }
         }
      }
   }

   protected boolean b(aqk $$0, ckj $$1) {
      return a($$0, $$1);
   }

   protected boolean a(aqk $$0, ckj $$1, long $$2) {
      return $$1.ar() != btk.a && !$$1.dT().a(ccc.aU);
   }

   protected void b(aqk $$0, ckj $$1, long $$2) {
      if ($$1.dT().a(ccc.aZ, ccd.b)) {
         $$1.dT().a(ccc.aZ, azh.a, (long)f);
      }

      $$1.b(btk.r);
      $$0.a(null, $$1, avf.cE, avg.f, 1.0F, 1.0F);
      $$1.dT().c(ccc.ba).ifPresent($$1x -> $$1.a(fc.a.b, $$1x.b()));
   }

   protected void c(aqk $$0, ckj $$1, long $$2) {
      boolean $$3 = $$1.be();
      if (!$$3 && $$1.dT().a(ccc.bb, ccd.a)) {
         $$1.dT().b(ccc.bb);
      }

      if (a($$1)) {
         evz $$4 = $$1.dT().c(ccc.ba).flatMap($$1x -> a($$1, $$1.dS(), evz.c($$1x))).orElse(null);
         if ($$4 == null) {
            $$1.b(btk.a);
            return;
         }

         if ($$3) {
            $$1.dT().a(ccc.bb, azh.a);
         }

         $$1.a(avf.cK, 1.0F, 1.0F);
         $$1.b(btk.g);
         $$1.s($$1.aY);
         $$1.q(true);
         $$1.h($$4);
      } else if (b($$1)) {
         $$1.a(avf.cL, 1.0F, 1.0F);
         $$1.b(btk.a);
         $$1.q(false);
         boolean $$5 = $$1.dT().a(ccc.x);
         $$1.dT().a(ccc.aU, azh.a, $$5 ? 2L : 10L);
         $$1.dT().a(ccc.aV, azh.a, 100L);
      }
   }

   protected void d(aqk $$0, ckj $$1, long $$2) {
      if ($$1.ar() == btk.g || $$1.ar() == btk.r) {
         $$1.b(btk.a);
      }

      $$1.dT().b(ccc.ba);
      $$1.dT().b(ccc.aZ);
      $$1.dT().b(ccc.bb);
   }

   private static boolean a(ckj $$0) {
      return $$0.dT().c(ccc.aZ).isEmpty() && $$0.ar() == btk.r;
   }

   private static boolean b(ckj $$0) {
      boolean $$1 = $$0.ar() == btk.g;
      boolean $$2 = $$0.aE();
      boolean $$3 = $$0.be() && $$0.dT().a(ccc.bb, ccd.b);
      return $$1 && ($$2 || $$3);
   }

   @Nullable
   private static ja a(bsy $$0, evz $$1) {
      dbm $$2 = new dbm($$1, $$1.a(jf.a, 10.0), dbm.a.a, dbm.b.a, $$0);
      evx $$3 = $$0.dP().a($$2);
      if ($$3.c() == evx.a.b) {
         return ja.a($$3.e()).c();
      } else {
         dbm $$4 = new dbm($$1, $$1.a(jf.b, 10.0), dbm.a.a, dbm.b.a, $$0);
         evx $$5 = $$0.dP().a($$4);
         return $$5.c() == evx.a.b ? ja.a($$5.e()).c() : null;
      }
   }

   private static boolean a(ckj $$0, bsy $$1) {
      return !$$1.a($$0, 24.0);
   }

   private static boolean b(ckj $$0, bsy $$1) {
      return $$1.f($$0) - 4.0F <= 0.0F;
   }

   private static boolean c(aqk $$0, ckj $$1) {
      ja $$2 = $$1.dp();

      for (int $$3 = 1; $$3 <= 4; $$3++) {
         ja $$4 = $$2.a(jf.b, $$3);
         if (!$$0.a_($$4).i() && !$$0.b_($$4).a(awa.a)) {
            return false;
         }
      }

      return true;
   }

   private static Optional<evz> a(ckj $$0, aym $$1, evz $$2) {
      for (int $$4 : ac.a(h, $$1)) {
         Optional<evz> $$5 = bvv.a($$0, $$2, 1.4F, $$4, false);
         if ($$5.isPresent()) {
            return $$5;
         }
      }

      return Optional.empty();
   }
}
