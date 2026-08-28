import javax.annotation.Nullable;

public class ccn extends ccz {
   private static final int i = 10;
   private static final int j = 7;

   public ccn(bvm $$0, double $$1, boolean $$2) {
      super($$0, $$1, 10, $$2);
   }

   @Override
   public boolean b() {
      arq $$0 = (arq)this.b.dY();
      jh $$1 = this.b.dy();
      return $$0.c($$1) ? false : super.b();
   }

   @Nullable
   @Override
   protected ezr h() {
      arq $$0 = (arq)this.b.dY();
      jh $$1 = this.b.dy();
      kj $$2 = kj.a($$1);
      kj $$3 = bwz.a($$0, $$2, 2);
      return $$3 != $$2 ? cfz.a(this.b, 10, 7, ezr.c($$3.k()), (float) (Math.PI / 2)) : null;
   }
}
