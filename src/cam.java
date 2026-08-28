import java.util.Map;
import java.util.Optional;
import java.util.function.Function;

public class cam<E extends byf & crs> extends bzw<E> {
   private static final int c = 3;
   private static final int d = 60;
   private final Function<byf, Optional<cbk>> e;
   private final float f;

   public cam(Function<byf, Optional<cbk>> $$0, float $$1, int $$2) {
      super(Map.of(chh.o, chi.c, chh.n, chi.c, chh.aQ, chi.c), $$2);
      this.e = $$0;
      this.f = $$1;
   }

   @Override
   protected boolean a(asb $$0, E $$1) {
      return this.b($$1);
   }

   @Override
   protected boolean a(asb $$0, E $$1, long $$2) {
      return this.b($$1);
   }

   @Override
   protected void d(asb $$0, E $$1, long $$2) {
      this.e.apply($$1).ifPresent($$1x -> bzy.a($$1, $$1x, this.f, 3));
   }

   @Override
   protected void c(asb $$0, E $$1, long $$2) {
      Optional<cbk> $$3 = this.e.apply($$1);
      if (!$$3.isEmpty()) {
         cbk $$4 = $$3.get();
         double $$5 = $$4.a().f($$1.bD());
         if ($$5 < 3.0) {
            dak $$6 = $$1.u().a(0, 1);
            if (!$$6.f()) {
               a($$1, $$6, a($$4));
               if ($$1 instanceof cle $$7) {
                  clf.a((byf)$$7).ifPresent($$2x -> this.a($$4, $$6, $$2x));
               }

               $$1.ec().a(chh.aQ, 60);
            }
         }
      }
   }

   private void a(cbk $$0, dak $$1, asc $$2) {
      iw $$3 = $$0.b().e();
      aq.aa.a($$2, $$3, $$1);
   }

   private boolean b(E $$0) {
      if ($$0.u().c()) {
         return false;
      } else {
         Optional<cbk> $$1 = this.e.apply($$0);
         return $$1.isPresent();
      }
   }

   private static fgc a(cbk $$0) {
      return $$0.a().b(0.0, 1.0, 0.0);
   }

   public static void a(byf $$0, dak $$1, fgc $$2) {
      fgc $$3 = new fgc(0.2F, 0.3F, 0.2F);
      bzy.a($$0, $$1, $$2, $$3, 0.2F);
      dkj $$4 = $$0.dV();
      if ($$4.ae() % 7L == 0L && $$4.A.j() < 0.9) {
         float $$5 = ag.<Float>a(cle.d, $$4.G_());
         $$4.a(null, $$0, awy.g, awz.g, 1.0F, $$5);
      }
   }
}
