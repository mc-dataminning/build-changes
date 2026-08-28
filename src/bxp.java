import java.util.Map;
import java.util.Optional;
import java.util.function.Function;
import java.util.function.Predicate;
import javax.annotation.Nullable;

public class bxp<E extends bwj> extends bxu<E> {
   private static final int c = 100;
   private static final int d = 120;
   private static final int e = 5;
   private static final int f = 4;
   private final float g;
   private final Function<bwj, ayk<btx>> h;

   public bxp(float $$0) {
      this($$0, $$0x -> axw.F);
   }

   public bxp(float $$0, Function<bwj, ayk<btx>> $$1) {
      super(Map.of(cff.Z, cfg.c, cff.x, cfg.c), 100, 120);
      this.g = $$0;
      this.h = $$1;
   }

   protected boolean a(ash $$0, E $$1) {
      return $$1.eb().c(cff.x).map($$1x -> $$1x.a(this.h.apply($$1))).orElse(false) || $$1.eb().a(cff.Z);
   }

   protected boolean a(ash $$0, E $$1, long $$2) {
      return true;
   }

   protected void b(ash $$0, E $$1, long $$2) {
      $$1.eb().a(cff.Z, true);
      $$1.eb().b(cff.m);
   }

   protected void c(ash $$0, E $$1, long $$2) {
      bxd<?> $$3 = $$1.eb();
      $$3.b(cff.Z);
   }

   protected void d(ash $$0, E $$1, long $$2) {
      if ($$1.L().m()) {
         fbs $$3 = this.a($$1, $$0);
         if ($$3 != null) {
            $$1.eb().a(cff.m, new cfi($$3, this.g, 0));
         }
      }
   }

   @Nullable
   private fbs a(E $$0, ash $$1) {
      if ($$0.bY()) {
         Optional<fbs> $$2 = this.a((dgf)$$1, $$0).map(fbs::c);
         if ($$2.isPresent()) {
            return $$2.get();
         }
      }

      return cgz.a($$0, 5, 4);
   }

   private Optional<jh> a(dgf $$0, bvf $$1) {
      jh $$2 = $$1.dv();
      if (!$$0.a_($$2).g($$0, $$2).c()) {
         return Optional.empty();
      } else {
         Predicate<jh> $$3;
         if (bae.f($$1.dq()) == 2) {
            $$3 = $$1x -> jh.a($$1x).allMatch($$1xx -> $$0.b_($$1xx).a(aya.a));
         } else {
            $$3 = $$1x -> $$0.b_($$1x).a(aya.a);
         }

         return jh.a($$2, 5, 1, $$3);
      }
   }
}
