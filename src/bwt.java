import java.util.Map;
import java.util.Optional;
import java.util.function.Function;
import java.util.function.Predicate;
import javax.annotation.Nullable;

public class bwt<E extends bvn> extends bwy<E> {
   private static final int c = 100;
   private static final int d = 120;
   private static final int e = 5;
   private static final int f = 4;
   private final float g;
   private final Function<bvn, axe<btb>> h;

   public bwt(float $$0) {
      this($$0, $$0x -> awq.F);
   }

   public bwt(float $$0, Function<bvn, axe<btb>> $$1) {
      super(Map.of(cej.Z, cek.c, cej.x, cek.c), 100, 120);
      this.g = $$0;
      this.h = $$1;
   }

   protected boolean a(arc $$0, E $$1) {
      return $$1.ec().c(cej.x).map($$1x -> $$1x.a(this.h.apply($$1))).orElse(false) || $$1.ec().a(cej.Z);
   }

   protected boolean a(arc $$0, E $$1, long $$2) {
      return true;
   }

   protected void b(arc $$0, E $$1, long $$2) {
      $$1.ec().a(cej.Z, true);
      $$1.ec().b(cej.m);
   }

   protected void c(arc $$0, E $$1, long $$2) {
      bwh<?> $$3 = $$1.ec();
      $$3.b(cej.Z);
   }

   protected void d(arc $$0, E $$1, long $$2) {
      if ($$1.L().k()) {
         fay $$3 = this.a($$1, $$0);
         if ($$3 != null) {
            $$1.ec().a(cej.m, new cem($$3, this.g, 0));
         }
      }
   }

   @Nullable
   private fay a(E $$0, arc $$1) {
      if ($$0.bY()) {
         Optional<fay> $$2 = this.a((dfl)$$1, $$0).map(fay::c);
         if ($$2.isPresent()) {
            return $$2.get();
         }
      }

      return cgd.a($$0, 5, 4);
   }

   private Optional<ji> a(dfl $$0, buj $$1) {
      ji $$2 = $$1.dw();
      if (!$$0.a_($$2).g($$0, $$2).c()) {
         return Optional.empty();
      } else {
         Predicate<ji> $$3;
         if (ayy.f($$1.dr()) == 2) {
            $$3 = $$1x -> ji.a($$1x).allMatch($$1xx -> $$0.b_($$1xx).a(awu.a));
         } else {
            $$3 = $$1x -> $$0.b_($$1x).a(awu.a);
         }

         return ji.a($$2, 5, 1, $$3);
      }
   }
}
