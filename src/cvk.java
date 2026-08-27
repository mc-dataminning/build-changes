import java.util.List;

public class cvk extends csu implements dap {
   protected static final float a = 3.0F;
   protected static final ehx b = csm.a(5.0, 0.0, 5.0, 11.0, 10.0, 11.0);
   private final List<dap.a> c;

   public cvk(bht $$0, int $$1, dez.d $$2) {
      super($$2);
      int $$3;
      if ($$0.a()) {
         $$3 = $$1;
      } else {
         $$3 = $$1 * 20;
      }

      this.c = List.of(new dap.a($$0, $$3));
   }

   @Override
   public ehx a(dfa $$0, cos $$1, gu $$2, ehj $$3) {
      ehe $$4 = $$0.n($$1, $$2);
      return b.a($$4.c, $$4.d, $$4.e);
   }

   @Override
   public List<dap.a> a() {
      return this.c;
   }
}
