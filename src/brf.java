import java.util.Map;
import java.util.Optional;
import java.util.function.Function;

public class brf<E extends box & chl> extends bqp<E> {
   private static final int c = 3;
   private static final int d = 60;
   private final Function<box, Optional<bsd>> e;
   private final float f;

   public brf(Function<box, Optional<bsd>> $$0, float $$1, int $$2) {
      super(Map.of(bya.n, byb.c, bya.m, byb.c, bya.aP, byb.c), $$2);
      this.e = $$0;
      this.f = $$1;
   }

   @Override
   protected boolean a(apa $$0, E $$1) {
      return this.b($$1);
   }

   @Override
   protected boolean a(apa $$0, E $$1, long $$2) {
      return this.b($$1);
   }

   @Override
   protected void d(apa $$0, E $$1, long $$2) {
      this.e.apply($$1).ifPresent($$1x -> bqr.a($$1, $$1x, this.f, 3));
   }

   @Override
   protected void c(apa $$0, E $$1, long $$2) {
      Optional<bsd> $$3 = this.e.apply($$1);
      if (!$$3.isEmpty()) {
         bsd $$4 = $$3.get();
         double $$5 = $$4.a().f($$1.br());
         if ($$5 < 3.0) {
            cpq $$6 = $$1.A().a(0, 1);
            if (!$$6.b()) {
               a($$1, $$6, a($$4));
               if ($$1 instanceof cbq $$7) {
                  cbr.a((box)$$7).ifPresent($$2x -> this.a($$4, $$6, $$2x));
               }

               $$1.dM().a(bya.aP, 60);
            }
         }
      }
   }

   private void a(bsd $$0, cpq $$1, apb $$2) {
      ib $$3 = $$0.b().d();
      am.aa.a($$2, $$3, $$1);
   }

   private boolean b(E $$0) {
      if ($$0.A().aj_()) {
         return false;
      } else {
         Optional<bsd> $$1 = this.e.apply($$0);
         return $$1.isPresent();
      }
   }

   private static eov a(bsd $$0) {
      return $$0.a().b(0.0, 1.0, 0.0);
   }

   public static void a(box $$0, cpq $$1, eov $$2) {
      eov $$3 = new eov(0.2F, 0.3F, 0.2F);
      bqr.a($$0, $$1, $$2, $$3, 0.2F);
      cwe $$4 = $$0.dJ();
      if ($$4.X() % 7L == 0L && $$4.z.j() < 0.9) {
         float $$5 = ac.<Float>a(cbq.d, $$4.F_());
         $$4.a(null, $$0, atp.g, atq.g, 1.0F, $$5);
      }
   }
}
