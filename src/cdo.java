import javax.annotation.Nullable;

public class cdo extends cea {
   private static final int i = 10;
   private static final int j = 7;

   public cdo(bwn $$0, double $$1, boolean $$2) {
      super($$0, $$1, 10, $$2);
   }

   @Override
   public boolean b() {
      ash $$0 = (ash)this.b.dV();
      jh $$1 = this.b.dv();
      return $$0.c($$1) ? false : super.b();
   }

   @Nullable
   @Override
   protected fbx h() {
      ash $$0 = (ash)this.b.dV();
      jh $$1 = this.b.dv();
      kj $$2 = kj.a($$1);
      kj $$3 = bya.a($$0, $$2, 2);
      return $$3 != $$2 ? cha.a(this.b, 10, 7, fbx.c($$3.k()), (float) (Math.PI / 2)) : null;
   }
}
