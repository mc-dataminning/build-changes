import com.google.common.collect.ImmutableMap;

public class bwc extends bkz<bwa> {
   public bwc() {
      super(ImmutableMap.of(bsj.M, bsk.a, bsj.y, bsk.a), 200);
   }

   protected boolean a(aks $$0, bwa $$1) {
      return $$1.ba();
   }

   protected boolean a(aks $$0, bwa $$1, long $$2) {
      return $$1.ba() && $$1.dN().a(bsj.M);
   }

   protected void b(aks $$0, bwa $$1, long $$2) {
      bki<bwa> $$3 = $$1.dN();
      $$3.b(bsj.m);
      $$3.b(bsj.n);
      $$1.b(new bif(bih.j, 200, 0));
   }
}
