import java.util.Map;
import java.util.Optional;
import java.util.function.Function;
import java.util.function.Predicate;
import javax.annotation.Nullable;

public class bvc<E extends btw> extends bvh<E> {
   private static final int c = 100;
   private static final int d = 120;
   private static final int e = 5;
   private static final int f = 4;
   private final float g;
   private final Function<btw, awu<brm>> h;

   public bvc(float $$0) {
      this($$0, $$0x -> awg.F);
   }

   public bvc(float $$0, Function<btw, awu<brm>> $$1) {
      super(Map.of(ccs.Z, cct.c, ccs.x, cct.c), 100, 120);
      this.g = $$0;
      this.h = $$1;
   }

   protected boolean a(aqu $$0, E $$1) {
      return $$1.dT().c(ccs.x).map($$1x -> $$1x.a(this.h.apply($$1))).orElse(false) || $$1.dT().a(ccs.Z);
   }

   protected boolean a(aqu $$0, E $$1, long $$2) {
      return true;
   }

   protected void b(aqu $$0, E $$1, long $$2) {
      $$1.dT().a(ccs.Z, true);
      $$1.dT().b(ccs.m);
   }

   protected void c(aqu $$0, E $$1, long $$2) {
      buq<?> $$3 = $$1.dT();
      $$3.b(ccs.Z);
   }

   protected void d(aqu $$0, E $$1, long $$2) {
      if ($$1.N().l()) {
         exc $$3 = this.a($$1, $$0);
         if ($$3 != null) {
            $$1.dT().a(ccs.m, new ccv($$3, this.g, 0));
         }
      }
   }

   @Nullable
   private exc a(E $$0, aqu $$1) {
      if ($$0.bR()) {
         Optional<exc> $$2 = this.a((dcc)$$1, $$0).map(exc::c);
         if ($$2.isPresent()) {
            return $$2.get();
         }
      }

      return cem.a($$0, 5, 4);
   }

   private Optional<jd> a(dcc $$0, bsr $$1) {
      jd $$2 = $$1.do();
      if (!$$0.a_($$2).k($$0, $$2).c()) {
         return Optional.empty();
      } else {
         Predicate<jd> $$3;
         if (ayo.f($$1.dj()) == 2) {
            $$3 = $$1x -> jd.a($$1x).allMatch($$1xx -> $$0.b_($$1xx).a(awk.a));
         } else {
            $$3 = $$1x -> $$0.b_($$1x).a(awk.a);
         }

         return jd.a($$2, 5, 1, $$3);
      }
   }
}
