import com.google.common.collect.ImmutableMap;

public class cak extends bwo<cnk> {
   private static final int c = 25;
   private static final int d = 20;

   public cak() {
      super(ImmutableMap.of(cdz.ay, cea.a, cdz.o, cea.b, cdz.aF, cea.c, cdz.aD, cea.c), cnl.b);
   }

   protected void a(arm $$0, cnk $$1, long $$2) {
      bvx<cnk> $$3 = $$1.ed();
      $$3.a(cdz.aD, bao.a, 25L);
      $$3.b(cdz.m);
      buv $$4 = $$1.ed().c(cdz.ay).get();
      bwq.a($$1, $$4);
      $$1.b(bvh.l);
      $$1.a($$4, 20, false);
   }

   protected boolean b(arm $$0, cnk $$1, long $$2) {
      return true;
   }

   protected void c(arm $$0, cnk $$1, long $$2) {
      if (!$$1.ed().a(cdz.aD) && !$$1.ed().a(cdz.aF)) {
         $$1.ed().a(cdz.aF, bao.a, (long)(cnl.b - 25));
         $$1.a(awk.BY, 3.0F, 1.0F);
      }
   }

   protected void d(arm $$0, cnk $$1, long $$2) {
      if ($$1.c(bvh.l)) {
         $$1.b(bvh.a);
      }

      $$1.ed().c(cdz.ay).ifPresent($$1::j);
      $$1.ed().b(cdz.ay);
   }
}
