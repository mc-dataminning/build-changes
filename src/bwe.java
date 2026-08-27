import com.google.common.collect.ImmutableMap;

public class bwe<E extends cje> extends bsl<E> {
   public bwe(int $$0) {
      super(ImmutableMap.of(bzw.o, bzx.b, bzw.m, bzx.b), $$0);
   }

   protected boolean a(apu $$0, E $$1, long $$2) {
      return $$1.dI() == null;
   }

   protected boolean a(apu $$0, E $$1) {
      return $$1.aC() || $$1.bc() || $$1.bq();
   }

   protected void b(apu $$0, E $$1, long $$2) {
      if ($$1.aC()) {
         $$1.b(bre.o);
         $$1.a(auo.Bo, 5.0F, 1.0F);
      } else {
         $$1.a(auo.Bj, 5.0F, 1.0F);
         this.c($$0, $$1, $$2);
      }
   }

   protected void c(apu $$0, E $$1, long $$2) {
      if ($$1.dI() == null) {
         $$1.a(bqa.c.b);
      }
   }
}
