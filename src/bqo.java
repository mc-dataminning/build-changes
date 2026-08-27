import javax.annotation.Nullable;

public class bqo extends bra {
   private static final int i = 10;
   private static final int j = 7;

   public bqo(bjr $$0, double $$1, boolean $$2) {
      super($$0, $$1, 10, $$2);
   }

   @Override
   public boolean a() {
      aks $$0 = (aks)this.b.dL();
      gw $$1 = this.b.dl();
      return $$0.b($$1) ? false : super.a();
   }

   @Nullable
   @Override
   protected ehp h() {
      aks $$0 = (aks)this.b.dL();
      gw $$1 = this.b.dl();
      hz $$2 = hz.a($$1);
      hz $$3 = blb.a($$0, $$2, 2);
      return $$3 != $$2 ? bty.a(this.b, 10, 7, ehp.c($$3.q()), (float) (Math.PI / 2)) : null;
   }
}
