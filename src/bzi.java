import java.util.Map;
import java.util.Optional;
import java.util.function.Function;
import java.util.function.Predicate;
import javax.annotation.Nullable;

public class bzi<E extends bye> extends bzn<E> {
   private static final int c = 100;
   private static final int d = 120;
   private static final int e = 5;
   private static final int f = 4;
   private final float g;
   private final Function<bye, axv<bvm>> h;

   public bzi(float $$0) {
      this($$0, $$0x -> axh.F);
   }

   public bzi(float $$0, Function<bye, axv<bvm>> $$1) {
      super(Map.of(cgy.aa, cgz.c, cgy.y, cgz.c), 100, 120);
      this.g = $$0;
      this.h = $$1;
   }

   protected boolean a(aru $$0, E $$1) {
      return $$1.ec().c(cgy.y).map($$1x -> $$1x.a(this.h.apply($$1))).orElse(false) || $$1.ec().a(cgy.aa);
   }

   protected boolean a(aru $$0, E $$1, long $$2) {
      return true;
   }

   protected void b(aru $$0, E $$1, long $$2) {
      $$1.ec().a(cgy.aa, true);
      $$1.ec().b(cgy.n);
   }

   protected void c(aru $$0, E $$1, long $$2) {
      byw<?> $$3 = $$1.ec();
      $$3.b(cgy.aa);
   }

   protected void d(aru $$0, E $$1, long $$2) {
      if ($$1.O().k()) {
         ffs $$3 = this.a($$1, $$0);
         if ($$3 != null) {
            $$1.ec().a(cgy.n, new chb($$3, this.g, 0));
         }
      }
   }

   @Nullable
   private ffs a(E $$0, aru $$1) {
      if ($$0.bX()) {
         Optional<ffs> $$2 = this.a((djd)$$1, $$0).map(ffs::c);
         if ($$2.isPresent()) {
            return $$2.get();
         }
      }

      return cis.a($$0, 5, 4);
   }

   private Optional<iw> a(djd $$0, bwv $$1) {
      iw $$2 = $$1.dv();
      if (!$$0.a_($$2).g($$0, $$2).c()) {
         return Optional.empty();
      } else {
         Predicate<iw> $$3;
         if (azq.f($$1.dq()) == 2) {
            $$3 = $$1x -> iw.a($$1x).allMatch($$1xx -> $$0.b_($$1xx).a(axl.a));
         } else {
            $$3 = $$1x -> $$0.b_($$1x).a(axl.a);
         }

         return iw.a($$2, 5, 1, $$3);
      }
   }
}
