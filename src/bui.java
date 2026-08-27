import com.google.common.collect.ImmutableMap;

public class bui<E extends che> extends bqp<E> {
   public bui(int $$0) {
      super(ImmutableMap.of(bya.o, byb.b, bya.m, byb.b), $$0);
   }

   protected boolean a(apa $$0, E $$1, long $$2) {
      return $$1.dF() == null;
   }

   protected boolean a(apa $$0, E $$1) {
      return $$1.aC() || $$1.aZ() || $$1.bn();
   }

   protected void b(apa $$0, E $$1, long $$2) {
      if ($$1.aC()) {
         $$1.b(bpi.o);
         $$1.a(atp.Bd, 5.0F, 1.0F);
      } else {
         $$1.a(atp.AY, 5.0F, 1.0F);
         this.c($$0, $$1, $$2);
      }
   }

   protected void c(apa $$0, E $$1, long $$2) {
      if ($$1.dF() == null) {
         $$1.a(bof.c.b);
      }
   }
}
