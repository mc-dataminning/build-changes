import java.util.Map;
import java.util.Optional;
import java.util.function.Predicate;
import javax.annotation.Nullable;

public class bum<E extends bth> extends bur<E> {
   private static final int c = 100;
   private static final int d = 120;
   private static final int e = 5;
   private static final int f = 4;
   private static final Predicate<bth> g = $$0 -> $$0.ei() != null || $$0.dE() || $$0.bQ();
   private final float h;
   private final Predicate<E> i;

   public bum(float $$0) {
      this($$0, g::test);
   }

   public bum(float $$0, Predicate<E> $$1) {
      super(Map.of(ccc.Z, ccd.c, ccc.x, ccd.c), 100, 120);
      this.h = $$0;
      this.i = $$1;
   }

   protected boolean a(aqk $$0, E $$1) {
      return this.i.test($$1) && ($$1.dT().a(ccc.x) || $$1.dT().a(ccc.Z));
   }

   protected boolean a(aqk $$0, E $$1, long $$2) {
      return true;
   }

   protected void b(aqk $$0, E $$1, long $$2) {
      $$1.dT().a(ccc.Z, true);
      $$1.dT().b(ccc.m);
   }

   protected void c(aqk $$0, E $$1, long $$2) {
      bua<?> $$3 = $$1.dT();
      $$3.b(ccc.Z);
   }

   protected void d(aqk $$0, E $$1, long $$2) {
      if ($$1.K().l()) {
         evz $$3 = this.a($$1, $$0);
         if ($$3 != null) {
            $$1.dT().a(ccc.m, new ccf($$3, this.h, 0));
         }
      }
   }

   @Nullable
   private evz a(E $$0, aqk $$1) {
      if ($$0.bQ()) {
         Optional<evz> $$2 = this.a((dbj)$$1, $$0).map(evz::c);
         if ($$2.isPresent()) {
            return $$2.get();
         }
      }

      return cdw.a($$0, 5, 4);
   }

   private Optional<ja> a(dbj $$0, bsd $$1) {
      ja $$2 = $$1.dp();
      if (!$$0.a_($$2).k($$0, $$2).c()) {
         return Optional.empty();
      } else {
         Predicate<ja> $$3;
         if (aye.f($$1.dj()) == 2) {
            $$3 = $$1x -> ja.a($$1x).allMatch($$1xx -> $$0.b_($$1xx).a(awa.a));
         } else {
            $$3 = $$1x -> $$0.b_($$1x).a(awa.a);
         }

         return ja.a($$2, 5, 1, $$3);
      }
   }
}
