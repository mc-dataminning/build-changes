import java.util.Map;
import java.util.Optional;
import java.util.function.Function;
import java.util.function.Predicate;
import javax.annotation.Nullable;

public class bwu<E extends bvo> extends bwz<E> {
   private static final int c = 100;
   private static final int d = 120;
   private static final int e = 5;
   private static final int f = 4;
   private final float g;
   private final Function<bvo, axf<btc>> h;

   public bwu(float $$0) {
      this($$0, $$0x -> awr.F);
   }

   public bwu(float $$0, Function<bvo, axf<btc>> $$1) {
      super(Map.of(cek.Z, cel.c, cek.x, cel.c), 100, 120);
      this.g = $$0;
      this.h = $$1;
   }

   protected boolean a(arc $$0, E $$1) {
      return $$1.ec().c(cek.x).map($$1x -> $$1x.a(this.h.apply($$1))).orElse(false) || $$1.ec().a(cek.Z);
   }

   protected boolean a(arc $$0, E $$1, long $$2) {
      return true;
   }

   protected void b(arc $$0, E $$1, long $$2) {
      $$1.ec().a(cek.Z, true);
      $$1.ec().b(cek.m);
   }

   protected void c(arc $$0, E $$1, long $$2) {
      bwi<?> $$3 = $$1.ec();
      $$3.b(cek.Z);
   }

   protected void d(arc $$0, E $$1, long $$2) {
      if ($$1.L().k()) {
         fba $$3 = this.a($$1, $$0);
         if ($$3 != null) {
            $$1.ec().a(cek.m, new cen($$3, this.g, 0));
         }
      }
   }

   @Nullable
   private fba a(E $$0, arc $$1) {
      if ($$0.bY()) {
         Optional<fba> $$2 = this.a((dfn)$$1, $$0).map(fba::c);
         if ($$2.isPresent()) {
            return $$2.get();
         }
      }

      return cge.a($$0, 5, 4);
   }

   private Optional<ji> a(dfn $$0, buk $$1) {
      ji $$2 = $$1.dw();
      if (!$$0.a_($$2).g($$0, $$2).c()) {
         return Optional.empty();
      } else {
         Predicate<ji> $$3;
         if (ayz.f($$1.dr()) == 2) {
            $$3 = $$1x -> ji.a($$1x).allMatch($$1xx -> $$0.b_($$1xx).a(awv.a));
         } else {
            $$3 = $$1x -> $$0.b_($$1x).a(awv.a);
         }

         return ji.a($$2, 5, 1, $$3);
      }
   }
}
