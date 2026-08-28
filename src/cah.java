import com.google.common.collect.ImmutableMap;

public class cah extends bwz<coi> {
   public cah() {
      super(ImmutableMap.of());
   }

   protected boolean a(arc $$0, coi $$1, long $$2) {
      return c($$1) || b($$1);
   }

   protected void b(arc $$0, coi $$1, long $$2) {
      if (c($$1) || b($$1)) {
         bwi<?> $$3 = $$1.ec();
         if (!$$3.c(cqo.g)) {
            $$3.b(cek.t);
            $$3.b(cek.m);
            $$3.b(cek.n);
            $$3.b(cek.r);
            $$3.b(cek.q);
         }

         $$3.a(cqo.g);
      }
   }

   protected void c(arc $$0, coi $$1, long $$2) {
      if ($$2 % 100L == 0L) {
         $$1.a($$0, $$2, 3);
      }
   }

   public static boolean b(bvg $$0) {
      return $$0.ec().a(cek.A);
   }

   public static boolean c(bvg $$0) {
      return $$0.ec().a(cek.x);
   }
}
