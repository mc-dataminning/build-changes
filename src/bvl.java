import java.util.Map;
import java.util.Optional;
import java.util.function.Function;

public class bvl<E extends btc & clw> extends buv<E> {
   private static final int c = 3;
   private static final int d = 60;
   private final Function<btc, Optional<bwj>> e;
   private final float f;

   public bvl(Function<btc, Optional<bwj>> $$0, float $$1, int $$2) {
      super(Map.of(ccg.n, cch.c, ccg.m, cch.c, ccg.aP, cch.c), $$2);
      this.e = $$0;
      this.f = $$1;
   }

   @Override
   protected boolean a(aqm $$0, E $$1) {
      return this.b($$1);
   }

   @Override
   protected boolean a(aqm $$0, E $$1, long $$2) {
      return this.b($$1);
   }

   @Override
   protected void d(aqm $$0, E $$1, long $$2) {
      this.e.apply($$1).ifPresent($$1x -> bux.a($$1, $$1x, this.f, 3));
   }

   @Override
   protected void c(aqm $$0, E $$1, long $$2) {
      Optional<bwj> $$3 = this.e.apply($$1);
      if (!$$3.isEmpty()) {
         bwj $$4 = $$3.get();
         double $$5 = $$4.a().f($$1.bz());
         if ($$5 < 3.0) {
            cud $$6 = $$1.x().a(0, 1);
            if (!$$6.e()) {
               a($$1, $$6, a($$4));
               if ($$1 instanceof cfy $$7) {
                  cfz.a((btc)$$7).ifPresent($$2x -> this.a($$4, $$6, $$2x));
               }

               $$1.dV().a(ccg.aP, 60);
            }
         }
      }
   }

   private void a(bwj $$0, cud $$1, aqn $$2) {
      ja $$3 = $$0.b().d();
      am.aa.a($$2, $$3, $$1);
   }

   private boolean b(E $$0) {
      if ($$0.x().c()) {
         return false;
      } else {
         Optional<bwj> $$1 = this.e.apply($$0);
         return $$1.isPresent();
      }
   }

   private static ewh a(bwj $$0) {
      return $$0.a().b(0.0, 1.0, 0.0);
   }

   public static void a(btc $$0, cud $$1, ewh $$2) {
      ewh $$3 = new ewh(0.2F, 0.3F, 0.2F);
      bux.a($$0, $$1, $$2, $$3, 0.2F);
      dcg $$4 = $$0.dR();
      if ($$4.Z() % 7L == 0L && $$4.z.j() < 0.9) {
         float $$5 = ac.<Float>a(cfy.d, $$4.E_());
         $$4.a(null, $$0, avh.g, avi.g, 1.0F, $$5);
      }
   }
}
