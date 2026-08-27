import com.google.common.collect.ImmutableMap;

public class bpd extends boc<bmn> {
   public static final int c = 100;
   private final bjm d;
   private final arr e;

   public bpd(bjm $$0, arr $$1) {
      super(ImmutableMap.of(bvn.n, bvo.c, bvn.S, bvo.a), 100);
      this.d = $$0;
      this.e = $$1;
   }

   protected boolean a(and $$0, bmn $$1, long $$2) {
      return !$$1.aC();
   }

   protected void b(and $$0, bmn $$1, long $$2) {
      $$1.p(true);
      $$1.b(bmx.g);
   }

   protected void c(and $$0, bmn $$1, long $$2) {
      if ($$1.aC()) {
         $$1.g($$1.dp().d(0.1F, 1.0, 0.1F));
         $$0.a(null, $$1, this.e, art.g, 2.0F, 1.0F);
      }

      $$1.p(false);
      $$1.b(bmx.a);
      $$1.dO().b(bvn.S);
      $$1.dO().a(bvn.R, this.d.a($$0.z));
   }
}
