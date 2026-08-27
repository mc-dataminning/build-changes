import com.google.common.collect.ImmutableMap;

public class bvg<E extends chy> extends brh<E> {
   private static final double c = 6.0;
   private static final double d = 20.0;

   public bvg(int $$0) {
      super(ImmutableMap.of(bys.aB, byt.a, bys.o, byt.b, bys.m, byt.b, bys.n, byt.c, bys.B, byt.c, bys.az, byt.c, bys.aG, byt.c), $$0);
   }

   protected boolean a(apf $$0, E $$1, long $$2) {
      return true;
   }

   protected void b(apf $$0, E $$1, long $$2) {
      $$1.a(aty.Bv, 5.0F, 1.0F);
   }

   protected void c(apf $$0, E $$1, long $$2) {
      if ($$1.c(bqa.m)) {
         $$1.b(bqa.a);
      }

      $$1.dP().b(bys.aB);
      $$1.dP().c(bys.B).filter($$1::b).ifPresent($$1x -> {
         if ($$1.a($$1x, 6.0, 20.0)) {
            $$1.d($$1x);
         }

         if (!$$1.dP().a(bys.az)) {
            chz.a($$1, $$1x.dm());
         }
      });
   }
}
