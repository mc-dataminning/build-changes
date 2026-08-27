import java.util.Map;
import java.util.Optional;
import java.util.function.Function;

public class bln<E extends bjg & cbf> extends bkx<E> {
   private static final int c = 3;
   private static final int d = 60;
   private final Function<bjg, Optional<bmk>> e;
   private final float f;

   public bln(Function<bjg, Optional<bmk>> $$0, float $$1, int $$2) {
      super(Map.of(bsh.n, bsi.c, bsh.m, bsi.c, bsh.aO, bsi.c), $$2);
      this.e = $$0;
      this.f = $$1;
   }

   @Override
   protected boolean a(akr $$0, E $$1) {
      return this.b($$1);
   }

   @Override
   protected boolean a(akr $$0, E $$1, long $$2) {
      return this.b($$1);
   }

   @Override
   protected void d(akr $$0, E $$1, long $$2) {
      this.e.apply($$1).ifPresent($$1x -> bkz.a($$1, $$1x, this.f, 3));
   }

   @Override
   protected void c(akr $$0, E $$1, long $$2) {
      Optional<bmk> $$3 = this.e.apply($$1);
      if (!$$3.isEmpty()) {
         bmk $$4 = $$3.get();
         double $$5 = $$4.a().f($$1.bp());
         if ($$5 < 3.0) {
            cjf $$6 = $$1.y().a(0, 1);
            if (!$$6.b()) {
               a($$1, $$6, a($$4));
               if ($$1 instanceof bvv $$7) {
                  bvw.a((bjg)$$7).ifPresent($$2x -> this.a($$4, $$6, $$2x));
               }

               $$1.dN().a(bsh.aO, 60);
            }
         }
      }
   }

   private void a(bmk $$0, cjf $$1, aks $$2) {
      gw $$3 = $$0.b().d();
      al.X.a($$2, $$3, $$1);
   }

   private boolean b(E $$0) {
      if ($$0.y().af_()) {
         return false;
      } else {
         Optional<bmk> $$1 = this.e.apply($$0);
         return $$1.isPresent();
      }
   }

   private static ehn a(bmk $$0) {
      return $$0.a().b(0.0, 1.0, 0.0);
   }

   public static void a(bjg $$0, cjf $$1, ehn $$2) {
      ehn $$3 = new ehn(0.2F, 0.3F, 0.2F);
      bkz.a($$0, $$1, $$2, $$3, 0.2F);
      cpv $$4 = $$0.dL();
      if ($$4.V() % 7L == 0L && $$4.z.j() < 0.9) {
         float $$5 = ac.<Float>a(bvv.d, $$4.D_());
         $$4.a(null, $$0, ape.g, apf.g, 1.0F, $$5);
      }
   }
}
