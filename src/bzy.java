import com.google.common.collect.ImmutableMap;

public class bzy extends bwc<cmy> {
   private static final int c = 25;
   private static final int d = 20;

   public bzy() {
      super(ImmutableMap.of(cdn.ay, cdo.a, cdn.o, cdo.b, cdn.aF, cdo.c, cdn.aD, cdo.c), cmz.b);
   }

   protected void a(arh $$0, cmy $$1, long $$2) {
      bvl<cmy> $$3 = $$1.dX();
      $$3.a(cdn.aD, bai.a, 25L);
      $$3.b(cdn.m);
      buk $$4 = $$1.dX().c(cdn.ay).get();
      bwe.a($$1, $$4);
      $$1.b(buw.l);
      $$1.a($$4, 20, false);
   }

   protected boolean b(arh $$0, cmy $$1, long $$2) {
      return true;
   }

   protected void c(arh $$0, cmy $$1, long $$2) {
      if (!$$1.dX().a(cdn.aD) && !$$1.dX().a(cdn.aF)) {
         $$1.dX().a(cdn.aF, bai.a, (long)(cmz.b - 25));
         $$1.a(awe.Ca, 3.0F, 1.0F);
      }
   }

   protected void d(arh $$0, cmy $$1, long $$2) {
      if ($$1.c(buw.l)) {
         $$1.b(buw.a);
      }

      $$1.dX().c(cdn.ay).ifPresent($$1::j);
      $$1.dX().b(cdn.ay);
   }
}
