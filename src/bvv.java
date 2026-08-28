import java.util.Map;
import java.util.Optional;
import java.util.function.Function;

public class bvv<E extends btl & cmg> extends bvf<E> {
   private static final int c = 3;
   private static final int d = 60;
   private final Function<btl, Optional<bwt>> e;
   private final float f;

   public bvv(Function<btl, Optional<bwt>> $$0, float $$1, int $$2) {
      super(Map.of(ccq.n, ccr.c, ccq.m, ccr.c, ccq.aP, ccr.c), $$2);
      this.e = $$0;
      this.f = $$1;
   }

   @Override
   protected boolean a(aqt $$0, E $$1) {
      return this.b($$1);
   }

   @Override
   protected boolean a(aqt $$0, E $$1, long $$2) {
      return this.b($$1);
   }

   @Override
   protected void d(aqt $$0, E $$1, long $$2) {
      this.e.apply($$1).ifPresent($$1x -> bvh.a($$1, $$1x, this.f, 3));
   }

   @Override
   protected void c(aqt $$0, E $$1, long $$2) {
      Optional<bwt> $$3 = this.e.apply($$1);
      if (!$$3.isEmpty()) {
         bwt $$4 = $$3.get();
         double $$5 = $$4.a().f($$1.by());
         if ($$5 < 3.0) {
            cuo $$6 = $$1.x().a(0, 1);
            if (!$$6.e()) {
               a($$1, $$6, a($$4));
               if ($$1 instanceof cgi $$7) {
                  cgj.a((btl)$$7).ifPresent($$2x -> this.a($$4, $$6, $$2x));
               }

               $$1.dU().a(ccq.aP, 60);
            }
         }
      }
   }

   private void a(bwt $$0, cuo $$1, aqu $$2) {
      jd $$3 = $$0.b().d();
      an.aa.a($$2, $$3, $$1);
   }

   private boolean b(E $$0) {
      if ($$0.x().c()) {
         return false;
      } else {
         Optional<bwt> $$1 = this.e.apply($$0);
         return $$1.isPresent();
      }
   }

   private static eww a(bwt $$0) {
      return $$0.a().b(0.0, 1.0, 0.0);
   }

   public static void a(btl $$0, cuo $$1, eww $$2) {
      eww $$3 = new eww(0.2F, 0.3F, 0.2F);
      bvh.a($$0, $$1, $$2, $$3, 0.2F);
      dcu $$4 = $$0.dQ();
      if ($$4.Z() % 7L == 0L && $$4.z.j() < 0.9) {
         float $$5 = ad.<Float>a(cgi.d, $$4.E_());
         $$4.a(null, $$0, avo.g, avp.g, 1.0F, $$5);
      }
   }
}
