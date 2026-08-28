import java.util.Optional;
import java.util.function.Function;
import javax.annotation.Nullable;

public class cof extends cod {
   private static final dcn f = new ddl(true, false, Optional.of(1.1F), lt.e.b(awd.cy).map(Function.identity()));
   private static final float g = 1.2F;
   private int h = 5;

   public cof(bsw<? extends cod> $$0, dcu $$1) {
      super($$0, $$1);
   }

   public cof(cmv $$0, dcu $$1, double $$2, double $$3, double $$4) {
      super(bsw.bn, $$1, $$0, $$2, $$3, $$4);
   }

   public cof(dcu $$0, double $$1, double $$2, double $$3, eww $$4) {
      super(bsw.bn, $$1, $$2, $$3, $$4, $$0);
   }

   @Override
   public void l() {
      super.l();
      if (this.h > 0) {
         this.h--;
      }
   }

   @Override
   public boolean a(cno $$0, @Nullable bsq $$1, @Nullable bsq $$2, boolean $$3) {
      return this.h > 0 ? false : super.a($$0, $$1, $$2, $$3);
   }

   @Override
   protected void y() {
      this.dQ().a(this, null, f, this.dv(), this.dx(), this.dB(), 1.2F, false, dcu.a.e, lm.A, lm.z, avo.Cq);
   }
}
