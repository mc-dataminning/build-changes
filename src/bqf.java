import javax.annotation.Nullable;

public class bqf extends bqr {
   private static final int i = 10;
   private static final int j = 7;

   public bqf(bjh $$0, double $$1, boolean $$2) {
      super($$0, $$1, 10, $$2);
   }

   @Override
   public boolean a() {
      akk $$0 = (akk)this.b.dK();
      gu $$1 = this.b.dk();
      return $$0.b($$1) ? false : super.a();
   }

   @Nullable
   @Override
   protected ehe h() {
      akk $$0 = (akk)this.b.dK();
      gu $$1 = this.b.dk();
      hx $$2 = hx.a($$1);
      hx $$3 = bks.a($$0, $$2, 2);
      return $$3 != $$2 ? btp.a(this.b, 10, 7, ehe.c($$3.q()), (float) (Math.PI / 2)) : null;
   }
}
