import java.util.Map;
import java.util.Optional;
import java.util.function.Predicate;
import javax.annotation.Nullable;

public class bue<E extends bsz> extends buj<E> {
   private static final int c = 100;
   private static final int d = 120;
   private static final int e = 5;
   private static final int f = 4;
   private static final Predicate<bsz> g = $$0 -> $$0.em() != null || $$0.dE() || $$0.bQ();
   private final float h;
   private final Predicate<E> i;

   public bue(float $$0) {
      this($$0, g::test);
   }

   public bue(float $$0, Predicate<E> $$1) {
      super(Map.of(cbu.Z, cbv.c, cbu.x, cbv.c), 100, 120);
      this.h = $$0;
      this.i = $$1;
   }

   protected boolean a(aqn $$0, E $$1) {
      return this.i.test($$1) && ($$1.dS().a(cbu.x) || $$1.dS().a(cbu.Z));
   }

   protected boolean a(aqn $$0, E $$1, long $$2) {
      return true;
   }

   protected void b(aqn $$0, E $$1, long $$2) {
      $$1.dS().a(cbu.Z, true);
      $$1.dS().b(cbu.m);
   }

   protected void c(aqn $$0, E $$1, long $$2) {
      bts<?> $$3 = $$1.dS();
      $$3.b(cbu.Z);
   }

   protected void d(aqn $$0, E $$1, long $$2) {
      if ($$1.K().l()) {
         eum $$3 = this.a($$1, $$0);
         if ($$3 != null) {
            $$1.dS().a(cbu.m, new cbx($$3, this.h, 0));
         }
      }
   }

   @Nullable
   private eum a(E $$0, aqn $$1) {
      if ($$0.bQ()) {
         Optional<eum> $$2 = this.a((daf)$$1, $$0).map(eum::c);
         if ($$2.isPresent()) {
            return $$2.get();
         }
      }

      return cdo.a($$0, 5, 4);
   }

   private Optional<io> a(daf $$0, brw $$1) {
      io $$2 = $$1.dp();
      if (!$$0.a_($$2).k($$0, $$2).c()) {
         return Optional.empty();
      } else {
         Predicate<io> $$3;
         if (ayf.f($$1.dj()) == 2) {
            $$3 = $$1x -> io.a($$1x).allMatch($$1xx -> $$0.b_($$1xx).a(awc.a));
         } else {
            $$3 = $$1x -> $$0.b_($$1x).a(awc.a);
         }

         return io.a($$2, 5, 1, $$3);
      }
   }
}
