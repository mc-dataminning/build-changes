import java.util.Map;
import java.util.Optional;
import java.util.function.Function;

public class byh<E extends bvy & cpb> extends bxr<E> {
   private static final int c = 3;
   private static final int d = 60;
   private final Function<bvy, Optional<bzf>> e;
   private final float f;

   public byh(Function<bvy, Optional<bzf>> $$0, float $$1, int $$2) {
      super(Map.of(cfc.n, cfd.c, cfc.m, cfd.c, cfc.aP, cfd.c), $$2);
      this.e = $$0;
      this.f = $$1;
   }

   @Override
   protected boolean a(ard $$0, E $$1) {
      return this.b($$1);
   }

   @Override
   protected boolean a(ard $$0, E $$1, long $$2) {
      return this.b($$1);
   }

   @Override
   protected void d(ard $$0, E $$1, long $$2) {
      this.e.apply($$1).ifPresent($$1x -> bxt.a($$1, $$1x, this.f, 3));
   }

   @Override
   protected void c(ard $$0, E $$1, long $$2) {
      Optional<bzf> $$3 = this.e.apply($$1);
      if (!$$3.isEmpty()) {
         bzf $$4 = $$3.get();
         double $$5 = $$4.a().f($$1.bD());
         if ($$5 < 3.0) {
            cxh $$6 = $$1.n().a(0, 1);
            if (!$$6.f()) {
               a($$1, $$6, a($$4));
               if ($$1 instanceof ciy $$7) {
                  ciz.a((bvy)$$7).ifPresent($$2x -> this.a($$4, $$6, $$2x));
               }

               $$1.ea().a(cfc.aP, 60);
            }
         }
      }
   }

   private void a(bzf $$0, cxh $$1, are $$2) {
      ji $$3 = $$0.b().e();
      ap.aa.a($$2, $$3, $$1);
   }

   private boolean b(E $$0) {
      if ($$0.n().c()) {
         return false;
      } else {
         Optional<bzf> $$1 = this.e.apply($$0);
         return $$1.isPresent();
      }
   }

   private static fbx a(bzf $$0) {
      return $$0.a().b(0.0, 1.0, 0.0);
   }

   public static void a(bvy $$0, cxh $$1, fbx $$2) {
      fbx $$3 = new fbx(0.2F, 0.3F, 0.2F);
      bxt.a($$0, $$1, $$2, $$3, 0.2F);
      dgz $$4 = $$0.dU();
      if ($$4.ae() % 7L == 0L && $$4.A.j() < 0.9) {
         float $$5 = af.<Float>a(ciy.d, $$4.C_());
         $$4.a(null, $$0, awa.g, awb.g, 1.0F, $$5);
      }
   }
}
