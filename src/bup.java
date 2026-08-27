import com.google.common.collect.ImmutableMap;

public class bup extends brh<cih> {
   public bup() {
      super(ImmutableMap.of());
   }

   protected boolean a(apf $$0, cih $$1, long $$2) {
      return c($$1) || b($$1);
   }

   protected void b(apf $$0, cih $$1, long $$2) {
      if (c($$1) || b($$1)) {
         bqq<?> $$3 = $$1.dP();
         if (!$$3.c(ckj.g)) {
            $$3.b(bys.t);
            $$3.b(bys.m);
            $$3.b(bys.n);
            $$3.b(bys.r);
            $$3.b(bys.q);
         }

         $$3.a(ckj.g);
      }
   }

   protected void c(apf $$0, cih $$1, long $$2) {
      if ($$2 % 100L == 0L) {
         $$1.a($$0, $$2, 3);
      }
   }

   public static boolean b(bpp $$0) {
      return $$0.dP().a(bys.A);
   }

   public static boolean c(bpp $$0) {
      return $$0.dP().a(bys.x);
   }
}
