import java.util.Map;
import java.util.Optional;
import java.util.function.Function;

public class bov<E extends bmo & cfb> extends bof<E> {
   private static final int c = 3;
   private static final int d = 60;
   private final Function<bmo, Optional<bpt>> e;
   private final float f;

   public bov(Function<bmo, Optional<bpt>> $$0, float $$1, int $$2) {
      super(Map.of(bvq.n, bvr.c, bvq.m, bvr.c, bvq.aP, bvr.c), $$2);
      this.e = $$0;
      this.f = $$1;
   }

   @Override
   protected boolean a(ane $$0, E $$1) {
      return this.b($$1);
   }

   @Override
   protected boolean a(ane $$0, E $$1, long $$2) {
      return this.b($$1);
   }

   @Override
   protected void d(ane $$0, E $$1, long $$2) {
      this.e.apply($$1).ifPresent($$1x -> boh.a($$1, $$1x, this.f, 3));
   }

   @Override
   protected void c(ane $$0, E $$1, long $$2) {
      Optional<bpt> $$3 = this.e.apply($$1);
      if (!$$3.isEmpty()) {
         bpt $$4 = $$3.get();
         double $$5 = $$4.a().f($$1.br());
         if ($$5 < 3.0) {
            cng $$6 = $$1.A().a(0, 1);
            if (!$$6.b()) {
               a($$1, $$6, a($$4));
               if ($$1 instanceof bzg $$7) {
                  bzh.a((bmo)$$7).ifPresent($$2x -> this.a($$4, $$6, $$2x));
               }

               $$1.dN().a(bvq.aP, 60);
            }
         }
      }
   }

   private void a(bpt $$0, cng $$1, anf $$2) {
      hx $$3 = $$0.b().d();
      am.Y.a($$2, $$3, $$1);
   }

   private boolean b(E $$0) {
      if ($$0.A().aj_()) {
         return false;
      } else {
         Optional<bpt> $$1 = this.e.apply($$0);
         return $$1.isPresent();
      }
   }

   private static emc a(bpt $$0) {
      return $$0.a().b(0.0, 1.0, 0.0);
   }

   public static void a(bmo $$0, cng $$1, emc $$2) {
      emc $$3 = new emc(0.2F, 0.3F, 0.2F);
      boh.a($$0, $$1, $$2, $$3, 0.2F);
      ctx $$4 = $$0.dL();
      if ($$4.X() % 7L == 0L && $$4.z.j() < 0.9) {
         float $$5 = ac.<Float>a(bzg.d, $$4.F_());
         $$4.a(null, $$0, art.g, aru.g, 1.0F, $$5);
      }
   }
}
