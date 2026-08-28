import com.google.common.annotations.VisibleForTesting;
import com.google.common.collect.Lists;
import it.unimi.dsi.fastutil.objects.ObjectArrayList;
import java.util.Map;
import java.util.Optional;
import javax.annotation.Nullable;

public class clc extends bvh<ckz> {
   private static final int c = 4;
   private static final int d = 10;
   private static final int e = 2;
   private static final int f = Math.round(10.0F);
   private static final float g = 1.4F;
   private static final ObjectArrayList<Integer> h = new ObjectArrayList(Lists.newArrayList(new Integer[]{40, 55, 60, 75, 80}));

   @VisibleForTesting
   public clc() {
      super(Map.of(ccs.o, cct.a, ccs.aU, cct.b, ccs.aZ, cct.c, ccs.ba, cct.c, ccs.aV, cct.b, ccs.m, cct.b, ccs.bb, cct.c), 200);
   }

   public static boolean a(aqu $$0, ckz $$1) {
      if (!$$1.aF() && !$$1.bf()) {
         return false;
      } else if (byb.a($$1)) {
         return false;
      } else if ($$1.dT().a(ccs.ba, cct.a)) {
         return true;
      } else {
         btn $$2 = $$1.dT().c(ccs.o).orElse(null);
         if ($$2 == null) {
            return false;
         } else if (a($$1, $$2)) {
            $$1.dT().b(ccs.o);
            return false;
         } else if (b($$1, $$2)) {
            return false;
         } else if (!c($$0, $$1)) {
            return false;
         } else {
            jd $$3 = a($$1, clb.a($$2, $$1.dR()));
            if ($$3 == null) {
               return false;
            } else {
               dtc $$4 = $$0.a_($$3.e());
               if ($$1.am().a($$4)) {
                  return false;
               } else if (!clb.a($$1, $$3.b()) && !clb.a($$1, $$3.b(4).b())) {
                  return false;
               } else {
                  $$1.dT().a(ccs.ba, $$3);
                  return true;
               }
            }
         }
      }
   }

   protected boolean b(aqu $$0, ckz $$1) {
      return a($$0, $$1);
   }

   protected boolean a(aqu $$0, ckz $$1, long $$2) {
      return $$1.at() != bua.a && !$$1.dT().a(ccs.aU);
   }

   protected void b(aqu $$0, ckz $$1, long $$2) {
      if ($$1.dT().a(ccs.aZ, cct.b)) {
         $$1.dT().a(ccs.aZ, azs.a, (long)f);
      }

      $$1.b(bua.r);
      $$0.a(null, $$1, avp.cE, avq.f, 1.0F, 1.0F);
      $$1.dT().c(ccs.ba).ifPresent($$1x -> $$1.a(ff.a.b, $$1x.b()));
   }

   protected void c(aqu $$0, ckz $$1, long $$2) {
      boolean $$3 = $$1.bf();
      if (!$$3 && $$1.dT().a(ccs.bb, cct.a)) {
         $$1.dT().b(ccs.bb);
      }

      if (a($$1)) {
         exc $$4 = $$1.dT().c(ccs.ba).flatMap($$1x -> a($$1, $$1.dR(), exc.c($$1x))).orElse(null);
         if ($$4 == null) {
            $$1.b(bua.a);
            return;
         }

         if ($$3) {
            $$1.dT().a(ccs.bb, azs.a);
         }

         $$1.a(avp.cK, 1.0F, 1.0F);
         $$1.b(bua.g);
         $$1.t($$1.aY);
         $$1.r(true);
         $$1.i($$4);
      } else if (b($$1)) {
         $$1.a(avp.cL, 1.0F, 1.0F);
         $$1.b(bua.a);
         $$1.r(false);
         boolean $$5 = $$1.dT().a(ccs.x);
         $$1.dT().a(ccs.aU, azs.a, $$5 ? 2L : 10L);
         $$1.dT().a(ccs.aV, azs.a, 100L);
      }
   }

   protected void d(aqu $$0, ckz $$1, long $$2) {
      if ($$1.at() == bua.g || $$1.at() == bua.r) {
         $$1.b(bua.a);
      }

      $$1.dT().b(ccs.ba);
      $$1.dT().b(ccs.aZ);
      $$1.dT().b(ccs.bb);
   }

   private static boolean a(ckz $$0) {
      return $$0.dT().c(ccs.aZ).isEmpty() && $$0.at() == bua.r;
   }

   private static boolean b(ckz $$0) {
      boolean $$1 = $$0.at() == bua.g;
      boolean $$2 = $$0.aF();
      boolean $$3 = $$0.bf() && $$0.dT().a(ccs.bb, cct.b);
      return $$1 && ($$2 || $$3);
   }

   @Nullable
   private static jd a(btn $$0, exc $$1) {
      dcf $$2 = new dcf($$1, $$1.a(ji.a, 10.0), dcf.a.a, dcf.b.a, $$0);
      exa $$3 = $$0.dO().a($$2);
      if ($$3.c() == exa.a.b) {
         return jd.a((jw)$$3.e()).d();
      } else {
         dcf $$4 = new dcf($$1, $$1.a(ji.b, 10.0), dcf.a.a, dcf.b.a, $$0);
         exa $$5 = $$0.dO().a($$4);
         return $$5.c() == exa.a.b ? jd.a((jw)$$5.e()).d() : null;
      }
   }

   private static boolean a(ckz $$0, btn $$1) {
      return !$$1.a($$0, 24.0);
   }

   private static boolean b(ckz $$0, btn $$1) {
      return $$1.f($$0) - 4.0F <= 0.0F;
   }

   private static boolean c(aqu $$0, ckz $$1) {
      jd $$2 = $$1.do();

      for (int $$3 = 1; $$3 <= 4; $$3++) {
         jd $$4 = $$2.a(ji.b, $$3);
         if (!$$0.a_($$4).i() && !$$0.b_($$4).a(awk.a)) {
            return false;
         }
      }

      return true;
   }

   private static Optional<exc> a(ckz $$0, ayw $$1, exc $$2) {
      for (int $$4 : ad.a(h, $$1)) {
         Optional<exc> $$5 = bwl.a($$0, $$2, 1.4F, $$4, false);
         if ($$5.isPresent()) {
            return $$5;
         }
      }

      return Optional.empty();
   }
}
