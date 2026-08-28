import java.util.Map;
import java.util.Optional;
import java.util.function.Function;
import java.util.function.Predicate;
import javax.annotation.Nullable;

public class bxm<E extends bwg> extends bxr<E> {
   private static final int c = 100;
   private static final int d = 120;
   private static final int e = 5;
   private static final int f = 4;
   private final float g;
   private final Function<bwg, axf<btr>> h;

   public bxm(float $$0) {
      this($$0, $$0x -> awr.F);
   }

   public bxm(float $$0, Function<bwg, axf<btr>> $$1) {
      super(Map.of(cfc.Z, cfd.c, cfc.x, cfd.c), 100, 120);
      this.g = $$0;
      this.h = $$1;
   }

   protected boolean a(ard $$0, E $$1) {
      return $$1.ea().c(cfc.x).map($$1x -> $$1x.a(this.h.apply($$1))).orElse(false) || $$1.ea().a(cfc.Z);
   }

   protected boolean a(ard $$0, E $$1, long $$2) {
      return true;
   }

   protected void b(ard $$0, E $$1, long $$2) {
      $$1.ea().a(cfc.Z, true);
      $$1.ea().b(cfc.m);
   }

   protected void c(ard $$0, E $$1, long $$2) {
      bxa<?> $$3 = $$1.ea();
      $$3.b(cfc.Z);
   }

   protected void d(ard $$0, E $$1, long $$2) {
      if ($$1.O().k()) {
         fbx $$3 = this.a($$1, $$0);
         if ($$3 != null) {
            $$1.ea().a(cfc.m, new cff($$3, this.g, 0));
         }
      }
   }

   @Nullable
   private fbx a(E $$0, ard $$1) {
      if ($$0.bX()) {
         Optional<fbx> $$2 = this.a((dgf)$$1, $$0).map(fbx::c);
         if ($$2.isPresent()) {
            return $$2.get();
         }
      }

      return cgw.a($$0, 5, 4);
   }

   private Optional<ji> a(dgf $$0, bva $$1) {
      ji $$2 = $$1.du();
      if (!$$0.a_($$2).g($$0, $$2).c()) {
         return Optional.empty();
      } else {
         Predicate<ji> $$3;
         if (ayz.f($$1.dp()) == 2) {
            $$3 = $$1x -> ji.a($$1x).allMatch($$1xx -> $$0.b_($$1xx).a(awv.a));
         } else {
            $$3 = $$1x -> $$0.b_($$1x).a(awv.a);
         }

         return ji.a($$2, 5, 1, $$3);
      }
   }
}
