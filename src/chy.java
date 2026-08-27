import com.google.common.annotations.VisibleForTesting;
import com.google.common.collect.Lists;
import it.unimi.dsi.fastutil.objects.ObjectArrayList;
import java.util.Map;
import java.util.Optional;
import javax.annotation.Nullable;

public class chy extends bsg<chv> {
   private static final int c = 4;
   private static final int d = 10;
   private static final int e = 2;
   private static final int f = Math.round(10.0F);
   private static final float g = 1.4F;
   private static final ObjectArrayList<Integer> h = new ObjectArrayList(Lists.newArrayList(new Integer[]{40, 55, 60, 75, 80}));

   @VisibleForTesting
   public chy() {
      super(Map.of(bzr.o, bzs.a, bzr.aU, bzs.b, bzr.aZ, bzs.c, bzr.ba, bzs.c, bzr.aV, bzs.b, bzr.m, bzs.b, bzr.bb, bzs.c), 200);
   }

   protected boolean a(aps $$0, chv $$1) {
      if (!$$1.aC() && !$$1.bc()) {
         return false;
      } else if (bva.a($$1)) {
         return false;
      } else if ($$1.dP().a(bzr.ba, bzs.a)) {
         return true;
      } else {
         bqo $$2 = $$1.dP().c(bzr.o).orElse(null);
         if ($$2 == null) {
            return false;
         } else if (a($$1, $$2)) {
            $$1.dP().b(bzr.o);
            return false;
         } else if (b($$1, $$2)) {
            return false;
         } else if (!b($$0, $$1)) {
            return false;
         } else {
            ib $$3 = a($$1, chx.a($$2, $$1.ei()));
            if ($$3 == null) {
               return false;
            } else if (!chx.a($$1, $$3.b()) && !chx.a($$1, $$3.b(4).b())) {
               return false;
            } else {
               $$1.dP().a(bzr.ba, $$3);
               return true;
            }
         }
      }
   }

   protected boolean a(aps $$0, chv $$1, long $$2) {
      return $$1.ap() != bqz.a && !$$1.dP().a(bzr.aU);
   }

   protected void b(aps $$0, chv $$1, long $$2) {
      if ($$1.dP().a(bzr.aZ, bzs.b)) {
         $$1.dP().a(bzr.aZ, aym.a, (long)f);
      }

      $$1.b(bqz.r);
      $$0.a(null, $$1, aum.cE, aun.f, 1.0F, 1.0F);
      $$1.dP().c(bzr.ba).ifPresent($$1x -> $$1.a(eg.a.b, $$1x.b()));
   }

   protected void c(aps $$0, chv $$1, long $$2) {
      boolean $$3 = $$1.bc();
      if (!$$3 && $$1.dP().a(bzr.bb, bzs.a)) {
         $$1.dP().b(bzr.bb);
      }

      if (a($$1)) {
         esa $$4 = $$1.dP().c(bzr.ba).flatMap($$1x -> a($$1, $$1.ei(), esa.c($$1x))).orElse(null);
         if ($$4 == null) {
            $$1.b(bqz.a);
            return;
         }

         if ($$3) {
            $$1.dP().a(bzr.bb, aym.a);
         }

         $$1.a(aum.cK, 1.0F, 1.0F);
         $$1.b(bqz.g);
         $$1.r($$1.aX);
         $$1.p(true);
         $$1.g($$4);
      } else if (b($$1)) {
         $$1.a(aum.cL, 1.0F, 1.0F);
         $$1.b(bqz.a);
         $$1.p(false);
         boolean $$5 = $$1.dP().a(bzr.x);
         $$1.dP().a(bzr.aU, aym.a, $$5 ? 2L : 10L);
         $$1.dP().a(bzr.aV, aym.a, 100L);
      }
   }

   protected void d(aps $$0, chv $$1, long $$2) {
      if ($$1.ap() == bqz.g || $$1.ap() == bqz.r) {
         $$1.b(bqz.a);
      }

      $$1.dP().b(bzr.ba);
      $$1.dP().b(bzr.aZ);
      $$1.dP().b(bzr.bb);
   }

   private static boolean a(chv $$0) {
      return $$0.dP().c(bzr.aZ).isEmpty() && $$0.ap() == bqz.r;
   }

   private static boolean b(chv $$0) {
      boolean $$1 = $$0.ap() == bqz.g;
      boolean $$2 = $$0.aC();
      boolean $$3 = $$0.bc() && $$0.dP().a(bzr.bb, bzs.b);
      return $$1 && ($$2 || $$3);
   }

   @Nullable
   private static ib a(bqo $$0, esa $$1) {
      cyg $$2 = new cyg($$1, $$1.a(ih.a, 10.0), cyg.a.a, cyg.b.a, $$0);
      ery $$3 = $$0.dM().a($$2);
      if ($$3.c() == ery.a.b) {
         return ib.a($$3.e()).c();
      } else {
         cyg $$4 = new cyg($$1, $$1.a(ih.b, 10.0), cyg.a.a, cyg.b.a, $$0);
         ery $$5 = $$0.dM().a($$4);
         return $$5.c() == ery.a.b ? ib.a($$3.e()).c() : null;
      }
   }

   private static boolean a(chv $$0, bqo $$1) {
      return !$$1.a($$0, 24.0);
   }

   private static boolean b(chv $$0, bqo $$1) {
      return $$1.f($$0) - 4.0F <= 0.0F;
   }

   private static boolean b(aps $$0, chv $$1) {
      ib $$2 = $$1.dm();

      for (int $$3 = 1; $$3 <= 4; $$3++) {
         ib $$4 = $$2.a(ih.b, $$3);
         if (!$$0.a_($$4).i() && !$$0.b_($$4).a(avh.a)) {
            return false;
         }
      }

      return true;
   }

   private static Optional<esa> a(chv $$0, axr $$1, esa $$2) {
      for (int $$4 : ac.a(h, $$1)) {
         Optional<esa> $$5 = btk.a($$0, $$2, 1.4F, $$4, false);
         if ($$5.isPresent()) {
            return $$5;
         }
      }

      return Optional.empty();
   }
}
