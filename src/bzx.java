import javax.annotation.Nullable;

public class bzx extends caj {
   private static final int i = 10;
   private static final int j = 7;

   public bzx(bsx $$0, double $$1, boolean $$2) {
      super($$0, $$1, 10, $$2);
   }

   @Override
   public boolean a() {
      aqm $$0 = (aqm)this.b.dP();
      io $$1 = this.b.dp();
      return $$0.c($$1) ? false : super.a();
   }

   @Nullable
   @Override
   protected euk h() {
      aqm $$0 = (aqm)this.b.dP();
      io $$1 = this.b.dp();
      jq $$2 = jq.a($$1);
      jq $$3 = buj.a($$0, $$2, 2);
      return $$3 != $$2 ? cdj.a(this.b, 10, 7, euk.c($$3.q()), (float) (Math.PI / 2)) : null;
   }
}
