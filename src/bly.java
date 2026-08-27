import com.google.common.collect.ImmutableMap;

public class bly extends bkx<bji> {
   public static final int c = 100;
   private final bgj d;
   private final apd e;

   public bly(bgj $$0, apd $$1) {
      super(ImmutableMap.of(bsh.n, bsi.c, bsh.S, bsi.a), 100);
      this.d = $$0;
      this.e = $$1;
   }

   protected boolean a(akr $$0, bji $$1, long $$2) {
      return !$$1.aB();
   }

   protected void b(akr $$0, bji $$1, long $$2) {
      $$1.p(true);
      $$1.b(bjs.g);
   }

   protected void c(akr $$0, bji $$1, long $$2) {
      if ($$1.aB()) {
         $$1.f($$1.do().d(0.1F, 1.0, 0.1F));
         $$0.a(null, $$1, this.e, apf.g, 2.0F, 1.0F);
      }

      $$1.p(false);
      $$1.b(bjs.a);
      $$1.dN().b(bsh.S);
      $$1.dN().a(bsh.R, this.d.a($$0.z));
   }
}
