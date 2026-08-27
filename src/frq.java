import java.util.function.Function;

public abstract class frq<E extends bru> extends ftf<E> {
   private final float a;
   private final float b;

   public frq(float $$0, float $$1) {
      this($$0, $$1, gcs::e);
   }

   public frq(float $$0, float $$1, Function<akm, gcs> $$2) {
      super($$2);
      this.b = $$1;
      this.a = $$0;
   }

   @Override
   public void a(eys $$0, eyw $$1, int $$2, int $$3, float $$4, float $$5, float $$6, float $$7) {
      if (this.e) {
         $$0.a();
         $$0.b(this.a, this.a, this.a);
         $$0.a(0.0F, this.b / 16.0F, 0.0F);
         this.a().a($$0, $$1, $$2, $$3, $$4, $$5, $$6, $$7);
         $$0.b();
      } else {
         this.a().a($$0, $$1, $$2, $$3, $$4, $$5, $$6, $$7);
      }
   }
}
