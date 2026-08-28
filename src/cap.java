import com.google.common.collect.ImmutableMap;

public class cap extends bwt<cnp> {
   private static final int c = 25;
   private static final int d = 20;

   public cap() {
      super(ImmutableMap.of(cee.ay, cef.a, cee.o, cef.b, cee.aF, cef.c, cee.aD, cef.c), cnq.b);
   }

   protected void a(arn $$0, cnp $$1, long $$2) {
      bwc<cnp> $$3 = $$1.ed();
      $$3.a(cee.aD, bap.a, 25L);
      $$3.b(cee.m);
      bva $$4 = $$1.ed().c(cee.ay).get();
      bwv.a($$1, $$4);
      $$1.b(bvm.l);
      $$1.a($$4, 20, false);
   }

   protected boolean b(arn $$0, cnp $$1, long $$2) {
      return true;
   }

   protected void c(arn $$0, cnp $$1, long $$2) {
      if (!$$1.ed().a(cee.aD) && !$$1.ed().a(cee.aF)) {
         $$1.ed().a(cee.aF, bap.a, (long)(cnq.b - 25));
         $$1.a(awl.BY, 3.0F, 1.0F);
      }
   }

   protected void d(arn $$0, cnp $$1, long $$2) {
      if ($$1.c(bvm.l)) {
         $$1.b(bvm.a);
      }

      $$1.ed().c(cee.ay).ifPresent($$1::j);
      $$1.ed().b(cee.ay);
   }
}
