import java.util.List;

public class cvj extends cst implements dao {
   protected static final float a = 3.0F;
   protected static final ehw b = csl.a(5.0, 0.0, 5.0, 11.0, 10.0, 11.0);
   private final List<dao.a> c;

   public cvj(bht $$0, int $$1, dey.d $$2) {
      super($$2);
      int $$3;
      if ($$0.a()) {
         $$3 = $$1;
      } else {
         $$3 = $$1 * 20;
      }

      this.c = List.of(new dao.a($$0, $$3));
   }

   @Override
   public ehw a(dez $$0, cor $$1, gu $$2, ehi $$3) {
      ehd $$4 = $$0.n($$1, $$2);
      return b.a($$4.c, $$4.d, $$4.e);
   }

   @Override
   public List<dao.a> a() {
      return this.c;
   }
}
