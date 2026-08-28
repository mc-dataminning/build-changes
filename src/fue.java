import java.util.function.Function;

public abstract class fue<E extends bsr> extends fvt<E> {
   private final float a;
   private final float b;

   public fue(float $$0, float $$1) {
      this($$0, $$1, gfh::e);
   }

   public fue(float $$0, float $$1, Function<akr, gfh> $$2) {
      super($$2);
      this.b = $$1;
      this.a = $$0;
   }

   @Override
   public void a(fbi $$0, fbm $$1, int $$2, int $$3, int $$4) {
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
