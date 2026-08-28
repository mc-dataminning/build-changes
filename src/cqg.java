import java.util.Optional;
import java.util.function.Function;
import javax.annotation.Nullable;

public class cqg extends cqe {
   private static final dfz f = new dgz(true, false, Optional.of(1.22F), mb.e.a(awo.cB).map(Function.identity()));
   private static final float g = 1.2F;
   private static final float h = ayy.l(3.5F);
   private int i = 5;

   public cqg(buq<? extends cqe> $$0, dgg $$1) {
      super($$0, $$1);
   }

   public cqg(cov $$0, dgg $$1, double $$2, double $$3, double $$4) {
      super(buq.bG, $$1, $$0, $$2, $$3, $$4);
   }

   public cqg(dgg $$0, double $$1, double $$2, double $$3, fay $$4) {
      super(buq.bG, $$1, $$2, $$3, $$4, $$0);
   }

   @Override
   public void h() {
      super.h();
      if (this.i > 0) {
         this.i--;
      }
   }

   @Override
   public boolean a(cpp $$0, @Nullable buj $$1, @Nullable buj $$2, boolean $$3) {
      return this.i > 0 ? false : super.a($$0, $$1, $$2, $$3);
   }

   @Override
   protected void a(fay $$0) {
      this.dW().a(this, null, f, $$0.a(), $$0.b(), $$0.c(), 1.2F, false, dgg.a.e, lt.A, lt.z, avz.De);
   }

   @Override
   public boolean a(double $$0) {
      return this.af < 2 && $$0 < (double)h ? false : super.a($$0);
   }
}
