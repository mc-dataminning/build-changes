import com.google.common.collect.ImmutableMap;

public class bzt extends bvx<cmt> {
   private static final int c = 25;
   private static final int d = 20;

   public bzt() {
      super(ImmutableMap.of(cdi.ay, cdj.a, cdi.o, cdj.b, cdi.aF, cdj.c, cdi.aD, cdj.c), cmu.b);
   }

   protected void a(arg $$0, cmt $$1, long $$2) {
      bvg<cmt> $$3 = $$1.dX();
      $$3.a(cdi.aD, bah.a, 25L);
      $$3.b(cdi.m);
      buf $$4 = $$1.dX().c(cdi.ay).get();
      bvz.a($$1, $$4);
      $$1.b(bur.l);
      $$1.a($$4, 20, false);
   }

   protected boolean b(arg $$0, cmt $$1, long $$2) {
      return true;
   }

   protected void c(arg $$0, cmt $$1, long $$2) {
      if (!$$1.dX().a(cdi.aD) && !$$1.dX().a(cdi.aF)) {
         $$1.dX().a(cdi.aF, bah.a, (long)(cmu.b - 25));
         $$1.a(awd.Ca, 3.0F, 1.0F);
      }
   }

   protected void d(arg $$0, cmt $$1, long $$2) {
      if ($$1.c(bur.l)) {
         $$1.b(bur.a);
      }

      $$1.dX().c(cdi.ay).ifPresent($$1::j);
      $$1.dX().b(cdi.ay);
   }
}
