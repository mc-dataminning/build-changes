import java.util.Map;
import java.util.Optional;
import java.util.function.Function;

public class blp<E extends bji & cbh> extends bkz<E> {
   private static final int c = 3;
   private static final int d = 60;
   private final Function<bji, Optional<bmm>> e;
   private final float f;

   public blp(Function<bji, Optional<bmm>> $$0, float $$1, int $$2) {
      super(Map.of(bsj.n, bsk.c, bsj.m, bsk.c, bsj.aO, bsk.c), $$2);
      this.e = $$0;
      this.f = $$1;
   }

   @Override
   protected boolean a(aks $$0, E $$1) {
      return this.b($$1);
   }

   @Override
   protected boolean a(aks $$0, E $$1, long $$2) {
      return this.b($$1);
   }

   @Override
   protected void d(aks $$0, E $$1, long $$2) {
      this.e.apply($$1).ifPresent($$1x -> blb.a($$1, $$1x, this.f, 3));
   }

   @Override
   protected void c(aks $$0, E $$1, long $$2) {
      Optional<bmm> $$3 = this.e.apply($$1);
      if (!$$3.isEmpty()) {
         bmm $$4 = $$3.get();
         double $$5 = $$4.a().f($$1.bp());
         if ($$5 < 3.0) {
            cjh $$6 = $$1.y().a(0, 1);
            if (!$$6.b()) {
               a($$1, $$6, a($$4));
               if ($$1 instanceof bvx $$7) {
                  bvy.a((bji)$$7).ifPresent($$2x -> this.a($$4, $$6, $$2x));
               }

               $$1.dN().a(bsj.aO, 60);
            }
         }
      }
   }

   private void a(bmm $$0, cjh $$1, akt $$2) {
      gw $$3 = $$0.b().d();
      al.X.a($$2, $$3, $$1);
   }

   private boolean b(E $$0) {
      if ($$0.y().af_()) {
         return false;
      } else {
         Optional<bmm> $$1 = this.e.apply($$0);
         return $$1.isPresent();
      }
   }

   private static ehp a(bmm $$0) {
      return $$0.a().b(0.0, 1.0, 0.0);
   }

   public static void a(bji $$0, cjh $$1, ehp $$2) {
      ehp $$3 = new ehp(0.2F, 0.3F, 0.2F);
      blb.a($$0, $$1, $$2, $$3, 0.2F);
      cpx $$4 = $$0.dL();
      if ($$4.V() % 7L == 0L && $$4.z.j() < 0.9) {
         float $$5 = ac.<Float>a(bvx.d, $$4.D_());
         $$4.a(null, $$0, apf.g, apg.g, 1.0F, $$5);
      }
   }
}
