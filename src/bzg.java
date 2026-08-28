import java.util.Map;
import java.util.Optional;
import java.util.function.Function;
import java.util.function.Predicate;
import javax.annotation.Nullable;

public class bzg<E extends byc> extends bzl<E> {
   private static final int c = 100;
   private static final int d = 120;
   private static final int e = 5;
   private static final int f = 4;
   private final float g;
   private final Function<byc, axt<bvk>> h;

   public bzg(float $$0) {
      this($$0, $$0x -> axf.F);
   }

   public bzg(float $$0, Function<byc, axt<bvk>> $$1) {
      super(Map.of(cgw.aa, cgx.c, cgw.y, cgx.c), 100, 120);
      this.g = $$0;
      this.h = $$1;
   }

   protected boolean a(ars $$0, E $$1) {
      return $$1.ec().c(cgw.y).map($$1x -> $$1x.a(this.h.apply($$1))).orElse(false) || $$1.ec().a(cgw.aa);
   }

   protected boolean a(ars $$0, E $$1, long $$2) {
      return true;
   }

   protected void b(ars $$0, E $$1, long $$2) {
      $$1.ec().a(cgw.aa, true);
      $$1.ec().b(cgw.n);
   }

   protected void c(ars $$0, E $$1, long $$2) {
      byu<?> $$3 = $$1.ec();
      $$3.b(cgw.aa);
   }

   protected void d(ars $$0, E $$1, long $$2) {
      if ($$1.O().k()) {
         ffq $$3 = this.a($$1, $$0);
         if ($$3 != null) {
            $$1.ec().a(cgw.n, new cgz($$3, this.g, 0));
         }
      }
   }

   @Nullable
   private ffq a(E $$0, ars $$1) {
      if ($$0.bX()) {
         Optional<ffq> $$2 = this.a((djb)$$1, $$0).map(ffq::c);
         if ($$2.isPresent()) {
            return $$2.get();
         }
      }

      return ciq.a($$0, 5, 4);
   }

   private Optional<iv> a(djb $$0, bwt $$1) {
      iv $$2 = $$1.dv();
      if (!$$0.a_($$2).g($$0, $$2).c()) {
         return Optional.empty();
      } else {
         Predicate<iv> $$3;
         if (azo.f($$1.dq()) == 2) {
            $$3 = $$1x -> iv.a($$1x).allMatch($$1xx -> $$0.b_($$1xx).a(axj.a));
         } else {
            $$3 = $$1x -> $$0.b_($$1x).a(axj.a);
         }

         return iv.a($$2, 5, 1, $$3);
      }
   }
}
