import java.util.Map;
import java.util.Optional;
import java.util.function.Function;

public class bvt<E extends btk & cmd> extends bvd<E> {
   private static final int c = 3;
   private static final int d = 60;
   private final Function<btk, Optional<bwr>> e;
   private final float f;

   public bvt(Function<btk, Optional<bwr>> $$0, float $$1, int $$2) {
      super(Map.of(cco.n, ccp.c, cco.m, ccp.c, cco.aP, ccp.c), $$2);
      this.e = $$0;
      this.f = $$1;
   }

   @Override
   protected boolean a(arb $$0, E $$1) {
      return this.b($$1);
   }

   @Override
   protected boolean a(arb $$0, E $$1, long $$2) {
      return this.b($$1);
   }

   @Override
   protected void d(arb $$0, E $$1, long $$2) {
      this.e.apply($$1).ifPresent($$1x -> bvf.a($$1, $$1x, this.f, 3));
   }

   @Override
   protected void c(arb $$0, E $$1, long $$2) {
      Optional<bwr> $$3 = this.e.apply($$1);
      if (!$$3.isEmpty()) {
         bwr $$4 = $$3.get();
         double $$5 = $$4.a().f($$1.bx());
         if ($$5 < 3.0) {
            cuk $$6 = $$1.y().a(0, 1);
            if (!$$6.e()) {
               a($$1, $$6, a($$4));
               if ($$1 instanceof cgg $$7) {
                  cgh.a((btk)$$7).ifPresent($$2x -> this.a($$4, $$6, $$2x));
               }

               $$1.dS().a(cco.aP, 60);
            }
         }
      }
   }

   private void a(bwr $$0, cuk $$1, arc $$2) {
      iz $$3 = $$0.b().d();
      am.aa.a($$2, $$3, $$1);
   }

   private boolean b(E $$0) {
      if ($$0.y().c()) {
         return false;
      } else {
         Optional<bwr> $$1 = this.e.apply($$0);
         return $$1.isPresent();
      }
   }

   private static evm a(bwr $$0) {
      return $$0.a().b(0.0, 1.0, 0.0);
   }

   public static void a(btk $$0, cuk $$1, evm $$2) {
      evm $$3 = new evm(0.2F, 0.3F, 0.2F);
      bvf.a($$0, $$1, $$2, $$3, 0.2F);
      dbt $$4 = $$0.dP();
      if ($$4.Z() % 7L == 0L && $$4.z.j() < 0.9) {
         float $$5 = ac.<Float>a(cgg.d, $$4.E_());
         $$4.a(null, $$0, avw.g, avx.g, 1.0F, $$5);
      }
   }
}
