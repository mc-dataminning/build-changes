import java.util.Map;
import java.util.Optional;
import java.util.function.Predicate;
import javax.annotation.Nullable;

public class bvf<E extends bua> extends bvk<E> {
   private static final int c = 100;
   private static final int d = 120;
   private static final int e = 5;
   private static final int f = 4;
   private static final Predicate<bua> g = $$0 -> $$0.em() != null || $$0.dE() || $$0.bQ();
   private final float h;
   private final Predicate<E> i;

   public bvf(float $$0) {
      this($$0, g::test);
   }

   public bvf(float $$0, Predicate<E> $$1) {
      super(Map.of(ccv.Z, ccw.c, ccv.x, ccw.c), 100, 120);
      this.h = $$0;
      this.i = $$1;
   }

   protected boolean a(arf $$0, E $$1) {
      return this.i.test($$1) && ($$1.dS().a(ccv.x) || $$1.dS().a(ccv.Z));
   }

   protected boolean a(arf $$0, E $$1, long $$2) {
      return true;
   }

   protected void b(arf $$0, E $$1, long $$2) {
      $$1.dS().a(ccv.Z, true);
      $$1.dS().b(ccv.m);
   }

   protected void c(arf $$0, E $$1, long $$2) {
      but<?> $$3 = $$1.dS();
      $$3.b(ccv.Z);
   }

   protected void d(arf $$0, E $$1, long $$2) {
      if ($$1.K().l()) {
         evt $$3 = this.a($$1, $$0);
         if ($$3 != null) {
            $$1.dS().a(ccv.m, new ccy($$3, this.h, 0));
         }
      }
   }

   @Nullable
   private evt a(E $$0, arf $$1) {
      if ($$0.bQ()) {
         Optional<evt> $$2 = this.a((dbg)$$1, $$0).map(evt::c);
         if ($$2.isPresent()) {
            return $$2.get();
         }
      }

      return cep.a($$0, 5, 4);
   }

   private Optional<iz> a(dbg $$0, bsw $$1) {
      iz $$2 = $$1.dp();
      if (!$$0.a_($$2).k($$0, $$2).c()) {
         return Optional.empty();
      } else {
         Predicate<iz> $$3;
         if (ayz.f($$1.dj()) == 2) {
            $$3 = $$1x -> iz.a($$1x).allMatch($$1xx -> $$0.b_($$1xx).a(awv.a));
         } else {
            $$3 = $$1x -> $$0.b_($$1x).a(awv.a);
         }

         return iz.a($$2, 5, 1, $$3);
      }
   }
}
