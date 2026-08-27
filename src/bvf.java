import com.google.common.collect.ImmutableMap;

public class bvf<E extends chw> extends brg<E> {
   private static final double c = 6.0;
   private static final double d = 20.0;

   public bvf(int $$0) {
      super(ImmutableMap.of(byr.aB, bys.a, byr.o, bys.b, byr.m, bys.b, byr.n, bys.c, byr.B, bys.c, byr.az, bys.c, byr.aG, bys.c), $$0);
   }

   protected boolean a(apf $$0, E $$1, long $$2) {
      return true;
   }

   protected void b(apf $$0, E $$1, long $$2) {
      $$1.a(aty.Bq, 5.0F, 1.0F);
   }

   protected void c(apf $$0, E $$1, long $$2) {
      if ($$1.c(bpz.m)) {
         $$1.b(bpz.a);
      }

      $$1.dP().b(byr.aB);
      $$1.dP().c(byr.B).filter($$1::b).ifPresent($$1x -> {
         if ($$1.a($$1x, 6.0, 20.0)) {
            $$1.d($$1x);
         }

         if (!$$1.dP().a(byr.az)) {
            chx.a($$1, $$1x.dm());
         }
      });
   }
}
