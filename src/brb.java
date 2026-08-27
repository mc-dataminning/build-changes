import java.util.Map;
import java.util.Optional;
import java.util.function.Predicate;
import javax.annotation.Nullable;

public class brb<E extends bpw> extends brg<E> {
   private static final int c = 100;
   private static final int d = 120;
   private static final int e = 5;
   private static final int f = 4;
   private static final Predicate<bpw> g = $$0 -> $$0.ej() != null || $$0.dB() || $$0.bN();
   private final float h;
   private final Predicate<E> i;

   public brb(float $$0) {
      this($$0, g::test);
   }

   public brb(float $$0, Predicate<E> $$1) {
      super(Map.of(byr.Z, bys.c, byr.x, bys.c), 100, 120);
      this.h = $$0;
      this.i = $$1;
   }

   protected boolean a(apf $$0, E $$1) {
      return this.i.test($$1) && ($$1.dP().a(byr.x) || $$1.dP().a(byr.Z));
   }

   protected boolean a(apf $$0, E $$1, long $$2) {
      return true;
   }

   protected void b(apf $$0, E $$1, long $$2) {
      $$1.dP().a(byr.Z, true);
      $$1.dP().b(byr.m);
   }

   protected void c(apf $$0, E $$1, long $$2) {
      bqp<?> $$3 = $$1.dP();
      $$3.b(byr.Z);
   }

   protected void d(apf $$0, E $$1, long $$2) {
      if ($$1.K().l()) {
         epr $$3 = this.a($$1, $$0);
         if ($$3 != null) {
            $$1.dP().a(byr.m, new byu($$3, this.h, 0));
         }
      }
   }

   @Nullable
   private epr a(E $$0, apf $$1) {
      if ($$0.bN()) {
         Optional<epr> $$2 = this.a((cwf)$$1, $$0).map(epr::c);
         if ($$2.isPresent()) {
            return $$2.get();
         }
      }

      return cal.a($$0, 5, 4);
   }

   private Optional<ib> a(cwf $$0, bow $$1) {
      ib $$2 = $$1.dm();
      if (!$$0.a_($$2).k($$0, $$2).c()) {
         return Optional.empty();
      } else {
         Predicate<ib> $$3;
         if (aww.f($$1.dg()) == 2) {
            $$3 = $$1x -> ib.a($$1x).allMatch($$1xx -> $$0.b_($$1xx).a(aus.a));
         } else {
            $$3 = $$1x -> $$0.b_($$1x).a(aus.a);
         }

         return ib.a($$2, 5, 1, $$3);
      }
   }
}
