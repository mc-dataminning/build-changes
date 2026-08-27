import com.google.common.annotations.VisibleForTesting;
import com.google.common.collect.Lists;
import it.unimi.dsi.fastutil.objects.ObjectArrayList;
import java.util.Map;
import java.util.Optional;
import javax.annotation.Nullable;

public class cif extends bsl<cic> {
   private static final int c = 4;
   private static final int d = 10;
   private static final int e = 2;
   private static final int f = Math.round(10.0F);
   private static final float g = 1.4F;
   private static final ObjectArrayList<Integer> h = new ObjectArrayList(Lists.newArrayList(new Integer[]{40, 55, 60, 75, 80}));

   @VisibleForTesting
   public cif() {
      super(Map.of(bzw.o, bzx.a, bzw.aU, bzx.b, bzw.aZ, bzx.c, bzw.ba, bzx.c, bzw.aV, bzx.b, bzw.m, bzx.b, bzw.bb, bzx.c), 200);
   }

   protected boolean a(apu $$0, cic $$1) {
      if (!$$1.aC() && !$$1.bc()) {
         return false;
      } else if (bvf.a($$1)) {
         return false;
      } else if ($$1.dP().a(bzw.ba, bzx.a)) {
         return true;
      } else {
         bqt $$2 = $$1.dP().c(bzw.o).orElse(null);
         if ($$2 == null) {
            return false;
         } else if (a($$1, $$2)) {
            $$1.dP().b(bzw.o);
            return false;
         } else if (b($$1, $$2)) {
            return false;
         } else if (!b($$0, $$1)) {
            return false;
         } else {
            id $$3 = a($$1, cie.a($$2, $$1.ei()));
            if ($$3 == null) {
               return false;
            } else if (!cie.a($$1, $$3.b()) && !cie.a($$1, $$3.b(4).b())) {
               return false;
            } else {
               $$1.dP().a(bzw.ba, $$3);
               return true;
            }
         }
      }
   }

   protected boolean a(apu $$0, cic $$1, long $$2) {
      return $$1.ap() != bre.a && !$$1.dP().a(bzw.aU);
   }

   protected void b(apu $$0, cic $$1, long $$2) {
      if ($$1.dP().a(bzw.aZ, bzx.b)) {
         $$1.dP().a(bzw.aZ, ayo.a, (long)f);
      }

      $$1.b(bre.r);
      $$0.a(null, $$1, auo.cE, aup.f, 1.0F, 1.0F);
      $$1.dP().c(bzw.ba).ifPresent($$1x -> $$1.a(eh.a.b, $$1x.b()));
   }

   protected void c(apu $$0, cic $$1, long $$2) {
      boolean $$3 = $$1.bc();
      if (!$$3 && $$1.dP().a(bzw.bb, bzx.a)) {
         $$1.dP().b(bzw.bb);
      }

      if (a($$1)) {
         esj $$4 = $$1.dP().c(bzw.ba).flatMap($$1x -> a($$1, $$1.ei(), esj.c($$1x))).orElse(null);
         if ($$4 == null) {
            $$1.b(bre.a);
            return;
         }

         if ($$3) {
            $$1.dP().a(bzw.bb, ayo.a);
         }

         $$1.a(auo.cK, 1.0F, 1.0F);
         $$1.b(bre.g);
         $$1.r($$1.aX);
         $$1.p(true);
         $$1.g($$4);
      } else if (b($$1)) {
         $$1.a(auo.cL, 1.0F, 1.0F);
         $$1.b(bre.a);
         $$1.p(false);
         boolean $$5 = $$1.dP().a(bzw.x);
         $$1.dP().a(bzw.aU, ayo.a, $$5 ? 2L : 10L);
         $$1.dP().a(bzw.aV, ayo.a, 100L);
      }
   }

   protected void d(apu $$0, cic $$1, long $$2) {
      if ($$1.ap() == bre.g || $$1.ap() == bre.r) {
         $$1.b(bre.a);
      }

      $$1.dP().b(bzw.ba);
      $$1.dP().b(bzw.aZ);
      $$1.dP().b(bzw.bb);
   }

   private static boolean a(cic $$0) {
      return $$0.dP().c(bzw.aZ).isEmpty() && $$0.ap() == bre.r;
   }

   private static boolean b(cic $$0) {
      boolean $$1 = $$0.ap() == bre.g;
      boolean $$2 = $$0.aC();
      boolean $$3 = $$0.bc() && $$0.dP().a(bzw.bb, bzx.b);
      return $$1 && ($$2 || $$3);
   }

   @Nullable
   private static id a(bqt $$0, esj $$1) {
      cyp $$2 = new cyp($$1, $$1.a(ij.a, 10.0), cyp.a.a, cyp.b.a, $$0);
      esh $$3 = $$0.dM().a($$2);
      if ($$3.c() == esh.a.b) {
         return id.a($$3.e()).c();
      } else {
         cyp $$4 = new cyp($$1, $$1.a(ij.b, 10.0), cyp.a.a, cyp.b.a, $$0);
         esh $$5 = $$0.dM().a($$4);
         return $$5.c() == esh.a.b ? id.a($$3.e()).c() : null;
      }
   }

   private static boolean a(cic $$0, bqt $$1) {
      return !$$1.a($$0, 24.0);
   }

   private static boolean b(cic $$0, bqt $$1) {
      return $$1.f($$0) - 4.0F <= 0.0F;
   }

   private static boolean b(apu $$0, cic $$1) {
      id $$2 = $$1.dm();

      for (int $$3 = 1; $$3 <= 4; $$3++) {
         id $$4 = $$2.a(ij.b, $$3);
         if (!$$0.a_($$4).i() && !$$0.b_($$4).a(avj.a)) {
            return false;
         }
      }

      return true;
   }

   private static Optional<esj> a(cic $$0, axt $$1, esj $$2) {
      for (int $$4 : ac.a(h, $$1)) {
         Optional<esj> $$5 = btp.a($$0, $$2, 1.4F, $$4, false);
         if ($$5.isPresent()) {
            return $$5;
         }
      }

      return Optional.empty();
   }
}
