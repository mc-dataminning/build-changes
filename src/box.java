import com.google.common.collect.ImmutableMap;

public class box<E extends cba> extends bkz<E> {
   private static final double c = 6.0;
   private static final double d = 20.0;

   public box(int $$0) {
      super(ImmutableMap.of(bsj.aA, bsk.a, bsj.o, bsk.b, bsj.m, bsk.b, bsj.n, bsk.c, bsj.B, bsk.c, bsj.ay, bsk.c, bsj.aF, bsk.c), $$0);
   }

   protected boolean a(aks $$0, E $$1, long $$2) {
      return true;
   }

   protected void b(aks $$0, E $$1, long $$2) {
      $$1.a(apf.zK, 5.0F, 1.0F);
   }

   protected void c(aks $$0, E $$1, long $$2) {
      if ($$1.c(bju.m)) {
         $$1.b(bju.a);
      }

      $$1.dN().b(bsj.aA);
      $$1.dN().c(bsj.B).filter($$1::a).ifPresent($$1x -> {
         if ($$1.a($$1x, 6.0, 20.0)) {
            $$1.c($$1x);
         }

         if (!$$1.dN().a(bsj.ay)) {
            cbb.a($$1, $$1x.dl());
         }
      });
   }
}
