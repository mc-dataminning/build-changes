import javax.annotation.Nullable;

public class cbs extends cce {
   private static final int i = 10;
   private static final int j = 7;

   public cbs(bus $$0, double $$1, boolean $$2) {
      super($$0, $$1, 10, $$2);
   }

   @Override
   public boolean b() {
      arh $$0 = (arh)this.b.dS();
      je $$1 = this.b.ds();
      return $$0.c($$1) ? false : super.b();
   }

   @Nullable
   @Override
   protected eys h() {
      arh $$0 = (arh)this.b.dS();
      je $$1 = this.b.ds();
      kg $$2 = kg.a($$1);
      kg $$3 = bwe.a($$0, $$2, 2);
      return $$3 != $$2 ? cfe.a(this.b, 10, 7, eys.c($$3.k()), (float) (Math.PI / 2)) : null;
   }
}
