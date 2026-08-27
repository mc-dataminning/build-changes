import com.google.common.collect.ImmutableMap;

public class bti extends bqa<cgy> {
   public bti() {
      super(ImmutableMap.of());
   }

   protected boolean a(aow $$0, cgy $$1, long $$2) {
      return c($$1) || b($$1);
   }

   protected void b(aow $$0, cgy $$1, long $$2) {
      if (c($$1) || b($$1)) {
         bpj<?> $$3 = $$1.dO();
         if (!$$3.c(ciy.g)) {
            $$3.b(bxl.t);
            $$3.b(bxl.m);
            $$3.b(bxl.n);
            $$3.b(bxl.r);
            $$3.b(bxl.q);
         }

         $$3.a(ciy.g);
      }
   }

   protected void c(aow $$0, cgy $$1, long $$2) {
      if ($$2 % 100L == 0L) {
         $$1.a($$0, $$2, 3);
      }
   }

   public static boolean b(boi $$0) {
      return $$0.dO().a(bxl.A);
   }

   public static boolean c(boi $$0) {
      return $$0.dO().a(bxl.x);
   }
}
