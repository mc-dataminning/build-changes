import com.google.common.collect.ImmutableMap;

public class bzw<E extends cmt> extends bvx<E> {
   private static final double c = 6.0;
   private static final double d = 20.0;

   public bzw(int $$0) {
      super(ImmutableMap.of(cdi.aB, cdj.a, cdi.o, cdj.b, cdi.m, cdj.b, cdi.n, cdj.c, cdi.B, cdj.c, cdi.az, cdj.c, cdi.aG, cdj.c), $$0);
   }

   protected boolean a(arg $$0, E $$1, long $$2) {
      return true;
   }

   protected void b(arg $$0, E $$1, long $$2) {
      $$1.a(awd.Cb, 5.0F, 1.0F);
   }

   protected void c(arg $$0, E $$1, long $$2) {
      if ($$1.c(bur.m)) {
         $$1.b(bur.a);
      }

      $$1.dX().b(cdi.aB);
      $$1.dX().c(cdi.B).filter($$1::c).ifPresent($$1x -> {
         if ($$1.a($$1x, 6.0, 20.0)) {
            $$1.e($$1x);
         }

         if (!$$1.dX().a(cdi.az)) {
            cmu.a($$1, $$1x.ds());
         }
      });
   }
}
