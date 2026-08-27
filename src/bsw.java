import java.util.Map;
import java.util.Optional;
import java.util.function.Function;

public class bsw<E extends bqo & cje> extends bsg<E> {
   private static final int c = 3;
   private static final int d = 60;
   private final Function<bqo, Optional<btu>> e;
   private final float f;

   public bsw(Function<bqo, Optional<btu>> $$0, float $$1, int $$2) {
      super(Map.of(bzr.n, bzs.c, bzr.m, bzs.c, bzr.aP, bzs.c), $$2);
      this.e = $$0;
      this.f = $$1;
   }

   @Override
   protected boolean a(aps $$0, E $$1) {
      return this.b($$1);
   }

   @Override
   protected boolean a(aps $$0, E $$1, long $$2) {
      return this.b($$1);
   }

   @Override
   protected void d(aps $$0, E $$1, long $$2) {
      this.e.apply($$1).ifPresent($$1x -> bsi.a($$1, $$1x, this.f, 3));
   }

   @Override
   protected void c(aps $$0, E $$1, long $$2) {
      Optional<btu> $$3 = this.e.apply($$1);
      if (!$$3.isEmpty()) {
         btu $$4 = $$3.get();
         double $$5 = $$4.a().f($$1.bu());
         if ($$5 < 3.0) {
            crj $$6 = $$1.y().a(0, 1);
            if (!$$6.d()) {
               a($$1, $$6, a($$4));
               if ($$1 instanceof cdh $$7) {
                  cdi.a((bqo)$$7).ifPresent($$2x -> this.a($$4, $$6, $$2x));
               }

               $$1.dP().a(bzr.aP, 60);
            }
         }
      }
   }

   private void a(btu $$0, crj $$1, apt $$2) {
      ib $$3 = $$0.b().d();
      am.aa.a($$2, $$3, $$1);
   }

   private boolean b(E $$0) {
      if ($$0.y().ah_()) {
         return false;
      } else {
         Optional<btu> $$1 = this.e.apply($$0);
         return $$1.isPresent();
      }
   }

   private static esa a(btu $$0) {
      return $$0.a().b(0.0, 1.0, 0.0);
   }

   public static void a(bqo $$0, crj $$1, esa $$2) {
      esa $$3 = new esa(0.2F, 0.3F, 0.2F);
      bsi.a($$0, $$1, $$2, $$3, 0.2F);
      cyx $$4 = $$0.dM();
      if ($$4.Y() % 7L == 0L && $$4.z.j() < 0.9) {
         float $$5 = ac.<Float>a(cdh.d, $$4.E_());
         $$4.a(null, $$0, aum.g, aun.g, 1.0F, $$5);
      }
   }
}
