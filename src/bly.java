import com.google.common.collect.ImmutableMap;

public class bly extends bkx<bji> {
   public static final int c = 100;
   private final bgj d;
   private final apc e;

   public bly(bgj $$0, apc $$1) {
      super(ImmutableMap.of(bsh.n, bsi.c, bsh.S, bsi.a), 100);
      this.d = $$0;
      this.e = $$1;
   }

   protected boolean a(akq $$0, bji $$1, long $$2) {
      return !$$1.aA();
   }

   protected void b(akq $$0, bji $$1, long $$2) {
      $$1.p(true);
      $$1.b(bjs.g);
   }

   protected void c(akq $$0, bji $$1, long $$2) {
      if ($$1.aA()) {
         $$1.f($$1.do().d(0.1F, 1.0, 0.1F));
         $$0.a(null, $$1, this.e, ape.g, 2.0F, 1.0F);
      }

      $$1.p(false);
      $$1.b(bjs.a);
      $$1.dN().b(bsh.S);
      $$1.dN().a(bsh.R, this.d.a($$0.z));
   }
}
