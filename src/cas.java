import com.google.common.collect.ImmutableMap;

public class cas<E extends cnp> extends bwt<E> {
   private static final double c = 6.0;
   private static final double d = 20.0;

   public cas(int $$0) {
      super(ImmutableMap.of(cee.aB, cef.a, cee.o, cef.b, cee.m, cef.b, cee.n, cef.c, cee.B, cef.c, cee.az, cef.c, cee.aG, cef.c), $$0);
   }

   protected boolean a(arn $$0, E $$1, long $$2) {
      return true;
   }

   protected void b(arn $$0, E $$1, long $$2) {
      $$1.a(awl.BZ, 5.0F, 1.0F);
   }

   protected void c(arn $$0, E $$1, long $$2) {
      if ($$1.c(bvm.m)) {
         $$1.b(bvm.a);
      }

      $$1.ed().b(cee.aB);
      $$1.ed().c(cee.B).filter($$1::c).ifPresent($$1x -> {
         if ($$1.a($$1x, 6.0, 20.0)) {
            $$1.e($$1x);
         }

         if (!$$1.ed().a(cee.az)) {
            cnq.a($$1, $$1x.dx());
         }
      });
   }
}
