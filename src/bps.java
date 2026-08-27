import com.google.common.collect.ImmutableMap;

public class bps<E extends ccb> extends bma<E> {
   public bps(int $$0) {
      super(ImmutableMap.of(btk.o, btl.b, btk.m, btl.b), $$0);
   }

   protected boolean a(alq $$0, E $$1, long $$2) {
      return $$1.dH() == null;
   }

   protected boolean a(alq $$0, E $$1) {
      return $$1.aA() || $$1.aX() || $$1.bl();
   }

   protected void b(alq $$0, E $$1, long $$2) {
      if ($$1.aA()) {
         $$1.b(bkv.o);
         $$1.a(aqd.zC, 5.0F, 1.0F);
      } else {
         $$1.a(aqd.zx, 5.0F, 1.0F);
         this.c($$0, $$1, $$2);
      }
   }

   protected void c(alq $$0, E $$1, long $$2) {
      if ($$1.dH() == null) {
         $$1.a(bjt.c.b);
      }
   }
}
