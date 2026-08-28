import java.util.function.Function;

public abstract class fty<E extends bsq> extends fvn<E> {
   private final float a;
   private final float b;

   public fty(float $$0, float $$1) {
      this($$0, $$1, gfb::e);
   }

   public fty(float $$0, float $$1, Function<akq, gfb> $$2) {
      super($$2);
      this.b = $$1;
      this.a = $$0;
   }

   @Override
   public void a(fbc $$0, fbg $$1, int $$2, int $$3, int $$4) {
      if (this.e) {
         $$0.a();
         $$0.b(this.a, this.a, this.a);
         $$0.a(0.0F, this.b / 16.0F, 0.0F);
         this.a().a($$0, $$1, $$2, $$3, $$4);
         $$0.b();
      } else {
         this.a().a($$0, $$1, $$2, $$3, $$4);
      }
   }
}
