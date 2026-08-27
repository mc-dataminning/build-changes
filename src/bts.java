import javax.annotation.Nullable;

public class bts extends bue {
   private static final int i = 10;
   private static final int j = 7;

   public bts(bmu $$0, double $$1, boolean $$2) {
      super($$0, $$1, 10, $$2);
   }

   @Override
   public boolean a() {
      and $$0 = (and)this.b.dM();
      hx $$1 = this.b.dm();
      return $$0.c($$1) ? false : super.a();
   }

   @Nullable
   @Override
   protected elt h() {
      and $$0 = (and)this.b.dM();
      hx $$1 = this.b.dm();
      iz $$2 = iz.a($$1);
      iz $$3 = boe.a($$0, $$2, 2);
      return $$3 != $$2 ? bxd.a(this.b, 10, 7, elt.c($$3.q()), (float) (Math.PI / 2)) : null;
   }
}
