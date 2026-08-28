import java.util.Optional;
import java.util.function.Function;
import javax.annotation.Nullable;

public class cqc extends cqa {
   private static final dey g = new dfy(true, false, Optional.of(1.22F), lz.e.a(axd.cA).map(Function.identity()));
   private static final float h = 1.2F;
   private static final float i = azn.l(3.5F);
   private int j = 5;

   public cqc(bup<? extends cqa> $$0, dff $$1) {
      super($$0, $$1);
   }

   public cqc(cor $$0, dff $$1, double $$2, double $$3, double $$4) {
      super(bup.bn, $$1, $$0, $$2, $$3, $$4);
   }

   public cqc(dff $$0, double $$1, double $$2, double $$3, ezr $$4) {
      super(bup.bn, $$1, $$2, $$3, $$4, $$0);
   }

   @Override
   public void l() {
      super.l();
      if (this.j > 0) {
         this.j--;
      }
   }

   @Override
   public boolean a(cpl $$0, @Nullable bui $$1, @Nullable bui $$2, boolean $$3) {
      return this.j > 0 ? false : super.a($$0, $$1, $$2, $$3);
   }

   @Override
   protected void a(ezr $$0) {
      this.dY().a(this, null, g, $$0.a(), $$0.b(), $$0.c(), 1.2F, false, dff.a.e, ls.A, ls.z, awo.Cu);
   }

   @Override
   public boolean a(double $$0) {
      return this.ag < 2 && $$0 < (double)i ? false : super.a($$0);
   }
}
