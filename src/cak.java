import javax.annotation.Nullable;

public class cak extends caw {
   private static final int i = 10;
   private static final int j = 7;

   public cak(btk $$0, double $$1, boolean $$2) {
      super($$0, $$1, 10, $$2);
   }

   @Override
   public boolean a() {
      aqm $$0 = (aqm)this.b.dQ();
      ja $$1 = this.b.dq();
      return $$0.c($$1) ? false : super.a();
   }

   @Nullable
   @Override
   protected ewf h() {
      aqm $$0 = (aqm)this.b.dQ();
      ja $$1 = this.b.dq();
      kc $$2 = kc.a($$1);
      kc $$3 = buw.a($$0, $$2, 2);
      return $$3 != $$2 ? cdw.a(this.b, 10, 7, ewf.c($$3.q()), (float) (Math.PI / 2)) : null;
   }
}
