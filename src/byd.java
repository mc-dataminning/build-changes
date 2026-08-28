import java.util.Map;
import java.util.Optional;
import java.util.function.Function;
import java.util.function.Predicate;
import javax.annotation.Nullable;

public class byd<E extends bwz> extends byi<E> {
   private static final int c = 100;
   private static final int d = 120;
   private static final int e = 5;
   private static final int f = 4;
   private final float g;
   private final Function<bwz, axp<buj>> h;

   public byd(float $$0) {
      this($$0, $$0x -> axb.F);
   }

   public byd(float $$0, Function<bwz, axp<buj>> $$1) {
      super(Map.of(cft.aa, cfu.c, cft.y, cfu.c), 100, 120);
      this.g = $$0;
      this.h = $$1;
   }

   protected boolean a(arn $$0, E $$1) {
      return $$1.eb().c(cft.y).map($$1x -> $$1x.a(this.h.apply($$1))).orElse(false) || $$1.eb().a(cft.aa);
   }

   protected boolean a(arn $$0, E $$1, long $$2) {
      return true;
   }

   protected void b(arn $$0, E $$1, long $$2) {
      $$1.eb().a(cft.aa, true);
      $$1.eb().b(cft.n);
   }

   protected void c(arn $$0, E $$1, long $$2) {
      bxr<?> $$3 = $$1.eb();
      $$3.b(cft.aa);
   }

   protected void d(arn $$0, E $$1, long $$2) {
      if ($$1.O().k()) {
         fcu $$3 = this.a($$1, $$0);
         if ($$3 != null) {
            $$1.eb().a(cft.n, new cfw($$3, this.g, 0));
         }
      }
   }

   @Nullable
   private fcu a(E $$0, arn $$1) {
      if ($$0.bY()) {
         Optional<fcu> $$2 = this.a((dgv)$$1, $$0).map(fcu::c);
         if ($$2.isPresent()) {
            return $$2.get();
         }
      }

      return chn.a($$0, 5, 4);
   }

   private Optional<jj> a(dgv $$0, bvs $$1) {
      jj $$2 = $$1.dv();
      if (!$$0.a_($$2).g($$0, $$2).c()) {
         return Optional.empty();
      } else {
         Predicate<jj> $$3;
         if (azk.f($$1.dq()) == 2) {
            $$3 = $$1x -> jj.a($$1x).allMatch($$1xx -> $$0.b_($$1xx).a(axf.a));
         } else {
            $$3 = $$1x -> $$0.b_($$1x).a(axf.a);
         }

         return jj.a($$2, 5, 1, $$3);
      }
   }
}
