import com.google.common.collect.ImmutableMap;

public class bph extends bma<cck> {
   public bph() {
      super(ImmutableMap.of());
   }

   protected boolean a(alq $$0, cck $$1, long $$2) {
      return c($$1) || b($$1);
   }

   protected void b(alq $$0, cck $$1, long $$2) {
      if (c($$1) || b($$1)) {
         blj<?> $$3 = $$1.dN();
         if (!$$3.c(cei.g)) {
            $$3.b(btk.t);
            $$3.b(btk.m);
            $$3.b(btk.n);
            $$3.b(btk.r);
            $$3.b(btk.q);
         }

         $$3.a(cei.g);
      }
   }

   protected void c(alq $$0, cck $$1, long $$2) {
      if ($$2 % 100L == 0L) {
         $$1.a($$0, $$2, 3);
      }
   }

   public static boolean b(bkj $$0) {
      return $$0.dN().a(btk.A);
   }

   public static boolean c(bkj $$0) {
      return $$0.dN().a(btk.x);
   }
}
