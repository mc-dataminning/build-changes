import java.util.Optional;
import javax.annotation.Nullable;

public class ctf extends cti {
   private final int b;
   private final int c;
   private final int d;
   private final Optional<auo<bnu<?>>> e;

   public ctf(cti.a $$0, int $$1, int $$2, int $$3, Optional<auo<bnu<?>>> $$4, bnv... $$5) {
      super($$0, auh.bg, $$5);
      this.b = $$1;
      this.c = $$2;
      this.d = $$3;
      this.e = $$4;
   }

   @Override
   public int a(int $$0) {
      return this.b + ($$0 - 1) * this.c;
   }

   @Override
   public int b(int $$0) {
      return this.a($$0) + this.d;
   }

   @Override
   public int a() {
      return 5;
   }

   @Override
   public float a(int $$0, @Nullable bnu<?> $$1) {
      if (this.e.isEmpty()) {
         return 1.0F + (float)Math.max(0, $$0 - 1) * 0.5F;
      } else {
         return $$1 != null && $$1.a(this.e.get()) ? (float)$$0 * 2.5F : 0.0F;
      }
   }

   @Override
   public boolean a(cti $$0) {
      return !($$0 instanceof ctf);
   }

   @Override
   public void a(bog $$0, bno $$1, int $$2) {
      if (this.e.isPresent() && $$1 instanceof bog $$3 && this.e.get() == auc.v && $$2 > 0 && $$3.ai().a(this.e.get())) {
         int $$4 = 20 + $$0.eh().a(10 * $$2);
         $$3.b(new bnb(bnd.b, $$4, 3));
      }
   }
}
