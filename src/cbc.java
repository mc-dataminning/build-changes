import com.google.common.collect.ImmutableMap;

public class cbc extends bxu<cpe> {
   public cbc() {
      super(ImmutableMap.of());
   }

   protected boolean a(ash $$0, cpe $$1, long $$2) {
      return c($$1) || b($$1);
   }

   protected void b(ash $$0, cpe $$1, long $$2) {
      if (c($$1) || b($$1)) {
         bxd<?> $$3 = $$1.eb();
         if (!$$3.c(crj.g)) {
            $$3.b(cff.t);
            $$3.b(cff.m);
            $$3.b(cff.n);
            $$3.b(cff.r);
            $$3.b(cff.q);
         }

         $$3.a(crj.g);
      }
   }

   protected void c(ash $$0, cpe $$1, long $$2) {
      if ($$2 % 100L == 0L) {
         $$1.a($$0, $$2, 3);
      }
   }

   public static boolean b(bwb $$0) {
      return $$0.eb().a(cff.A);
   }

   public static boolean c(bwb $$0) {
      return $$0.eb().a(cff.x);
   }
}
