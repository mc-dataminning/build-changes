import com.google.common.collect.ImmutableMap;

public class bzy<E extends cnb> extends bwf<E> {
   public bzy(int $$0) {
      super(ImmutableMap.of(cdq.o, cdr.b, cdq.m, cdr.b), $$0);
   }

   protected boolean a(arj $$0, E $$1, long $$2) {
      return $$1.dO() == null;
   }

   protected boolean a(arj $$0, E $$1) {
      return $$1.aH() || $$1.bi() || $$1.bw();
   }

   protected void b(arj $$0, E $$1, long $$2) {
      if ($$1.aH()) {
         $$1.b(buz.o);
         $$1.a(awg.BR, 5.0F, 1.0F);
      } else {
         $$1.a(awg.BM, 5.0F, 1.0F);
         this.c($$0, $$1, $$2);
      }
   }

   protected void c(arj $$0, E $$1, long $$2) {
      if ($$1.dO() == null) {
         $$1.a(btr.c.b);
      }
   }
}
