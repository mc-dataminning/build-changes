import java.util.Map;
import java.util.Optional;
import java.util.function.Function;

public class buz<E extends bsq & clj> extends buj<E> {
   private static final int c = 3;
   private static final int d = 60;
   private final Function<bsq, Optional<bvx>> e;
   private final float f;

   public buz(Function<bsq, Optional<bvx>> $$0, float $$1, int $$2) {
      super(Map.of(cbu.n, cbv.c, cbu.m, cbv.c, cbu.aP, cbv.c), $$2);
      this.e = $$0;
      this.f = $$1;
   }

   @Override
   protected boolean a(aqn $$0, E $$1) {
      return this.b($$1);
   }

   @Override
   protected boolean a(aqn $$0, E $$1, long $$2) {
      return this.b($$1);
   }

   @Override
   protected void d(aqn $$0, E $$1, long $$2) {
      this.e.apply($$1).ifPresent($$1x -> bul.a($$1, $$1x, this.f, 3));
   }

   @Override
   protected void c(aqn $$0, E $$1, long $$2) {
      Optional<bvx> $$3 = this.e.apply($$1);
      if (!$$3.isEmpty()) {
         bvx $$4 = $$3.get();
         double $$5 = $$4.a().f($$1.bx());
         if ($$5 < 3.0) {
            ctq $$6 = $$1.y().a(0, 1);
            if (!$$6.e()) {
               a($$1, $$6, a($$4));
               if ($$1 instanceof cfm $$7) {
                  cfn.a((bsq)$$7).ifPresent($$2x -> this.a($$4, $$6, $$2x));
               }

               $$1.dS().a(cbu.aP, 60);
            }
         }
      }
   }

   private void a(bvx $$0, ctq $$1, aqo $$2) {
      io $$3 = $$0.b().d();
      am.aa.a($$2, $$3, $$1);
   }

   private boolean b(E $$0) {
      if ($$0.y().c()) {
         return false;
      } else {
         Optional<bvx> $$1 = this.e.apply($$0);
         return $$1.isPresent();
      }
   }

   private static eum a(bvx $$0) {
      return $$0.a().b(0.0, 1.0, 0.0);
   }

   public static void a(bsq $$0, ctq $$1, eum $$2) {
      eum $$3 = new eum(0.2F, 0.3F, 0.2F);
      bul.a($$0, $$1, $$2, $$3, 0.2F);
      daz $$4 = $$0.dP();
      if ($$4.Y() % 7L == 0L && $$4.z.j() < 0.9) {
         float $$5 = ac.<Float>a(cfm.d, $$4.E_());
         $$4.a(null, $$0, avi.g, avj.g, 1.0F, $$5);
      }
   }
}
