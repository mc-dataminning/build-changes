import java.util.Map;
import java.util.Optional;
import java.util.function.Function;
import java.util.function.Predicate;
import javax.annotation.Nullable;

public class bww<E extends bvq> extends bxb<E> {
   private static final int c = 100;
   private static final int d = 120;
   private static final int e = 5;
   private static final int f = 4;
   private final float g;
   private final Function<bvq, axf<bte>> h;

   public bww(float $$0) {
      this($$0, $$0x -> awr.F);
   }

   public bww(float $$0, Function<bvq, axf<bte>> $$1) {
      super(Map.of(cem.Z, cen.c, cem.x, cen.c), 100, 120);
      this.g = $$0;
      this.h = $$1;
   }

   protected boolean a(ard $$0, E $$1) {
      return $$1.eb().c(cem.x).map($$1x -> $$1x.a(this.h.apply($$1))).orElse(false) || $$1.eb().a(cem.Z);
   }

   protected boolean a(ard $$0, E $$1, long $$2) {
      return true;
   }

   protected void b(ard $$0, E $$1, long $$2) {
      $$1.eb().a(cem.Z, true);
      $$1.eb().b(cem.m);
   }

   protected void c(ard $$0, E $$1, long $$2) {
      bwk<?> $$3 = $$1.eb();
      $$3.b(cem.Z);
   }

   protected void d(ard $$0, E $$1, long $$2) {
      if ($$1.P().k()) {
         fbb $$3 = this.a($$1, $$0);
         if ($$3 != null) {
            $$1.eb().a(cem.m, new cep($$3, this.g, 0));
         }
      }
   }

   @Nullable
   private fbb a(E $$0, ard $$1) {
      if ($$0.bY()) {
         Optional<fbb> $$2 = this.a((dfo)$$1, $$0).map(fbb::c);
         if ($$2.isPresent()) {
            return $$2.get();
         }
      }

      return cgg.a($$0, 5, 4);
   }

   private Optional<ji> a(dfo $$0, bum $$1) {
      ji $$2 = $$1.dv();
      if (!$$0.a_($$2).g($$0, $$2).c()) {
         return Optional.empty();
      } else {
         Predicate<ji> $$3;
         if (ayz.f($$1.dq()) == 2) {
            $$3 = $$1x -> ji.a($$1x).allMatch($$1xx -> $$0.b_($$1xx).a(awv.a));
         } else {
            $$3 = $$1x -> $$0.b_($$1x).a(awv.a);
         }

         return ji.a($$2, 5, 1, $$3);
      }
   }
}
