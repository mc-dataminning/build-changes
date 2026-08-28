import java.util.Optional;
import java.util.function.Function;
import javax.annotation.Nullable;

public class crh extends crf {
   private static final dha f = new dia(true, false, Optional.of(1.22F), ma.e.a(axu.cB).map(Function.identity()));
   private static final float g = 1.2F;
   private static final float h = bae.l(3.5F);
   private int i = 5;

   public crh(bvq<? extends crf> $$0, dhh $$1) {
      super($$0, $$1);
   }

   public crh(cpw $$0, dhh $$1, double $$2, double $$3, double $$4) {
      super(bvq.bH, $$1, $$0, $$2, $$3, $$4);
   }

   public crh(dhh $$0, double $$1, double $$2, double $$3, fbx $$4) {
      super(bvq.bH, $$1, $$2, $$3, $$4, $$0);
   }

   @Override
   public void h() {
      super.h();
      if (this.i > 0) {
         this.i--;
      }
   }

   @Override
   public boolean a(cqq $$0, @Nullable bvj $$1, @Nullable bvj $$2, boolean $$3) {
      return this.i > 0 ? false : super.a($$0, $$1, $$2, $$3);
   }

   @Override
   protected void a(fbx $$0) {
      this.dW().a(this, null, f, $$0.a(), $$0.b(), $$0.c(), 1.2F, false, dhh.a.e, ls.A, ls.z, axf.CP);
   }

   @Override
   public boolean a(double $$0) {
      return this.af < 2 && $$0 < (double)h ? false : super.a($$0);
   }
}
