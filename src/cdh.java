import javax.annotation.Nullable;

public class cdh extends cdt {
   private static final int i = 10;
   private static final int j = 7;

   public cdh(bwg $$0, double $$1, boolean $$2) {
      super($$0, $$1, 10, $$2);
   }

   @Override
   public boolean b() {
      ard $$0 = (ard)this.b.dU();
      ji $$1 = this.b.du();
      return $$0.c($$1) ? false : super.b();
   }

   @Nullable
   @Override
   protected fbx h() {
      ard $$0 = (ard)this.b.dU();
      ji $$1 = this.b.du();
      kk $$2 = kk.a($$1);
      kk $$3 = bxt.a($$0, $$2, 2);
      return $$3 != $$2 ? cgt.a(this.b, 10, 7, fbx.c($$3.k()), (float) (Math.PI / 2)) : null;
   }
}
