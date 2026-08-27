import com.google.common.collect.ImmutableMap;

public class bog<E extends cap> extends bko<E> {
   public bog(int $$0) {
      super(ImmutableMap.of(bry.o, brz.b, bry.m, brz.b), $$0);
   }

   protected boolean a(aki $$0, E $$1, long $$2) {
      return $$1.dG() == null;
   }

   protected boolean a(aki $$0, E $$1) {
      return $$1.aA() || $$1.aX() || $$1.bl();
   }

   protected void b(aki $$0, E $$1, long $$2) {
      if ($$1.aA()) {
         $$1.b(bji.o);
         $$1.a(aou.zv, 5.0F, 1.0F);
      } else {
         $$1.a(aou.zq, 5.0F, 1.0F);
         this.c($$0, $$1, $$2);
      }
   }

   protected void c(aki $$0, E $$1, long $$2) {
      if ($$1.dG() == null) {
         $$1.a(big.c.b);
      }
   }
}
