import java.util.Map;
import java.util.Optional;
import java.util.function.Function;

public class bnn<E extends blg & cdf> extends bmx<E> {
   private static final int c = 3;
   private static final int d = 60;
   private final Function<blg, Optional<bok>> e;
   private final float f;

   public bnn(Function<blg, Optional<bok>> $$0, float $$1, int $$2) {
      super(Map.of(buh.n, bui.c, buh.m, bui.c, buh.aO, bui.c), $$2);
      this.e = $$0;
      this.f = $$1;
   }

   @Override
   protected boolean a(ame $$0, E $$1) {
      return this.b($$1);
   }

   @Override
   protected boolean a(ame $$0, E $$1, long $$2) {
      return this.b($$1);
   }

   @Override
   protected void d(ame $$0, E $$1, long $$2) {
      this.e.apply($$1).ifPresent($$1x -> bmz.a($$1, $$1x, this.f, 3));
   }

   @Override
   protected void c(ame $$0, E $$1, long $$2) {
      Optional<bok> $$3 = this.e.apply($$1);
      if (!$$3.isEmpty()) {
         bok $$4 = $$3.get();
         double $$5 = $$4.a().f($$1.br());
         if ($$5 < 3.0) {
            clj $$6 = $$1.A().a(0, 1);
            if (!$$6.b()) {
               a($$1, $$6, a($$4));
               if ($$1 instanceof bxv $$7) {
                  bxw.a((blg)$$7).ifPresent($$2x -> this.a($$4, $$6, $$2x));
               }

               $$1.dP().a(buh.aO, 60);
            }
         }
      }
   }

   private void a(bok $$0, clj $$1, amf $$2) {
      ht $$3 = $$0.b().d();
      al.X.a($$2, $$3, $$1);
   }

   private boolean b(E $$0) {
      if ($$0.A().ai_()) {
         return false;
      } else {
         Optional<bok> $$1 = this.e.apply($$0);
         return $$1.isPresent();
      }
   }

   private static eju a(bok $$0) {
      return $$0.a().b(0.0, 1.0, 0.0);
   }

   public static void a(blg $$0, clj $$1, eju $$2) {
      eju $$3 = new eju(0.2F, 0.3F, 0.2F);
      bmz.a($$0, $$1, $$2, $$3, 0.2F);
      csa $$4 = $$0.dN();
      if ($$4.W() % 7L == 0L && $$4.z.j() < 0.9) {
         float $$5 = ac.<Float>a(bxv.d, $$4.E_());
         $$4.a(null, $$0, aqr.g, aqs.g, 1.0F, $$5);
      }
   }
}
