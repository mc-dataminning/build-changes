import java.util.Optional;
import javax.annotation.Nullable;

public class cyw extends cyz {
   private final Optional<awl<bsa<?>>> b;

   public cyw(cyz.b $$0, Optional<awl<bsa<?>>> $$1) {
      super($$0);
      this.b = $$1;
   }

   @Override
   public float a(int $$0, @Nullable bsa<?> $$1) {
      if (this.b.isEmpty()) {
         return 1.0F + (float)Math.max(0, $$0 - 1) * 0.5F;
      } else {
         return $$1 != null && $$1.a(this.b.get()) ? (float)$$0 * 2.5F : 0.0F;
      }
   }

   @Override
   public boolean a(cyz $$0) {
      return !($$0 instanceof cyw);
   }

   @Override
   public void a(bso $$0, bru $$1, int $$2) {
      if (this.b.isPresent() && $$1 instanceof bso $$3 && this.b.get() == avz.C && $$2 > 0 && $$3.ak().a(this.b.get())) {
         int $$4 = 20 + $$0.el().a(10 * $$2);
         $$3.b(new brc(bre.b, $$4, 3));
      }
   }
}
