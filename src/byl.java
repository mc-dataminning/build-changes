import java.util.Map;
import java.util.Optional;
import java.util.function.Function;
import java.util.function.Predicate;
import javax.annotation.Nullable;

public class byl<E extends bxh> extends byq<E> {
   private static final int c = 100;
   private static final int d = 120;
   private static final int e = 5;
   private static final int f = 4;
   private final float g;
   private final Function<bxh, axp<bur>> h;

   public byl(float $$0) {
      this($$0, $$0x -> axb.F);
   }

   public byl(float $$0, Function<bxh, axp<bur>> $$1) {
      super(Map.of(cgb.aa, cgc.c, cgb.y, cgc.c), 100, 120);
      this.g = $$0;
      this.h = $$1;
   }

   protected boolean a(aro $$0, E $$1) {
      return $$1.eb().c(cgb.y).map($$1x -> $$1x.a(this.h.apply($$1))).orElse(false) || $$1.eb().a(cgb.aa);
   }

   protected boolean a(aro $$0, E $$1, long $$2) {
      return true;
   }

   protected void b(aro $$0, E $$1, long $$2) {
      $$1.eb().a(cgb.aa, true);
      $$1.eb().b(cgb.n);
   }

   protected void c(aro $$0, E $$1, long $$2) {
      bxz<?> $$3 = $$1.eb();
      $$3.b(cgb.aa);
   }

   protected void d(aro $$0, E $$1, long $$2) {
      if ($$1.O().k()) {
         fdw $$3 = this.a($$1, $$0);
         if ($$3 != null) {
            $$1.eb().a(cgb.n, new cge($$3, this.g, 0));
         }
      }
   }

   @Nullable
   private fdw a(E $$0, aro $$1) {
      if ($$0.bY()) {
         Optional<fdw> $$2 = this.a((dhv)$$1, $$0).map(fdw::c);
         if ($$2.isPresent()) {
            return $$2.get();
         }
      }

      return chv.a($$0, 5, 4);
   }

   private Optional<iu> a(dhv $$0, bwa $$1) {
      iu $$2 = $$1.dv();
      if (!$$0.a_($$2).g($$0, $$2).c()) {
         return Optional.empty();
      } else {
         Predicate<iu> $$3;
         if (azk.f($$1.dq()) == 2) {
            $$3 = $$1x -> iu.a($$1x).allMatch($$1xx -> $$0.b_($$1xx).a(axf.a));
         } else {
            $$3 = $$1x -> $$0.b_($$1x).a(axf.a);
         }

         return iu.a($$2, 5, 1, $$3);
      }
   }
}
