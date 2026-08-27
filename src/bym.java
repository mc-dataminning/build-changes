import javax.annotation.Nullable;

public class bym extends byy {
   private static final int i = 10;
   private static final int j = 7;

   public bym(brm $$0, double $$1, boolean $$2) {
      super($$0, $$1, 10, $$2);
   }

   @Override
   public boolean a() {
      aqe $$0 = (aqe)this.b.dN();
      im $$1 = this.b.dn();
      return $$0.c($$1) ? false : super.a();
   }

   @Nullable
   @Override
   protected etf h() {
      aqe $$0 = (aqe)this.b.dN();
      im $$1 = this.b.dn();
      jo $$2 = jo.a($$1);
      jo $$3 = bsy.a($$0, $$2, 2);
      return $$3 != $$2 ? cby.a(this.b, 10, 7, etf.c($$3.q()), (float) (Math.PI / 2)) : null;
   }
}
