import com.google.common.collect.ImmutableMap;

public class can<E extends cnk> extends bwo<E> {
   private static final double c = 6.0;
   private static final double d = 20.0;

   public can(int $$0) {
      super(ImmutableMap.of(cdz.aB, cea.a, cdz.o, cea.b, cdz.m, cea.b, cdz.n, cea.c, cdz.B, cea.c, cdz.az, cea.c, cdz.aG, cea.c), $$0);
   }

   protected boolean a(arm $$0, E $$1, long $$2) {
      return true;
   }

   protected void b(arm $$0, E $$1, long $$2) {
      $$1.a(awk.BZ, 5.0F, 1.0F);
   }

   protected void c(arm $$0, E $$1, long $$2) {
      if ($$1.c(bvh.m)) {
         $$1.b(bvh.a);
      }

      $$1.ed().b(cdz.aB);
      $$1.ed().c(cdz.B).filter($$1::c).ifPresent($$1x -> {
         if ($$1.a($$1x, 6.0, 20.0)) {
            $$1.e($$1x);
         }

         if (!$$1.ed().a(cdz.az)) {
            cnl.a($$1, $$1x.dx());
         }
      });
   }
}
