import com.google.common.collect.ImmutableMap;

public class cax extends bzw<byh> {
   public static final int c = 100;
   private final bun d;
   private final awx e;

   public cax(bun $$0, awx $$1) {
      super(ImmutableMap.of(chh.o, chi.c, chh.U, chi.a), 100);
      this.d = $$0;
      this.e = $$1;
   }

   protected boolean a(asb $$0, byh $$1, long $$2) {
      return !$$1.aH();
   }

   protected void b(asb $$0, byh $$1, long $$2) {
      $$1.q(true);
      $$1.b(byr.g);
   }

   protected void c(asb $$0, byh $$1, long $$2) {
      if ($$1.aH()) {
         $$1.i($$1.dy().d(0.1F, 1.0, 0.1F));
         $$0.a(null, $$1, this.e, awz.g, 2.0F, 1.0F);
      }

      $$1.q(false);
      $$1.b(byr.a);
      $$1.ec().b(chh.U);
      $$1.ec().a(chh.T, this.d.a($$0.A));
   }
}
