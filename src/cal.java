import javax.annotation.Nullable;

public class cal extends cax {
   private static final int i = 10;
   private static final int j = 7;

   public cal(btl $$0, double $$1, boolean $$2) {
      super($$0, $$1, 10, $$2);
   }

   @Override
   public boolean a() {
      aqm $$0 = (aqm)this.b.dR();
      ja $$1 = this.b.dr();
      return $$0.c($$1) ? false : super.a();
   }

   @Nullable
   @Override
   protected ewh h() {
      aqm $$0 = (aqm)this.b.dR();
      ja $$1 = this.b.dr();
      kc $$2 = kc.a($$1);
      kc $$3 = bux.a($$0, $$2, 2);
      return $$3 != $$2 ? cdx.a(this.b, 10, 7, ewh.c($$3.q()), (float) (Math.PI / 2)) : null;
   }
}
