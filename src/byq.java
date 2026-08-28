import java.util.Map;
import java.util.Optional;
import java.util.function.Function;
import java.util.function.Predicate;
import javax.annotation.Nullable;

public class byq<E extends bxm> extends byv<E> {
   private static final int c = 100;
   private static final int d = 120;
   private static final int e = 5;
   private static final int f = 4;
   private final float g;
   private final Function<bxm, axr<buw>> h;

   public byq(float $$0) {
      this($$0, $$0x -> axd.F);
   }

   public byq(float $$0, Function<bxm, axr<buw>> $$1) {
      super(Map.of(cgg.aa, cgh.c, cgg.y, cgh.c), 100, 120);
      this.g = $$0;
      this.h = $$1;
   }

   protected boolean a(arq $$0, E $$1) {
      return $$1.ec().c(cgg.y).map($$1x -> $$1x.a(this.h.apply($$1))).orElse(false) || $$1.ec().a(cgg.aa);
   }

   protected boolean a(arq $$0, E $$1, long $$2) {
      return true;
   }

   protected void b(arq $$0, E $$1, long $$2) {
      $$1.ec().a(cgg.aa, true);
      $$1.ec().b(cgg.n);
   }

   protected void c(arq $$0, E $$1, long $$2) {
      bye<?> $$3 = $$1.ec();
      $$3.b(cgg.aa);
   }

   protected void d(arq $$0, E $$1, long $$2) {
      if ($$1.O().k()) {
         feq $$3 = this.a($$1, $$0);
         if ($$3 != null) {
            $$1.ec().a(cgg.n, new cgj($$3, this.g, 0));
         }
      }
   }

   @Nullable
   private feq a(E $$0, arq $$1) {
      if ($$0.bY()) {
         Optional<feq> $$2 = this.a((dig)$$1, $$0).map(feq::c);
         if ($$2.isPresent()) {
            return $$2.get();
         }
      }

      return cia.a($$0, 5, 4);
   }

   private Optional<iu> a(dig $$0, bwf $$1) {
      iu $$2 = $$1.dv();
      if (!$$0.a_($$2).g($$0, $$2).c()) {
         return Optional.empty();
      } else {
         Predicate<iu> $$3;
         if (azm.f($$1.dq()) == 2) {
            $$3 = $$1x -> iu.a($$1x).allMatch($$1xx -> $$0.b_($$1xx).a(axh.a));
         } else {
            $$3 = $$1x -> $$0.b_($$1x).a(axh.a);
         }

         return iu.a($$2, 5, 1, $$3);
      }
   }
}
