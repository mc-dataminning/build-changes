import java.util.Map;
import java.util.Optional;
import java.util.function.Function;

public class brx<E extends bpp & cif> extends brh<E> {
   private static final int c = 3;
   private static final int d = 60;
   private final Function<bpp, Optional<bsv>> e;
   private final float f;

   public brx(Function<bpp, Optional<bsv>> $$0, float $$1, int $$2) {
      super(Map.of(bys.n, byt.c, bys.m, byt.c, bys.aP, byt.c), $$2);
      this.e = $$0;
      this.f = $$1;
   }

   @Override
   protected boolean a(apf $$0, E $$1) {
      return this.b($$1);
   }

   @Override
   protected boolean a(apf $$0, E $$1, long $$2) {
      return this.b($$1);
   }

   @Override
   protected void d(apf $$0, E $$1, long $$2) {
      this.e.apply($$1).ifPresent($$1x -> brj.a($$1, $$1x, this.f, 3));
   }

   @Override
   protected void c(apf $$0, E $$1, long $$2) {
      Optional<bsv> $$3 = this.e.apply($$1);
      if (!$$3.isEmpty()) {
         bsv $$4 = $$3.get();
         double $$5 = $$4.a().f($$1.bu());
         if ($$5 < 3.0) {
            cqm $$6 = $$1.y().a(0, 1);
            if (!$$6.b()) {
               a($$1, $$6, a($$4));
               if ($$1 instanceof cci $$7) {
                  ccj.a((bpp)$$7).ifPresent($$2x -> this.a($$4, $$6, $$2x));
               }

               $$1.dP().a(bys.aP, 60);
            }
         }
      }
   }

   private void a(bsv $$0, cqm $$1, apg $$2) {
      ib $$3 = $$0.b().d();
      am.aa.a($$2, $$3, $$1);
   }

   private boolean b(E $$0) {
      if ($$0.y().ai_()) {
         return false;
      } else {
         Optional<bsv> $$1 = this.e.apply($$0);
         return $$1.isPresent();
      }
   }

   private static ept a(bsv $$0) {
      return $$0.a().b(0.0, 1.0, 0.0);
   }

   public static void a(bpp $$0, cqm $$1, ept $$2) {
      ept $$3 = new ept(0.2F, 0.3F, 0.2F);
      brj.a($$0, $$1, $$2, $$3, 0.2F);
      cxb $$4 = $$0.dM();
      if ($$4.X() % 7L == 0L && $$4.z.j() < 0.9) {
         float $$5 = ac.<Float>a(cci.d, $$4.E_());
         $$4.a(null, $$0, aty.g, atz.g, 1.0F, $$5);
      }
   }
}
