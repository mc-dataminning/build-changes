import java.util.Optional;
import java.util.function.Function;
import javax.annotation.Nullable;

public class cpj extends cph {
   private static final dec g = new dfb(true, false, Optional.of(1.22F), lv.e.a(awv.cz).map(Function.identity()));
   private static final float h = 1.2F;
   private static final float i = azf.l(3.5F);
   private int j = 5;

   public cpj(bty<? extends cph> $$0, dej $$1) {
      super($$0, $$1);
   }

   public cpj(cnx $$0, dej $$1, double $$2, double $$3, double $$4) {
      super(bty.bn, $$1, $$0, $$2, $$3, $$4);
   }

   public cpj(dej $$0, double $$1, double $$2, double $$3, eyw $$4) {
      super(bty.bn, $$1, $$2, $$3, $$4, $$0);
   }

   @Override
   public void l() {
      super.l();
      if (this.j > 0) {
         this.j--;
      }
   }

   @Override
   public boolean a(cos $$0, @Nullable btr $$1, @Nullable btr $$2, boolean $$3) {
      return this.j > 0 ? false : super.a($$0, $$1, $$2, $$3);
   }

   @Override
   protected void a(eyw $$0) {
      this.dS().a(this, null, g, $$0.a(), $$0.b(), $$0.c(), 1.2F, false, dej.a.e, lo.A, lo.z, awg.Cw);
   }

   @Override
   public boolean a(double $$0) {
      return this.ag < 2 && $$0 < (double)i ? false : super.a($$0);
   }
}
