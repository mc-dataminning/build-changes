import javax.annotation.Nullable;

public class btm extends bty {
   private static final int i = 10;
   private static final int j = 7;

   public btm(bmo $$0, double $$1, boolean $$2) {
      super($$0, $$1, 10, $$2);
   }

   @Override
   public boolean a() {
      amz $$0 = (amz)this.b.dM();
      hx $$1 = this.b.dm();
      return $$0.c($$1) ? false : super.a();
   }

   @Nullable
   @Override
   protected elm h() {
      amz $$0 = (amz)this.b.dM();
      hx $$1 = this.b.dm();
      iz $$2 = iz.a($$1);
      iz $$3 = bny.a($$0, $$2, 2);
      return $$3 != $$2 ? bwx.a(this.b, 10, 7, elm.c($$3.q()), (float) (Math.PI / 2)) : null;
   }
}
