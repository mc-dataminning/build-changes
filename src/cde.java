import com.google.common.collect.ImmutableMap;

public class cde extends bzw<cru> {
   public cde() {
      super(ImmutableMap.of());
   }

   protected boolean a(asb $$0, cru $$1, long $$2) {
      return c($$1) || b($$1);
   }

   protected void b(asb $$0, cru $$1, long $$2) {
      if (c($$1) || b($$1)) {
         bzf<?> $$3 = $$1.ec();
         if (!$$3.c(cuc.g)) {
            $$3.b(chh.u);
            $$3.b(chh.n);
            $$3.b(chh.o);
            $$3.b(chh.s);
            $$3.b(chh.r);
         }

         $$3.a(cuc.g);
      }
   }

   protected void c(asb $$0, cru $$1, long $$2) {
      if ($$2 % 100L == 0L) {
         $$1.a($$0, $$2, 3);
      }
   }

   public static boolean b(byf $$0) {
      return $$0.ec().a(chh.B);
   }

   public static boolean c(byf $$0) {
      return $$0.ec().a(chh.y);
   }
}
