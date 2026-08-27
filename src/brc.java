import java.util.Map;
import java.util.Optional;
import java.util.function.Predicate;
import javax.annotation.Nullable;

public class brc<E extends bpx> extends brh<E> {
   private static final int c = 100;
   private static final int d = 120;
   private static final int e = 5;
   private static final int f = 4;
   private static final Predicate<bpx> g = $$0 -> $$0.ej() != null || $$0.dB() || $$0.bN();
   private final float h;
   private final Predicate<E> i;

   public brc(float $$0) {
      this($$0, g::test);
   }

   public brc(float $$0, Predicate<E> $$1) {
      super(Map.of(bys.Z, byt.c, bys.x, byt.c), 100, 120);
      this.h = $$0;
      this.i = $$1;
   }

   protected boolean a(apf $$0, E $$1) {
      return this.i.test($$1) && ($$1.dP().a(bys.x) || $$1.dP().a(bys.Z));
   }

   protected boolean a(apf $$0, E $$1, long $$2) {
      return true;
   }

   protected void b(apf $$0, E $$1, long $$2) {
      $$1.dP().a(bys.Z, true);
      $$1.dP().b(bys.m);
   }

   protected void c(apf $$0, E $$1, long $$2) {
      bqq<?> $$3 = $$1.dP();
      $$3.b(bys.Z);
   }

   protected void d(apf $$0, E $$1, long $$2) {
      if ($$1.K().l()) {
         ept $$3 = this.a($$1, $$0);
         if ($$3 != null) {
            $$1.dP().a(bys.m, new byv($$3, this.h, 0));
         }
      }
   }

   @Nullable
   private ept a(E $$0, apf $$1) {
      if ($$0.bN()) {
         Optional<ept> $$2 = this.a((cwh)$$1, $$0).map(ept::c);
         if ($$2.isPresent()) {
            return $$2.get();
         }
      }

      return cam.a($$0, 5, 4);
   }

   private Optional<ib> a(cwh $$0, box $$1) {
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
