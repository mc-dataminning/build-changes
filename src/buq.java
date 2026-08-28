import java.util.Map;
import java.util.Optional;
import java.util.function.Predicate;
import javax.annotation.Nullable;

public class buq<E extends btl> extends buv<E> {
   private static final int c = 100;
   private static final int d = 120;
   private static final int e = 5;
   private static final int f = 4;
   private static final Predicate<btl> g = $$0 -> $$0.ek() != null || $$0.dG() || $$0.bS();
   private final float h;
   private final Predicate<E> i;

   public buq(float $$0) {
      this($$0, g::test);
   }

   public buq(float $$0, Predicate<E> $$1) {
      super(Map.of(ccg.Z, cch.c, ccg.x, cch.c), 100, 120);
      this.h = $$0;
      this.i = $$1;
   }

   protected boolean a(aqm $$0, E $$1) {
      return this.i.test($$1) && ($$1.dV().a(ccg.x) || $$1.dV().a(ccg.Z));
   }

   protected boolean a(aqm $$0, E $$1, long $$2) {
      return true;
   }

   protected void b(aqm $$0, E $$1, long $$2) {
      $$1.dV().a(ccg.Z, true);
      $$1.dV().b(ccg.m);
   }

   protected void c(aqm $$0, E $$1, long $$2) {
      bue<?> $$3 = $$1.dV();
      $$3.b(ccg.Z);
   }

   protected void d(aqm $$0, E $$1, long $$2) {
      if ($$1.J().l()) {
         ewh $$3 = this.a($$1, $$0);
         if ($$3 != null) {
            $$1.dV().a(ccg.m, new ccj($$3, this.h, 0));
         }
      }
   }

   @Nullable
   private ewh a(E $$0, aqm $$1) {
      if ($$0.bS()) {
         Optional<ewh> $$2 = this.a((dbm)$$1, $$0).map(ewh::c);
         if ($$2.isPresent()) {
            return $$2.get();
         }
      }

      return cea.a($$0, 5, 4);
   }

   private Optional<ja> a(dbm $$0, bsh $$1) {
      ja $$2 = $$1.dr();
      if (!$$0.a_($$2).k($$0, $$2).c()) {
         return Optional.empty();
      } else {
         Predicate<ja> $$3;
         if (ayg.f($$1.dl()) == 2) {
            $$3 = $$1x -> ja.a($$1x).allMatch($$1xx -> $$0.b_($$1xx).a(awc.a));
         } else {
            $$3 = $$1x -> $$0.b_($$1x).a(awc.a);
         }

         return ja.a($$2, 5, 1, $$3);
      }
   }
}
