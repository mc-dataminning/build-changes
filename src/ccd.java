import com.google.common.collect.ImmutableMap;

public class ccd extends byv<cqo> {
   public ccd() {
      super(ImmutableMap.of());
   }

   protected boolean a(arq $$0, cqo $$1, long $$2) {
      return c($$1) || b($$1);
   }

   protected void b(arq $$0, cqo $$1, long $$2) {
      if (c($$1) || b($$1)) {
         bye<?> $$3 = $$1.ec();
         if (!$$3.c(csw.g)) {
            $$3.b(cgg.u);
            $$3.b(cgg.n);
            $$3.b(cgg.o);
            $$3.b(cgg.s);
            $$3.b(cgg.r);
         }

         $$3.a(csw.g);
      }
   }

   protected void c(arq $$0, cqo $$1, long $$2) {
      if ($$2 % 100L == 0L) {
         $$1.a($$0, $$2, 3);
      }
   }

   public static boolean b(bxe $$0) {
      return $$0.ec().a(cgg.B);
   }

   public static boolean c(bxe $$0) {
      return $$0.ec().a(cgg.y);
   }
}
