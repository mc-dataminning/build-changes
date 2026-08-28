import com.google.common.collect.ImmutableMap;

public class cdg<E extends crc> extends bzn<E> {
   public cdg(int $$0) {
      super(ImmutableMap.of(cgy.p, cgz.b, cgy.n, cgz.b), $$0);
   }

   protected boolean a(aru $$0, E $$1, long $$2) {
      return $$1.dR() == null;
   }

   protected boolean a(aru $$0, E $$1) {
      return $$1.aH() || $$1.bi() || $$1.bv();
   }

   protected void b(aru $$0, E $$1, long $$2) {
      if ($$1.aH()) {
         $$1.b(byi.o);
         $$1.a(awr.CP, 5.0F, 1.0F);
      } else {
         $$1.a(awr.CK, 5.0F, 1.0F);
         this.c($$0, $$1, $$2);
      }
   }

   protected void c(aru $$0, E $$1, long $$2) {
      if ($$1.dR() == null) {
         $$1.a(bwv.d.b);
      }
   }
}
