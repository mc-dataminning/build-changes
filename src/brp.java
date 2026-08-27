import javax.annotation.Nullable;

public class brp extends bsb {
   private static final int i = 10;
   private static final int j = 7;

   public brp(bks $$0, double $$1, boolean $$2) {
      super($$0, $$1, 10, $$2);
   }

   @Override
   public boolean a() {
      alq $$0 = (alq)this.b.dL();
      ht $$1 = this.b.dl();
      return $$0.b($$1) ? false : super.a();
   }

   @Nullable
   @Override
   protected eif h() {
      alq $$0 = (alq)this.b.dL();
      ht $$1 = this.b.dl();
      iu $$2 = iu.a($$1);
      iu $$3 = bmc.a($$0, $$2, 2);
      return $$3 != $$2 ? buz.a(this.b, 10, 7, eif.c($$3.q()), (float) (Math.PI / 2)) : null;
   }
}
