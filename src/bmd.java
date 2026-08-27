import com.google.common.collect.ImmutableMap;

public class bmd extends bkz<cbj> {
   private final float c;

   public bmd(float $$0) {
      super(ImmutableMap.of(bsj.m, bsk.c, bsj.n, bsk.c), Integer.MAX_VALUE);
      this.c = $$0;
   }

   protected boolean a(aks $$0, cbj $$1) {
      cbw $$2 = $$1.gd();
      return $$1.bv() && $$2 != null && !$$1.aX() && !$$1.T && $$1.f($$2) <= 16.0 && $$2.bS != null;
   }

   protected boolean a(aks $$0, cbj $$1, long $$2) {
      return this.a($$0, $$1);
   }

   protected void b(aks $$0, cbj $$1, long $$2) {
      this.a($$1);
   }

   protected void c(aks $$0, cbj $$1, long $$2) {
      bki<?> $$3 = $$1.dN();
      $$3.b(bsj.m);
      $$3.b(bsj.n);
   }

   protected void d(aks $$0, cbj $$1, long $$2) {
      this.a($$1);
   }

   @Override
   protected boolean a(long $$0) {
      return false;
   }

   private void a(cbj $$0) {
      bki<?> $$1 = $$0.dN();
      $$1.a(bsj.m, new bsm(new blk($$0.gd(), false), this.c, 2));
      $$1.a(bsj.n, new blk($$0.gd(), true));
   }
}
