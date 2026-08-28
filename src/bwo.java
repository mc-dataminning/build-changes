import java.util.Map;
import java.util.Optional;
import java.util.function.Function;
import java.util.function.Predicate;
import javax.annotation.Nullable;

public class bwo<E extends bvi> extends bwt<E> {
   private static final int c = 100;
   private static final int d = 120;
   private static final int e = 5;
   private static final int f = 4;
   private final float g;
   private final Function<bvi, axq<bsw>> h;

   public bwo(float $$0) {
      this($$0, $$0x -> axc.F);
   }

   public bwo(float $$0, Function<bvi, axq<bsw>> $$1) {
      super(Map.of(cee.Z, cef.c, cee.x, cef.c), 100, 120);
      this.g = $$0;
      this.h = $$1;
   }

   protected boolean a(arn $$0, E $$1) {
      return $$1.ed().c(cee.x).map($$1x -> $$1x.a(this.h.apply($$1))).orElse(false) || $$1.ed().a(cee.Z);
   }

   protected boolean a(arn $$0, E $$1, long $$2) {
      return true;
   }

   protected void b(arn $$0, E $$1, long $$2) {
      $$1.ed().a(cee.Z, true);
      $$1.ed().b(cee.m);
   }

   protected void c(arn $$0, E $$1, long $$2) {
      bwc<?> $$3 = $$1.ed();
      $$3.b(cee.Z);
   }

   protected void d(arn $$0, E $$1, long $$2) {
      if ($$1.P().m()) {
         ezn $$3 = this.a($$1, $$0);
         if ($$3 != null) {
            $$1.ed().a(cee.m, new ceh($$3, this.g, 0));
         }
      }
   }

   @Nullable
   private ezn a(E $$0, arn $$1) {
      if ($$0.bZ()) {
         Optional<ezn> $$2 = this.a((deg)$$1, $$0).map(ezn::c);
         if ($$2.isPresent()) {
            return $$2.get();
         }
      }

      return cfy.a($$0, 5, 4);
   }

   private Optional<jh> a(deg $$0, bue $$1) {
      jh $$2 = $$1.dx();
      if (!$$0.a_($$2).g($$0, $$2).c()) {
         return Optional.empty();
      } else {
         Predicate<jh> $$3;
         if (azk.f($$1.ds()) == 2) {
            $$3 = $$1x -> jh.a($$1x).allMatch($$1xx -> $$0.b_($$1xx).a(axg.a));
         } else {
            $$3 = $$1x -> $$0.b_($$1x).a(axg.a);
         }

         return jh.a($$2, 5, 1, $$3);
      }
   }
}
