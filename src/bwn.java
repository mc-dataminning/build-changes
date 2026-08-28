import java.util.Map;
import java.util.Optional;
import java.util.function.Function;

public class bwn<E extends buf & cna> extends bvx<E> {
   private static final int c = 3;
   private static final int d = 60;
   private final Function<buf, Optional<bxl>> e;
   private final float f;

   public bwn(Function<buf, Optional<bxl>> $$0, float $$1, int $$2) {
      super(Map.of(cdi.n, cdj.c, cdi.m, cdj.c, cdi.aP, cdj.c), $$2);
      this.e = $$0;
      this.f = $$1;
   }

   @Override
   protected boolean a(arg $$0, E $$1) {
      return this.b($$1);
   }

   @Override
   protected boolean a(arg $$0, E $$1, long $$2) {
      return this.b($$1);
   }

   @Override
   protected void d(arg $$0, E $$1, long $$2) {
      this.e.apply($$1).ifPresent($$1x -> bvz.a($$1, $$1x, this.f, 3));
   }

   @Override
   protected void c(arg $$0, E $$1, long $$2) {
      Optional<bxl> $$3 = this.e.apply($$1);
      if (!$$3.isEmpty()) {
         bxl $$4 = $$3.get();
         double $$5 = $$4.a().f($$1.bC());
         if ($$5 < 3.0) {
            cvl $$6 = $$1.y().a(0, 1);
            if (!$$6.f()) {
               a($$1, $$6, a($$4));
               if ($$1 instanceof chb $$7) {
                  chc.a((buf)$$7).ifPresent($$2x -> this.a($$4, $$6, $$2x));
               }

               $$1.dX().a(cdi.aP, 60);
            }
         }
      }
   }

   private void a(bxl $$0, cvl $$1, arh $$2) {
      je $$3 = $$0.b().e();
      an.aa.a($$2, $$3, $$1);
   }

   private boolean b(E $$0) {
      if ($$0.y().c()) {
         return false;
      } else {
         Optional<bxl> $$1 = this.e.apply($$0);
         return $$1.isPresent();
      }
   }

   private static eye a(bxl $$0) {
      return $$0.a().b(0.0, 1.0, 0.0);
   }

   public static void a(buf $$0, cvl $$1, eye $$2) {
      eye $$3 = new eye(0.2F, 0.3F, 0.2F);
      bvz.a($$0, $$1, $$2, $$3, 0.2F);
      dds $$4 = $$0.dS();
      if ($$4.aa() % 7L == 0L && $$4.z.j() < 0.9) {
         float $$5 = ad.<Float>a(chb.d, $$4.C_());
         $$4.a(null, $$0, awd.g, awe.g, 1.0F, $$5);
      }
   }
}
