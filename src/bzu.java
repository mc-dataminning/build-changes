import com.google.common.collect.ImmutableMap;

public class bzu extends byt<bxe> {
   public static final int c = 100;
   private final btm d;
   private final awm e;

   public bzu(btm $$0, awm $$1) {
      super(ImmutableMap.of(cge.o, cgf.c, cge.U, cgf.a), 100);
      this.d = $$0;
      this.e = $$1;
   }

   protected boolean a(arq $$0, bxe $$1, long $$2) {
      return !$$1.aJ();
   }

   protected void b(arq $$0, bxe $$1, long $$2) {
      $$1.q(true);
      $$1.b(bxo.g);
   }

   protected void c(arq $$0, bxe $$1, long $$2) {
      if ($$1.aJ()) {
         $$1.i($$1.dy().d(0.1F, 1.0, 0.1F));
         $$0.a(null, $$1, this.e, awo.g, 2.0F, 1.0F);
      }

      $$1.q(false);
      $$1.b(bxo.a);
      $$1.eb().b(cge.U);
      $$1.eb().a(cge.T, this.d.a($$0.A));
   }
}
