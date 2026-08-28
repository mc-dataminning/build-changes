import java.util.Optional;
import java.util.function.Function;
import javax.annotation.Nullable;

public class crt extends crr {
   private static final dhj f = new dii(true, false, Optional.of(1.22F), md.e.a(awz.cD).map(Function.identity()));
   private static final float g = 1.2F;
   private static final float h = azk.l(3.5F);
   private int i = 5;

   public crt(bwb<? extends crr> $$0, dhp $$1) {
      super($$0, $$1);
   }

   public crt(cqi $$0, dhp $$1, double $$2, double $$3, double $$4) {
      super(bwb.bG, $$1, $$0, $$2, $$3, $$4);
   }

   public crt(dhp $$0, double $$1, double $$2, double $$3, fcu $$4) {
      super(bwb.bG, $$1, $$2, $$3, $$4, $$0);
   }

   @Override
   public void h() {
      super.h();
      if (this.i > 0) {
         this.i--;
      }
   }

   @Override
   public boolean a(crc $$0, @Nullable bvs $$1, @Nullable bvs $$2, boolean $$3) {
      return this.i > 0 ? false : super.a($$0, $$1, $$2, $$3);
   }

   @Override
   protected void a(fcu $$0) {
      this.dV().a(this, null, f, $$0.a(), $$0.b(), $$0.c(), 1.2F, false, dhp.a.e, lv.A, lv.z, awk.Do);
   }

   @Override
   public boolean a(double $$0) {
      return this.af < 2 && $$0 < (double)h ? false : super.a($$0);
   }
}
