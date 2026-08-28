import java.util.Map;
import java.util.Optional;
import java.util.function.Function;
import java.util.function.Predicate;
import javax.annotation.Nullable;

public class bwj<E extends bvd> extends bwo<E> {
   private static final int c = 100;
   private static final int d = 120;
   private static final int e = 5;
   private static final int f = 4;
   private final float g;
   private final Function<bvd, axp<bsr>> h;

   public bwj(float $$0) {
      this($$0, $$0x -> axb.F);
   }

   public bwj(float $$0, Function<bvd, axp<bsr>> $$1) {
      super(Map.of(cdz.Z, cea.c, cdz.x, cea.c), 100, 120);
      this.g = $$0;
      this.h = $$1;
   }

   protected boolean a(arm $$0, E $$1) {
      return $$1.ed().c(cdz.x).map($$1x -> $$1x.a(this.h.apply($$1))).orElse(false) || $$1.ed().a(cdz.Z);
   }

   protected boolean a(arm $$0, E $$1, long $$2) {
      return true;
   }

   protected void b(arm $$0, E $$1, long $$2) {
      $$1.ed().a(cdz.Z, true);
      $$1.ed().b(cdz.m);
   }

   protected void c(arm $$0, E $$1, long $$2) {
      bvx<?> $$3 = $$1.ed();
      $$3.b(cdz.Z);
   }

   protected void d(arm $$0, E $$1, long $$2) {
      if ($$1.P().m()) {
         ezh $$3 = this.a($$1, $$0);
         if ($$3 != null) {
            $$1.ed().a(cdz.m, new cec($$3, this.g, 0));
         }
      }
   }

   @Nullable
   private ezh a(E $$0, arm $$1) {
      if ($$0.bZ()) {
         Optional<ezh> $$2 = this.a((dea)$$1, $$0).map(ezh::c);
         if ($$2.isPresent()) {
            return $$2.get();
         }
      }

      return cft.a($$0, 5, 4);
   }

   private Optional<jg> a(dea $$0, btz $$1) {
      jg $$2 = $$1.dx();
      if (!$$0.a_($$2).g($$0, $$2).c()) {
         return Optional.empty();
      } else {
         Predicate<jg> $$3;
         if (azj.f($$1.ds()) == 2) {
            $$3 = $$1x -> jg.a($$1x).allMatch($$1xx -> $$0.b_($$1xx).a(axf.a));
         } else {
            $$3 = $$1x -> $$0.b_($$1x).a(axf.a);
         }

         return jg.a($$2, 5, 1, $$3);
      }
   }
}
