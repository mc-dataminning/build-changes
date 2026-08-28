import com.google.common.collect.ImmutableMap;

public class bxu extends bwt<bvc> {
   public static final int c = 100;
   private final bro d;
   private final awk e;

   public bxu(bro $$0, awk $$1) {
      super(ImmutableMap.of(cee.n, cef.c, cee.T, cef.a), 100);
      this.d = $$0;
      this.e = $$1;
   }

   protected boolean a(arn $$0, bvc $$1, long $$2) {
      return !$$1.aK();
   }

   protected void b(arn $$0, bvc $$1, long $$2) {
      $$1.r(true);
      $$1.b(bvm.g);
   }

   protected void c(arn $$0, bvc $$1, long $$2) {
      if ($$1.aK()) {
         $$1.h($$1.dA().d(0.1F, 1.0, 0.1F));
         $$0.a(null, $$1, this.e, awm.g, 2.0F, 1.0F);
      }

      $$1.r(false);
      $$1.b(bvm.a);
      $$1.ed().b(cee.T);
      $$1.ed().a(cee.S, this.d.a($$0.A));
   }
}
