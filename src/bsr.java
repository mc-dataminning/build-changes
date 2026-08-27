import javax.annotation.Nullable;

public class bsr extends btd {
   private static final int i = 10;
   private static final int j = 7;

   public bsr(blu $$0, double $$1, boolean $$2) {
      super($$0, $$1, 10, $$2);
   }

   @Override
   public boolean a() {
      ami $$0 = (ami)this.b.dN();
      hx $$1 = this.b.dn();
      return $$0.b($$1) ? false : super.a();
   }

   @Nullable
   @Override
   protected ejz h() {
      ami $$0 = (ami)this.b.dN();
      hx $$1 = this.b.dn();
      iy $$2 = iy.a($$1);
      iy $$3 = bne.a($$0, $$2, 2);
      return $$3 != $$2 ? bwb.a(this.b, 10, 7, ejz.c($$3.q()), (float) (Math.PI / 2)) : null;
   }
}
