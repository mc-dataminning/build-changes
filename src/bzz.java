import javax.annotation.Nullable;

public class bzz extends cal {
   private static final int i = 10;
   private static final int j = 7;

   public bzz(bsz $$0, double $$1, boolean $$2) {
      super($$0, $$1, 10, $$2);
   }

   @Override
   public boolean a() {
      aqn $$0 = (aqn)this.b.dP();
      io $$1 = this.b.dp();
      return $$0.c($$1) ? false : super.a();
   }

   @Nullable
   @Override
   protected eum h() {
      aqn $$0 = (aqn)this.b.dP();
      io $$1 = this.b.dp();
      jq $$2 = jq.a($$1);
      jq $$3 = bul.a($$0, $$2, 2);
      return $$3 != $$2 ? cdl.a(this.b, 10, 7, eum.c($$3.q()), (float) (Math.PI / 2)) : null;
   }
}
