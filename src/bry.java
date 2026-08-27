import com.google.common.collect.ImmutableMap;

public class bry<E extends ceu> extends bof<E> {
   public bry(int $$0) {
      super(ImmutableMap.of(bvq.o, bvr.b, bvq.m, bvr.b), $$0);
   }

   protected boolean a(ane $$0, E $$1, long $$2) {
      return $$1.dH() == null;
   }

   protected boolean a(ane $$0, E $$1) {
      return $$1.aC() || $$1.aZ() || $$1.bn();
   }

   protected void b(ane $$0, E $$1, long $$2) {
      if ($$1.aC()) {
         $$1.b(bna.o);
         $$1.a(art.AP, 5.0F, 1.0F);
      } else {
         $$1.a(art.AK, 5.0F, 1.0F);
         this.c($$0, $$1, $$2);
      }
   }

   protected void c(ane $$0, E $$1, long $$2) {
      if ($$1.dH() == null) {
         $$1.a(blw.c.b);
      }
   }
}
