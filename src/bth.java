import com.google.common.collect.ImmutableMap;

public class bth extends bsg<bqq> {
   public static final int c = 100;
   private final bnl d;
   private final aul e;

   public bth(bnl $$0, aul $$1) {
      super(ImmutableMap.of(bzr.n, bzs.c, bzr.T, bzs.a), 100);
      this.d = $$0;
      this.e = $$1;
   }

   protected boolean a(aps $$0, bqq $$1, long $$2) {
      return !$$1.aC();
   }

   protected void b(aps $$0, bqq $$1, long $$2) {
      $$1.p(true);
      $$1.b(bqz.g);
   }

   protected void c(aps $$0, bqq $$1, long $$2) {
      if ($$1.aC()) {
         $$1.g($$1.dp().d(0.1F, 1.0, 0.1F));
         $$0.a(null, $$1, this.e, aun.g, 2.0F, 1.0F);
      }

      $$1.p(false);
      $$1.b(bqz.a);
      $$1.dP().b(bzr.T);
      $$1.dP().a(bzr.S, this.d.a($$0.z));
   }
}
