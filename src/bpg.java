import com.google.common.collect.ImmutableMap;

public class bpg extends bof<bmq> {
   public static final int c = 100;
   private final bjn d;
   private final ars e;

   public bpg(bjn $$0, ars $$1) {
      super(ImmutableMap.of(bvq.n, bvr.c, bvq.T, bvr.a), 100);
      this.d = $$0;
      this.e = $$1;
   }

   protected boolean a(ane $$0, bmq $$1, long $$2) {
      return !$$1.aC();
   }

   protected void b(ane $$0, bmq $$1, long $$2) {
      $$1.p(true);
      $$1.b(bna.g);
   }

   protected void c(ane $$0, bmq $$1, long $$2) {
      if ($$1.aC()) {
         $$1.g($$1.do().d(0.1F, 1.0, 0.1F));
         $$0.a(null, $$1, this.e, aru.g, 2.0F, 1.0F);
      }

      $$1.p(false);
      $$1.b(bna.a);
      $$1.dN().b(bvq.T);
      $$1.dN().a(bvq.S, this.d.a($$0.z));
   }
}
