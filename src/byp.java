import com.google.common.collect.ImmutableMap;

public class byp extends bvh<cmj> {
   public byp() {
      super(ImmutableMap.of());
   }

   protected boolean a(are $$0, cmj $$1, long $$2) {
      return c($$1) || b($$1);
   }

   protected void b(are $$0, cmj $$1, long $$2) {
      if (c($$1) || b($$1)) {
         buq<?> $$3 = $$1.dS();
         if (!$$3.c(col.g)) {
            $$3.b(ccs.t);
            $$3.b(ccs.m);
            $$3.b(ccs.n);
            $$3.b(ccs.r);
            $$3.b(ccs.q);
         }

         $$3.a(col.g);
      }
   }

   protected void c(are $$0, cmj $$1, long $$2) {
      if ($$2 % 100L == 0L) {
         $$1.a($$0, $$2, 3);
      }
   }

   public static boolean b(bto $$0) {
      return $$0.dS().a(ccs.A);
   }

   public static boolean c(bto $$0) {
      return $$0.dS().a(ccs.x);
   }
}
