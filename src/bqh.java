import com.google.common.collect.ImmutableMap;

public class bqh<E extends ccq> extends bmp<E> {
   public bqh(int $$0) {
      super(ImmutableMap.of(btz.o, bua.b, btz.m, bua.b), $$0);
   }

   protected boolean a(ama $$0, E $$1, long $$2) {
      return $$1.dH() == null;
   }

   protected boolean a(ama $$0, E $$1) {
      return $$1.aA() || $$1.aX() || $$1.bl();
   }

   protected void b(ama $$0, E $$1, long $$2) {
      if ($$1.aA()) {
         $$1.b(blk.o);
         $$1.a(aqn.zE, 5.0F, 1.0F);
      } else {
         $$1.a(aqn.zz, 5.0F, 1.0F);
         this.c($$0, $$1, $$2);
      }
   }

   protected void c(ama $$0, E $$1, long $$2) {
      if ($$1.dH() == null) {
         $$1.a(bki.c.b);
      }
   }
}
