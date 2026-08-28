import java.util.Map;
import java.util.Optional;
import java.util.function.Function;

public class bzq<E extends bxj & cqw> extends bza<E> {
   private static final int c = 3;
   private static final int d = 60;
   private final Function<bxj, Optional<cao>> e;
   private final float f;

   public bzq(Function<bxj, Optional<cao>> $$0, float $$1, int $$2) {
      super(Map.of(cgl.o, cgm.c, cgl.n, cgm.c, cgl.aQ, cgm.c), $$2);
      this.e = $$0;
      this.f = $$1;
   }

   @Override
   protected boolean a(arq $$0, E $$1) {
      return this.b($$1);
   }

   @Override
   protected boolean a(arq $$0, E $$1, long $$2) {
      return this.b($$1);
   }

   @Override
   protected void d(arq $$0, E $$1, long $$2) {
      this.e.apply($$1).ifPresent($$1x -> bzc.a($$1, $$1x, this.f, 3));
   }

   @Override
   protected void c(arq $$0, E $$1, long $$2) {
      Optional<cao> $$3 = this.e.apply($$1);
      if (!$$3.isEmpty()) {
         cao $$4 = $$3.get();
         double $$5 = $$4.a().f($$1.bC());
         if ($$5 < 3.0) {
            czn $$6 = $$1.n().a(0, 1);
            if (!$$6.f()) {
               a($$1, $$6, a($$4));
               if ($$1 instanceof cki $$7) {
                  ckj.a((bxj)$$7).ifPresent($$2x -> this.a($$4, $$6, $$2x));
               }

               $$1.eb().a(cgl.aQ, 60);
            }
         }
      }
   }

   private void a(cao $$0, czn $$1, arr $$2) {
      iv $$3 = $$0.b().e();
      aq.aa.a($$2, $$3, $$1);
   }

   private boolean b(E $$0) {
      if ($$0.n().c()) {
         return false;
      } else {
         Optional<cao> $$1 = this.e.apply($$0);
         return $$1.isPresent();
      }
   }

   private static ffc a(cao $$0) {
      return $$0.a().b(0.0, 1.0, 0.0);
   }

   public static void a(bxj $$0, czn $$1, ffc $$2) {
      ffc $$3 = new ffc(0.2F, 0.3F, 0.2F);
      bzc.a($$0, $$1, $$2, $$3, 0.2F);
      djm $$4 = $$0.dU();
      if ($$4.ae() % 7L == 0L && $$4.A.j() < 0.9) {
         float $$5 = ag.<Float>a(cki.d, $$4.C_());
         $$4.a(null, $$0, awn.g, awo.g, 1.0F, $$5);
      }
   }
}
