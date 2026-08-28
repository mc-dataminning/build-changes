import java.util.Map;
import java.util.Optional;
import java.util.function.Predicate;
import javax.annotation.Nullable;

public class buy<E extends btt> extends bvd<E> {
   private static final int c = 100;
   private static final int d = 120;
   private static final int e = 5;
   private static final int f = 4;
   private static final Predicate<btt> g = $$0 -> $$0.em() != null || $$0.dE() || $$0.bQ();
   private final float h;
   private final Predicate<E> i;

   public buy(float $$0) {
      this($$0, g::test);
   }

   public buy(float $$0, Predicate<E> $$1) {
      super(Map.of(cco.Z, ccp.c, cco.x, ccp.c), 100, 120);
      this.h = $$0;
      this.i = $$1;
   }

   protected boolean a(arb $$0, E $$1) {
      return this.i.test($$1) && ($$1.dS().a(cco.x) || $$1.dS().a(cco.Z));
   }

   protected boolean a(arb $$0, E $$1, long $$2) {
      return true;
   }

   protected void b(arb $$0, E $$1, long $$2) {
      $$1.dS().a(cco.Z, true);
      $$1.dS().b(cco.m);
   }

   protected void c(arb $$0, E $$1, long $$2) {
      bum<?> $$3 = $$1.dS();
      $$3.b(cco.Z);
   }

   protected void d(arb $$0, E $$1, long $$2) {
      if ($$1.K().l()) {
         evm $$3 = this.a($$1, $$0);
         if ($$3 != null) {
            $$1.dS().a(cco.m, new ccr($$3, this.h, 0));
         }
      }
   }

   @Nullable
   private evm a(E $$0, arb $$1) {
      if ($$0.bQ()) {
         Optional<evm> $$2 = this.a((daz)$$1, $$0).map(evm::c);
         if ($$2.isPresent()) {
            return $$2.get();
         }
      }

      return cei.a($$0, 5, 4);
   }

   private Optional<iz> a(daz $$0, bsp $$1) {
      iz $$2 = $$1.dp();
      if (!$$0.a_($$2).k($$0, $$2).c()) {
         return Optional.empty();
      } else {
         Predicate<iz> $$3;
         if (ayu.f($$1.dj()) == 2) {
            $$3 = $$1x -> iz.a($$1x).allMatch($$1xx -> $$0.b_($$1xx).a(awr.a));
         } else {
            $$3 = $$1x -> $$0.b_($$1x).a(awr.a);
         }

         return iz.a($$2, 5, 1, $$3);
      }
   }
}
