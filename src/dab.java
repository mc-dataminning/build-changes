import java.util.Optional;
import javax.annotation.Nullable;

public class dab extends dad {
   private final Optional<awt<bsb<?>>> b;

   public dab(dad.b $$0, Optional<awt<bsb<?>>> $$1) {
      super($$0);
      this.b = $$1;
   }

   @Override
   public float a(int $$0, @Nullable bsb<?> $$1) {
      if (this.b.isEmpty()) {
         return 1.0F + (float)Math.max(0, $$0 - 1) * 0.5F;
      } else {
         return $$1 != null && $$1.a(this.b.get()) ? (float)$$0 * 2.5F : 0.0F;
      }
   }

   @Override
   public boolean a(dad $$0) {
      return !($$0 instanceof dab);
   }

   @Override
   public void a(bso $$0, brv $$1, int $$2) {
      if (this.b.isPresent() && $$1 instanceof bso $$3 && this.b.get() == awh.C && $$2 > 0 && $$3.ak().a(this.b.get())) {
         int $$4 = 20 + $$0.et().a(10 * $$2);
         $$3.b(new brh(brj.b, $$4, 3));
      }
   }
}
