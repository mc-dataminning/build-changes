import com.google.common.collect.ImmutableMap;

public class bma extends bkz<bjk> {
   public static final int c = 100;
   private final bgl d;
   private final ape e;

   public bma(bgl $$0, ape $$1) {
      super(ImmutableMap.of(bsj.n, bsk.c, bsj.S, bsk.a), 100);
      this.d = $$0;
      this.e = $$1;
   }

   protected boolean a(aks $$0, bjk $$1, long $$2) {
      return !$$1.aA();
   }

   protected void b(aks $$0, bjk $$1, long $$2) {
      $$1.p(true);
      $$1.b(bju.g);
   }

   protected void c(aks $$0, bjk $$1, long $$2) {
      if ($$1.aA()) {
         $$1.f($$1.do().d(0.1F, 1.0, 0.1F));
         $$0.a(null, $$1, this.e, apg.g, 2.0F, 1.0F);
      }

      $$1.p(false);
      $$1.b(bju.a);
      $$1.dN().b(bsj.S);
      $$1.dN().a(bsj.R, this.d.a($$0.z));
   }
}
