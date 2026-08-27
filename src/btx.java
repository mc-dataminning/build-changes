import com.google.common.collect.ImmutableMap;

public class btx extends bqp<chn> {
   public btx() {
      super(ImmutableMap.of());
   }

   protected boolean a(apa $$0, chn $$1, long $$2) {
      return c($$1) || b($$1);
   }

   protected void b(apa $$0, chn $$1, long $$2) {
      if (c($$1) || b($$1)) {
         bpy<?> $$3 = $$1.dM();
         if (!$$3.c(cjn.g)) {
            $$3.b(bya.t);
            $$3.b(bya.m);
            $$3.b(bya.n);
            $$3.b(bya.r);
            $$3.b(bya.q);
         }

         $$3.a(cjn.g);
      }
   }

   protected void c(apa $$0, chn $$1, long $$2) {
      if ($$2 % 100L == 0L) {
         $$1.a($$0, $$2, 3);
      }
   }

   public static boolean b(box $$0) {
      return $$0.dM().a(bya.A);
   }

   public static boolean c(box $$0) {
      return $$0.dM().a(bya.x);
   }
}
