import com.google.common.collect.ImmutableMap;
import java.util.Optional;
import java.util.function.Predicate;
import javax.annotation.Nullable;

public class bkn extends bks<bjk> {
   private static final int c = 100;
   private static final int d = 120;
   private static final int e = 5;
   private static final int f = 4;
   private static final Predicate<bjk> g = $$0 -> $$0.ef() != null || $$0.dz() || $$0.bM();
   private final float h;
   private final Predicate<bjk> i;

   public bkn(float $$0) {
      this($$0, g);
   }

   public bkn(float $$0, Predicate<bjk> $$1) {
      super(ImmutableMap.of(bsc.Y, bsd.c, bsc.x, bsd.a), 100, 120);
      this.h = $$0;
      this.i = $$1;
   }

   protected boolean a(akn $$0, bjk $$1) {
      return this.i.test($$1);
   }

   protected boolean a(akn $$0, bjk $$1, long $$2) {
      return true;
   }

   protected void b(akn $$0, bjk $$1, long $$2) {
      $$1.dM().a(bsc.Y, true);
      $$1.dM().b(bsc.m);
   }

   protected void c(akn $$0, bjk $$1, long $$2) {
      bkb<?> $$3 = $$1.dM();
      $$3.b(bsc.Y);
   }

   protected void d(akn $$0, bjk $$1, long $$2) {
      if ($$1.H().l()) {
         ehi $$3 = this.a($$1, $$0);
         if ($$3 != null) {
            $$1.dM().a(bsc.m, new bsf($$3, this.h, 0));
         }
      }
   }

   @Nullable
   private ehi a(bjk $$0, akn $$1) {
      if ($$0.bM()) {
         Optional<ehi> $$2 = this.a((cow)$$1, (bil)$$0).map(ehi::c);
         if ($$2.isPresent()) {
            return $$2.get();
         }
      }

      return btu.a($$0, 5, 4);
   }

   private Optional<gw> a(cow $$0, bil $$1) {
      gw $$2 = $$1.dk();
      if (!$$0.a_($$2).k($$0, $$2).c()) {
         return Optional.empty();
      } else {
         Predicate<gw> $$3;
         if (ars.f($$1.df()) == 2) {
            $$3 = $$1x -> gw.a($$1x).allMatch($$1xx -> $$0.b_($$1xx).a(apt.a));
         } else {
            $$3 = $$1x -> $$0.b_($$1x).a(apt.a);
         }

         return gw.a($$2, 5, 1, $$3);
      }
   }
}
