import java.util.Map;
import java.util.Optional;
import java.util.function.Function;
import java.util.function.Predicate;
import javax.annotation.Nullable;

public class bxl<E extends bwf> extends bxq<E> {
   private static final int c = 100;
   private static final int d = 120;
   private static final int e = 5;
   private static final int f = 4;
   private final float g;
   private final Function<bwf, aya<btt>> h;

   public bxl(float $$0) {
      this($$0, $$0x -> axm.F);
   }

   public bxl(float $$0, Function<bwf, aya<btt>> $$1) {
      super(Map.of(cfb.Z, cfc.c, cfb.x, cfc.c), 100, 120);
      this.g = $$0;
      this.h = $$1;
   }

   protected boolean a(arx $$0, E $$1) {
      return $$1.ec().c(cfb.x).map($$1x -> $$1x.a(this.h.apply($$1))).orElse(false) || $$1.ec().a(cfb.Z);
   }

   protected boolean a(arx $$0, E $$1, long $$2) {
      return true;
   }

   protected void b(arx $$0, E $$1, long $$2) {
      $$1.ec().a(cfb.Z, true);
      $$1.ec().b(cfb.m);
   }

   protected void c(arx $$0, E $$1, long $$2) {
      bwz<?> $$3 = $$1.ec();
      $$3.b(cfb.Z);
   }

   protected void d(arx $$0, E $$1, long $$2) {
      if ($$1.L().m()) {
         fbr $$3 = this.a($$1, $$0);
         if ($$3 != null) {
            $$1.ec().a(cfb.m, new cfe($$3, this.g, 0));
         }
      }
   }

   @Nullable
   private fbr a(E $$0, arx $$1) {
      if ($$0.bY()) {
         Optional<fbr> $$2 = this.a((dge)$$1, $$0).map(fbr::c);
         if ($$2.isPresent()) {
            return $$2.get();
         }
      }

      return cgv.a($$0, 5, 4);
   }

   private Optional<jh> a(dge $$0, bvb $$1) {
      jh $$2 = $$1.dw();
      if (!$$0.a_($$2).g($$0, $$2).c()) {
         return Optional.empty();
      } else {
         Predicate<jh> $$3;
         if (azu.f($$1.dr()) == 2) {
            $$3 = $$1x -> jh.a($$1x).allMatch($$1xx -> $$0.b_($$1xx).a(axq.a));
         } else {
            $$3 = $$1x -> $$0.b_($$1x).a(axq.a);
         }

         return jh.a($$2, 5, 1, $$3);
      }
   }
}
