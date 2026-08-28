import com.google.common.collect.ImmutableMap;

public class cah<E extends cnk> extends bwo<E> {
   public cah(int $$0) {
      super(ImmutableMap.of(cdz.o, cea.b, cdz.m, cea.b), $$0);
   }

   protected boolean a(arm $$0, E $$1, long $$2) {
      return $$1.dT() == null;
   }

   protected boolean a(arm $$0, E $$1) {
      return $$1.aJ() || $$1.bk() || $$1.by();
   }

   protected void b(arm $$0, E $$1, long $$2) {
      if ($$1.aJ()) {
         $$1.b(bvh.o);
         $$1.a(awk.BP, 5.0F, 1.0F);
      } else {
         $$1.a(awk.BK, 5.0F, 1.0F);
         this.c($$0, $$1, $$2);
      }
   }

   protected void c(arm $$0, E $$1, long $$2) {
      if ($$1.dT() == null) {
         $$1.a(btz.c.b);
      }
   }
}
