import com.google.common.collect.ImmutableMap;

public class byn<E extends clo> extends buu<E> {
   public byn(int $$0) {
      super(ImmutableMap.of(ccf.o, ccg.b, ccf.m, ccg.b), $$0);
   }

   protected boolean a(aqm $$0, E $$1, long $$2) {
      return $$1.dM() == null;
   }

   protected boolean a(aqm $$0, E $$1) {
      return $$1.aF() || $$1.bf() || $$1.bt();
   }

   protected void b(aqm $$0, E $$1, long $$2) {
      if ($$1.aF()) {
         $$1.b(btn.o);
         $$1.a(avh.BK, 5.0F, 1.0F);
      } else {
         $$1.a(avh.BF, 5.0F, 1.0F);
         this.c($$0, $$1, $$2);
      }
   }

   protected void c(aqm $$0, E $$1, long $$2) {
      if ($$1.dM() == null) {
         $$1.a(bsg.c.b);
      }
   }
}
