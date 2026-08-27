import com.google.common.collect.ImmutableMap;

public class bov<E extends cbe> extends bld<E> {
   public bov(int $$0) {
      super(ImmutableMap.of(bsn.o, bso.b, bsn.m, bso.b), $$0);
   }

   protected boolean a(akt $$0, E $$1, long $$2) {
      return $$1.dH() == null;
   }

   protected boolean a(akt $$0, E $$1) {
      return $$1.aA() || $$1.aX() || $$1.bl();
   }

   protected void b(akt $$0, E $$1, long $$2) {
      if ($$1.aA()) {
         $$1.b(bjy.o);
         $$1.a(apg.zA, 5.0F, 1.0F);
      } else {
         $$1.a(apg.zv, 5.0F, 1.0F);
         this.c($$0, $$1, $$2);
      }
   }

   protected void c(akt $$0, E $$1, long $$2) {
      if ($$1.dH() == null) {
         $$1.a(biw.c.b);
      }
   }
}
