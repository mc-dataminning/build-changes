import com.google.common.annotations.VisibleForTesting;
import com.google.common.collect.Lists;
import it.unimi.dsi.fastutil.objects.ObjectArrayList;
import java.util.Map;
import java.util.Optional;
import javax.annotation.Nullable;

public class cgf extends bqp<cgc> {
   private static final int c = 4;
   private static final int d = 10;
   private static final int e = 2;
   private static final int f = Math.round(10.0F);
   private static final float g = 1.4F;
   private static final ObjectArrayList<Integer> h = new ObjectArrayList(Lists.newArrayList(new Integer[]{40, 55, 60, 75, 80}));

   @VisibleForTesting
   public cgf() {
      super(Map.of(bya.o, byb.a, bya.aU, byb.b, bya.aZ, byb.c, bya.ba, byb.c, bya.aV, byb.b, bya.m, byb.b, bya.bb, byb.c), 200);
   }

   protected boolean a(apa $$0, cgc $$1) {
      if (!$$1.aC() && !$$1.aZ()) {
         return false;
      } else if (btj.a($$1)) {
         return false;
      } else if ($$1.dM().a(bya.ba, byb.a)) {
         return true;
      } else {
         box $$2 = $$1.dM().c(bya.o).orElse(null);
         if ($$2 == null) {
            return false;
         } else if (a($$1, $$2)) {
            $$1.dM().b(bya.o);
            return false;
         } else if (b($$1, $$2)) {
            return false;
         } else if (!b($$0, $$1)) {
            return false;
         } else {
            ib $$3 = a($$1, cge.a($$2, $$1.ef()));
            if ($$3 == null) {
               return false;
            } else if (!cge.a($$1, $$3.b()) && !cge.a($$1, $$3.b(4).b())) {
               return false;
            } else {
               $$1.dM().a(bya.ba, $$3);
               return true;
            }
         }
      }
   }

   protected boolean a(apa $$0, cgc $$1, long $$2) {
      return $$1.ap() != bpi.a && !$$1.dM().a(bya.aU);
   }

   protected void b(apa $$0, cgc $$1, long $$2) {
      if ($$1.dM().a(bya.aZ, byb.b)) {
         $$1.dM().a(bya.aZ, axo.a, (long)f);
      }

      $$1.b(bpi.r);
      $$0.a(null, $$1, atp.cx, atq.f, 1.0F, 1.0F);
      $$1.dM().c(bya.ba).ifPresent($$1x -> $$1.a(eg.a.b, $$1x.b()));
   }

   protected void c(apa $$0, cgc $$1, long $$2) {
      boolean $$3 = $$1.aZ();
      if (!$$3 && $$1.dM().a(bya.bb, byb.a)) {
         $$1.dM().b(bya.bb);
      }

      if (a($$1)) {
         eov $$4 = $$1.dM().c(bya.ba).flatMap($$1x -> a($$1, $$1.ef(), eov.c($$1x))).orElse(null);
         if ($$4 == null) {
            $$1.b(bpi.a);
            return;
         }

         if ($$3) {
            $$1.dM().a(bya.bb, axo.a);
         }

         $$1.a(atp.cD, 1.0F, 1.0F);
         $$1.b(bpi.g);
         $$1.r($$1.aV);
         $$1.p(true);
         $$1.g($$4);
      } else if (b($$1)) {
         $$1.a(atp.cE, 1.0F, 1.0F);
         $$1.b(bpi.a);
         $$1.p(false);
         boolean $$5 = $$1.dM().a(bya.x);
         $$1.dM().a(bya.aU, axo.a, $$5 ? 2L : 10L);
         $$1.dM().a(bya.aV, axo.a, 100L);
      }
   }

   protected void d(apa $$0, cgc $$1, long $$2) {
      if ($$1.ap() == bpi.g || $$1.ap() == bpi.r) {
         $$1.b(bpi.a);
      }

      $$1.dM().b(bya.ba);
      $$1.dM().b(bya.aZ);
      $$1.dM().b(bya.bb);
   }

   private static boolean a(cgc $$0) {
      return $$0.dM().c(bya.aZ).isEmpty() && $$0.ap() == bpi.r;
   }

   private static boolean b(cgc $$0) {
      boolean $$1 = $$0.ap() == bpi.g;
      boolean $$2 = $$0.aC();
      boolean $$3 = $$0.aZ() && $$0.dM().a(bya.bb, byb.b);
      return $$1 && ($$2 || $$3);
   }

   @Nullable
   private static ib a(box $$0, eov $$1) {
      cvn $$2 = new cvn($$1, $$1.a(ih.a, 10.0), cvn.a.a, cvn.b.a, $$0);
      eot $$3 = $$0.dJ().a($$2);
      if ($$3.c() == eot.a.b) {
         return ib.a($$3.e()).c();
      } else {
         cvn $$4 = new cvn($$1, $$1.a(ih.b, 10.0), cvn.a.a, cvn.b.a, $$0);
         eot $$5 = $$0.dJ().a($$4);
         return $$5.c() == eot.a.b ? ib.a($$3.e()).c() : null;
      }
   }

   private static boolean a(cgc $$0, box $$1) {
      return !$$1.a($$0, 24.0);
   }

   private static boolean b(cgc $$0, box $$1) {
      return $$1.e($$0) - 4.0F <= 0.0F;
   }

   private static boolean b(apa $$0, cgc $$1) {
      ib $$2 = $$1.dj();

      for (int $$3 = 1; $$3 <= 4; $$3++) {
         ib $$4 = $$2.a(ih.b, $$3);
         if (!$$0.a_($$4).i() && !$$0.b_($$4).a(auj.a)) {
            return false;
         }
      }

      return true;
   }

   private static Optional<eov> a(cgc $$0, awt $$1, eov $$2) {
      for (int $$4 : ac.a(h, $$1)) {
         Optional<eov> $$5 = brt.a($$0, $$2, 1.4F, $$4, false);
         if ($$5.isPresent()) {
            return $$5;
         }
      }

      return Optional.empty();
   }
}
