import javax.annotation.Nullable;

public class bqh extends bqt {
   private static final int i = 10;
   private static final int j = 7;

   public bqh(bjk $$0, double $$1, boolean $$2) {
      super($$0, $$1, 10, $$2);
   }

   @Override
   public boolean a() {
      akn $$0 = (akn)this.b.dK();
      gw $$1 = this.b.dk();
      return $$0.b($$1) ? false : super.a();
   }

   @Nullable
   @Override
   protected ehi h() {
      akn $$0 = (akn)this.b.dK();
      gw $$1 = this.b.dk();
      hz $$2 = hz.a($$1);
      hz $$3 = bku.a($$0, $$2, 2);
      return $$3 != $$2 ? btr.a(this.b, 10, 7, ehi.c($$3.q()), (float) (Math.PI / 2)) : null;
   }
}
