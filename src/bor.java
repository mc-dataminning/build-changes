import com.google.common.collect.ImmutableMap;

public class bor<E extends cba> extends bkz<E> {
   public bor(int $$0) {
      super(ImmutableMap.of(bsj.o, bsk.b, bsj.m, bsk.b), $$0);
   }

   protected boolean a(aks $$0, E $$1, long $$2) {
      return $$1.dH() == null;
   }

   protected boolean a(aks $$0, E $$1) {
      return $$1.aA() || $$1.aX() || $$1.bl();
   }

   protected void b(aks $$0, E $$1, long $$2) {
      if ($$1.aA()) {
         $$1.b(bju.o);
         $$1.a(apf.zA, 5.0F, 1.0F);
      } else {
         $$1.a(apf.zv, 5.0F, 1.0F);
         this.c($$0, $$1, $$2);
      }
   }

   protected void c(aks $$0, E $$1, long $$2) {
      if ($$1.dH() == null) {
         $$1.a(bis.c.b);
      }
   }
}
