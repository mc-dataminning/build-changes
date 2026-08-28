import com.google.common.collect.ImmutableMap;

public class byo<E extends clp> extends buv<E> {
   public byo(int $$0) {
      super(ImmutableMap.of(ccg.o, cch.b, ccg.m, cch.b), $$0);
   }

   protected boolean a(aqm $$0, E $$1, long $$2) {
      return $$1.dN() == null;
   }

   protected boolean a(aqm $$0, E $$1) {
      return $$1.aG() || $$1.bg() || $$1.bu();
   }

   protected void b(aqm $$0, E $$1, long $$2) {
      if ($$1.aG()) {
         $$1.b(bto.o);
         $$1.a(avh.BK, 5.0F, 1.0F);
      } else {
         $$1.a(avh.BF, 5.0F, 1.0F);
         this.c($$0, $$1, $$2);
      }
   }

   protected void c(aqm $$0, E $$1, long $$2) {
      if ($$1.dN() == null) {
         $$1.a(bsh.d.b);
      }
   }
}
