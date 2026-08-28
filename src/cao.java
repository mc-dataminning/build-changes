import com.google.common.collect.ImmutableMap;

public class cao extends bzn<bxy> {
   public static final int c = 100;
   private final bue d;
   private final awq e;

   public cao(bue $$0, awq $$1) {
      super(ImmutableMap.of(cgy.o, cgz.c, cgy.U, cgz.a), 100);
      this.d = $$0;
      this.e = $$1;
   }

   protected boolean a(aru $$0, bxy $$1, long $$2) {
      return !$$1.aH();
   }

   protected void b(aru $$0, bxy $$1, long $$2) {
      $$1.q(true);
      $$1.b(byi.g);
   }

   protected void c(aru $$0, bxy $$1, long $$2) {
      if ($$1.aH()) {
         $$1.i($$1.dy().d(0.1F, 1.0, 0.1F));
         $$0.a(null, $$1, this.e, aws.g, 2.0F, 1.0F);
      }

      $$1.q(false);
      $$1.b(byi.a);
      $$1.ec().b(cgy.U);
      $$1.ec().a(cgy.T, this.d.a($$0.A));
   }
}
