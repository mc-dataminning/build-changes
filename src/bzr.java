import java.util.Map;
import java.util.Optional;
import java.util.function.Function;
import java.util.function.Predicate;
import javax.annotation.Nullable;

public class bzr<E extends byn> extends bzw<E> {
   private static final int c = 100;
   private static final int d = 120;
   private static final int e = 5;
   private static final int f = 4;
   private final float g;
   private final Function<byn, ayc<bvv>> h;

   public bzr(float $$0) {
      this($$0, $$0x -> axo.F);
   }

   public bzr(float $$0, Function<byn, ayc<bvv>> $$1) {
      super(Map.of(chh.aa, chi.c, chh.y, chi.c), 100, 120);
      this.g = $$0;
      this.h = $$1;
   }

   protected boolean a(asb $$0, E $$1) {
      return $$1.ec().c(chh.y).map($$1x -> $$1x.a(this.h.apply($$1))).orElse(false) || $$1.ec().a(chh.aa);
   }

   protected boolean a(asb $$0, E $$1, long $$2) {
      return true;
   }

   protected void b(asb $$0, E $$1, long $$2) {
      $$1.ec().a(chh.aa, true);
      $$1.ec().b(chh.n);
   }

   protected void c(asb $$0, E $$1, long $$2) {
      bzf<?> $$3 = $$1.ec();
      $$3.b(chh.aa);
   }

   protected void d(asb $$0, E $$1, long $$2) {
      if ($$1.O().k()) {
         fgc $$3 = this.a($$1, $$0);
         if ($$3 != null) {
            $$1.ec().a(chh.n, new chk($$3, this.g, 0));
         }
      }
   }

   @Nullable
   private fgc a(E $$0, asb $$1) {
      if ($$0.bX()) {
         Optional<fgc> $$2 = this.a((djn)$$1, $$0).map(fgc::c);
         if ($$2.isPresent()) {
            return $$2.get();
         }
      }

      return cjb.a($$0, 5, 4);
   }

   private Optional<iw> a(djn $$0, bxe $$1) {
      iw $$2 = $$1.dv();
      if (!$$0.a_($$2).g($$0, $$2).c()) {
         return Optional.empty();
      } else {
         Predicate<iw> $$3;
         if (azz.f($$1.dq()) == 2) {
            $$3 = $$1x -> iw.a($$1x).allMatch($$1xx -> $$0.b_($$1xx).a(axs.a));
         } else {
            $$3 = $$1x -> $$0.b_($$1x).a(axs.a);
         }

         return iw.a($$2, 5, 1, $$3);
      }
   }
}
