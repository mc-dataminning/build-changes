import java.util.Map;
import java.util.Optional;
import java.util.function.Function;
import java.util.function.Predicate;
import javax.annotation.Nullable;

public class bwv<E extends bvp> extends bxa<E> {
   private static final int c = 100;
   private static final int d = 120;
   private static final int e = 5;
   private static final int f = 4;
   private final float g;
   private final Function<bvp, axf<btd>> h;

   public bwv(float $$0) {
      this($$0, $$0x -> awr.F);
   }

   public bwv(float $$0, Function<bvp, axf<btd>> $$1) {
      super(Map.of(cel.Z, cem.c, cel.x, cem.c), 100, 120);
      this.g = $$0;
      this.h = $$1;
   }

   protected boolean a(ard $$0, E $$1) {
      return $$1.eb().c(cel.x).map($$1x -> $$1x.a(this.h.apply($$1))).orElse(false) || $$1.eb().a(cel.Z);
   }

   protected boolean a(ard $$0, E $$1, long $$2) {
      return true;
   }

   protected void b(ard $$0, E $$1, long $$2) {
      $$1.eb().a(cel.Z, true);
      $$1.eb().b(cel.m);
   }

   protected void c(ard $$0, E $$1, long $$2) {
      bwj<?> $$3 = $$1.eb();
      $$3.b(cel.Z);
   }

   protected void d(ard $$0, E $$1, long $$2) {
      if ($$1.P().k()) {
         fba $$3 = this.a($$1, $$0);
         if ($$3 != null) {
            $$1.eb().a(cel.m, new ceo($$3, this.g, 0));
         }
      }
   }

   @Nullable
   private fba a(E $$0, ard $$1) {
      if ($$0.bY()) {
         Optional<fba> $$2 = this.a((dfn)$$1, $$0).map(fba::c);
         if ($$2.isPresent()) {
            return $$2.get();
         }
      }

      return cgf.a($$0, 5, 4);
   }

   private Optional<ji> a(dfn $$0, bul $$1) {
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
