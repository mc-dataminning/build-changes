import com.google.common.collect.ImmutableMap;

public class ccp<E extends cpv> extends byq<E> {
   private static final double c = 6.0;
   private static final double d = 20.0;

   public ccp(int $$0) {
      super(ImmutableMap.of(cgb.aC, cgc.a, cgb.p, cgc.b, cgb.n, cgc.b, cgb.o, cgc.c, cgb.C, cgc.c, cgb.aA, cgc.c, cgb.aH, cgc.c), $$0);
   }

   protected boolean a(aro $$0, E $$1, long $$2) {
      return true;
   }

   protected void b(aro $$0, E $$1, long $$2) {
      $$1.a(awl.CT, 5.0F, 1.0F);
   }

   protected void c(aro $$0, E $$1, long $$2) {
      if ($$1.c(bxl.m)) {
         $$1.b(bxl.a);
      }

      $$1.eb().b(cgb.aC);
      $$1.eb().c(cgb.C).filter($$1::b).ifPresent($$1x -> {
         if ($$1.a($$1x, 6.0, 20.0)) {
            $$1.d($$1x);
         }

         if (!$$1.eb().a(cgb.aA)) {
            cpw.a($$1, $$1x.dv());
         }
      });
   }
}
