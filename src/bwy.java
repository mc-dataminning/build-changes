import com.google.common.collect.ImmutableMap;

public class bwy extends bvx<buh> {
   public static final int c = 100;
   private final bqv d;
   private final awc e;

   public bwy(bqv $$0, awc $$1) {
      super(ImmutableMap.of(cdi.n, cdj.c, cdi.T, cdj.a), 100);
      this.d = $$0;
      this.e = $$1;
   }

   protected boolean a(arg $$0, buh $$1, long $$2) {
      return !$$1.aH();
   }

   protected void b(arg $$0, buh $$1, long $$2) {
      $$1.r(true);
      $$1.b(bur.g);
   }

   protected void c(arg $$0, buh $$1, long $$2) {
      if ($$1.aH()) {
         $$1.h($$1.dv().d(0.1F, 1.0, 0.1F));
         $$0.a(null, $$1, this.e, awe.g, 2.0F, 1.0F);
      }

      $$1.r(false);
      $$1.b(bur.a);
      $$1.dX().b(cdi.T);
      $$1.dX().a(cdi.S, this.d.a($$0.z));
   }
}
