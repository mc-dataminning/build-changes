import java.util.Map;
import java.util.Optional;
import java.util.function.Function;

public class bxq<E extends bvh & cod> extends bxa<E> {
   private static final int c = 3;
   private static final int d = 60;
   private final Function<bvh, Optional<byo>> e;
   private final float f;

   public bxq(Function<bvh, Optional<byo>> $$0, float $$1, int $$2) {
      super(Map.of(cel.n, cem.c, cel.m, cem.c, cel.aP, cem.c), $$2);
      this.e = $$0;
      this.f = $$1;
   }

   @Override
   protected boolean a(arp $$0, E $$1) {
      return this.b($$1);
   }

   @Override
   protected boolean a(arp $$0, E $$1, long $$2) {
      return this.b($$1);
   }

   @Override
   protected void d(arp $$0, E $$1, long $$2) {
      this.e.apply($$1).ifPresent($$1x -> bxc.a($$1, $$1x, this.f, 3));
   }

   @Override
   protected void c(arp $$0, E $$1, long $$2) {
      Optional<byo> $$3 = this.e.apply($$1);
      if (!$$3.isEmpty()) {
         byo $$4 = $$3.get();
         double $$5 = $$4.a().f($$1.bF());
         if ($$5 < 3.0) {
            cwm $$6 = $$1.v().a(0, 1);
            if (!$$6.f()) {
               a($$1, $$6, a($$4));
               if ($$1 instanceof cie $$7) {
                  cif.a((bvh)$$7).ifPresent($$2x -> this.a($$4, $$6, $$2x));
               }

               $$1.eb().a(cel.aP, 60);
            }
         }
      }
   }

   private void a(byo $$0, cwm $$1, arq $$2) {
      jh $$3 = $$0.b().e();
      ao.aa.a($$2, $$3, $$1);
   }

   private boolean b(E $$0) {
      if ($$0.v().c()) {
         return false;
      } else {
         Optional<byo> $$1 = this.e.apply($$0);
         return $$1.isPresent();
      }
   }

   private static ezy a(byo $$0) {
      return $$0.a().b(0.0, 1.0, 0.0);
   }

   public static void a(bvh $$0, cwm $$1, ezy $$2) {
      ezy $$3 = new ezy(0.2F, 0.3F, 0.2F);
      bxc.a($$0, $$1, $$2, $$3, 0.2F);
      dfm $$4 = $$0.dV();
      if ($$4.ab() % 7L == 0L && $$4.A.j() < 0.9) {
         float $$5 = ae.<Float>a(cie.c, $$4.G_());
         $$4.a(null, $$0, awn.g, awo.g, 1.0F, $$5);
      }
   }
}
