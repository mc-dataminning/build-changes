import java.util.Map;
import java.util.Optional;
import java.util.function.Function;

public class bxe<E extends buv & cnr> extends bwo<E> {
   private static final int c = 3;
   private static final int d = 60;
   private final Function<buv, Optional<byc>> e;
   private final float f;

   public bxe(Function<buv, Optional<byc>> $$0, float $$1, int $$2) {
      super(Map.of(cdz.n, cea.c, cdz.m, cea.c, cdz.aP, cea.c), $$2);
      this.e = $$0;
      this.f = $$1;
   }

   @Override
   protected boolean a(arm $$0, E $$1) {
      return this.b($$1);
   }

   @Override
   protected boolean a(arm $$0, E $$1, long $$2) {
      return this.b($$1);
   }

   @Override
   protected void d(arm $$0, E $$1, long $$2) {
      this.e.apply($$1).ifPresent($$1x -> bwq.a($$1, $$1x, this.f, 3));
   }

   @Override
   protected void c(arm $$0, E $$1, long $$2) {
      Optional<byc> $$3 = this.e.apply($$1);
      if (!$$3.isEmpty()) {
         byc $$4 = $$3.get();
         double $$5 = $$4.a().f($$1.bG());
         if ($$5 < 3.0) {
            cvx $$6 = $$1.y().a(0, 1);
            if (!$$6.f()) {
               a($$1, $$6, a($$4));
               if ($$1 instanceof chs $$7) {
                  cht.a((buv)$$7).ifPresent($$2x -> this.a($$4, $$6, $$2x));
               }

               $$1.ed().a(cdz.aP, 60);
            }
         }
      }
   }

   private void a(byc $$0, cvx $$1, arn $$2) {
      jg $$3 = $$0.b().e();
      an.aa.a($$2, $$3, $$1);
   }

   private boolean b(E $$0) {
      if ($$0.y().c()) {
         return false;
      } else {
         Optional<byc> $$1 = this.e.apply($$0);
         return $$1.isPresent();
      }
   }

   private static ezh a(byc $$0) {
      return $$0.a().b(0.0, 1.0, 0.0);
   }

   public static void a(buv $$0, cvx $$1, ezh $$2) {
      ezh $$3 = new ezh(0.2F, 0.3F, 0.2F);
      bwq.a($$0, $$1, $$2, $$3, 0.2F);
      dev $$4 = $$0.dX();
      if ($$4.aa() % 7L == 0L && $$4.A.j() < 0.9) {
         float $$5 = ad.<Float>a(chs.d, $$4.E_());
         $$4.a(null, $$0, awk.g, awl.g, 1.0F, $$5);
      }
   }
}
