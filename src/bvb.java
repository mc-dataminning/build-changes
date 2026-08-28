import java.util.Map;
import java.util.Optional;
import java.util.function.Predicate;
import javax.annotation.Nullable;

public class bvb<E extends btw> extends bvg<E> {
   private static final int c = 100;
   private static final int d = 120;
   private static final int e = 5;
   private static final int f = 4;
   private static final Predicate<btw> g = $$0 -> $$0.em() != null || $$0.dE() || $$0.bQ();
   private final float h;
   private final Predicate<E> i;

   public bvb(float $$0) {
      this($$0, g::test);
   }

   public bvb(float $$0, Predicate<E> $$1) {
      super(Map.of(ccr.Z, ccs.c, ccr.x, ccs.c), 100, 120);
      this.h = $$0;
      this.i = $$1;
   }

   protected boolean a(are $$0, E $$1) {
      return this.i.test($$1) && ($$1.dS().a(ccr.x) || $$1.dS().a(ccr.Z));
   }

   protected boolean a(are $$0, E $$1, long $$2) {
      return true;
   }

   protected void b(are $$0, E $$1, long $$2) {
      $$1.dS().a(ccr.Z, true);
      $$1.dS().b(ccr.m);
   }

   protected void c(are $$0, E $$1, long $$2) {
      bup<?> $$3 = $$1.dS();
      $$3.b(ccr.Z);
   }

   protected void d(are $$0, E $$1, long $$2) {
      if ($$1.K().l()) {
         evp $$3 = this.a($$1, $$0);
         if ($$3 != null) {
            $$1.dS().a(ccr.m, new ccu($$3, this.h, 0));
         }
      }
   }

   @Nullable
   private evp a(E $$0, are $$1) {
      if ($$0.bQ()) {
         Optional<evp> $$2 = this.a((dbc)$$1, $$0).map(evp::c);
         if ($$2.isPresent()) {
            return $$2.get();
         }
      }

      return cel.a($$0, 5, 4);
   }

   private Optional<iz> a(dbc $$0, bss $$1) {
      iz $$2 = $$1.dp();
      if (!$$0.a_($$2).k($$0, $$2).c()) {
         return Optional.empty();
      } else {
         Predicate<iz> $$3;
         if (ayx.f($$1.dj()) == 2) {
            $$3 = $$1x -> iz.a($$1x).allMatch($$1xx -> $$0.b_($$1xx).a(awu.a));
         } else {
            $$3 = $$1x -> $$0.b_($$1x).a(awu.a);
         }

         return iz.a($$2, 5, 1, $$3);
      }
   }
}
