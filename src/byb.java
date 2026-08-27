import javax.annotation.Nullable;

public class byb extends byn {
   private static final int i = 10;
   private static final int j = 7;

   public byb(brb $$0, double $$1, boolean $$2) {
      super($$0, $$1, 10, $$2);
   }

   @Override
   public boolean a() {
      apu $$0 = (apu)this.b.dM();
      id $$1 = this.b.dm();
      return $$0.c($$1) ? false : super.a();
   }

   @Nullable
   @Override
   protected esj h() {
      apu $$0 = (apu)this.b.dM();
      id $$1 = this.b.dm();
      jg $$2 = jg.a($$1);
      jg $$3 = bsn.a($$0, $$2, 2);
      return $$3 != $$2 ? cbn.a(this.b, 10, 7, esj.c($$3.q()), (float) (Math.PI / 2)) : null;
   }
}
