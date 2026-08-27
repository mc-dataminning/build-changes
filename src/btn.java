import java.util.Map;
import java.util.Optional;
import java.util.function.Predicate;
import javax.annotation.Nullable;

public class btn<E extends bsi> extends bts<E> {
   private static final int c = 100;
   private static final int d = 120;
   private static final int e = 5;
   private static final int f = 4;
   private static final Predicate<bsi> g = $$0 -> $$0.ek() != null || $$0.dC() || $$0.bO();
   private final float h;
   private final Predicate<E> i;

   public btn(float $$0) {
      this($$0, g::test);
   }

   public btn(float $$0, Predicate<E> $$1) {
      super(Map.of(cbd.Z, cbe.c, cbd.x, cbe.c), 100, 120);
      this.h = $$0;
      this.i = $$1;
   }

   protected boolean a(aqh $$0, E $$1) {
      return this.i.test($$1) && ($$1.dQ().a(cbd.x) || $$1.dQ().a(cbd.Z));
   }

   protected boolean a(aqh $$0, E $$1, long $$2) {
      return true;
   }

   protected void b(aqh $$0, E $$1, long $$2) {
      $$1.dQ().a(cbd.Z, true);
      $$1.dQ().b(cbd.m);
   }

   protected void c(aqh $$0, E $$1, long $$2) {
      btb<?> $$3 = $$1.dQ();
      $$3.b(cbd.Z);
   }

   protected void d(aqh $$0, E $$1, long $$2) {
      if ($$1.K().l()) {
         etp $$3 = this.a($$1, $$0);
         if ($$3 != null) {
            $$1.dQ().a(cbd.m, new cbg($$3, this.h, 0));
         }
      }
   }

   @Nullable
   private etp a(E $$0, aqh $$1) {
      if ($$0.bO()) {
         Optional<etp> $$2 = this.a((czj)$$1, $$0).map(etp::c);
         if ($$2.isPresent()) {
            return $$2.get();
         }
      }

      return ccx.a($$0, 5, 4);
   }

   private Optional<in> a(czj $$0, brh $$1) {
      in $$2 = $$1.dn();
      if (!$$0.a_($$2).k($$0, $$2).c()) {
         return Optional.empty();
      } else {
         Predicate<in> $$3;
         if (axz.f($$1.dh()) == 2) {
            $$3 = $$1x -> in.a($$1x).allMatch($$1xx -> $$0.b_($$1xx).a(avw.a));
         } else {
            $$3 = $$1x -> $$0.b_($$1x).a(avw.a);
         }

         return in.a($$2, 5, 1, $$3);
      }
   }
}
