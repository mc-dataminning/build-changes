import java.util.Map;
import java.util.Optional;
import java.util.function.Function;

public class bux<E extends bso & clh> extends buh<E> {
   private static final int c = 3;
   private static final int d = 60;
   private final Function<bso, Optional<bvv>> e;
   private final float f;

   public bux(Function<bso, Optional<bvv>> $$0, float $$1, int $$2) {
      super(Map.of(cbs.n, cbt.c, cbs.m, cbt.c, cbs.aP, cbt.c), $$2);
      this.e = $$0;
      this.f = $$1;
   }

   @Override
   protected boolean a(aqm $$0, E $$1) {
      return this.b($$1);
   }

   @Override
   protected boolean a(aqm $$0, E $$1, long $$2) {
      return this.b($$1);
   }

   @Override
   protected void d(aqm $$0, E $$1, long $$2) {
      this.e.apply($$1).ifPresent($$1x -> buj.a($$1, $$1x, this.f, 3));
   }

   @Override
   protected void c(aqm $$0, E $$1, long $$2) {
      Optional<bvv> $$3 = this.e.apply($$1);
      if (!$$3.isEmpty()) {
         bvv $$4 = $$3.get();
         double $$5 = $$4.a().f($$1.bx());
         if ($$5 < 3.0) {
            cto $$6 = $$1.y().a(0, 1);
            if (!$$6.e()) {
               a($$1, $$6, a($$4));
               if ($$1 instanceof cfk $$7) {
                  cfl.a((bso)$$7).ifPresent($$2x -> this.a($$4, $$6, $$2x));
               }

               $$1.dS().a(cbs.aP, 60);
            }
         }
      }
   }

   private void a(bvv $$0, cto $$1, aqn $$2) {
      io $$3 = $$0.b().d();
      am.aa.a($$2, $$3, $$1);
   }

   private boolean b(E $$0) {
      if ($$0.y().c()) {
         return false;
      } else {
         Optional<bvv> $$1 = this.e.apply($$0);
         return $$1.isPresent();
      }
   }

   private static euk a(bvv $$0) {
      return $$0.a().b(0.0, 1.0, 0.0);
   }

   public static void a(bso $$0, cto $$1, euk $$2) {
      euk $$3 = new euk(0.2F, 0.3F, 0.2F);
      buj.a($$0, $$1, $$2, $$3, 0.2F);
      dax $$4 = $$0.dP();
      if ($$4.Y() % 7L == 0L && $$4.z.j() < 0.9) {
         float $$5 = ac.<Float>a(cfk.d, $$4.E_());
         $$4.a(null, $$0, avh.g, avi.g, 1.0F, $$5);
      }
   }
}
