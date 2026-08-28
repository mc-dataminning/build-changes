import java.util.Map;
import java.util.Optional;
import java.util.function.Function;
import java.util.function.Predicate;
import javax.annotation.Nullable;

public class bxt<E extends bwn> extends bxy<E> {
   private static final int c = 100;
   private static final int d = 120;
   private static final int e = 5;
   private static final int f = 4;
   private final float g;
   private final Function<bwn, ayk<bub>> h;

   public bxt(float $$0) {
      this($$0, $$0x -> axw.F);
   }

   public bxt(float $$0, Function<bwn, ayk<bub>> $$1) {
      super(Map.of(cfj.Z, cfk.c, cfj.x, cfk.c), 100, 120);
      this.g = $$0;
      this.h = $$1;
   }

   protected boolean a(ash $$0, E $$1) {
      return $$1.ec().c(cfj.x).map($$1x -> $$1x.a(this.h.apply($$1))).orElse(false) || $$1.ec().a(cfj.Z);
   }

   protected boolean a(ash $$0, E $$1, long $$2) {
      return true;
   }

   protected void b(ash $$0, E $$1, long $$2) {
      $$1.ec().a(cfj.Z, true);
      $$1.ec().b(cfj.m);
   }

   protected void c(ash $$0, E $$1, long $$2) {
      bxh<?> $$3 = $$1.ec();
      $$3.b(cfj.Z);
   }

   protected void d(ash $$0, E $$1, long $$2) {
      if ($$1.L().m()) {
         fbx $$3 = this.a($$1, $$0);
         if ($$3 != null) {
            $$1.ec().a(cfj.m, new cfm($$3, this.g, 0));
         }
      }
   }

   @Nullable
   private fbx a(E $$0, ash $$1) {
      if ($$0.bY()) {
         Optional<fbx> $$2 = this.a((dgm)$$1, $$0).map(fbx::c);
         if ($$2.isPresent()) {
            return $$2.get();
         }
      }

      return chd.a($$0, 5, 4);
   }

   private Optional<jh> a(dgm $$0, bvj $$1) {
      jh $$2 = $$1.dw();
      if (!$$0.a_($$2).g($$0, $$2).c()) {
         return Optional.empty();
      } else {
         Predicate<jh> $$3;
         if (bae.f($$1.dr()) == 2) {
            $$3 = $$1x -> jh.a($$1x).allMatch($$1xx -> $$0.b_($$1xx).a(aya.a));
         } else {
            $$3 = $$1x -> $$0.b_($$1x).a(aya.a);
         }

         return jh.a($$2, 5, 1, $$3);
      }
   }
}
