import javax.annotation.Nullable;

public class bsm extends bsy {
   private static final int i = 10;
   private static final int j = 7;

   public bsm(blp $$0, double $$1, boolean $$2) {
      super($$0, $$1, 10, $$2);
   }

   @Override
   public boolean a() {
      ame $$0 = (ame)this.b.dN();
      ht $$1 = this.b.dn();
      return $$0.b($$1) ? false : super.a();
   }

   @Nullable
   @Override
   protected eju h() {
      ame $$0 = (ame)this.b.dN();
      ht $$1 = this.b.dn();
      iu $$2 = iu.a($$1);
      iu $$3 = bmz.a($$0, $$2, 2);
      return $$3 != $$2 ? bvw.a(this.b, 10, 7, eju.c($$3.q()), (float) (Math.PI / 2)) : null;
   }
}
