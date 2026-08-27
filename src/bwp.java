import com.google.common.collect.ImmutableMap;

public class bwp<E extends cjp> extends bsw<E> {
   public bwp(int $$0) {
      super(ImmutableMap.of(cah.o, cai.b, cah.m, cai.b), $$0);
   }

   protected boolean a(aqe $$0, E $$1, long $$2) {
      return $$1.dJ() == null;
   }

   protected boolean a(aqe $$0, E $$1) {
      return $$1.aC() || $$1.bc() || $$1.bq();
   }

   protected void b(aqe $$0, E $$1, long $$2) {
      if ($$1.aC()) {
         $$1.b(brp.o);
         $$1.a(auz.Bv, 5.0F, 1.0F);
      } else {
         $$1.a(auz.Bq, 5.0F, 1.0F);
         this.c($$0, $$1, $$2);
      }
   }

   protected void c(aqe $$0, E $$1, long $$2) {
      if ($$1.dJ() == null) {
         $$1.a(bql.c.b);
      }
   }
}
