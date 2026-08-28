import java.util.Optional;
import java.util.function.Function;
import javax.annotation.Nullable;

public class cpg extends cpe {
   private static final ddz g = new dey(true, false, Optional.of(1.22F), lu.e.a(awt.cz).map(Function.identity()));
   private static final float h = 1.2F;
   private static final float i = azd.k(3.5F);
   private int j = 5;

   public cpg(btv<? extends cpe> $$0, deg $$1) {
      super($$0, $$1);
   }

   public cpg(cnu $$0, deg $$1, double $$2, double $$3, double $$4) {
      super(btv.bn, $$1, $$0, $$2, $$3, $$4);
   }

   public cpg(deg $$0, double $$1, double $$2, double $$3, eys $$4) {
      super(btv.bn, $$1, $$2, $$3, $$4, $$0);
   }

   @Override
   public void l() {
      super.l();
      if (this.j > 0) {
         this.j--;
      }
   }

   @Override
   public boolean a(cop $$0, @Nullable bto $$1, @Nullable bto $$2, boolean $$3) {
      return this.j > 0 ? false : super.a($$0, $$1, $$2, $$3);
   }

   @Override
   protected void a(eys $$0) {
      this.dS().a(this, null, g, $$0.a(), $$0.b(), $$0.c(), 1.2F, false, deg.a.e, ln.A, ln.z, awe.Cw);
   }

   @Override
   public boolean a(double $$0) {
      return this.ag < 2 && $$0 < (double)i ? false : super.a($$0);
   }
}
