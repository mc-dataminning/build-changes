import com.google.common.collect.ImmutableMap;

public class bny extends bmx<bli> {
   public static final int c = 100;
   private final bii d;
   private final aqq e;

   public bny(bii $$0, aqq $$1) {
      super(ImmutableMap.of(buh.n, bui.c, buh.S, bui.a), 100);
      this.d = $$0;
      this.e = $$1;
   }

   protected boolean a(ame $$0, bli $$1, long $$2) {
      return !$$1.aC();
   }

   protected void b(ame $$0, bli $$1, long $$2) {
      $$1.p(true);
      $$1.b(bls.g);
   }

   protected void c(ame $$0, bli $$1, long $$2) {
      if ($$1.aC()) {
         $$1.g($$1.dq().d(0.1F, 1.0, 0.1F));
         $$0.a(null, $$1, this.e, aqs.g, 2.0F, 1.0F);
      }

      $$1.p(false);
      $$1.b(bls.a);
      $$1.dP().b(buh.S);
      $$1.dP().a(buh.R, this.d.a($$0.z));
   }
}
