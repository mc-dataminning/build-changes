import com.google.common.collect.ImmutableMap;

public class byr extends bxq<bvz> {
   public static final int c = 100;
   private final bsl d;
   private final awu e;

   public byr(bsl $$0, awu $$1) {
      super(ImmutableMap.of(cfb.n, cfc.c, cfb.T, cfc.a), 100);
      this.d = $$0;
      this.e = $$1;
   }

   protected boolean a(arx $$0, bvz $$1, long $$2) {
      return !$$1.aJ();
   }

   protected void b(arx $$0, bvz $$1, long $$2) {
      $$1.r(true);
      $$1.b(bwj.g);
   }

   protected void c(arx $$0, bvz $$1, long $$2) {
      if ($$1.aJ()) {
         $$1.h($$1.dz().d(0.1F, 1.0, 0.1F));
         $$0.a(null, $$1, this.e, aww.g, 2.0F, 1.0F);
      }

      $$1.r(false);
      $$1.b(bwj.a);
      $$1.ec().b(cfb.T);
      $$1.ec().a(cfb.S, this.d.a($$0.A));
   }
}
