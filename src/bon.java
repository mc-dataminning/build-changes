import com.google.common.collect.ImmutableMap;

public class bon extends bmx<bli> {
   private final bic c;
   private final float d;
   private final float e;
   private final float f;

   public bon(bic $$0, float $$1, float $$2, float $$3) {
      super(ImmutableMap.of(buh.n, bui.b, buh.P, bui.b));
      if ($$2 > $$3) {
         throw new IllegalArgumentException("Minimum pitch is larger than maximum pitch! " + $$2 + " > " + $$3);
      } else {
         this.c = $$0;
         this.d = $$1;
         this.e = $$2;
         this.f = $$3 - $$2;
      }
   }

   protected void a(ame $$0, bli $$1, long $$2) {
      ats $$3 = $$1.eh();
      float $$4 = atm.a($$3.i() * this.f + this.e, -90.0F, 90.0F);
      float $$5 = atm.g($$1.dD() + 2.0F * $$3.i() * this.d - this.d);
      eju $$6 = eju.a($$4, $$5);
      $$1.dP().a(buh.n, new bna($$1.br().e($$6)));
      $$1.dP().a(buh.P, this.c.a($$3));
   }
}
