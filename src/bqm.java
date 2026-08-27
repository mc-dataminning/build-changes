import java.util.Map;
import java.util.Optional;
import java.util.function.Function;

public class bqm<E extends bog & cgs> extends bpw<E> {
   private static final int c = 3;
   private static final int d = 60;
   private final Function<bog, Optional<brk>> e;
   private final float f;

   public bqm(Function<bog, Optional<brk>> $$0, float $$1, int $$2) {
      super(Map.of(bxh.n, bxi.c, bxh.m, bxi.c, bxh.aP, bxi.c), $$2);
      this.e = $$0;
      this.f = $$1;
   }

   @Override
   protected boolean a(aov $$0, E $$1) {
      return this.b($$1);
   }

   @Override
   protected boolean a(aov $$0, E $$1, long $$2) {
      return this.b($$1);
   }

   @Override
   protected void d(aov $$0, E $$1, long $$2) {
      this.e.apply($$1).ifPresent($$1x -> bpy.a($$1, $$1x, this.f, 3));
   }

   @Override
   protected void c(aov $$0, E $$1, long $$2) {
      Optional<brk> $$3 = this.e.apply($$1);
      if (!$$3.isEmpty()) {
         brk $$4 = $$3.get();
         double $$5 = $$4.a().f($$1.br());
         if ($$5 < 3.0) {
            coz $$6 = $$1.A().a(0, 1);
            if (!$$6.b()) {
               a($$1, $$6, a($$4));
               if ($$1 instanceof cax $$7) {
                  cay.a((bog)$$7).ifPresent($$2x -> this.a($$4, $$6, $$2x));
               }

               $$1.dO().a(bxh.aP, 60);
            }
         }
      }
   }

   private void a(brk $$0, coz $$1, aow $$2) {
      hz $$3 = $$0.b().d();
      am.aa.a($$2, $$3, $$1);
   }

   private boolean b(E $$0) {
      if ($$0.A().aj_()) {
         return false;
      } else {
         Optional<brk> $$1 = this.e.apply($$0);
         return $$1.isPresent();
      }
   }

   private static ens a(brk $$0) {
      return $$0.a().b(0.0, 1.0, 0.0);
   }

   public static void a(bog $$0, coz $$1, ens $$2) {
      ens $$3 = new ens(0.2F, 0.3F, 0.2F);
      bpy.a($$0, $$1, $$2, $$3, 0.2F);
      cvn $$4 = $$0.dM();
      if ($$4.X() % 7L == 0L && $$4.z.j() < 0.9) {
         float $$5 = ac.<Float>a(cax.d, $$4.F_());
         $$4.a(null, $$0, atk.g, atl.g, 1.0F, $$5);
      }
   }
}
