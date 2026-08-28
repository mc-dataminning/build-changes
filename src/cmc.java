import com.google.common.annotations.VisibleForTesting;
import com.google.common.collect.Lists;
import it.unimi.dsi.fastutil.objects.ObjectArrayList;
import java.util.Map;
import java.util.Optional;
import javax.annotation.Nullable;

public class cmc extends bwf<clz> {
   private static final int c = 4;
   private static final int d = 10;
   private static final int e = 2;
   private static final int f = Math.round(10.0F);
   private static final float g = 24.0F;
   private static final float h = 1.4F;
   private static final float i = 0.058333334F;
   private static final ObjectArrayList<Integer> j = new ObjectArrayList(Lists.newArrayList(new Integer[]{40, 55, 60, 75, 80}));

   @VisibleForTesting
   public cmc() {
      super(Map.of(cdq.o, cdr.a, cdq.aU, cdr.b, cdq.aZ, cdr.c, cdq.ba, cdr.c, cdq.aV, cdr.b, cdq.m, cdr.b, cdq.bb, cdr.c), 200);
   }

   public static boolean a(arj $$0, clz $$1) {
      if (!$$1.aH() && !$$1.bi()) {
         return false;
      } else if (byz.a($$1)) {
         return false;
      } else if ($$1.dY().a(cdq.ba, cdr.a)) {
         return true;
      } else {
         bun $$2 = $$1.dY().c(cdq.o).orElse(null);
         if ($$2 == null) {
            return false;
         } else if (a($$1, $$2)) {
            $$1.dY().b(cdq.o);
            return false;
         } else if (b($$1, $$2)) {
            return false;
         } else if (!c($$0, $$1)) {
            return false;
         } else {
            jf $$3 = a($$1, cmb.a($$2, $$1.dV()));
            if ($$3 == null) {
               return false;
            } else {
               dus $$4 = $$0.a_($$3.e());
               if ($$1.ao().a($$4)) {
                  return false;
               } else if (!cmb.a($$1, $$3.b()) && !cmb.a($$1, $$3.b(4).b())) {
                  return false;
               } else {
                  $$1.dY().a(cdq.ba, $$3);
                  return true;
               }
            }
         }
      }
   }

   protected boolean b(arj $$0, clz $$1) {
      return a($$0, $$1);
   }

   protected boolean a(arj $$0, clz $$1, long $$2) {
      return $$1.av() != buz.a && !$$1.dY().a(cdq.aU);
   }

   protected void b(arj $$0, clz $$1, long $$2) {
      if ($$1.dY().a(cdq.aZ, cdr.b)) {
         $$1.dY().a(cdq.aZ, bak.a, (long)f);
      }

      $$1.b(buz.r);
      $$0.a(null, $$1, awg.cE, awh.f, 1.0F, 1.0F);
      $$1.dY().c(cdq.ba).ifPresent($$1x -> $$1.a(fg.a.b, $$1x.b()));
   }

   protected void c(arj $$0, clz $$1, long $$2) {
      boolean $$3 = $$1.bi();
      if (!$$3 && $$1.dY().a(cdq.bb, cdr.a)) {
         $$1.dY().b(cdq.bb);
      }

      if (a($$1)) {
         eyw $$4 = $$1.dY().c(cdq.ba).flatMap($$1x -> a($$1, $$1.dV(), eyw.c($$1x))).orElse(null);
         if ($$4 == null) {
            $$1.b(buz.a);
            return;
         }

         if ($$3) {
            $$1.dY().a(cdq.bb, bak.a);
         }

         $$1.a(awg.cK, 1.0F, 1.0F);
         $$1.b(buz.g);
         $$1.v($$1.aT);
         $$1.r(true);
         $$1.h($$4);
      } else if (b($$1)) {
         $$1.a(awg.cL, 1.0F, 1.0F);
         $$1.b(buz.a);
         $$1.r(false);
         boolean $$5 = $$1.dY().a(cdq.x);
         $$1.dY().a(cdq.aU, bak.a, $$5 ? 2L : 10L);
         $$1.dY().a(cdq.aV, bak.a, 100L);
      }
   }

   protected void d(arj $$0, clz $$1, long $$2) {
      if ($$1.av() == buz.g || $$1.av() == buz.r) {
         $$1.b(buz.a);
      }

      $$1.dY().b(cdq.ba);
      $$1.dY().b(cdq.aZ);
      $$1.dY().b(cdq.bb);
   }

   private static boolean a(clz $$0) {
      return $$0.dY().c(cdq.aZ).isEmpty() && $$0.av() == buz.r;
   }

   private static boolean b(clz $$0) {
      boolean $$1 = $$0.av() == buz.g;
      boolean $$2 = $$0.aH();
      boolean $$3 = $$0.bi() && $$0.dY().a(cdq.bb, cdr.b);
      return $$1 && ($$2 || $$3);
   }

   @Nullable
   private static jf a(bun $$0, eyw $$1) {
      ddr $$2 = new ddr($$1, $$1.a(jk.a, 10.0), ddr.a.a, ddr.b.a, $$0);
      eyu $$3 = $$0.dS().a($$2);
      if ($$3.d() == eyu.a.b) {
         return jf.a((jy)$$3.g()).d();
      } else {
         ddr $$4 = new ddr($$1, $$1.a(jk.b, 10.0), ddr.a.a, ddr.b.a, $$0);
         eyu $$5 = $$0.dS().a($$4);
         return $$5.d() == eyu.a.b ? jf.a((jy)$$5.g()).d() : null;
      }
   }

   private static boolean a(clz $$0, bun $$1) {
      return !$$1.a($$0, $$0.h(bvu.m));
   }

   private static boolean b(clz $$0, bun $$1) {
      return $$1.f($$0) - 4.0F <= 0.0F;
   }

   private static boolean c(arj $$0, clz $$1) {
      jf $$2 = $$1.ds();

      for (int $$3 = 1; $$3 <= 4; $$3++) {
         jf $$4 = $$2.a(jk.b, $$3);
         if (!$$0.a_($$4).l() && !$$0.b_($$4).a(axb.a)) {
            return false;
         }
      }

      return true;
   }

   private static Optional<eyw> a(clz $$0, azn $$1, eyw $$2) {
      for (int $$4 : ad.a(j, $$1)) {
         float $$5 = 0.058333334F * (float)$$0.h(bvu.m);
         Optional<eyw> $$6 = bxj.a($$0, $$2, $$5, $$4, false);
         if ($$6.isPresent()) {
            return $$6;
         }
      }

      return Optional.empty();
   }
}
