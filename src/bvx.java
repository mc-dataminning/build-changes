import java.util.Map;
import java.util.Optional;
import java.util.function.Function;
import java.util.function.Predicate;
import javax.annotation.Nullable;

public class bvx<E extends bus> extends bwc<E> {
   private static final int c = 100;
   private static final int d = 120;
   private static final int e = 5;
   private static final int f = 4;
   private final float g;
   private final Function<bus, axj<bsi>> h;

   public bvx(float $$0) {
      this($$0, $$0x -> awv.F);
   }

   public bvx(float $$0, Function<bus, axj<bsi>> $$1) {
      super(Map.of(cdn.Z, cdo.c, cdn.x, cdo.c), 100, 120);
      this.g = $$0;
      this.h = $$1;
   }

   protected boolean a(arh $$0, E $$1) {
      return $$1.dX().c(cdn.x).map($$1x -> $$1x.a(this.h.apply($$1))).orElse(false) || $$1.dX().a(cdn.Z);
   }

   protected boolean a(arh $$0, E $$1, long $$2) {
      return true;
   }

   protected void b(arh $$0, E $$1, long $$2) {
      $$1.dX().a(cdn.Z, true);
      $$1.dX().b(cdn.m);
   }

   protected void c(arh $$0, E $$1, long $$2) {
      bvl<?> $$3 = $$1.dX();
      $$3.b(cdn.Z);
   }

   protected void d(arh $$0, E $$1, long $$2) {
      if ($$1.P().m()) {
         eys $$3 = this.a($$1, $$0);
         if ($$3 != null) {
            $$1.dX().a(cdn.m, new cdq($$3, this.g, 0));
         }
      }
   }

   @Nullable
   private eys a(E $$0, arh $$1) {
      if ($$0.bV()) {
         Optional<eys> $$2 = this.a((ddl)$$1, $$0).map(eys::c);
         if ($$2.isPresent()) {
            return $$2.get();
         }
      }

      return cfh.a($$0, 5, 4);
   }

   private Optional<je> a(ddl $$0, bto $$1) {
      je $$2 = $$1.ds();
      if (!$$0.a_($$2).g($$0, $$2).c()) {
         return Optional.empty();
      } else {
         Predicate<je> $$3;
         if (azd.f($$1.dn()) == 2) {
            $$3 = $$1x -> je.a($$1x).allMatch($$1xx -> $$0.b_($$1xx).a(awz.a));
         } else {
            $$3 = $$1x -> $$0.b_($$1x).a(awz.a);
         }

         return je.a($$2, 5, 1, $$3);
      }
   }
}
