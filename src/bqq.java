import java.util.Map;
import java.util.Optional;
import java.util.function.Function;

public class bqq<E extends boi & cgw> extends bqa<E> {
   private static final int c = 3;
   private static final int d = 60;
   private final Function<boi, Optional<bro>> e;
   private final float f;

   public bqq(Function<boi, Optional<bro>> $$0, float $$1, int $$2) {
      super(Map.of(bxl.n, bxm.c, bxl.m, bxm.c, bxl.aP, bxm.c), $$2);
      this.e = $$0;
      this.f = $$1;
   }

   @Override
   protected boolean a(aow $$0, E $$1) {
      return this.b($$1);
   }

   @Override
   protected boolean a(aow $$0, E $$1, long $$2) {
      return this.b($$1);
   }

   @Override
   protected void d(aow $$0, E $$1, long $$2) {
      this.e.apply($$1).ifPresent($$1x -> bqc.a($$1, $$1x, this.f, 3));
   }

   @Override
   protected void c(aow $$0, E $$1, long $$2) {
      Optional<bro> $$3 = this.e.apply($$1);
      if (!$$3.isEmpty()) {
         bro $$4 = $$3.get();
         double $$5 = $$4.a().f($$1.br());
         if ($$5 < 3.0) {
            cpd $$6 = $$1.A().a(0, 1);
            if (!$$6.b()) {
               a($$1, $$6, a($$4));
               if ($$1 instanceof cbb $$7) {
                  cbc.a((boi)$$7).ifPresent($$2x -> this.a($$4, $$6, $$2x));
               }

               $$1.dO().a(bxl.aP, 60);
            }
         }
      }
   }

   private void a(bro $$0, cpd $$1, aox $$2) {
      hz $$3 = $$0.b().d();
      am.aa.a($$2, $$3, $$1);
   }

   private boolean b(E $$0) {
      if ($$0.A().aj_()) {
         return false;
      } else {
         Optional<bro> $$1 = this.e.apply($$0);
         return $$1.isPresent();
      }
   }

   private static enz a(bro $$0) {
      return $$0.a().b(0.0, 1.0, 0.0);
   }

   public static void a(boi $$0, cpd $$1, enz $$2) {
      enz $$3 = new enz(0.2F, 0.3F, 0.2F);
      bqc.a($$0, $$1, $$2, $$3, 0.2F);
      cvr $$4 = $$0.dM();
      if ($$4.X() % 7L == 0L && $$4.z.j() < 0.9) {
         float $$5 = ac.<Float>a(cbb.d, $$4.F_());
         $$4.a(null, $$0, atl.g, atm.g, 1.0F, $$5);
      }
   }
}
