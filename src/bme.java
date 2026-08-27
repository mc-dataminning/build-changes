import com.google.common.collect.ImmutableMap;

public class bme extends bkz<bjk> {
   public bme(int $$0, int $$1) {
      super(ImmutableMap.of(bsj.n, bsk.a), $$0, $$1);
   }

   protected boolean a(aks $$0, bjk $$1, long $$2) {
      return $$1.dN().c(bsj.n).filter($$1x -> $$1x.a($$1)).isPresent();
   }

   protected void b(aks $$0, bjk $$1, long $$2) {
      $$1.dN().b(bsj.n);
   }

   protected void c(aks $$0, bjk $$1, long $$2) {
      $$1.dN().c(bsj.n).ifPresent($$1x -> $$1.G().a($$1x.a()));
   }
}
