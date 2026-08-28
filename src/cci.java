import com.google.common.collect.ImmutableMap;

public class cci extends bza<cqv> {
   public cci() {
      super(ImmutableMap.of());
   }

   protected boolean a(arq $$0, cqv $$1, long $$2) {
      return c($$1) || b($$1);
   }

   protected void b(arq $$0, cqv $$1, long $$2) {
      if (c($$1) || b($$1)) {
         byj<?> $$3 = $$1.eb();
         if (!$$3.c(ctd.g)) {
            $$3.b(cgl.u);
            $$3.b(cgl.n);
            $$3.b(cgl.o);
            $$3.b(cgl.s);
            $$3.b(cgl.r);
         }

         $$3.a(ctd.g);
      }
   }

   protected void c(arq $$0, cqv $$1, long $$2) {
      if ($$2 % 100L == 0L) {
         $$1.a($$0, $$2, 3);
      }
   }

   public static boolean b(bxj $$0) {
      return $$0.eb().a(cgl.B);
   }

   public static boolean c(bxj $$0) {
      return $$0.eb().a(cgl.y);
   }
}
