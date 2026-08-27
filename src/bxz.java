import com.google.common.collect.ImmutableMap;

public class bxz<E extends clc> extends bug<E> {
   public bxz(int $$0) {
      super(ImmutableMap.of(cbr.o, cbs.b, cbr.m, cbs.b), $$0);
   }

   protected boolean a(aqt $$0, E $$1, long $$2) {
      return $$1.dQ() == null;
   }

   protected boolean a(aqt $$0, E $$1) {
      return $$1.aE() || $$1.bi() || $$1.bx();
   }

   protected void b(aqt $$0, E $$1, long $$2) {
      if ($$1.aE()) {
         $$1.b(bsz.o);
         $$1.a(avo.Cf, 5.0F, 1.0F);
      } else {
         $$1.a(avo.Ca, 5.0F, 1.0F);
         this.c($$0, $$1, $$2);
      }
   }

   protected void c(aqt $$0, E $$1, long $$2) {
      if ($$1.dQ() == null) {
         $$1.a(brv.d.b);
      }
   }
}
