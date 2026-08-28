import com.google.common.collect.ImmutableMap;

public class cct extends bzl<crj> {
   public cct() {
      super(ImmutableMap.of());
   }

   protected boolean a(ars $$0, crj $$1, long $$2) {
      return c($$1) || b($$1);
   }

   protected void b(ars $$0, crj $$1, long $$2) {
      if (c($$1) || b($$1)) {
         byu<?> $$3 = $$1.ec();
         if (!$$3.c(ctr.g)) {
            $$3.b(cgw.u);
            $$3.b(cgw.n);
            $$3.b(cgw.o);
            $$3.b(cgw.s);
            $$3.b(cgw.r);
         }

         $$3.a(ctr.g);
      }
   }

   protected void c(ars $$0, crj $$1, long $$2) {
      if ($$2 % 100L == 0L) {
         $$1.a($$0, $$2, 3);
      }
   }

   public static boolean b(bxu $$0) {
      return $$0.ec().a(cgw.B);
   }

   public static boolean c(bxu $$0) {
      return $$0.ec().a(cgw.y);
   }
}
