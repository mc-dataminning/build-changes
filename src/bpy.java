import com.google.common.collect.ImmutableMap;

public class bpy<E extends ccb> extends bma<E> {
   private static final double c = 6.0;
   private static final double d = 20.0;

   public bpy(int $$0) {
      super(ImmutableMap.of(btk.aA, btl.a, btk.o, btl.b, btk.m, btl.b, btk.n, btl.c, btk.B, btl.c, btk.ay, btl.c, btk.aF, btl.c), $$0);
   }

   protected boolean a(alq $$0, E $$1, long $$2) {
      return true;
   }

   protected void b(alq $$0, E $$1, long $$2) {
      $$1.a(aqd.zM, 5.0F, 1.0F);
   }

   protected void c(alq $$0, E $$1, long $$2) {
      if ($$1.c(bkv.m)) {
         $$1.b(bkv.a);
      }

      $$1.dN().b(btk.aA);
      $$1.dN().c(btk.B).filter($$1::a).ifPresent($$1x -> {
         if ($$1.a($$1x, 6.0, 20.0)) {
            $$1.c($$1x);
         }

         if (!$$1.dN().a(btk.ay)) {
            ccc.a($$1, $$1x.dl());
         }
      });
   }
}
