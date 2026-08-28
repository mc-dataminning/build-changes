import java.util.Map;
import java.util.Optional;
import java.util.function.Function;

public class bzg<E extends bwz & cqc> extends byq<E> {
   private static final int c = 3;
   private static final int d = 60;
   private final Function<bwz, Optional<cae>> e;
   private final float f;

   public bzg(Function<bwz, Optional<cae>> $$0, float $$1, int $$2) {
      super(Map.of(cgb.o, cgc.c, cgb.n, cgc.c, cgb.aQ, cgc.c), $$2);
      this.e = $$0;
      this.f = $$1;
   }

   @Override
   protected boolean a(aro $$0, E $$1) {
      return this.b($$1);
   }

   @Override
   protected boolean a(aro $$0, E $$1, long $$2) {
      return this.b($$1);
   }

   @Override
   protected void d(aro $$0, E $$1, long $$2) {
      this.e.apply($$1).ifPresent($$1x -> bys.a($$1, $$1x, this.f, 3));
   }

   @Override
   protected void c(aro $$0, E $$1, long $$2) {
      Optional<cae> $$3 = this.e.apply($$1);
      if (!$$3.isEmpty()) {
         cae $$4 = $$3.get();
         double $$5 = $$4.a().f($$1.bE());
         if ($$5 < 3.0) {
            cys $$6 = $$1.n().a(0, 1);
            if (!$$6.f()) {
               a($$1, $$6, a($$4));
               if ($$1 instanceof cjx $$7) {
                  cjy.a((bwz)$$7).ifPresent($$2x -> this.a($$4, $$6, $$2x));
               }

               $$1.eb().a(cgb.aQ, 60);
            }
         }
      }
   }

   private void a(cae $$0, cys $$1, arp $$2) {
      iu $$3 = $$0.b().e();
      ap.aa.a($$2, $$3, $$1);
   }

   private boolean b(E $$0) {
      if ($$0.n().c()) {
         return false;
      } else {
         Optional<cae> $$1 = this.e.apply($$0);
         return $$1.isPresent();
      }
   }

   private static fdw a(cae $$0) {
      return $$0.a().b(0.0, 1.0, 0.0);
   }

   public static void a(bwz $$0, cys $$1, fdw $$2) {
      fdw $$3 = new fdw(0.2F, 0.3F, 0.2F);
      bys.a($$0, $$1, $$2, $$3, 0.2F);
      dip $$4 = $$0.dV();
      if ($$4.ae() % 7L == 0L && $$4.A.j() < 0.9) {
         float $$5 = af.<Float>a(cjx.d, $$4.C_());
         $$4.a(null, $$0, awl.g, awm.g, 1.0F, $$5);
      }
   }
}
