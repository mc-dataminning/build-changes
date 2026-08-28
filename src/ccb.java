import com.google.common.collect.ImmutableMap;

public class ccb extends byt<cqk> {
   public ccb() {
      super(ImmutableMap.of());
   }

   protected boolean a(arq $$0, cqk $$1, long $$2) {
      return c($$1) || b($$1);
   }

   protected void b(arq $$0, cqk $$1, long $$2) {
      if (c($$1) || b($$1)) {
         byc<?> $$3 = $$1.eb();
         if (!$$3.c(csr.g)) {
            $$3.b(cge.u);
            $$3.b(cge.n);
            $$3.b(cge.o);
            $$3.b(cge.s);
            $$3.b(cge.r);
         }

         $$3.a(csr.g);
      }
   }

   protected void c(arq $$0, cqk $$1, long $$2) {
      if ($$2 % 100L == 0L) {
         $$1.a($$0, $$2, 3);
      }
   }

   public static boolean b(bxc $$0) {
      return $$0.eb().a(cge.B);
   }

   public static boolean c(bxc $$0) {
      return $$0.eb().a(cge.y);
   }
}
