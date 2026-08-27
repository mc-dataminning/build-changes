import com.google.common.collect.ImmutableMap;

public class bou extends bkz<cba> {
   private static final int c = 25;
   private static final int d = 20;

   public bou() {
      super(ImmutableMap.of(bsj.ax, bsk.a, bsj.o, bsk.b, bsj.aE, bsk.c, bsj.aC, bsk.c), cbb.b);
   }

   protected void a(aks $$0, cba $$1, long $$2) {
      bki<cba> $$3 = $$1.dN();
      $$3.a(bsj.aC, asz.a, 25L);
      $$3.b(bsj.m);
      bji $$4 = $$1.dN().c(bsj.ax).get();
      blb.a($$1, $$4);
      $$1.b(bju.l);
      $$1.a($$4, 20, false);
   }

   protected boolean b(aks $$0, cba $$1, long $$2) {
      return true;
   }

   protected void c(aks $$0, cba $$1, long $$2) {
      if (!$$1.dN().a(bsj.aC) && !$$1.dN().a(bsj.aE)) {
         $$1.dN().a(bsj.aE, asz.a, (long)(cbb.b - 25));
         $$1.a(apf.zJ, 3.0F, 1.0F);
      }
   }

   protected void d(aks $$0, cba $$1, long $$2) {
      if ($$1.c(bju.l)) {
         $$1.b(bju.a);
      }

      $$1.dN().c(bsj.ax).ifPresent($$1::j);
      $$1.dN().b(bsj.ax);
   }
}
