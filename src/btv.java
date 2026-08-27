import javax.annotation.Nullable;

public class btv extends buh {
   private static final int i = 10;
   private static final int j = 7;

   public btv(bmx $$0, double $$1, boolean $$2) {
      super($$0, $$1, 10, $$2);
   }

   @Override
   public boolean a() {
      ane $$0 = (ane)this.b.dL();
      hx $$1 = this.b.dl();
      return $$0.c($$1) ? false : super.a();
   }

   @Nullable
   @Override
   protected emc h() {
      ane $$0 = (ane)this.b.dL();
      hx $$1 = this.b.dl();
      iz $$2 = iz.a($$1);
      iz $$3 = boh.a($$0, $$2, 2);
      return $$3 != $$2 ? bxh.a(this.b, 10, 7, emc.c($$3.q()), (float) (Math.PI / 2)) : null;
   }
}
