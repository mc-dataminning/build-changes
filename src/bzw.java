import com.google.common.collect.ImmutableMap;

public class bzw extends byv<bxg> {
   public static final int c = 100;
   private final bto d;
   private final awm e;

   public bzw(bto $$0, awm $$1) {
      super(ImmutableMap.of(cgg.o, cgh.c, cgg.U, cgh.a), 100);
      this.d = $$0;
      this.e = $$1;
   }

   protected boolean a(arq $$0, bxg $$1, long $$2) {
      return !$$1.aJ();
   }

   protected void b(arq $$0, bxg $$1, long $$2) {
      $$1.q(true);
      $$1.b(bxq.g);
   }

   protected void c(arq $$0, bxg $$1, long $$2) {
      if ($$1.aJ()) {
         $$1.i($$1.dy().d(0.1F, 1.0, 0.1F));
         $$0.a(null, $$1, this.e, awo.g, 2.0F, 1.0F);
      }

      $$1.q(false);
      $$1.b(bxq.a);
      $$1.ec().b(cgg.U);
      $$1.ec().a(cgg.T, this.d.a($$0.A));
   }
}
