import java.util.Optional;
import java.util.function.Function;
import javax.annotation.Nullable;

public class ctw extends ctu {
   private static final dkd f = new dlc(true, false, Optional.of(1.22F), mh.e.a(axn.cF).map(Function.identity()));
   private static final float g = 1.2F;
   private static final float h = azz.l(3.5F);
   private int i = 5;

   public ctw(bxn<? extends ctu> $$0, dkj $$1) {
      super($$0, $$1);
   }

   public ctw(csi $$0, dkj $$1, double $$2, double $$3, double $$4) {
      super(bxn.bI, $$1, $$0, $$2, $$3, $$4);
   }

   public ctw(dkj $$0, double $$1, double $$2, double $$3, fgc $$4) {
      super(bxn.bI, $$1, $$2, $$3, $$4, $$0);
   }

   @Override
   public void g() {
      super.g();
      if (this.i > 0) {
         this.i--;
      }
   }

   @Override
   public boolean a(cte $$0, @Nullable bxe $$1, @Nullable bxe $$2, boolean $$3) {
      return this.i > 0 ? false : super.a($$0, $$1, $$2, $$3);
   }

   @Override
   protected void a(fgc $$0) {
      this.dV().a(this, null, f, $$0.a(), $$0.b(), $$0.c(), 1.2F, false, dkj.a.e, lz.A, lz.z, awy.Du);
   }

   @Override
   public boolean a(double $$0) {
      return this.af < 2 && $$0 < (double)h ? false : super.a($$0);
   }
}
