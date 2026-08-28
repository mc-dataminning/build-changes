import com.google.common.collect.ImmutableMap;

public class bzv<E extends cmy> extends bwc<E> {
   public bzv(int $$0) {
      super(ImmutableMap.of(cdn.o, cdo.b, cdn.m, cdo.b), $$0);
   }

   protected boolean a(arh $$0, E $$1, long $$2) {
      return $$1.dO() == null;
   }

   protected boolean a(arh $$0, E $$1) {
      return $$1.aH() || $$1.bi() || $$1.bw();
   }

   protected void b(arh $$0, E $$1, long $$2) {
      if ($$1.aH()) {
         $$1.b(buw.o);
         $$1.a(awe.BR, 5.0F, 1.0F);
      } else {
         $$1.a(awe.BM, 5.0F, 1.0F);
         this.c($$0, $$1, $$2);
      }
   }

   protected void c(arh $$0, E $$1, long $$2) {
      if ($$1.dO() == null) {
         $$1.a(bto.c.b);
      }
   }
}
