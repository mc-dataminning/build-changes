import javax.annotation.Nullable;

public class bzi extends bzu {
   private static final int i = 10;
   private static final int j = 7;

   public bzi(bsi $$0, double $$1, boolean $$2) {
      super($$0, $$1, 10, $$2);
   }

   @Override
   public boolean a() {
      aqh $$0 = (aqh)this.b.dN();
      in $$1 = this.b.dn();
      return $$0.c($$1) ? false : super.a();
   }

   @Nullable
   @Override
   protected etp h() {
      aqh $$0 = (aqh)this.b.dN();
      in $$1 = this.b.dn();
      jp $$2 = jp.a($$1);
      jp $$3 = btu.a($$0, $$2, 2);
      return $$3 != $$2 ? ccu.a(this.b, 10, 7, etp.c($$3.q()), (float) (Math.PI / 2)) : null;
   }
}
