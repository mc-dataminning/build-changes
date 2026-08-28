import com.google.common.collect.ImmutableMap;

public class cas<E extends cnz> extends bwz<E> {
   public cas(int $$0) {
      super(ImmutableMap.of(cek.o, cel.b, cek.m, cel.b), $$0);
   }

   protected boolean a(arc $$0, E $$1, long $$2) {
      return $$1.dS() == null;
   }

   protected boolean a(arc $$0, E $$1) {
      return $$1.aJ() || $$1.bj() || $$1.bx();
   }

   protected void b(arc $$0, E $$1, long $$2) {
      if ($$1.aJ()) {
         $$1.b(bvs.o);
         $$1.a(awa.CA, 5.0F, 1.0F);
      } else {
         $$1.a(awa.Cv, 5.0F, 1.0F);
         this.c($$0, $$1, $$2);
      }
   }

   protected void c(arc $$0, E $$1, long $$2) {
      if ($$1.dS() == null) {
         $$1.a(buk.d.b);
      }
   }
}
