import java.util.Optional;
import java.util.function.Function;
import javax.annotation.Nullable;

public class cpy extends cpw {
   private static final deu g = new dft(true, false, Optional.of(1.22F), ly.e.a(axa.cA).map(Function.identity()));
   private static final float h = 1.2F;
   private static final float i = azk.l(3.5F);
   private int j = 5;

   public cpy(bul<? extends cpw> $$0, dfb $$1) {
      super($$0, $$1);
   }

   public cpy(com $$0, dfb $$1, double $$2, double $$3, double $$4) {
      super(bul.bn, $$1, $$0, $$2, $$3, $$4);
   }

   public cpy(dfb $$0, double $$1, double $$2, double $$3, ezn $$4) {
      super(bul.bn, $$1, $$2, $$3, $$4, $$0);
   }

   @Override
   public void l() {
      super.l();
      if (this.j > 0) {
         this.j--;
      }
   }

   @Override
   public boolean a(cph $$0, @Nullable bue $$1, @Nullable bue $$2, boolean $$3) {
      return this.j > 0 ? false : super.a($$0, $$1, $$2, $$3);
   }

   @Override
   protected void a(ezn $$0) {
      this.dX().a(this, null, g, $$0.a(), $$0.b(), $$0.c(), 1.2F, false, dfb.a.e, lr.A, lr.z, awl.Cu);
   }

   @Override
   public boolean a(double $$0) {
      return this.ag < 2 && $$0 < (double)i ? false : super.a($$0);
   }
}
