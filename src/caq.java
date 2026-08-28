import com.google.common.collect.ImmutableMap;

public class caq<E extends cnt> extends bwx<E> {
   public caq(int $$0) {
      super(ImmutableMap.of(cei.o, cej.b, cei.m, cej.b), $$0);
   }

   protected boolean a(arq $$0, E $$1, long $$2) {
      return $$1.dU() == null;
   }

   protected boolean a(arq $$0, E $$1) {
      return $$1.aL() || $$1.bl() || $$1.bz();
   }

   protected void b(arq $$0, E $$1, long $$2) {
      if ($$1.aL()) {
         $$1.b(bvq.o);
         $$1.a(awo.BP, 5.0F, 1.0F);
      } else {
         $$1.a(awo.BK, 5.0F, 1.0F);
         this.c($$0, $$1, $$2);
      }
   }

   protected void c(arq $$0, E $$1, long $$2) {
      if ($$1.dU() == null) {
         $$1.a(bui.c.b);
      }
   }
}
