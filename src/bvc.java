import java.util.Map;
import java.util.Optional;
import java.util.function.Predicate;
import javax.annotation.Nullable;

public class bvc<E extends btx> extends bvh<E> {
   private static final int c = 100;
   private static final int d = 120;
   private static final int e = 5;
   private static final int f = 4;
   private static final Predicate<btx> g = $$0 -> $$0.em() != null || $$0.dE() || $$0.bQ();
   private final float h;
   private final Predicate<E> i;

   public bvc(float $$0) {
      this($$0, g::test);
   }

   public bvc(float $$0, Predicate<E> $$1) {
      super(Map.of(ccs.Z, cct.c, ccs.x, cct.c), 100, 120);
      this.h = $$0;
      this.i = $$1;
   }

   protected boolean a(are $$0, E $$1) {
      return this.i.test($$1) && ($$1.dS().a(ccs.x) || $$1.dS().a(ccs.Z));
   }

   protected boolean a(are $$0, E $$1, long $$2) {
      return true;
   }

   protected void b(are $$0, E $$1, long $$2) {
      $$1.dS().a(ccs.Z, true);
      $$1.dS().b(ccs.m);
   }

   protected void c(are $$0, E $$1, long $$2) {
      buq<?> $$3 = $$1.dS();
      $$3.b(ccs.Z);
   }

   protected void d(are $$0, E $$1, long $$2) {
      if ($$1.K().l()) {
         evq $$3 = this.a($$1, $$0);
         if ($$3 != null) {
            $$1.dS().a(ccs.m, new ccv($$3, this.h, 0));
         }
      }
   }

   @Nullable
   private evq a(E $$0, are $$1) {
      if ($$0.bQ()) {
         Optional<evq> $$2 = this.a((dbd)$$1, $$0).map(evq::c);
         if ($$2.isPresent()) {
            return $$2.get();
         }
      }

      return cem.a($$0, 5, 4);
   }

   private Optional<iz> a(dbd $$0, bst $$1) {
      iz $$2 = $$1.dp();
      if (!$$0.a_($$2).k($$0, $$2).c()) {
         return Optional.empty();
      } else {
         Predicate<iz> $$3;
         if (ayy.f($$1.dj()) == 2) {
            $$3 = $$1x -> iz.a($$1x).allMatch($$1xx -> $$0.b_($$1xx).a(awu.a));
         } else {
            $$3 = $$1x -> $$0.b_($$1x).a(awu.a);
         }

         return iz.a($$2, 5, 1, $$3);
      }
   }
}
