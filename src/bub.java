import java.util.Map;
import java.util.Optional;
import java.util.function.Predicate;
import javax.annotation.Nullable;

public class bub<E extends bsw> extends bug<E> {
   private static final int c = 100;
   private static final int d = 120;
   private static final int e = 5;
   private static final int f = 4;
   private static final Predicate<bsw> g = $$0 -> $$0.eu() != null || $$0.dJ() || $$0.bV();
   private final float h;
   private final Predicate<E> i;

   public bub(float $$0) {
      this($$0, g::test);
   }

   public bub(float $$0, Predicate<E> $$1) {
      super(Map.of(cbr.Z, cbs.c, cbr.x, cbs.c), 100, 120);
      this.h = $$0;
      this.i = $$1;
   }

   protected boolean a(aqt $$0, E $$1) {
      return this.i.test($$1) && ($$1.dZ().a(cbr.x) || $$1.dZ().a(cbr.Z));
   }

   protected boolean a(aqt $$0, E $$1, long $$2) {
      return true;
   }

   protected void b(aqt $$0, E $$1, long $$2) {
      $$1.dZ().a(cbr.Z, true);
      $$1.dZ().b(cbr.m);
   }

   protected void c(aqt $$0, E $$1, long $$2) {
      btp<?> $$3 = $$1.dZ();
      $$3.b(cbr.Z);
   }

   protected void d(aqt $$0, E $$1, long $$2) {
      if ($$1.J().l()) {
         ewu $$3 = this.a($$1, $$0);
         if ($$3 != null) {
            $$1.dZ().a(cbr.m, new cbu($$3, this.h, 0));
         }
      }
   }

   @Nullable
   private ewu a(E $$0, aqt $$1) {
      if ($$0.bV()) {
         Optional<ewu> $$2 = this.a((dbg)$$1, $$0).map(ewu::c);
         if ($$2.isPresent()) {
            return $$2.get();
         }
      }

      return cdl.a($$0, 5, 4);
   }

   private Optional<ir> a(dbg $$0, brv $$1) {
      ir $$2 = $$1.du();
      if (!$$0.a_($$2).k($$0, $$2).c()) {
         return Optional.empty();
      } else {
         Predicate<ir> $$3;
         if (aym.f($$1.do()) == 2) {
            $$3 = $$1x -> ir.a($$1x).allMatch($$1xx -> $$0.b_($$1xx).a(awj.a));
         } else {
            $$3 = $$1x -> $$0.b_($$1x).a(awj.a);
         }

         return ir.a($$2, 5, 1, $$3);
      }
   }
}
