import java.util.Map;
import java.util.Optional;
import java.util.function.Predicate;
import javax.annotation.Nullable;

public class bup<E extends btk> extends buu<E> {
   private static final int c = 100;
   private static final int d = 120;
   private static final int e = 5;
   private static final int f = 4;
   private static final Predicate<btk> g = $$0 -> $$0.ej() != null || $$0.dF() || $$0.bR();
   private final float h;
   private final Predicate<E> i;

   public bup(float $$0) {
      this($$0, g::test);
   }

   public bup(float $$0, Predicate<E> $$1) {
      super(Map.of(ccf.Z, ccg.c, ccf.x, ccg.c), 100, 120);
      this.h = $$0;
      this.i = $$1;
   }

   protected boolean a(aqm $$0, E $$1) {
      return this.i.test($$1) && ($$1.dU().a(ccf.x) || $$1.dU().a(ccf.Z));
   }

   protected boolean a(aqm $$0, E $$1, long $$2) {
      return true;
   }

   protected void b(aqm $$0, E $$1, long $$2) {
      $$1.dU().a(ccf.Z, true);
      $$1.dU().b(ccf.m);
   }

   protected void c(aqm $$0, E $$1, long $$2) {
      bud<?> $$3 = $$1.dU();
      $$3.b(ccf.Z);
   }

   protected void d(aqm $$0, E $$1, long $$2) {
      if ($$1.K().l()) {
         ewf $$3 = this.a($$1, $$0);
         if ($$3 != null) {
            $$1.dU().a(ccf.m, new cci($$3, this.h, 0));
         }
      }
   }

   @Nullable
   private ewf a(E $$0, aqm $$1) {
      if ($$0.bR()) {
         Optional<ewf> $$2 = this.a((dbl)$$1, $$0).map(ewf::c);
         if ($$2.isPresent()) {
            return $$2.get();
         }
      }

      return cdz.a($$0, 5, 4);
   }

   private Optional<ja> a(dbl $$0, bsg $$1) {
      ja $$2 = $$1.dq();
      if (!$$0.a_($$2).k($$0, $$2).c()) {
         return Optional.empty();
      } else {
         Predicate<ja> $$3;
         if (ayg.f($$1.dk()) == 2) {
            $$3 = $$1x -> ja.a($$1x).allMatch($$1xx -> $$0.b_($$1xx).a(awc.a));
         } else {
            $$3 = $$1x -> $$0.b_($$1x).a(awc.a);
         }

         return ja.a($$2, 5, 1, $$3);
      }
   }
}
