import com.google.common.collect.ImmutableMap;

public class cbq extends byi<cpu> {
   public cbq() {
      super(ImmutableMap.of());
   }

   protected boolean a(arn $$0, cpu $$1, long $$2) {
      return c($$1) || b($$1);
   }

   protected void b(arn $$0, cpu $$1, long $$2) {
      if (c($$1) || b($$1)) {
         bxr<?> $$3 = $$1.eb();
         if (!$$3.c(crz.g)) {
            $$3.b(cft.u);
            $$3.b(cft.n);
            $$3.b(cft.o);
            $$3.b(cft.s);
            $$3.b(cft.r);
         }

         $$3.a(crz.g);
      }
   }

   protected void c(arn $$0, cpu $$1, long $$2) {
      if ($$2 % 100L == 0L) {
         $$1.a($$0, $$2, 3);
      }
   }

   public static boolean b(bwr $$0) {
      return $$0.eb().a(cft.B);
   }

   public static boolean c(bwr $$0) {
      return $$0.eb().a(cft.y);
   }
}
