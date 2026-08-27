import com.google.common.annotations.VisibleForTesting;
import com.google.common.collect.Lists;
import it.unimi.dsi.fastutil.objects.ObjectArrayList;
import java.util.Map;
import java.util.Optional;
import javax.annotation.Nullable;

public class ciq extends bsw<cin> {
   private static final int c = 4;
   private static final int d = 10;
   private static final int e = 2;
   private static final int f = Math.round(10.0F);
   private static final float g = 1.4F;
   private static final ObjectArrayList<Integer> h = new ObjectArrayList(Lists.newArrayList(new Integer[]{40, 55, 60, 75, 80}));

   @VisibleForTesting
   public ciq() {
      super(Map.of(cah.o, cai.a, cah.aU, cai.b, cah.aZ, cai.c, cah.ba, cai.c, cah.aV, cai.b, cah.m, cai.b, cah.bb, cai.c), 200);
   }

   protected boolean a(aqe $$0, cin $$1) {
      if (!$$1.aC() && !$$1.bc()) {
         return false;
      } else if (bvq.a($$1)) {
         return false;
      } else if ($$1.dQ().a(cah.ba, cai.a)) {
         return true;
      } else {
         bre $$2 = $$1.dQ().c(cah.o).orElse(null);
         if ($$2 == null) {
            return false;
         } else if (a($$1, $$2)) {
            $$1.dQ().b(cah.o);
            return false;
         } else if (b($$1, $$2)) {
            return false;
         } else if (!b($$0, $$1)) {
            return false;
         } else {
            im $$3 = a($$1, cip.a($$2, $$1.ej()));
            if ($$3 == null) {
               return false;
            } else if (!cip.a($$1, $$3.b()) && !cip.a($$1, $$3.b(4).b())) {
               return false;
            } else {
               $$1.dQ().a(cah.ba, $$3);
               return true;
            }
         }
      }
   }

   protected boolean a(aqe $$0, cin $$1, long $$2) {
      return $$1.ap() != brp.a && !$$1.dQ().a(cah.aU);
   }

   protected void b(aqe $$0, cin $$1, long $$2) {
      if ($$1.dQ().a(cah.aZ, cai.b)) {
         $$1.dQ().a(cah.aZ, ayy.a, (long)f);
      }

      $$1.b(brp.r);
      $$0.a(null, $$1, auz.cE, ava.f, 1.0F, 1.0F);
      $$1.dQ().c(cah.ba).ifPresent($$1x -> $$1.a(eo.a.b, $$1x.b()));
   }

   protected void c(aqe $$0, cin $$1, long $$2) {
      boolean $$3 = $$1.bc();
      if (!$$3 && $$1.dQ().a(cah.bb, cai.a)) {
         $$1.dQ().b(cah.bb);
      }

      if (a($$1)) {
         etf $$4 = $$1.dQ().c(cah.ba).flatMap($$1x -> a($$1, $$1.ej(), etf.c($$1x))).orElse(null);
         if ($$4 == null) {
            $$1.b(brp.a);
            return;
         }

         if ($$3) {
            $$1.dQ().a(cah.bb, ayy.a);
         }

         $$1.a(auz.cK, 1.0F, 1.0F);
         $$1.b(brp.g);
         $$1.r($$1.aZ);
         $$1.q(true);
         $$1.g($$4);
      } else if (b($$1)) {
         $$1.a(auz.cL, 1.0F, 1.0F);
         $$1.b(brp.a);
         $$1.q(false);
         boolean $$5 = $$1.dQ().a(cah.x);
         $$1.dQ().a(cah.aU, ayy.a, $$5 ? 2L : 10L);
         $$1.dQ().a(cah.aV, ayy.a, 100L);
      }
   }

   protected void d(aqe $$0, cin $$1, long $$2) {
      if ($$1.ap() == brp.g || $$1.ap() == brp.r) {
         $$1.b(brp.a);
      }

      $$1.dQ().b(cah.ba);
      $$1.dQ().b(cah.aZ);
      $$1.dQ().b(cah.bb);
   }

   private static boolean a(cin $$0) {
      return $$0.dQ().c(cah.aZ).isEmpty() && $$0.ap() == brp.r;
   }

   private static boolean b(cin $$0) {
      boolean $$1 = $$0.ap() == brp.g;
      boolean $$2 = $$0.aC();
      boolean $$3 = $$0.bc() && $$0.dQ().a(cah.bb, cai.b);
      return $$1 && ($$2 || $$3);
   }

   @Nullable
   private static im a(bre $$0, etf $$1) {
      czd $$2 = new czd($$1, $$1.a(ir.a, 10.0), czd.a.a, czd.b.a, $$0);
      etd $$3 = $$0.dN().a($$2);
      if ($$3.c() == etd.a.b) {
         return im.a($$3.e()).c();
      } else {
         czd $$4 = new czd($$1, $$1.a(ir.b, 10.0), czd.a.a, czd.b.a, $$0);
         etd $$5 = $$0.dN().a($$4);
         return $$5.c() == etd.a.b ? im.a($$3.e()).c() : null;
      }
   }

   private static boolean a(cin $$0, bre $$1) {
      return !$$1.a($$0, 24.0);
   }

   private static boolean b(cin $$0, bre $$1) {
      return $$1.f($$0) - 4.0F <= 0.0F;
   }

   private static boolean b(aqe $$0, cin $$1) {
      im $$2 = $$1.dn();

      for (int $$3 = 1; $$3 <= 4; $$3++) {
         im $$4 = $$2.a(ir.b, $$3);
         if (!$$0.a_($$4).i() && !$$0.b_($$4).a(avt.a)) {
            return false;
         }
      }

      return true;
   }

   private static Optional<etf> a(cin $$0, ayd $$1, etf $$2) {
      for (int $$4 : ac.a(h, $$1)) {
         Optional<etf> $$5 = bua.a($$0, $$2, 1.4F, $$4, false);
         if ($$5.isPresent()) {
            return $$5;
         }
      }

      return Optional.empty();
   }
}
