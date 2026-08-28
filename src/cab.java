import com.google.common.collect.ImmutableMap;

public class cab extends bza<bxl> {
   public static final int c = 100;
   private final btr d;
   private final awm e;

   public cab(btr $$0, awm $$1) {
      super(ImmutableMap.of(cgl.o, cgm.c, cgl.U, cgm.a), 100);
      this.d = $$0;
      this.e = $$1;
   }

   protected boolean a(arq $$0, bxl $$1, long $$2) {
      return !$$1.aH();
   }

   protected void b(arq $$0, bxl $$1, long $$2) {
      $$1.q(true);
      $$1.b(bxv.g);
   }

   protected void c(arq $$0, bxl $$1, long $$2) {
      if ($$1.aH()) {
         $$1.i($$1.dx().d(0.1F, 1.0, 0.1F));
         $$0.a(null, $$1, this.e, awo.g, 2.0F, 1.0F);
      }

      $$1.q(false);
      $$1.b(bxv.a);
      $$1.eb().b(cgl.U);
      $$1.eb().a(cgl.T, this.d.a($$0.A));
   }
}
