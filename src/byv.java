import java.util.Map;
import java.util.Optional;
import java.util.function.Function;
import java.util.function.Predicate;
import javax.annotation.Nullable;

public class byv<E extends bxr> extends bza<E> {
   private static final int c = 100;
   private static final int d = 120;
   private static final int e = 5;
   private static final int f = 4;
   private final float g;
   private final Function<bxr, axr<buz>> h;

   public byv(float $$0) {
      this($$0, $$0x -> axd.F);
   }

   public byv(float $$0, Function<bxr, axr<buz>> $$1) {
      super(Map.of(cgl.aa, cgm.c, cgl.y, cgm.c), 100, 120);
      this.g = $$0;
      this.h = $$1;
   }

   protected boolean a(arq $$0, E $$1) {
      return $$1.eb().c(cgl.y).map($$1x -> $$1x.a(this.h.apply($$1))).orElse(false) || $$1.eb().a(cgl.aa);
   }

   protected boolean a(arq $$0, E $$1, long $$2) {
      return true;
   }

   protected void b(arq $$0, E $$1, long $$2) {
      $$1.eb().a(cgl.aa, true);
      $$1.eb().b(cgl.n);
   }

   protected void c(arq $$0, E $$1, long $$2) {
      byj<?> $$3 = $$1.eb();
      $$3.b(cgl.aa);
   }

   protected void d(arq $$0, E $$1, long $$2) {
      if ($$1.O().k()) {
         ffc $$3 = this.a($$1, $$0);
         if ($$3 != null) {
            $$1.eb().a(cgl.n, new cgo($$3, this.g, 0));
         }
      }
   }

   @Nullable
   private ffc a(E $$0, arq $$1) {
      if ($$0.bW()) {
         Optional<ffc> $$2 = this.a((diq)$$1, $$0).map(ffc::c);
         if ($$2.isPresent()) {
            return $$2.get();
         }
      }

      return cif.a($$0, 5, 4);
   }

   private Optional<iv> a(diq $$0, bwi $$1) {
      iv $$2 = $$1.du();
      if (!$$0.a_($$2).g($$0, $$2).c()) {
         return Optional.empty();
      } else {
         Predicate<iv> $$3;
         if (azm.f($$1.dp()) == 2) {
            $$3 = $$1x -> iv.a($$1x).allMatch($$1xx -> $$0.b_($$1xx).a(axh.a));
         } else {
            $$3 = $$1x -> $$0.b_($$1x).a(axh.a);
         }

         return iv.a($$2, 5, 1, $$3);
      }
   }
}
