import com.google.common.annotations.VisibleForTesting;
import com.google.common.collect.Lists;
import it.unimi.dsi.fastutil.objects.ObjectArrayList;
import java.util.Map;
import java.util.Optional;
import javax.annotation.Nullable;

public class ckq extends buv<ckn> {
   private static final int c = 4;
   private static final int d = 10;
   private static final int e = 2;
   private static final int f = Math.round(10.0F);
   private static final float g = 1.4F;
   private static final ObjectArrayList<Integer> h = new ObjectArrayList(Lists.newArrayList(new Integer[]{40, 55, 60, 75, 80}));

   @VisibleForTesting
   public ckq() {
      super(Map.of(ccg.o, cch.a, ccg.aU, cch.b, ccg.aZ, cch.c, ccg.ba, cch.c, ccg.aV, cch.b, ccg.m, cch.b, ccg.bb, cch.c), 200);
   }

   public static boolean a(aqm $$0, ckn $$1) {
      if (!$$1.aG() && !$$1.bg()) {
         return false;
      } else if (bxp.a($$1)) {
         return false;
      } else if ($$1.dV().a(ccg.ba, cch.a)) {
         return true;
      } else {
         btc $$2 = $$1.dV().c(ccg.o).orElse(null);
         if ($$2 == null) {
            return false;
         } else if (a($$1, $$2)) {
            $$1.dV().b(ccg.o);
            return false;
         } else if (b($$1, $$2)) {
            return false;
         } else if (!c($$0, $$1)) {
            return false;
         } else {
            ja $$3 = a($$1, ckp.a($$2, $$1.dU()));
            if ($$3 == null) {
               return false;
            } else {
               dsl $$4 = $$0.a_($$3.d());
               if ($$1.am().a($$4)) {
                  return false;
               } else if (!ckp.a($$1, $$3.b()) && !ckp.a($$1, $$3.b(4).b())) {
                  return false;
               } else {
                  $$1.dV().a(ccg.ba, $$3);
                  return true;
               }
            }
         }
      }
   }

   protected boolean b(aqm $$0, ckn $$1) {
      return a($$0, $$1);
   }

   protected boolean a(aqm $$0, ckn $$1, long $$2) {
      return $$1.at() != bto.a && !$$1.dV().a(ccg.aU);
   }

   protected void b(aqm $$0, ckn $$1, long $$2) {
      if ($$1.dV().a(ccg.aZ, cch.b)) {
         $$1.dV().a(ccg.aZ, azk.a, (long)f);
      }

      $$1.b(bto.r);
      $$0.a(null, $$1, avh.cE, avi.f, 1.0F, 1.0F);
      $$1.dV().c(ccg.ba).ifPresent($$1x -> $$1.a(fc.a.b, $$1x.b()));
   }

   protected void c(aqm $$0, ckn $$1, long $$2) {
      boolean $$3 = $$1.bg();
      if (!$$3 && $$1.dV().a(ccg.bb, cch.a)) {
         $$1.dV().b(ccg.bb);
      }

      if (a($$1)) {
         ewh $$4 = $$1.dV().c(ccg.ba).flatMap($$1x -> a($$1, $$1.dU(), ewh.c($$1x))).orElse(null);
         if ($$4 == null) {
            $$1.b(bto.a);
            return;
         }

         if ($$3) {
            $$1.dV().a(ccg.bb, azk.a);
         }

         $$1.a(avh.cK, 1.0F, 1.0F);
         $$1.b(bto.g);
         $$1.s($$1.aZ);
         $$1.r(true);
         $$1.j($$4);
      } else if (b($$1)) {
         $$1.a(avh.cL, 1.0F, 1.0F);
         $$1.b(bto.a);
         $$1.r(false);
         boolean $$5 = $$1.dV().a(ccg.x);
         $$1.dV().a(ccg.aU, azk.a, $$5 ? 2L : 10L);
         $$1.dV().a(ccg.aV, azk.a, 100L);
      }
   }

   protected void d(aqm $$0, ckn $$1, long $$2) {
      if ($$1.at() == bto.g || $$1.at() == bto.r) {
         $$1.b(bto.a);
      }

      $$1.dV().b(ccg.ba);
      $$1.dV().b(ccg.aZ);
      $$1.dV().b(ccg.bb);
   }

   private static boolean a(ckn $$0) {
      return $$0.dV().c(ccg.aZ).isEmpty() && $$0.at() == bto.r;
   }

   private static boolean b(ckn $$0) {
      boolean $$1 = $$0.at() == bto.g;
      boolean $$2 = $$0.aG();
      boolean $$3 = $$0.bg() && $$0.dV().a(ccg.bb, cch.b);
      return $$1 && ($$2 || $$3);
   }

   @Nullable
   private static ja a(btc $$0, ewh $$1) {
      dbp $$2 = new dbp($$1, $$1.a(jf.a, 10.0), dbp.a.a, dbp.b.a, $$0);
      ewf $$3 = $$0.dR().a($$2);
      if ($$3.c() == ewf.a.b) {
         return ja.a($$3.e()).c();
      } else {
         dbp $$4 = new dbp($$1, $$1.a(jf.b, 10.0), dbp.a.a, dbp.b.a, $$0);
         ewf $$5 = $$0.dR().a($$4);
         return $$5.c() == ewf.a.b ? ja.a($$5.e()).c() : null;
      }
   }

   private static boolean a(ckn $$0, btc $$1) {
      return !$$1.a($$0, 24.0);
   }

   private static boolean b(ckn $$0, btc $$1) {
      return $$1.f($$0) - 4.0F <= 0.0F;
   }

   private static boolean c(aqm $$0, ckn $$1) {
      ja $$2 = $$1.dr();

      for (int $$3 = 1; $$3 <= 4; $$3++) {
         ja $$4 = $$2.a(jf.b, $$3);
         if (!$$0.a_($$4).i() && !$$0.b_($$4).a(awc.a)) {
            return false;
         }
      }

      return true;
   }

   private static Optional<ewh> a(ckn $$0, ayo $$1, ewh $$2) {
      for (int $$4 : ac.a(h, $$1)) {
         Optional<ewh> $$5 = bvz.a($$0, $$2, 1.4F, $$4, false);
         if ($$5.isPresent()) {
            return $$5;
         }
      }

      return Optional.empty();
   }
}
