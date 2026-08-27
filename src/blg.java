import com.google.common.collect.ImmutableMap;

public class blg extends bkz<bwi> {
   private static final int c = 60;
   private static final int d = 100;
   private int e;

   public blg() {
      super(ImmutableMap.of(bsj.m, bsk.b), 100);
   }

   protected boolean a(aks $$0, bwi $$1) {
      return $$1.an() == bju.a;
   }

   protected boolean a(aks $$0, bwi $$1, long $$2) {
      return this.e < 60;
   }

   protected void b(aks $$0, bwi $$1, long $$2) {
      if (!$$1.bb()) {
         $$1.b(bju.i);
         this.e = 0;
      }
   }

   protected void c(aks $$0, bwi $$1, long $$2) {
      $$1.b(bju.a);
   }

   protected void d(aks $$0, bwi $$1, long $$2) {
      this.e++;
   }
}
