import java.util.Map;
import java.util.Optional;
import java.util.function.Function;
import java.util.function.Predicate;
import javax.annotation.Nullable;

public class byo<E extends bxk> extends byt<E> {
   private static final int c = 100;
   private static final int d = 120;
   private static final int e = 5;
   private static final int f = 4;
   private final float g;
   private final Function<bxk, axr<buu>> h;

   public byo(float $$0) {
      this($$0, $$0x -> axd.F);
   }

   public byo(float $$0, Function<bxk, axr<buu>> $$1) {
      super(Map.of(cge.aa, cgf.c, cge.y, cgf.c), 100, 120);
      this.g = $$0;
      this.h = $$1;
   }

   protected boolean a(arq $$0, E $$1) {
      return $$1.eb().c(cge.y).map($$1x -> $$1x.a(this.h.apply($$1))).orElse(false) || $$1.eb().a(cge.aa);
   }

   protected boolean a(arq $$0, E $$1, long $$2) {
      return true;
   }

   protected void b(arq $$0, E $$1, long $$2) {
      $$1.eb().a(cge.aa, true);
      $$1.eb().b(cge.n);
   }

   protected void c(arq $$0, E $$1, long $$2) {
      byc<?> $$3 = $$1.eb();
      $$3.b(cge.aa);
   }

   protected void d(arq $$0, E $$1, long $$2) {
      if ($$1.O().k()) {
         fei $$3 = this.a($$1, $$0);
         if ($$3 != null) {
            $$1.eb().a(cge.n, new cgh($$3, this.g, 0));
         }
      }
   }

   @Nullable
   private fei a(E $$0, arq $$1) {
      if ($$0.bY()) {
         Optional<fei> $$2 = this.a((dib)$$1, $$0).map(fei::c);
         if ($$2.isPresent()) {
            return $$2.get();
         }
      }

      return chy.a($$0, 5, 4);
   }

   private Optional<iu> a(dib $$0, bwd $$1) {
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
