import java.util.Map;
import java.util.Optional;
import java.util.function.Predicate;
import javax.annotation.Nullable;

public class bsg<E extends brb> extends bsl<E> {
   private static final int c = 100;
   private static final int d = 120;
   private static final int e = 5;
   private static final int f = 4;
   private static final Predicate<brb> g = $$0 -> $$0.ej() != null || $$0.dB() || $$0.bN();
   private final float h;
   private final Predicate<E> i;

   public bsg(float $$0) {
      this($$0, g::test);
   }

   public bsg(float $$0, Predicate<E> $$1) {
      super(Map.of(bzw.Z, bzx.c, bzw.x, bzx.c), 100, 120);
      this.h = $$0;
      this.i = $$1;
   }

   protected boolean a(apu $$0, E $$1) {
      return this.i.test($$1) && ($$1.dP().a(bzw.x) || $$1.dP().a(bzw.Z));
   }

   protected boolean a(apu $$0, E $$1, long $$2) {
      return true;
   }

   protected void b(apu $$0, E $$1, long $$2) {
      $$1.dP().a(bzw.Z, true);
      $$1.dP().b(bzw.m);
   }

   protected void c(apu $$0, E $$1, long $$2) {
      bru<?> $$3 = $$1.dP();
      $$3.b(bzw.Z);
   }

   protected void d(apu $$0, E $$1, long $$2) {
      if ($$1.K().l()) {
         esj $$3 = this.a($$1, $$0);
         if ($$3 != null) {
            $$1.dP().a(bzw.m, new bzz($$3, this.h, 0));
         }
      }
   }

   @Nullable
   private esj a(E $$0, apu $$1) {
      if ($$0.bN()) {
         Optional<esj> $$2 = this.a((cym)$$1, $$0).map(esj::c);
         if ($$2.isPresent()) {
            return $$2.get();
         }
      }

      return cbq.a($$0, 5, 4);
   }

   private Optional<id> a(cym $$0, bqa $$1) {
      id $$2 = $$1.dm();
      if (!$$0.a_($$2).k($$0, $$2).c()) {
         return Optional.empty();
      } else {
         Predicate<id> $$3;
         if (axm.f($$1.dg()) == 2) {
            $$3 = $$1x -> id.a($$1x).allMatch($$1xx -> $$0.b_($$1xx).a(avj.a));
         } else {
            $$3 = $$1x -> $$0.b_($$1x).a(avj.a);
         }

         return id.a($$2, 5, 1, $$3);
      }
   }
}
