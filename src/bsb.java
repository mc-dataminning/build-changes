import java.util.Map;
import java.util.Optional;
import java.util.function.Predicate;
import javax.annotation.Nullable;

public class bsb<E extends bqw> extends bsg<E> {
   private static final int c = 100;
   private static final int d = 120;
   private static final int e = 5;
   private static final int f = 4;
   private static final Predicate<bqw> g = $$0 -> $$0.ej() != null || $$0.dB() || $$0.bN();
   private final float h;
   private final Predicate<E> i;

   public bsb(float $$0) {
      this($$0, g::test);
   }

   public bsb(float $$0, Predicate<E> $$1) {
      super(Map.of(bzr.Z, bzs.c, bzr.x, bzs.c), 100, 120);
      this.h = $$0;
      this.i = $$1;
   }

   protected boolean a(aps $$0, E $$1) {
      return this.i.test($$1) && ($$1.dP().a(bzr.x) || $$1.dP().a(bzr.Z));
   }

   protected boolean a(aps $$0, E $$1, long $$2) {
      return true;
   }

   protected void b(aps $$0, E $$1, long $$2) {
      $$1.dP().a(bzr.Z, true);
      $$1.dP().b(bzr.m);
   }

   protected void c(aps $$0, E $$1, long $$2) {
      brp<?> $$3 = $$1.dP();
      $$3.b(bzr.Z);
   }

   protected void d(aps $$0, E $$1, long $$2) {
      if ($$1.K().l()) {
         esa $$3 = this.a($$1, $$0);
         if ($$3 != null) {
            $$1.dP().a(bzr.m, new bzu($$3, this.h, 0));
         }
      }
   }

   @Nullable
   private esa a(E $$0, aps $$1) {
      if ($$0.bN()) {
         Optional<esa> $$2 = this.a((cyd)$$1, $$0).map(esa::c);
         if ($$2.isPresent()) {
            return $$2.get();
         }
      }

      return cbl.a($$0, 5, 4);
   }

   private Optional<ib> a(cyd $$0, bpv $$1) {
      ib $$2 = $$1.dm();
      if (!$$0.a_($$2).k($$0, $$2).c()) {
         return Optional.empty();
      } else {
         Predicate<ib> $$3;
         if (axk.f($$1.dg()) == 2) {
            $$3 = $$1x -> ib.a($$1x).allMatch($$1xx -> $$0.b_($$1xx).a(avh.a));
         } else {
            $$3 = $$1x -> $$0.b_($$1x).a(avh.a);
         }

         return ib.a($$2, 5, 1, $$3);
      }
   }
}
