import java.util.Map;
import java.util.Optional;
import java.util.function.Function;

public class bxn<E extends bve & coa> extends bwx<E> {
   private static final int c = 3;
   private static final int d = 60;
   private final Function<bve, Optional<byl>> e;
   private final float f;

   public bxn(Function<bve, Optional<byl>> $$0, float $$1, int $$2) {
      super(Map.of(cei.n, cej.c, cei.m, cej.c, cei.aP, cej.c), $$2);
      this.e = $$0;
      this.f = $$1;
   }

   @Override
   protected boolean a(arq $$0, E $$1) {
      return this.b($$1);
   }

   @Override
   protected boolean a(arq $$0, E $$1, long $$2) {
      return this.b($$1);
   }

   @Override
   protected void d(arq $$0, E $$1, long $$2) {
      this.e.apply($$1).ifPresent($$1x -> bwz.a($$1, $$1x, this.f, 3));
   }

   @Override
   protected void c(arq $$0, E $$1, long $$2) {
      Optional<byl> $$3 = this.e.apply($$1);
      if (!$$3.isEmpty()) {
         byl $$4 = $$3.get();
         double $$5 = $$4.a().f($$1.bH());
         if ($$5 < 3.0) {
            cwf $$6 = $$1.y().a(0, 1);
            if (!$$6.f()) {
               a($$1, $$6, a($$4));
               if ($$1 instanceof cib $$7) {
                  cic.a((bve)$$7).ifPresent($$2x -> this.a($$4, $$6, $$2x));
               }

               $$1.ee().a(cei.aP, 60);
            }
         }
      }
   }

   private void a(byl $$0, cwf $$1, arr $$2) {
      jh $$3 = $$0.b().e();
      ao.aa.a($$2, $$3, $$1);
   }

   private boolean b(E $$0) {
      if ($$0.y().c()) {
         return false;
      } else {
         Optional<byl> $$1 = this.e.apply($$0);
         return $$1.isPresent();
      }
   }

   private static ezr a(byl $$0) {
      return $$0.a().b(0.0, 1.0, 0.0);
   }

   public static void a(bve $$0, cwf $$1, ezr $$2) {
      ezr $$3 = new ezr(0.2F, 0.3F, 0.2F);
      bwz.a($$0, $$1, $$2, $$3, 0.2F);
      dff $$4 = $$0.dY();
      if ($$4.aa() % 7L == 0L && $$4.A.j() < 0.9) {
         float $$5 = ae.<Float>a(cib.d, $$4.E_());
         $$4.a(null, $$0, awo.g, awp.g, 1.0F, $$5);
      }
   }
}
