import com.google.common.collect.ImmutableMap;

public class bpc extends bob<bmm> {
   public static final int c = 100;
   private final bjl d;
   private final arq e;

   public bpc(bjl $$0, arq $$1) {
      super(ImmutableMap.of(bvm.n, bvn.c, bvm.S, bvn.a), 100);
      this.d = $$0;
      this.e = $$1;
   }

   protected boolean a(and $$0, bmm $$1, long $$2) {
      return !$$1.aC();
   }

   protected void b(and $$0, bmm $$1, long $$2) {
      $$1.p(true);
      $$1.b(bmw.g);
   }

   protected void c(and $$0, bmm $$1, long $$2) {
      if ($$1.aC()) {
         $$1.g($$1.dp().d(0.1F, 1.0, 0.1F));
         $$0.a(null, $$1, this.e, ars.g, 2.0F, 1.0F);
      }

      $$1.p(false);
      $$1.b(bmw.a);
      $$1.dO().b(bvm.S);
      $$1.dO().a(bvm.R, this.d.a($$0.z));
   }
}
