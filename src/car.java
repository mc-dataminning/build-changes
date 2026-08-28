import com.google.common.collect.ImmutableMap;

public class car<E extends cnx> extends bwy<E> {
   public car(int $$0) {
      super(ImmutableMap.of(cej.o, cek.b, cej.m, cek.b), $$0);
   }

   protected boolean a(arc $$0, E $$1, long $$2) {
      return $$1.dS() == null;
   }

   protected boolean a(arc $$0, E $$1) {
      return $$1.aJ() || $$1.bj() || $$1.bx();
   }

   protected void b(arc $$0, E $$1, long $$2) {
      if ($$1.aJ()) {
         $$1.b(bvr.o);
         $$1.a(avz.Cz, 5.0F, 1.0F);
      } else {
         $$1.a(avz.Cu, 5.0F, 1.0F);
         this.c($$0, $$1, $$2);
      }
   }

   protected void c(arc $$0, E $$1, long $$2) {
      if ($$1.dS() == null) {
         $$1.a(buj.d.b);
      }
   }
}
