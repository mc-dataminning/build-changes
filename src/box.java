import com.google.common.collect.ImmutableMap;

public class box extends bnw<bmh> {
   public static final int c = 100;
   private final bjg d;
   private final arl e;

   public box(bjg $$0, arl $$1) {
      super(ImmutableMap.of(bvh.n, bvi.c, bvh.S, bvi.a), 100);
      this.d = $$0;
      this.e = $$1;
   }

   protected boolean a(amz $$0, bmh $$1, long $$2) {
      return !$$1.aC();
   }

   protected void b(amz $$0, bmh $$1, long $$2) {
      $$1.p(true);
      $$1.b(bmr.g);
   }

   protected void c(amz $$0, bmh $$1, long $$2) {
      if ($$1.aC()) {
         $$1.g($$1.dp().d(0.1F, 1.0, 0.1F));
         $$0.a(null, $$1, this.e, arn.g, 2.0F, 1.0F);
      }

      $$1.p(false);
      $$1.b(bmr.a);
      $$1.dO().b(bvh.S);
      $$1.dO().a(bvh.R, this.d.a($$0.z));
   }
}
