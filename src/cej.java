import javax.annotation.Nullable;

public class cej extends cev {
   private static final int i = 10;
   private static final int j = 7;

   public cej(bxk $$0, double $$1, boolean $$2) {
      super($$0, $$1, 10, $$2);
   }

   @Override
   public boolean b() {
      arq $$0 = (arq)this.b.dV();
      iu $$1 = this.b.dv();
      return $$0.c($$1) ? false : super.b();
   }

   @Nullable
   @Override
   protected fei h() {
      arq $$0 = (arq)this.b.dV();
      iu $$1 = this.b.dv();
      jx $$2 = jx.a($$1);
      jx $$3 = byv.a($$0, $$2, 2);
      return $$3 != $$2 ? chv.a(this.b, 10, 7, fei.c($$3.k()), (float) (Math.PI / 2)) : null;
   }
}
