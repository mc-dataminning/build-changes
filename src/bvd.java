import java.util.Map;
import java.util.Optional;
import java.util.function.Predicate;
import javax.annotation.Nullable;

public class bvd<E extends bty> extends bvi<E> {
   private static final int c = 100;
   private static final int d = 120;
   private static final int e = 5;
   private static final int f = 4;
   private static final Predicate<bty> g = $$0 -> $$0.em() != null || $$0.dE() || $$0.bQ();
   private final float h;
   private final Predicate<E> i;

   public bvd(float $$0) {
      this($$0, g::test);
   }

   public bvd(float $$0, Predicate<E> $$1) {
      super(Map.of(cct.Z, ccu.c, cct.x, ccu.c), 100, 120);
      this.h = $$0;
      this.i = $$1;
   }

   protected boolean a(arf $$0, E $$1) {
      return this.i.test($$1) && ($$1.dS().a(cct.x) || $$1.dS().a(cct.Z));
   }

   protected boolean a(arf $$0, E $$1, long $$2) {
      return true;
   }

   protected void b(arf $$0, E $$1, long $$2) {
      $$1.dS().a(cct.Z, true);
      $$1.dS().b(cct.m);
   }

   protected void c(arf $$0, E $$1, long $$2) {
      bur<?> $$3 = $$1.dS();
      $$3.b(cct.Z);
   }

   protected void d(arf $$0, E $$1, long $$2) {
      if ($$1.K().l()) {
         evr $$3 = this.a($$1, $$0);
         if ($$3 != null) {
            $$1.dS().a(cct.m, new ccw($$3, this.h, 0));
         }
      }
   }

   @Nullable
   private evr a(E $$0, arf $$1) {
      if ($$0.bQ()) {
         Optional<evr> $$2 = this.a((dbe)$$1, $$0).map(evr::c);
         if ($$2.isPresent()) {
            return $$2.get();
         }
      }

      return cen.a($$0, 5, 4);
   }

   private Optional<iz> a(dbe $$0, bsu $$1) {
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
