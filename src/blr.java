import com.google.common.collect.ImmutableMap;
import java.util.Optional;

public class blr extends bkz<cbj> {
   private static final int d = 1200;
   final float c;

   public blr(float $$0) {
      super(ImmutableMap.of(bsj.d, bsk.a), 1200);
      this.c = $$0;
   }

   protected boolean a(aks $$0, cbj $$1) {
      return $$1.dN().g().map($$0x -> $$0x == cdh.b || $$0x == cdh.c || $$0x == cdh.d).orElse(true);
   }

   protected boolean a(aks $$0, cbj $$1, long $$2) {
      return $$1.dN().a(bsj.d);
   }

   protected void b(aks $$0, cbj $$1, long $$2) {
      blb.a($$1, $$1.dN().c(bsj.d).get().b(), this.c, 1);
   }

   protected void c(aks $$0, cbj $$1, long $$2) {
      Optional<hf> $$3 = $$1.dN().c(bsj.d);
      $$3.ifPresent($$1x -> {
         gw $$2x = $$1x.b();
         aks $$3x = $$0.n().a($$1x.a());
         if ($$3x != null) {
            buh $$4 = $$3x.w();
            if ($$4.a($$2x, $$0xx -> true)) {
               $$4.b($$2x);
            }

            abd.c($$0, $$2x);
         }
      });
      $$1.dN().b(bsj.d);
   }
}
