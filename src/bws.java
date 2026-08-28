import java.util.Map;
import java.util.Optional;
import java.util.function.Function;
import java.util.function.Predicate;
import javax.annotation.Nullable;

public class bws<E extends bvm> extends bwx<E> {
   private static final int c = 100;
   private static final int d = 120;
   private static final int e = 5;
   private static final int f = 4;
   private final float g;
   private final Function<bvm, axt<bta>> h;

   public bws(float $$0) {
      this($$0, $$0x -> axf.F);
   }

   public bws(float $$0, Function<bvm, axt<bta>> $$1) {
      super(Map.of(cei.Z, cej.c, cei.x, cej.c), 100, 120);
      this.g = $$0;
      this.h = $$1;
   }

   protected boolean a(arq $$0, E $$1) {
      return $$1.ee().c(cei.x).map($$1x -> $$1x.a(this.h.apply($$1))).orElse(false) || $$1.ee().a(cei.Z);
   }

   protected boolean a(arq $$0, E $$1, long $$2) {
      return true;
   }

   protected void b(arq $$0, E $$1, long $$2) {
      $$1.ee().a(cei.Z, true);
      $$1.ee().b(cei.m);
   }

   protected void c(arq $$0, E $$1, long $$2) {
      bwg<?> $$3 = $$1.ee();
      $$3.b(cei.Z);
   }

   protected void d(arq $$0, E $$1, long $$2) {
      if ($$1.P().m()) {
         ezr $$3 = this.a($$1, $$0);
         if ($$3 != null) {
            $$1.ee().a(cei.m, new cel($$3, this.g, 0));
         }
      }
   }

   @Nullable
   private ezr a(E $$0, arq $$1) {
      if ($$0.ca()) {
         Optional<ezr> $$2 = this.a((dek)$$1, $$0).map(ezr::c);
         if ($$2.isPresent()) {
            return $$2.get();
         }
      }

      return cgc.a($$0, 5, 4);
   }

   private Optional<jh> a(dek $$0, bui $$1) {
      jh $$2 = $$1.dy();
      if (!$$0.a_($$2).g($$0, $$2).c()) {
         return Optional.empty();
      } else {
         Predicate<jh> $$3;
         if (azn.f($$1.dt()) == 2) {
            $$3 = $$1x -> jh.a($$1x).allMatch($$1xx -> $$0.b_($$1xx).a(axj.a));
         } else {
            $$3 = $$1x -> $$0.b_($$1x).a(axj.a);
         }

         return jh.a($$2, 5, 1, $$3);
      }
   }
}
