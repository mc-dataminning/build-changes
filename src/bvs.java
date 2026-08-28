import java.util.Map;
import java.util.Optional;
import java.util.function.Function;
import java.util.function.Predicate;
import javax.annotation.Nullable;

public class bvs<E extends bun> extends bvx<E> {
   private static final int c = 100;
   private static final int d = 120;
   private static final int e = 5;
   private static final int f = 4;
   private final float g;
   private final Function<bun, axi<bsd>> h;

   public bvs(float $$0) {
      this($$0, $$0x -> awu.F);
   }

   public bvs(float $$0, Function<bun, axi<bsd>> $$1) {
      super(Map.of(cdi.Z, cdj.c, cdi.x, cdj.c), 100, 120);
      this.g = $$0;
      this.h = $$1;
   }

   protected boolean a(arg $$0, E $$1) {
      return $$1.dX().c(cdi.x).map($$1x -> $$1x.a(this.h.apply($$1))).orElse(false) || $$1.dX().a(cdi.Z);
   }

   protected boolean a(arg $$0, E $$1, long $$2) {
      return true;
   }

   protected void b(arg $$0, E $$1, long $$2) {
      $$1.dX().a(cdi.Z, true);
      $$1.dX().b(cdi.m);
   }

   protected void c(arg $$0, E $$1, long $$2) {
      bvg<?> $$3 = $$1.dX();
      $$3.b(cdi.Z);
   }

   protected void d(arg $$0, E $$1, long $$2) {
      if ($$1.P().m()) {
         eye $$3 = this.a($$1, $$0);
         if ($$3 != null) {
            $$1.dX().a(cdi.m, new cdl($$3, this.g, 0));
         }
      }
   }

   @Nullable
   private eye a(E $$0, arg $$1) {
      if ($$0.bV()) {
         Optional<eye> $$2 = this.a((dcx)$$1, $$0).map(eye::c);
         if ($$2.isPresent()) {
            return $$2.get();
         }
      }

      return cfc.a($$0, 5, 4);
   }

   private Optional<je> a(dcx $$0, btj $$1) {
      je $$2 = $$1.ds();
      if (!$$0.a_($$2).g($$0, $$2).c()) {
         return Optional.empty();
      } else {
         Predicate<je> $$3;
         if (azc.f($$1.dn()) == 2) {
            $$3 = $$1x -> je.a($$1x).allMatch($$1xx -> $$0.b_($$1xx).a(awy.a));
         } else {
            $$3 = $$1x -> $$0.b_($$1x).a(awy.a);
         }

         return je.a($$2, 5, 1, $$3);
      }
   }
}
