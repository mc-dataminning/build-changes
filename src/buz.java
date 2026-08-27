import com.google.common.collect.ImmutableMap;

public class buz<E extends chw> extends brg<E> {
   public buz(int $$0) {
      super(ImmutableMap.of(byr.o, bys.b, byr.m, bys.b), $$0);
   }

   protected boolean a(apf $$0, E $$1, long $$2) {
      return $$1.dI() == null;
   }

   protected boolean a(apf $$0, E $$1) {
      return $$1.aC() || $$1.bc() || $$1.bq();
   }

   protected void b(apf $$0, E $$1, long $$2) {
      if ($$1.aC()) {
         $$1.b(bpz.o);
         $$1.a(aty.Bg, 5.0F, 1.0F);
      } else {
         $$1.a(aty.Bb, 5.0F, 1.0F);
         this.c($$0, $$1, $$2);
      }
   }

   protected void c(apf $$0, E $$1, long $$2) {
      if ($$1.dI() == null) {
         $$1.a(bow.c.b);
      }
   }
}
