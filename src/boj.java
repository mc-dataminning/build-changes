import com.google.common.collect.ImmutableMap;
import java.util.Optional;

public class boj extends bkz<cbj> {
   private static final int c = 300;
   private static final double d = 1.73;
   private long e;

   public boj() {
      super(ImmutableMap.of(bsj.c, bsk.a, bsj.n, bsk.c));
   }

   protected boolean b(aks $$0, cbj $$1) {
      if ($$0.V() - this.e < 300L) {
         return false;
      } else if ($$0.z.a(2) != 0) {
         return false;
      } else {
         this.e = $$0.V();
         hf $$2 = $$1.dN().c(bsj.c).get();
         return $$2.a() == $$0.ac() && $$2.b().a($$1.dj(), 1.73);
      }
   }

   protected void a(aks $$0, cbj $$1, long $$2) {
      bki<cbj> $$3 = $$1.dN();
      $$3.a(bsj.I, $$2);
      $$3.c(bsj.c).ifPresent($$1x -> $$3.a(bsj.n, new blc($$1x.b())));
      $$1.gs();
      this.a($$0, $$1);
      if ($$1.gr()) {
         $$1.gq();
      }
   }

   protected void a(aks $$0, cbj $$1) {
   }

   protected boolean b(aks $$0, cbj $$1, long $$2) {
      Optional<hf> $$3 = $$1.dN().c(bsj.c);
      if ($$3.isEmpty()) {
         return false;
      } else {
         hf $$4 = $$3.get();
         return $$4.a() == $$0.ac() && $$4.b().a($$1.dj(), 1.73);
      }
   }
}
