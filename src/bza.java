import com.google.common.collect.ImmutableMap;

public class bza<E extends cmb> extends bvh<E> {
   public bza(int $$0) {
      super(ImmutableMap.of(ccs.o, cct.b, ccs.m, cct.b), $$0);
   }

   protected boolean a(aqu $$0, E $$1, long $$2) {
      return $$1.dK() == null;
   }

   protected boolean a(aqu $$0, E $$1) {
      return $$1.aF() || $$1.bf() || $$1.bt();
   }

   protected void b(aqu $$0, E $$1, long $$2) {
      if ($$1.aF()) {
         $$1.b(bua.o);
         $$1.a(avp.BL, 5.0F, 1.0F);
      } else {
         $$1.a(avp.BG, 5.0F, 1.0F);
         this.c($$0, $$1, $$2);
      }
   }

   protected void c(aqu $$0, E $$1, long $$2) {
      if ($$1.dK() == null) {
         $$1.a(bsr.c.b);
      }
   }
}
