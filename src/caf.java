import com.google.common.collect.ImmutableMap;

public class caf extends bwx<coc> {
   public caf() {
      super(ImmutableMap.of());
   }

   protected boolean a(arq $$0, coc $$1, long $$2) {
      return c($$1) || b($$1);
   }

   protected void b(arq $$0, coc $$1, long $$2) {
      if (c($$1) || b($$1)) {
         bwg<?> $$3 = $$1.ee();
         if (!$$3.c(cqi.g)) {
            $$3.b(cei.t);
            $$3.b(cei.m);
            $$3.b(cei.n);
            $$3.b(cei.r);
            $$3.b(cei.q);
         }

         $$3.a(cqi.g);
      }
   }

   protected void c(arq $$0, coc $$1, long $$2) {
      if ($$2 % 100L == 0L) {
         $$1.a($$0, $$2, 3);
      }
   }

   public static boolean b(bve $$0) {
      return $$0.ee().a(cei.A);
   }

   public static boolean c(bve $$0) {
      return $$0.ee().a(cei.x);
   }
}
