import com.google.common.collect.ImmutableMap;

public class cam extends bzl<bxw> {
   public static final int c = 100;
   private final buc d;
   private final awo e;

   public cam(buc $$0, awo $$1) {
      super(ImmutableMap.of(cgw.o, cgx.c, cgw.U, cgx.a), 100);
      this.d = $$0;
      this.e = $$1;
   }

   protected boolean a(ars $$0, bxw $$1, long $$2) {
      return !$$1.aH();
   }

   protected void b(ars $$0, bxw $$1, long $$2) {
      $$1.q(true);
      $$1.b(byg.g);
   }

   protected void c(ars $$0, bxw $$1, long $$2) {
      if ($$1.aH()) {
         $$1.i($$1.dy().d(0.1F, 1.0, 0.1F));
         $$0.a(null, $$1, this.e, awq.g, 2.0F, 1.0F);
      }

      $$1.q(false);
      $$1.b(byg.a);
      $$1.ec().b(cgw.U);
      $$1.ec().a(cgw.T, this.d.a($$0.A));
   }
}
