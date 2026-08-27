import com.google.common.collect.ImmutableMap;

public class boh<E extends caq> extends bkp<E> {
   public boh(int $$0) {
      super(ImmutableMap.of(brz.o, bsa.b, brz.m, bsa.b), $$0);
   }

   protected boolean a(akk $$0, E $$1, long $$2) {
      return $$1.dG() == null;
   }

   protected boolean a(akk $$0, E $$1) {
      return $$1.aA() || $$1.aX() || $$1.bl();
   }

   protected void b(akk $$0, E $$1, long $$2) {
      if ($$1.aA()) {
         $$1.b(bjk.o);
         $$1.a(aow.zA, 5.0F, 1.0F);
      } else {
         $$1.a(aow.zv, 5.0F, 1.0F);
         this.c($$0, $$1, $$2);
      }
   }

   protected void c(akk $$0, E $$1, long $$2) {
      if ($$1.dG() == null) {
         $$1.a(bii.c.b);
      }
   }
}
