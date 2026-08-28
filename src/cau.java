import com.google.common.collect.ImmutableMap;

public class cau<E extends coa> extends bxb<E> {
   public cau(int $$0) {
      super(ImmutableMap.of(cem.o, cen.b, cem.m, cen.b), $$0);
   }

   protected boolean a(ard $$0, E $$1, long $$2) {
      return $$1.dR() == null;
   }

   protected boolean a(ard $$0, E $$1) {
      return $$1.aJ() || $$1.bj() || $$1.bx();
   }

   protected void b(ard $$0, E $$1, long $$2) {
      if ($$1.aJ()) {
         $$1.b(bvu.o);
         $$1.a(awa.Cz, 5.0F, 1.0F);
      } else {
         $$1.a(awa.Cu, 5.0F, 1.0F);
         this.c($$0, $$1, $$2);
      }
   }

   protected void c(ard $$0, E $$1, long $$2) {
      if ($$1.dR() == null) {
         $$1.a(bum.d.b);
      }
   }
}
