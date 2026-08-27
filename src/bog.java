import com.google.common.collect.ImmutableMap;

public class bog extends bkz<cbj> {
   public bog() {
      super(ImmutableMap.of());
   }

   protected boolean a(aks $$0, cbj $$1, long $$2) {
      return c($$1) || b($$1);
   }

   protected void b(aks $$0, cbj $$1, long $$2) {
      if (c($$1) || b($$1)) {
         bki<?> $$3 = $$1.dN();
         if (!$$3.c(cdh.g)) {
            $$3.b(bsj.t);
            $$3.b(bsj.m);
            $$3.b(bsj.n);
            $$3.b(bsj.r);
            $$3.b(bsj.q);
         }

         $$3.a(cdh.g);
      }
   }

   protected void c(aks $$0, cbj $$1, long $$2) {
      if ($$2 % 100L == 0L) {
         $$1.a($$0, $$2, 3);
      }
   }

   public static boolean b(bji $$0) {
      return $$0.dN().a(bsj.A);
   }

   public static boolean c(bji $$0) {
      return $$0.dN().a(bsj.x);
   }
}
